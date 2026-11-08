package io.github.kotlinmania.windowssys.windows.win32.devices.display

import io.github.kotlinmania.windowssys.Win32DynamicFfi
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

public fun BRUSHOBJ_hGetColorTransform(pbo: Long): HANDLE {
    return Win32DynamicFfi.invoke("gdi32.dll", "BRUSHOBJ_hGetColorTransform", longArrayOf(pbo))
}

public fun BRUSHOBJ_pvAllocRbrush(pbo: Long, cj: UInt): Long {
    return Win32DynamicFfi.invoke("gdi32.dll", "BRUSHOBJ_pvAllocRbrush", longArrayOf(pbo, cj.toLong()))
}

public fun BRUSHOBJ_pvGetRbrush(pbo: Long): Long {
    return Win32DynamicFfi.invoke("gdi32.dll", "BRUSHOBJ_pvGetRbrush", longArrayOf(pbo))
}

public fun BRUSHOBJ_ulGetBrushColor(pbo: Long): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "BRUSHOBJ_ulGetBrushColor", longArrayOf(pbo)).toUInt()
}

public fun CLIPOBJ_bEnum(pco: Long, cj: UInt, pul: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "CLIPOBJ_bEnum", longArrayOf(pco, cj.toLong(), pul)).toInt()
}

public fun CLIPOBJ_cEnumStart(pco: Long, ball: BOOL, itype: UInt, idirection: UInt, climit: UInt): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "CLIPOBJ_cEnumStart", longArrayOf(pco, ball.toLong(), itype.toLong(), idirection.toLong(), climit.toLong())).toUInt()
}

public fun CLIPOBJ_ppoGetPath(pco: Long): Long {
    return Win32DynamicFfi.invoke("gdi32.dll", "CLIPOBJ_ppoGetPath", longArrayOf(pco))
}

public fun CapabilitiesRequestAndCapabilitiesReply(hmonitor: HANDLE, pszasciicapabilitiesstring: PSTR, dwcapabilitiesstringlengthincharacters: UInt): Int {
    return Win32DynamicFfi.invoke("dxva2.dll", "CapabilitiesRequestAndCapabilitiesReply", longArrayOf(hmonitor, pszasciicapabilitiesstring, dwcapabilitiesstringlengthincharacters.toLong())).toInt()
}

public fun DegaussMonitor(hmonitor: HANDLE): Int {
    return Win32DynamicFfi.invoke("dxva2.dll", "DegaussMonitor", longArrayOf(hmonitor)).toInt()
}

public fun DestroyPhysicalMonitor(hmonitor: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("dxva2.dll", "DestroyPhysicalMonitor", longArrayOf(hmonitor)).toInt()
}

public fun DestroyPhysicalMonitors(dwphysicalmonitorarraysize: UInt, pphysicalmonitorarray: Long): BOOL {
    return Win32DynamicFfi.invoke("dxva2.dll", "DestroyPhysicalMonitors", longArrayOf(dwphysicalmonitorarraysize.toLong(), pphysicalmonitorarray)).toInt()
}

public fun DisplayConfigGetDeviceInfo(requestpacket: Long): Int {
    return Win32DynamicFfi.invoke("user32.dll", "DisplayConfigGetDeviceInfo", longArrayOf(requestpacket)).toInt()
}

public fun DisplayConfigSetDeviceInfo(setpacket: Long): Int {
    return Win32DynamicFfi.invoke("user32.dll", "DisplayConfigSetDeviceInfo", longArrayOf(setpacket)).toInt()
}

public fun EngAcquireSemaphore(hsem: HSEMAPHORE) {
    Win32DynamicFfi.invoke("gdi32.dll", "EngAcquireSemaphore", longArrayOf(hsem))
}

public fun EngAlphaBlend(psodest: Long, psosrc: Long, pco: Long, pxlo: Long, prcldest: Long, prclsrc: Long, pblendobj: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "EngAlphaBlend", longArrayOf(psodest, psosrc, pco, pxlo, prcldest, prclsrc, pblendobj)).toInt()
}

public fun EngAssociateSurface(hsurf: HSURF, hdev: HDEV, flhooks: UInt): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "EngAssociateSurface", longArrayOf(hsurf, hdev, flhooks.toLong())).toInt()
}

