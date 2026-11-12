@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.gdi

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Colorref
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hglobal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.foundation.Size
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32GraphicsGdiNapiAddon(): Boolean

private val windowsWin32GraphicsGdiNapiAvailable: Boolean = initWindowsWin32GraphicsGdiNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiAbortPath(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiAbortPath(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiAddFontMemResourceEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiAddFontMemResourceEx(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiAddFontResourceA(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiAddFontResourceA(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiAddFontResourceExA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiAddFontResourceExA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiAddFontResourceExW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiAddFontResourceExW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiAddFontResourceW(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiAddFontResourceW(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiAngleArc(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiAngleArc(p0: String, p1: Int, p2: Int, p3: Int, p4: Double, p5: Double): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiAnimatePalette(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiAnimatePalette(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiArc(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiArc(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiArcTo(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiArcTo(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiBeginPaint(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiBeginPaint(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiBeginPath(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiBeginPath(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiBitBlt(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiBitBlt(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String, p6: Int, p7: Int, p8: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCancelDC(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCancelDC(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiChangeDisplaySettingsA(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiChangeDisplaySettingsA(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiChangeDisplaySettingsExA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiChangeDisplaySettingsExA(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiChangeDisplaySettingsExW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiChangeDisplaySettingsExW(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiChangeDisplaySettingsW(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiChangeDisplaySettingsW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiChord(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiChord(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiClientToScreen(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiClientToScreen(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCloseEnhMetaFile(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCloseEnhMetaFile(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCloseFigure(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCloseFigure(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCloseMetaFile(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCloseMetaFile(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCombineRgn(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCombineRgn(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCombineTransform(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCombineTransform(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCopyEnhMetaFileA(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCopyEnhMetaFileA(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCopyEnhMetaFileW(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCopyEnhMetaFileW(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCopyMetaFileA(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCopyMetaFileA(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCopyMetaFileW(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCopyMetaFileW(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCopyRect(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCopyRect(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreateBitmap(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreateBitmap(p0: Int, p1: Int, p2: Int, p3: Int, p4: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreateBitmapIndirect(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreateBitmapIndirect(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreateBrushIndirect(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreateBrushIndirect(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreateCompatibleBitmap(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreateCompatibleBitmap(p0: String, p1: Int, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreateCompatibleDC(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreateCompatibleDC(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreateDCA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreateDCA(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreateDCW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreateDCW(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreateDIBPatternBrush(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreateDIBPatternBrush(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreateDIBPatternBrushPt(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreateDIBPatternBrushPt(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreateDIBSection(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreateDIBSection(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreateDIBitmap(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreateDIBitmap(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreateDiscardableBitmap(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreateDiscardableBitmap(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreateEllipticRgn(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreateEllipticRgn(p0: Int, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreateEllipticRgnIndirect(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreateEllipticRgnIndirect(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreateEnhMetaFileA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreateEnhMetaFileA(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreateEnhMetaFileW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreateEnhMetaFileW(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreateFontA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreateFontA(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: Int, p9: Int, p10: Int, p11: Int, p12: Int, p13: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreateFontIndirectA(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreateFontIndirectA(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreateFontIndirectExA(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreateFontIndirectExA(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreateFontIndirectExW(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreateFontIndirectExW(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreateFontIndirectW(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreateFontIndirectW(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreateFontPackage(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreateFontPackage(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: Int, p7: Int, p8: Int, p9: Int, p10: Int, p11: String, p12: Int, p13: String, p14: String, p15: String, p16: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreateFontW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreateFontW(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: Int, p9: Int, p10: Int, p11: Int, p12: Int, p13: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreateHalftonePalette(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreateHalftonePalette(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreateHatchBrush(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreateHatchBrush(p0: Int, p1: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreateICA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreateICA(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreateICW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreateICW(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreateMetaFileA(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreateMetaFileA(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreateMetaFileW(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreateMetaFileW(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreatePalette(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreatePalette(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreatePatternBrush(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreatePatternBrush(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreatePen(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreatePen(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreatePenIndirect(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreatePenIndirect(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreatePolyPolygonRgn(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreatePolyPolygonRgn(p0: String, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreatePolygonRgn(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreatePolygonRgn(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreateRectRgn(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreateRectRgn(p0: Int, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreateRectRgnIndirect(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreateRectRgnIndirect(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreateRoundRectRgn(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreateRoundRectRgn(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreateScalableFontResourceA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreateScalableFontResourceA(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreateScalableFontResourceW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreateScalableFontResourceW(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiCreateSolidBrush(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiCreateSolidBrush(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiDPtoLP(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiDPtoLP(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiDeleteDC(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiDeleteDC(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiDeleteEnhMetaFile(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiDeleteEnhMetaFile(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiDeleteMetaFile(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiDeleteMetaFile(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiDeleteObject(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiDeleteObject(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiDrawAnimatedRects(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiDrawAnimatedRects(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiDrawCaption(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiDrawCaption(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiDrawEdge(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiDrawEdge(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiDrawEscape(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiDrawEscape(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiDrawFocusRect(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiDrawFocusRect(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiDrawFrameControl(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiDrawFrameControl(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiDrawStateA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiDrawStateA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: Int, p7: Int, p8: Int, p9: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiDrawStateW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiDrawStateW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: Int, p7: Int, p8: Int, p9: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiDrawTextA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiDrawTextA(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiDrawTextExA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiDrawTextExA(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiDrawTextExW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiDrawTextExW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiDrawTextW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiDrawTextW(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiEllipse(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiEllipse(p0: String, p1: Int, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiEndPaint(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiEndPaint(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiEndPath(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiEndPath(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiEnumDisplayDevicesA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiEnumDisplayDevicesA(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiEnumDisplayDevicesW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiEnumDisplayDevicesW(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiEnumDisplayMonitors(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiEnumDisplayMonitors(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiEnumDisplaySettingsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiEnumDisplaySettingsA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiEnumDisplaySettingsExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiEnumDisplaySettingsExA(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiEnumDisplaySettingsExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiEnumDisplaySettingsExW(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiEnumDisplaySettingsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiEnumDisplaySettingsW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiEnumEnhMetaFile(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiEnumEnhMetaFile(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiEnumFontFamiliesA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiEnumFontFamiliesA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiEnumFontFamiliesExA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiEnumFontFamiliesExA(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiEnumFontFamiliesExW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiEnumFontFamiliesExW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiEnumFontFamiliesW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiEnumFontFamiliesW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiEnumFontsA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiEnumFontsA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiEnumFontsW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiEnumFontsW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiEnumMetaFile(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiEnumMetaFile(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiEnumObjects(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiEnumObjects(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiEqualRect(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiEqualRect(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiEqualRgn(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiEqualRgn(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiExcludeClipRect(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiExcludeClipRect(p0: String, p1: Int, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiExcludeUpdateRgn(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiExcludeUpdateRgn(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiExtCreatePen(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiExtCreatePen(p0: Int, p1: Int, p2: String, p3: Int, p4: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiExtCreateRegion(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiExtCreateRegion(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiExtFloodFill(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiExtFloodFill(p0: String, p1: Int, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiExtSelectClipRgn(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiExtSelectClipRgn(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiExtTextOutA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiExtTextOutA(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiExtTextOutW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiExtTextOutW(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: Int, p7: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiFillPath(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiFillPath(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiFillRect(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiFillRect(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiFillRgn(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiFillRgn(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiFixBrushOrgEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiFixBrushOrgEx(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiFlattenPath(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiFlattenPath(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiFloodFill(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiFloodFill(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiFrameRect(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiFrameRect(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiFrameRgn(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiFrameRgn(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGdiComment(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGdiComment(p0: String, p1: Int, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGdiFlush()")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGdiFlush(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGdiGetBatchLimit()")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGdiGetBatchLimit(): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGdiGradientFill(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGdiGradientFill(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGdiSetBatchLimit(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGdiSetBatchLimit(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGdiTransparentBlt(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGdiTransparentBlt(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String, p6: Int, p7: Int, p8: Int, p9: Int, p10: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetArcDirection(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetArcDirection(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetAspectRatioFilterEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetAspectRatioFilterEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetBitmapBits(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetBitmapBits(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetBitmapDimensionEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetBitmapDimensionEx(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetBkColor(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetBkColor(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetBkMode(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetBkMode(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetBoundsRect(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetBoundsRect(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetBrushOrgEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetBrushOrgEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetCharABCWidthsA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetCharABCWidthsA(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetCharABCWidthsFloatA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetCharABCWidthsFloatA(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetCharABCWidthsFloatW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetCharABCWidthsFloatW(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetCharABCWidthsI(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetCharABCWidthsI(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetCharABCWidthsW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetCharABCWidthsW(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetCharWidth32A(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetCharWidth32A(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetCharWidth32W(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetCharWidth32W(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetCharWidthA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetCharWidthA(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetCharWidthFloatA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetCharWidthFloatA(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetCharWidthFloatW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetCharWidthFloatW(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetCharWidthI(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetCharWidthI(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetCharWidthW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetCharWidthW(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetCharacterPlacementA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetCharacterPlacementA(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetCharacterPlacementW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetCharacterPlacementW(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetClipBox(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetClipBox(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetClipRgn(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetClipRgn(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetColorAdjustment(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetColorAdjustment(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetCurrentObject(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetCurrentObject(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetCurrentPositionEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetCurrentPositionEx(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetDC(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetDC(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetDCBrushColor(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetDCBrushColor(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetDCEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetDCEx(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetDCOrgEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetDCOrgEx(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetDCPenColor(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetDCPenColor(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetDIBColorTable(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetDIBColorTable(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetDIBits(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetDIBits(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetDeviceCaps(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetDeviceCaps(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetEnhMetaFileA(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetEnhMetaFileA(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetEnhMetaFileBits(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetEnhMetaFileBits(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetEnhMetaFileDescriptionA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetEnhMetaFileDescriptionA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetEnhMetaFileDescriptionW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetEnhMetaFileDescriptionW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetEnhMetaFileHeader(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetEnhMetaFileHeader(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetEnhMetaFilePaletteEntries(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetEnhMetaFilePaletteEntries(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetEnhMetaFileW(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetEnhMetaFileW(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetFontData(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetFontData(p0: String, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetFontLanguageInfo(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetFontLanguageInfo(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetFontUnicodeRanges(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetFontUnicodeRanges(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetGlyphIndicesA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetGlyphIndicesA(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetGlyphIndicesW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetGlyphIndicesW(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetGlyphOutlineA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetGlyphOutlineA(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetGlyphOutlineW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetGlyphOutlineW(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetGraphicsMode(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetGraphicsMode(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetKerningPairsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetKerningPairsA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetKerningPairsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetKerningPairsW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetLayout(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetLayout(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetMapMode(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetMapMode(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetMetaFileA(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetMetaFileA(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetMetaFileBitsEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetMetaFileBitsEx(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetMetaFileW(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetMetaFileW(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetMetaRgn(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetMetaRgn(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetMiterLimit(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetMiterLimit(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetMonitorInfoA(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetMonitorInfoA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetMonitorInfoW(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetMonitorInfoW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetNearestColor(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetNearestColor(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetNearestPaletteIndex(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetNearestPaletteIndex(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetObjectA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetObjectA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetObjectType(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetObjectType(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetObjectW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetObjectW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetOutlineTextMetricsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetOutlineTextMetricsA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetOutlineTextMetricsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetOutlineTextMetricsW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetPaletteEntries(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetPaletteEntries(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetPath(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetPath(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetPixel(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetPixel(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetPolyFillMode(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetPolyFillMode(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetROP2(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetROP2(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetRandomRgn(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetRandomRgn(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetRasterizerCaps(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetRasterizerCaps(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetRegionData(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetRegionData(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetRgnBox(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetRgnBox(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetStockObject(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetStockObject(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetStretchBltMode(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetStretchBltMode(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetSysColor(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetSysColor(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetSysColorBrush(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetSysColorBrush(p0: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetSystemPaletteEntries(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetSystemPaletteEntries(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetSystemPaletteUse(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetSystemPaletteUse(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetTabbedTextExtentA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetTabbedTextExtentA(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetTabbedTextExtentW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetTabbedTextExtentW(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetTextAlign(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetTextAlign(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetTextCharacterExtra(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetTextCharacterExtra(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetTextColor(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetTextColor(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetTextExtentExPointA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetTextExtentExPointA(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetTextExtentExPointI(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetTextExtentExPointI(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetTextExtentExPointW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetTextExtentExPointW(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetTextExtentPoint32A(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetTextExtentPoint32A(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetTextExtentPoint32W(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetTextExtentPoint32W(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetTextExtentPointA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetTextExtentPointA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetTextExtentPointI(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetTextExtentPointI(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetTextExtentPointW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetTextExtentPointW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetTextFaceA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetTextFaceA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetTextFaceW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetTextFaceW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetTextMetricsA(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetTextMetricsA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetTextMetricsW(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetTextMetricsW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetUpdateRect(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetUpdateRect(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetUpdateRgn(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetUpdateRgn(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetViewportExtEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetViewportExtEx(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetViewportOrgEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetViewportOrgEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetWinMetaFileBits(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetWinMetaFileBits(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetWindowDC(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetWindowDC(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetWindowExtEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetWindowExtEx(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetWindowOrgEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetWindowOrgEx(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetWindowRgn(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetWindowRgn(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetWindowRgnBox(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetWindowRgnBox(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGetWorldTransform(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGetWorldTransform(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGradientFill(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGradientFill(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGrayStringA(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGrayStringA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: Int, p7: Int, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiGrayStringW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiGrayStringW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: Int, p7: Int, p8: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiInflateRect(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiInflateRect(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiIntersectClipRect(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiIntersectClipRect(p0: String, p1: Int, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiIntersectRect(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiIntersectRect(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiInvalidateRect(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiInvalidateRect(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiInvalidateRgn(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiInvalidateRgn(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiInvertRect(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiInvertRect(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiInvertRgn(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiInvertRgn(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiIsRectEmpty(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiIsRectEmpty(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiLPtoDP(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiLPtoDP(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiLineDDA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiLineDDA(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiLineTo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiLineTo(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiLoadBitmapA(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiLoadBitmapA(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiLoadBitmapW(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiLoadBitmapW(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiLockWindowUpdate(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiLockWindowUpdate(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiMapWindowPoints(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiMapWindowPoints(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiMaskBlt(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiMaskBlt(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String, p6: Int, p7: Int, p8: String, p9: Int, p10: Int, p11: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiMergeFontPackage(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiMergeFontPackage(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: Int, p8: String, p9: String, p10: String, p11: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiModifyWorldTransform(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiModifyWorldTransform(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiMonitorFromRect(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiMonitorFromRect(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiMonitorFromWindow(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiMonitorFromWindow(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiMoveToEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiMoveToEx(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiOffsetClipRgn(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiOffsetClipRgn(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiOffsetRect(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiOffsetRect(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiOffsetRgn(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiOffsetRgn(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiOffsetViewportOrgEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiOffsetViewportOrgEx(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiOffsetWindowOrgEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiOffsetWindowOrgEx(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiPaintDesktop(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiPaintDesktop(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiPaintRgn(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiPaintRgn(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiPatBlt(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiPatBlt(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiPathToRegion(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiPathToRegion(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiPie(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiPie(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiPlayEnhMetaFile(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiPlayEnhMetaFile(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiPlayEnhMetaFileRecord(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiPlayEnhMetaFileRecord(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiPlayMetaFile(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiPlayMetaFile(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiPlayMetaFileRecord(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiPlayMetaFileRecord(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiPlgBlt(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiPlgBlt(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: Int, p7: String, p8: Int, p9: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiPolyBezier(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiPolyBezier(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiPolyBezierTo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiPolyBezierTo(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiPolyDraw(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiPolyDraw(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiPolyPolygon(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiPolyPolygon(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiPolyPolyline(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiPolyPolyline(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiPolyTextOutA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiPolyTextOutA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiPolyTextOutW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiPolyTextOutW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiPolygon(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiPolygon(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiPolyline(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiPolyline(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiPolylineTo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiPolylineTo(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiPtInRegion(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiPtInRegion(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiPtVisible(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiPtVisible(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiRealizePalette(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiRealizePalette(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiRectInRegion(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiRectInRegion(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiRectVisible(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiRectVisible(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiRectangle(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiRectangle(p0: String, p1: Int, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiRedrawWindow(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiRedrawWindow(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiReleaseDC(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiReleaseDC(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiRemoveFontMemResourceEx(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiRemoveFontMemResourceEx(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiRemoveFontResourceA(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiRemoveFontResourceA(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiRemoveFontResourceExA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiRemoveFontResourceExA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiRemoveFontResourceExW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiRemoveFontResourceExW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiRemoveFontResourceW(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiRemoveFontResourceW(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiResetDCA(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiResetDCA(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiResetDCW(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiResetDCW(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiResizePalette(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiResizePalette(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiRestoreDC(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiRestoreDC(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiRoundRect(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiRoundRect(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSaveDC(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSaveDC(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiScaleViewportExtEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiScaleViewportExtEx(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiScaleWindowExtEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiScaleWindowExtEx(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiScreenToClient(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiScreenToClient(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSelectClipPath(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSelectClipPath(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSelectClipRgn(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSelectClipRgn(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSelectObject(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSelectObject(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSelectPalette(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSelectPalette(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetArcDirection(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetArcDirection(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetBitmapBits(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetBitmapBits(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetBitmapDimensionEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetBitmapDimensionEx(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetBkColor(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetBkColor(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetBkMode(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetBkMode(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetBoundsRect(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetBoundsRect(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetBrushOrgEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetBrushOrgEx(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetColorAdjustment(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetColorAdjustment(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetDCBrushColor(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetDCBrushColor(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetDCPenColor(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetDCPenColor(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetDIBColorTable(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetDIBColorTable(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetDIBits(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetDIBits(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetDIBitsToDevice(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetDIBitsToDevice(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: Int, p9: String, p10: String, p11: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetEnhMetaFileBits(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetEnhMetaFileBits(p0: Int, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetGraphicsMode(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetGraphicsMode(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetLayout(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetLayout(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetMapMode(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetMapMode(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetMapperFlags(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetMapperFlags(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetMetaFileBitsEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetMetaFileBitsEx(p0: Int, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetMetaRgn(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetMetaRgn(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetMiterLimit(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetMiterLimit(p0: String, p1: Double, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetPaletteEntries(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetPaletteEntries(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetPixel(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetPixel(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetPixelV(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetPixelV(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetPolyFillMode(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetPolyFillMode(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetROP2(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetROP2(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetRect(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetRect(p0: String, p1: Int, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetRectEmpty(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetRectEmpty(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetRectRgn(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetRectRgn(p0: String, p1: Int, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetStretchBltMode(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetStretchBltMode(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetSysColors(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetSysColors(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetSystemPaletteUse(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetSystemPaletteUse(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetTextAlign(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetTextAlign(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetTextCharacterExtra(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetTextCharacterExtra(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetTextColor(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetTextColor(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetTextJustification(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetTextJustification(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetViewportExtEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetViewportExtEx(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetViewportOrgEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetViewportOrgEx(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetWindowExtEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetWindowExtEx(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetWindowOrgEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetWindowOrgEx(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetWindowRgn(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetWindowRgn(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSetWorldTransform(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSetWorldTransform(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiStretchBlt(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiStretchBlt(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String, p6: Int, p7: Int, p8: Int, p9: Int, p10: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiStretchDIBits(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiStretchDIBits(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: Int, p9: String, p10: String, p11: Int, p12: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiStrokeAndFillPath(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiStrokeAndFillPath(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiStrokePath(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiStrokePath(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiSubtractRect(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiSubtractRect(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiTTCharToUnicode(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiTTCharToUnicode(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiTTDeleteEmbeddedFont(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiTTDeleteEmbeddedFont(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiTTEmbedFont(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiTTEmbedFont(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String, p8: Int, p9: Int, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiTTEmbedFontEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiTTEmbedFontEx(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String, p8: Int, p9: Int, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiTTEmbedFontFromFileA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiTTEmbedFontFromFileA(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String, p7: String, p8: String, p9: String, p10: Int, p11: Int, p12: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiTTEnableEmbeddingForFacename(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiTTEnableEmbeddingForFacename(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiTTGetEmbeddedFontInfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiTTGetEmbeddedFontInfo(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiTTGetEmbeddingType(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiTTGetEmbeddingType(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiTTGetNewFontName(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiTTGetNewFontName(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiTTIsEmbeddingEnabled(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiTTIsEmbeddingEnabled(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiTTIsEmbeddingEnabledForFacename(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiTTIsEmbeddingEnabledForFacename(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiTTLoadEmbeddedFont(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiTTLoadEmbeddedFont(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiTTRunValidationTests(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiTTRunValidationTests(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiTTRunValidationTestsEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiTTRunValidationTestsEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiTabbedTextOutA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiTabbedTextOutA(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: Int, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiTabbedTextOutW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiTabbedTextOutW(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: Int, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiTextOutA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiTextOutA(p0: String, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiTextOutW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiTextOutW(p0: String, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiTransparentBlt(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiTransparentBlt(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String, p6: Int, p7: Int, p8: Int, p9: Int, p10: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiUnionRect(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiUnionRect(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiUnrealizeObject(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiUnrealizeObject(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiUpdateColors(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiUpdateColors(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiUpdateWindow(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiUpdateWindow(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiValidateRect(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiValidateRect(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiValidateRgn(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiValidateRgn(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiWidenPath(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiWidenPath(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiWindowFromDC(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiWindowFromDC(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiWglSwapMultipleBuffers(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiWglSwapMultipleBuffers(p0: Int, p1: String): Int

public actual fun abortPath(hdc: Hdc): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiAbortPath(hdc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addFontMemResourceEx(pfileview: ConstPtr<CVoid>, cjsize: UInt, pvresrved: ConstPtr<CVoid>, pnumfonts: ConstPtr<UInt>): Handle =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiAddFontMemResourceEx(pfileview.rawAddress.toString(), cjsize.toInt(), pvresrved.rawAddress.toString(), pnumfonts.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addFontResourceA(param0: Pcstr): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiAddFontResourceA(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addFontResourceExA(name: Pcstr, fl: FontResourceCharacteristics, res: ConstPtr<CVoid>): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiAddFontResourceExA(name.rawAddress.toString(), fl.toInt(), res.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addFontResourceExW(name: Pcwstr, fl: FontResourceCharacteristics, res: ConstPtr<CVoid>): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiAddFontResourceExW(name.rawAddress.toString(), fl.toInt(), res.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addFontResourceW(param0: Pcwstr): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiAddFontResourceW(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alphaBlend(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, ftn: Blendfunction): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun angleArc(hdc: Hdc, x: Int, y: Int, r: UInt, startangle: Float, sweepangle: Float): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiAngleArc(hdc.rawAddress.toString(), x, y, r.toInt(), startangle.toDouble(), sweepangle.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun animatePalette(hpal: Hpalette, istartindex: UInt, centries: UInt, ppe: ConstPtr<Paletteentry>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiAnimatePalette(hpal.rawAddress.toString(), istartindex.toInt(), centries.toInt(), ppe.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc(hdc: Hdc, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiArc(hdc.rawAddress.toString(), x1, y1, x2, y2, x3, y3, x4, y4) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arcTo(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int, xr1: Int, yr1: Int, xr2: Int, yr2: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiArcTo(hdc.rawAddress.toString(), left, top, right, bottom, xr1, yr1, xr2, yr2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun beginPaint(hwnd: Hwnd, lppaint: MutPtr<Paintstruct>): Hdc =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiBeginPaint(hwnd.rawAddress.toString(), lppaint.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun beginPath(hdc: Hdc): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiBeginPath(hdc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bitBlt(hdc: Hdc, x: Int, y: Int, cx: Int, cy: Int, hdcsrc: Hdc, x1: Int, y1: Int, rop: RopCode): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiBitBlt(hdc.rawAddress.toString(), x, y, cx, cy, hdcsrc.rawAddress.toString(), x1, y1, rop.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cancelDC(hdc: Hdc): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiCancelDC(hdc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeDisplaySettingsA(lpdevmode: ConstPtr<Devmodea>, dwflags: CdsType): DispChange =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiChangeDisplaySettingsA(lpdevmode.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeDisplaySettingsExA(lpszdevicename: Pcstr, lpdevmode: ConstPtr<Devmodea>, hwnd: Hwnd, dwflags: CdsType, lparam: ConstPtr<CVoid>): DispChange =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiChangeDisplaySettingsExA(lpszdevicename.rawAddress.toString(), lpdevmode.rawAddress.toString(), hwnd.rawAddress.toString(), dwflags.toInt(), lparam.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeDisplaySettingsExW(lpszdevicename: Pcwstr, lpdevmode: ConstPtr<Devmodew>, hwnd: Hwnd, dwflags: CdsType, lparam: ConstPtr<CVoid>): DispChange =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiChangeDisplaySettingsExW(lpszdevicename.rawAddress.toString(), lpdevmode.rawAddress.toString(), hwnd.rawAddress.toString(), dwflags.toInt(), lparam.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeDisplaySettingsW(lpdevmode: ConstPtr<Devmodew>, dwflags: CdsType): DispChange =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiChangeDisplaySettingsW(lpdevmode.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chord(hdc: Hdc, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiChord(hdc.rawAddress.toString(), x1, y1, x2, y2, x3, y3, x4, y4) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clientToScreen(hwnd: Hwnd, lppoint: MutPtr<Point>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiClientToScreen(hwnd.rawAddress.toString(), lppoint.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeEnhMetaFile(hdc: Hdc): Henhmetafile =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCloseEnhMetaFile(hdc.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeFigure(hdc: Hdc): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiCloseFigure(hdc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeMetaFile(hdc: Hdc): Hmetafile =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCloseMetaFile(hdc.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun combineRgn(hrgndst: Hrgn, hrgnsrc1: Hrgn, hrgnsrc2: Hrgn, imode: RgnCombineMode): GdiRegionType =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiCombineRgn(hrgndst.rawAddress.toString(), hrgnsrc1.rawAddress.toString(), hrgnsrc2.rawAddress.toString(), imode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun combineTransform(lpxfout: MutPtr<Xform>, lpxf1: ConstPtr<Xform>, lpxf2: ConstPtr<Xform>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiCombineTransform(lpxfout.rawAddress.toString(), lpxf1.rawAddress.toString(), lpxf2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyEnhMetaFileA(henh: Henhmetafile, lpfilename: Pcstr): Henhmetafile =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCopyEnhMetaFileA(henh.rawAddress.toString(), lpfilename.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyEnhMetaFileW(henh: Henhmetafile, lpfilename: Pcwstr): Henhmetafile =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCopyEnhMetaFileW(henh.rawAddress.toString(), lpfilename.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyMetaFileA(param0: Hmetafile, param1: Pcstr): Hmetafile =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCopyMetaFileA(param0.rawAddress.toString(), param1.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyMetaFileW(param0: Hmetafile, param1: Pcwstr): Hmetafile =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCopyMetaFileW(param0.rawAddress.toString(), param1.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyRect(lprcdst: MutPtr<Rect>, lprcsrc: ConstPtr<Rect>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiCopyRect(lprcdst.rawAddress.toString(), lprcsrc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createBitmap(nwidth: Int, nheight: Int, nplanes: UInt, nbitcount: UInt, lpbits: ConstPtr<CVoid>): Hbitmap =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCreateBitmap(nwidth, nheight, nplanes.toInt(), nbitcount.toInt(), lpbits.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createBitmapIndirect(pbm: ConstPtr<Bitmap>): Hbitmap =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCreateBitmapIndirect(pbm.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createBrushIndirect(plbrush: ConstPtr<Logbrush>): Hbrush =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCreateBrushIndirect(plbrush.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createCompatibleBitmap(hdc: Hdc, cx: Int, cy: Int): Hbitmap =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCreateCompatibleBitmap(hdc.rawAddress.toString(), cx, cy).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createCompatibleDC(hdc: Hdc): Hdc =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCreateCompatibleDC(hdc.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDCA(pwszdriver: Pcstr, pwszdevice: Pcstr, pszport: Pcstr, pdm: ConstPtr<Devmodea>): Hdc =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCreateDCA(pwszdriver.rawAddress.toString(), pwszdevice.rawAddress.toString(), pszport.rawAddress.toString(), pdm.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDCW(pwszdriver: Pcwstr, pwszdevice: Pcwstr, pszport: Pcwstr, pdm: ConstPtr<Devmodew>): Hdc =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCreateDCW(pwszdriver.rawAddress.toString(), pwszdevice.rawAddress.toString(), pszport.rawAddress.toString(), pdm.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDIBPatternBrush(h: Hglobal, iusage: DibUsage): Hbrush =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCreateDIBPatternBrush(h.rawAddress.toString(), iusage.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDIBPatternBrushPt(lppackeddib: ConstPtr<CVoid>, iusage: DibUsage): Hbrush =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCreateDIBPatternBrushPt(lppackeddib.rawAddress.toString(), iusage.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDIBSection(hdc: Hdc, pbmi: ConstPtr<Bitmapinfo>, usage: DibUsage, ppvbits: MutPtr<MutPtr<CVoid>>, hsection: Handle, offset: UInt): Hbitmap =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCreateDIBSection(hdc.rawAddress.toString(), pbmi.rawAddress.toString(), usage.toInt(), ppvbits.rawAddress.toString(), hsection.rawAddress.toString(), offset.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDIBitmap(hdc: Hdc, pbmih: ConstPtr<Bitmapinfoheader>, flinit: UInt, pjbits: ConstPtr<CVoid>, pbmi: ConstPtr<Bitmapinfo>, iusage: DibUsage): Hbitmap =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCreateDIBitmap(hdc.rawAddress.toString(), pbmih.rawAddress.toString(), flinit.toInt(), pjbits.rawAddress.toString(), pbmi.rawAddress.toString(), iusage.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDiscardableBitmap(hdc: Hdc, cx: Int, cy: Int): Hbitmap =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCreateDiscardableBitmap(hdc.rawAddress.toString(), cx, cy).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEllipticRgn(x1: Int, y1: Int, x2: Int, y2: Int): Hrgn =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCreateEllipticRgn(x1, y1, x2, y2).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEllipticRgnIndirect(lprect: ConstPtr<Rect>): Hrgn =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCreateEllipticRgnIndirect(lprect.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEnhMetaFileA(hdc: Hdc, lpfilename: Pcstr, lprc: ConstPtr<Rect>, lpdesc: Pcstr): Hdc =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCreateEnhMetaFileA(hdc.rawAddress.toString(), lpfilename.rawAddress.toString(), lprc.rawAddress.toString(), lpdesc.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEnhMetaFileW(hdc: Hdc, lpfilename: Pcwstr, lprc: ConstPtr<Rect>, lpdesc: Pcwstr): Hdc =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCreateEnhMetaFileW(hdc.rawAddress.toString(), lpfilename.rawAddress.toString(), lprc.rawAddress.toString(), lpdesc.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFontA(cheight: Int, cwidth: Int, cescapement: Int, corientation: Int, cweight: Int, bitalic: UInt, bunderline: UInt, bstrikeout: UInt, icharset: UInt, ioutprecision: UInt, iclipprecision: UInt, iquality: UInt, ipitchandfamily: UInt, pszfacename: Pcstr): Hfont =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCreateFontA(cheight, cwidth, cescapement, corientation, cweight, bitalic.toInt(), bunderline.toInt(), bstrikeout.toInt(), icharset.toInt(), ioutprecision.toInt(), iclipprecision.toInt(), iquality.toInt(), ipitchandfamily.toInt(), pszfacename.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFontIndirectA(lplf: ConstPtr<Logfonta>): Hfont =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCreateFontIndirectA(lplf.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFontIndirectExA(param0: ConstPtr<Enumlogfontexdva>): Hfont =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCreateFontIndirectExA(param0.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFontIndirectExW(param0: ConstPtr<Enumlogfontexdvw>): Hfont =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCreateFontIndirectExW(param0.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFontIndirectW(lplf: ConstPtr<Logfontw>): Hfont =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCreateFontIndirectW(lplf.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFontPackage(puchsrcbuffer: ConstPtr<UByte>, ulsrcbuffersize: UInt, ppuchfontpackagebuffer: MutPtr<MutPtr<UByte>>, pulfontpackagebuffersize: MutPtr<UInt>, pulbyteswritten: MutPtr<UInt>, usflag: UShort, usttcindex: UShort, ussubsetformat: UShort, ussubsetlanguage: UShort, ussubsetplatform: CreateFontPackageSubsetPlatform, ussubsetencoding: CreateFontPackageSubsetEncoding, pussubsetkeeplist: ConstPtr<UShort>, ussubsetlistcount: UShort, lpfnallocate: CfpAllocproc, lpfnreallocate: CfpReallocproc, lpfnfree: CfpFreeproc, lpvreserved: MutPtr<CVoid>): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiCreateFontPackage(puchsrcbuffer.rawAddress.toString(), ulsrcbuffersize.toInt(), ppuchfontpackagebuffer.rawAddress.toString(), pulfontpackagebuffersize.rawAddress.toString(), pulbyteswritten.rawAddress.toString(), usflag.toInt(), usttcindex.toInt(), ussubsetformat.toInt(), ussubsetlanguage.toInt(), ussubsetplatform.toInt(), ussubsetencoding.toInt(), pussubsetkeeplist.rawAddress.toString(), ussubsetlistcount.toInt(), 0L.toString(), 0L.toString(), 0L.toString(), lpvreserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFontW(cheight: Int, cwidth: Int, cescapement: Int, corientation: Int, cweight: Int, bitalic: UInt, bunderline: UInt, bstrikeout: UInt, icharset: UInt, ioutprecision: UInt, iclipprecision: UInt, iquality: UInt, ipitchandfamily: UInt, pszfacename: Pcwstr): Hfont =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCreateFontW(cheight, cwidth, cescapement, corientation, cweight, bitalic.toInt(), bunderline.toInt(), bstrikeout.toInt(), icharset.toInt(), ioutprecision.toInt(), iclipprecision.toInt(), iquality.toInt(), ipitchandfamily.toInt(), pszfacename.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createHalftonePalette(hdc: Hdc): Hpalette =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCreateHalftonePalette(hdc.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createHatchBrush(ihatch: HatchBrushStyle, color: Colorref): Hbrush =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCreateHatchBrush(ihatch, color.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createICA(pszdriver: Pcstr, pszdevice: Pcstr, pszport: Pcstr, pdm: ConstPtr<Devmodea>): Hdc =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCreateICA(pszdriver.rawAddress.toString(), pszdevice.rawAddress.toString(), pszport.rawAddress.toString(), pdm.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createICW(pszdriver: Pcwstr, pszdevice: Pcwstr, pszport: Pcwstr, pdm: ConstPtr<Devmodew>): Hdc =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCreateICW(pszdriver.rawAddress.toString(), pszdevice.rawAddress.toString(), pszport.rawAddress.toString(), pdm.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMetaFileA(pszfile: Pcstr): Hdc =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCreateMetaFileA(pszfile.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMetaFileW(pszfile: Pcwstr): Hdc =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCreateMetaFileW(pszfile.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPalette(plpal: ConstPtr<Logpalette>): Hpalette =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCreatePalette(plpal.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPatternBrush(hbm: Hbitmap): Hbrush =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCreatePatternBrush(hbm.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPen(istyle: PenStyle, cwidth: Int, color: Colorref): Hpen =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCreatePen(istyle, cwidth, color.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPenIndirect(plpen: ConstPtr<Logpen>): Hpen =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCreatePenIndirect(plpen.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPolyPolygonRgn(pptl: ConstPtr<Point>, pc: ConstPtr<Int>, cpoly: Int, imode: CreatePolygonRgnMode): Hrgn =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCreatePolyPolygonRgn(pptl.rawAddress.toString(), pc.rawAddress.toString(), cpoly, imode).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPolygonRgn(pptl: ConstPtr<Point>, cpoint: Int, imode: CreatePolygonRgnMode): Hrgn =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCreatePolygonRgn(pptl.rawAddress.toString(), cpoint, imode).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createRectRgn(x1: Int, y1: Int, x2: Int, y2: Int): Hrgn =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCreateRectRgn(x1, y1, x2, y2).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createRectRgnIndirect(lprect: ConstPtr<Rect>): Hrgn =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCreateRectRgnIndirect(lprect.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createRoundRectRgn(x1: Int, y1: Int, x2: Int, y2: Int, w: Int, h: Int): Hrgn =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCreateRoundRectRgn(x1, y1, x2, y2, w, h).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createScalableFontResourceA(fdwhidden: UInt, lpszfont: Pcstr, lpszfile: Pcstr, lpszpath: Pcstr): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiCreateScalableFontResourceA(fdwhidden.toInt(), lpszfont.rawAddress.toString(), lpszfile.rawAddress.toString(), lpszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createScalableFontResourceW(fdwhidden: UInt, lpszfont: Pcwstr, lpszfile: Pcwstr, lpszpath: Pcwstr): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiCreateScalableFontResourceW(fdwhidden.toInt(), lpszfont.rawAddress.toString(), lpszfile.rawAddress.toString(), lpszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createSolidBrush(color: Colorref): Hbrush =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiCreateSolidBrush(color.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dPtoLP(hdc: Hdc, lppt: MutPtr<Point>, c: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiDPtoLP(hdc.rawAddress.toString(), lppt.rawAddress.toString(), c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteDC(hdc: Hdc): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiDeleteDC(hdc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteEnhMetaFile(hmf: Henhmetafile): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiDeleteEnhMetaFile(hmf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteMetaFile(hmf: Hmetafile): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiDeleteMetaFile(hmf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteObject(ho: Hgdiobj): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiDeleteObject(ho.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawAnimatedRects(hwnd: Hwnd, idani: Int, lprcfrom: ConstPtr<Rect>, lprcto: ConstPtr<Rect>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiDrawAnimatedRects(hwnd.rawAddress.toString(), idani, lprcfrom.rawAddress.toString(), lprcto.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawCaption(hwnd: Hwnd, hdc: Hdc, lprect: ConstPtr<Rect>, flags: DrawCaptionFlags): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiDrawCaption(hwnd.rawAddress.toString(), hdc.rawAddress.toString(), lprect.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawEdge(hdc: Hdc, qrc: MutPtr<Rect>, edge: DrawedgeFlags, grfflags: DrawEdgeFlags): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiDrawEdge(hdc.rawAddress.toString(), qrc.rawAddress.toString(), edge.toInt(), grfflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawEscape(hdc: Hdc, iescape: Int, cjin: Int, lpin: Pcstr): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiDrawEscape(hdc.rawAddress.toString(), iescape, cjin, lpin.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawFocusRect(hdc: Hdc, lprc: ConstPtr<Rect>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiDrawFocusRect(hdc.rawAddress.toString(), lprc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawFrameControl(param0: Hdc, param1: MutPtr<Rect>, param2: DfcType, param3: DfcsState): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiDrawFrameControl(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.toInt(), param3.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawStateA(hdc: Hdc, hbrfore: Hbrush, qfncallback: Drawstateproc, ldata: Lparam, wdata: Wparam, x: Int, y: Int, cx: Int, cy: Int, uflags: DrawstateFlags): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiDrawStateA(hdc.rawAddress.toString(), hbrfore.rawAddress.toString(), 0L.toString(), ldata.toString(), wdata.toString(), x, y, cx, cy, uflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawStateW(hdc: Hdc, hbrfore: Hbrush, qfncallback: Drawstateproc, ldata: Lparam, wdata: Wparam, x: Int, y: Int, cx: Int, cy: Int, uflags: DrawstateFlags): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiDrawStateW(hdc.rawAddress.toString(), hbrfore.rawAddress.toString(), 0L.toString(), ldata.toString(), wdata.toString(), x, y, cx, cy, uflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawTextA(hdc: Hdc, lpchtext: Pcstr, cchtext: Int, lprc: MutPtr<Rect>, format: DrawTextFormat): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiDrawTextA(hdc.rawAddress.toString(), lpchtext.rawAddress.toString(), cchtext, lprc.rawAddress.toString(), format.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawTextExA(hdc: Hdc, lpchtext: Pstr, cchtext: Int, lprc: MutPtr<Rect>, format: DrawTextFormat, lpdtp: ConstPtr<Drawtextparams>): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiDrawTextExA(hdc.rawAddress.toString(), lpchtext.rawAddress.toString(), cchtext, lprc.rawAddress.toString(), format.toInt(), lpdtp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawTextExW(hdc: Hdc, lpchtext: Pwstr, cchtext: Int, lprc: MutPtr<Rect>, format: DrawTextFormat, lpdtp: ConstPtr<Drawtextparams>): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiDrawTextExW(hdc.rawAddress.toString(), lpchtext.rawAddress.toString(), cchtext, lprc.rawAddress.toString(), format.toInt(), lpdtp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawTextW(hdc: Hdc, lpchtext: Pcwstr, cchtext: Int, lprc: MutPtr<Rect>, format: DrawTextFormat): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiDrawTextW(hdc.rawAddress.toString(), lpchtext.rawAddress.toString(), cchtext, lprc.rawAddress.toString(), format.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ellipse(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiEllipse(hdc.rawAddress.toString(), left, top, right, bottom) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endPaint(hwnd: Hwnd, lppaint: ConstPtr<Paintstruct>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiEndPaint(hwnd.rawAddress.toString(), lppaint.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endPath(hdc: Hdc): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiEndPath(hdc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDisplayDevicesA(lpdevice: Pcstr, idevnum: UInt, lpdisplaydevice: MutPtr<DisplayDevicea>, dwflags: UInt): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiEnumDisplayDevicesA(lpdevice.rawAddress.toString(), idevnum.toInt(), lpdisplaydevice.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDisplayDevicesW(lpdevice: Pcwstr, idevnum: UInt, lpdisplaydevice: MutPtr<DisplayDevicew>, dwflags: UInt): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiEnumDisplayDevicesW(lpdevice.rawAddress.toString(), idevnum.toInt(), lpdisplaydevice.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDisplayMonitors(hdc: Hdc, lprcclip: ConstPtr<Rect>, lpfnenum: Monitorenumproc, dwdata: Lparam): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiEnumDisplayMonitors(hdc.rawAddress.toString(), lprcclip.rawAddress.toString(), 0L.toString(), dwdata.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDisplaySettingsA(lpszdevicename: Pcstr, imodenum: EnumDisplaySettingsMode, lpdevmode: MutPtr<Devmodea>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiEnumDisplaySettingsA(lpszdevicename.rawAddress.toString(), imodenum.toInt(), lpdevmode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDisplaySettingsExA(lpszdevicename: Pcstr, imodenum: EnumDisplaySettingsMode, lpdevmode: MutPtr<Devmodea>, dwflags: EnumDisplaySettingsFlags): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiEnumDisplaySettingsExA(lpszdevicename.rawAddress.toString(), imodenum.toInt(), lpdevmode.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDisplaySettingsExW(lpszdevicename: Pcwstr, imodenum: EnumDisplaySettingsMode, lpdevmode: MutPtr<Devmodew>, dwflags: EnumDisplaySettingsFlags): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiEnumDisplaySettingsExW(lpszdevicename.rawAddress.toString(), imodenum.toInt(), lpdevmode.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDisplaySettingsW(lpszdevicename: Pcwstr, imodenum: EnumDisplaySettingsMode, lpdevmode: MutPtr<Devmodew>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiEnumDisplaySettingsW(lpszdevicename.rawAddress.toString(), imodenum.toInt(), lpdevmode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumEnhMetaFile(hdc: Hdc, hmf: Henhmetafile, proc: Enhmfenumproc, param3: ConstPtr<CVoid>, lprect: ConstPtr<Rect>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiEnumEnhMetaFile(hdc.rawAddress.toString(), hmf.rawAddress.toString(), 0L.toString(), param3.rawAddress.toString(), lprect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumFontFamiliesA(hdc: Hdc, lplogfont: Pcstr, lpproc: Fontenumproca, lparam: Lparam): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiEnumFontFamiliesA(hdc.rawAddress.toString(), lplogfont.rawAddress.toString(), 0L.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumFontFamiliesExA(hdc: Hdc, lplogfont: ConstPtr<Logfonta>, lpproc: Fontenumproca, lparam: Lparam, dwflags: UInt): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiEnumFontFamiliesExA(hdc.rawAddress.toString(), lplogfont.rawAddress.toString(), 0L.toString(), lparam.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumFontFamiliesExW(hdc: Hdc, lplogfont: ConstPtr<Logfontw>, lpproc: Fontenumprocw, lparam: Lparam, dwflags: UInt): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiEnumFontFamiliesExW(hdc.rawAddress.toString(), lplogfont.rawAddress.toString(), 0L.toString(), lparam.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumFontFamiliesW(hdc: Hdc, lplogfont: Pcwstr, lpproc: Fontenumprocw, lparam: Lparam): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiEnumFontFamiliesW(hdc.rawAddress.toString(), lplogfont.rawAddress.toString(), 0L.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumFontsA(hdc: Hdc, lplogfont: Pcstr, lpproc: Fontenumproca, lparam: Lparam): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiEnumFontsA(hdc.rawAddress.toString(), lplogfont.rawAddress.toString(), 0L.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumFontsW(hdc: Hdc, lplogfont: Pcwstr, lpproc: Fontenumprocw, lparam: Lparam): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiEnumFontsW(hdc.rawAddress.toString(), lplogfont.rawAddress.toString(), 0L.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumMetaFile(hdc: Hdc, hmf: Hmetafile, proc: Mfenumproc, param3: Lparam): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiEnumMetaFile(hdc.rawAddress.toString(), hmf.rawAddress.toString(), 0L.toString(), param3.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumObjects(hdc: Hdc, ntype: ObjType, lpfunc: Gobjenumproc, lparam: Lparam): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiEnumObjects(hdc.rawAddress.toString(), ntype, 0L.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun equalRect(lprc1: ConstPtr<Rect>, lprc2: ConstPtr<Rect>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiEqualRect(lprc1.rawAddress.toString(), lprc2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun equalRgn(hrgn1: Hrgn, hrgn2: Hrgn): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiEqualRgn(hrgn1.rawAddress.toString(), hrgn2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun excludeClipRect(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): GdiRegionType =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiExcludeClipRect(hdc.rawAddress.toString(), left, top, right, bottom) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun excludeUpdateRgn(hdc: Hdc, hwnd: Hwnd): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiExcludeUpdateRgn(hdc.rawAddress.toString(), hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extCreatePen(ipenstyle: UInt, cwidth: UInt, plbrush: ConstPtr<Logbrush>, cstyle: UInt, pstyle: ConstPtr<UInt>): Hpen =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiExtCreatePen(ipenstyle.toInt(), cwidth.toInt(), plbrush.rawAddress.toString(), cstyle.toInt(), pstyle.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extCreateRegion(lpx: ConstPtr<Xform>, ncount: UInt, lpdata: ConstPtr<Rgndata>): Hrgn =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiExtCreateRegion(lpx.rawAddress.toString(), ncount.toInt(), lpdata.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extFloodFill(hdc: Hdc, x: Int, y: Int, color: Colorref, type: ExtFloodFillType): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiExtFloodFill(hdc.rawAddress.toString(), x, y, color.toInt(), type.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extSelectClipRgn(hdc: Hdc, hrgn: Hrgn, mode: RgnCombineMode): GdiRegionType =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiExtSelectClipRgn(hdc.rawAddress.toString(), hrgn.rawAddress.toString(), mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extTextOutA(hdc: Hdc, x: Int, y: Int, options: EtoOptions, lprect: ConstPtr<Rect>, lpstring: Pcstr, c: UInt, lpdx: ConstPtr<Int>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiExtTextOutA(hdc.rawAddress.toString(), x, y, options.toInt(), lprect.rawAddress.toString(), lpstring.rawAddress.toString(), c.toInt(), lpdx.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extTextOutW(hdc: Hdc, x: Int, y: Int, options: EtoOptions, lprect: ConstPtr<Rect>, lpstring: Pcwstr, c: UInt, lpdx: ConstPtr<Int>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiExtTextOutW(hdc.rawAddress.toString(), x, y, options.toInt(), lprect.rawAddress.toString(), lpstring.rawAddress.toString(), c.toInt(), lpdx.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fillPath(hdc: Hdc): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiFillPath(hdc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fillRect(hdc: Hdc, lprc: ConstPtr<Rect>, hbr: Hbrush): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiFillRect(hdc.rawAddress.toString(), lprc.rawAddress.toString(), hbr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fillRgn(hdc: Hdc, hrgn: Hrgn, hbr: Hbrush): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiFillRgn(hdc.rawAddress.toString(), hrgn.rawAddress.toString(), hbr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fixBrushOrgEx(hdc: Hdc, x: Int, y: Int, ptl: ConstPtr<Point>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiFixBrushOrgEx(hdc.rawAddress.toString(), x, y, ptl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flattenPath(hdc: Hdc): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiFlattenPath(hdc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun floodFill(hdc: Hdc, x: Int, y: Int, color: Colorref): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiFloodFill(hdc.rawAddress.toString(), x, y, color.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun frameRect(hdc: Hdc, lprc: ConstPtr<Rect>, hbr: Hbrush): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiFrameRect(hdc.rawAddress.toString(), lprc.rawAddress.toString(), hbr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun frameRgn(hdc: Hdc, hrgn: Hrgn, hbr: Hbrush, w: Int, h: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiFrameRgn(hdc.rawAddress.toString(), hrgn.rawAddress.toString(), hbr.rawAddress.toString(), w, h) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiAlphaBlend(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, ftn: Blendfunction): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiComment(hdc: Hdc, nsize: UInt, lpdata: ConstPtr<UByte>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGdiComment(hdc.rawAddress.toString(), nsize.toInt(), lpdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiFlush(): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGdiFlush() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiGetBatchLimit(): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGdiGetBatchLimit().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiGradientFill(hdc: Hdc, pvertex: ConstPtr<Trivertex>, nvertex: UInt, pmesh: ConstPtr<CVoid>, ncount: UInt, ulmode: GradientFill): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGdiGradientFill(hdc.rawAddress.toString(), pvertex.rawAddress.toString(), nvertex.toInt(), pmesh.rawAddress.toString(), ncount.toInt(), ulmode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiSetBatchLimit(dw: UInt): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGdiSetBatchLimit(dw.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiTransparentBlt(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, crtransparent: UInt): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGdiTransparentBlt(hdcdest.rawAddress.toString(), xorigindest, yorigindest, wdest, hdest, hdcsrc.rawAddress.toString(), xoriginsrc, yoriginsrc, wsrc, hsrc, crtransparent.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getArcDirection(hdc: Hdc): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetArcDirection(hdc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAspectRatioFilterEx(hdc: Hdc, lpsize: MutPtr<Size>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetAspectRatioFilterEx(hdc.rawAddress.toString(), lpsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBitmapBits(hbit: Hbitmap, cb: Int, lpvbits: MutPtr<CVoid>): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetBitmapBits(hbit.rawAddress.toString(), cb, lpvbits.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBitmapDimensionEx(hbit: Hbitmap, lpsize: MutPtr<Size>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetBitmapDimensionEx(hbit.rawAddress.toString(), lpsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBkColor(hdc: Hdc): Colorref =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetBkColor(hdc.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBkMode(hdc: Hdc): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetBkMode(hdc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBoundsRect(hdc: Hdc, lprect: MutPtr<Rect>, flags: UInt): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetBoundsRect(hdc.rawAddress.toString(), lprect.rawAddress.toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBrushOrgEx(hdc: Hdc, lppt: MutPtr<Point>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetBrushOrgEx(hdc.rawAddress.toString(), lppt.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharABCWidthsA(hdc: Hdc, wfirst: UInt, wlast: UInt, lpabc: MutPtr<Abc>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetCharABCWidthsA(hdc.rawAddress.toString(), wfirst.toInt(), wlast.toInt(), lpabc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharABCWidthsFloatA(hdc: Hdc, ifirst: UInt, ilast: UInt, lpabc: MutPtr<Abcfloat>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetCharABCWidthsFloatA(hdc.rawAddress.toString(), ifirst.toInt(), ilast.toInt(), lpabc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharABCWidthsFloatW(hdc: Hdc, ifirst: UInt, ilast: UInt, lpabc: MutPtr<Abcfloat>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetCharABCWidthsFloatW(hdc.rawAddress.toString(), ifirst.toInt(), ilast.toInt(), lpabc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharABCWidthsI(hdc: Hdc, gifirst: UInt, cgi: UInt, pgi: ConstPtr<UShort>, pabc: MutPtr<Abc>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetCharABCWidthsI(hdc.rawAddress.toString(), gifirst.toInt(), cgi.toInt(), pgi.rawAddress.toString(), pabc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharABCWidthsW(hdc: Hdc, wfirst: UInt, wlast: UInt, lpabc: MutPtr<Abc>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetCharABCWidthsW(hdc.rawAddress.toString(), wfirst.toInt(), wlast.toInt(), lpabc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharWidth32A(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: MutPtr<Int>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetCharWidth32A(hdc.rawAddress.toString(), ifirst.toInt(), ilast.toInt(), lpbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharWidth32W(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: MutPtr<Int>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetCharWidth32W(hdc.rawAddress.toString(), ifirst.toInt(), ilast.toInt(), lpbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharWidthA(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: MutPtr<Int>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetCharWidthA(hdc.rawAddress.toString(), ifirst.toInt(), ilast.toInt(), lpbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharWidthFloatA(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: MutPtr<Float>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetCharWidthFloatA(hdc.rawAddress.toString(), ifirst.toInt(), ilast.toInt(), lpbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharWidthFloatW(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: MutPtr<Float>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetCharWidthFloatW(hdc.rawAddress.toString(), ifirst.toInt(), ilast.toInt(), lpbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharWidthI(hdc: Hdc, gifirst: UInt, cgi: UInt, pgi: ConstPtr<UShort>, piwidths: MutPtr<Int>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetCharWidthI(hdc.rawAddress.toString(), gifirst.toInt(), cgi.toInt(), pgi.rawAddress.toString(), piwidths.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharWidthW(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: MutPtr<Int>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetCharWidthW(hdc.rawAddress.toString(), ifirst.toInt(), ilast.toInt(), lpbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharacterPlacementA(hdc: Hdc, lpstring: Pcstr, ncount: Int, nmexextent: Int, lpresults: MutPtr<GcpResultsa>, dwflags: GetCharacterPlacementFlags): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetCharacterPlacementA(hdc.rawAddress.toString(), lpstring.rawAddress.toString(), ncount, nmexextent, lpresults.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharacterPlacementW(hdc: Hdc, lpstring: Pcwstr, ncount: Int, nmexextent: Int, lpresults: MutPtr<GcpResultsw>, dwflags: GetCharacterPlacementFlags): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetCharacterPlacementW(hdc.rawAddress.toString(), lpstring.rawAddress.toString(), ncount, nmexextent, lpresults.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClipBox(hdc: Hdc, lprect: MutPtr<Rect>): GdiRegionType =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetClipBox(hdc.rawAddress.toString(), lprect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClipRgn(hdc: Hdc, hrgn: Hrgn): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetClipRgn(hdc.rawAddress.toString(), hrgn.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getColorAdjustment(hdc: Hdc, lpca: MutPtr<Coloradjustment>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetColorAdjustment(hdc.rawAddress.toString(), lpca.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentObject(hdc: Hdc, type: UInt): Hgdiobj =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiGetCurrentObject(hdc.rawAddress.toString(), type.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentPositionEx(hdc: Hdc, lppt: MutPtr<Point>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetCurrentPositionEx(hdc.rawAddress.toString(), lppt.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDC(hwnd: Hwnd): Hdc =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiGetDC(hwnd.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDCBrushColor(hdc: Hdc): Colorref =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetDCBrushColor(hdc.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDCEx(hwnd: Hwnd, hrgnclip: Hrgn, flags: GetDcxFlags): Hdc =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiGetDCEx(hwnd.rawAddress.toString(), hrgnclip.rawAddress.toString(), flags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDCOrgEx(hdc: Hdc, lppt: MutPtr<Point>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetDCOrgEx(hdc.rawAddress.toString(), lppt.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDCPenColor(hdc: Hdc): Colorref =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetDCPenColor(hdc.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDIBColorTable(hdc: Hdc, istart: UInt, centries: UInt, prgbq: MutPtr<Rgbquad>): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetDIBColorTable(hdc.rawAddress.toString(), istart.toInt(), centries.toInt(), prgbq.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDIBits(hdc: Hdc, hbm: Hbitmap, start: UInt, clines: UInt, lpvbits: MutPtr<CVoid>, lpbmi: MutPtr<Bitmapinfo>, usage: DibUsage): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetDIBits(hdc.rawAddress.toString(), hbm.rawAddress.toString(), start.toInt(), clines.toInt(), lpvbits.rawAddress.toString(), lpbmi.rawAddress.toString(), usage.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeviceCaps(hdc: Hdc, index: Int): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetDeviceCaps(hdc.rawAddress.toString(), index) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnhMetaFileA(lpname: Pcstr): Henhmetafile =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiGetEnhMetaFileA(lpname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnhMetaFileBits(hemf: Henhmetafile, nsize: UInt, lpdata: MutPtr<UByte>): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetEnhMetaFileBits(hemf.rawAddress.toString(), nsize.toInt(), lpdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnhMetaFileDescriptionA(hemf: Henhmetafile, cchbuffer: UInt, lpdescription: Pstr): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetEnhMetaFileDescriptionA(hemf.rawAddress.toString(), cchbuffer.toInt(), lpdescription.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnhMetaFileDescriptionW(hemf: Henhmetafile, cchbuffer: UInt, lpdescription: Pwstr): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetEnhMetaFileDescriptionW(hemf.rawAddress.toString(), cchbuffer.toInt(), lpdescription.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnhMetaFileHeader(hemf: Henhmetafile, nsize: UInt, lpenhmetaheader: MutPtr<Enhmetaheader>): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetEnhMetaFileHeader(hemf.rawAddress.toString(), nsize.toInt(), lpenhmetaheader.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnhMetaFilePaletteEntries(hemf: Henhmetafile, nnumentries: UInt, lppaletteentries: MutPtr<Paletteentry>): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetEnhMetaFilePaletteEntries(hemf.rawAddress.toString(), nnumentries.toInt(), lppaletteentries.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnhMetaFileW(lpname: Pcwstr): Henhmetafile =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiGetEnhMetaFileW(lpname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFontData(hdc: Hdc, dwtable: UInt, dwoffset: UInt, pvbuffer: MutPtr<CVoid>, cjbuffer: UInt): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetFontData(hdc.rawAddress.toString(), dwtable.toInt(), dwoffset.toInt(), pvbuffer.rawAddress.toString(), cjbuffer.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFontLanguageInfo(hdc: Hdc): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetFontLanguageInfo(hdc.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFontUnicodeRanges(hdc: Hdc, lpgs: MutPtr<Glyphset>): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetFontUnicodeRanges(hdc.rawAddress.toString(), lpgs.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGlyphIndicesA(hdc: Hdc, lpstr: Pcstr, c: Int, pgi: MutPtr<UShort>, fl: UInt): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetGlyphIndicesA(hdc.rawAddress.toString(), lpstr.rawAddress.toString(), c, pgi.rawAddress.toString(), fl.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGlyphIndicesW(hdc: Hdc, lpstr: Pcwstr, c: Int, pgi: MutPtr<UShort>, fl: UInt): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetGlyphIndicesW(hdc.rawAddress.toString(), lpstr.rawAddress.toString(), c, pgi.rawAddress.toString(), fl.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGlyphOutlineA(hdc: Hdc, uchar: UInt, fuformat: GetGlyphOutlineFormat, lpgm: MutPtr<Glyphmetrics>, cjbuffer: UInt, pvbuffer: MutPtr<CVoid>, lpmat2: ConstPtr<Mat2>): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetGlyphOutlineA(hdc.rawAddress.toString(), uchar.toInt(), fuformat.toInt(), lpgm.rawAddress.toString(), cjbuffer.toInt(), pvbuffer.rawAddress.toString(), lpmat2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGlyphOutlineW(hdc: Hdc, uchar: UInt, fuformat: GetGlyphOutlineFormat, lpgm: MutPtr<Glyphmetrics>, cjbuffer: UInt, pvbuffer: MutPtr<CVoid>, lpmat2: ConstPtr<Mat2>): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetGlyphOutlineW(hdc.rawAddress.toString(), uchar.toInt(), fuformat.toInt(), lpgm.rawAddress.toString(), cjbuffer.toInt(), pvbuffer.rawAddress.toString(), lpmat2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGraphicsMode(hdc: Hdc): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetGraphicsMode(hdc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKerningPairsA(hdc: Hdc, npairs: UInt, lpkernpair: MutPtr<Kerningpair>): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetKerningPairsA(hdc.rawAddress.toString(), npairs.toInt(), lpkernpair.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKerningPairsW(hdc: Hdc, npairs: UInt, lpkernpair: MutPtr<Kerningpair>): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetKerningPairsW(hdc.rawAddress.toString(), npairs.toInt(), lpkernpair.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLayout(hdc: Hdc): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetLayout(hdc.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMapMode(hdc: Hdc): HdcMapMode =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetMapMode(hdc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMetaFileA(lpname: Pcstr): Hmetafile =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiGetMetaFileA(lpname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMetaFileBitsEx(hmf: Hmetafile, cbbuffer: UInt, lpdata: MutPtr<CVoid>): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetMetaFileBitsEx(hmf.rawAddress.toString(), cbbuffer.toInt(), lpdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMetaFileW(lpname: Pcwstr): Hmetafile =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiGetMetaFileW(lpname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMetaRgn(hdc: Hdc, hrgn: Hrgn): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetMetaRgn(hdc.rawAddress.toString(), hrgn.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMiterLimit(hdc: Hdc, plimit: MutPtr<Float>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetMiterLimit(hdc.rawAddress.toString(), plimit.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMonitorInfoA(hmonitor: Hmonitor, lpmi: MutPtr<Monitorinfo>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetMonitorInfoA(hmonitor.rawAddress.toString(), lpmi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMonitorInfoW(hmonitor: Hmonitor, lpmi: MutPtr<Monitorinfo>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetMonitorInfoW(hmonitor.rawAddress.toString(), lpmi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNearestColor(hdc: Hdc, color: Colorref): Colorref =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetNearestColor(hdc.rawAddress.toString(), color.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNearestPaletteIndex(h: Hpalette, color: Colorref): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetNearestPaletteIndex(h.rawAddress.toString(), color.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getObjectA(h: Hgdiobj, c: Int, pv: MutPtr<CVoid>): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetObjectA(h.rawAddress.toString(), c, pv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getObjectType(h: Hgdiobj): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetObjectType(h.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getObjectW(h: Hgdiobj, c: Int, pv: MutPtr<CVoid>): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetObjectW(h.rawAddress.toString(), c, pv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOutlineTextMetricsA(hdc: Hdc, cjcopy: UInt, potm: MutPtr<Outlinetextmetrica>): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetOutlineTextMetricsA(hdc.rawAddress.toString(), cjcopy.toInt(), potm.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOutlineTextMetricsW(hdc: Hdc, cjcopy: UInt, potm: MutPtr<Outlinetextmetricw>): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetOutlineTextMetricsW(hdc.rawAddress.toString(), cjcopy.toInt(), potm.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPaletteEntries(hpal: Hpalette, istart: UInt, centries: UInt, ppalentries: MutPtr<Paletteentry>): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetPaletteEntries(hpal.rawAddress.toString(), istart.toInt(), centries.toInt(), ppalentries.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPath(hdc: Hdc, apt: MutPtr<Point>, aj: MutPtr<UByte>, cpt: Int): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetPath(hdc.rawAddress.toString(), apt.rawAddress.toString(), aj.rawAddress.toString(), cpt) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPixel(hdc: Hdc, x: Int, y: Int): Colorref =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetPixel(hdc.rawAddress.toString(), x, y).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPolyFillMode(hdc: Hdc): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetPolyFillMode(hdc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getROP2(hdc: Hdc): R2Mode =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetROP2(hdc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRandomRgn(hdc: Hdc, hrgn: Hrgn, i: Int): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetRandomRgn(hdc.rawAddress.toString(), hrgn.rawAddress.toString(), i) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRasterizerCaps(lpraststat: MutPtr<RasterizerStatus>, cjbytes: UInt): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetRasterizerCaps(lpraststat.rawAddress.toString(), cjbytes.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRegionData(hrgn: Hrgn, ncount: UInt, lprgndata: MutPtr<Rgndata>): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetRegionData(hrgn.rawAddress.toString(), ncount.toInt(), lprgndata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRgnBox(hrgn: Hrgn, lprc: MutPtr<Rect>): GdiRegionType =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetRgnBox(hrgn.rawAddress.toString(), lprc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStockObject(i: GetStockObjectFlags): Hgdiobj =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiGetStockObject(i).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStretchBltMode(hdc: Hdc): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetStretchBltMode(hdc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSysColor(nindex: SysColorIndex): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetSysColor(nindex).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSysColorBrush(nindex: SysColorIndex): Hbrush =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiGetSysColorBrush(nindex).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemPaletteEntries(hdc: Hdc, istart: UInt, centries: UInt, ppalentries: MutPtr<Paletteentry>): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetSystemPaletteEntries(hdc.rawAddress.toString(), istart.toInt(), centries.toInt(), ppalentries.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemPaletteUse(hdc: Hdc): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetSystemPaletteUse(hdc.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTabbedTextExtentA(hdc: Hdc, lpstring: Pcstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: ConstPtr<Int>): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetTabbedTextExtentA(hdc.rawAddress.toString(), lpstring.rawAddress.toString(), chcount, ntabpositions, lpntabstoppositions.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTabbedTextExtentW(hdc: Hdc, lpstring: Pcwstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: ConstPtr<Int>): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetTabbedTextExtentW(hdc.rawAddress.toString(), lpstring.rawAddress.toString(), chcount, ntabpositions, lpntabstoppositions.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextAlign(hdc: Hdc): TextAlignOptions =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetTextAlign(hdc.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextCharacterExtra(hdc: Hdc): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetTextCharacterExtra(hdc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextColor(hdc: Hdc): Colorref =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetTextColor(hdc.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextExtentExPointA(hdc: Hdc, lpszstring: Pcstr, cchstring: Int, nmaxextent: Int, lpnfit: MutPtr<Int>, lpndx: MutPtr<Int>, lpsize: MutPtr<Size>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetTextExtentExPointA(hdc.rawAddress.toString(), lpszstring.rawAddress.toString(), cchstring, nmaxextent, lpnfit.rawAddress.toString(), lpndx.rawAddress.toString(), lpsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextExtentExPointI(hdc: Hdc, lpwszstring: ConstPtr<UShort>, cwchstring: Int, nmaxextent: Int, lpnfit: MutPtr<Int>, lpndx: MutPtr<Int>, lpsize: MutPtr<Size>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetTextExtentExPointI(hdc.rawAddress.toString(), lpwszstring.rawAddress.toString(), cwchstring, nmaxextent, lpnfit.rawAddress.toString(), lpndx.rawAddress.toString(), lpsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextExtentExPointW(hdc: Hdc, lpszstring: Pcwstr, cchstring: Int, nmaxextent: Int, lpnfit: MutPtr<Int>, lpndx: MutPtr<Int>, lpsize: MutPtr<Size>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetTextExtentExPointW(hdc.rawAddress.toString(), lpszstring.rawAddress.toString(), cchstring, nmaxextent, lpnfit.rawAddress.toString(), lpndx.rawAddress.toString(), lpsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextExtentPoint32A(hdc: Hdc, lpstring: Pcstr, c: Int, psizl: MutPtr<Size>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetTextExtentPoint32A(hdc.rawAddress.toString(), lpstring.rawAddress.toString(), c, psizl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextExtentPoint32W(hdc: Hdc, lpstring: Pcwstr, c: Int, psizl: MutPtr<Size>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetTextExtentPoint32W(hdc.rawAddress.toString(), lpstring.rawAddress.toString(), c, psizl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextExtentPointA(hdc: Hdc, lpstring: Pcstr, c: Int, lpsz: MutPtr<Size>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetTextExtentPointA(hdc.rawAddress.toString(), lpstring.rawAddress.toString(), c, lpsz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextExtentPointI(hdc: Hdc, pgiin: ConstPtr<UShort>, cgi: Int, psize: MutPtr<Size>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetTextExtentPointI(hdc.rawAddress.toString(), pgiin.rawAddress.toString(), cgi, psize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextExtentPointW(hdc: Hdc, lpstring: Pcwstr, c: Int, lpsz: MutPtr<Size>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetTextExtentPointW(hdc.rawAddress.toString(), lpstring.rawAddress.toString(), c, lpsz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextFaceA(hdc: Hdc, c: Int, lpname: Pstr): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetTextFaceA(hdc.rawAddress.toString(), c, lpname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextFaceW(hdc: Hdc, c: Int, lpname: Pwstr): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetTextFaceW(hdc.rawAddress.toString(), c, lpname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextMetricsA(hdc: Hdc, lptm: MutPtr<Textmetrica>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetTextMetricsA(hdc.rawAddress.toString(), lptm.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextMetricsW(hdc: Hdc, lptm: MutPtr<Textmetricw>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetTextMetricsW(hdc.rawAddress.toString(), lptm.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUpdateRect(hwnd: Hwnd, lprect: MutPtr<Rect>, berase: Bool): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetUpdateRect(hwnd.rawAddress.toString(), lprect.rawAddress.toString(), berase) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUpdateRgn(hwnd: Hwnd, hrgn: Hrgn, berase: Bool): GdiRegionType =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetUpdateRgn(hwnd.rawAddress.toString(), hrgn.rawAddress.toString(), berase) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getViewportExtEx(hdc: Hdc, lpsize: MutPtr<Size>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetViewportExtEx(hdc.rawAddress.toString(), lpsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getViewportOrgEx(hdc: Hdc, lppoint: MutPtr<Point>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetViewportOrgEx(hdc.rawAddress.toString(), lppoint.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWinMetaFileBits(hemf: Henhmetafile, cbdata16: UInt, pdata16: MutPtr<UByte>, imapmode: Int, hdcref: Hdc): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetWinMetaFileBits(hemf.rawAddress.toString(), cbdata16.toInt(), pdata16.rawAddress.toString(), imapmode, hdcref.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowDC(hwnd: Hwnd): Hdc =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiGetWindowDC(hwnd.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowExtEx(hdc: Hdc, lpsize: MutPtr<Size>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetWindowExtEx(hdc.rawAddress.toString(), lpsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowOrgEx(hdc: Hdc, lppoint: MutPtr<Point>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetWindowOrgEx(hdc.rawAddress.toString(), lppoint.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowRgn(hwnd: Hwnd, hrgn: Hrgn): GdiRegionType =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetWindowRgn(hwnd.rawAddress.toString(), hrgn.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowRgnBox(hwnd: Hwnd, lprc: MutPtr<Rect>): GdiRegionType =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetWindowRgnBox(hwnd.rawAddress.toString(), lprc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWorldTransform(hdc: Hdc, lpxf: MutPtr<Xform>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGetWorldTransform(hdc.rawAddress.toString(), lpxf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gradientFill(hdc: Hdc, pvertex: ConstPtr<Trivertex>, nvertex: UInt, pmesh: ConstPtr<CVoid>, nmesh: UInt, ulmode: GradientFill): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGradientFill(hdc.rawAddress.toString(), pvertex.rawAddress.toString(), nvertex.toInt(), pmesh.rawAddress.toString(), nmesh.toInt(), ulmode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun grayStringA(hdc: Hdc, hbrush: Hbrush, lpoutputfunc: Graystringproc, lpdata: Lparam, ncount: Int, x: Int, y: Int, nwidth: Int, nheight: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGrayStringA(hdc.rawAddress.toString(), hbrush.rawAddress.toString(), 0L.toString(), lpdata.toString(), ncount, x, y, nwidth, nheight) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun grayStringW(hdc: Hdc, hbrush: Hbrush, lpoutputfunc: Graystringproc, lpdata: Lparam, ncount: Int, x: Int, y: Int, nwidth: Int, nheight: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiGrayStringW(hdc.rawAddress.toString(), hbrush.rawAddress.toString(), 0L.toString(), lpdata.toString(), ncount, x, y, nwidth, nheight) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inflateRect(lprc: MutPtr<Rect>, dx: Int, dy: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiInflateRect(lprc.rawAddress.toString(), dx, dy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun intersectClipRect(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): GdiRegionType =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiIntersectClipRect(hdc.rawAddress.toString(), left, top, right, bottom) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun intersectRect(lprcdst: MutPtr<Rect>, lprcsrc1: ConstPtr<Rect>, lprcsrc2: ConstPtr<Rect>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiIntersectRect(lprcdst.rawAddress.toString(), lprcsrc1.rawAddress.toString(), lprcsrc2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun invalidateRect(hwnd: Hwnd, lprect: ConstPtr<Rect>, berase: Bool): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiInvalidateRect(hwnd.rawAddress.toString(), lprect.rawAddress.toString(), berase) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun invalidateRgn(hwnd: Hwnd, hrgn: Hrgn, berase: Bool): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiInvalidateRgn(hwnd.rawAddress.toString(), hrgn.rawAddress.toString(), berase) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun invertRect(hdc: Hdc, lprc: ConstPtr<Rect>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiInvertRect(hdc.rawAddress.toString(), lprc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun invertRgn(hdc: Hdc, hrgn: Hrgn): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiInvertRgn(hdc.rawAddress.toString(), hrgn.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isRectEmpty(lprc: ConstPtr<Rect>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiIsRectEmpty(lprc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lPtoDP(hdc: Hdc, lppt: MutPtr<Point>, c: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiLPtoDP(hdc.rawAddress.toString(), lppt.rawAddress.toString(), c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineDDA(xstart: Int, ystart: Int, xend: Int, yend: Int, lpproc: Lineddaproc, data: Lparam): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiLineDDA(xstart, ystart, xend, yend, 0L.toString(), data.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineTo(hdc: Hdc, x: Int, y: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiLineTo(hdc.rawAddress.toString(), x, y) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadBitmapA(hinstance: Hinstance, lpbitmapname: Pcstr): Hbitmap =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiLoadBitmapA(hinstance.rawAddress.toString(), lpbitmapname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadBitmapW(hinstance: Hinstance, lpbitmapname: Pcwstr): Hbitmap =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiLoadBitmapW(hinstance.rawAddress.toString(), lpbitmapname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lockWindowUpdate(hwndlock: Hwnd): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiLockWindowUpdate(hwndlock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapWindowPoints(hwndfrom: Hwnd, hwndto: Hwnd, lppoints: MutPtr<Point>, cpoints: UInt): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiMapWindowPoints(hwndfrom.rawAddress.toString(), hwndto.rawAddress.toString(), lppoints.rawAddress.toString(), cpoints.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun maskBlt(hdcdest: Hdc, xdest: Int, ydest: Int, width: Int, height: Int, hdcsrc: Hdc, xsrc: Int, ysrc: Int, hbmmask: Hbitmap, xmask: Int, ymask: Int, rop: UInt): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiMaskBlt(hdcdest.rawAddress.toString(), xdest, ydest, width, height, hdcsrc.rawAddress.toString(), xsrc, ysrc, hbmmask.rawAddress.toString(), xmask, ymask, rop.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mergeFontPackage(puchmergefontbuffer: ConstPtr<UByte>, ulmergefontbuffersize: UInt, puchfontpackagebuffer: ConstPtr<UByte>, ulfontpackagebuffersize: UInt, ppuchdestbuffer: MutPtr<MutPtr<UByte>>, puldestbuffersize: MutPtr<UInt>, pulbyteswritten: MutPtr<UInt>, usmode: UShort, lpfnallocate: CfpAllocproc, lpfnreallocate: CfpReallocproc, lpfnfree: CfpFreeproc, lpvreserved: MutPtr<CVoid>): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiMergeFontPackage(puchmergefontbuffer.rawAddress.toString(), ulmergefontbuffersize.toInt(), puchfontpackagebuffer.rawAddress.toString(), ulfontpackagebuffersize.toInt(), ppuchdestbuffer.rawAddress.toString(), puldestbuffersize.rawAddress.toString(), pulbyteswritten.rawAddress.toString(), usmode.toInt(), 0L.toString(), 0L.toString(), 0L.toString(), lpvreserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun modifyWorldTransform(hdc: Hdc, lpxf: ConstPtr<Xform>, mode: ModifyWorldTransformMode): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiModifyWorldTransform(hdc.rawAddress.toString(), lpxf.rawAddress.toString(), mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun monitorFromPoint(pt: Point, dwflags: MonitorFromFlags): Hmonitor =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun monitorFromRect(lprc: ConstPtr<Rect>, dwflags: MonitorFromFlags): Hmonitor =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiMonitorFromRect(lprc.rawAddress.toString(), dwflags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun monitorFromWindow(hwnd: Hwnd, dwflags: MonitorFromFlags): Hmonitor =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiMonitorFromWindow(hwnd.rawAddress.toString(), dwflags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveToEx(hdc: Hdc, x: Int, y: Int, lppt: MutPtr<Point>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiMoveToEx(hdc.rawAddress.toString(), x, y, lppt.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun offsetClipRgn(hdc: Hdc, x: Int, y: Int): GdiRegionType =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiOffsetClipRgn(hdc.rawAddress.toString(), x, y) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun offsetRect(lprc: MutPtr<Rect>, dx: Int, dy: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiOffsetRect(lprc.rawAddress.toString(), dx, dy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun offsetRgn(hrgn: Hrgn, x: Int, y: Int): GdiRegionType =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiOffsetRgn(hrgn.rawAddress.toString(), x, y) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun offsetViewportOrgEx(hdc: Hdc, x: Int, y: Int, lppt: MutPtr<Point>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiOffsetViewportOrgEx(hdc.rawAddress.toString(), x, y, lppt.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun offsetWindowOrgEx(hdc: Hdc, x: Int, y: Int, lppt: MutPtr<Point>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiOffsetWindowOrgEx(hdc.rawAddress.toString(), x, y, lppt.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun paintDesktop(hdc: Hdc): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiPaintDesktop(hdc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun paintRgn(hdc: Hdc, hrgn: Hrgn): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiPaintRgn(hdc.rawAddress.toString(), hrgn.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun patBlt(hdc: Hdc, x: Int, y: Int, w: Int, h: Int, rop: RopCode): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiPatBlt(hdc.rawAddress.toString(), x, y, w, h, rop.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathToRegion(hdc: Hdc): Hrgn =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiPathToRegion(hdc.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pie(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int, xr1: Int, yr1: Int, xr2: Int, yr2: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiPie(hdc.rawAddress.toString(), left, top, right, bottom, xr1, yr1, xr2, yr2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun playEnhMetaFile(hdc: Hdc, hmf: Henhmetafile, lprect: ConstPtr<Rect>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiPlayEnhMetaFile(hdc.rawAddress.toString(), hmf.rawAddress.toString(), lprect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun playEnhMetaFileRecord(hdc: Hdc, pht: ConstPtr<Handletable>, pmr: ConstPtr<Enhmetarecord>, cht: UInt): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiPlayEnhMetaFileRecord(hdc.rawAddress.toString(), pht.rawAddress.toString(), pmr.rawAddress.toString(), cht.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun playMetaFile(hdc: Hdc, hmf: Hmetafile): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiPlayMetaFile(hdc.rawAddress.toString(), hmf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun playMetaFileRecord(hdc: Hdc, lphandletable: ConstPtr<Handletable>, lpmr: ConstPtr<Metarecord>, noobjs: UInt): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiPlayMetaFileRecord(hdc.rawAddress.toString(), lphandletable.rawAddress.toString(), lpmr.rawAddress.toString(), noobjs.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun plgBlt(hdcdest: Hdc, lppoint: ConstPtr<Point>, hdcsrc: Hdc, xsrc: Int, ysrc: Int, width: Int, height: Int, hbmmask: Hbitmap, xmask: Int, ymask: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiPlgBlt(hdcdest.rawAddress.toString(), lppoint.rawAddress.toString(), hdcsrc.rawAddress.toString(), xsrc, ysrc, width, height, hbmmask.rawAddress.toString(), xmask, ymask) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun polyBezier(hdc: Hdc, apt: ConstPtr<Point>, cpt: UInt): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiPolyBezier(hdc.rawAddress.toString(), apt.rawAddress.toString(), cpt.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun polyBezierTo(hdc: Hdc, apt: ConstPtr<Point>, cpt: UInt): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiPolyBezierTo(hdc.rawAddress.toString(), apt.rawAddress.toString(), cpt.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun polyDraw(hdc: Hdc, apt: ConstPtr<Point>, aj: ConstPtr<UByte>, cpt: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiPolyDraw(hdc.rawAddress.toString(), apt.rawAddress.toString(), aj.rawAddress.toString(), cpt) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun polyPolygon(hdc: Hdc, apt: ConstPtr<Point>, asz: ConstPtr<Int>, csz: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiPolyPolygon(hdc.rawAddress.toString(), apt.rawAddress.toString(), asz.rawAddress.toString(), csz) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun polyPolyline(hdc: Hdc, apt: ConstPtr<Point>, asz: ConstPtr<UInt>, csz: UInt): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiPolyPolyline(hdc.rawAddress.toString(), apt.rawAddress.toString(), asz.rawAddress.toString(), csz.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun polyTextOutA(hdc: Hdc, ppt: ConstPtr<Polytexta>, nstrings: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiPolyTextOutA(hdc.rawAddress.toString(), ppt.rawAddress.toString(), nstrings) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun polyTextOutW(hdc: Hdc, ppt: ConstPtr<Polytextw>, nstrings: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiPolyTextOutW(hdc.rawAddress.toString(), ppt.rawAddress.toString(), nstrings) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun polygon(hdc: Hdc, apt: ConstPtr<Point>, cpt: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiPolygon(hdc.rawAddress.toString(), apt.rawAddress.toString(), cpt) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun polyline(hdc: Hdc, apt: ConstPtr<Point>, cpt: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiPolyline(hdc.rawAddress.toString(), apt.rawAddress.toString(), cpt) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun polylineTo(hdc: Hdc, apt: ConstPtr<Point>, cpt: UInt): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiPolylineTo(hdc.rawAddress.toString(), apt.rawAddress.toString(), cpt.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptInRect(lprc: ConstPtr<Rect>, pt: Point): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptInRegion(hrgn: Hrgn, x: Int, y: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiPtInRegion(hrgn.rawAddress.toString(), x, y) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptVisible(hdc: Hdc, x: Int, y: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiPtVisible(hdc.rawAddress.toString(), x, y) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realizePalette(hdc: Hdc): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiRealizePalette(hdc.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rectInRegion(hrgn: Hrgn, lprect: ConstPtr<Rect>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiRectInRegion(hrgn.rawAddress.toString(), lprect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rectVisible(hdc: Hdc, lprect: ConstPtr<Rect>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiRectVisible(hdc.rawAddress.toString(), lprect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rectangle(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiRectangle(hdc.rawAddress.toString(), left, top, right, bottom) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun redrawWindow(hwnd: Hwnd, lprcupdate: ConstPtr<Rect>, hrgnupdate: Hrgn, flags: RedrawWindowFlags): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiRedrawWindow(hwnd.rawAddress.toString(), lprcupdate.rawAddress.toString(), hrgnupdate.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseDC(hwnd: Hwnd, hdc: Hdc): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiReleaseDC(hwnd.rawAddress.toString(), hdc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeFontMemResourceEx(h: Handle): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiRemoveFontMemResourceEx(h.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeFontResourceA(lpfilename: Pcstr): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiRemoveFontResourceA(lpfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeFontResourceExA(name: Pcstr, fl: UInt, pdv: ConstPtr<CVoid>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiRemoveFontResourceExA(name.rawAddress.toString(), fl.toInt(), pdv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeFontResourceExW(name: Pcwstr, fl: UInt, pdv: ConstPtr<CVoid>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiRemoveFontResourceExW(name.rawAddress.toString(), fl.toInt(), pdv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeFontResourceW(lpfilename: Pcwstr): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiRemoveFontResourceW(lpfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resetDCA(hdc: Hdc, lpdm: ConstPtr<Devmodea>): Hdc =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiResetDCA(hdc.rawAddress.toString(), lpdm.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resetDCW(hdc: Hdc, lpdm: ConstPtr<Devmodew>): Hdc =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiResetDCW(hdc.rawAddress.toString(), lpdm.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resizePalette(hpal: Hpalette, n: UInt): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiResizePalette(hpal.rawAddress.toString(), n.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun restoreDC(hdc: Hdc, nsaveddc: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiRestoreDC(hdc.rawAddress.toString(), nsaveddc) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun roundRect(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int, width: Int, height: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiRoundRect(hdc.rawAddress.toString(), left, top, right, bottom, width, height) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saveDC(hdc: Hdc): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSaveDC(hdc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scaleViewportExtEx(hdc: Hdc, xn: Int, dx: Int, yn: Int, yd: Int, lpsz: MutPtr<Size>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiScaleViewportExtEx(hdc.rawAddress.toString(), xn, dx, yn, yd, lpsz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scaleWindowExtEx(hdc: Hdc, xn: Int, xd: Int, yn: Int, yd: Int, lpsz: MutPtr<Size>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiScaleWindowExtEx(hdc.rawAddress.toString(), xn, xd, yn, yd, lpsz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun screenToClient(hwnd: Hwnd, lppoint: MutPtr<Point>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiScreenToClient(hwnd.rawAddress.toString(), lppoint.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun selectClipPath(hdc: Hdc, mode: RgnCombineMode): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSelectClipPath(hdc.rawAddress.toString(), mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun selectClipRgn(hdc: Hdc, hrgn: Hrgn): GdiRegionType =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSelectClipRgn(hdc.rawAddress.toString(), hrgn.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun selectObject(hdc: Hdc, h: Hgdiobj): Hgdiobj =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiSelectObject(hdc.rawAddress.toString(), h.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun selectPalette(hdc: Hdc, hpal: Hpalette, bforcebkgd: Bool): Hpalette =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiSelectPalette(hdc.rawAddress.toString(), hpal.rawAddress.toString(), bforcebkgd).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setArcDirection(hdc: Hdc, dir: ArcDirection): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetArcDirection(hdc.rawAddress.toString(), dir) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setBitmapBits(hbm: Hbitmap, cb: UInt, pvbits: ConstPtr<CVoid>): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetBitmapBits(hbm.rawAddress.toString(), cb.toInt(), pvbits.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setBitmapDimensionEx(hbm: Hbitmap, w: Int, h: Int, lpsz: MutPtr<Size>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetBitmapDimensionEx(hbm.rawAddress.toString(), w, h, lpsz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setBkColor(hdc: Hdc, color: Colorref): Colorref =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetBkColor(hdc.rawAddress.toString(), color.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setBkMode(hdc: Hdc, mode: Int): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetBkMode(hdc.rawAddress.toString(), mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setBoundsRect(hdc: Hdc, lprect: ConstPtr<Rect>, flags: SetBoundsRectFlags): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetBoundsRect(hdc.rawAddress.toString(), lprect.rawAddress.toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setBrushOrgEx(hdc: Hdc, x: Int, y: Int, lppt: MutPtr<Point>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetBrushOrgEx(hdc.rawAddress.toString(), x, y, lppt.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setColorAdjustment(hdc: Hdc, lpca: ConstPtr<Coloradjustment>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetColorAdjustment(hdc.rawAddress.toString(), lpca.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDCBrushColor(hdc: Hdc, color: Colorref): Colorref =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetDCBrushColor(hdc.rawAddress.toString(), color.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDCPenColor(hdc: Hdc, color: Colorref): Colorref =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetDCPenColor(hdc.rawAddress.toString(), color.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDIBColorTable(hdc: Hdc, istart: UInt, centries: UInt, prgbq: ConstPtr<Rgbquad>): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetDIBColorTable(hdc.rawAddress.toString(), istart.toInt(), centries.toInt(), prgbq.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDIBits(hdc: Hdc, hbm: Hbitmap, start: UInt, clines: UInt, lpbits: ConstPtr<CVoid>, lpbmi: ConstPtr<Bitmapinfo>, coloruse: DibUsage): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetDIBits(hdc.rawAddress.toString(), hbm.rawAddress.toString(), start.toInt(), clines.toInt(), lpbits.rawAddress.toString(), lpbmi.rawAddress.toString(), coloruse.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDIBitsToDevice(hdc: Hdc, xdest: Int, ydest: Int, w: UInt, h: UInt, xsrc: Int, ysrc: Int, startscan: UInt, clines: UInt, lpvbits: ConstPtr<CVoid>, lpbmi: ConstPtr<Bitmapinfo>, coloruse: DibUsage): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetDIBitsToDevice(hdc.rawAddress.toString(), xdest, ydest, w.toInt(), h.toInt(), xsrc, ysrc, startscan.toInt(), clines.toInt(), lpvbits.rawAddress.toString(), lpbmi.rawAddress.toString(), coloruse.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEnhMetaFileBits(nsize: UInt, pb: ConstPtr<UByte>): Henhmetafile =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiSetEnhMetaFileBits(nsize.toInt(), pb.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setGraphicsMode(hdc: Hdc, imode: GraphicsMode): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetGraphicsMode(hdc.rawAddress.toString(), imode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setLayout(hdc: Hdc, l: DcLayout): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetLayout(hdc.rawAddress.toString(), l.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMapMode(hdc: Hdc, imode: HdcMapMode): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetMapMode(hdc.rawAddress.toString(), imode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMapperFlags(hdc: Hdc, flags: UInt): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetMapperFlags(hdc.rawAddress.toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMetaFileBitsEx(cbbuffer: UInt, lpdata: ConstPtr<UByte>): Hmetafile =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiSetMetaFileBitsEx(cbbuffer.toInt(), lpdata.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMetaRgn(hdc: Hdc): GdiRegionType =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetMetaRgn(hdc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMiterLimit(hdc: Hdc, limit: Float, old: MutPtr<Float>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetMiterLimit(hdc.rawAddress.toString(), limit.toDouble(), old.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPaletteEntries(hpal: Hpalette, istart: UInt, centries: UInt, ppalentries: ConstPtr<Paletteentry>): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetPaletteEntries(hpal.rawAddress.toString(), istart.toInt(), centries.toInt(), ppalentries.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPixel(hdc: Hdc, x: Int, y: Int, color: Colorref): Colorref =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetPixel(hdc.rawAddress.toString(), x, y, color.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPixelV(hdc: Hdc, x: Int, y: Int, color: Colorref): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetPixelV(hdc.rawAddress.toString(), x, y, color.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPolyFillMode(hdc: Hdc, mode: CreatePolygonRgnMode): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetPolyFillMode(hdc.rawAddress.toString(), mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setROP2(hdc: Hdc, rop2: R2Mode): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetROP2(hdc.rawAddress.toString(), rop2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setRect(lprc: MutPtr<Rect>, xleft: Int, ytop: Int, xright: Int, ybottom: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetRect(lprc.rawAddress.toString(), xleft, ytop, xright, ybottom) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setRectEmpty(lprc: MutPtr<Rect>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetRectEmpty(lprc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setRectRgn(hrgn: Hrgn, left: Int, top: Int, right: Int, bottom: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetRectRgn(hrgn.rawAddress.toString(), left, top, right, bottom) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setStretchBltMode(hdc: Hdc, mode: StretchBltMode): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetStretchBltMode(hdc.rawAddress.toString(), mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSysColors(celements: Int, lpaelements: ConstPtr<Int>, lpargbvalues: ConstPtr<Colorref>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetSysColors(celements, lpaelements.rawAddress.toString(), lpargbvalues.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSystemPaletteUse(hdc: Hdc, use: SystemPaletteUse): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetSystemPaletteUse(hdc.rawAddress.toString(), use.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTextAlign(hdc: Hdc, align: TextAlignOptions): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetTextAlign(hdc.rawAddress.toString(), align.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTextCharacterExtra(hdc: Hdc, extra: Int): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetTextCharacterExtra(hdc.rawAddress.toString(), extra) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTextColor(hdc: Hdc, color: Colorref): Colorref =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetTextColor(hdc.rawAddress.toString(), color.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTextJustification(hdc: Hdc, extra: Int, count: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetTextJustification(hdc.rawAddress.toString(), extra, count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setViewportExtEx(hdc: Hdc, x: Int, y: Int, lpsz: MutPtr<Size>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetViewportExtEx(hdc.rawAddress.toString(), x, y, lpsz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setViewportOrgEx(hdc: Hdc, x: Int, y: Int, lppt: MutPtr<Point>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetViewportOrgEx(hdc.rawAddress.toString(), x, y, lppt.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowExtEx(hdc: Hdc, x: Int, y: Int, lpsz: MutPtr<Size>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetWindowExtEx(hdc.rawAddress.toString(), x, y, lpsz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowOrgEx(hdc: Hdc, x: Int, y: Int, lppt: MutPtr<Point>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetWindowOrgEx(hdc.rawAddress.toString(), x, y, lppt.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowRgn(hwnd: Hwnd, hrgn: Hrgn, bredraw: Bool): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetWindowRgn(hwnd.rawAddress.toString(), hrgn.rawAddress.toString(), bredraw) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWorldTransform(hdc: Hdc, lpxf: ConstPtr<Xform>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSetWorldTransform(hdc.rawAddress.toString(), lpxf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stretchBlt(hdcdest: Hdc, xdest: Int, ydest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xsrc: Int, ysrc: Int, wsrc: Int, hsrc: Int, rop: RopCode): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiStretchBlt(hdcdest.rawAddress.toString(), xdest, ydest, wdest, hdest, hdcsrc.rawAddress.toString(), xsrc, ysrc, wsrc, hsrc, rop.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stretchDIBits(hdc: Hdc, xdest: Int, ydest: Int, destwidth: Int, destheight: Int, xsrc: Int, ysrc: Int, srcwidth: Int, srcheight: Int, lpbits: ConstPtr<CVoid>, lpbmi: ConstPtr<Bitmapinfo>, iusage: DibUsage, rop: RopCode): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiStretchDIBits(hdc.rawAddress.toString(), xdest, ydest, destwidth, destheight, xsrc, ysrc, srcwidth, srcheight, lpbits.rawAddress.toString(), lpbmi.rawAddress.toString(), iusage.toInt(), rop.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strokeAndFillPath(hdc: Hdc): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiStrokeAndFillPath(hdc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strokePath(hdc: Hdc): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiStrokePath(hdc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun subtractRect(lprcdst: MutPtr<Rect>, lprcsrc1: ConstPtr<Rect>, lprcsrc2: ConstPtr<Rect>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiSubtractRect(lprcdst.rawAddress.toString(), lprcsrc1.rawAddress.toString(), lprcsrc2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTCharToUnicode(hdc: Hdc, puccharcodes: ConstPtr<UByte>, ulcharcodesize: UInt, pusshortcodes: MutPtr<UShort>, ulshortcodesize: UInt, ulflags: UInt): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiTTCharToUnicode(hdc.rawAddress.toString(), puccharcodes.rawAddress.toString(), ulcharcodesize.toInt(), pusshortcodes.rawAddress.toString(), ulshortcodesize.toInt(), ulflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTDeleteEmbeddedFont(hfontreference: Handle, ulflags: UInt, pulstatus: MutPtr<UInt>): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiTTDeleteEmbeddedFont(hfontreference.rawAddress.toString(), ulflags.toInt(), pulstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTEmbedFont(hdc: Hdc, ulflags: TtembedFlags, ulcharset: EmbedFontCharset, pulprivstatus: MutPtr<EmbeddedFontPrivStatus>, pulstatus: MutPtr<UInt>, lpfnwritetostream: Writeembedproc, lpvwritestream: ConstPtr<CVoid>, puscharcodeset: ConstPtr<UShort>, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: ConstPtr<Ttembedinfo>): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiTTEmbedFont(hdc.rawAddress.toString(), ulflags.toInt(), ulcharset.toInt(), pulprivstatus.rawAddress.toString(), pulstatus.rawAddress.toString(), 0L.toString(), lpvwritestream.rawAddress.toString(), puscharcodeset.rawAddress.toString(), uscharcodecount.toInt(), uslanguage.toInt(), pttembedinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTEmbedFontEx(hdc: Hdc, ulflags: TtembedFlags, ulcharset: EmbedFontCharset, pulprivstatus: MutPtr<EmbeddedFontPrivStatus>, pulstatus: MutPtr<UInt>, lpfnwritetostream: Writeembedproc, lpvwritestream: ConstPtr<CVoid>, pulcharcodeset: ConstPtr<UInt>, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: ConstPtr<Ttembedinfo>): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiTTEmbedFontEx(hdc.rawAddress.toString(), ulflags.toInt(), ulcharset.toInt(), pulprivstatus.rawAddress.toString(), pulstatus.rawAddress.toString(), 0L.toString(), lpvwritestream.rawAddress.toString(), pulcharcodeset.rawAddress.toString(), uscharcodecount.toInt(), uslanguage.toInt(), pttembedinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTEmbedFontFromFileA(hdc: Hdc, szfontfilename: Pcstr, usttcindex: UShort, ulflags: TtembedFlags, ulcharset: EmbedFontCharset, pulprivstatus: MutPtr<EmbeddedFontPrivStatus>, pulstatus: MutPtr<UInt>, lpfnwritetostream: Writeembedproc, lpvwritestream: ConstPtr<CVoid>, puscharcodeset: ConstPtr<UShort>, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: ConstPtr<Ttembedinfo>): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiTTEmbedFontFromFileA(hdc.rawAddress.toString(), szfontfilename.rawAddress.toString(), usttcindex.toInt(), ulflags.toInt(), ulcharset.toInt(), pulprivstatus.rawAddress.toString(), pulstatus.rawAddress.toString(), 0L.toString(), lpvwritestream.rawAddress.toString(), puscharcodeset.rawAddress.toString(), uscharcodecount.toInt(), uslanguage.toInt(), pttembedinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTEnableEmbeddingForFacename(lpszfacename: Pcstr, benable: Bool): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiTTEnableEmbeddingForFacename(lpszfacename.rawAddress.toString(), benable) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTGetEmbeddedFontInfo(ulflags: TtembedFlags, pulprivstatus: MutPtr<UInt>, ulprivs: FontLicensePrivs, pulstatus: MutPtr<UInt>, lpfnreadfromstream: Readembedproc, lpvreadstream: ConstPtr<CVoid>, pttloadinfo: ConstPtr<Ttloadinfo>): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiTTGetEmbeddedFontInfo(ulflags.toInt(), pulprivstatus.rawAddress.toString(), ulprivs.toInt(), pulstatus.rawAddress.toString(), 0L.toString(), lpvreadstream.rawAddress.toString(), pttloadinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTGetEmbeddingType(hdc: Hdc, pulembedtype: MutPtr<EmbeddedFontPrivStatus>): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiTTGetEmbeddingType(hdc.rawAddress.toString(), pulembedtype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTGetNewFontName(phfontreference: ConstPtr<Handle>, wzwinfamilyname: Pwstr, cchmaxwinname: Int, szmacfamilyname: Pstr, cchmaxmacname: Int): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiTTGetNewFontName(phfontreference.rawAddress.toString(), wzwinfamilyname.rawAddress.toString(), cchmaxwinname, szmacfamilyname.rawAddress.toString(), cchmaxmacname) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTIsEmbeddingEnabled(hdc: Hdc, pbenabled: MutPtr<Bool>): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiTTIsEmbeddingEnabled(hdc.rawAddress.toString(), pbenabled.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTIsEmbeddingEnabledForFacename(lpszfacename: Pcstr, pbenabled: MutPtr<Bool>): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiTTIsEmbeddingEnabledForFacename(lpszfacename.rawAddress.toString(), pbenabled.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTLoadEmbeddedFont(phfontreference: MutPtr<Handle>, ulflags: UInt, pulprivstatus: MutPtr<EmbeddedFontPrivStatus>, ulprivs: FontLicensePrivs, pulstatus: MutPtr<TtloadEmbeddedFontStatus>, lpfnreadfromstream: Readembedproc, lpvreadstream: ConstPtr<CVoid>, szwinfamilyname: Pcwstr, szmacfamilyname: Pcstr, pttloadinfo: ConstPtr<Ttloadinfo>): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiTTLoadEmbeddedFont(phfontreference.rawAddress.toString(), ulflags.toInt(), pulprivstatus.rawAddress.toString(), ulprivs.toInt(), pulstatus.rawAddress.toString(), 0L.toString(), lpvreadstream.rawAddress.toString(), szwinfamilyname.rawAddress.toString(), szmacfamilyname.rawAddress.toString(), pttloadinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTRunValidationTests(hdc: Hdc, ptestparam: ConstPtr<Ttvalidationtestsparams>): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiTTRunValidationTests(hdc.rawAddress.toString(), ptestparam.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTRunValidationTestsEx(hdc: Hdc, ptestparam: ConstPtr<Ttvalidationtestsparamsex>): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiTTRunValidationTestsEx(hdc.rawAddress.toString(), ptestparam.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tabbedTextOutA(hdc: Hdc, x: Int, y: Int, lpstring: Pcstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: ConstPtr<Int>, ntaborigin: Int): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiTabbedTextOutA(hdc.rawAddress.toString(), x, y, lpstring.rawAddress.toString(), chcount, ntabpositions, lpntabstoppositions.rawAddress.toString(), ntaborigin) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tabbedTextOutW(hdc: Hdc, x: Int, y: Int, lpstring: Pcwstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: ConstPtr<Int>, ntaborigin: Int): Int =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiTabbedTextOutW(hdc.rawAddress.toString(), x, y, lpstring.rawAddress.toString(), chcount, ntabpositions, lpntabstoppositions.rawAddress.toString(), ntaborigin) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textOutA(hdc: Hdc, x: Int, y: Int, lpstring: Pcstr, c: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiTextOutA(hdc.rawAddress.toString(), x, y, lpstring.rawAddress.toString(), c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textOutW(hdc: Hdc, x: Int, y: Int, lpstring: Pcwstr, c: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiTextOutW(hdc.rawAddress.toString(), x, y, lpstring.rawAddress.toString(), c) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun transparentBlt(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, crtransparent: UInt): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiTransparentBlt(hdcdest.rawAddress.toString(), xorigindest, yorigindest, wdest, hdest, hdcsrc.rawAddress.toString(), xoriginsrc, yoriginsrc, wsrc, hsrc, crtransparent.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unionRect(lprcdst: MutPtr<Rect>, lprcsrc1: ConstPtr<Rect>, lprcsrc2: ConstPtr<Rect>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiUnionRect(lprcdst.rawAddress.toString(), lprcsrc1.rawAddress.toString(), lprcsrc2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unrealizeObject(h: Hgdiobj): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiUnrealizeObject(h.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateColors(hdc: Hdc): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiUpdateColors(hdc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateWindow(hwnd: Hwnd): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiUpdateWindow(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun validateRect(hwnd: Hwnd, lprect: ConstPtr<Rect>): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiValidateRect(hwnd.rawAddress.toString(), lprect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun validateRgn(hwnd: Hwnd, hrgn: Hrgn): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiValidateRgn(hwnd.rawAddress.toString(), hrgn.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun widenPath(hdc: Hdc): Bool =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiWidenPath(hdc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun windowFromDC(hdc: Hdc): Hwnd =
    if (windowsWin32GraphicsGdiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiWindowFromDC(hdc.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglSwapMultipleBuffers(param0: UInt, param1: ConstPtr<Wglswap>): UInt =
    if (windowsWin32GraphicsGdiNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiWglSwapMultipleBuffers(param0.toInt(), param1.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
