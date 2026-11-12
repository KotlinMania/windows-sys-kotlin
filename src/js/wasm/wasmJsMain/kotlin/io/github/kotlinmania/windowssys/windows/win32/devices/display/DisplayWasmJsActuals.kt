@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

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

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32DevicesDisplayNapiAddon(): Boolean

private val windowsWin32DevicesDisplayNapiAvailable: Boolean = initWindowsWin32DevicesDisplayNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayBrushobjHGetColorTransform(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayBrushobjHGetColorTransform(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayBrushobjPvAllocRbrush(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayBrushobjPvAllocRbrush(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayBrushobjPvGetRbrush(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayBrushobjPvGetRbrush(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayBrushobjUlGetBrushColor(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayBrushobjUlGetBrushColor(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayClipobjBEnum(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayClipobjBEnum(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayClipobjCEnumStart(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayClipobjCEnumStart(p0: String, p1: Int, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayClipobjPpoGetPath(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayClipobjPpoGetPath(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayCapabilitiesRequestAndCapabilitiesReply(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayCapabilitiesRequestAndCapabilitiesReply(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayDegaussMonitor(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayDegaussMonitor(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayDestroyPhysicalMonitor(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayDestroyPhysicalMonitor(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayDestroyPhysicalMonitors(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayDestroyPhysicalMonitors(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayDisplayConfigGetDeviceInfo(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayDisplayConfigGetDeviceInfo(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayDisplayConfigSetDeviceInfo(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayDisplayConfigSetDeviceInfo(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngAcquireSemaphore(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngAcquireSemaphore(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngAlphaBlend(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngAlphaBlend(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngAssociateSurface(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngAssociateSurface(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngBitBlt(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngBitBlt(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String, p10: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngCheckAbort(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngCheckAbort(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngComputeGlyphSet(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngComputeGlyphSet(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngCopyBits(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngCopyBits(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngCreateClip()")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngCreateClip(): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngCreatePalette(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngCreatePalette(p0: Int, p1: Int, p2: String, p3: Int, p4: Int, p5: Int): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngCreateSemaphore()")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngCreateSemaphore(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngDeleteClip(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngDeleteClip(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngDeletePalette(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngDeletePalette(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngDeletePath(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngDeletePath(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngDeleteSemaphore(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngDeleteSemaphore(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngDeleteSurface(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngDeleteSurface(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngEraseSurface(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngEraseSurface(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngFillPath(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngFillPath(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngFindResource(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngFindResource(p0: String, p1: Int, p2: Int, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngFreeModule(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngFreeModule(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngGetCurrentCodePage(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngGetCurrentCodePage(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngGetDriverName(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngGetDriverName(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngGetPrinterDataFileName(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngGetPrinterDataFileName(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngGradientFill(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngGradientFill(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: String, p9: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngLineTo(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngLineTo(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: Int, p7: String, p8: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngLoadModule(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngLoadModule(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngLockSurface(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngLockSurface(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngMarkBandingSurface(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngMarkBandingSurface(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngMultiByteToUnicodeN(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngMultiByteToUnicodeN(p0: String, p1: Int, p2: String, p3: String, p4: Int)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngMultiByteToWideChar(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngMultiByteToWideChar(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngPaint(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngPaint(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngPlgBlt(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngPlgBlt(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String, p10: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngQueryEMFInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngQueryEMFInfo(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngQueryLocalTime(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngQueryLocalTime(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngReleaseSemaphore(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngReleaseSemaphore(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngStretchBlt(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngStretchBlt(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String, p10: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngStretchBltROP(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngStretchBltROP(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String, p10: Int, p11: String, p12: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngStrokeAndFillPath(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngStrokeAndFillPath(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: Int, p9: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngStrokePath(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngStrokePath(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngTextOut(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngTextOut(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngTransparentBlt(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngTransparentBlt(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngUnicodeToMultiByteN(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngUnicodeToMultiByteN(p0: String, p1: Int, p2: String, p3: String, p4: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngUnlockSurface(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngUnlockSurface(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayEngWideCharToMultiByte(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayEngWideCharToMultiByte(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayFontobjCGetAllGlyphHandles(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayFontobjCGetAllGlyphHandles(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayFontobjCGetGlyphs(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayFontobjCGetGlyphs(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayFontobjPQueryGlyphAttrs(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayFontobjPQueryGlyphAttrs(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayFontobjPfdg(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayFontobjPfdg(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayFontobjPifi(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayFontobjPifi(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayFontobjPvTrueTypeFontFile(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayFontobjPvTrueTypeFontFile(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayFontobjPxoGetXform(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayFontobjPxoGetXform(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayFontobjVGetInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayFontobjVGetInfo(p0: String, p1: Int, p2: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayGetAutoRotationState(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayGetAutoRotationState(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayGetCapabilitiesStringLength(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayGetCapabilitiesStringLength(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayGetDisplayAutoRotationPreferences(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayGetDisplayAutoRotationPreferences(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayGetDisplayConfigBufferSizes(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayGetDisplayConfigBufferSizes(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayGetMonitorBrightness(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayGetMonitorBrightness(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayGetMonitorCapabilities(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayGetMonitorCapabilities(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayGetMonitorColorTemperature(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayGetMonitorColorTemperature(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayGetMonitorContrast(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayGetMonitorContrast(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayGetMonitorDisplayAreaPosition(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayGetMonitorDisplayAreaPosition(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayGetMonitorDisplayAreaSize(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayGetMonitorDisplayAreaSize(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayGetMonitorRedGreenOrBlueDrive(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayGetMonitorRedGreenOrBlueDrive(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayGetMonitorRedGreenOrBlueGain(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayGetMonitorRedGreenOrBlueGain(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayGetMonitorTechnologyType(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayGetMonitorTechnologyType(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayGetNumberOfPhysicalMonitorsFromHMONITOR(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayGetNumberOfPhysicalMonitorsFromHMONITOR(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayGetPhysicalMonitorsFromHMONITOR(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayGetPhysicalMonitorsFromHMONITOR(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayGetTimingReport(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayGetTimingReport(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayGetVCPFeatureAndVCPFeatureReply(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayGetVCPFeatureAndVCPFeatureReply(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayHtGet8BppformatPalette(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayHtGet8BppformatPalette(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayHtGet8BppmaskPalette(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayHtGet8BppmaskPalette(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayPathobjBEnum(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayPathobjBEnum(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayPathobjBEnumClipLines(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayPathobjBEnumClipLines(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayPathobjVEnumStart(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayPathobjVEnumStart(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayPathobjVEnumStartClipLines(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayPathobjVEnumStartClipLines(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayPathobjVGetBounds(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayPathobjVGetBounds(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayQueryDisplayConfig(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayQueryDisplayConfig(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayRestoreMonitorFactoryColorDefaults(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayRestoreMonitorFactoryColorDefaults(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayRestoreMonitorFactoryDefaults(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayRestoreMonitorFactoryDefaults(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayStrobjBEnum(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayStrobjBEnum(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayStrobjBEnumPositionsOnly(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayStrobjBEnumPositionsOnly(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayStrobjBGetAdvanceWidths(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayStrobjBGetAdvanceWidths(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayStrobjDwGetCodePage(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayStrobjDwGetCodePage(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayStrobjVEnumStart(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayStrobjVEnumStart(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplaySaveCurrentMonitorSettings(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplaySaveCurrentMonitorSettings(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplaySaveCurrentSettings(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplaySaveCurrentSettings(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplaySetDisplayAutoRotationPreferences(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplaySetDisplayAutoRotationPreferences(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplaySetDisplayConfig(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDisplaySetDisplayConfig(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplaySetMonitorBrightness(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDisplaySetMonitorBrightness(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplaySetMonitorColorTemperature(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDisplaySetMonitorColorTemperature(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplaySetMonitorContrast(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDisplaySetMonitorContrast(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplaySetMonitorDisplayAreaPosition(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDisplaySetMonitorDisplayAreaPosition(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplaySetMonitorDisplayAreaSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDisplaySetMonitorDisplayAreaSize(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplaySetMonitorRedGreenOrBlueDrive(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDisplaySetMonitorRedGreenOrBlueDrive(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplaySetMonitorRedGreenOrBlueGain(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDisplaySetMonitorRedGreenOrBlueGain(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplaySetVCPFeature(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesDisplaySetVCPFeature(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayXformobjBApplyXform(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayXformobjBApplyXform(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayXformobjIGetXform(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayXformobjIGetXform(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayXlateobjCGetPalette(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayXlateobjCGetPalette(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayXlateobjHGetColorTransform(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayXlateobjHGetColorTransform(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayXlateobjIXlate(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayXlateobjIXlate(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesDisplayXlateobjPiVector(p0)")
private external fun wasmWindowssysWindowsWin32DevicesDisplayXlateobjPiVector(p0: String): String

public actual fun brushobjHGetColorTransform(pbo: MutPtr<Brushobj>): Handle =
    if (windowsWin32DevicesDisplayNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDisplayBrushobjHGetColorTransform(pbo.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun brushobjPvAllocRbrush(pbo: MutPtr<Brushobj>, cj: UInt): MutPtr<CVoid> =
    if (windowsWin32DevicesDisplayNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDisplayBrushobjPvAllocRbrush(pbo.rawAddress.toString(), cj.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun brushobjPvGetRbrush(pbo: MutPtr<Brushobj>): MutPtr<CVoid> =
    if (windowsWin32DevicesDisplayNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDisplayBrushobjPvGetRbrush(pbo.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun brushobjUlGetBrushColor(pbo: MutPtr<Brushobj>): UInt =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayBrushobjUlGetBrushColor(pbo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clipobjBEnum(pco: MutPtr<Clipobj>, cj: UInt, pul: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayClipobjBEnum(pco.rawAddress.toString(), cj.toInt(), pul.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clipobjCEnumStart(pco: MutPtr<Clipobj>, ball: Bool, itype: UInt, idirection: UInt, climit: UInt): UInt =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayClipobjCEnumStart(pco.rawAddress.toString(), ball, itype.toInt(), idirection.toInt(), climit.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clipobjPpoGetPath(pco: MutPtr<Clipobj>): MutPtr<Pathobj> =
    if (windowsWin32DevicesDisplayNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDisplayClipobjPpoGetPath(pco.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capabilitiesRequestAndCapabilitiesReply(hmonitor: Handle, pszasciicapabilitiesstring: Pstr, dwcapabilitiesstringlengthincharacters: UInt): Int =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayCapabilitiesRequestAndCapabilitiesReply(hmonitor.rawAddress.toString(), pszasciicapabilitiesstring.rawAddress.toString(), dwcapabilitiesstringlengthincharacters.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun degaussMonitor(hmonitor: Handle): Int =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayDegaussMonitor(hmonitor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyPhysicalMonitor(hmonitor: Handle): Bool =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayDestroyPhysicalMonitor(hmonitor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyPhysicalMonitors(dwphysicalmonitorarraysize: UInt, pphysicalmonitorarray: ConstPtr<PhysicalMonitor>): Bool =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayDestroyPhysicalMonitors(dwphysicalmonitorarraysize.toInt(), pphysicalmonitorarray.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun displayConfigGetDeviceInfo(requestpacket: MutPtr<DisplayconfigDeviceInfoHeader>): Int =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayDisplayConfigGetDeviceInfo(requestpacket.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun displayConfigSetDeviceInfo(setpacket: ConstPtr<DisplayconfigDeviceInfoHeader>): Int =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayDisplayConfigSetDeviceInfo(setpacket.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engAcquireSemaphore(hsem: Hsemaphore) {
    if (windowsWin32DevicesDisplayNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesDisplayEngAcquireSemaphore(hsem.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun engAlphaBlend(psodest: MutPtr<Surfobj>, psosrc: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pxlo: MutPtr<Xlateobj>, prcldest: MutPtr<Rectl>, prclsrc: MutPtr<Rectl>, pblendobj: MutPtr<Blendobj>): Bool =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayEngAlphaBlend(psodest.rawAddress.toString(), psosrc.rawAddress.toString(), pco.rawAddress.toString(), pxlo.rawAddress.toString(), prcldest.rawAddress.toString(), prclsrc.rawAddress.toString(), pblendobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engAssociateSurface(hsurf: Hsurf, hdev: Hdev, flhooks: UInt): Bool =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayEngAssociateSurface(hsurf.rawAddress.toString(), hdev.rawAddress.toString(), flhooks.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engBitBlt(psotrg: ConstPtr<Surfobj>, psosrc: ConstPtr<Surfobj>, psomask: ConstPtr<Surfobj>, pco: ConstPtr<Clipobj>, pxlo: ConstPtr<Xlateobj>, prcltrg: ConstPtr<Rectl>, pptlsrc: ConstPtr<Pointl>, pptlmask: ConstPtr<Pointl>, pbo: ConstPtr<Brushobj>, pptlbrush: ConstPtr<Pointl>, rop4: UInt): Bool =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayEngBitBlt(psotrg.rawAddress.toString(), psosrc.rawAddress.toString(), psomask.rawAddress.toString(), pco.rawAddress.toString(), pxlo.rawAddress.toString(), prcltrg.rawAddress.toString(), pptlsrc.rawAddress.toString(), pptlmask.rawAddress.toString(), pbo.rawAddress.toString(), pptlbrush.rawAddress.toString(), rop4.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engCheckAbort(pso: MutPtr<Surfobj>): Bool =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayEngCheckAbort(pso.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engComputeGlyphSet(ncodepage: Int, nfirstchar: Int, cchars: Int): MutPtr<FdGlyphset> =
    if (windowsWin32DevicesDisplayNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDisplayEngComputeGlyphSet(ncodepage, nfirstchar, cchars).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engCopyBits(psodest: MutPtr<Surfobj>, psosrc: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pxlo: MutPtr<Xlateobj>, prcldest: MutPtr<Rectl>, pptlsrc: MutPtr<Pointl>): Bool =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayEngCopyBits(psodest.rawAddress.toString(), psosrc.rawAddress.toString(), pco.rawAddress.toString(), pxlo.rawAddress.toString(), prcldest.rawAddress.toString(), pptlsrc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engCreateBitmap(sizl: Size, lwidth: Int, iformat: UInt, fl: UInt, pvbits: MutPtr<CVoid>): Hbitmap =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engCreateClip(): MutPtr<Clipobj> =
    if (windowsWin32DevicesDisplayNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDisplayEngCreateClip().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engCreateDeviceBitmap(dhsurf: Dhsurf, sizl: Size, iformatcompat: UInt): Hbitmap =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engCreateDeviceSurface(dhsurf: Dhsurf, sizl: Size, iformatcompat: UInt): Hsurf =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engCreatePalette(imode: UInt, ccolors: UInt, pulcolors: MutPtr<UInt>, flred: UInt, flgreen: UInt, flblue: UInt): Hpalette =
    if (windowsWin32DevicesDisplayNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDisplayEngCreatePalette(imode.toInt(), ccolors.toInt(), pulcolors.rawAddress.toString(), flred.toInt(), flgreen.toInt(), flblue.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engCreateSemaphore(): Hsemaphore =
    if (windowsWin32DevicesDisplayNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDisplayEngCreateSemaphore().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engDeleteClip(pco: ConstPtr<Clipobj>) {
    if (windowsWin32DevicesDisplayNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesDisplayEngDeleteClip(pco.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun engDeletePalette(hpal: Hpalette): Bool =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayEngDeletePalette(hpal.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engDeletePath(ppo: MutPtr<Pathobj>) {
    if (windowsWin32DevicesDisplayNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesDisplayEngDeletePath(ppo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun engDeleteSemaphore(hsem: Hsemaphore) {
    if (windowsWin32DevicesDisplayNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesDisplayEngDeleteSemaphore(hsem.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun engDeleteSurface(hsurf: Hsurf): Bool =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayEngDeleteSurface(hsurf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engEraseSurface(pso: MutPtr<Surfobj>, prcl: MutPtr<Rectl>, icolor: UInt): Bool =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayEngEraseSurface(pso.rawAddress.toString(), prcl.rawAddress.toString(), icolor.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engFillPath(pso: MutPtr<Surfobj>, ppo: MutPtr<Pathobj>, pco: MutPtr<Clipobj>, pbo: MutPtr<Brushobj>, pptlbrushorg: MutPtr<Pointl>, mix: UInt, floptions: UInt): Bool =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayEngFillPath(pso.rawAddress.toString(), ppo.rawAddress.toString(), pco.rawAddress.toString(), pbo.rawAddress.toString(), pptlbrushorg.rawAddress.toString(), mix.toInt(), floptions.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engFindResource(h: Handle, iname: Int, itype: Int, pulsize: MutPtr<UInt>): MutPtr<CVoid> =
    if (windowsWin32DevicesDisplayNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDisplayEngFindResource(h.rawAddress.toString(), iname, itype, pulsize.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engFreeModule(h: Handle) {
    if (windowsWin32DevicesDisplayNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesDisplayEngFreeModule(h.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun engGetCurrentCodePage(oemcodepage: MutPtr<UShort>, ansicodepage: MutPtr<UShort>) {
    if (windowsWin32DevicesDisplayNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesDisplayEngGetCurrentCodePage(oemcodepage.rawAddress.toString(), ansicodepage.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun engGetDriverName(hdev: Hdev): Pwstr =
    if (windowsWin32DevicesDisplayNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDisplayEngGetDriverName(hdev.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engGetPrinterDataFileName(hdev: Hdev): Pwstr =
    if (windowsWin32DevicesDisplayNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDisplayEngGetPrinterDataFileName(hdev.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engGradientFill(psodest: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pxlo: MutPtr<Xlateobj>, pvertex: MutPtr<Trivertex>, nvertex: UInt, pmesh: MutPtr<CVoid>, nmesh: UInt, prclextents: MutPtr<Rectl>, pptlditherorg: MutPtr<Pointl>, ulmode: UInt): Bool =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayEngGradientFill(psodest.rawAddress.toString(), pco.rawAddress.toString(), pxlo.rawAddress.toString(), pvertex.rawAddress.toString(), nvertex.toInt(), pmesh.rawAddress.toString(), nmesh.toInt(), prclextents.rawAddress.toString(), pptlditherorg.rawAddress.toString(), ulmode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engLineTo(pso: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pbo: MutPtr<Brushobj>, x1: Int, y1: Int, x2: Int, y2: Int, prclbounds: MutPtr<Rectl>, mix: UInt): Bool =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayEngLineTo(pso.rawAddress.toString(), pco.rawAddress.toString(), pbo.rawAddress.toString(), x1, y1, x2, y2, prclbounds.rawAddress.toString(), mix.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engLoadModule(pwsz: Pcwstr): Handle =
    if (windowsWin32DevicesDisplayNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDisplayEngLoadModule(pwsz.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engLockSurface(hsurf: Hsurf): MutPtr<Surfobj> =
    if (windowsWin32DevicesDisplayNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDisplayEngLockSurface(hsurf.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engMarkBandingSurface(hsurf: Hsurf): Bool =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayEngMarkBandingSurface(hsurf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engMultiByteToUnicodeN(unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: MutPtr<UInt>, multibytestring: Pcstr, bytesinmultibytestring: UInt) {
    if (windowsWin32DevicesDisplayNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesDisplayEngMultiByteToUnicodeN(unicodestring.rawAddress.toString(), maxbytesinunicodestring.toInt(), bytesinunicodestring.rawAddress.toString(), multibytestring.rawAddress.toString(), bytesinmultibytestring.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun engMultiByteToWideChar(codepage: UInt, widecharstring: Pwstr, bytesinwidecharstring: Int, multibytestring: Pcstr, bytesinmultibytestring: Int): Int =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayEngMultiByteToWideChar(codepage.toInt(), widecharstring.rawAddress.toString(), bytesinwidecharstring, multibytestring.rawAddress.toString(), bytesinmultibytestring) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engPaint(pso: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pbo: MutPtr<Brushobj>, pptlbrushorg: MutPtr<Pointl>, mix: UInt): Bool =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayEngPaint(pso.rawAddress.toString(), pco.rawAddress.toString(), pbo.rawAddress.toString(), pptlbrushorg.rawAddress.toString(), mix.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engPlgBlt(psotrg: MutPtr<Surfobj>, psosrc: MutPtr<Surfobj>, psomsk: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pxlo: MutPtr<Xlateobj>, pca: MutPtr<Coloradjustment>, pptlbrushorg: MutPtr<Pointl>, pptfx: MutPtr<Pointfix>, prcl: MutPtr<Rectl>, pptl: MutPtr<Pointl>, imode: UInt): Bool =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayEngPlgBlt(psotrg.rawAddress.toString(), psosrc.rawAddress.toString(), psomsk.rawAddress.toString(), pco.rawAddress.toString(), pxlo.rawAddress.toString(), pca.rawAddress.toString(), pptlbrushorg.rawAddress.toString(), pptfx.rawAddress.toString(), prcl.rawAddress.toString(), pptl.rawAddress.toString(), imode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engQueryEMFInfo(hdev: Hdev, pemfinfo: MutPtr<Emfinfo>): Bool =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayEngQueryEMFInfo(hdev.rawAddress.toString(), pemfinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engQueryLocalTime(param0: MutPtr<EngTimeFields>) {
    if (windowsWin32DevicesDisplayNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesDisplayEngQueryLocalTime(param0.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun engReleaseSemaphore(hsem: Hsemaphore) {
    if (windowsWin32DevicesDisplayNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesDisplayEngReleaseSemaphore(hsem.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun engStretchBlt(psodest: MutPtr<Surfobj>, psosrc: MutPtr<Surfobj>, psomask: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pxlo: MutPtr<Xlateobj>, pca: MutPtr<Coloradjustment>, pptlhtorg: MutPtr<Pointl>, prcldest: MutPtr<Rectl>, prclsrc: MutPtr<Rectl>, pptlmask: MutPtr<Pointl>, imode: UInt): Bool =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayEngStretchBlt(psodest.rawAddress.toString(), psosrc.rawAddress.toString(), psomask.rawAddress.toString(), pco.rawAddress.toString(), pxlo.rawAddress.toString(), pca.rawAddress.toString(), pptlhtorg.rawAddress.toString(), prcldest.rawAddress.toString(), prclsrc.rawAddress.toString(), pptlmask.rawAddress.toString(), imode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engStretchBltROP(psodest: MutPtr<Surfobj>, psosrc: MutPtr<Surfobj>, psomask: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pxlo: MutPtr<Xlateobj>, pca: MutPtr<Coloradjustment>, pptlhtorg: MutPtr<Pointl>, prcldest: MutPtr<Rectl>, prclsrc: MutPtr<Rectl>, pptlmask: MutPtr<Pointl>, imode: UInt, pbo: MutPtr<Brushobj>, rop4: UInt): Bool =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayEngStretchBltROP(psodest.rawAddress.toString(), psosrc.rawAddress.toString(), psomask.rawAddress.toString(), pco.rawAddress.toString(), pxlo.rawAddress.toString(), pca.rawAddress.toString(), pptlhtorg.rawAddress.toString(), prcldest.rawAddress.toString(), prclsrc.rawAddress.toString(), pptlmask.rawAddress.toString(), imode.toInt(), pbo.rawAddress.toString(), rop4.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engStrokeAndFillPath(pso: MutPtr<Surfobj>, ppo: MutPtr<Pathobj>, pco: MutPtr<Clipobj>, pxo: MutPtr<Xformobj>, pbostroke: MutPtr<Brushobj>, plineattrs: MutPtr<Lineattrs>, pbofill: MutPtr<Brushobj>, pptlbrushorg: MutPtr<Pointl>, mixfill: UInt, floptions: UInt): Bool =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayEngStrokeAndFillPath(pso.rawAddress.toString(), ppo.rawAddress.toString(), pco.rawAddress.toString(), pxo.rawAddress.toString(), pbostroke.rawAddress.toString(), plineattrs.rawAddress.toString(), pbofill.rawAddress.toString(), pptlbrushorg.rawAddress.toString(), mixfill.toInt(), floptions.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engStrokePath(pso: MutPtr<Surfobj>, ppo: MutPtr<Pathobj>, pco: MutPtr<Clipobj>, pxo: MutPtr<Xformobj>, pbo: MutPtr<Brushobj>, pptlbrushorg: MutPtr<Pointl>, plineattrs: MutPtr<Lineattrs>, mix: UInt): Bool =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayEngStrokePath(pso.rawAddress.toString(), ppo.rawAddress.toString(), pco.rawAddress.toString(), pxo.rawAddress.toString(), pbo.rawAddress.toString(), pptlbrushorg.rawAddress.toString(), plineattrs.rawAddress.toString(), mix.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engTextOut(pso: MutPtr<Surfobj>, pstro: MutPtr<Strobj>, pfo: MutPtr<Fontobj>, pco: MutPtr<Clipobj>, prclextra: MutPtr<Rectl>, prclopaque: MutPtr<Rectl>, pbofore: MutPtr<Brushobj>, pboopaque: MutPtr<Brushobj>, pptlorg: MutPtr<Pointl>, mix: UInt): Bool =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayEngTextOut(pso.rawAddress.toString(), pstro.rawAddress.toString(), pfo.rawAddress.toString(), pco.rawAddress.toString(), prclextra.rawAddress.toString(), prclopaque.rawAddress.toString(), pbofore.rawAddress.toString(), pboopaque.rawAddress.toString(), pptlorg.rawAddress.toString(), mix.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engTransparentBlt(psodst: ConstPtr<Surfobj>, psosrc: ConstPtr<Surfobj>, pco: ConstPtr<Clipobj>, pxlo: ConstPtr<Xlateobj>, prcldst: ConstPtr<Rectl>, prclsrc: ConstPtr<Rectl>, transcolor: UInt, bcalledfrombitblt: UInt): Bool =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayEngTransparentBlt(psodst.rawAddress.toString(), psosrc.rawAddress.toString(), pco.rawAddress.toString(), pxlo.rawAddress.toString(), prcldst.rawAddress.toString(), prclsrc.rawAddress.toString(), transcolor.toInt(), bcalledfrombitblt.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engUnicodeToMultiByteN(multibytestring: Pstr, maxbytesinmultibytestring: UInt, bytesinmultibytestring: MutPtr<UInt>, unicodestring: Pcwstr, bytesinunicodestring: UInt) {
    if (windowsWin32DevicesDisplayNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesDisplayEngUnicodeToMultiByteN(multibytestring.rawAddress.toString(), maxbytesinmultibytestring.toInt(), bytesinmultibytestring.rawAddress.toString(), unicodestring.rawAddress.toString(), bytesinunicodestring.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun engUnlockSurface(pso: MutPtr<Surfobj>) {
    if (windowsWin32DevicesDisplayNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesDisplayEngUnlockSurface(pso.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun engWideCharToMultiByte(codepage: UInt, widecharstring: Pcwstr, bytesinwidecharstring: Int, multibytestring: Pstr, bytesinmultibytestring: Int): Int =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayEngWideCharToMultiByte(codepage.toInt(), widecharstring.rawAddress.toString(), bytesinwidecharstring, multibytestring.rawAddress.toString(), bytesinmultibytestring) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fontobjCGetAllGlyphHandles(pfo: MutPtr<Fontobj>, phg: MutPtr<UInt>): UInt =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayFontobjCGetAllGlyphHandles(pfo.rawAddress.toString(), phg.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fontobjCGetGlyphs(pfo: MutPtr<Fontobj>, imode: UInt, cglyph: UInt, phg: MutPtr<UInt>, ppvglyph: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayFontobjCGetGlyphs(pfo.rawAddress.toString(), imode.toInt(), cglyph.toInt(), phg.rawAddress.toString(), ppvglyph.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fontobjPQueryGlyphAttrs(pfo: MutPtr<Fontobj>, imode: UInt): MutPtr<FdGlyphattr> =
    if (windowsWin32DevicesDisplayNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDisplayFontobjPQueryGlyphAttrs(pfo.rawAddress.toString(), imode.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fontobjPfdg(pfo: MutPtr<Fontobj>): MutPtr<FdGlyphset> =
    if (windowsWin32DevicesDisplayNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDisplayFontobjPfdg(pfo.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fontobjPifi(pfo: ConstPtr<Fontobj>): MutPtr<Ifimetrics> =
    if (windowsWin32DevicesDisplayNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDisplayFontobjPifi(pfo.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fontobjPvTrueTypeFontFile(pfo: MutPtr<Fontobj>, pcjfile: MutPtr<UInt>): MutPtr<CVoid> =
    if (windowsWin32DevicesDisplayNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDisplayFontobjPvTrueTypeFontFile(pfo.rawAddress.toString(), pcjfile.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fontobjPxoGetXform(pfo: ConstPtr<Fontobj>): MutPtr<Xformobj> =
    if (windowsWin32DevicesDisplayNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDisplayFontobjPxoGetXform(pfo.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fontobjVGetInfo(pfo: MutPtr<Fontobj>, cjsize: UInt, pfi: MutPtr<Fontinfo>) {
    if (windowsWin32DevicesDisplayNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesDisplayFontobjVGetInfo(pfo.rawAddress.toString(), cjsize.toInt(), pfi.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getAutoRotationState(pstate: MutPtr<ArState>): Bool =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayGetAutoRotationState(pstate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCapabilitiesStringLength(hmonitor: Handle, pdwcapabilitiesstringlengthincharacters: MutPtr<UInt>): Int =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayGetCapabilitiesStringLength(hmonitor.rawAddress.toString(), pdwcapabilitiesstringlengthincharacters.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDisplayAutoRotationPreferences(porientation: MutPtr<OrientationPreference>): Bool =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayGetDisplayAutoRotationPreferences(porientation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDisplayConfigBufferSizes(flags: QueryDisplayConfigFlags, numpatharrayelements: MutPtr<UInt>, nummodeinfoarrayelements: MutPtr<UInt>): Win32Error =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayGetDisplayConfigBufferSizes(flags.toInt(), numpatharrayelements.rawAddress.toString(), nummodeinfoarrayelements.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMonitorBrightness(hmonitor: Handle, pdwminimumbrightness: MutPtr<UInt>, pdwcurrentbrightness: MutPtr<UInt>, pdwmaximumbrightness: MutPtr<UInt>): Int =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayGetMonitorBrightness(hmonitor.rawAddress.toString(), pdwminimumbrightness.rawAddress.toString(), pdwcurrentbrightness.rawAddress.toString(), pdwmaximumbrightness.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMonitorCapabilities(hmonitor: Handle, pdwmonitorcapabilities: MutPtr<UInt>, pdwsupportedcolortemperatures: MutPtr<UInt>): Int =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayGetMonitorCapabilities(hmonitor.rawAddress.toString(), pdwmonitorcapabilities.rawAddress.toString(), pdwsupportedcolortemperatures.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMonitorColorTemperature(hmonitor: Handle, pctcurrentcolortemperature: MutPtr<McColorTemperature>): Int =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayGetMonitorColorTemperature(hmonitor.rawAddress.toString(), pctcurrentcolortemperature.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMonitorContrast(hmonitor: Handle, pdwminimumcontrast: MutPtr<UInt>, pdwcurrentcontrast: MutPtr<UInt>, pdwmaximumcontrast: MutPtr<UInt>): Int =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayGetMonitorContrast(hmonitor.rawAddress.toString(), pdwminimumcontrast.rawAddress.toString(), pdwcurrentcontrast.rawAddress.toString(), pdwmaximumcontrast.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMonitorDisplayAreaPosition(hmonitor: Handle, ptpositiontype: McPositionType, pdwminimumposition: MutPtr<UInt>, pdwcurrentposition: MutPtr<UInt>, pdwmaximumposition: MutPtr<UInt>): Int =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayGetMonitorDisplayAreaPosition(hmonitor.rawAddress.toString(), ptpositiontype, pdwminimumposition.rawAddress.toString(), pdwcurrentposition.rawAddress.toString(), pdwmaximumposition.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMonitorDisplayAreaSize(hmonitor: Handle, stsizetype: McSizeType, pdwminimumwidthorheight: MutPtr<UInt>, pdwcurrentwidthorheight: MutPtr<UInt>, pdwmaximumwidthorheight: MutPtr<UInt>): Int =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayGetMonitorDisplayAreaSize(hmonitor.rawAddress.toString(), stsizetype, pdwminimumwidthorheight.rawAddress.toString(), pdwcurrentwidthorheight.rawAddress.toString(), pdwmaximumwidthorheight.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMonitorRedGreenOrBlueDrive(hmonitor: Handle, dtdrivetype: McDriveType, pdwminimumdrive: MutPtr<UInt>, pdwcurrentdrive: MutPtr<UInt>, pdwmaximumdrive: MutPtr<UInt>): Int =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayGetMonitorRedGreenOrBlueDrive(hmonitor.rawAddress.toString(), dtdrivetype, pdwminimumdrive.rawAddress.toString(), pdwcurrentdrive.rawAddress.toString(), pdwmaximumdrive.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMonitorRedGreenOrBlueGain(hmonitor: Handle, gtgaintype: McGainType, pdwminimumgain: MutPtr<UInt>, pdwcurrentgain: MutPtr<UInt>, pdwmaximumgain: MutPtr<UInt>): Int =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayGetMonitorRedGreenOrBlueGain(hmonitor.rawAddress.toString(), gtgaintype, pdwminimumgain.rawAddress.toString(), pdwcurrentgain.rawAddress.toString(), pdwmaximumgain.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMonitorTechnologyType(hmonitor: Handle, pdtydisplaytechnologytype: MutPtr<McDisplayTechnologyType>): Int =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayGetMonitorTechnologyType(hmonitor.rawAddress.toString(), pdtydisplaytechnologytype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumberOfPhysicalMonitorsFromHMONITOR(hmonitor: Hmonitor, pdwnumberofphysicalmonitors: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayGetNumberOfPhysicalMonitorsFromHMONITOR(hmonitor.rawAddress.toString(), pdwnumberofphysicalmonitors.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPhysicalMonitorsFromHMONITOR(hmonitor: Hmonitor, dwphysicalmonitorarraysize: UInt, pphysicalmonitorarray: MutPtr<PhysicalMonitor>): Bool =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayGetPhysicalMonitorsFromHMONITOR(hmonitor.rawAddress.toString(), dwphysicalmonitorarraysize.toInt(), pphysicalmonitorarray.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTimingReport(hmonitor: Handle, pmtrmonitortimingreport: MutPtr<McTimingReport>): Int =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayGetTimingReport(hmonitor.rawAddress.toString(), pmtrmonitortimingreport.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVCPFeatureAndVCPFeatureReply(hmonitor: Handle, bvcpcode: UByte, pvct: MutPtr<McVcpCodeType>, pdwcurrentvalue: MutPtr<UInt>, pdwmaximumvalue: MutPtr<UInt>): Int =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayGetVCPFeatureAndVCPFeatureReply(hmonitor.rawAddress.toString(), bvcpcode.toInt(), pvct.rawAddress.toString(), pdwcurrentvalue.rawAddress.toString(), pdwmaximumvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun htGet8BppformatPalette(ppaletteentry: MutPtr<Paletteentry>, redgamma: UShort, greengamma: UShort, bluegamma: UShort): Int =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayHtGet8BppformatPalette(ppaletteentry.rawAddress.toString(), redgamma.toInt(), greengamma.toInt(), bluegamma.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun htGet8BppmaskPalette(ppaletteentry: MutPtr<Paletteentry>, use8bppmaskpal: Bool, cmymask: UByte, redgamma: UShort, greengamma: UShort, bluegamma: UShort): Int =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayHtGet8BppmaskPalette(ppaletteentry.rawAddress.toString(), use8bppmaskpal, cmymask.toInt(), redgamma.toInt(), greengamma.toInt(), bluegamma.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathobjBEnum(ppo: MutPtr<Pathobj>, ppd: MutPtr<Pathdata>): Bool =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayPathobjBEnum(ppo.rawAddress.toString(), ppd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathobjBEnumClipLines(ppo: MutPtr<Pathobj>, cb: UInt, pcl: MutPtr<Clipline>): Bool =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayPathobjBEnumClipLines(ppo.rawAddress.toString(), cb.toInt(), pcl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathobjVEnumStart(ppo: MutPtr<Pathobj>) {
    if (windowsWin32DevicesDisplayNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesDisplayPathobjVEnumStart(ppo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathobjVEnumStartClipLines(ppo: MutPtr<Pathobj>, pco: MutPtr<Clipobj>, pso: MutPtr<Surfobj>, pla: MutPtr<Lineattrs>) {
    if (windowsWin32DevicesDisplayNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesDisplayPathobjVEnumStartClipLines(ppo.rawAddress.toString(), pco.rawAddress.toString(), pso.rawAddress.toString(), pla.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathobjVGetBounds(ppo: MutPtr<Pathobj>, prectfx: MutPtr<Rectfx>) {
    if (windowsWin32DevicesDisplayNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesDisplayPathobjVGetBounds(ppo.rawAddress.toString(), prectfx.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun queryDisplayConfig(flags: QueryDisplayConfigFlags, numpatharrayelements: MutPtr<UInt>, patharray: MutPtr<DisplayconfigPathInfo>, nummodeinfoarrayelements: MutPtr<UInt>, modeinfoarray: MutPtr<DisplayconfigModeInfo>, currenttopologyid: MutPtr<DisplayconfigTopologyId>): Win32Error =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayQueryDisplayConfig(flags.toInt(), numpatharrayelements.rawAddress.toString(), patharray.rawAddress.toString(), nummodeinfoarrayelements.rawAddress.toString(), modeinfoarray.rawAddress.toString(), currenttopologyid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun restoreMonitorFactoryColorDefaults(hmonitor: Handle): Int =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayRestoreMonitorFactoryColorDefaults(hmonitor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun restoreMonitorFactoryDefaults(hmonitor: Handle): Int =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayRestoreMonitorFactoryDefaults(hmonitor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strobjBEnum(pstro: MutPtr<Strobj>, pc: MutPtr<UInt>, ppgpos: MutPtr<MutPtr<Glyphpos>>): Bool =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayStrobjBEnum(pstro.rawAddress.toString(), pc.rawAddress.toString(), ppgpos.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strobjBEnumPositionsOnly(pstro: MutPtr<Strobj>, pc: MutPtr<UInt>, ppgpos: MutPtr<MutPtr<Glyphpos>>): Bool =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayStrobjBEnumPositionsOnly(pstro.rawAddress.toString(), pc.rawAddress.toString(), ppgpos.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strobjBGetAdvanceWidths(pso: MutPtr<Strobj>, ifirst: UInt, c: UInt, pptqd: MutPtr<Pointqf>): Bool =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayStrobjBGetAdvanceWidths(pso.rawAddress.toString(), ifirst.toInt(), c.toInt(), pptqd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strobjDwGetCodePage(pstro: MutPtr<Strobj>): UInt =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayStrobjDwGetCodePage(pstro.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strobjVEnumStart(pstro: MutPtr<Strobj>) {
    if (windowsWin32DevicesDisplayNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesDisplayStrobjVEnumStart(pstro.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun saveCurrentMonitorSettings(hmonitor: Handle): Int =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplaySaveCurrentMonitorSettings(hmonitor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saveCurrentSettings(hmonitor: Handle): Int =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplaySaveCurrentSettings(hmonitor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDisplayAutoRotationPreferences(orientation: OrientationPreference): Bool =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplaySetDisplayAutoRotationPreferences(orientation) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDisplayConfig(numpatharrayelements: UInt, patharray: ConstPtr<DisplayconfigPathInfo>, nummodeinfoarrayelements: UInt, modeinfoarray: ConstPtr<DisplayconfigModeInfo>, flags: SetDisplayConfigFlags): Int =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplaySetDisplayConfig(numpatharrayelements.toInt(), patharray.rawAddress.toString(), nummodeinfoarrayelements.toInt(), modeinfoarray.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMonitorBrightness(hmonitor: Handle, dwnewbrightness: UInt): Int =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplaySetMonitorBrightness(hmonitor.rawAddress.toString(), dwnewbrightness.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMonitorColorTemperature(hmonitor: Handle, ctcurrentcolortemperature: McColorTemperature): Int =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplaySetMonitorColorTemperature(hmonitor.rawAddress.toString(), ctcurrentcolortemperature) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMonitorContrast(hmonitor: Handle, dwnewcontrast: UInt): Int =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplaySetMonitorContrast(hmonitor.rawAddress.toString(), dwnewcontrast.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMonitorDisplayAreaPosition(hmonitor: Handle, ptpositiontype: McPositionType, dwnewposition: UInt): Int =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplaySetMonitorDisplayAreaPosition(hmonitor.rawAddress.toString(), ptpositiontype, dwnewposition.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMonitorDisplayAreaSize(hmonitor: Handle, stsizetype: McSizeType, dwnewdisplayareawidthorheight: UInt): Int =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplaySetMonitorDisplayAreaSize(hmonitor.rawAddress.toString(), stsizetype, dwnewdisplayareawidthorheight.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMonitorRedGreenOrBlueDrive(hmonitor: Handle, dtdrivetype: McDriveType, dwnewdrive: UInt): Int =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplaySetMonitorRedGreenOrBlueDrive(hmonitor.rawAddress.toString(), dtdrivetype, dwnewdrive.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMonitorRedGreenOrBlueGain(hmonitor: Handle, gtgaintype: McGainType, dwnewgain: UInt): Int =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplaySetMonitorRedGreenOrBlueGain(hmonitor.rawAddress.toString(), gtgaintype, dwnewgain.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setVCPFeature(hmonitor: Handle, bvcpcode: UByte, dwnewvalue: UInt): Int =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplaySetVCPFeature(hmonitor.rawAddress.toString(), bvcpcode.toInt(), dwnewvalue.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xformobjBApplyXform(pxo: MutPtr<Xformobj>, imode: UInt, cpoints: UInt, pvin: MutPtr<CVoid>, pvout: MutPtr<CVoid>): Bool =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayXformobjBApplyXform(pxo.rawAddress.toString(), imode.toInt(), cpoints.toInt(), pvin.rawAddress.toString(), pvout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xformobjIGetXform(pxo: ConstPtr<Xformobj>, pxform: MutPtr<Xforml>): UInt =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayXformobjIGetXform(pxo.rawAddress.toString(), pxform.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xlateobjCGetPalette(pxlo: MutPtr<Xlateobj>, ipal: UInt, cpal: UInt, ppal: MutPtr<UInt>): UInt =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayXlateobjCGetPalette(pxlo.rawAddress.toString(), ipal.toInt(), cpal.toInt(), ppal.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xlateobjHGetColorTransform(pxlo: MutPtr<Xlateobj>): Handle =
    if (windowsWin32DevicesDisplayNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDisplayXlateobjHGetColorTransform(pxlo.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xlateobjIXlate(pxlo: MutPtr<Xlateobj>, icolor: UInt): UInt =
    if (windowsWin32DevicesDisplayNapiAvailable) wasmWindowssysWindowsWin32DevicesDisplayXlateobjIXlate(pxlo.rawAddress.toString(), icolor.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xlateobjPiVector(pxlo: MutPtr<Xlateobj>): MutPtr<UInt> =
    if (windowsWin32DevicesDisplayNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesDisplayXlateobjPiVector(pxlo.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")