public fun EngBitBlt(psotrg: Long, psosrc: Long, psomask: Long, pco: Long, pxlo: Long, prcltrg: Long, pptlsrc: Long, pptlmask: Long, pbo: Long, pptlbrush: Long, rop4: UInt): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "EngBitBlt", longArrayOf(psotrg, psosrc, psomask, pco, pxlo, prcltrg, pptlsrc, pptlmask, pbo, pptlbrush, rop4.toLong())).toInt()
}

public fun EngCheckAbort(pso: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "EngCheckAbort", longArrayOf(pso)).toInt()
}

public fun EngComputeGlyphSet(ncodepage: Int, nfirstchar: Int, cchars: Int): Long {
    return Win32DynamicFfi.invoke("gdi32.dll", "EngComputeGlyphSet", longArrayOf(ncodepage.toLong(), nfirstchar.toLong(), cchars.toLong()))
}

public fun EngCopyBits(psodest: Long, psosrc: Long, pco: Long, pxlo: Long, prcldest: Long, pptlsrc: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "EngCopyBits", longArrayOf(psodest, psosrc, pco, pxlo, prcldest, pptlsrc)).toInt()
}

public fun EngCreateBitmap(sizl: SIZE, lwidth: Int, iformat: UInt, fl: UInt, pvbits: Long): HBITMAP {
    return Win32DynamicFfi.invoke("gdi32.dll", "EngCreateBitmap", longArrayOf(((sizl.cx.toLong() and 0xFFFF_FFFFL) or ((sizl.cy.toLong() and 0xFFFF_FFFFL) shl 32)), lwidth.toLong(), iformat.toLong(), fl.toLong(), pvbits))
}

public fun EngCreateClip(): Long {
    return Win32DynamicFfi.invoke("gdi32.dll", "EngCreateClip", longArrayOf())
}

public fun EngCreateDeviceBitmap(dhsurf: DHSURF, sizl: SIZE, iformatcompat: UInt): HBITMAP {
    return Win32DynamicFfi.invoke("gdi32.dll", "EngCreateDeviceBitmap", longArrayOf(dhsurf, ((sizl.cx.toLong() and 0xFFFF_FFFFL) or ((sizl.cy.toLong() and 0xFFFF_FFFFL) shl 32)), iformatcompat.toLong()))
}

public fun EngCreateDeviceSurface(dhsurf: DHSURF, sizl: SIZE, iformatcompat: UInt): HSURF {
    return Win32DynamicFfi.invoke("gdi32.dll", "EngCreateDeviceSurface", longArrayOf(dhsurf, ((sizl.cx.toLong() and 0xFFFF_FFFFL) or ((sizl.cy.toLong() and 0xFFFF_FFFFL) shl 32)), iformatcompat.toLong()))
}

public fun EngCreatePalette(imode: UInt, ccolors: UInt, pulcolors: Long, flred: UInt, flgreen: UInt, flblue: UInt): HPALETTE {
    return Win32DynamicFfi.invoke("gdi32.dll", "EngCreatePalette", longArrayOf(imode.toLong(), ccolors.toLong(), pulcolors, flred.toLong(), flgreen.toLong(), flblue.toLong()))
}

public fun EngCreateSemaphore(): HSEMAPHORE {
    return Win32DynamicFfi.invoke("gdi32.dll", "EngCreateSemaphore", longArrayOf())
}

public fun EngDeleteClip(pco: Long) {
    Win32DynamicFfi.invoke("gdi32.dll", "EngDeleteClip", longArrayOf(pco))
}

public fun EngDeletePalette(hpal: HPALETTE): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "EngDeletePalette", longArrayOf(hpal)).toInt()
}

public fun EngDeletePath(ppo: Long) {
    Win32DynamicFfi.invoke("gdi32.dll", "EngDeletePath", longArrayOf(ppo))
}

public fun EngDeleteSemaphore(hsem: HSEMAPHORE) {
    Win32DynamicFfi.invoke("gdi32.dll", "EngDeleteSemaphore", longArrayOf(hsem))
}

public fun EngDeleteSurface(hsurf: HSURF): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "EngDeleteSurface", longArrayOf(hsurf)).toInt()
}

public fun EngEraseSurface(pso: Long, prcl: Long, icolor: UInt): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "EngEraseSurface", longArrayOf(pso, prcl, icolor.toLong())).toInt()
}

