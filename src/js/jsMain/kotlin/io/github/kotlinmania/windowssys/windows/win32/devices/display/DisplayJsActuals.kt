@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val windowsWin32DevicesDisplayNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun brushobjHGetColorTransform(pbo: MutPtr): Handle =
    if (windowsWin32DevicesDisplayNapiAddon != null) MutPtr((windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayBrushobjHGetColorTransform(pbo.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun brushobjPvAllocRbrush(pbo: MutPtr, cj: UInt): MutPtr =
    if (windowsWin32DevicesDisplayNapiAddon != null) MutPtr((windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayBrushobjPvAllocRbrush(pbo.rawAddress.toString(), cj.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun brushobjPvGetRbrush(pbo: MutPtr): MutPtr =
    if (windowsWin32DevicesDisplayNapiAddon != null) MutPtr((windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayBrushobjPvGetRbrush(pbo.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun brushobjUlGetBrushColor(pbo: MutPtr): UInt =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayBrushobjUlGetBrushColor(pbo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clipobjBEnum(pco: MutPtr, cj: UInt, pul: MutPtr): Bool =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayClipobjBEnum(pco.rawAddress.toString(), cj.toInt(), pul.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clipobjCEnumStart(pco: MutPtr, ball: Bool, itype: UInt, idirection: UInt, climit: UInt): UInt =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayClipobjCEnumStart(pco.rawAddress.toString(), ball, itype.toInt(), idirection.toInt(), climit.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clipobjPpoGetPath(pco: MutPtr): MutPtr =
    if (windowsWin32DevicesDisplayNapiAddon != null) MutPtr((windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayClipobjPpoGetPath(pco.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capabilitiesRequestAndCapabilitiesReply(hmonitor: Handle, pszasciicapabilitiesstring: Pstr, dwcapabilitiesstringlengthincharacters: UInt): Int =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayCapabilitiesRequestAndCapabilitiesReply(hmonitor.rawAddress.toString(), pszasciicapabilitiesstring.rawAddress.toString(), dwcapabilitiesstringlengthincharacters.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun degaussMonitor(hmonitor: Handle): Int =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayDegaussMonitor(hmonitor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyPhysicalMonitor(hmonitor: Handle): Bool =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayDestroyPhysicalMonitor(hmonitor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyPhysicalMonitors(dwphysicalmonitorarraysize: UInt, pphysicalmonitorarray: ConstPtr): Bool =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayDestroyPhysicalMonitors(dwphysicalmonitorarraysize.toInt(), pphysicalmonitorarray.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun displayConfigGetDeviceInfo(requestpacket: MutPtr): Int =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayDisplayConfigGetDeviceInfo(requestpacket.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun displayConfigSetDeviceInfo(setpacket: ConstPtr): Int =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayDisplayConfigSetDeviceInfo(setpacket.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engAcquireSemaphore(hsem: Hsemaphore) {
    if (windowsWin32DevicesDisplayNapiAddon != null) {
        windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngAcquireSemaphore(hsem.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun engAlphaBlend(psodest: MutPtr, psosrc: MutPtr, pco: MutPtr, pxlo: MutPtr, prcldest: MutPtr, prclsrc: MutPtr, pblendobj: MutPtr): Bool =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngAlphaBlend(psodest.rawAddress.toString(), psosrc.rawAddress.toString(), pco.rawAddress.toString(), pxlo.rawAddress.toString(), prcldest.rawAddress.toString(), prclsrc.rawAddress.toString(), pblendobj.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engAssociateSurface(hsurf: Hsurf, hdev: Hdev, flhooks: UInt): Bool =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngAssociateSurface(hsurf.rawAddress.toString(), hdev.rawAddress.toString(), flhooks.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engBitBlt(psotrg: ConstPtr, psosrc: ConstPtr, psomask: ConstPtr, pco: ConstPtr, pxlo: ConstPtr, prcltrg: ConstPtr, pptlsrc: ConstPtr, pptlmask: ConstPtr, pbo: ConstPtr, pptlbrush: ConstPtr, rop4: UInt): Bool =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngBitBlt(psotrg.rawAddress.toString(), psosrc.rawAddress.toString(), psomask.rawAddress.toString(), pco.rawAddress.toString(), pxlo.rawAddress.toString(), prcltrg.rawAddress.toString(), pptlsrc.rawAddress.toString(), pptlmask.rawAddress.toString(), pbo.rawAddress.toString(), pptlbrush.rawAddress.toString(), rop4.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engCheckAbort(pso: MutPtr): Bool =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngCheckAbort(pso.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engComputeGlyphSet(ncodepage: Int, nfirstchar: Int, cchars: Int): MutPtr =
    if (windowsWin32DevicesDisplayNapiAddon != null) MutPtr((windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngComputeGlyphSet(ncodepage, nfirstchar, cchars) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engCopyBits(psodest: MutPtr, psosrc: MutPtr, pco: MutPtr, pxlo: MutPtr, prcldest: MutPtr, pptlsrc: MutPtr): Bool =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngCopyBits(psodest.rawAddress.toString(), psosrc.rawAddress.toString(), pco.rawAddress.toString(), pxlo.rawAddress.toString(), prcldest.rawAddress.toString(), pptlsrc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engCreateBitmap(sizl: Size, lwidth: Int, iformat: UInt, fl: UInt, pvbits: MutPtr): Hbitmap =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engCreateClip(): MutPtr =
    if (windowsWin32DevicesDisplayNapiAddon != null) MutPtr((windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngCreateClip() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engCreateDeviceBitmap(dhsurf: Dhsurf, sizl: Size, iformatcompat: UInt): Hbitmap =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engCreateDeviceSurface(dhsurf: Dhsurf, sizl: Size, iformatcompat: UInt): Hsurf =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engCreatePalette(imode: UInt, ccolors: UInt, pulcolors: MutPtr, flred: UInt, flgreen: UInt, flblue: UInt): Hpalette =
    if (windowsWin32DevicesDisplayNapiAddon != null) MutPtr((windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngCreatePalette(imode.toInt(), ccolors.toInt(), pulcolors.rawAddress.toString(), flred.toInt(), flgreen.toInt(), flblue.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engCreateSemaphore(): Hsemaphore =
    if (windowsWin32DevicesDisplayNapiAddon != null) MutPtr((windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngCreateSemaphore() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engDeleteClip(pco: ConstPtr) {
    if (windowsWin32DevicesDisplayNapiAddon != null) {
        windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngDeleteClip(pco.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun engDeletePalette(hpal: Hpalette): Bool =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngDeletePalette(hpal.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engDeletePath(ppo: MutPtr) {
    if (windowsWin32DevicesDisplayNapiAddon != null) {
        windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngDeletePath(ppo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun engDeleteSemaphore(hsem: Hsemaphore) {
    if (windowsWin32DevicesDisplayNapiAddon != null) {
        windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngDeleteSemaphore(hsem.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun engDeleteSurface(hsurf: Hsurf): Bool =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngDeleteSurface(hsurf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engEraseSurface(pso: MutPtr, prcl: MutPtr, icolor: UInt): Bool =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngEraseSurface(pso.rawAddress.toString(), prcl.rawAddress.toString(), icolor.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engFillPath(pso: MutPtr, ppo: MutPtr, pco: MutPtr, pbo: MutPtr, pptlbrushorg: MutPtr, mix: UInt, floptions: UInt): Bool =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngFillPath(pso.rawAddress.toString(), ppo.rawAddress.toString(), pco.rawAddress.toString(), pbo.rawAddress.toString(), pptlbrushorg.rawAddress.toString(), mix.toInt(), floptions.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engFindResource(h: Handle, iname: Int, itype: Int, pulsize: MutPtr): MutPtr =
    if (windowsWin32DevicesDisplayNapiAddon != null) MutPtr((windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngFindResource(h.rawAddress.toString(), iname, itype, pulsize.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engFreeModule(h: Handle) {
    if (windowsWin32DevicesDisplayNapiAddon != null) {
        windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngFreeModule(h.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun engGetCurrentCodePage(oemcodepage: MutPtr, ansicodepage: MutPtr) {
    if (windowsWin32DevicesDisplayNapiAddon != null) {
        windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngGetCurrentCodePage(oemcodepage.rawAddress.toString(), ansicodepage.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun engGetDriverName(hdev: Hdev): Pwstr =
    if (windowsWin32DevicesDisplayNapiAddon != null) MutPtr((windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngGetDriverName(hdev.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engGetPrinterDataFileName(hdev: Hdev): Pwstr =
    if (windowsWin32DevicesDisplayNapiAddon != null) MutPtr((windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngGetPrinterDataFileName(hdev.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engGradientFill(psodest: MutPtr, pco: MutPtr, pxlo: MutPtr, pvertex: MutPtr, nvertex: UInt, pmesh: MutPtr, nmesh: UInt, prclextents: MutPtr, pptlditherorg: MutPtr, ulmode: UInt): Bool =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngGradientFill(psodest.rawAddress.toString(), pco.rawAddress.toString(), pxlo.rawAddress.toString(), pvertex.rawAddress.toString(), nvertex.toInt(), pmesh.rawAddress.toString(), nmesh.toInt(), prclextents.rawAddress.toString(), pptlditherorg.rawAddress.toString(), ulmode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engLineTo(pso: MutPtr, pco: MutPtr, pbo: MutPtr, x1: Int, y1: Int, x2: Int, y2: Int, prclbounds: MutPtr, mix: UInt): Bool =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngLineTo(pso.rawAddress.toString(), pco.rawAddress.toString(), pbo.rawAddress.toString(), x1, y1, x2, y2, prclbounds.rawAddress.toString(), mix.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engLoadModule(pwsz: Pcwstr): Handle =
    if (windowsWin32DevicesDisplayNapiAddon != null) MutPtr((windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngLoadModule(pwsz.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engLockSurface(hsurf: Hsurf): MutPtr =
    if (windowsWin32DevicesDisplayNapiAddon != null) MutPtr((windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngLockSurface(hsurf.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engMarkBandingSurface(hsurf: Hsurf): Bool =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngMarkBandingSurface(hsurf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engMultiByteToUnicodeN(unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: MutPtr, multibytestring: Pcstr, bytesinmultibytestring: UInt) {
    if (windowsWin32DevicesDisplayNapiAddon != null) {
        windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngMultiByteToUnicodeN(unicodestring.rawAddress.toString(), maxbytesinunicodestring.toInt(), bytesinunicodestring.rawAddress.toString(), multibytestring.rawAddress.toString(), bytesinmultibytestring.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun engMultiByteToWideChar(codepage: UInt, widecharstring: Pwstr, bytesinwidecharstring: Int, multibytestring: Pcstr, bytesinmultibytestring: Int): Int =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngMultiByteToWideChar(codepage.toInt(), widecharstring.rawAddress.toString(), bytesinwidecharstring, multibytestring.rawAddress.toString(), bytesinmultibytestring) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engPaint(pso: MutPtr, pco: MutPtr, pbo: MutPtr, pptlbrushorg: MutPtr, mix: UInt): Bool =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngPaint(pso.rawAddress.toString(), pco.rawAddress.toString(), pbo.rawAddress.toString(), pptlbrushorg.rawAddress.toString(), mix.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engPlgBlt(psotrg: MutPtr, psosrc: MutPtr, psomsk: MutPtr, pco: MutPtr, pxlo: MutPtr, pca: MutPtr, pptlbrushorg: MutPtr, pptfx: MutPtr, prcl: MutPtr, pptl: MutPtr, imode: UInt): Bool =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngPlgBlt(psotrg.rawAddress.toString(), psosrc.rawAddress.toString(), psomsk.rawAddress.toString(), pco.rawAddress.toString(), pxlo.rawAddress.toString(), pca.rawAddress.toString(), pptlbrushorg.rawAddress.toString(), pptfx.rawAddress.toString(), prcl.rawAddress.toString(), pptl.rawAddress.toString(), imode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engQueryEMFInfo(hdev: Hdev, pemfinfo: MutPtr): Bool =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngQueryEMFInfo(hdev.rawAddress.toString(), pemfinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engQueryLocalTime(param0: MutPtr) {
    if (windowsWin32DevicesDisplayNapiAddon != null) {
        windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngQueryLocalTime(param0.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun engReleaseSemaphore(hsem: Hsemaphore) {
    if (windowsWin32DevicesDisplayNapiAddon != null) {
        windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngReleaseSemaphore(hsem.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun engStretchBlt(psodest: MutPtr, psosrc: MutPtr, psomask: MutPtr, pco: MutPtr, pxlo: MutPtr, pca: MutPtr, pptlhtorg: MutPtr, prcldest: MutPtr, prclsrc: MutPtr, pptlmask: MutPtr, imode: UInt): Bool =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngStretchBlt(psodest.rawAddress.toString(), psosrc.rawAddress.toString(), psomask.rawAddress.toString(), pco.rawAddress.toString(), pxlo.rawAddress.toString(), pca.rawAddress.toString(), pptlhtorg.rawAddress.toString(), prcldest.rawAddress.toString(), prclsrc.rawAddress.toString(), pptlmask.rawAddress.toString(), imode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engStretchBltROP(psodest: MutPtr, psosrc: MutPtr, psomask: MutPtr, pco: MutPtr, pxlo: MutPtr, pca: MutPtr, pptlhtorg: MutPtr, prcldest: MutPtr, prclsrc: MutPtr, pptlmask: MutPtr, imode: UInt, pbo: MutPtr, rop4: UInt): Bool =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngStretchBltROP(psodest.rawAddress.toString(), psosrc.rawAddress.toString(), psomask.rawAddress.toString(), pco.rawAddress.toString(), pxlo.rawAddress.toString(), pca.rawAddress.toString(), pptlhtorg.rawAddress.toString(), prcldest.rawAddress.toString(), prclsrc.rawAddress.toString(), pptlmask.rawAddress.toString(), imode.toInt(), pbo.rawAddress.toString(), rop4.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engStrokeAndFillPath(pso: MutPtr, ppo: MutPtr, pco: MutPtr, pxo: MutPtr, pbostroke: MutPtr, plineattrs: MutPtr, pbofill: MutPtr, pptlbrushorg: MutPtr, mixfill: UInt, floptions: UInt): Bool =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngStrokeAndFillPath(pso.rawAddress.toString(), ppo.rawAddress.toString(), pco.rawAddress.toString(), pxo.rawAddress.toString(), pbostroke.rawAddress.toString(), plineattrs.rawAddress.toString(), pbofill.rawAddress.toString(), pptlbrushorg.rawAddress.toString(), mixfill.toInt(), floptions.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engStrokePath(pso: MutPtr, ppo: MutPtr, pco: MutPtr, pxo: MutPtr, pbo: MutPtr, pptlbrushorg: MutPtr, plineattrs: MutPtr, mix: UInt): Bool =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngStrokePath(pso.rawAddress.toString(), ppo.rawAddress.toString(), pco.rawAddress.toString(), pxo.rawAddress.toString(), pbo.rawAddress.toString(), pptlbrushorg.rawAddress.toString(), plineattrs.rawAddress.toString(), mix.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engTextOut(pso: MutPtr, pstro: MutPtr, pfo: MutPtr, pco: MutPtr, prclextra: MutPtr, prclopaque: MutPtr, pbofore: MutPtr, pboopaque: MutPtr, pptlorg: MutPtr, mix: UInt): Bool =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngTextOut(pso.rawAddress.toString(), pstro.rawAddress.toString(), pfo.rawAddress.toString(), pco.rawAddress.toString(), prclextra.rawAddress.toString(), prclopaque.rawAddress.toString(), pbofore.rawAddress.toString(), pboopaque.rawAddress.toString(), pptlorg.rawAddress.toString(), mix.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engTransparentBlt(psodst: ConstPtr, psosrc: ConstPtr, pco: ConstPtr, pxlo: ConstPtr, prcldst: ConstPtr, prclsrc: ConstPtr, transcolor: UInt, bcalledfrombitblt: UInt): Bool =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngTransparentBlt(psodst.rawAddress.toString(), psosrc.rawAddress.toString(), pco.rawAddress.toString(), pxlo.rawAddress.toString(), prcldst.rawAddress.toString(), prclsrc.rawAddress.toString(), transcolor.toInt(), bcalledfrombitblt.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engUnicodeToMultiByteN(multibytestring: Pstr, maxbytesinmultibytestring: UInt, bytesinmultibytestring: MutPtr, unicodestring: Pcwstr, bytesinunicodestring: UInt) {
    if (windowsWin32DevicesDisplayNapiAddon != null) {
        windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngUnicodeToMultiByteN(multibytestring.rawAddress.toString(), maxbytesinmultibytestring.toInt(), bytesinmultibytestring.rawAddress.toString(), unicodestring.rawAddress.toString(), bytesinunicodestring.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun engUnlockSurface(pso: MutPtr) {
    if (windowsWin32DevicesDisplayNapiAddon != null) {
        windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngUnlockSurface(pso.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun engWideCharToMultiByte(codepage: UInt, widecharstring: Pcwstr, bytesinwidecharstring: Int, multibytestring: Pstr, bytesinmultibytestring: Int): Int =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayEngWideCharToMultiByte(codepage.toInt(), widecharstring.rawAddress.toString(), bytesinwidecharstring, multibytestring.rawAddress.toString(), bytesinmultibytestring) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fontobjCGetAllGlyphHandles(pfo: MutPtr, phg: MutPtr): UInt =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayFontobjCGetAllGlyphHandles(pfo.rawAddress.toString(), phg.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fontobjCGetGlyphs(pfo: MutPtr, imode: UInt, cglyph: UInt, phg: MutPtr, ppvglyph: MutPtr): UInt =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayFontobjCGetGlyphs(pfo.rawAddress.toString(), imode.toInt(), cglyph.toInt(), phg.rawAddress.toString(), ppvglyph.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fontobjPQueryGlyphAttrs(pfo: MutPtr, imode: UInt): MutPtr =
    if (windowsWin32DevicesDisplayNapiAddon != null) MutPtr((windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayFontobjPQueryGlyphAttrs(pfo.rawAddress.toString(), imode.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fontobjPfdg(pfo: MutPtr): MutPtr =
    if (windowsWin32DevicesDisplayNapiAddon != null) MutPtr((windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayFontobjPfdg(pfo.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fontobjPifi(pfo: ConstPtr): MutPtr =
    if (windowsWin32DevicesDisplayNapiAddon != null) MutPtr((windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayFontobjPifi(pfo.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fontobjPvTrueTypeFontFile(pfo: MutPtr, pcjfile: MutPtr): MutPtr =
    if (windowsWin32DevicesDisplayNapiAddon != null) MutPtr((windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayFontobjPvTrueTypeFontFile(pfo.rawAddress.toString(), pcjfile.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fontobjPxoGetXform(pfo: ConstPtr): MutPtr =
    if (windowsWin32DevicesDisplayNapiAddon != null) MutPtr((windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayFontobjPxoGetXform(pfo.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fontobjVGetInfo(pfo: MutPtr, cjsize: UInt, pfi: MutPtr) {
    if (windowsWin32DevicesDisplayNapiAddon != null) {
        windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayFontobjVGetInfo(pfo.rawAddress.toString(), cjsize.toInt(), pfi.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getAutoRotationState(pstate: MutPtr): Bool =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayGetAutoRotationState(pstate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCapabilitiesStringLength(hmonitor: Handle, pdwcapabilitiesstringlengthincharacters: MutPtr): Int =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayGetCapabilitiesStringLength(hmonitor.rawAddress.toString(), pdwcapabilitiesstringlengthincharacters.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDisplayAutoRotationPreferences(porientation: MutPtr): Bool =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayGetDisplayAutoRotationPreferences(porientation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDisplayConfigBufferSizes(flags: QueryDisplayConfigFlags, numpatharrayelements: MutPtr, nummodeinfoarrayelements: MutPtr): Win32Error =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayGetDisplayConfigBufferSizes(flags.toInt(), numpatharrayelements.rawAddress.toString(), nummodeinfoarrayelements.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMonitorBrightness(hmonitor: Handle, pdwminimumbrightness: MutPtr, pdwcurrentbrightness: MutPtr, pdwmaximumbrightness: MutPtr): Int =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayGetMonitorBrightness(hmonitor.rawAddress.toString(), pdwminimumbrightness.rawAddress.toString(), pdwcurrentbrightness.rawAddress.toString(), pdwmaximumbrightness.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMonitorCapabilities(hmonitor: Handle, pdwmonitorcapabilities: MutPtr, pdwsupportedcolortemperatures: MutPtr): Int =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayGetMonitorCapabilities(hmonitor.rawAddress.toString(), pdwmonitorcapabilities.rawAddress.toString(), pdwsupportedcolortemperatures.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMonitorColorTemperature(hmonitor: Handle, pctcurrentcolortemperature: MutPtr): Int =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayGetMonitorColorTemperature(hmonitor.rawAddress.toString(), pctcurrentcolortemperature.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMonitorContrast(hmonitor: Handle, pdwminimumcontrast: MutPtr, pdwcurrentcontrast: MutPtr, pdwmaximumcontrast: MutPtr): Int =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayGetMonitorContrast(hmonitor.rawAddress.toString(), pdwminimumcontrast.rawAddress.toString(), pdwcurrentcontrast.rawAddress.toString(), pdwmaximumcontrast.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMonitorDisplayAreaPosition(hmonitor: Handle, ptpositiontype: McPositionType, pdwminimumposition: MutPtr, pdwcurrentposition: MutPtr, pdwmaximumposition: MutPtr): Int =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayGetMonitorDisplayAreaPosition(hmonitor.rawAddress.toString(), ptpositiontype, pdwminimumposition.rawAddress.toString(), pdwcurrentposition.rawAddress.toString(), pdwmaximumposition.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMonitorDisplayAreaSize(hmonitor: Handle, stsizetype: McSizeType, pdwminimumwidthorheight: MutPtr, pdwcurrentwidthorheight: MutPtr, pdwmaximumwidthorheight: MutPtr): Int =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayGetMonitorDisplayAreaSize(hmonitor.rawAddress.toString(), stsizetype, pdwminimumwidthorheight.rawAddress.toString(), pdwcurrentwidthorheight.rawAddress.toString(), pdwmaximumwidthorheight.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMonitorRedGreenOrBlueDrive(hmonitor: Handle, dtdrivetype: McDriveType, pdwminimumdrive: MutPtr, pdwcurrentdrive: MutPtr, pdwmaximumdrive: MutPtr): Int =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayGetMonitorRedGreenOrBlueDrive(hmonitor.rawAddress.toString(), dtdrivetype, pdwminimumdrive.rawAddress.toString(), pdwcurrentdrive.rawAddress.toString(), pdwmaximumdrive.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMonitorRedGreenOrBlueGain(hmonitor: Handle, gtgaintype: McGainType, pdwminimumgain: MutPtr, pdwcurrentgain: MutPtr, pdwmaximumgain: MutPtr): Int =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayGetMonitorRedGreenOrBlueGain(hmonitor.rawAddress.toString(), gtgaintype, pdwminimumgain.rawAddress.toString(), pdwcurrentgain.rawAddress.toString(), pdwmaximumgain.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMonitorTechnologyType(hmonitor: Handle, pdtydisplaytechnologytype: MutPtr): Int =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayGetMonitorTechnologyType(hmonitor.rawAddress.toString(), pdtydisplaytechnologytype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumberOfPhysicalMonitorsFromHMONITOR(hmonitor: Hmonitor, pdwnumberofphysicalmonitors: MutPtr): Bool =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayGetNumberOfPhysicalMonitorsFromHMONITOR(hmonitor.rawAddress.toString(), pdwnumberofphysicalmonitors.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPhysicalMonitorsFromHMONITOR(hmonitor: Hmonitor, dwphysicalmonitorarraysize: UInt, pphysicalmonitorarray: MutPtr): Bool =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayGetPhysicalMonitorsFromHMONITOR(hmonitor.rawAddress.toString(), dwphysicalmonitorarraysize.toInt(), pphysicalmonitorarray.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTimingReport(hmonitor: Handle, pmtrmonitortimingreport: MutPtr): Int =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayGetTimingReport(hmonitor.rawAddress.toString(), pmtrmonitortimingreport.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVCPFeatureAndVCPFeatureReply(hmonitor: Handle, bvcpcode: UByte, pvct: MutPtr, pdwcurrentvalue: MutPtr, pdwmaximumvalue: MutPtr): Int =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayGetVCPFeatureAndVCPFeatureReply(hmonitor.rawAddress.toString(), bvcpcode.toInt(), pvct.rawAddress.toString(), pdwcurrentvalue.rawAddress.toString(), pdwmaximumvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun htGet8BppformatPalette(ppaletteentry: MutPtr, redgamma: UShort, greengamma: UShort, bluegamma: UShort): Int =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayHtGet8BppformatPalette(ppaletteentry.rawAddress.toString(), redgamma.toInt(), greengamma.toInt(), bluegamma.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun htGet8BppmaskPalette(ppaletteentry: MutPtr, use8bppmaskpal: Bool, cmymask: UByte, redgamma: UShort, greengamma: UShort, bluegamma: UShort): Int =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayHtGet8BppmaskPalette(ppaletteentry.rawAddress.toString(), use8bppmaskpal, cmymask.toInt(), redgamma.toInt(), greengamma.toInt(), bluegamma.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathobjBEnum(ppo: MutPtr, ppd: MutPtr): Bool =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayPathobjBEnum(ppo.rawAddress.toString(), ppd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathobjBEnumClipLines(ppo: MutPtr, cb: UInt, pcl: MutPtr): Bool =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayPathobjBEnumClipLines(ppo.rawAddress.toString(), cb.toInt(), pcl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathobjVEnumStart(ppo: MutPtr) {
    if (windowsWin32DevicesDisplayNapiAddon != null) {
        windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayPathobjVEnumStart(ppo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathobjVEnumStartClipLines(ppo: MutPtr, pco: MutPtr, pso: MutPtr, pla: MutPtr) {
    if (windowsWin32DevicesDisplayNapiAddon != null) {
        windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayPathobjVEnumStartClipLines(ppo.rawAddress.toString(), pco.rawAddress.toString(), pso.rawAddress.toString(), pla.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathobjVGetBounds(ppo: MutPtr, prectfx: MutPtr) {
    if (windowsWin32DevicesDisplayNapiAddon != null) {
        windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayPathobjVGetBounds(ppo.rawAddress.toString(), prectfx.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun queryDisplayConfig(flags: QueryDisplayConfigFlags, numpatharrayelements: MutPtr, patharray: MutPtr, nummodeinfoarrayelements: MutPtr, modeinfoarray: MutPtr, currenttopologyid: MutPtr): Win32Error =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayQueryDisplayConfig(flags.toInt(), numpatharrayelements.rawAddress.toString(), patharray.rawAddress.toString(), nummodeinfoarrayelements.rawAddress.toString(), modeinfoarray.rawAddress.toString(), currenttopologyid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun restoreMonitorFactoryColorDefaults(hmonitor: Handle): Int =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayRestoreMonitorFactoryColorDefaults(hmonitor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun restoreMonitorFactoryDefaults(hmonitor: Handle): Int =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayRestoreMonitorFactoryDefaults(hmonitor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strobjBEnum(pstro: MutPtr, pc: MutPtr, ppgpos: MutPtr): Bool =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayStrobjBEnum(pstro.rawAddress.toString(), pc.rawAddress.toString(), ppgpos.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strobjBEnumPositionsOnly(pstro: MutPtr, pc: MutPtr, ppgpos: MutPtr): Bool =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayStrobjBEnumPositionsOnly(pstro.rawAddress.toString(), pc.rawAddress.toString(), ppgpos.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strobjBGetAdvanceWidths(pso: MutPtr, ifirst: UInt, c: UInt, pptqd: MutPtr): Bool =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayStrobjBGetAdvanceWidths(pso.rawAddress.toString(), ifirst.toInt(), c.toInt(), pptqd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strobjDwGetCodePage(pstro: MutPtr): UInt =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayStrobjDwGetCodePage(pstro.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strobjVEnumStart(pstro: MutPtr) {
    if (windowsWin32DevicesDisplayNapiAddon != null) {
        windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayStrobjVEnumStart(pstro.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun saveCurrentMonitorSettings(hmonitor: Handle): Int =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplaySaveCurrentMonitorSettings(hmonitor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saveCurrentSettings(hmonitor: Handle): Int =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplaySaveCurrentSettings(hmonitor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDisplayAutoRotationPreferences(orientation: OrientationPreference): Bool =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplaySetDisplayAutoRotationPreferences(orientation) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDisplayConfig(numpatharrayelements: UInt, patharray: ConstPtr, nummodeinfoarrayelements: UInt, modeinfoarray: ConstPtr, flags: SetDisplayConfigFlags): Int =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplaySetDisplayConfig(numpatharrayelements.toInt(), patharray.rawAddress.toString(), nummodeinfoarrayelements.toInt(), modeinfoarray.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMonitorBrightness(hmonitor: Handle, dwnewbrightness: UInt): Int =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplaySetMonitorBrightness(hmonitor.rawAddress.toString(), dwnewbrightness.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMonitorColorTemperature(hmonitor: Handle, ctcurrentcolortemperature: McColorTemperature): Int =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplaySetMonitorColorTemperature(hmonitor.rawAddress.toString(), ctcurrentcolortemperature) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMonitorContrast(hmonitor: Handle, dwnewcontrast: UInt): Int =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplaySetMonitorContrast(hmonitor.rawAddress.toString(), dwnewcontrast.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMonitorDisplayAreaPosition(hmonitor: Handle, ptpositiontype: McPositionType, dwnewposition: UInt): Int =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplaySetMonitorDisplayAreaPosition(hmonitor.rawAddress.toString(), ptpositiontype, dwnewposition.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMonitorDisplayAreaSize(hmonitor: Handle, stsizetype: McSizeType, dwnewdisplayareawidthorheight: UInt): Int =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplaySetMonitorDisplayAreaSize(hmonitor.rawAddress.toString(), stsizetype, dwnewdisplayareawidthorheight.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMonitorRedGreenOrBlueDrive(hmonitor: Handle, dtdrivetype: McDriveType, dwnewdrive: UInt): Int =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplaySetMonitorRedGreenOrBlueDrive(hmonitor.rawAddress.toString(), dtdrivetype, dwnewdrive.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMonitorRedGreenOrBlueGain(hmonitor: Handle, gtgaintype: McGainType, dwnewgain: UInt): Int =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplaySetMonitorRedGreenOrBlueGain(hmonitor.rawAddress.toString(), gtgaintype, dwnewgain.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setVCPFeature(hmonitor: Handle, bvcpcode: UByte, dwnewvalue: UInt): Int =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplaySetVCPFeature(hmonitor.rawAddress.toString(), bvcpcode.toInt(), dwnewvalue.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xformobjBApplyXform(pxo: MutPtr, imode: UInt, cpoints: UInt, pvin: MutPtr, pvout: MutPtr): Bool =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayXformobjBApplyXform(pxo.rawAddress.toString(), imode.toInt(), cpoints.toInt(), pvin.rawAddress.toString(), pvout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xformobjIGetXform(pxo: ConstPtr, pxform: MutPtr): UInt =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayXformobjIGetXform(pxo.rawAddress.toString(), pxform.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xlateobjCGetPalette(pxlo: MutPtr, ipal: UInt, cpal: UInt, ppal: MutPtr): UInt =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayXlateobjCGetPalette(pxlo.rawAddress.toString(), ipal.toInt(), cpal.toInt(), ppal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xlateobjHGetColorTransform(pxlo: MutPtr): Handle =
    if (windowsWin32DevicesDisplayNapiAddon != null) MutPtr((windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayXlateobjHGetColorTransform(pxlo.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xlateobjIXlate(pxlo: MutPtr, icolor: UInt): UInt =
    if (windowsWin32DevicesDisplayNapiAddon != null) (windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayXlateobjIXlate(pxlo.rawAddress.toString(), icolor.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xlateobjPiVector(pxlo: MutPtr): MutPtr =
    if (windowsWin32DevicesDisplayNapiAddon != null) MutPtr((windowsWin32DevicesDisplayNapiAddon.windowssysWindowsWin32DevicesDisplayXlateobjPiVector(pxlo.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")
