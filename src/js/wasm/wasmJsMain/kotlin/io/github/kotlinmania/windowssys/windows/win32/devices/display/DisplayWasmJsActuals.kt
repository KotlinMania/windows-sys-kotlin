@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

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

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32DevicesDisplayNapiAddon(): Boolean

private val _windowsWin32DevicesDisplayNapiAvailable: Boolean = _initWindowsWin32DevicesDisplayNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_brushobjHGetColorTransform(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_brushobjHGetColorTransform(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_brushobjPvAllocRbrush(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_display_brushobjPvAllocRbrush(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_brushobjPvGetRbrush(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_brushobjPvGetRbrush(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_brushobjUlGetBrushColor(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_brushobjUlGetBrushColor(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_clipobjBEnum(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_display_clipobjBEnum(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_clipobjCEnumStart(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_display_clipobjCEnumStart(p0: String, p1: Int, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_clipobjPpoGetPath(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_clipobjPpoGetPath(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_capabilitiesRequestAndCapabilitiesReply(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_display_capabilitiesRequestAndCapabilitiesReply(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_degaussMonitor(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_degaussMonitor(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_destroyPhysicalMonitor(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_destroyPhysicalMonitor(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_destroyPhysicalMonitors(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_display_destroyPhysicalMonitors(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_displayConfigGetDeviceInfo(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_displayConfigGetDeviceInfo(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_displayConfigSetDeviceInfo(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_displayConfigSetDeviceInfo(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engAcquireSemaphore(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_engAcquireSemaphore(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engAlphaBlend(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_devices_display_engAlphaBlend(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engAssociateSurface(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_display_engAssociateSurface(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engBitBlt(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun _wasm_windowssys_windows_win32_devices_display_engBitBlt(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String, p10: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engCheckAbort(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_engCheckAbort(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engComputeGlyphSet(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_display_engComputeGlyphSet(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engCopyBits(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_devices_display_engCopyBits(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engCreateClip()")
private external fun _wasm_windowssys_windows_win32_devices_display_engCreateClip(): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engCreatePalette(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_devices_display_engCreatePalette(p0: Int, p1: Int, p2: String, p3: Int, p4: Int, p5: Int): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engCreateSemaphore()")
private external fun _wasm_windowssys_windows_win32_devices_display_engCreateSemaphore(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engDeleteClip(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_engDeleteClip(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engDeletePalette(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_engDeletePalette(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engDeletePath(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_engDeletePath(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engDeleteSemaphore(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_engDeleteSemaphore(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engDeleteSurface(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_engDeleteSurface(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engEraseSurface(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_display_engEraseSurface(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engFillPath(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_devices_display_engFillPath(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engFindResource(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_display_engFindResource(p0: String, p1: Int, p2: Int, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engFreeModule(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_engFreeModule(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engGetCurrentCodePage(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_display_engGetCurrentCodePage(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engGetDriverName(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_engGetDriverName(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engGetPrinterDataFileName(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_engGetPrinterDataFileName(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engGradientFill(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_win32_devices_display_engGradientFill(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: String, p9: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engLineTo(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_devices_display_engLineTo(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: Int, p7: String, p8: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engLoadModule(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_engLoadModule(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engLockSurface(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_engLockSurface(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engMarkBandingSurface(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_engMarkBandingSurface(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engMultiByteToUnicodeN(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_display_engMultiByteToUnicodeN(p0: String, p1: Int, p2: String, p3: String, p4: Int)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engMultiByteToWideChar(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_display_engMultiByteToWideChar(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engPaint(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_display_engPaint(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engPlgBlt(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun _wasm_windowssys_windows_win32_devices_display_engPlgBlt(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String, p10: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engQueryEMFInfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_display_engQueryEMFInfo(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engQueryLocalTime(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_engQueryLocalTime(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engReleaseSemaphore(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_engReleaseSemaphore(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engStretchBlt(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun _wasm_windowssys_windows_win32_devices_display_engStretchBlt(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String, p10: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engStretchBltROP(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)")
private external fun _wasm_windowssys_windows_win32_devices_display_engStretchBltROP(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String, p10: Int, p11: String, p12: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engStrokeAndFillPath(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_win32_devices_display_engStrokeAndFillPath(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: Int, p9: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engStrokePath(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_devices_display_engStrokePath(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engTextOut(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_win32_devices_display_engTextOut(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engTransparentBlt(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_devices_display_engTransparentBlt(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engUnicodeToMultiByteN(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_display_engUnicodeToMultiByteN(p0: String, p1: Int, p2: String, p3: String, p4: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engUnlockSurface(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_engUnlockSurface(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_engWideCharToMultiByte(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_display_engWideCharToMultiByte(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_fontobjCGetAllGlyphHandles(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_display_fontobjCGetAllGlyphHandles(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_fontobjCGetGlyphs(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_display_fontobjCGetGlyphs(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_fontobjPQueryGlyphAttrs(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_display_fontobjPQueryGlyphAttrs(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_fontobjPfdg(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_fontobjPfdg(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_fontobjPifi(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_fontobjPifi(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_fontobjPvTrueTypeFontFile(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_display_fontobjPvTrueTypeFontFile(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_fontobjPxoGetXform(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_fontobjPxoGetXform(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_fontobjVGetInfo(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_display_fontobjVGetInfo(p0: String, p1: Int, p2: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_getAutoRotationState(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_getAutoRotationState(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_getCapabilitiesStringLength(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_display_getCapabilitiesStringLength(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_getDisplayAutoRotationPreferences(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_getDisplayAutoRotationPreferences(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_getDisplayConfigBufferSizes(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_display_getDisplayConfigBufferSizes(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_getMonitorBrightness(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_display_getMonitorBrightness(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_getMonitorCapabilities(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_display_getMonitorCapabilities(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_getMonitorColorTemperature(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_display_getMonitorColorTemperature(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_getMonitorContrast(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_display_getMonitorContrast(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_getMonitorDisplayAreaPosition(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_display_getMonitorDisplayAreaPosition(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_getMonitorDisplayAreaSize(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_display_getMonitorDisplayAreaSize(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_getMonitorRedGreenOrBlueDrive(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_display_getMonitorRedGreenOrBlueDrive(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_getMonitorRedGreenOrBlueGain(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_display_getMonitorRedGreenOrBlueGain(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_getMonitorTechnologyType(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_display_getMonitorTechnologyType(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_getNumberOfPhysicalMonitorsFromHMONITOR(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_display_getNumberOfPhysicalMonitorsFromHMONITOR(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_getPhysicalMonitorsFromHMONITOR(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_display_getPhysicalMonitorsFromHMONITOR(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_getTimingReport(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_display_getTimingReport(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_getVCPFeatureAndVCPFeatureReply(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_display_getVCPFeatureAndVCPFeatureReply(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_htGet8BppformatPalette(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_display_htGet8BppformatPalette(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_htGet8BppmaskPalette(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_devices_display_htGet8BppmaskPalette(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_pathobjBEnum(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_display_pathobjBEnum(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_pathobjBEnumClipLines(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_display_pathobjBEnumClipLines(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_pathobjVEnumStart(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_pathobjVEnumStart(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_pathobjVEnumStartClipLines(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_display_pathobjVEnumStartClipLines(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_pathobjVGetBounds(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_display_pathobjVGetBounds(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_queryDisplayConfig(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_devices_display_queryDisplayConfig(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_restoreMonitorFactoryColorDefaults(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_restoreMonitorFactoryColorDefaults(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_restoreMonitorFactoryDefaults(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_restoreMonitorFactoryDefaults(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_strobjBEnum(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_display_strobjBEnum(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_strobjBEnumPositionsOnly(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_display_strobjBEnumPositionsOnly(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_strobjBGetAdvanceWidths(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_display_strobjBGetAdvanceWidths(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_strobjDwGetCodePage(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_strobjDwGetCodePage(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_strobjVEnumStart(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_strobjVEnumStart(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_saveCurrentMonitorSettings(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_saveCurrentMonitorSettings(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_saveCurrentSettings(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_saveCurrentSettings(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_setDisplayAutoRotationPreferences(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_setDisplayAutoRotationPreferences(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_setDisplayConfig(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_display_setDisplayConfig(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_setMonitorBrightness(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_display_setMonitorBrightness(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_setMonitorColorTemperature(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_display_setMonitorColorTemperature(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_setMonitorContrast(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_display_setMonitorContrast(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_setMonitorDisplayAreaPosition(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_display_setMonitorDisplayAreaPosition(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_setMonitorDisplayAreaSize(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_display_setMonitorDisplayAreaSize(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_setMonitorRedGreenOrBlueDrive(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_display_setMonitorRedGreenOrBlueDrive(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_setMonitorRedGreenOrBlueGain(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_display_setMonitorRedGreenOrBlueGain(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_setVCPFeature(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_display_setVCPFeature(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_xformobjBApplyXform(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_display_xformobjBApplyXform(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_xformobjIGetXform(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_display_xformobjIGetXform(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_xlateobjCGetPalette(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_display_xlateobjCGetPalette(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_xlateobjHGetColorTransform(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_xlateobjHGetColorTransform(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_xlateobjIXlate(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_display_xlateobjIXlate(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_display_xlateobjPiVector(p0)")
private external fun _wasm_windowssys_windows_win32_devices_display_xlateobjPiVector(p0: String): String

public actual fun brushobjHGetColorTransform(pbo: COpaquePointer?): Handle =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_brushobjHGetColorTransform((pbo?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun brushobjPvAllocRbrush(pbo: COpaquePointer?, cj: UInt): COpaquePointer? =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_brushobjPvAllocRbrush((pbo?.value ?: 0L).toString(), cj.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun brushobjPvGetRbrush(pbo: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_brushobjPvGetRbrush((pbo?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun brushobjUlGetBrushColor(pbo: COpaquePointer?): UInt =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_brushobjUlGetBrushColor((pbo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clipobjBEnum(pco: COpaquePointer?, cj: UInt, pul: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_clipobjBEnum((pco?.value ?: 0L).toString(), cj.toInt(), (pul?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clipobjCEnumStart(pco: COpaquePointer?, ball: Bool, itype: UInt, idirection: UInt, climit: UInt): UInt =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_clipobjCEnumStart((pco?.value ?: 0L).toString(), ball, itype.toInt(), idirection.toInt(), climit.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clipobjPpoGetPath(pco: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_clipobjPpoGetPath((pco?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capabilitiesRequestAndCapabilitiesReply(hmonitor: Handle, pszasciicapabilitiesstring: Pstr, dwcapabilitiesstringlengthincharacters: UInt): Int =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_capabilitiesRequestAndCapabilitiesReply((hmonitor?.value ?: 0L).toString(), (pszasciicapabilitiesstring?.value ?: 0L).toString(), dwcapabilitiesstringlengthincharacters.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun degaussMonitor(hmonitor: Handle): Int =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_degaussMonitor((hmonitor?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyPhysicalMonitor(hmonitor: Handle): Bool =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_destroyPhysicalMonitor((hmonitor?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyPhysicalMonitors(dwphysicalmonitorarraysize: UInt, pphysicalmonitorarray: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_destroyPhysicalMonitors(dwphysicalmonitorarraysize.toInt(), (pphysicalmonitorarray?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun displayConfigGetDeviceInfo(requestpacket: COpaquePointer?): Int =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_displayConfigGetDeviceInfo((requestpacket?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun displayConfigSetDeviceInfo(setpacket: COpaquePointer?): Int =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_displayConfigSetDeviceInfo((setpacket?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engAcquireSemaphore(hsem: Hsemaphore) {
    if (_windowsWin32DevicesDisplayNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_display_engAcquireSemaphore((hsem?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun engAlphaBlend(psodest: COpaquePointer?, psosrc: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, prcldest: COpaquePointer?, prclsrc: COpaquePointer?, pblendobj: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_engAlphaBlend((psodest?.value ?: 0L).toString(), (psosrc?.value ?: 0L).toString(), (pco?.value ?: 0L).toString(), (pxlo?.value ?: 0L).toString(), (prcldest?.value ?: 0L).toString(), (prclsrc?.value ?: 0L).toString(), (pblendobj?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engAssociateSurface(hsurf: Hsurf, hdev: Hdev, flhooks: UInt): Bool =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_engAssociateSurface((hsurf?.value ?: 0L).toString(), (hdev?.value ?: 0L).toString(), flhooks.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engBitBlt(psotrg: COpaquePointer?, psosrc: COpaquePointer?, psomask: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, prcltrg: COpaquePointer?, pptlsrc: COpaquePointer?, pptlmask: COpaquePointer?, pbo: COpaquePointer?, pptlbrush: COpaquePointer?, rop4: UInt): Bool =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_engBitBlt((psotrg?.value ?: 0L).toString(), (psosrc?.value ?: 0L).toString(), (psomask?.value ?: 0L).toString(), (pco?.value ?: 0L).toString(), (pxlo?.value ?: 0L).toString(), (prcltrg?.value ?: 0L).toString(), (pptlsrc?.value ?: 0L).toString(), (pptlmask?.value ?: 0L).toString(), (pbo?.value ?: 0L).toString(), (pptlbrush?.value ?: 0L).toString(), rop4.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engCheckAbort(pso: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_engCheckAbort((pso?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engComputeGlyphSet(ncodepage: Int, nfirstchar: Int, cchars: Int): COpaquePointer? =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_engComputeGlyphSet(ncodepage, nfirstchar, cchars).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engCopyBits(psodest: COpaquePointer?, psosrc: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, prcldest: COpaquePointer?, pptlsrc: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_engCopyBits((psodest?.value ?: 0L).toString(), (psosrc?.value ?: 0L).toString(), (pco?.value ?: 0L).toString(), (pxlo?.value ?: 0L).toString(), (prcldest?.value ?: 0L).toString(), (pptlsrc?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engCreateBitmap(sizl: Size, lwidth: Int, iformat: UInt, fl: UInt, pvbits: COpaquePointer?): Hbitmap =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engCreateClip(): COpaquePointer? =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_engCreateClip().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engCreateDeviceBitmap(dhsurf: Dhsurf, sizl: Size, iformatcompat: UInt): Hbitmap =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engCreateDeviceSurface(dhsurf: Dhsurf, sizl: Size, iformatcompat: UInt): Hsurf =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engCreatePalette(imode: UInt, ccolors: UInt, pulcolors: COpaquePointer?, flred: UInt, flgreen: UInt, flblue: UInt): Hpalette =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_engCreatePalette(imode.toInt(), ccolors.toInt(), (pulcolors?.value ?: 0L).toString(), flred.toInt(), flgreen.toInt(), flblue.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engCreateSemaphore(): Hsemaphore =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_engCreateSemaphore().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engDeleteClip(pco: COpaquePointer?) {
    if (_windowsWin32DevicesDisplayNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_display_engDeleteClip((pco?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun engDeletePalette(hpal: Hpalette): Bool =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_engDeletePalette((hpal?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engDeletePath(ppo: COpaquePointer?) {
    if (_windowsWin32DevicesDisplayNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_display_engDeletePath((ppo?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun engDeleteSemaphore(hsem: Hsemaphore) {
    if (_windowsWin32DevicesDisplayNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_display_engDeleteSemaphore((hsem?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun engDeleteSurface(hsurf: Hsurf): Bool =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_engDeleteSurface((hsurf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engEraseSurface(pso: COpaquePointer?, prcl: COpaquePointer?, icolor: UInt): Bool =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_engEraseSurface((pso?.value ?: 0L).toString(), (prcl?.value ?: 0L).toString(), icolor.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engFillPath(pso: COpaquePointer?, ppo: COpaquePointer?, pco: COpaquePointer?, pbo: COpaquePointer?, pptlbrushorg: COpaquePointer?, mix: UInt, floptions: UInt): Bool =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_engFillPath((pso?.value ?: 0L).toString(), (ppo?.value ?: 0L).toString(), (pco?.value ?: 0L).toString(), (pbo?.value ?: 0L).toString(), (pptlbrushorg?.value ?: 0L).toString(), mix.toInt(), floptions.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engFindResource(h: Handle, iname: Int, itype: Int, pulsize: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_engFindResource((h?.value ?: 0L).toString(), iname, itype, (pulsize?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engFreeModule(h: Handle) {
    if (_windowsWin32DevicesDisplayNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_display_engFreeModule((h?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun engGetCurrentCodePage(oemcodepage: COpaquePointer?, ansicodepage: COpaquePointer?) {
    if (_windowsWin32DevicesDisplayNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_display_engGetCurrentCodePage((oemcodepage?.value ?: 0L).toString(), (ansicodepage?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun engGetDriverName(hdev: Hdev): Pwstr =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_engGetDriverName((hdev?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engGetPrinterDataFileName(hdev: Hdev): Pwstr =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_engGetPrinterDataFileName((hdev?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engGradientFill(psodest: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, pvertex: COpaquePointer?, nvertex: UInt, pmesh: COpaquePointer?, nmesh: UInt, prclextents: COpaquePointer?, pptlditherorg: COpaquePointer?, ulmode: UInt): Bool =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_engGradientFill((psodest?.value ?: 0L).toString(), (pco?.value ?: 0L).toString(), (pxlo?.value ?: 0L).toString(), (pvertex?.value ?: 0L).toString(), nvertex.toInt(), (pmesh?.value ?: 0L).toString(), nmesh.toInt(), (prclextents?.value ?: 0L).toString(), (pptlditherorg?.value ?: 0L).toString(), ulmode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engLineTo(pso: COpaquePointer?, pco: COpaquePointer?, pbo: COpaquePointer?, x1: Int, y1: Int, x2: Int, y2: Int, prclbounds: COpaquePointer?, mix: UInt): Bool =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_engLineTo((pso?.value ?: 0L).toString(), (pco?.value ?: 0L).toString(), (pbo?.value ?: 0L).toString(), x1, y1, x2, y2, (prclbounds?.value ?: 0L).toString(), mix.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engLoadModule(pwsz: Pcwstr): Handle =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_engLoadModule((pwsz?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engLockSurface(hsurf: Hsurf): COpaquePointer? =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_engLockSurface((hsurf?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engMarkBandingSurface(hsurf: Hsurf): Bool =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_engMarkBandingSurface((hsurf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engMultiByteToUnicodeN(unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: COpaquePointer?, multibytestring: Pcstr, bytesinmultibytestring: UInt) {
    if (_windowsWin32DevicesDisplayNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_display_engMultiByteToUnicodeN((unicodestring?.value ?: 0L).toString(), maxbytesinunicodestring.toInt(), (bytesinunicodestring?.value ?: 0L).toString(), (multibytestring?.value ?: 0L).toString(), bytesinmultibytestring.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun engMultiByteToWideChar(codepage: UInt, widecharstring: Pwstr, bytesinwidecharstring: Int, multibytestring: Pcstr, bytesinmultibytestring: Int): Int =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_engMultiByteToWideChar(codepage.toInt(), (widecharstring?.value ?: 0L).toString(), bytesinwidecharstring, (multibytestring?.value ?: 0L).toString(), bytesinmultibytestring) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engPaint(pso: COpaquePointer?, pco: COpaquePointer?, pbo: COpaquePointer?, pptlbrushorg: COpaquePointer?, mix: UInt): Bool =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_engPaint((pso?.value ?: 0L).toString(), (pco?.value ?: 0L).toString(), (pbo?.value ?: 0L).toString(), (pptlbrushorg?.value ?: 0L).toString(), mix.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engPlgBlt(psotrg: COpaquePointer?, psosrc: COpaquePointer?, psomsk: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, pca: COpaquePointer?, pptlbrushorg: COpaquePointer?, pptfx: COpaquePointer?, prcl: COpaquePointer?, pptl: COpaquePointer?, imode: UInt): Bool =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_engPlgBlt((psotrg?.value ?: 0L).toString(), (psosrc?.value ?: 0L).toString(), (psomsk?.value ?: 0L).toString(), (pco?.value ?: 0L).toString(), (pxlo?.value ?: 0L).toString(), (pca?.value ?: 0L).toString(), (pptlbrushorg?.value ?: 0L).toString(), (pptfx?.value ?: 0L).toString(), (prcl?.value ?: 0L).toString(), (pptl?.value ?: 0L).toString(), imode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engQueryEMFInfo(hdev: Hdev, pemfinfo: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_engQueryEMFInfo((hdev?.value ?: 0L).toString(), (pemfinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engQueryLocalTime(param0: COpaquePointer?) {
    if (_windowsWin32DevicesDisplayNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_display_engQueryLocalTime((param0?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun engReleaseSemaphore(hsem: Hsemaphore) {
    if (_windowsWin32DevicesDisplayNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_display_engReleaseSemaphore((hsem?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun engStretchBlt(psodest: COpaquePointer?, psosrc: COpaquePointer?, psomask: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, pca: COpaquePointer?, pptlhtorg: COpaquePointer?, prcldest: COpaquePointer?, prclsrc: COpaquePointer?, pptlmask: COpaquePointer?, imode: UInt): Bool =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_engStretchBlt((psodest?.value ?: 0L).toString(), (psosrc?.value ?: 0L).toString(), (psomask?.value ?: 0L).toString(), (pco?.value ?: 0L).toString(), (pxlo?.value ?: 0L).toString(), (pca?.value ?: 0L).toString(), (pptlhtorg?.value ?: 0L).toString(), (prcldest?.value ?: 0L).toString(), (prclsrc?.value ?: 0L).toString(), (pptlmask?.value ?: 0L).toString(), imode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engStretchBltROP(psodest: COpaquePointer?, psosrc: COpaquePointer?, psomask: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, pca: COpaquePointer?, pptlhtorg: COpaquePointer?, prcldest: COpaquePointer?, prclsrc: COpaquePointer?, pptlmask: COpaquePointer?, imode: UInt, pbo: COpaquePointer?, rop4: UInt): Bool =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_engStretchBltROP((psodest?.value ?: 0L).toString(), (psosrc?.value ?: 0L).toString(), (psomask?.value ?: 0L).toString(), (pco?.value ?: 0L).toString(), (pxlo?.value ?: 0L).toString(), (pca?.value ?: 0L).toString(), (pptlhtorg?.value ?: 0L).toString(), (prcldest?.value ?: 0L).toString(), (prclsrc?.value ?: 0L).toString(), (pptlmask?.value ?: 0L).toString(), imode.toInt(), (pbo?.value ?: 0L).toString(), rop4.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engStrokeAndFillPath(pso: COpaquePointer?, ppo: COpaquePointer?, pco: COpaquePointer?, pxo: COpaquePointer?, pbostroke: COpaquePointer?, plineattrs: COpaquePointer?, pbofill: COpaquePointer?, pptlbrushorg: COpaquePointer?, mixfill: UInt, floptions: UInt): Bool =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_engStrokeAndFillPath((pso?.value ?: 0L).toString(), (ppo?.value ?: 0L).toString(), (pco?.value ?: 0L).toString(), (pxo?.value ?: 0L).toString(), (pbostroke?.value ?: 0L).toString(), (plineattrs?.value ?: 0L).toString(), (pbofill?.value ?: 0L).toString(), (pptlbrushorg?.value ?: 0L).toString(), mixfill.toInt(), floptions.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engStrokePath(pso: COpaquePointer?, ppo: COpaquePointer?, pco: COpaquePointer?, pxo: COpaquePointer?, pbo: COpaquePointer?, pptlbrushorg: COpaquePointer?, plineattrs: COpaquePointer?, mix: UInt): Bool =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_engStrokePath((pso?.value ?: 0L).toString(), (ppo?.value ?: 0L).toString(), (pco?.value ?: 0L).toString(), (pxo?.value ?: 0L).toString(), (pbo?.value ?: 0L).toString(), (pptlbrushorg?.value ?: 0L).toString(), (plineattrs?.value ?: 0L).toString(), mix.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engTextOut(pso: COpaquePointer?, pstro: COpaquePointer?, pfo: COpaquePointer?, pco: COpaquePointer?, prclextra: COpaquePointer?, prclopaque: COpaquePointer?, pbofore: COpaquePointer?, pboopaque: COpaquePointer?, pptlorg: COpaquePointer?, mix: UInt): Bool =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_engTextOut((pso?.value ?: 0L).toString(), (pstro?.value ?: 0L).toString(), (pfo?.value ?: 0L).toString(), (pco?.value ?: 0L).toString(), (prclextra?.value ?: 0L).toString(), (prclopaque?.value ?: 0L).toString(), (pbofore?.value ?: 0L).toString(), (pboopaque?.value ?: 0L).toString(), (pptlorg?.value ?: 0L).toString(), mix.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engTransparentBlt(psodst: COpaquePointer?, psosrc: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, prcldst: COpaquePointer?, prclsrc: COpaquePointer?, transcolor: UInt, bcalledfrombitblt: UInt): Bool =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_engTransparentBlt((psodst?.value ?: 0L).toString(), (psosrc?.value ?: 0L).toString(), (pco?.value ?: 0L).toString(), (pxlo?.value ?: 0L).toString(), (prcldst?.value ?: 0L).toString(), (prclsrc?.value ?: 0L).toString(), transcolor.toInt(), bcalledfrombitblt.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun engUnicodeToMultiByteN(multibytestring: Pstr, maxbytesinmultibytestring: UInt, bytesinmultibytestring: COpaquePointer?, unicodestring: Pcwstr, bytesinunicodestring: UInt) {
    if (_windowsWin32DevicesDisplayNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_display_engUnicodeToMultiByteN((multibytestring?.value ?: 0L).toString(), maxbytesinmultibytestring.toInt(), (bytesinmultibytestring?.value ?: 0L).toString(), (unicodestring?.value ?: 0L).toString(), bytesinunicodestring.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun engUnlockSurface(pso: COpaquePointer?) {
    if (_windowsWin32DevicesDisplayNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_display_engUnlockSurface((pso?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun engWideCharToMultiByte(codepage: UInt, widecharstring: Pcwstr, bytesinwidecharstring: Int, multibytestring: Pstr, bytesinmultibytestring: Int): Int =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_engWideCharToMultiByte(codepage.toInt(), (widecharstring?.value ?: 0L).toString(), bytesinwidecharstring, (multibytestring?.value ?: 0L).toString(), bytesinmultibytestring) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fontobjCGetAllGlyphHandles(pfo: COpaquePointer?, phg: COpaquePointer?): UInt =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_fontobjCGetAllGlyphHandles((pfo?.value ?: 0L).toString(), (phg?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fontobjCGetGlyphs(pfo: COpaquePointer?, imode: UInt, cglyph: UInt, phg: COpaquePointer?, ppvglyph: COpaquePointer?): UInt =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_fontobjCGetGlyphs((pfo?.value ?: 0L).toString(), imode.toInt(), cglyph.toInt(), (phg?.value ?: 0L).toString(), (ppvglyph?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fontobjPQueryGlyphAttrs(pfo: COpaquePointer?, imode: UInt): COpaquePointer? =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_fontobjPQueryGlyphAttrs((pfo?.value ?: 0L).toString(), imode.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fontobjPfdg(pfo: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_fontobjPfdg((pfo?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fontobjPifi(pfo: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_fontobjPifi((pfo?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fontobjPvTrueTypeFontFile(pfo: COpaquePointer?, pcjfile: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_fontobjPvTrueTypeFontFile((pfo?.value ?: 0L).toString(), (pcjfile?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fontobjPxoGetXform(pfo: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_fontobjPxoGetXform((pfo?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fontobjVGetInfo(pfo: COpaquePointer?, cjsize: UInt, pfi: COpaquePointer?) {
    if (_windowsWin32DevicesDisplayNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_display_fontobjVGetInfo((pfo?.value ?: 0L).toString(), cjsize.toInt(), (pfi?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getAutoRotationState(pstate: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_getAutoRotationState((pstate?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCapabilitiesStringLength(hmonitor: Handle, pdwcapabilitiesstringlengthincharacters: COpaquePointer?): Int =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_getCapabilitiesStringLength((hmonitor?.value ?: 0L).toString(), (pdwcapabilitiesstringlengthincharacters?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDisplayAutoRotationPreferences(porientation: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_getDisplayAutoRotationPreferences((porientation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDisplayConfigBufferSizes(flags: QueryDisplayConfigFlags, numpatharrayelements: COpaquePointer?, nummodeinfoarrayelements: COpaquePointer?): Win32Error =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_getDisplayConfigBufferSizes(flags.toInt(), (numpatharrayelements?.value ?: 0L).toString(), (nummodeinfoarrayelements?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMonitorBrightness(hmonitor: Handle, pdwminimumbrightness: COpaquePointer?, pdwcurrentbrightness: COpaquePointer?, pdwmaximumbrightness: COpaquePointer?): Int =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_getMonitorBrightness((hmonitor?.value ?: 0L).toString(), (pdwminimumbrightness?.value ?: 0L).toString(), (pdwcurrentbrightness?.value ?: 0L).toString(), (pdwmaximumbrightness?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMonitorCapabilities(hmonitor: Handle, pdwmonitorcapabilities: COpaquePointer?, pdwsupportedcolortemperatures: COpaquePointer?): Int =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_getMonitorCapabilities((hmonitor?.value ?: 0L).toString(), (pdwmonitorcapabilities?.value ?: 0L).toString(), (pdwsupportedcolortemperatures?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMonitorColorTemperature(hmonitor: Handle, pctcurrentcolortemperature: COpaquePointer?): Int =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_getMonitorColorTemperature((hmonitor?.value ?: 0L).toString(), (pctcurrentcolortemperature?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMonitorContrast(hmonitor: Handle, pdwminimumcontrast: COpaquePointer?, pdwcurrentcontrast: COpaquePointer?, pdwmaximumcontrast: COpaquePointer?): Int =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_getMonitorContrast((hmonitor?.value ?: 0L).toString(), (pdwminimumcontrast?.value ?: 0L).toString(), (pdwcurrentcontrast?.value ?: 0L).toString(), (pdwmaximumcontrast?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMonitorDisplayAreaPosition(hmonitor: Handle, ptpositiontype: McPositionType, pdwminimumposition: COpaquePointer?, pdwcurrentposition: COpaquePointer?, pdwmaximumposition: COpaquePointer?): Int =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_getMonitorDisplayAreaPosition((hmonitor?.value ?: 0L).toString(), ptpositiontype, (pdwminimumposition?.value ?: 0L).toString(), (pdwcurrentposition?.value ?: 0L).toString(), (pdwmaximumposition?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMonitorDisplayAreaSize(hmonitor: Handle, stsizetype: McSizeType, pdwminimumwidthorheight: COpaquePointer?, pdwcurrentwidthorheight: COpaquePointer?, pdwmaximumwidthorheight: COpaquePointer?): Int =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_getMonitorDisplayAreaSize((hmonitor?.value ?: 0L).toString(), stsizetype, (pdwminimumwidthorheight?.value ?: 0L).toString(), (pdwcurrentwidthorheight?.value ?: 0L).toString(), (pdwmaximumwidthorheight?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMonitorRedGreenOrBlueDrive(hmonitor: Handle, dtdrivetype: McDriveType, pdwminimumdrive: COpaquePointer?, pdwcurrentdrive: COpaquePointer?, pdwmaximumdrive: COpaquePointer?): Int =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_getMonitorRedGreenOrBlueDrive((hmonitor?.value ?: 0L).toString(), dtdrivetype, (pdwminimumdrive?.value ?: 0L).toString(), (pdwcurrentdrive?.value ?: 0L).toString(), (pdwmaximumdrive?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMonitorRedGreenOrBlueGain(hmonitor: Handle, gtgaintype: McGainType, pdwminimumgain: COpaquePointer?, pdwcurrentgain: COpaquePointer?, pdwmaximumgain: COpaquePointer?): Int =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_getMonitorRedGreenOrBlueGain((hmonitor?.value ?: 0L).toString(), gtgaintype, (pdwminimumgain?.value ?: 0L).toString(), (pdwcurrentgain?.value ?: 0L).toString(), (pdwmaximumgain?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMonitorTechnologyType(hmonitor: Handle, pdtydisplaytechnologytype: COpaquePointer?): Int =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_getMonitorTechnologyType((hmonitor?.value ?: 0L).toString(), (pdtydisplaytechnologytype?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumberOfPhysicalMonitorsFromHMONITOR(hmonitor: Hmonitor, pdwnumberofphysicalmonitors: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_getNumberOfPhysicalMonitorsFromHMONITOR((hmonitor?.value ?: 0L).toString(), (pdwnumberofphysicalmonitors?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPhysicalMonitorsFromHMONITOR(hmonitor: Hmonitor, dwphysicalmonitorarraysize: UInt, pphysicalmonitorarray: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_getPhysicalMonitorsFromHMONITOR((hmonitor?.value ?: 0L).toString(), dwphysicalmonitorarraysize.toInt(), (pphysicalmonitorarray?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTimingReport(hmonitor: Handle, pmtrmonitortimingreport: COpaquePointer?): Int =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_getTimingReport((hmonitor?.value ?: 0L).toString(), (pmtrmonitortimingreport?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVCPFeatureAndVCPFeatureReply(hmonitor: Handle, bvcpcode: UByte, pvct: COpaquePointer?, pdwcurrentvalue: COpaquePointer?, pdwmaximumvalue: COpaquePointer?): Int =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_getVCPFeatureAndVCPFeatureReply((hmonitor?.value ?: 0L).toString(), bvcpcode.toInt(), (pvct?.value ?: 0L).toString(), (pdwcurrentvalue?.value ?: 0L).toString(), (pdwmaximumvalue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun htGet8BppformatPalette(ppaletteentry: COpaquePointer?, redgamma: UShort, greengamma: UShort, bluegamma: UShort): Int =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_htGet8BppformatPalette((ppaletteentry?.value ?: 0L).toString(), redgamma.toInt(), greengamma.toInt(), bluegamma.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun htGet8BppmaskPalette(ppaletteentry: COpaquePointer?, use8bppmaskpal: Bool, cmymask: UByte, redgamma: UShort, greengamma: UShort, bluegamma: UShort): Int =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_htGet8BppmaskPalette((ppaletteentry?.value ?: 0L).toString(), use8bppmaskpal, cmymask.toInt(), redgamma.toInt(), greengamma.toInt(), bluegamma.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathobjBEnum(ppo: COpaquePointer?, ppd: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_pathobjBEnum((ppo?.value ?: 0L).toString(), (ppd?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathobjBEnumClipLines(ppo: COpaquePointer?, cb: UInt, pcl: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_pathobjBEnumClipLines((ppo?.value ?: 0L).toString(), cb.toInt(), (pcl?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathobjVEnumStart(ppo: COpaquePointer?) {
    if (_windowsWin32DevicesDisplayNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_display_pathobjVEnumStart((ppo?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathobjVEnumStartClipLines(ppo: COpaquePointer?, pco: COpaquePointer?, pso: COpaquePointer?, pla: COpaquePointer?) {
    if (_windowsWin32DevicesDisplayNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_display_pathobjVEnumStartClipLines((ppo?.value ?: 0L).toString(), (pco?.value ?: 0L).toString(), (pso?.value ?: 0L).toString(), (pla?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathobjVGetBounds(ppo: COpaquePointer?, prectfx: COpaquePointer?) {
    if (_windowsWin32DevicesDisplayNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_display_pathobjVGetBounds((ppo?.value ?: 0L).toString(), (prectfx?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun queryDisplayConfig(flags: QueryDisplayConfigFlags, numpatharrayelements: COpaquePointer?, patharray: COpaquePointer?, nummodeinfoarrayelements: COpaquePointer?, modeinfoarray: COpaquePointer?, currenttopologyid: COpaquePointer?): Win32Error =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_queryDisplayConfig(flags.toInt(), (numpatharrayelements?.value ?: 0L).toString(), (patharray?.value ?: 0L).toString(), (nummodeinfoarrayelements?.value ?: 0L).toString(), (modeinfoarray?.value ?: 0L).toString(), (currenttopologyid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun restoreMonitorFactoryColorDefaults(hmonitor: Handle): Int =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_restoreMonitorFactoryColorDefaults((hmonitor?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun restoreMonitorFactoryDefaults(hmonitor: Handle): Int =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_restoreMonitorFactoryDefaults((hmonitor?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strobjBEnum(pstro: COpaquePointer?, pc: COpaquePointer?, ppgpos: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_strobjBEnum((pstro?.value ?: 0L).toString(), (pc?.value ?: 0L).toString(), (ppgpos?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strobjBEnumPositionsOnly(pstro: COpaquePointer?, pc: COpaquePointer?, ppgpos: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_strobjBEnumPositionsOnly((pstro?.value ?: 0L).toString(), (pc?.value ?: 0L).toString(), (ppgpos?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strobjBGetAdvanceWidths(pso: COpaquePointer?, ifirst: UInt, c: UInt, pptqd: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_strobjBGetAdvanceWidths((pso?.value ?: 0L).toString(), ifirst.toInt(), c.toInt(), (pptqd?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strobjDwGetCodePage(pstro: COpaquePointer?): UInt =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_strobjDwGetCodePage((pstro?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strobjVEnumStart(pstro: COpaquePointer?) {
    if (_windowsWin32DevicesDisplayNapiAvailable) {
        _wasm_windowssys_windows_win32_devices_display_strobjVEnumStart((pstro?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun saveCurrentMonitorSettings(hmonitor: Handle): Int =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_saveCurrentMonitorSettings((hmonitor?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saveCurrentSettings(hmonitor: Handle): Int =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_saveCurrentSettings((hmonitor?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDisplayAutoRotationPreferences(orientation: OrientationPreference): Bool =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_setDisplayAutoRotationPreferences(orientation) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDisplayConfig(numpatharrayelements: UInt, patharray: COpaquePointer?, nummodeinfoarrayelements: UInt, modeinfoarray: COpaquePointer?, flags: SetDisplayConfigFlags): Int =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_setDisplayConfig(numpatharrayelements.toInt(), (patharray?.value ?: 0L).toString(), nummodeinfoarrayelements.toInt(), (modeinfoarray?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMonitorBrightness(hmonitor: Handle, dwnewbrightness: UInt): Int =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_setMonitorBrightness((hmonitor?.value ?: 0L).toString(), dwnewbrightness.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMonitorColorTemperature(hmonitor: Handle, ctcurrentcolortemperature: McColorTemperature): Int =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_setMonitorColorTemperature((hmonitor?.value ?: 0L).toString(), ctcurrentcolortemperature) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMonitorContrast(hmonitor: Handle, dwnewcontrast: UInt): Int =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_setMonitorContrast((hmonitor?.value ?: 0L).toString(), dwnewcontrast.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMonitorDisplayAreaPosition(hmonitor: Handle, ptpositiontype: McPositionType, dwnewposition: UInt): Int =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_setMonitorDisplayAreaPosition((hmonitor?.value ?: 0L).toString(), ptpositiontype, dwnewposition.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMonitorDisplayAreaSize(hmonitor: Handle, stsizetype: McSizeType, dwnewdisplayareawidthorheight: UInt): Int =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_setMonitorDisplayAreaSize((hmonitor?.value ?: 0L).toString(), stsizetype, dwnewdisplayareawidthorheight.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMonitorRedGreenOrBlueDrive(hmonitor: Handle, dtdrivetype: McDriveType, dwnewdrive: UInt): Int =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_setMonitorRedGreenOrBlueDrive((hmonitor?.value ?: 0L).toString(), dtdrivetype, dwnewdrive.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMonitorRedGreenOrBlueGain(hmonitor: Handle, gtgaintype: McGainType, dwnewgain: UInt): Int =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_setMonitorRedGreenOrBlueGain((hmonitor?.value ?: 0L).toString(), gtgaintype, dwnewgain.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setVCPFeature(hmonitor: Handle, bvcpcode: UByte, dwnewvalue: UInt): Int =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_setVCPFeature((hmonitor?.value ?: 0L).toString(), bvcpcode.toInt(), dwnewvalue.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xformobjBApplyXform(pxo: COpaquePointer?, imode: UInt, cpoints: UInt, pvin: COpaquePointer?, pvout: COpaquePointer?): Bool =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_xformobjBApplyXform((pxo?.value ?: 0L).toString(), imode.toInt(), cpoints.toInt(), (pvin?.value ?: 0L).toString(), (pvout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xformobjIGetXform(pxo: COpaquePointer?, pxform: COpaquePointer?): UInt =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_xformobjIGetXform((pxo?.value ?: 0L).toString(), (pxform?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xlateobjCGetPalette(pxlo: COpaquePointer?, ipal: UInt, cpal: UInt, ppal: COpaquePointer?): UInt =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_xlateobjCGetPalette((pxlo?.value ?: 0L).toString(), ipal.toInt(), cpal.toInt(), (ppal?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xlateobjHGetColorTransform(pxlo: COpaquePointer?): Handle =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_xlateobjHGetColorTransform((pxlo?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xlateobjIXlate(pxlo: COpaquePointer?, icolor: UInt): UInt =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_xlateobjIXlate((pxlo?.value ?: 0L).toString(), icolor.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun xlateobjPiVector(pxlo: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32DevicesDisplayNapiAvailable) _wasm_windowssys_windows_win32_devices_display_xlateobjPiVector((pxlo?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")