public fun EngFillPath(pso: Long, ppo: Long, pco: Long, pbo: Long, pptlbrushorg: Long, mix: UInt, floptions: UInt): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "EngFillPath", longArrayOf(pso, ppo, pco, pbo, pptlbrushorg, mix.toLong(), floptions.toLong())).toInt()
}

public fun EngFindResource(h: HANDLE, iname: Int, itype: Int, pulsize: Long): Long {
    return Win32DynamicFfi.invoke("gdi32.dll", "EngFindResource", longArrayOf(h, iname.toLong(), itype.toLong(), pulsize))
}

public fun EngFreeModule(h: HANDLE) {
    Win32DynamicFfi.invoke("gdi32.dll", "EngFreeModule", longArrayOf(h))
}

public fun EngGetCurrentCodePage(oemcodepage: Long, ansicodepage: Long) {
    Win32DynamicFfi.invoke("gdi32.dll", "EngGetCurrentCodePage", longArrayOf(oemcodepage, ansicodepage))
}

public fun EngGetDriverName(hdev: HDEV): PWSTR {
    return Win32DynamicFfi.invoke("gdi32.dll", "EngGetDriverName", longArrayOf(hdev))
}

public fun EngGetPrinterDataFileName(hdev: HDEV): PWSTR {
    return Win32DynamicFfi.invoke("gdi32.dll", "EngGetPrinterDataFileName", longArrayOf(hdev))
}

public fun EngGradientFill(psodest: Long, pco: Long, pxlo: Long, pvertex: Long, nvertex: UInt, pmesh: Long, nmesh: UInt, prclextents: Long, pptlditherorg: Long, ulmode: UInt): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "EngGradientFill", longArrayOf(psodest, pco, pxlo, pvertex, nvertex.toLong(), pmesh, nmesh.toLong(), prclextents, pptlditherorg, ulmode.toLong())).toInt()
}

public fun EngLineTo(pso: Long, pco: Long, pbo: Long, x1: Int, y1: Int, x2: Int, y2: Int, prclbounds: Long, mix: UInt): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "EngLineTo", longArrayOf(pso, pco, pbo, x1.toLong(), y1.toLong(), x2.toLong(), y2.toLong(), prclbounds, mix.toLong())).toInt()
}

public fun EngLoadModule(pwsz: PCWSTR): HANDLE {
    return Win32DynamicFfi.invoke("gdi32.dll", "EngLoadModule", longArrayOf(pwsz))
}

public fun EngLockSurface(hsurf: HSURF): Long {
    return Win32DynamicFfi.invoke("gdi32.dll", "EngLockSurface", longArrayOf(hsurf))
}

public fun EngMarkBandingSurface(hsurf: HSURF): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "EngMarkBandingSurface", longArrayOf(hsurf)).toInt()
}

public fun EngMultiByteToUnicodeN(unicodestring: PWSTR, maxbytesinunicodestring: UInt, bytesinunicodestring: Long, multibytestring: PCSTR, bytesinmultibytestring: UInt) {
    Win32DynamicFfi.invoke("gdi32.dll", "EngMultiByteToUnicodeN", longArrayOf(unicodestring, maxbytesinunicodestring.toLong(), bytesinunicodestring, multibytestring, bytesinmultibytestring.toLong()))
}

public fun EngMultiByteToWideChar(codepage: UInt, widecharstring: PWSTR, bytesinwidecharstring: Int, multibytestring: PCSTR, bytesinmultibytestring: Int): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "EngMultiByteToWideChar", longArrayOf(codepage.toLong(), widecharstring, bytesinwidecharstring.toLong(), multibytestring, bytesinmultibytestring.toLong())).toInt()
}

public fun EngPaint(pso: Long, pco: Long, pbo: Long, pptlbrushorg: Long, mix: UInt): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "EngPaint", longArrayOf(pso, pco, pbo, pptlbrushorg, mix.toLong())).toInt()
}

public fun EngPlgBlt(psotrg: Long, psosrc: Long, psomsk: Long, pco: Long, pxlo: Long, pca: Long, pptlbrushorg: Long, pptfx: Long, prcl: Long, pptl: Long, imode: UInt): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "EngPlgBlt", longArrayOf(psotrg, psosrc, psomsk, pco, pxlo, pca, pptlbrushorg, pptfx, prcl, pptl, imode.toLong())).toInt()
}

public fun EngQueryEMFInfo(hdev: HDEV, pemfinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "EngQueryEMFInfo", longArrayOf(hdev, pemfinfo)).toInt()
}

public fun EngQueryLocalTime(param0: Long) {
    Win32DynamicFfi.invoke("gdi32.dll", "EngQueryLocalTime", longArrayOf(param0))
}

public fun EngReleaseSemaphore(hsem: HSEMAPHORE) {
    Win32DynamicFfi.invoke("gdi32.dll", "EngReleaseSemaphore", longArrayOf(hsem))
}

public fun EngStretchBlt(psodest: Long, psosrc: Long, psomask: Long, pco: Long, pxlo: Long, pca: Long, pptlhtorg: Long, prcldest: Long, prclsrc: Long, pptlmask: Long, imode: UInt): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "EngStretchBlt", longArrayOf(psodest, psosrc, psomask, pco, pxlo, pca, pptlhtorg, prcldest, prclsrc, pptlmask, imode.toLong())).toInt()
}

public fun EngStretchBltROP(psodest: Long, psosrc: Long, psomask: Long, pco: Long, pxlo: Long, pca: Long, pptlhtorg: Long, prcldest: Long, prclsrc: Long, pptlmask: Long, imode: UInt, pbo: Long, rop4: UInt): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "EngStretchBltROP", longArrayOf(psodest, psosrc, psomask, pco, pxlo, pca, pptlhtorg, prcldest, prclsrc, pptlmask, imode.toLong(), pbo, rop4.toLong())).toInt()
}

public fun EngStrokeAndFillPath(pso: Long, ppo: Long, pco: Long, pxo: Long, pbostroke: Long, plineattrs: Long, pbofill: Long, pptlbrushorg: Long, mixfill: UInt, floptions: UInt): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "EngStrokeAndFillPath", longArrayOf(pso, ppo, pco, pxo, pbostroke, plineattrs, pbofill, pptlbrushorg, mixfill.toLong(), floptions.toLong())).toInt()
}

public fun EngStrokePath(pso: Long, ppo: Long, pco: Long, pxo: Long, pbo: Long, pptlbrushorg: Long, plineattrs: Long, mix: UInt): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "EngStrokePath", longArrayOf(pso, ppo, pco, pxo, pbo, pptlbrushorg, plineattrs, mix.toLong())).toInt()
}

public fun EngTextOut(pso: Long, pstro: Long, pfo: Long, pco: Long, prclextra: Long, prclopaque: Long, pbofore: Long, pboopaque: Long, pptlorg: Long, mix: UInt): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "EngTextOut", longArrayOf(pso, pstro, pfo, pco, prclextra, prclopaque, pbofore, pboopaque, pptlorg, mix.toLong())).toInt()
}

public fun EngTransparentBlt(psodst: Long, psosrc: Long, pco: Long, pxlo: Long, prcldst: Long, prclsrc: Long, transcolor: UInt, bcalledfrombitblt: UInt): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "EngTransparentBlt", longArrayOf(psodst, psosrc, pco, pxlo, prcldst, prclsrc, transcolor.toLong(), bcalledfrombitblt.toLong())).toInt()
}

public fun EngUnicodeToMultiByteN(multibytestring: PSTR, maxbytesinmultibytestring: UInt, bytesinmultibytestring: Long, unicodestring: PCWSTR, bytesinunicodestring: UInt) {
    Win32DynamicFfi.invoke("gdi32.dll", "EngUnicodeToMultiByteN", longArrayOf(multibytestring, maxbytesinmultibytestring.toLong(), bytesinmultibytestring, unicodestring, bytesinunicodestring.toLong()))
}

public fun EngUnlockSurface(pso: Long) {
    Win32DynamicFfi.invoke("gdi32.dll", "EngUnlockSurface", longArrayOf(pso))
}

public fun EngWideCharToMultiByte(codepage: UInt, widecharstring: PCWSTR, bytesinwidecharstring: Int, multibytestring: PSTR, bytesinmultibytestring: Int): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "EngWideCharToMultiByte", longArrayOf(codepage.toLong(), widecharstring, bytesinwidecharstring.toLong(), multibytestring, bytesinmultibytestring.toLong())).toInt()
}

public fun FONTOBJ_cGetAllGlyphHandles(pfo: Long, phg: Long): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "FONTOBJ_cGetAllGlyphHandles", longArrayOf(pfo, phg)).toUInt()
}

public fun FONTOBJ_cGetGlyphs(pfo: Long, imode: UInt, cglyph: UInt, phg: Long, ppvglyph: Long): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "FONTOBJ_cGetGlyphs", longArrayOf(pfo, imode.toLong(), cglyph.toLong(), phg, ppvglyph)).toUInt()
}

public fun FONTOBJ_pQueryGlyphAttrs(pfo: Long, imode: UInt): Long {
    return Win32DynamicFfi.invoke("gdi32.dll", "FONTOBJ_pQueryGlyphAttrs", longArrayOf(pfo, imode.toLong()))
}

public fun FONTOBJ_pfdg(pfo: Long): Long {
    return Win32DynamicFfi.invoke("gdi32.dll", "FONTOBJ_pfdg", longArrayOf(pfo))
}

public fun FONTOBJ_pifi(pfo: Long): Long {
    return Win32DynamicFfi.invoke("gdi32.dll", "FONTOBJ_pifi", longArrayOf(pfo))
}

public fun FONTOBJ_pvTrueTypeFontFile(pfo: Long, pcjfile: Long): Long {
    return Win32DynamicFfi.invoke("gdi32.dll", "FONTOBJ_pvTrueTypeFontFile", longArrayOf(pfo, pcjfile))
}

public fun FONTOBJ_pxoGetXform(pfo: Long): Long {
    return Win32DynamicFfi.invoke("gdi32.dll", "FONTOBJ_pxoGetXform", longArrayOf(pfo))
}

public fun FONTOBJ_vGetInfo(pfo: Long, cjsize: UInt, pfi: Long) {
    Win32DynamicFfi.invoke("gdi32.dll", "FONTOBJ_vGetInfo", longArrayOf(pfo, cjsize.toLong(), pfi))
}

public fun GetAutoRotationState(pstate: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetAutoRotationState", longArrayOf(pstate)).toInt()
}

public fun GetCapabilitiesStringLength(hmonitor: HANDLE, pdwcapabilitiesstringlengthincharacters: Long): Int {
    return Win32DynamicFfi.invoke("dxva2.dll", "GetCapabilitiesStringLength", longArrayOf(hmonitor, pdwcapabilitiesstringlengthincharacters)).toInt()
}

public fun GetDisplayAutoRotationPreferences(porientation: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetDisplayAutoRotationPreferences", longArrayOf(porientation)).toInt()
}

public fun GetDisplayConfigBufferSizes(flags: QUERY_DISPLAY_CONFIG_FLAGS, numpatharrayelements: Long, nummodeinfoarrayelements: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("user32.dll", "GetDisplayConfigBufferSizes", longArrayOf(flags.toLong(), numpatharrayelements, nummodeinfoarrayelements)).toUInt()
}

public fun GetMonitorBrightness(hmonitor: HANDLE, pdwminimumbrightness: Long, pdwcurrentbrightness: Long, pdwmaximumbrightness: Long): Int {
    return Win32DynamicFfi.invoke("dxva2.dll", "GetMonitorBrightness", longArrayOf(hmonitor, pdwminimumbrightness, pdwcurrentbrightness, pdwmaximumbrightness)).toInt()
}

public fun GetMonitorCapabilities(hmonitor: HANDLE, pdwmonitorcapabilities: Long, pdwsupportedcolortemperatures: Long): Int {
    return Win32DynamicFfi.invoke("dxva2.dll", "GetMonitorCapabilities", longArrayOf(hmonitor, pdwmonitorcapabilities, pdwsupportedcolortemperatures)).toInt()
}

public fun GetMonitorColorTemperature(hmonitor: HANDLE, pctcurrentcolortemperature: Long): Int {
    return Win32DynamicFfi.invoke("dxva2.dll", "GetMonitorColorTemperature", longArrayOf(hmonitor, pctcurrentcolortemperature)).toInt()
}

public fun GetMonitorContrast(hmonitor: HANDLE, pdwminimumcontrast: Long, pdwcurrentcontrast: Long, pdwmaximumcontrast: Long): Int {
    return Win32DynamicFfi.invoke("dxva2.dll", "GetMonitorContrast", longArrayOf(hmonitor, pdwminimumcontrast, pdwcurrentcontrast, pdwmaximumcontrast)).toInt()
}

public fun GetMonitorDisplayAreaPosition(hmonitor: HANDLE, ptpositiontype: MC_POSITION_TYPE, pdwminimumposition: Long, pdwcurrentposition: Long, pdwmaximumposition: Long): Int {
    return Win32DynamicFfi.invoke("dxva2.dll", "GetMonitorDisplayAreaPosition", longArrayOf(hmonitor, ptpositiontype.toLong(), pdwminimumposition, pdwcurrentposition, pdwmaximumposition)).toInt()
}

public fun GetMonitorDisplayAreaSize(hmonitor: HANDLE, stsizetype: MC_SIZE_TYPE, pdwminimumwidthorheight: Long, pdwcurrentwidthorheight: Long, pdwmaximumwidthorheight: Long): Int {
    return Win32DynamicFfi.invoke("dxva2.dll", "GetMonitorDisplayAreaSize", longArrayOf(hmonitor, stsizetype.toLong(), pdwminimumwidthorheight, pdwcurrentwidthorheight, pdwmaximumwidthorheight)).toInt()
}

public fun GetMonitorRedGreenOrBlueDrive(hmonitor: HANDLE, dtdrivetype: MC_DRIVE_TYPE, pdwminimumdrive: Long, pdwcurrentdrive: Long, pdwmaximumdrive: Long): Int {
    return Win32DynamicFfi.invoke("dxva2.dll", "GetMonitorRedGreenOrBlueDrive", longArrayOf(hmonitor, dtdrivetype.toLong(), pdwminimumdrive, pdwcurrentdrive, pdwmaximumdrive)).toInt()
}

public fun GetMonitorRedGreenOrBlueGain(hmonitor: HANDLE, gtgaintype: MC_GAIN_TYPE, pdwminimumgain: Long, pdwcurrentgain: Long, pdwmaximumgain: Long): Int {
    return Win32DynamicFfi.invoke("dxva2.dll", "GetMonitorRedGreenOrBlueGain", longArrayOf(hmonitor, gtgaintype.toLong(), pdwminimumgain, pdwcurrentgain, pdwmaximumgain)).toInt()
}

public fun GetMonitorTechnologyType(hmonitor: HANDLE, pdtydisplaytechnologytype: Long): Int {
    return Win32DynamicFfi.invoke("dxva2.dll", "GetMonitorTechnologyType", longArrayOf(hmonitor, pdtydisplaytechnologytype)).toInt()
}

public fun GetNumberOfPhysicalMonitorsFromHMONITOR(hmonitor: HMONITOR, pdwnumberofphysicalmonitors: Long): BOOL {
    return Win32DynamicFfi.invoke("dxva2.dll", "GetNumberOfPhysicalMonitorsFromHMONITOR", longArrayOf(hmonitor, pdwnumberofphysicalmonitors)).toInt()
}

public fun GetPhysicalMonitorsFromHMONITOR(hmonitor: HMONITOR, dwphysicalmonitorarraysize: UInt, pphysicalmonitorarray: Long): BOOL {
    return Win32DynamicFfi.invoke("dxva2.dll", "GetPhysicalMonitorsFromHMONITOR", longArrayOf(hmonitor, dwphysicalmonitorarraysize.toLong(), pphysicalmonitorarray)).toInt()
}

public fun GetTimingReport(hmonitor: HANDLE, pmtrmonitortimingreport: Long): Int {
    return Win32DynamicFfi.invoke("dxva2.dll", "GetTimingReport", longArrayOf(hmonitor, pmtrmonitortimingreport)).toInt()
}

public fun GetVCPFeatureAndVCPFeatureReply(hmonitor: HANDLE, bvcpcode: UByte, pvct: Long, pdwcurrentvalue: Long, pdwmaximumvalue: Long): Int {
    return Win32DynamicFfi.invoke("dxva2.dll", "GetVCPFeatureAndVCPFeatureReply", longArrayOf(hmonitor, bvcpcode.toLong(), pvct, pdwcurrentvalue, pdwmaximumvalue)).toInt()
}

public fun HT_Get8BPPFormatPalette(ppaletteentry: Long, redgamma: UShort, greengamma: UShort, bluegamma: UShort): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "HT_Get8BPPFormatPalette", longArrayOf(ppaletteentry, redgamma.toLong(), greengamma.toLong(), bluegamma.toLong())).toInt()
}

public fun HT_Get8BPPMaskPalette(ppaletteentry: Long, use8bppmaskpal: BOOL, cmymask: UByte, redgamma: UShort, greengamma: UShort, bluegamma: UShort): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "HT_Get8BPPMaskPalette", longArrayOf(ppaletteentry, use8bppmaskpal.toLong(), cmymask.toLong(), redgamma.toLong(), greengamma.toLong(), bluegamma.toLong())).toInt()
}

public fun PATHOBJ_bEnum(ppo: Long, ppd: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "PATHOBJ_bEnum", longArrayOf(ppo, ppd)).toInt()
}

public fun PATHOBJ_bEnumClipLines(ppo: Long, cb: UInt, pcl: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "PATHOBJ_bEnumClipLines", longArrayOf(ppo, cb.toLong(), pcl)).toInt()
}

public fun PATHOBJ_vEnumStart(ppo: Long) {
    Win32DynamicFfi.invoke("gdi32.dll", "PATHOBJ_vEnumStart", longArrayOf(ppo))
}

public fun PATHOBJ_vEnumStartClipLines(ppo: Long, pco: Long, pso: Long, pla: Long) {
    Win32DynamicFfi.invoke("gdi32.dll", "PATHOBJ_vEnumStartClipLines", longArrayOf(ppo, pco, pso, pla))
}

public fun PATHOBJ_vGetBounds(ppo: Long, prectfx: Long) {
    Win32DynamicFfi.invoke("gdi32.dll", "PATHOBJ_vGetBounds", longArrayOf(ppo, prectfx))
}

public fun QueryDisplayConfig(flags: QUERY_DISPLAY_CONFIG_FLAGS, numpatharrayelements: Long, patharray: Long, nummodeinfoarrayelements: Long, modeinfoarray: Long, currenttopologyid: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("user32.dll", "QueryDisplayConfig", longArrayOf(flags.toLong(), numpatharrayelements, patharray, nummodeinfoarrayelements, modeinfoarray, currenttopologyid)).toUInt()
}

public fun RestoreMonitorFactoryColorDefaults(hmonitor: HANDLE): Int {
    return Win32DynamicFfi.invoke("dxva2.dll", "RestoreMonitorFactoryColorDefaults", longArrayOf(hmonitor)).toInt()
}

public fun RestoreMonitorFactoryDefaults(hmonitor: HANDLE): Int {
    return Win32DynamicFfi.invoke("dxva2.dll", "RestoreMonitorFactoryDefaults", longArrayOf(hmonitor)).toInt()
}

public fun STROBJ_bEnum(pstro: Long, pc: Long, ppgpos: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "STROBJ_bEnum", longArrayOf(pstro, pc, ppgpos)).toInt()
}

public fun STROBJ_bEnumPositionsOnly(pstro: Long, pc: Long, ppgpos: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "STROBJ_bEnumPositionsOnly", longArrayOf(pstro, pc, ppgpos)).toInt()
}

public fun STROBJ_bGetAdvanceWidths(pso: Long, ifirst: UInt, c: UInt, pptqd: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "STROBJ_bGetAdvanceWidths", longArrayOf(pso, ifirst.toLong(), c.toLong(), pptqd)).toInt()
}

public fun STROBJ_dwGetCodePage(pstro: Long): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "STROBJ_dwGetCodePage", longArrayOf(pstro)).toUInt()
}

public fun STROBJ_vEnumStart(pstro: Long) {
    Win32DynamicFfi.invoke("gdi32.dll", "STROBJ_vEnumStart", longArrayOf(pstro))
}

public fun SaveCurrentMonitorSettings(hmonitor: HANDLE): Int {
    return Win32DynamicFfi.invoke("dxva2.dll", "SaveCurrentMonitorSettings", longArrayOf(hmonitor)).toInt()
}

public fun SaveCurrentSettings(hmonitor: HANDLE): Int {
    return Win32DynamicFfi.invoke("dxva2.dll", "SaveCurrentSettings", longArrayOf(hmonitor)).toInt()
}

public fun SetDisplayAutoRotationPreferences(orientation: ORIENTATION_PREFERENCE): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetDisplayAutoRotationPreferences", longArrayOf(orientation.toLong())).toInt()
}

public fun SetDisplayConfig(numpatharrayelements: UInt, patharray: Long, nummodeinfoarrayelements: UInt, modeinfoarray: Long, flags: SET_DISPLAY_CONFIG_FLAGS): Int {
    return Win32DynamicFfi.invoke("user32.dll", "SetDisplayConfig", longArrayOf(numpatharrayelements.toLong(), patharray, nummodeinfoarrayelements.toLong(), modeinfoarray, flags.toLong())).toInt()
}

public fun SetMonitorBrightness(hmonitor: HANDLE, dwnewbrightness: UInt): Int {
    return Win32DynamicFfi.invoke("dxva2.dll", "SetMonitorBrightness", longArrayOf(hmonitor, dwnewbrightness.toLong())).toInt()
}

public fun SetMonitorColorTemperature(hmonitor: HANDLE, ctcurrentcolortemperature: MC_COLOR_TEMPERATURE): Int {
    return Win32DynamicFfi.invoke("dxva2.dll", "SetMonitorColorTemperature", longArrayOf(hmonitor, ctcurrentcolortemperature.toLong())).toInt()
}

public fun SetMonitorContrast(hmonitor: HANDLE, dwnewcontrast: UInt): Int {
    return Win32DynamicFfi.invoke("dxva2.dll", "SetMonitorContrast", longArrayOf(hmonitor, dwnewcontrast.toLong())).toInt()
}

public fun SetMonitorDisplayAreaPosition(hmonitor: HANDLE, ptpositiontype: MC_POSITION_TYPE, dwnewposition: UInt): Int {
    return Win32DynamicFfi.invoke("dxva2.dll", "SetMonitorDisplayAreaPosition", longArrayOf(hmonitor, ptpositiontype.toLong(), dwnewposition.toLong())).toInt()
}

public fun SetMonitorDisplayAreaSize(hmonitor: HANDLE, stsizetype: MC_SIZE_TYPE, dwnewdisplayareawidthorheight: UInt): Int {
    return Win32DynamicFfi.invoke("dxva2.dll", "SetMonitorDisplayAreaSize", longArrayOf(hmonitor, stsizetype.toLong(), dwnewdisplayareawidthorheight.toLong())).toInt()
}

public fun SetMonitorRedGreenOrBlueDrive(hmonitor: HANDLE, dtdrivetype: MC_DRIVE_TYPE, dwnewdrive: UInt): Int {
    return Win32DynamicFfi.invoke("dxva2.dll", "SetMonitorRedGreenOrBlueDrive", longArrayOf(hmonitor, dtdrivetype.toLong(), dwnewdrive.toLong())).toInt()
}

public fun SetMonitorRedGreenOrBlueGain(hmonitor: HANDLE, gtgaintype: MC_GAIN_TYPE, dwnewgain: UInt): Int {
    return Win32DynamicFfi.invoke("dxva2.dll", "SetMonitorRedGreenOrBlueGain", longArrayOf(hmonitor, gtgaintype.toLong(), dwnewgain.toLong())).toInt()
}

public fun SetVCPFeature(hmonitor: HANDLE, bvcpcode: UByte, dwnewvalue: UInt): Int {
    return Win32DynamicFfi.invoke("dxva2.dll", "SetVCPFeature", longArrayOf(hmonitor, bvcpcode.toLong(), dwnewvalue.toLong())).toInt()
}

public fun XFORMOBJ_bApplyXform(pxo: Long, imode: UInt, cpoints: UInt, pvin: Long, pvout: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "XFORMOBJ_bApplyXform", longArrayOf(pxo, imode.toLong(), cpoints.toLong(), pvin, pvout)).toInt()
}

public fun XFORMOBJ_iGetXform(pxo: Long, pxform: Long): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "XFORMOBJ_iGetXform", longArrayOf(pxo, pxform)).toUInt()
}

public fun XLATEOBJ_cGetPalette(pxlo: Long, ipal: UInt, cpal: UInt, ppal: Long): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "XLATEOBJ_cGetPalette", longArrayOf(pxlo, ipal.toLong(), cpal.toLong(), ppal)).toUInt()
}

public fun XLATEOBJ_hGetColorTransform(pxlo: Long): HANDLE {
    return Win32DynamicFfi.invoke("gdi32.dll", "XLATEOBJ_hGetColorTransform", longArrayOf(pxlo))
}

public fun XLATEOBJ_iXlate(pxlo: Long, icolor: UInt): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "XLATEOBJ_iXlate", longArrayOf(pxlo, icolor.toLong())).toUInt()
}

public fun XLATEOBJ_piVector(pxlo: Long): Long {
    return Win32DynamicFfi.invoke("gdi32.dll", "XLATEOBJ_piVector", longArrayOf(pxlo))
}
