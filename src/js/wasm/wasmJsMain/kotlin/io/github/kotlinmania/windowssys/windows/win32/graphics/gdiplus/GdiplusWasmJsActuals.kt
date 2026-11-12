@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Bitmapinfo
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Henhmetafile
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hmetafile
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hpalette
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hrgn
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Logfonta
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Logfontw
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32GraphicsGdiplusNapiAddon(): Boolean

private val windowsWin32GraphicsGdiplusNapiAvailable: Boolean = initWindowsWin32GraphicsGdiplusNapiAddon()

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipAddPathArc(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathArc(p0: String, p1: Double, p2: Double, p3: Double, p4: Double, p5: Double, p6: Double): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipAddPathArcI(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathArcI(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Double, p6: Double): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipAddPathBezier(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathBezier(p0: String, p1: Double, p2: Double, p3: Double, p4: Double, p5: Double, p6: Double, p7: Double, p8: Double): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipAddPathBezierI(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathBezierI(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipAddPathBeziers(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathBeziers(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipAddPathBeziersI(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathBeziersI(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurve(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurve(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurve2(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurve2(p0: String, p1: String, p2: Int, p3: Double): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurve2I(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurve2I(p0: String, p1: String, p2: Int, p3: Double): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurveI(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurveI(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve2(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve2(p0: String, p1: String, p2: Int, p3: Double): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve2I(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve2I(p0: String, p1: String, p2: Int, p3: Double): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve3(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve3(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Double): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve3I(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve3I(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Double): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurveI(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathCurveI(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipAddPathEllipse(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathEllipse(p0: String, p1: Double, p2: Double, p3: Double, p4: Double): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipAddPathEllipseI(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathEllipseI(p0: String, p1: Int, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipAddPathLine(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathLine(p0: String, p1: Double, p2: Double, p3: Double, p4: Double): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipAddPathLine2(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathLine2(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipAddPathLine2I(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathLine2I(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipAddPathLineI(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathLineI(p0: String, p1: Int, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipAddPathPath(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathPath(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipAddPathPie(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathPie(p0: String, p1: Double, p2: Double, p3: Double, p4: Double, p5: Double, p6: Double): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipAddPathPieI(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathPieI(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Double, p6: Double): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipAddPathPolygon(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathPolygon(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipAddPathPolygonI(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathPolygonI(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipAddPathRectangle(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathRectangle(p0: String, p1: Double, p2: Double, p3: Double, p4: Double): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipAddPathRectangleI(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathRectangleI(p0: String, p1: Int, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipAddPathRectangles(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathRectangles(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipAddPathRectanglesI(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathRectanglesI(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipAddPathString(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathString(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Double, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipAddPathStringI(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathStringI(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Double, p6: String, p7: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipAlloc(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipAlloc(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipBeginContainer(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipBeginContainer(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipBeginContainer2(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipBeginContainer2(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipBeginContainerI(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipBeginContainerI(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipBitmapApplyEffect(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipBitmapApplyEffect(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipBitmapConvertFormat(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipBitmapConvertFormat(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Double): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipBitmapCreateApplyEffect(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipBitmapCreateApplyEffect(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipBitmapGetHistogram(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipBitmapGetHistogram(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipBitmapGetHistogramSize(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipBitmapGetHistogramSize(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipBitmapGetPixel(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipBitmapGetPixel(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipBitmapLockBits(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipBitmapLockBits(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipBitmapSetPixel(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipBitmapSetPixel(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipBitmapSetResolution(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipBitmapSetResolution(p0: String, p1: Double, p2: Double): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipBitmapUnlockBits(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipBitmapUnlockBits(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipClearPathMarkers(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipClearPathMarkers(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCloneBitmapArea(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCloneBitmapArea(p0: Double, p1: Double, p2: Double, p3: Double, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCloneBitmapAreaI(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCloneBitmapAreaI(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCloneBrush(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCloneBrush(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCloneCustomLineCap(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCloneCustomLineCap(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCloneFont(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCloneFont(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCloneFontFamily(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCloneFontFamily(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCloneImage(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCloneImage(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCloneImageAttributes(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCloneImageAttributes(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCloneMatrix(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCloneMatrix(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipClonePath(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipClonePath(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipClonePen(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipClonePen(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCloneRegion(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCloneRegion(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCloneStringFormat(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCloneStringFormat(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipClosePathFigure(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipClosePathFigure(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipClosePathFigures(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipClosePathFigures(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCombineRegionPath(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCombineRegionPath(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCombineRegionRect(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCombineRegionRect(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCombineRegionRectI(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCombineRegionRectI(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCombineRegionRegion(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCombineRegionRegion(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipComment(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipComment(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipConvertToEmfPlus(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipConvertToEmfPlus(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipConvertToEmfPlusToFile(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipConvertToEmfPlusToFile(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipConvertToEmfPlusToStream(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipConvertToEmfPlusToStream(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateAdjustableArrowCap(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateAdjustableArrowCap(p0: Double, p1: Double, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromFile(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromFile(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromFileICM(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromFileICM(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromGdiDib(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromGdiDib(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromGraphics(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromGraphics(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromHBITMAP(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromHBITMAP(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromHICON(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromHICON(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromResource(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromResource(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromScan0(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromScan0(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromStream(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromStream(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromStreamICM(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromStreamICM(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateCachedBitmap(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateCachedBitmap(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateCustomLineCap(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateCustomLineCap(p0: String, p1: String, p2: Int, p3: Double, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateFont(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateFont(p0: String, p1: Double, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateFontFamilyFromName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateFontFamilyFromName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateFontFromDC(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateFontFromDC(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateFontFromLogfontA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateFontFromLogfontA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateFontFromLogfontW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateFontFromLogfontW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateFromHDC(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateFromHDC(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateFromHDC2(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateFromHDC2(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateFromHWND(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateFromHWND(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateFromHWNDICM(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateFromHWNDICM(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateHBITMAPFromBitmap(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateHBITMAPFromBitmap(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateHICONFromBitmap(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateHICONFromBitmap(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateHalftonePalette()")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateHalftonePalette(): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateHatchBrush(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateHatchBrush(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateImageAttributes(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateImageAttributes(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrush(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrush(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRect(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRect(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRectI(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRectI(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRectWithAngle(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRectWithAngle(p0: String, p1: Int, p2: Int, p3: Double, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRectWithAngleI(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRectWithAngleI(p0: String, p1: Int, p2: Int, p3: Double, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushI(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushI(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix2(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix2(p0: Double, p1: Double, p2: Double, p3: Double, p4: Double, p5: Double, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix3(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix3(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix3I(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix3I(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromEmf(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromEmf(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromFile(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromFile(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromStream(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromStream(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromWmf(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromWmf(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromWmfFile(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromWmfFile(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreatePath(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreatePath(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreatePath2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreatePath2(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreatePath2I(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreatePath2I(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreatePathGradient(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreatePathGradient(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreatePathGradientFromPath(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreatePathGradientFromPath(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreatePathGradientI(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreatePathGradientI(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreatePathIter(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreatePathIter(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreatePen1(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreatePen1(p0: Int, p1: Double, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreatePen2(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreatePen2(p0: String, p1: Double, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateRegion(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateRegion(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionHrgn(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateRegionHrgn(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionPath(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateRegionPath(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionRect(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateRegionRect(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionRectI(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateRegionRectI(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionRgnData(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateRegionRgnData(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateSolidFill(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateSolidFill(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateStreamOnFile(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateStreamOnFile(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateStringFormat(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateStringFormat(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateTexture(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateTexture(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateTexture2(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateTexture2(p0: String, p1: Int, p2: Double, p3: Double, p4: Double, p5: Double, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateTexture2I(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateTexture2I(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateTextureIA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateTextureIA(p0: String, p1: String, p2: Double, p3: Double, p4: Double, p5: Double, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipCreateTextureIAI(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateTextureIAI(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDeleteBrush(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDeleteBrush(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDeleteCachedBitmap(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDeleteCachedBitmap(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDeleteCustomLineCap(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDeleteCustomLineCap(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDeleteEffect(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDeleteEffect(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDeleteFont(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDeleteFont(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDeleteFontFamily(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDeleteFontFamily(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDeleteGraphics(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDeleteGraphics(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDeleteMatrix(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDeleteMatrix(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDeletePath(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDeletePath(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDeletePathIter(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDeletePathIter(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDeletePen(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDeletePen(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDeletePrivateFontCollection(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDeletePrivateFontCollection(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDeleteRegion(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDeleteRegion(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDeleteStringFormat(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDeleteStringFormat(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDisposeImage(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDisposeImage(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDisposeImageAttributes(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDisposeImageAttributes(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawArc(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawArc(p0: String, p1: String, p2: Double, p3: Double, p4: Double, p5: Double, p6: Double, p7: Double): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawArcI(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawArcI(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int, p6: Double, p7: Double): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawBezier(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawBezier(p0: String, p1: String, p2: Double, p3: Double, p4: Double, p5: Double, p6: Double, p7: Double, p8: Double, p9: Double): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawBezierI(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawBezierI(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: Int, p9: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawBeziers(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawBeziers(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawBeziersI(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawBeziersI(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawCachedBitmap(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawCachedBitmap(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurve(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurve(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurve2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurve2(p0: String, p1: String, p2: String, p3: Int, p4: Double): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurve2I(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurve2I(p0: String, p1: String, p2: String, p3: Int, p4: Double): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurveI(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurveI(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawCurve(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawCurve2(p0: String, p1: String, p2: String, p3: Int, p4: Double): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve2I(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawCurve2I(p0: String, p1: String, p2: String, p3: Int, p4: Double): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve3(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawCurve3(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: Double): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve3I(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawCurve3I(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: Double): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawCurveI(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawCurveI(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawDriverString(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawDriverString(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawEllipse(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawEllipse(p0: String, p1: String, p2: Double, p3: Double, p4: Double, p5: Double): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawEllipseI(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawEllipseI(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawImage(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawImage(p0: String, p1: String, p2: Double, p3: Double): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawImageFX(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawImageFX(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawImageI(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawImageI(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointRect(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointRect(p0: String, p1: String, p2: Double, p3: Double, p4: Double, p5: Double, p6: Double, p7: Double, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointRectI(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointRectI(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePoints(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawImagePoints(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointsI(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointsI(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointsRect(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointsRect(p0: String, p1: String, p2: String, p3: Int, p4: Double, p5: Double, p6: Double, p7: Double, p8: Int, p9: String, p10: String, p11: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointsRectI(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointsRectI(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: Int, p9: String, p10: String, p11: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawImageRect(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawImageRect(p0: String, p1: String, p2: Double, p3: Double, p4: Double, p5: Double): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawImageRectI(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawImageRectI(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawImageRectRect(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawImageRectRect(p0: String, p1: String, p2: Double, p3: Double, p4: Double, p5: Double, p6: Double, p7: Double, p8: Double, p9: Double, p10: Int, p11: String, p12: String, p13: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawImageRectRectI(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawImageRectRectI(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: Int, p9: Int, p10: Int, p11: String, p12: String, p13: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawLine(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawLine(p0: String, p1: String, p2: Double, p3: Double, p4: Double, p5: Double): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawLineI(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawLineI(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawLines(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawLines(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawLinesI(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawLinesI(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawPath(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawPath(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawPie(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawPie(p0: String, p1: String, p2: Double, p3: Double, p4: Double, p5: Double, p6: Double, p7: Double): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawPieI(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawPieI(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int, p6: Double, p7: Double): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawPolygon(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawPolygon(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawPolygonI(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawPolygonI(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawRectangle(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawRectangle(p0: String, p1: String, p2: Double, p3: Double, p4: Double, p5: Double): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawRectangleI(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawRectangleI(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawRectangles(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawRectangles(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawRectanglesI(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawRectanglesI(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipDrawString(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawString(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipEmfToWmfBits(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipEmfToWmfBits(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipEndContainer(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipEndContainer(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPoint(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPoint(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPointI(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPointI(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPoints(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPoints(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPointsI(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPointsI(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestRect(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestRect(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestRectI(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestRectI(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPoint(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPoint(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPointI(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPointI(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPoints(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPoints(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPointsI(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPointsI(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestRect(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestRect(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestRectI(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestRectI(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurve(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurve(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurve2(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurve2(p0: String, p1: String, p2: String, p3: Int, p4: Double, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurve2I(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurve2I(p0: String, p1: String, p2: String, p3: Int, p4: Double, p5: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurveI(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurveI(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipFillEllipse(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipFillEllipse(p0: String, p1: String, p2: Double, p3: Double, p4: Double, p5: Double): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipFillEllipseI(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipFillEllipseI(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipFillPath(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipFillPath(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipFillPie(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipFillPie(p0: String, p1: String, p2: Double, p3: Double, p4: Double, p5: Double, p6: Double, p7: Double): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipFillPieI(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipFillPieI(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int, p6: Double, p7: Double): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipFillPolygon(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipFillPolygon(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipFillPolygon2(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipFillPolygon2(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipFillPolygon2I(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipFillPolygon2I(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipFillPolygonI(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipFillPolygonI(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipFillRectangle(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipFillRectangle(p0: String, p1: String, p2: Double, p3: Double, p4: Double, p5: Double): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipFillRectangleI(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipFillRectangleI(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipFillRectangles(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipFillRectangles(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipFillRectanglesI(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipFillRectanglesI(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipFillRegion(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipFillRegion(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipFindFirstImageItem(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipFindFirstImageItem(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipFindNextImageItem(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipFindNextImageItem(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipFlattenPath(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipFlattenPath(p0: String, p1: String, p2: Double): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipFlush(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipFlush(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipFree(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipFree(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapFillState(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapFillState(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapHeight(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapHeight(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapMiddleInset(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapMiddleInset(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapWidth(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapWidth(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetAllPropertyItems(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetAllPropertyItems(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetBrushType(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetBrushType(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetCellAscent(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetCellAscent(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetCellDescent(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetCellDescent(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetClip(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetClip(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetClipBounds(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetClipBounds(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetClipBoundsI(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetClipBoundsI(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetCompositingMode(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetCompositingMode(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetCompositingQuality(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetCompositingQuality(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapBaseCap(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapBaseCap(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapBaseInset(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapBaseInset(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapStrokeCaps(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapStrokeCaps(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapStrokeJoin(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapStrokeJoin(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapType(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapType(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapWidthScale(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapWidthScale(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetDC(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetDC(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetDpiX(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetDpiX(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetDpiY(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetDpiY(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetEffectParameterSize(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetEffectParameterSize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetEffectParameters(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetEffectParameters(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetEmHeight(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetEmHeight(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetEncoderParameterList(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetEncoderParameterList(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetEncoderParameterListSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetEncoderParameterListSize(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetFamily(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetFamily(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetFamilyName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetFamilyName(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetFontCollectionFamilyCount(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetFontCollectionFamilyCount(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetFontCollectionFamilyList(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetFontCollectionFamilyList(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetFontHeight(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetFontHeight(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetFontHeightGivenDPI(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetFontHeightGivenDPI(p0: String, p1: Double, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetFontSize(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetFontSize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetFontStyle(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetFontStyle(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetFontUnit(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetFontUnit(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetGenericFontFamilyMonospace(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetGenericFontFamilyMonospace(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetGenericFontFamilySansSerif(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetGenericFontFamilySansSerif(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetGenericFontFamilySerif(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetGenericFontFamilySerif(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetHatchBackgroundColor(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetHatchBackgroundColor(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetHatchForegroundColor(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetHatchForegroundColor(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetHatchStyle(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetHatchStyle(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetHemfFromMetafile(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetHemfFromMetafile(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetImageAttributesAdjustedPalette(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImageAttributesAdjustedPalette(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetImageBounds(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImageBounds(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetImageDecoders(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImageDecoders(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetImageDecodersSize(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImageDecodersSize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetImageDimension(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImageDimension(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetImageEncoders(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImageEncoders(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetImageEncodersSize(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImageEncodersSize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetImageFlags(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImageFlags(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetImageGraphicsContext(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImageGraphicsContext(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetImageHeight(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImageHeight(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetImageHorizontalResolution(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImageHorizontalResolution(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetImageItemData(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImageItemData(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetImagePalette(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImagePalette(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetImagePaletteSize(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImagePaletteSize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetImagePixelFormat(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImagePixelFormat(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetImageRawFormat(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImageRawFormat(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetImageThumbnail(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImageThumbnail(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetImageType(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImageType(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetImageVerticalResolution(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImageVerticalResolution(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetImageWidth(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImageWidth(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetInterpolationMode(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetInterpolationMode(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetLineBlend(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetLineBlend(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetLineBlendCount(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetLineBlendCount(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetLineColors(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetLineColors(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetLineGammaCorrection(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetLineGammaCorrection(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetLinePresetBlend(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetLinePresetBlend(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetLinePresetBlendCount(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetLinePresetBlendCount(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetLineRect(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetLineRect(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetLineRectI(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetLineRectI(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetLineSpacing(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetLineSpacing(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetLineTransform(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetLineTransform(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetLineWrapMode(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetLineWrapMode(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetLogFontA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetLogFontA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetLogFontW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetLogFontW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetMatrixElements(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetMatrixElements(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileDownLevelRasterizationLimit(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetMetafileDownLevelRasterizationLimit(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromEmf(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromEmf(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromFile(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromFile(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromMetafile(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromMetafile(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromStream(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromStream(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromWmf(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromWmf(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetNearestColor(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetNearestColor(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPageScale(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPageScale(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPageUnit(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPageUnit(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPathData(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathData(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPathFillMode(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathFillMode(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientBlend(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientBlend(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientBlendCount(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientBlendCount(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientCenterColor(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientCenterColor(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientCenterPoint(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientCenterPoint(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientCenterPointI(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientCenterPointI(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientFocusScales(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientFocusScales(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientGammaCorrection(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientGammaCorrection(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPath(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPath(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPointCount(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPointCount(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPresetBlend(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPresetBlend(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPresetBlendCount(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPresetBlendCount(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientRect(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientRect(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientRectI(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientRectI(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientSurroundColorCount(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientSurroundColorCount(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientSurroundColorsWithCount(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientSurroundColorsWithCount(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientTransform(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientTransform(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientWrapMode(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientWrapMode(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPathLastPoint(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathLastPoint(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPathPoints(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathPoints(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPathPointsI(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathPointsI(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPathTypes(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathTypes(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPathWorldBounds(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathWorldBounds(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPathWorldBoundsI(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathWorldBoundsI(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPenBrushFill(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenBrushFill(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPenColor(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenColor(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPenCompoundArray(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenCompoundArray(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPenCompoundCount(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenCompoundCount(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPenCustomEndCap(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenCustomEndCap(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPenCustomStartCap(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenCustomStartCap(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashArray(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenDashArray(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashCap197819(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenDashCap197819(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashCount(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenDashCount(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashOffset(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenDashOffset(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashStyle(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenDashStyle(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPenEndCap(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenEndCap(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPenFillType(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenFillType(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPenLineJoin(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenLineJoin(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPenMiterLimit(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenMiterLimit(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPenMode(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenMode(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPenStartCap(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenStartCap(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPenTransform(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenTransform(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPenUnit(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenUnit(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPenWidth(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenWidth(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPixelOffsetMode(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPixelOffsetMode(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPointCount(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPointCount(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPropertyCount(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPropertyCount(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPropertyIdList(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPropertyIdList(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPropertyItem(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPropertyItem(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPropertyItemSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPropertyItemSize(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetPropertySize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPropertySize(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetRegionBounds(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetRegionBounds(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetRegionBoundsI(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetRegionBoundsI(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetRegionData(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetRegionData(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetRegionDataSize(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetRegionDataSize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetRegionHRgn(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetRegionHRgn(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetRegionScans(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetRegionScans(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetRegionScansCount(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetRegionScansCount(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetRegionScansI(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetRegionScansI(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetRenderingOrigin(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetRenderingOrigin(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetSmoothingMode(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetSmoothingMode(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetSolidFillColor(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetSolidFillColor(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatAlign(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatAlign(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatDigitSubstitution(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatDigitSubstitution(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatFlags(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatFlags(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatHotkeyPrefix(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatHotkeyPrefix(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatLineAlign(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatLineAlign(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatMeasurableCharacterRangeCount(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatMeasurableCharacterRangeCount(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatTabStopCount(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatTabStopCount(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatTabStops(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatTabStops(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatTrimming(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatTrimming(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetTextContrast(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetTextContrast(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetTextRenderingHint(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetTextRenderingHint(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetTextureImage(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetTextureImage(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetTextureTransform(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetTextureTransform(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetTextureWrapMode(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetTextureWrapMode(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetVisibleClipBounds(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetVisibleClipBounds(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetVisibleClipBoundsI(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetVisibleClipBoundsI(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGetWorldTransform(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetWorldTransform(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGraphicsClear(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGraphicsClear(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipGraphicsSetAbort(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipGraphicsSetAbort(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipImageForceValidation(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipImageForceValidation(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipImageGetFrameCount(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipImageGetFrameCount(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipImageGetFrameDimensionsCount(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipImageGetFrameDimensionsCount(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipImageGetFrameDimensionsList(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipImageGetFrameDimensionsList(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipImageRotateFlip(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipImageRotateFlip(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipImageSelectActiveFrame(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipImageSelectActiveFrame(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipImageSetAbort(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipImageSetAbort(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipInitializePalette(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipInitializePalette(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipInvertMatrix(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipInvertMatrix(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipIsClipEmpty(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsClipEmpty(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipIsEmptyRegion(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsEmptyRegion(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipIsEqualRegion(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsEqualRegion(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipIsInfiniteRegion(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsInfiniteRegion(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipIsMatrixEqual(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsMatrixEqual(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipIsMatrixIdentity(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsMatrixIdentity(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipIsMatrixInvertible(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsMatrixInvertible(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipIsOutlineVisiblePathPoint(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsOutlineVisiblePathPoint(p0: String, p1: Double, p2: Double, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipIsOutlineVisiblePathPointI(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsOutlineVisiblePathPointI(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipIsStyleAvailable(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsStyleAvailable(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleClipEmpty(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsVisibleClipEmpty(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePathPoint(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePathPoint(p0: String, p1: Double, p2: Double, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePathPointI(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePathPointI(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePoint(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePoint(p0: String, p1: Double, p2: Double, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePointI(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePointI(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRect(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRect(p0: String, p1: Double, p2: Double, p3: Double, p4: Double, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRectI(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRectI(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionPoint(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionPoint(p0: String, p1: Double, p2: Double, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionPointI(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionPointI(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionRect(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionRect(p0: String, p1: Double, p2: Double, p3: Double, p4: Double, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionRectI(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionRectI(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromFile(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromFile(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromFileICM(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromFileICM(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromStream(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromStream(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromStreamICM(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromStreamICM(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipMeasureCharacterRanges(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipMeasureCharacterRanges(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipMeasureDriverString(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipMeasureDriverString(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipMeasureString(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipMeasureString(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipMultiplyLineTransform(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipMultiplyLineTransform(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipMultiplyMatrix(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipMultiplyMatrix(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipMultiplyPathGradientTransform(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipMultiplyPathGradientTransform(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipMultiplyPenTransform(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipMultiplyPenTransform(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipMultiplyTextureTransform(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipMultiplyTextureTransform(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipMultiplyWorldTransform(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipMultiplyWorldTransform(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipNewInstalledFontCollection(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipNewInstalledFontCollection(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipNewPrivateFontCollection(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipNewPrivateFontCollection(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipPathIterCopyData(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipPathIterCopyData(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipPathIterEnumerate(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipPathIterEnumerate(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipPathIterGetCount(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipPathIterGetCount(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipPathIterGetSubpathCount(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipPathIterGetSubpathCount(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipPathIterHasCurve(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipPathIterHasCurve(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipPathIterIsValid(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipPathIterIsValid(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextMarker(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipPathIterNextMarker(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextMarkerPath(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipPathIterNextMarkerPath(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextPathType(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipPathIterNextPathType(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextSubpath(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipPathIterNextSubpath(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextSubpathPath(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipPathIterNextSubpathPath(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipPathIterRewind(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipPathIterRewind(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipPlayMetafileRecord(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipPlayMetafileRecord(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipPrivateAddFontFile(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipPrivateAddFontFile(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipPrivateAddMemoryFont(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipPrivateAddMemoryFont(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafile(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipRecordMetafile(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileFileName(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileFileName(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileFileNameI(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileFileNameI(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileI(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileI(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileStream(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileStream(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileStreamI(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileStreamI(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipReleaseDC(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipReleaseDC(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipRemovePropertyItem(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipRemovePropertyItem(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipResetClip(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipResetClip(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipResetImageAttributes(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipResetImageAttributes(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipResetLineTransform(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipResetLineTransform(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipResetPageTransform(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipResetPageTransform(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipResetPath(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipResetPath(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipResetPathGradientTransform(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipResetPathGradientTransform(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipResetPenTransform(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipResetPenTransform(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipResetTextureTransform(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipResetTextureTransform(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipResetWorldTransform(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipResetWorldTransform(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipRestoreGraphics(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipRestoreGraphics(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipReversePath(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipReversePath(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipRotateLineTransform(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipRotateLineTransform(p0: String, p1: Double, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipRotateMatrix(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipRotateMatrix(p0: String, p1: Double, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipRotatePathGradientTransform(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipRotatePathGradientTransform(p0: String, p1: Double, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipRotatePenTransform(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipRotatePenTransform(p0: String, p1: Double, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipRotateTextureTransform(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipRotateTextureTransform(p0: String, p1: Double, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipRotateWorldTransform(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipRotateWorldTransform(p0: String, p1: Double, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSaveAdd(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSaveAdd(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSaveAddImage(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSaveAddImage(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSaveGraphics(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSaveGraphics(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSaveImageToFile(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSaveImageToFile(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSaveImageToStream(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSaveImageToStream(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipScaleLineTransform(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipScaleLineTransform(p0: String, p1: Double, p2: Double, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipScaleMatrix(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipScaleMatrix(p0: String, p1: Double, p2: Double, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipScalePathGradientTransform(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipScalePathGradientTransform(p0: String, p1: Double, p2: Double, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipScalePenTransform(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipScalePenTransform(p0: String, p1: Double, p2: Double, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipScaleTextureTransform(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipScaleTextureTransform(p0: String, p1: Double, p2: Double, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipScaleWorldTransform(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipScaleWorldTransform(p0: String, p1: Double, p2: Double, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapFillState(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapFillState(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapHeight(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapHeight(p0: String, p1: Double): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapMiddleInset(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapMiddleInset(p0: String, p1: Double): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapWidth(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapWidth(p0: String, p1: Double): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetClipGraphics(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetClipGraphics(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetClipHrgn(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetClipHrgn(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetClipPath(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetClipPath(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetClipRect(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetClipRect(p0: String, p1: Double, p2: Double, p3: Double, p4: Double, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetClipRectI(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetClipRectI(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetClipRegion(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetClipRegion(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetCompositingMode(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetCompositingMode(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetCompositingQuality(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetCompositingQuality(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapBaseCap(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapBaseCap(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapBaseInset(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapBaseInset(p0: String, p1: Double): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapStrokeCaps(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapStrokeCaps(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapStrokeJoin(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapStrokeJoin(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapWidthScale(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapWidthScale(p0: String, p1: Double): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetEffectParameters(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetEffectParameters(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetEmpty(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetEmpty(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesCachedBackground(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesCachedBackground(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesColorKeys(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesColorKeys(p0: String, p1: Int, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesColorMatrix(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesColorMatrix(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesGamma(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesGamma(p0: String, p1: Int, p2: Int, p3: Double): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesNoOp(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesNoOp(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesOutputChannel(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesOutputChannel(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesOutputChannelColorProfile(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesOutputChannelColorProfile(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesRemapTable(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesRemapTable(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesThreshold(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesThreshold(p0: String, p1: Int, p2: Int, p3: Double): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesToIdentity(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesToIdentity(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesWrapMode(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesWrapMode(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetImagePalette(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetImagePalette(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetInfinite(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetInfinite(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetInterpolationMode(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetInterpolationMode(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetLineBlend(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetLineBlend(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetLineColors(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetLineColors(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetLineGammaCorrection(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetLineGammaCorrection(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetLineLinearBlend(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetLineLinearBlend(p0: String, p1: Double, p2: Double): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetLinePresetBlend(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetLinePresetBlend(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetLineSigmaBlend(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetLineSigmaBlend(p0: String, p1: Double, p2: Double): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetLineTransform(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetLineTransform(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetLineWrapMode(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetLineWrapMode(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetMatrixElements(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetMatrixElements(p0: String, p1: Double, p2: Double, p3: Double, p4: Double, p5: Double, p6: Double): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetMetafileDownLevelRasterizationLimit(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetMetafileDownLevelRasterizationLimit(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetPageScale(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPageScale(p0: String, p1: Double): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetPageUnit(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPageUnit(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetPathFillMode(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPathFillMode(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientBlend(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientBlend(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientCenterColor(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientCenterColor(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientCenterPoint(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientCenterPoint(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientCenterPointI(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientCenterPointI(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientFocusScales(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientFocusScales(p0: String, p1: Double, p2: Double): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientGammaCorrection(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientGammaCorrection(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientLinearBlend(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientLinearBlend(p0: String, p1: Double, p2: Double): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientPath(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientPath(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientPresetBlend(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientPresetBlend(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientSigmaBlend(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientSigmaBlend(p0: String, p1: Double, p2: Double): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientSurroundColorsWithCount(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientSurroundColorsWithCount(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientTransform(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientTransform(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientWrapMode(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientWrapMode(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetPathMarker(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPathMarker(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetPenBrushFill(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPenBrushFill(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetPenColor(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPenColor(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetPenCompoundArray(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPenCompoundArray(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetPenCustomEndCap(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPenCustomEndCap(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetPenCustomStartCap(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPenCustomStartCap(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetPenDashArray(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPenDashArray(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetPenDashCap197819(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPenDashCap197819(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetPenDashOffset(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPenDashOffset(p0: String, p1: Double): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetPenDashStyle(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPenDashStyle(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetPenEndCap(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPenEndCap(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetPenLineCap197819(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPenLineCap197819(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetPenLineJoin(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPenLineJoin(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetPenMiterLimit(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPenMiterLimit(p0: String, p1: Double): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetPenMode(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPenMode(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetPenStartCap(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPenStartCap(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetPenTransform(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPenTransform(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetPenUnit(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPenUnit(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetPenWidth(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPenWidth(p0: String, p1: Double): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetPixelOffsetMode(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPixelOffsetMode(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetPropertyItem(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPropertyItem(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetRenderingOrigin(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetRenderingOrigin(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetSmoothingMode(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetSmoothingMode(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetSolidFillColor(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetSolidFillColor(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatAlign(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatAlign(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatDigitSubstitution(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatDigitSubstitution(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatFlags(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatFlags(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatHotkeyPrefix(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatHotkeyPrefix(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatLineAlign(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatLineAlign(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatMeasurableCharacterRanges(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatMeasurableCharacterRanges(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatTabStops(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatTabStops(p0: String, p1: Double, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatTrimming(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatTrimming(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetTextContrast(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetTextContrast(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetTextRenderingHint(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetTextRenderingHint(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetTextureTransform(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetTextureTransform(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetTextureWrapMode(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetTextureWrapMode(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipSetWorldTransform(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetWorldTransform(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipShearMatrix(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipShearMatrix(p0: String, p1: Double, p2: Double, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipStartPathFigure(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipStartPathFigure(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipStringFormatGetGenericDefault(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipStringFormatGetGenericDefault(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipStringFormatGetGenericTypographic(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipStringFormatGetGenericTypographic(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipTestControl(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipTestControl(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipTransformMatrixPoints(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipTransformMatrixPoints(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipTransformMatrixPointsI(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipTransformMatrixPointsI(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipTransformPath(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipTransformPath(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipTransformPoints(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipTransformPoints(p0: String, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipTransformPointsI(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipTransformPointsI(p0: String, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipTransformRegion(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipTransformRegion(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipTranslateClip(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipTranslateClip(p0: String, p1: Double, p2: Double): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipTranslateClipI(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipTranslateClipI(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipTranslateLineTransform(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipTranslateLineTransform(p0: String, p1: Double, p2: Double, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipTranslateMatrix(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipTranslateMatrix(p0: String, p1: Double, p2: Double, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipTranslatePathGradientTransform(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipTranslatePathGradientTransform(p0: String, p1: Double, p2: Double, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipTranslatePenTransform(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipTranslatePenTransform(p0: String, p1: Double, p2: Double, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipTranslateRegion(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipTranslateRegion(p0: String, p1: Double, p2: Double): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipTranslateRegionI(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipTranslateRegionI(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipTranslateTextureTransform(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipTranslateTextureTransform(p0: String, p1: Double, p2: Double, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipTranslateWorldTransform(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipTranslateWorldTransform(p0: String, p1: Double, p2: Double, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipVectorTransformMatrixPoints(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipVectorTransformMatrixPoints(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipVectorTransformMatrixPointsI(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipVectorTransformMatrixPointsI(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipWarpPath(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipWarpPath(p0: String, p1: String, p2: String, p3: Int, p4: Double, p5: Double, p6: Double, p7: Double, p8: Int, p9: Double): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipWidenPath(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipWidenPath(p0: String, p1: String, p2: String, p3: Double): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdipWindingModeOutline(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdipWindingModeOutline(p0: String, p1: String, p2: Double): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdiplusNotificationHook(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdiplusNotificationHook(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdiplusNotificationUnhook(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdiplusNotificationUnhook(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdiplusShutdown(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdiplusShutdown(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsGdiplusGdiplusStartup(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsGdiplusGdiplusStartup(p0: String, p1: String, p2: String): Int

public actual fun gdipAddPathArc(path: MutPtr<GpPath>, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathArc(path.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), startangle.toDouble(), sweepangle.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathArcI(path: MutPtr<GpPath>, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathArcI(path.rawAddress.toString(), x, y, width, height, startangle.toDouble(), sweepangle.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathBezier(path: MutPtr<GpPath>, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathBezier(path.rawAddress.toString(), x1.toDouble(), y1.toDouble(), x2.toDouble(), y2.toDouble(), x3.toDouble(), y3.toDouble(), x4.toDouble(), y4.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathBezierI(path: MutPtr<GpPath>, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathBezierI(path.rawAddress.toString(), x1, y1, x2, y2, x3, y3, x4, y4) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathBeziers(path: MutPtr<GpPath>, points: ConstPtr<PointF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathBeziers(path.rawAddress.toString(), points.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathBeziersI(path: MutPtr<GpPath>, points: ConstPtr<Point>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathBeziersI(path.rawAddress.toString(), points.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathClosedCurve(path: MutPtr<GpPath>, points: ConstPtr<PointF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurve(path.rawAddress.toString(), points.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathClosedCurve2(path: MutPtr<GpPath>, points: ConstPtr<PointF>, count: Int, tension: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurve2(path.rawAddress.toString(), points.rawAddress.toString(), count, tension.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathClosedCurve2I(path: MutPtr<GpPath>, points: ConstPtr<Point>, count: Int, tension: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurve2I(path.rawAddress.toString(), points.rawAddress.toString(), count, tension.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathClosedCurveI(path: MutPtr<GpPath>, points: ConstPtr<Point>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurveI(path.rawAddress.toString(), points.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathCurve(path: MutPtr<GpPath>, points: ConstPtr<PointF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve(path.rawAddress.toString(), points.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathCurve2(path: MutPtr<GpPath>, points: ConstPtr<PointF>, count: Int, tension: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve2(path.rawAddress.toString(), points.rawAddress.toString(), count, tension.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathCurve2I(path: MutPtr<GpPath>, points: ConstPtr<Point>, count: Int, tension: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve2I(path.rawAddress.toString(), points.rawAddress.toString(), count, tension.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathCurve3(path: MutPtr<GpPath>, points: ConstPtr<PointF>, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve3(path.rawAddress.toString(), points.rawAddress.toString(), count, offset, numberofsegments, tension.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathCurve3I(path: MutPtr<GpPath>, points: ConstPtr<Point>, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve3I(path.rawAddress.toString(), points.rawAddress.toString(), count, offset, numberofsegments, tension.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathCurveI(path: MutPtr<GpPath>, points: ConstPtr<Point>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathCurveI(path.rawAddress.toString(), points.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathEllipse(path: MutPtr<GpPath>, x: Float, y: Float, width: Float, height: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathEllipse(path.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathEllipseI(path: MutPtr<GpPath>, x: Int, y: Int, width: Int, height: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathEllipseI(path.rawAddress.toString(), x, y, width, height) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathLine(path: MutPtr<GpPath>, x1: Float, y1: Float, x2: Float, y2: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathLine(path.rawAddress.toString(), x1.toDouble(), y1.toDouble(), x2.toDouble(), y2.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathLine2(path: MutPtr<GpPath>, points: ConstPtr<PointF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathLine2(path.rawAddress.toString(), points.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathLine2I(path: MutPtr<GpPath>, points: ConstPtr<Point>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathLine2I(path.rawAddress.toString(), points.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathLineI(path: MutPtr<GpPath>, x1: Int, y1: Int, x2: Int, y2: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathLineI(path.rawAddress.toString(), x1, y1, x2, y2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathPath(path: MutPtr<GpPath>, addingpath: ConstPtr<GpPath>, connect: Bool): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathPath(path.rawAddress.toString(), addingpath.rawAddress.toString(), connect) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathPie(path: MutPtr<GpPath>, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathPie(path.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), startangle.toDouble(), sweepangle.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathPieI(path: MutPtr<GpPath>, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathPieI(path.rawAddress.toString(), x, y, width, height, startangle.toDouble(), sweepangle.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathPolygon(path: MutPtr<GpPath>, points: ConstPtr<PointF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathPolygon(path.rawAddress.toString(), points.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathPolygonI(path: MutPtr<GpPath>, points: ConstPtr<Point>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathPolygonI(path.rawAddress.toString(), points.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathRectangle(path: MutPtr<GpPath>, x: Float, y: Float, width: Float, height: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathRectangle(path.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathRectangleI(path: MutPtr<GpPath>, x: Int, y: Int, width: Int, height: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathRectangleI(path.rawAddress.toString(), x, y, width, height) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathRectangles(path: MutPtr<GpPath>, rects: ConstPtr<RectF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathRectangles(path.rawAddress.toString(), rects.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathRectanglesI(path: MutPtr<GpPath>, rects: ConstPtr<Rect>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathRectanglesI(path.rawAddress.toString(), rects.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathString(path: MutPtr<GpPath>, string: Pcwstr, length: Int, family: ConstPtr<GpFontFamily>, style: Int, emsize: Float, layoutrect: ConstPtr<RectF>, format: ConstPtr<GpStringFormat>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathString(path.rawAddress.toString(), string.rawAddress.toString(), length, family.rawAddress.toString(), style, emsize.toDouble(), layoutrect.rawAddress.toString(), format.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathStringI(path: MutPtr<GpPath>, string: Pcwstr, length: Int, family: ConstPtr<GpFontFamily>, style: Int, emsize: Float, layoutrect: ConstPtr<Rect>, format: ConstPtr<GpStringFormat>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipAddPathStringI(path.rawAddress.toString(), string.rawAddress.toString(), length, family.rawAddress.toString(), style, emsize.toDouble(), layoutrect.rawAddress.toString(), format.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAlloc(size: ULong): MutPtr<CVoid> =
    if (windowsWin32GraphicsGdiplusNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiplusGdipAlloc(size.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBeginContainer(graphics: MutPtr<GpGraphics>, dstrect: ConstPtr<RectF>, srcrect: ConstPtr<RectF>, unit: Unit, state: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipBeginContainer(graphics.rawAddress.toString(), dstrect.rawAddress.toString(), srcrect.rawAddress.toString(), unit, state.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBeginContainer2(graphics: MutPtr<GpGraphics>, state: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipBeginContainer2(graphics.rawAddress.toString(), state.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBeginContainerI(graphics: MutPtr<GpGraphics>, dstrect: ConstPtr<Rect>, srcrect: ConstPtr<Rect>, unit: Unit, state: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipBeginContainerI(graphics.rawAddress.toString(), dstrect.rawAddress.toString(), srcrect.rawAddress.toString(), unit, state.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapApplyEffect(bitmap: MutPtr<GpBitmap>, effect: MutPtr<CGpEffect>, roi: MutPtr<io.github.kotlinmania.windowssys.windows.win32.foundation.Rect>, useauxdata: Bool, auxdata: MutPtr<MutPtr<CVoid>>, auxdatasize: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipBitmapApplyEffect(bitmap.rawAddress.toString(), effect.rawAddress.toString(), roi.rawAddress.toString(), useauxdata, auxdata.rawAddress.toString(), auxdatasize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapConvertFormat(pinputbitmap: MutPtr<GpBitmap>, format: Int, dithertype: DitherType, palettetype: PaletteType, palette: MutPtr<ColorPalette>, alphathresholdpercent: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipBitmapConvertFormat(pinputbitmap.rawAddress.toString(), format, dithertype, palettetype, palette.rawAddress.toString(), alphathresholdpercent.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapCreateApplyEffect(inputbitmaps: MutPtr<MutPtr<GpBitmap>>, numinputs: Int, effect: MutPtr<CGpEffect>, roi: MutPtr<io.github.kotlinmania.windowssys.windows.win32.foundation.Rect>, outputrect: MutPtr<io.github.kotlinmania.windowssys.windows.win32.foundation.Rect>, outputbitmap: MutPtr<MutPtr<GpBitmap>>, useauxdata: Bool, auxdata: MutPtr<MutPtr<CVoid>>, auxdatasize: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipBitmapCreateApplyEffect(inputbitmaps.rawAddress.toString(), numinputs, effect.rawAddress.toString(), roi.rawAddress.toString(), outputrect.rawAddress.toString(), outputbitmap.rawAddress.toString(), useauxdata, auxdata.rawAddress.toString(), auxdatasize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapGetHistogram(bitmap: MutPtr<GpBitmap>, format: HistogramFormat, numberofentries: UInt, channel0: MutPtr<UInt>, channel1: MutPtr<UInt>, channel2: MutPtr<UInt>, channel3: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipBitmapGetHistogram(bitmap.rawAddress.toString(), format, numberofentries.toInt(), channel0.rawAddress.toString(), channel1.rawAddress.toString(), channel2.rawAddress.toString(), channel3.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapGetHistogramSize(format: HistogramFormat, numberofentries: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipBitmapGetHistogramSize(format, numberofentries.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapGetPixel(bitmap: MutPtr<GpBitmap>, x: Int, y: Int, color: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipBitmapGetPixel(bitmap.rawAddress.toString(), x, y, color.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapLockBits(bitmap: MutPtr<GpBitmap>, rect: ConstPtr<Rect>, flags: UInt, format: Int, lockedbitmapdata: MutPtr<BitmapData>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipBitmapLockBits(bitmap.rawAddress.toString(), rect.rawAddress.toString(), flags.toInt(), format, lockedbitmapdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapSetPixel(bitmap: MutPtr<GpBitmap>, x: Int, y: Int, color: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipBitmapSetPixel(bitmap.rawAddress.toString(), x, y, color.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapSetResolution(bitmap: MutPtr<GpBitmap>, xdpi: Float, ydpi: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipBitmapSetResolution(bitmap.rawAddress.toString(), xdpi.toDouble(), ydpi.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapUnlockBits(bitmap: MutPtr<GpBitmap>, lockedbitmapdata: MutPtr<BitmapData>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipBitmapUnlockBits(bitmap.rawAddress.toString(), lockedbitmapdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipClearPathMarkers(path: MutPtr<GpPath>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipClearPathMarkers(path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneBitmapArea(x: Float, y: Float, width: Float, height: Float, format: Int, srcbitmap: MutPtr<GpBitmap>, dstbitmap: MutPtr<MutPtr<GpBitmap>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCloneBitmapArea(x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), format, srcbitmap.rawAddress.toString(), dstbitmap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneBitmapAreaI(x: Int, y: Int, width: Int, height: Int, format: Int, srcbitmap: MutPtr<GpBitmap>, dstbitmap: MutPtr<MutPtr<GpBitmap>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCloneBitmapAreaI(x, y, width, height, format, srcbitmap.rawAddress.toString(), dstbitmap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneBrush(brush: MutPtr<GpBrush>, clonebrush: MutPtr<MutPtr<GpBrush>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCloneBrush(brush.rawAddress.toString(), clonebrush.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneCustomLineCap(customcap: MutPtr<GpCustomLineCap>, clonedcap: MutPtr<MutPtr<GpCustomLineCap>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCloneCustomLineCap(customcap.rawAddress.toString(), clonedcap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneFont(font: MutPtr<GpFont>, clonefont: MutPtr<MutPtr<GpFont>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCloneFont(font.rawAddress.toString(), clonefont.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneFontFamily(fontfamily: MutPtr<GpFontFamily>, clonedfontfamily: MutPtr<MutPtr<GpFontFamily>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCloneFontFamily(fontfamily.rawAddress.toString(), clonedfontfamily.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneImage(image: MutPtr<GpImage>, cloneimage: MutPtr<MutPtr<GpImage>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCloneImage(image.rawAddress.toString(), cloneimage.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneImageAttributes(imageattr: ConstPtr<GpImageAttributes>, cloneimageattr: MutPtr<MutPtr<GpImageAttributes>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCloneImageAttributes(imageattr.rawAddress.toString(), cloneimageattr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneMatrix(matrix: MutPtr<Matrix>, clonematrix: MutPtr<MutPtr<Matrix>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCloneMatrix(matrix.rawAddress.toString(), clonematrix.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipClonePath(path: MutPtr<GpPath>, clonepath: MutPtr<MutPtr<GpPath>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipClonePath(path.rawAddress.toString(), clonepath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipClonePen(pen: MutPtr<GpPen>, clonepen: MutPtr<MutPtr<GpPen>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipClonePen(pen.rawAddress.toString(), clonepen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneRegion(region: MutPtr<GpRegion>, cloneregion: MutPtr<MutPtr<GpRegion>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCloneRegion(region.rawAddress.toString(), cloneregion.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneStringFormat(format: ConstPtr<GpStringFormat>, newformat: MutPtr<MutPtr<GpStringFormat>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCloneStringFormat(format.rawAddress.toString(), newformat.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipClosePathFigure(path: MutPtr<GpPath>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipClosePathFigure(path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipClosePathFigures(path: MutPtr<GpPath>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipClosePathFigures(path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCombineRegionPath(region: MutPtr<GpRegion>, path: MutPtr<GpPath>, combinemode: CombineMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCombineRegionPath(region.rawAddress.toString(), path.rawAddress.toString(), combinemode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCombineRegionRect(region: MutPtr<GpRegion>, rect: ConstPtr<RectF>, combinemode: CombineMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCombineRegionRect(region.rawAddress.toString(), rect.rawAddress.toString(), combinemode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCombineRegionRectI(region: MutPtr<GpRegion>, rect: ConstPtr<Rect>, combinemode: CombineMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCombineRegionRectI(region.rawAddress.toString(), rect.rawAddress.toString(), combinemode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCombineRegionRegion(region: MutPtr<GpRegion>, region2: MutPtr<GpRegion>, combinemode: CombineMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCombineRegionRegion(region.rawAddress.toString(), region2.rawAddress.toString(), combinemode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipComment(graphics: MutPtr<GpGraphics>, sizedata: UInt, data: ConstPtr<UByte>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipComment(graphics.rawAddress.toString(), sizedata.toInt(), data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipConvertToEmfPlus(refgraphics: ConstPtr<GpGraphics>, metafile: MutPtr<GpMetafile>, conversionfailureflag: MutPtr<Int>, emftype: EmfType, description: Pcwstr, outMetafile: MutPtr<MutPtr<GpMetafile>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipConvertToEmfPlus(refgraphics.rawAddress.toString(), metafile.rawAddress.toString(), conversionfailureflag.rawAddress.toString(), emftype, description.rawAddress.toString(), outMetafile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipConvertToEmfPlusToFile(refgraphics: ConstPtr<GpGraphics>, metafile: MutPtr<GpMetafile>, conversionfailureflag: MutPtr<Int>, filename: Pcwstr, emftype: EmfType, description: Pcwstr, outMetafile: MutPtr<MutPtr<GpMetafile>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipConvertToEmfPlusToFile(refgraphics.rawAddress.toString(), metafile.rawAddress.toString(), conversionfailureflag.rawAddress.toString(), filename.rawAddress.toString(), emftype, description.rawAddress.toString(), outMetafile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipConvertToEmfPlusToStream(refgraphics: ConstPtr<GpGraphics>, metafile: MutPtr<GpMetafile>, conversionfailureflag: MutPtr<Int>, stream: MutPtr<CVoid>, emftype: EmfType, description: Pcwstr, outMetafile: MutPtr<MutPtr<GpMetafile>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipConvertToEmfPlusToStream(refgraphics.rawAddress.toString(), metafile.rawAddress.toString(), conversionfailureflag.rawAddress.toString(), stream.rawAddress.toString(), emftype, description.rawAddress.toString(), outMetafile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateAdjustableArrowCap(height: Float, width: Float, isfilled: Bool, cap: MutPtr<MutPtr<GpAdjustableArrowCap>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateAdjustableArrowCap(height.toDouble(), width.toDouble(), isfilled, cap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromFile(filename: Pcwstr, bitmap: MutPtr<MutPtr<GpBitmap>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromFile(filename.rawAddress.toString(), bitmap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromFileICM(filename: Pcwstr, bitmap: MutPtr<MutPtr<GpBitmap>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromFileICM(filename.rawAddress.toString(), bitmap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromGdiDib(gdibitmapinfo: ConstPtr<Bitmapinfo>, gdibitmapdata: MutPtr<CVoid>, bitmap: MutPtr<MutPtr<GpBitmap>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromGdiDib(gdibitmapinfo.rawAddress.toString(), gdibitmapdata.rawAddress.toString(), bitmap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromGraphics(width: Int, height: Int, target: MutPtr<GpGraphics>, bitmap: MutPtr<MutPtr<GpBitmap>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromGraphics(width, height, target.rawAddress.toString(), bitmap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromHBITMAP(hbm: Hbitmap, hpal: Hpalette, bitmap: MutPtr<MutPtr<GpBitmap>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromHBITMAP(hbm.rawAddress.toString(), hpal.rawAddress.toString(), bitmap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromHICON(hicon: Hicon, bitmap: MutPtr<MutPtr<GpBitmap>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromHICON(hicon.rawAddress.toString(), bitmap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromResource(hinstance: Hinstance, lpbitmapname: Pcwstr, bitmap: MutPtr<MutPtr<GpBitmap>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromResource(hinstance.rawAddress.toString(), lpbitmapname.rawAddress.toString(), bitmap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromScan0(width: Int, height: Int, stride: Int, format: Int, scan0: ConstPtr<UByte>, bitmap: MutPtr<MutPtr<GpBitmap>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromScan0(width, height, stride, format, scan0.rawAddress.toString(), bitmap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromStream(stream: MutPtr<CVoid>, bitmap: MutPtr<MutPtr<GpBitmap>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromStream(stream.rawAddress.toString(), bitmap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromStreamICM(stream: MutPtr<CVoid>, bitmap: MutPtr<MutPtr<GpBitmap>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromStreamICM(stream.rawAddress.toString(), bitmap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateCachedBitmap(bitmap: MutPtr<GpBitmap>, graphics: MutPtr<GpGraphics>, cachedbitmap: MutPtr<MutPtr<GpCachedBitmap>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateCachedBitmap(bitmap.rawAddress.toString(), graphics.rawAddress.toString(), cachedbitmap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateCustomLineCap(fillpath: MutPtr<GpPath>, strokepath: MutPtr<GpPath>, basecap: LineCap, baseinset: Float, customcap: MutPtr<MutPtr<GpCustomLineCap>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateCustomLineCap(fillpath.rawAddress.toString(), strokepath.rawAddress.toString(), basecap, baseinset.toDouble(), customcap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateEffect(guid: Guid, effect: MutPtr<MutPtr<CGpEffect>>): Status =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateFont(fontfamily: ConstPtr<GpFontFamily>, emsize: Float, style: Int, unit: Unit, font: MutPtr<MutPtr<GpFont>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateFont(fontfamily.rawAddress.toString(), emsize.toDouble(), style, unit, font.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateFontFamilyFromName(name: Pcwstr, fontcollection: MutPtr<GpFontCollection>, fontfamily: MutPtr<MutPtr<GpFontFamily>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateFontFamilyFromName(name.rawAddress.toString(), fontcollection.rawAddress.toString(), fontfamily.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateFontFromDC(hdc: Hdc, font: MutPtr<MutPtr<GpFont>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateFontFromDC(hdc.rawAddress.toString(), font.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateFontFromLogfontA(hdc: Hdc, logfont: ConstPtr<Logfonta>, font: MutPtr<MutPtr<GpFont>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateFontFromLogfontA(hdc.rawAddress.toString(), logfont.rawAddress.toString(), font.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateFontFromLogfontW(hdc: Hdc, logfont: ConstPtr<Logfontw>, font: MutPtr<MutPtr<GpFont>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateFontFromLogfontW(hdc.rawAddress.toString(), logfont.rawAddress.toString(), font.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateFromHDC(hdc: Hdc, graphics: MutPtr<MutPtr<GpGraphics>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateFromHDC(hdc.rawAddress.toString(), graphics.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateFromHDC2(hdc: Hdc, hdevice: Handle, graphics: MutPtr<MutPtr<GpGraphics>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateFromHDC2(hdc.rawAddress.toString(), hdevice.rawAddress.toString(), graphics.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateFromHWND(hwnd: Hwnd, graphics: MutPtr<MutPtr<GpGraphics>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateFromHWND(hwnd.rawAddress.toString(), graphics.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateFromHWNDICM(hwnd: Hwnd, graphics: MutPtr<MutPtr<GpGraphics>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateFromHWNDICM(hwnd.rawAddress.toString(), graphics.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateHBITMAPFromBitmap(bitmap: MutPtr<GpBitmap>, hbmreturn: MutPtr<Hbitmap>, background: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateHBITMAPFromBitmap(bitmap.rawAddress.toString(), hbmreturn.rawAddress.toString(), background.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateHICONFromBitmap(bitmap: MutPtr<GpBitmap>, hbmreturn: MutPtr<Hicon>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateHICONFromBitmap(bitmap.rawAddress.toString(), hbmreturn.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateHalftonePalette(): Hpalette =
    if (windowsWin32GraphicsGdiplusNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateHalftonePalette().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateHatchBrush(hatchstyle: HatchStyle, forecol: UInt, backcol: UInt, brush: MutPtr<MutPtr<GpHatch>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateHatchBrush(hatchstyle, forecol.toInt(), backcol.toInt(), brush.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateImageAttributes(imageattr: MutPtr<MutPtr<GpImageAttributes>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateImageAttributes(imageattr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateLineBrush(point1: ConstPtr<PointF>, point2: ConstPtr<PointF>, color1: UInt, color2: UInt, wrapmode: WrapMode, linegradient: MutPtr<MutPtr<GpLineGradient>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrush(point1.rawAddress.toString(), point2.rawAddress.toString(), color1.toInt(), color2.toInt(), wrapmode, linegradient.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateLineBrushFromRect(rect: ConstPtr<RectF>, color1: UInt, color2: UInt, mode: LinearGradientMode, wrapmode: WrapMode, linegradient: MutPtr<MutPtr<GpLineGradient>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRect(rect.rawAddress.toString(), color1.toInt(), color2.toInt(), mode, wrapmode, linegradient.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateLineBrushFromRectI(rect: ConstPtr<Rect>, color1: UInt, color2: UInt, mode: LinearGradientMode, wrapmode: WrapMode, linegradient: MutPtr<MutPtr<GpLineGradient>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRectI(rect.rawAddress.toString(), color1.toInt(), color2.toInt(), mode, wrapmode, linegradient.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateLineBrushFromRectWithAngle(rect: ConstPtr<RectF>, color1: UInt, color2: UInt, angle: Float, isanglescalable: Bool, wrapmode: WrapMode, linegradient: MutPtr<MutPtr<GpLineGradient>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRectWithAngle(rect.rawAddress.toString(), color1.toInt(), color2.toInt(), angle.toDouble(), isanglescalable, wrapmode, linegradient.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateLineBrushFromRectWithAngleI(rect: ConstPtr<Rect>, color1: UInt, color2: UInt, angle: Float, isanglescalable: Bool, wrapmode: WrapMode, linegradient: MutPtr<MutPtr<GpLineGradient>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRectWithAngleI(rect.rawAddress.toString(), color1.toInt(), color2.toInt(), angle.toDouble(), isanglescalable, wrapmode, linegradient.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateLineBrushI(point1: ConstPtr<Point>, point2: ConstPtr<Point>, color1: UInt, color2: UInt, wrapmode: WrapMode, linegradient: MutPtr<MutPtr<GpLineGradient>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushI(point1.rawAddress.toString(), point2.rawAddress.toString(), color1.toInt(), color2.toInt(), wrapmode, linegradient.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateMatrix(matrix: MutPtr<MutPtr<Matrix>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix(matrix.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateMatrix2(m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float, matrix: MutPtr<MutPtr<Matrix>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix2(m11.toDouble(), m12.toDouble(), m21.toDouble(), m22.toDouble(), dx.toDouble(), dy.toDouble(), matrix.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateMatrix3(rect: ConstPtr<RectF>, dstplg: ConstPtr<PointF>, matrix: MutPtr<MutPtr<Matrix>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix3(rect.rawAddress.toString(), dstplg.rawAddress.toString(), matrix.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateMatrix3I(rect: ConstPtr<Rect>, dstplg: ConstPtr<Point>, matrix: MutPtr<MutPtr<Matrix>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix3I(rect.rawAddress.toString(), dstplg.rawAddress.toString(), matrix.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateMetafileFromEmf(hemf: Henhmetafile, deleteemf: Bool, metafile: MutPtr<MutPtr<GpMetafile>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromEmf(hemf.rawAddress.toString(), deleteemf, metafile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateMetafileFromFile(file: Pcwstr, metafile: MutPtr<MutPtr<GpMetafile>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromFile(file.rawAddress.toString(), metafile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateMetafileFromStream(stream: MutPtr<CVoid>, metafile: MutPtr<MutPtr<GpMetafile>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromStream(stream.rawAddress.toString(), metafile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateMetafileFromWmf(hwmf: Hmetafile, deletewmf: Bool, wmfplaceablefileheader: ConstPtr<WmfPlaceableFileHeader>, metafile: MutPtr<MutPtr<GpMetafile>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromWmf(hwmf.rawAddress.toString(), deletewmf, wmfplaceablefileheader.rawAddress.toString(), metafile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateMetafileFromWmfFile(file: Pcwstr, wmfplaceablefileheader: ConstPtr<WmfPlaceableFileHeader>, metafile: MutPtr<MutPtr<GpMetafile>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromWmfFile(file.rawAddress.toString(), wmfplaceablefileheader.rawAddress.toString(), metafile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreatePath(brushmode: FillMode, path: MutPtr<MutPtr<GpPath>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreatePath(brushmode, path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreatePath2(param0: ConstPtr<PointF>, param1: ConstPtr<UByte>, param2: Int, param3: FillMode, path: MutPtr<MutPtr<GpPath>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreatePath2(param0.rawAddress.toString(), param1.rawAddress.toString(), param2, param3, path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreatePath2I(param0: ConstPtr<Point>, param1: ConstPtr<UByte>, param2: Int, param3: FillMode, path: MutPtr<MutPtr<GpPath>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreatePath2I(param0.rawAddress.toString(), param1.rawAddress.toString(), param2, param3, path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreatePathGradient(points: ConstPtr<PointF>, count: Int, wrapmode: WrapMode, polygradient: MutPtr<MutPtr<GpPathGradient>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreatePathGradient(points.rawAddress.toString(), count, wrapmode, polygradient.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreatePathGradientFromPath(path: ConstPtr<GpPath>, polygradient: MutPtr<MutPtr<GpPathGradient>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreatePathGradientFromPath(path.rawAddress.toString(), polygradient.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreatePathGradientI(points: ConstPtr<Point>, count: Int, wrapmode: WrapMode, polygradient: MutPtr<MutPtr<GpPathGradient>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreatePathGradientI(points.rawAddress.toString(), count, wrapmode, polygradient.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreatePathIter(iterator: MutPtr<MutPtr<GpPathIterator>>, path: MutPtr<GpPath>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreatePathIter(iterator.rawAddress.toString(), path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreatePen1(color: UInt, width: Float, unit: Unit, pen: MutPtr<MutPtr<GpPen>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreatePen1(color.toInt(), width.toDouble(), unit, pen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreatePen2(brush: MutPtr<GpBrush>, width: Float, unit: Unit, pen: MutPtr<MutPtr<GpPen>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreatePen2(brush.rawAddress.toString(), width.toDouble(), unit, pen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateRegion(region: MutPtr<MutPtr<GpRegion>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateRegion(region.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateRegionHrgn(hrgn: Hrgn, region: MutPtr<MutPtr<GpRegion>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateRegionHrgn(hrgn.rawAddress.toString(), region.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateRegionPath(path: MutPtr<GpPath>, region: MutPtr<MutPtr<GpRegion>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateRegionPath(path.rawAddress.toString(), region.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateRegionRect(rect: ConstPtr<RectF>, region: MutPtr<MutPtr<GpRegion>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateRegionRect(rect.rawAddress.toString(), region.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateRegionRectI(rect: ConstPtr<Rect>, region: MutPtr<MutPtr<GpRegion>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateRegionRectI(rect.rawAddress.toString(), region.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateRegionRgnData(regiondata: ConstPtr<UByte>, size: Int, region: MutPtr<MutPtr<GpRegion>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateRegionRgnData(regiondata.rawAddress.toString(), size, region.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateSolidFill(color: UInt, brush: MutPtr<MutPtr<GpSolidFill>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateSolidFill(color.toInt(), brush.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateStreamOnFile(filename: Pcwstr, access: UInt, stream: MutPtr<MutPtr<CVoid>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateStreamOnFile(filename.rawAddress.toString(), access.toInt(), stream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateStringFormat(formatattributes: Int, language: UShort, format: MutPtr<MutPtr<GpStringFormat>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateStringFormat(formatattributes, language.toInt(), format.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateTexture(image: MutPtr<GpImage>, wrapmode: WrapMode, texture: MutPtr<MutPtr<GpTexture>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateTexture(image.rawAddress.toString(), wrapmode, texture.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateTexture2(image: MutPtr<GpImage>, wrapmode: WrapMode, x: Float, y: Float, width: Float, height: Float, texture: MutPtr<MutPtr<GpTexture>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateTexture2(image.rawAddress.toString(), wrapmode, x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), texture.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateTexture2I(image: MutPtr<GpImage>, wrapmode: WrapMode, x: Int, y: Int, width: Int, height: Int, texture: MutPtr<MutPtr<GpTexture>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateTexture2I(image.rawAddress.toString(), wrapmode, x, y, width, height, texture.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateTextureIA(image: MutPtr<GpImage>, imageattributes: ConstPtr<GpImageAttributes>, x: Float, y: Float, width: Float, height: Float, texture: MutPtr<MutPtr<GpTexture>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateTextureIA(image.rawAddress.toString(), imageattributes.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), texture.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateTextureIAI(image: MutPtr<GpImage>, imageattributes: ConstPtr<GpImageAttributes>, x: Int, y: Int, width: Int, height: Int, texture: MutPtr<MutPtr<GpTexture>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipCreateTextureIAI(image.rawAddress.toString(), imageattributes.rawAddress.toString(), x, y, width, height, texture.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteBrush(brush: MutPtr<GpBrush>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDeleteBrush(brush.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteCachedBitmap(cachedbitmap: MutPtr<GpCachedBitmap>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDeleteCachedBitmap(cachedbitmap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteCustomLineCap(customcap: MutPtr<GpCustomLineCap>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDeleteCustomLineCap(customcap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteEffect(effect: MutPtr<CGpEffect>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDeleteEffect(effect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteFont(font: MutPtr<GpFont>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDeleteFont(font.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteFontFamily(fontfamily: MutPtr<GpFontFamily>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDeleteFontFamily(fontfamily.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteGraphics(graphics: MutPtr<GpGraphics>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDeleteGraphics(graphics.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteMatrix(matrix: MutPtr<Matrix>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDeleteMatrix(matrix.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeletePath(path: MutPtr<GpPath>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDeletePath(path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeletePathIter(iterator: MutPtr<GpPathIterator>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDeletePathIter(iterator.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeletePen(pen: MutPtr<GpPen>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDeletePen(pen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeletePrivateFontCollection(fontcollection: MutPtr<MutPtr<GpFontCollection>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDeletePrivateFontCollection(fontcollection.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteRegion(region: MutPtr<GpRegion>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDeleteRegion(region.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteStringFormat(format: MutPtr<GpStringFormat>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDeleteStringFormat(format.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDisposeImage(image: MutPtr<GpImage>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDisposeImage(image.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDisposeImageAttributes(imageattr: MutPtr<GpImageAttributes>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDisposeImageAttributes(imageattr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawArc(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawArc(graphics.rawAddress.toString(), pen.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), startangle.toDouble(), sweepangle.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawArcI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawArcI(graphics.rawAddress.toString(), pen.rawAddress.toString(), x, y, width, height, startangle.toDouble(), sweepangle.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawBezier(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawBezier(graphics.rawAddress.toString(), pen.rawAddress.toString(), x1.toDouble(), y1.toDouble(), x2.toDouble(), y2.toDouble(), x3.toDouble(), y3.toDouble(), x4.toDouble(), y4.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawBezierI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawBezierI(graphics.rawAddress.toString(), pen.rawAddress.toString(), x1, y1, x2, y2, x3, y3, x4, y4) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawBeziers(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<PointF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawBeziers(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawBeziersI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<Point>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawBeziersI(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawCachedBitmap(graphics: MutPtr<GpGraphics>, cachedbitmap: MutPtr<GpCachedBitmap>, x: Int, y: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawCachedBitmap(graphics.rawAddress.toString(), cachedbitmap.rawAddress.toString(), x, y) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawClosedCurve(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<PointF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurve(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawClosedCurve2(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<PointF>, count: Int, tension: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurve2(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count, tension.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawClosedCurve2I(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<Point>, count: Int, tension: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurve2I(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count, tension.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawClosedCurveI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<Point>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurveI(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawCurve(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<PointF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawCurve(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawCurve2(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<PointF>, count: Int, tension: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawCurve2(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count, tension.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawCurve2I(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<Point>, count: Int, tension: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawCurve2I(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count, tension.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawCurve3(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<PointF>, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawCurve3(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count, offset, numberofsegments, tension.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawCurve3I(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<Point>, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawCurve3I(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count, offset, numberofsegments, tension.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawCurveI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<Point>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawCurveI(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawDriverString(graphics: MutPtr<GpGraphics>, text: ConstPtr<UShort>, length: Int, font: ConstPtr<GpFont>, brush: ConstPtr<GpBrush>, positions: ConstPtr<PointF>, flags: Int, matrix: ConstPtr<Matrix>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawDriverString(graphics.rawAddress.toString(), text.rawAddress.toString(), length, font.rawAddress.toString(), brush.rawAddress.toString(), positions.rawAddress.toString(), flags, matrix.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawEllipse(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x: Float, y: Float, width: Float, height: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawEllipse(graphics.rawAddress.toString(), pen.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawEllipseI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x: Int, y: Int, width: Int, height: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawEllipseI(graphics.rawAddress.toString(), pen.rawAddress.toString(), x, y, width, height) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImage(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, x: Float, y: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawImage(graphics.rawAddress.toString(), image.rawAddress.toString(), x.toDouble(), y.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImageFX(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, source: MutPtr<RectF>, xform: MutPtr<Matrix>, effect: MutPtr<CGpEffect>, imageattributes: MutPtr<GpImageAttributes>, srcunit: Unit): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawImageFX(graphics.rawAddress.toString(), image.rawAddress.toString(), source.rawAddress.toString(), xform.rawAddress.toString(), effect.rawAddress.toString(), imageattributes.rawAddress.toString(), srcunit) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImageI(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, x: Int, y: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawImageI(graphics.rawAddress.toString(), image.rawAddress.toString(), x, y) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImagePointRect(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, x: Float, y: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointRect(graphics.rawAddress.toString(), image.rawAddress.toString(), x.toDouble(), y.toDouble(), srcx.toDouble(), srcy.toDouble(), srcwidth.toDouble(), srcheight.toDouble(), srcunit) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImagePointRectI(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, x: Int, y: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointRectI(graphics.rawAddress.toString(), image.rawAddress.toString(), x, y, srcx, srcy, srcwidth, srcheight, srcunit) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImagePoints(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, dstpoints: ConstPtr<PointF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawImagePoints(graphics.rawAddress.toString(), image.rawAddress.toString(), dstpoints.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImagePointsI(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, dstpoints: ConstPtr<Point>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointsI(graphics.rawAddress.toString(), image.rawAddress.toString(), dstpoints.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImagePointsRect(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, points: ConstPtr<PointF>, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit, imageattributes: ConstPtr<GpImageAttributes>, callback: Long, callbackdata: MutPtr<CVoid>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointsRect(graphics.rawAddress.toString(), image.rawAddress.toString(), points.rawAddress.toString(), count, srcx.toDouble(), srcy.toDouble(), srcwidth.toDouble(), srcheight.toDouble(), srcunit, imageattributes.rawAddress.toString(), callback.toString(), callbackdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImagePointsRectI(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, points: ConstPtr<Point>, count: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit, imageattributes: ConstPtr<GpImageAttributes>, callback: Long, callbackdata: MutPtr<CVoid>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointsRectI(graphics.rawAddress.toString(), image.rawAddress.toString(), points.rawAddress.toString(), count, srcx, srcy, srcwidth, srcheight, srcunit, imageattributes.rawAddress.toString(), callback.toString(), callbackdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImageRect(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, x: Float, y: Float, width: Float, height: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawImageRect(graphics.rawAddress.toString(), image.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImageRectI(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, x: Int, y: Int, width: Int, height: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawImageRectI(graphics.rawAddress.toString(), image.rawAddress.toString(), x, y, width, height) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImageRectRect(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, dstx: Float, dsty: Float, dstwidth: Float, dstheight: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit, imageattributes: ConstPtr<GpImageAttributes>, callback: Long, callbackdata: MutPtr<CVoid>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawImageRectRect(graphics.rawAddress.toString(), image.rawAddress.toString(), dstx.toDouble(), dsty.toDouble(), dstwidth.toDouble(), dstheight.toDouble(), srcx.toDouble(), srcy.toDouble(), srcwidth.toDouble(), srcheight.toDouble(), srcunit, imageattributes.rawAddress.toString(), callback.toString(), callbackdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImageRectRectI(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, dstx: Int, dsty: Int, dstwidth: Int, dstheight: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit, imageattributes: ConstPtr<GpImageAttributes>, callback: Long, callbackdata: MutPtr<CVoid>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawImageRectRectI(graphics.rawAddress.toString(), image.rawAddress.toString(), dstx, dsty, dstwidth, dstheight, srcx, srcy, srcwidth, srcheight, srcunit, imageattributes.rawAddress.toString(), callback.toString(), callbackdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawLine(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x1: Float, y1: Float, x2: Float, y2: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawLine(graphics.rawAddress.toString(), pen.rawAddress.toString(), x1.toDouble(), y1.toDouble(), x2.toDouble(), y2.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawLineI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x1: Int, y1: Int, x2: Int, y2: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawLineI(graphics.rawAddress.toString(), pen.rawAddress.toString(), x1, y1, x2, y2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawLines(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<PointF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawLines(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawLinesI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<Point>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawLinesI(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawPath(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, path: MutPtr<GpPath>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawPath(graphics.rawAddress.toString(), pen.rawAddress.toString(), path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawPie(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawPie(graphics.rawAddress.toString(), pen.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), startangle.toDouble(), sweepangle.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawPieI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawPieI(graphics.rawAddress.toString(), pen.rawAddress.toString(), x, y, width, height, startangle.toDouble(), sweepangle.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawPolygon(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<PointF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawPolygon(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawPolygonI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<Point>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawPolygonI(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawRectangle(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x: Float, y: Float, width: Float, height: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawRectangle(graphics.rawAddress.toString(), pen.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawRectangleI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x: Int, y: Int, width: Int, height: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawRectangleI(graphics.rawAddress.toString(), pen.rawAddress.toString(), x, y, width, height) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawRectangles(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, rects: ConstPtr<RectF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawRectangles(graphics.rawAddress.toString(), pen.rawAddress.toString(), rects.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawRectanglesI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, rects: ConstPtr<Rect>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawRectanglesI(graphics.rawAddress.toString(), pen.rawAddress.toString(), rects.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawString(graphics: MutPtr<GpGraphics>, string: Pcwstr, length: Int, font: ConstPtr<GpFont>, layoutrect: ConstPtr<RectF>, stringformat: ConstPtr<GpStringFormat>, brush: ConstPtr<GpBrush>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipDrawString(graphics.rawAddress.toString(), string.rawAddress.toString(), length, font.rawAddress.toString(), layoutrect.rawAddress.toString(), stringformat.rawAddress.toString(), brush.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEmfToWmfBits(hemf: Henhmetafile, cbdata16: UInt, pdata16: MutPtr<UByte>, imapmode: Int, eflags: Int): UInt =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipEmfToWmfBits(hemf.rawAddress.toString(), cbdata16.toInt(), pdata16.rawAddress.toString(), imapmode, eflags).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEndContainer(graphics: MutPtr<GpGraphics>, state: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipEndContainer(graphics.rawAddress.toString(), state.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileDestPoint(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destpoint: ConstPtr<PointF>, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPoint(graphics.rawAddress.toString(), metafile.rawAddress.toString(), destpoint.rawAddress.toString(), callback.toString(), callbackdata.rawAddress.toString(), imageattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileDestPointI(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destpoint: ConstPtr<Point>, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPointI(graphics.rawAddress.toString(), metafile.rawAddress.toString(), destpoint.rawAddress.toString(), callback.toString(), callbackdata.rawAddress.toString(), imageattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileDestPoints(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destpoints: ConstPtr<PointF>, count: Int, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPoints(graphics.rawAddress.toString(), metafile.rawAddress.toString(), destpoints.rawAddress.toString(), count, callback.toString(), callbackdata.rawAddress.toString(), imageattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileDestPointsI(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destpoints: ConstPtr<Point>, count: Int, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPointsI(graphics.rawAddress.toString(), metafile.rawAddress.toString(), destpoints.rawAddress.toString(), count, callback.toString(), callbackdata.rawAddress.toString(), imageattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileDestRect(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destrect: ConstPtr<RectF>, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestRect(graphics.rawAddress.toString(), metafile.rawAddress.toString(), destrect.rawAddress.toString(), callback.toString(), callbackdata.rawAddress.toString(), imageattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileDestRectI(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destrect: ConstPtr<Rect>, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestRectI(graphics.rawAddress.toString(), metafile.rawAddress.toString(), destrect.rawAddress.toString(), callback.toString(), callbackdata.rawAddress.toString(), imageattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileSrcRectDestPoint(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destpoint: ConstPtr<PointF>, srcrect: ConstPtr<RectF>, srcunit: Unit, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPoint(graphics.rawAddress.toString(), metafile.rawAddress.toString(), destpoint.rawAddress.toString(), srcrect.rawAddress.toString(), srcunit, callback.toString(), callbackdata.rawAddress.toString(), imageattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileSrcRectDestPointI(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destpoint: ConstPtr<Point>, srcrect: ConstPtr<Rect>, srcunit: Unit, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPointI(graphics.rawAddress.toString(), metafile.rawAddress.toString(), destpoint.rawAddress.toString(), srcrect.rawAddress.toString(), srcunit, callback.toString(), callbackdata.rawAddress.toString(), imageattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileSrcRectDestPoints(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destpoints: ConstPtr<PointF>, count: Int, srcrect: ConstPtr<RectF>, srcunit: Unit, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPoints(graphics.rawAddress.toString(), metafile.rawAddress.toString(), destpoints.rawAddress.toString(), count, srcrect.rawAddress.toString(), srcunit, callback.toString(), callbackdata.rawAddress.toString(), imageattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileSrcRectDestPointsI(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destpoints: ConstPtr<Point>, count: Int, srcrect: ConstPtr<Rect>, srcunit: Unit, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPointsI(graphics.rawAddress.toString(), metafile.rawAddress.toString(), destpoints.rawAddress.toString(), count, srcrect.rawAddress.toString(), srcunit, callback.toString(), callbackdata.rawAddress.toString(), imageattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileSrcRectDestRect(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destrect: ConstPtr<RectF>, srcrect: ConstPtr<RectF>, srcunit: Unit, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestRect(graphics.rawAddress.toString(), metafile.rawAddress.toString(), destrect.rawAddress.toString(), srcrect.rawAddress.toString(), srcunit, callback.toString(), callbackdata.rawAddress.toString(), imageattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileSrcRectDestRectI(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destrect: ConstPtr<Rect>, srcrect: ConstPtr<Rect>, srcunit: Unit, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestRectI(graphics.rawAddress.toString(), metafile.rawAddress.toString(), destrect.rawAddress.toString(), srcrect.rawAddress.toString(), srcunit, callback.toString(), callbackdata.rawAddress.toString(), imageattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillClosedCurve(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, points: ConstPtr<PointF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurve(graphics.rawAddress.toString(), brush.rawAddress.toString(), points.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillClosedCurve2(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, points: ConstPtr<PointF>, count: Int, tension: Float, fillmode: FillMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurve2(graphics.rawAddress.toString(), brush.rawAddress.toString(), points.rawAddress.toString(), count, tension.toDouble(), fillmode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillClosedCurve2I(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, points: ConstPtr<Point>, count: Int, tension: Float, fillmode: FillMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurve2I(graphics.rawAddress.toString(), brush.rawAddress.toString(), points.rawAddress.toString(), count, tension.toDouble(), fillmode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillClosedCurveI(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, points: ConstPtr<Point>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurveI(graphics.rawAddress.toString(), brush.rawAddress.toString(), points.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillEllipse(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, x: Float, y: Float, width: Float, height: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipFillEllipse(graphics.rawAddress.toString(), brush.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillEllipseI(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, x: Int, y: Int, width: Int, height: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipFillEllipseI(graphics.rawAddress.toString(), brush.rawAddress.toString(), x, y, width, height) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillPath(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, path: MutPtr<GpPath>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipFillPath(graphics.rawAddress.toString(), brush.rawAddress.toString(), path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillPie(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipFillPie(graphics.rawAddress.toString(), brush.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), startangle.toDouble(), sweepangle.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillPieI(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipFillPieI(graphics.rawAddress.toString(), brush.rawAddress.toString(), x, y, width, height, startangle.toDouble(), sweepangle.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillPolygon(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, points: ConstPtr<PointF>, count: Int, fillmode: FillMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipFillPolygon(graphics.rawAddress.toString(), brush.rawAddress.toString(), points.rawAddress.toString(), count, fillmode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillPolygon2(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, points: ConstPtr<PointF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipFillPolygon2(graphics.rawAddress.toString(), brush.rawAddress.toString(), points.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillPolygon2I(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, points: ConstPtr<Point>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipFillPolygon2I(graphics.rawAddress.toString(), brush.rawAddress.toString(), points.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillPolygonI(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, points: ConstPtr<Point>, count: Int, fillmode: FillMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipFillPolygonI(graphics.rawAddress.toString(), brush.rawAddress.toString(), points.rawAddress.toString(), count, fillmode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillRectangle(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, x: Float, y: Float, width: Float, height: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipFillRectangle(graphics.rawAddress.toString(), brush.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillRectangleI(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, x: Int, y: Int, width: Int, height: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipFillRectangleI(graphics.rawAddress.toString(), brush.rawAddress.toString(), x, y, width, height) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillRectangles(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, rects: ConstPtr<RectF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipFillRectangles(graphics.rawAddress.toString(), brush.rawAddress.toString(), rects.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillRectanglesI(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, rects: ConstPtr<Rect>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipFillRectanglesI(graphics.rawAddress.toString(), brush.rawAddress.toString(), rects.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillRegion(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, region: MutPtr<GpRegion>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipFillRegion(graphics.rawAddress.toString(), brush.rawAddress.toString(), region.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFindFirstImageItem(image: MutPtr<GpImage>, item: MutPtr<ImageItemData>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipFindFirstImageItem(image.rawAddress.toString(), item.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFindNextImageItem(image: MutPtr<GpImage>, item: MutPtr<ImageItemData>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipFindNextImageItem(image.rawAddress.toString(), item.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFlattenPath(path: MutPtr<GpPath>, matrix: MutPtr<Matrix>, flatness: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipFlattenPath(path.rawAddress.toString(), matrix.rawAddress.toString(), flatness.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFlush(graphics: MutPtr<GpGraphics>, intention: FlushIntention): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipFlush(graphics.rawAddress.toString(), intention) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFree(ptr: MutPtr<CVoid>) {
    if (windowsWin32GraphicsGdiplusNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsGdiplusGdipFree(ptr.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gdipGetAdjustableArrowCapFillState(cap: MutPtr<GpAdjustableArrowCap>, fillstate: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapFillState(cap.rawAddress.toString(), fillstate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetAdjustableArrowCapHeight(cap: MutPtr<GpAdjustableArrowCap>, height: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapHeight(cap.rawAddress.toString(), height.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetAdjustableArrowCapMiddleInset(cap: MutPtr<GpAdjustableArrowCap>, middleinset: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapMiddleInset(cap.rawAddress.toString(), middleinset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetAdjustableArrowCapWidth(cap: MutPtr<GpAdjustableArrowCap>, width: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapWidth(cap.rawAddress.toString(), width.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetAllPropertyItems(image: MutPtr<GpImage>, totalbuffersize: UInt, numproperties: UInt, allitems: MutPtr<PropertyItem>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetAllPropertyItems(image.rawAddress.toString(), totalbuffersize.toInt(), numproperties.toInt(), allitems.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetBrushType(brush: MutPtr<GpBrush>, type: MutPtr<BrushType>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetBrushType(brush.rawAddress.toString(), type.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCellAscent(family: ConstPtr<GpFontFamily>, style: Int, cellascent: MutPtr<UShort>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetCellAscent(family.rawAddress.toString(), style, cellascent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCellDescent(family: ConstPtr<GpFontFamily>, style: Int, celldescent: MutPtr<UShort>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetCellDescent(family.rawAddress.toString(), style, celldescent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetClip(graphics: MutPtr<GpGraphics>, region: MutPtr<GpRegion>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetClip(graphics.rawAddress.toString(), region.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetClipBounds(graphics: MutPtr<GpGraphics>, rect: MutPtr<RectF>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetClipBounds(graphics.rawAddress.toString(), rect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetClipBoundsI(graphics: MutPtr<GpGraphics>, rect: MutPtr<Rect>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetClipBoundsI(graphics.rawAddress.toString(), rect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCompositingMode(graphics: MutPtr<GpGraphics>, compositingmode: MutPtr<CompositingMode>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetCompositingMode(graphics.rawAddress.toString(), compositingmode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCompositingQuality(graphics: MutPtr<GpGraphics>, compositingquality: MutPtr<CompositingQuality>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetCompositingQuality(graphics.rawAddress.toString(), compositingquality.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCustomLineCapBaseCap(customcap: MutPtr<GpCustomLineCap>, basecap: MutPtr<LineCap>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapBaseCap(customcap.rawAddress.toString(), basecap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCustomLineCapBaseInset(customcap: MutPtr<GpCustomLineCap>, inset: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapBaseInset(customcap.rawAddress.toString(), inset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCustomLineCapStrokeCaps(customcap: MutPtr<GpCustomLineCap>, startcap: MutPtr<LineCap>, endcap: MutPtr<LineCap>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapStrokeCaps(customcap.rawAddress.toString(), startcap.rawAddress.toString(), endcap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCustomLineCapStrokeJoin(customcap: MutPtr<GpCustomLineCap>, linejoin: MutPtr<LineJoin>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapStrokeJoin(customcap.rawAddress.toString(), linejoin.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCustomLineCapType(customcap: MutPtr<GpCustomLineCap>, captype: MutPtr<CustomLineCapType>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapType(customcap.rawAddress.toString(), captype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCustomLineCapWidthScale(customcap: MutPtr<GpCustomLineCap>, widthscale: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapWidthScale(customcap.rawAddress.toString(), widthscale.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetDC(graphics: MutPtr<GpGraphics>, hdc: MutPtr<Hdc>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetDC(graphics.rawAddress.toString(), hdc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetDpiX(graphics: MutPtr<GpGraphics>, dpi: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetDpiX(graphics.rawAddress.toString(), dpi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetDpiY(graphics: MutPtr<GpGraphics>, dpi: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetDpiY(graphics.rawAddress.toString(), dpi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetEffectParameterSize(effect: MutPtr<CGpEffect>, size: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetEffectParameterSize(effect.rawAddress.toString(), size.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetEffectParameters(effect: MutPtr<CGpEffect>, size: MutPtr<UInt>, params: MutPtr<CVoid>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetEffectParameters(effect.rawAddress.toString(), size.rawAddress.toString(), params.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetEmHeight(family: ConstPtr<GpFontFamily>, style: Int, emheight: MutPtr<UShort>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetEmHeight(family.rawAddress.toString(), style, emheight.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetEncoderParameterList(image: MutPtr<GpImage>, clsidencoder: ConstPtr<Guid>, size: UInt, buffer: MutPtr<EncoderParameters>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetEncoderParameterList(image.rawAddress.toString(), clsidencoder.rawAddress.toString(), size.toInt(), buffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetEncoderParameterListSize(image: MutPtr<GpImage>, clsidencoder: ConstPtr<Guid>, size: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetEncoderParameterListSize(image.rawAddress.toString(), clsidencoder.rawAddress.toString(), size.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetFamily(font: MutPtr<GpFont>, family: MutPtr<MutPtr<GpFontFamily>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetFamily(font.rawAddress.toString(), family.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetFamilyName(family: ConstPtr<GpFontFamily>, name: Pwstr, language: UShort): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetFamilyName(family.rawAddress.toString(), name.rawAddress.toString(), language.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetFontCollectionFamilyCount(fontcollection: MutPtr<GpFontCollection>, numfound: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetFontCollectionFamilyCount(fontcollection.rawAddress.toString(), numfound.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetFontCollectionFamilyList(fontcollection: ConstPtr<GpFontCollection>, numsought: Int, gpfamilies: MutPtr<MutPtr<GpFontFamily>>, numfound: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetFontCollectionFamilyList(fontcollection.rawAddress.toString(), numsought, gpfamilies.rawAddress.toString(), numfound.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetFontHeight(font: ConstPtr<GpFont>, graphics: ConstPtr<GpGraphics>, height: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetFontHeight(font.rawAddress.toString(), graphics.rawAddress.toString(), height.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetFontHeightGivenDPI(font: ConstPtr<GpFont>, dpi: Float, height: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetFontHeightGivenDPI(font.rawAddress.toString(), dpi.toDouble(), height.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetFontSize(font: MutPtr<GpFont>, size: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetFontSize(font.rawAddress.toString(), size.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetFontStyle(font: MutPtr<GpFont>, style: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetFontStyle(font.rawAddress.toString(), style.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetFontUnit(font: MutPtr<GpFont>, unit: MutPtr<Unit>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetFontUnit(font.rawAddress.toString(), unit.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetGenericFontFamilyMonospace(nativefamily: MutPtr<MutPtr<GpFontFamily>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetGenericFontFamilyMonospace(nativefamily.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetGenericFontFamilySansSerif(nativefamily: MutPtr<MutPtr<GpFontFamily>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetGenericFontFamilySansSerif(nativefamily.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetGenericFontFamilySerif(nativefamily: MutPtr<MutPtr<GpFontFamily>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetGenericFontFamilySerif(nativefamily.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetHatchBackgroundColor(brush: MutPtr<GpHatch>, backcol: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetHatchBackgroundColor(brush.rawAddress.toString(), backcol.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetHatchForegroundColor(brush: MutPtr<GpHatch>, forecol: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetHatchForegroundColor(brush.rawAddress.toString(), forecol.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetHatchStyle(brush: MutPtr<GpHatch>, hatchstyle: MutPtr<HatchStyle>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetHatchStyle(brush.rawAddress.toString(), hatchstyle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetHemfFromMetafile(metafile: MutPtr<GpMetafile>, hemf: MutPtr<Henhmetafile>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetHemfFromMetafile(metafile.rawAddress.toString(), hemf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageAttributesAdjustedPalette(imageattr: MutPtr<GpImageAttributes>, colorpalette: MutPtr<ColorPalette>, coloradjusttype: ColorAdjustType): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImageAttributesAdjustedPalette(imageattr.rawAddress.toString(), colorpalette.rawAddress.toString(), coloradjusttype) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageBounds(image: MutPtr<GpImage>, srcrect: MutPtr<RectF>, srcunit: MutPtr<Unit>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImageBounds(image.rawAddress.toString(), srcrect.rawAddress.toString(), srcunit.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageDecoders(numdecoders: UInt, size: UInt, decoders: MutPtr<ImageCodecInfo>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImageDecoders(numdecoders.toInt(), size.toInt(), decoders.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageDecodersSize(numdecoders: MutPtr<UInt>, size: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImageDecodersSize(numdecoders.rawAddress.toString(), size.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageDimension(image: MutPtr<GpImage>, width: MutPtr<Float>, height: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImageDimension(image.rawAddress.toString(), width.rawAddress.toString(), height.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageEncoders(numencoders: UInt, size: UInt, encoders: MutPtr<ImageCodecInfo>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImageEncoders(numencoders.toInt(), size.toInt(), encoders.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageEncodersSize(numencoders: MutPtr<UInt>, size: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImageEncodersSize(numencoders.rawAddress.toString(), size.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageFlags(image: MutPtr<GpImage>, flags: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImageFlags(image.rawAddress.toString(), flags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageGraphicsContext(image: MutPtr<GpImage>, graphics: MutPtr<MutPtr<GpGraphics>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImageGraphicsContext(image.rawAddress.toString(), graphics.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageHeight(image: MutPtr<GpImage>, height: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImageHeight(image.rawAddress.toString(), height.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageHorizontalResolution(image: MutPtr<GpImage>, resolution: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImageHorizontalResolution(image.rawAddress.toString(), resolution.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageItemData(image: MutPtr<GpImage>, item: MutPtr<ImageItemData>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImageItemData(image.rawAddress.toString(), item.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImagePalette(image: MutPtr<GpImage>, palette: MutPtr<ColorPalette>, size: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImagePalette(image.rawAddress.toString(), palette.rawAddress.toString(), size) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImagePaletteSize(image: MutPtr<GpImage>, size: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImagePaletteSize(image.rawAddress.toString(), size.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImagePixelFormat(image: MutPtr<GpImage>, format: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImagePixelFormat(image.rawAddress.toString(), format.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageRawFormat(image: MutPtr<GpImage>, format: MutPtr<Guid>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImageRawFormat(image.rawAddress.toString(), format.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageThumbnail(image: MutPtr<GpImage>, thumbwidth: UInt, thumbheight: UInt, thumbimage: MutPtr<MutPtr<GpImage>>, callback: Long, callbackdata: MutPtr<CVoid>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImageThumbnail(image.rawAddress.toString(), thumbwidth.toInt(), thumbheight.toInt(), thumbimage.rawAddress.toString(), callback.toString(), callbackdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageType(image: MutPtr<GpImage>, type: MutPtr<ImageType>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImageType(image.rawAddress.toString(), type.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageVerticalResolution(image: MutPtr<GpImage>, resolution: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImageVerticalResolution(image.rawAddress.toString(), resolution.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageWidth(image: MutPtr<GpImage>, width: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetImageWidth(image.rawAddress.toString(), width.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetInterpolationMode(graphics: MutPtr<GpGraphics>, interpolationmode: MutPtr<InterpolationMode>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetInterpolationMode(graphics.rawAddress.toString(), interpolationmode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLineBlend(brush: MutPtr<GpLineGradient>, blend: MutPtr<Float>, positions: MutPtr<Float>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetLineBlend(brush.rawAddress.toString(), blend.rawAddress.toString(), positions.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLineBlendCount(brush: MutPtr<GpLineGradient>, count: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetLineBlendCount(brush.rawAddress.toString(), count.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLineColors(brush: MutPtr<GpLineGradient>, colors: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetLineColors(brush.rawAddress.toString(), colors.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLineGammaCorrection(brush: MutPtr<GpLineGradient>, usegammacorrection: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetLineGammaCorrection(brush.rawAddress.toString(), usegammacorrection.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLinePresetBlend(brush: MutPtr<GpLineGradient>, blend: MutPtr<UInt>, positions: MutPtr<Float>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetLinePresetBlend(brush.rawAddress.toString(), blend.rawAddress.toString(), positions.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLinePresetBlendCount(brush: MutPtr<GpLineGradient>, count: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetLinePresetBlendCount(brush.rawAddress.toString(), count.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLineRect(brush: MutPtr<GpLineGradient>, rect: MutPtr<RectF>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetLineRect(brush.rawAddress.toString(), rect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLineRectI(brush: MutPtr<GpLineGradient>, rect: MutPtr<Rect>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetLineRectI(brush.rawAddress.toString(), rect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLineSpacing(family: ConstPtr<GpFontFamily>, style: Int, linespacing: MutPtr<UShort>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetLineSpacing(family.rawAddress.toString(), style, linespacing.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLineTransform(brush: MutPtr<GpLineGradient>, matrix: MutPtr<Matrix>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetLineTransform(brush.rawAddress.toString(), matrix.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLineWrapMode(brush: MutPtr<GpLineGradient>, wrapmode: MutPtr<WrapMode>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetLineWrapMode(brush.rawAddress.toString(), wrapmode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLogFontA(font: MutPtr<GpFont>, graphics: MutPtr<GpGraphics>, logfonta: MutPtr<Logfonta>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetLogFontA(font.rawAddress.toString(), graphics.rawAddress.toString(), logfonta.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLogFontW(font: MutPtr<GpFont>, graphics: MutPtr<GpGraphics>, logfontw: MutPtr<Logfontw>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetLogFontW(font.rawAddress.toString(), graphics.rawAddress.toString(), logfontw.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetMatrixElements(matrix: ConstPtr<Matrix>, matrixout: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetMatrixElements(matrix.rawAddress.toString(), matrixout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetMetafileDownLevelRasterizationLimit(metafile: ConstPtr<GpMetafile>, metafilerasterizationlimitdpi: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetMetafileDownLevelRasterizationLimit(metafile.rawAddress.toString(), metafilerasterizationlimitdpi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetMetafileHeaderFromEmf(hemf: Henhmetafile, header: MutPtr<MetafileHeader>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromEmf(hemf.rawAddress.toString(), header.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetMetafileHeaderFromFile(filename: Pcwstr, header: MutPtr<MetafileHeader>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromFile(filename.rawAddress.toString(), header.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetMetafileHeaderFromMetafile(metafile: MutPtr<GpMetafile>, header: MutPtr<MetafileHeader>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromMetafile(metafile.rawAddress.toString(), header.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetMetafileHeaderFromStream(stream: MutPtr<CVoid>, header: MutPtr<MetafileHeader>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromStream(stream.rawAddress.toString(), header.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetMetafileHeaderFromWmf(hwmf: Hmetafile, wmfplaceablefileheader: ConstPtr<WmfPlaceableFileHeader>, header: MutPtr<MetafileHeader>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromWmf(hwmf.rawAddress.toString(), wmfplaceablefileheader.rawAddress.toString(), header.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetNearestColor(graphics: MutPtr<GpGraphics>, argb: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetNearestColor(graphics.rawAddress.toString(), argb.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPageScale(graphics: MutPtr<GpGraphics>, scale: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPageScale(graphics.rawAddress.toString(), scale.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPageUnit(graphics: MutPtr<GpGraphics>, unit: MutPtr<Unit>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPageUnit(graphics.rawAddress.toString(), unit.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathData(path: MutPtr<GpPath>, pathdata: MutPtr<PathData>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathData(path.rawAddress.toString(), pathdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathFillMode(path: MutPtr<GpPath>, fillmode: MutPtr<FillMode>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathFillMode(path.rawAddress.toString(), fillmode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientBlend(brush: MutPtr<GpPathGradient>, blend: MutPtr<Float>, positions: MutPtr<Float>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientBlend(brush.rawAddress.toString(), blend.rawAddress.toString(), positions.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientBlendCount(brush: MutPtr<GpPathGradient>, count: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientBlendCount(brush.rawAddress.toString(), count.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientCenterColor(brush: MutPtr<GpPathGradient>, colors: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientCenterColor(brush.rawAddress.toString(), colors.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientCenterPoint(brush: MutPtr<GpPathGradient>, points: MutPtr<PointF>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientCenterPoint(brush.rawAddress.toString(), points.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientCenterPointI(brush: MutPtr<GpPathGradient>, points: MutPtr<Point>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientCenterPointI(brush.rawAddress.toString(), points.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientFocusScales(brush: MutPtr<GpPathGradient>, xscale: MutPtr<Float>, yscale: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientFocusScales(brush.rawAddress.toString(), xscale.rawAddress.toString(), yscale.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientGammaCorrection(brush: MutPtr<GpPathGradient>, usegammacorrection: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientGammaCorrection(brush.rawAddress.toString(), usegammacorrection.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientPath(brush: MutPtr<GpPathGradient>, path: MutPtr<GpPath>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPath(brush.rawAddress.toString(), path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientPointCount(brush: MutPtr<GpPathGradient>, count: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPointCount(brush.rawAddress.toString(), count.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientPresetBlend(brush: MutPtr<GpPathGradient>, blend: MutPtr<UInt>, positions: MutPtr<Float>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPresetBlend(brush.rawAddress.toString(), blend.rawAddress.toString(), positions.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientPresetBlendCount(brush: MutPtr<GpPathGradient>, count: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPresetBlendCount(brush.rawAddress.toString(), count.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientRect(brush: MutPtr<GpPathGradient>, rect: MutPtr<RectF>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientRect(brush.rawAddress.toString(), rect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientRectI(brush: MutPtr<GpPathGradient>, rect: MutPtr<Rect>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientRectI(brush.rawAddress.toString(), rect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientSurroundColorCount(brush: MutPtr<GpPathGradient>, count: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientSurroundColorCount(brush.rawAddress.toString(), count.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientSurroundColorsWithCount(brush: ConstPtr<GpPathGradient>, color: MutPtr<UInt>, count: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientSurroundColorsWithCount(brush.rawAddress.toString(), color.rawAddress.toString(), count.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientTransform(brush: MutPtr<GpPathGradient>, matrix: MutPtr<Matrix>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientTransform(brush.rawAddress.toString(), matrix.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientWrapMode(brush: MutPtr<GpPathGradient>, wrapmode: MutPtr<WrapMode>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientWrapMode(brush.rawAddress.toString(), wrapmode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathLastPoint(path: MutPtr<GpPath>, lastpoint: MutPtr<PointF>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathLastPoint(path.rawAddress.toString(), lastpoint.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathPoints(param0: MutPtr<GpPath>, points: MutPtr<PointF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathPoints(param0.rawAddress.toString(), points.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathPointsI(param0: MutPtr<GpPath>, points: MutPtr<Point>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathPointsI(param0.rawAddress.toString(), points.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathTypes(path: ConstPtr<GpPath>, types: MutPtr<UByte>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathTypes(path.rawAddress.toString(), types.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathWorldBounds(path: MutPtr<GpPath>, bounds: MutPtr<RectF>, matrix: ConstPtr<Matrix>, pen: ConstPtr<GpPen>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathWorldBounds(path.rawAddress.toString(), bounds.rawAddress.toString(), matrix.rawAddress.toString(), pen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathWorldBoundsI(path: MutPtr<GpPath>, bounds: MutPtr<Rect>, matrix: ConstPtr<Matrix>, pen: ConstPtr<GpPen>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPathWorldBoundsI(path.rawAddress.toString(), bounds.rawAddress.toString(), matrix.rawAddress.toString(), pen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenBrushFill(pen: MutPtr<GpPen>, brush: MutPtr<MutPtr<GpBrush>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenBrushFill(pen.rawAddress.toString(), brush.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenColor(pen: MutPtr<GpPen>, argb: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenColor(pen.rawAddress.toString(), argb.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenCompoundArray(pen: MutPtr<GpPen>, dash: MutPtr<Float>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenCompoundArray(pen.rawAddress.toString(), dash.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenCompoundCount(pen: MutPtr<GpPen>, count: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenCompoundCount(pen.rawAddress.toString(), count.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenCustomEndCap(pen: MutPtr<GpPen>, customcap: MutPtr<MutPtr<GpCustomLineCap>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenCustomEndCap(pen.rawAddress.toString(), customcap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenCustomStartCap(pen: MutPtr<GpPen>, customcap: MutPtr<MutPtr<GpCustomLineCap>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenCustomStartCap(pen.rawAddress.toString(), customcap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenDashArray(pen: MutPtr<GpPen>, dash: MutPtr<Float>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenDashArray(pen.rawAddress.toString(), dash.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenDashCap197819(pen: MutPtr<GpPen>, dashcap: MutPtr<DashCap>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenDashCap197819(pen.rawAddress.toString(), dashcap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenDashCount(pen: MutPtr<GpPen>, count: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenDashCount(pen.rawAddress.toString(), count.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenDashOffset(pen: MutPtr<GpPen>, offset: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenDashOffset(pen.rawAddress.toString(), offset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenDashStyle(pen: MutPtr<GpPen>, dashstyle: MutPtr<DashStyle>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenDashStyle(pen.rawAddress.toString(), dashstyle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenEndCap(pen: MutPtr<GpPen>, endcap: MutPtr<LineCap>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenEndCap(pen.rawAddress.toString(), endcap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenFillType(pen: MutPtr<GpPen>, type: MutPtr<PenType>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenFillType(pen.rawAddress.toString(), type.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenLineJoin(pen: MutPtr<GpPen>, linejoin: MutPtr<LineJoin>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenLineJoin(pen.rawAddress.toString(), linejoin.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenMiterLimit(pen: MutPtr<GpPen>, miterlimit: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenMiterLimit(pen.rawAddress.toString(), miterlimit.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenMode(pen: MutPtr<GpPen>, penmode: MutPtr<PenAlignment>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenMode(pen.rawAddress.toString(), penmode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenStartCap(pen: MutPtr<GpPen>, startcap: MutPtr<LineCap>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenStartCap(pen.rawAddress.toString(), startcap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenTransform(pen: MutPtr<GpPen>, matrix: MutPtr<Matrix>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenTransform(pen.rawAddress.toString(), matrix.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenUnit(pen: MutPtr<GpPen>, unit: MutPtr<Unit>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenUnit(pen.rawAddress.toString(), unit.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenWidth(pen: MutPtr<GpPen>, width: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPenWidth(pen.rawAddress.toString(), width.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPixelOffsetMode(graphics: MutPtr<GpGraphics>, pixeloffsetmode: MutPtr<PixelOffsetMode>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPixelOffsetMode(graphics.rawAddress.toString(), pixeloffsetmode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPointCount(path: MutPtr<GpPath>, count: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPointCount(path.rawAddress.toString(), count.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPropertyCount(image: MutPtr<GpImage>, numofproperty: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPropertyCount(image.rawAddress.toString(), numofproperty.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPropertyIdList(image: MutPtr<GpImage>, numofproperty: UInt, list: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPropertyIdList(image.rawAddress.toString(), numofproperty.toInt(), list.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPropertyItem(image: MutPtr<GpImage>, propid: UInt, propsize: UInt, buffer: MutPtr<PropertyItem>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPropertyItem(image.rawAddress.toString(), propid.toInt(), propsize.toInt(), buffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPropertyItemSize(image: MutPtr<GpImage>, propid: UInt, size: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPropertyItemSize(image.rawAddress.toString(), propid.toInt(), size.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPropertySize(image: MutPtr<GpImage>, totalbuffersize: MutPtr<UInt>, numproperties: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetPropertySize(image.rawAddress.toString(), totalbuffersize.rawAddress.toString(), numproperties.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetRegionBounds(region: MutPtr<GpRegion>, graphics: MutPtr<GpGraphics>, rect: MutPtr<RectF>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetRegionBounds(region.rawAddress.toString(), graphics.rawAddress.toString(), rect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetRegionBoundsI(region: MutPtr<GpRegion>, graphics: MutPtr<GpGraphics>, rect: MutPtr<Rect>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetRegionBoundsI(region.rawAddress.toString(), graphics.rawAddress.toString(), rect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetRegionData(region: MutPtr<GpRegion>, buffer: MutPtr<UByte>, buffersize: UInt, sizefilled: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetRegionData(region.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.toInt(), sizefilled.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetRegionDataSize(region: MutPtr<GpRegion>, buffersize: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetRegionDataSize(region.rawAddress.toString(), buffersize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetRegionHRgn(region: MutPtr<GpRegion>, graphics: MutPtr<GpGraphics>, hrgn: MutPtr<Hrgn>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetRegionHRgn(region.rawAddress.toString(), graphics.rawAddress.toString(), hrgn.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetRegionScans(region: MutPtr<GpRegion>, rects: MutPtr<RectF>, count: MutPtr<Int>, matrix: MutPtr<Matrix>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetRegionScans(region.rawAddress.toString(), rects.rawAddress.toString(), count.rawAddress.toString(), matrix.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetRegionScansCount(region: MutPtr<GpRegion>, count: MutPtr<UInt>, matrix: MutPtr<Matrix>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetRegionScansCount(region.rawAddress.toString(), count.rawAddress.toString(), matrix.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetRegionScansI(region: MutPtr<GpRegion>, rects: MutPtr<Rect>, count: MutPtr<Int>, matrix: MutPtr<Matrix>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetRegionScansI(region.rawAddress.toString(), rects.rawAddress.toString(), count.rawAddress.toString(), matrix.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetRenderingOrigin(graphics: MutPtr<GpGraphics>, x: MutPtr<Int>, y: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetRenderingOrigin(graphics.rawAddress.toString(), x.rawAddress.toString(), y.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetSmoothingMode(graphics: MutPtr<GpGraphics>, smoothingmode: MutPtr<SmoothingMode>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetSmoothingMode(graphics.rawAddress.toString(), smoothingmode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetSolidFillColor(brush: MutPtr<GpSolidFill>, color: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetSolidFillColor(brush.rawAddress.toString(), color.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetStringFormatAlign(format: ConstPtr<GpStringFormat>, align: MutPtr<StringAlignment>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatAlign(format.rawAddress.toString(), align.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetStringFormatDigitSubstitution(format: ConstPtr<GpStringFormat>, language: MutPtr<UShort>, substitute: MutPtr<StringDigitSubstitute>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatDigitSubstitution(format.rawAddress.toString(), language.rawAddress.toString(), substitute.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetStringFormatFlags(format: ConstPtr<GpStringFormat>, flags: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatFlags(format.rawAddress.toString(), flags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetStringFormatHotkeyPrefix(format: ConstPtr<GpStringFormat>, hotkeyprefix: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatHotkeyPrefix(format.rawAddress.toString(), hotkeyprefix.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetStringFormatLineAlign(format: ConstPtr<GpStringFormat>, align: MutPtr<StringAlignment>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatLineAlign(format.rawAddress.toString(), align.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetStringFormatMeasurableCharacterRangeCount(format: ConstPtr<GpStringFormat>, count: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatMeasurableCharacterRangeCount(format.rawAddress.toString(), count.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetStringFormatTabStopCount(format: ConstPtr<GpStringFormat>, count: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatTabStopCount(format.rawAddress.toString(), count.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetStringFormatTabStops(format: ConstPtr<GpStringFormat>, count: Int, firsttaboffset: MutPtr<Float>, tabstops: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatTabStops(format.rawAddress.toString(), count, firsttaboffset.rawAddress.toString(), tabstops.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetStringFormatTrimming(format: ConstPtr<GpStringFormat>, trimming: MutPtr<StringTrimming>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatTrimming(format.rawAddress.toString(), trimming.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetTextContrast(graphics: MutPtr<GpGraphics>, contrast: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetTextContrast(graphics.rawAddress.toString(), contrast.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetTextRenderingHint(graphics: MutPtr<GpGraphics>, mode: MutPtr<TextRenderingHint>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetTextRenderingHint(graphics.rawAddress.toString(), mode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetTextureImage(brush: MutPtr<GpTexture>, image: MutPtr<MutPtr<GpImage>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetTextureImage(brush.rawAddress.toString(), image.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetTextureTransform(brush: MutPtr<GpTexture>, matrix: MutPtr<Matrix>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetTextureTransform(brush.rawAddress.toString(), matrix.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetTextureWrapMode(brush: MutPtr<GpTexture>, wrapmode: MutPtr<WrapMode>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetTextureWrapMode(brush.rawAddress.toString(), wrapmode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetVisibleClipBounds(graphics: MutPtr<GpGraphics>, rect: MutPtr<RectF>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetVisibleClipBounds(graphics.rawAddress.toString(), rect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetVisibleClipBoundsI(graphics: MutPtr<GpGraphics>, rect: MutPtr<Rect>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetVisibleClipBoundsI(graphics.rawAddress.toString(), rect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetWorldTransform(graphics: MutPtr<GpGraphics>, matrix: MutPtr<Matrix>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGetWorldTransform(graphics.rawAddress.toString(), matrix.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGraphicsClear(graphics: MutPtr<GpGraphics>, color: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGraphicsClear(graphics.rawAddress.toString(), color.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGraphicsSetAbort(pgraphics: MutPtr<GpGraphics>, piabort: MutPtr<CVoid>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipGraphicsSetAbort(pgraphics.rawAddress.toString(), piabort.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipImageForceValidation(image: MutPtr<GpImage>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipImageForceValidation(image.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipImageGetFrameCount(image: MutPtr<GpImage>, dimensionid: ConstPtr<Guid>, count: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipImageGetFrameCount(image.rawAddress.toString(), dimensionid.rawAddress.toString(), count.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipImageGetFrameDimensionsCount(image: MutPtr<GpImage>, count: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipImageGetFrameDimensionsCount(image.rawAddress.toString(), count.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipImageGetFrameDimensionsList(image: MutPtr<GpImage>, dimensionids: MutPtr<Guid>, count: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipImageGetFrameDimensionsList(image.rawAddress.toString(), dimensionids.rawAddress.toString(), count.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipImageRotateFlip(image: MutPtr<GpImage>, rftype: RotateFlipType): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipImageRotateFlip(image.rawAddress.toString(), rftype) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipImageSelectActiveFrame(image: MutPtr<GpImage>, dimensionid: ConstPtr<Guid>, frameindex: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipImageSelectActiveFrame(image.rawAddress.toString(), dimensionid.rawAddress.toString(), frameindex.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipImageSetAbort(pimage: MutPtr<GpImage>, piabort: MutPtr<CVoid>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipImageSetAbort(pimage.rawAddress.toString(), piabort.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipInitializePalette(palette: MutPtr<ColorPalette>, palettetype: PaletteType, optimalcolors: Int, usetransparentcolor: Bool, bitmap: MutPtr<GpBitmap>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipInitializePalette(palette.rawAddress.toString(), palettetype, optimalcolors, usetransparentcolor, bitmap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipInvertMatrix(matrix: MutPtr<Matrix>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipInvertMatrix(matrix.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsClipEmpty(graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsClipEmpty(graphics.rawAddress.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsEmptyRegion(region: MutPtr<GpRegion>, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsEmptyRegion(region.rawAddress.toString(), graphics.rawAddress.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsEqualRegion(region: MutPtr<GpRegion>, region2: MutPtr<GpRegion>, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsEqualRegion(region.rawAddress.toString(), region2.rawAddress.toString(), graphics.rawAddress.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsInfiniteRegion(region: MutPtr<GpRegion>, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsInfiniteRegion(region.rawAddress.toString(), graphics.rawAddress.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsMatrixEqual(matrix: ConstPtr<Matrix>, matrix2: ConstPtr<Matrix>, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsMatrixEqual(matrix.rawAddress.toString(), matrix2.rawAddress.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsMatrixIdentity(matrix: ConstPtr<Matrix>, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsMatrixIdentity(matrix.rawAddress.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsMatrixInvertible(matrix: ConstPtr<Matrix>, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsMatrixInvertible(matrix.rawAddress.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsOutlineVisiblePathPoint(path: MutPtr<GpPath>, x: Float, y: Float, pen: MutPtr<GpPen>, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsOutlineVisiblePathPoint(path.rawAddress.toString(), x.toDouble(), y.toDouble(), pen.rawAddress.toString(), graphics.rawAddress.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsOutlineVisiblePathPointI(path: MutPtr<GpPath>, x: Int, y: Int, pen: MutPtr<GpPen>, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsOutlineVisiblePathPointI(path.rawAddress.toString(), x, y, pen.rawAddress.toString(), graphics.rawAddress.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsStyleAvailable(family: ConstPtr<GpFontFamily>, style: Int, isstyleavailable: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsStyleAvailable(family.rawAddress.toString(), style, isstyleavailable.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisibleClipEmpty(graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsVisibleClipEmpty(graphics.rawAddress.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisiblePathPoint(path: MutPtr<GpPath>, x: Float, y: Float, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePathPoint(path.rawAddress.toString(), x.toDouble(), y.toDouble(), graphics.rawAddress.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisiblePathPointI(path: MutPtr<GpPath>, x: Int, y: Int, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePathPointI(path.rawAddress.toString(), x, y, graphics.rawAddress.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisiblePoint(graphics: MutPtr<GpGraphics>, x: Float, y: Float, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePoint(graphics.rawAddress.toString(), x.toDouble(), y.toDouble(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisiblePointI(graphics: MutPtr<GpGraphics>, x: Int, y: Int, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePointI(graphics.rawAddress.toString(), x, y, result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisibleRect(graphics: MutPtr<GpGraphics>, x: Float, y: Float, width: Float, height: Float, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRect(graphics.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisibleRectI(graphics: MutPtr<GpGraphics>, x: Int, y: Int, width: Int, height: Int, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRectI(graphics.rawAddress.toString(), x, y, width, height, result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisibleRegionPoint(region: MutPtr<GpRegion>, x: Float, y: Float, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionPoint(region.rawAddress.toString(), x.toDouble(), y.toDouble(), graphics.rawAddress.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisibleRegionPointI(region: MutPtr<GpRegion>, x: Int, y: Int, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionPointI(region.rawAddress.toString(), x, y, graphics.rawAddress.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisibleRegionRect(region: MutPtr<GpRegion>, x: Float, y: Float, width: Float, height: Float, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionRect(region.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), graphics.rawAddress.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisibleRegionRectI(region: MutPtr<GpRegion>, x: Int, y: Int, width: Int, height: Int, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionRectI(region.rawAddress.toString(), x, y, width, height, graphics.rawAddress.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipLoadImageFromFile(filename: Pcwstr, image: MutPtr<MutPtr<GpImage>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromFile(filename.rawAddress.toString(), image.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipLoadImageFromFileICM(filename: Pcwstr, image: MutPtr<MutPtr<GpImage>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromFileICM(filename.rawAddress.toString(), image.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipLoadImageFromStream(stream: MutPtr<CVoid>, image: MutPtr<MutPtr<GpImage>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromStream(stream.rawAddress.toString(), image.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipLoadImageFromStreamICM(stream: MutPtr<CVoid>, image: MutPtr<MutPtr<GpImage>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromStreamICM(stream.rawAddress.toString(), image.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipMeasureCharacterRanges(graphics: MutPtr<GpGraphics>, string: Pcwstr, length: Int, font: ConstPtr<GpFont>, layoutrect: ConstPtr<RectF>, stringformat: ConstPtr<GpStringFormat>, regioncount: Int, regions: MutPtr<MutPtr<GpRegion>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipMeasureCharacterRanges(graphics.rawAddress.toString(), string.rawAddress.toString(), length, font.rawAddress.toString(), layoutrect.rawAddress.toString(), stringformat.rawAddress.toString(), regioncount, regions.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipMeasureDriverString(graphics: MutPtr<GpGraphics>, text: ConstPtr<UShort>, length: Int, font: ConstPtr<GpFont>, positions: ConstPtr<PointF>, flags: Int, matrix: ConstPtr<Matrix>, boundingbox: MutPtr<RectF>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipMeasureDriverString(graphics.rawAddress.toString(), text.rawAddress.toString(), length, font.rawAddress.toString(), positions.rawAddress.toString(), flags, matrix.rawAddress.toString(), boundingbox.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipMeasureString(graphics: MutPtr<GpGraphics>, string: Pcwstr, length: Int, font: ConstPtr<GpFont>, layoutrect: ConstPtr<RectF>, stringformat: ConstPtr<GpStringFormat>, boundingbox: MutPtr<RectF>, codepointsfitted: MutPtr<Int>, linesfilled: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipMeasureString(graphics.rawAddress.toString(), string.rawAddress.toString(), length, font.rawAddress.toString(), layoutrect.rawAddress.toString(), stringformat.rawAddress.toString(), boundingbox.rawAddress.toString(), codepointsfitted.rawAddress.toString(), linesfilled.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipMultiplyLineTransform(brush: MutPtr<GpLineGradient>, matrix: ConstPtr<Matrix>, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipMultiplyLineTransform(brush.rawAddress.toString(), matrix.rawAddress.toString(), order) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipMultiplyMatrix(matrix: MutPtr<Matrix>, matrix2: MutPtr<Matrix>, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipMultiplyMatrix(matrix.rawAddress.toString(), matrix2.rawAddress.toString(), order) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipMultiplyPathGradientTransform(brush: MutPtr<GpPathGradient>, matrix: ConstPtr<Matrix>, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipMultiplyPathGradientTransform(brush.rawAddress.toString(), matrix.rawAddress.toString(), order) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipMultiplyPenTransform(pen: MutPtr<GpPen>, matrix: ConstPtr<Matrix>, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipMultiplyPenTransform(pen.rawAddress.toString(), matrix.rawAddress.toString(), order) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipMultiplyTextureTransform(brush: MutPtr<GpTexture>, matrix: ConstPtr<Matrix>, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipMultiplyTextureTransform(brush.rawAddress.toString(), matrix.rawAddress.toString(), order) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipMultiplyWorldTransform(graphics: MutPtr<GpGraphics>, matrix: ConstPtr<Matrix>, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipMultiplyWorldTransform(graphics.rawAddress.toString(), matrix.rawAddress.toString(), order) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipNewInstalledFontCollection(fontcollection: MutPtr<MutPtr<GpFontCollection>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipNewInstalledFontCollection(fontcollection.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipNewPrivateFontCollection(fontcollection: MutPtr<MutPtr<GpFontCollection>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipNewPrivateFontCollection(fontcollection.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterCopyData(iterator: MutPtr<GpPathIterator>, resultcount: MutPtr<Int>, points: MutPtr<PointF>, types: MutPtr<UByte>, startindex: Int, endindex: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipPathIterCopyData(iterator.rawAddress.toString(), resultcount.rawAddress.toString(), points.rawAddress.toString(), types.rawAddress.toString(), startindex, endindex) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterEnumerate(iterator: MutPtr<GpPathIterator>, resultcount: MutPtr<Int>, points: MutPtr<PointF>, types: MutPtr<UByte>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipPathIterEnumerate(iterator.rawAddress.toString(), resultcount.rawAddress.toString(), points.rawAddress.toString(), types.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterGetCount(iterator: MutPtr<GpPathIterator>, count: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipPathIterGetCount(iterator.rawAddress.toString(), count.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterGetSubpathCount(iterator: MutPtr<GpPathIterator>, count: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipPathIterGetSubpathCount(iterator.rawAddress.toString(), count.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterHasCurve(iterator: MutPtr<GpPathIterator>, hascurve: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipPathIterHasCurve(iterator.rawAddress.toString(), hascurve.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterIsValid(iterator: MutPtr<GpPathIterator>, valid: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipPathIterIsValid(iterator.rawAddress.toString(), valid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterNextMarker(iterator: MutPtr<GpPathIterator>, resultcount: MutPtr<Int>, startindex: MutPtr<Int>, endindex: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipPathIterNextMarker(iterator.rawAddress.toString(), resultcount.rawAddress.toString(), startindex.rawAddress.toString(), endindex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterNextMarkerPath(iterator: MutPtr<GpPathIterator>, resultcount: MutPtr<Int>, path: MutPtr<GpPath>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipPathIterNextMarkerPath(iterator.rawAddress.toString(), resultcount.rawAddress.toString(), path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterNextPathType(iterator: MutPtr<GpPathIterator>, resultcount: MutPtr<Int>, pathtype: MutPtr<UByte>, startindex: MutPtr<Int>, endindex: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipPathIterNextPathType(iterator.rawAddress.toString(), resultcount.rawAddress.toString(), pathtype.rawAddress.toString(), startindex.rawAddress.toString(), endindex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterNextSubpath(iterator: MutPtr<GpPathIterator>, resultcount: MutPtr<Int>, startindex: MutPtr<Int>, endindex: MutPtr<Int>, isclosed: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipPathIterNextSubpath(iterator.rawAddress.toString(), resultcount.rawAddress.toString(), startindex.rawAddress.toString(), endindex.rawAddress.toString(), isclosed.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterNextSubpathPath(iterator: MutPtr<GpPathIterator>, resultcount: MutPtr<Int>, path: MutPtr<GpPath>, isclosed: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipPathIterNextSubpathPath(iterator.rawAddress.toString(), resultcount.rawAddress.toString(), path.rawAddress.toString(), isclosed.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterRewind(iterator: MutPtr<GpPathIterator>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipPathIterRewind(iterator.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPlayMetafileRecord(metafile: ConstPtr<GpMetafile>, recordtype: EmfPlusRecordType, flags: UInt, datasize: UInt, data: ConstPtr<UByte>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipPlayMetafileRecord(metafile.rawAddress.toString(), recordtype, flags.toInt(), datasize.toInt(), data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPrivateAddFontFile(fontcollection: MutPtr<GpFontCollection>, filename: Pcwstr): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipPrivateAddFontFile(fontcollection.rawAddress.toString(), filename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPrivateAddMemoryFont(fontcollection: MutPtr<GpFontCollection>, memory: ConstPtr<CVoid>, length: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipPrivateAddMemoryFont(fontcollection.rawAddress.toString(), memory.rawAddress.toString(), length) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRecordMetafile(referencehdc: Hdc, type: EmfType, framerect: ConstPtr<RectF>, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr<MutPtr<GpMetafile>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipRecordMetafile(referencehdc.rawAddress.toString(), type, framerect.rawAddress.toString(), frameunit, description.rawAddress.toString(), metafile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRecordMetafileFileName(filename: Pcwstr, referencehdc: Hdc, type: EmfType, framerect: ConstPtr<RectF>, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr<MutPtr<GpMetafile>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileFileName(filename.rawAddress.toString(), referencehdc.rawAddress.toString(), type, framerect.rawAddress.toString(), frameunit, description.rawAddress.toString(), metafile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRecordMetafileFileNameI(filename: Pcwstr, referencehdc: Hdc, type: EmfType, framerect: ConstPtr<Rect>, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr<MutPtr<GpMetafile>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileFileNameI(filename.rawAddress.toString(), referencehdc.rawAddress.toString(), type, framerect.rawAddress.toString(), frameunit, description.rawAddress.toString(), metafile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRecordMetafileI(referencehdc: Hdc, type: EmfType, framerect: ConstPtr<Rect>, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr<MutPtr<GpMetafile>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileI(referencehdc.rawAddress.toString(), type, framerect.rawAddress.toString(), frameunit, description.rawAddress.toString(), metafile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRecordMetafileStream(stream: MutPtr<CVoid>, referencehdc: Hdc, type: EmfType, framerect: ConstPtr<RectF>, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr<MutPtr<GpMetafile>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileStream(stream.rawAddress.toString(), referencehdc.rawAddress.toString(), type, framerect.rawAddress.toString(), frameunit, description.rawAddress.toString(), metafile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRecordMetafileStreamI(stream: MutPtr<CVoid>, referencehdc: Hdc, type: EmfType, framerect: ConstPtr<Rect>, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr<MutPtr<GpMetafile>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileStreamI(stream.rawAddress.toString(), referencehdc.rawAddress.toString(), type, framerect.rawAddress.toString(), frameunit, description.rawAddress.toString(), metafile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipReleaseDC(graphics: MutPtr<GpGraphics>, hdc: Hdc): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipReleaseDC(graphics.rawAddress.toString(), hdc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRemovePropertyItem(image: MutPtr<GpImage>, propid: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipRemovePropertyItem(image.rawAddress.toString(), propid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipResetClip(graphics: MutPtr<GpGraphics>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipResetClip(graphics.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipResetImageAttributes(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipResetImageAttributes(imageattr.rawAddress.toString(), type) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipResetLineTransform(brush: MutPtr<GpLineGradient>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipResetLineTransform(brush.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipResetPageTransform(graphics: MutPtr<GpGraphics>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipResetPageTransform(graphics.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipResetPath(path: MutPtr<GpPath>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipResetPath(path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipResetPathGradientTransform(brush: MutPtr<GpPathGradient>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipResetPathGradientTransform(brush.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipResetPenTransform(pen: MutPtr<GpPen>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipResetPenTransform(pen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipResetTextureTransform(brush: MutPtr<GpTexture>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipResetTextureTransform(brush.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipResetWorldTransform(graphics: MutPtr<GpGraphics>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipResetWorldTransform(graphics.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRestoreGraphics(graphics: MutPtr<GpGraphics>, state: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipRestoreGraphics(graphics.rawAddress.toString(), state.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipReversePath(path: MutPtr<GpPath>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipReversePath(path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRotateLineTransform(brush: MutPtr<GpLineGradient>, angle: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipRotateLineTransform(brush.rawAddress.toString(), angle.toDouble(), order) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRotateMatrix(matrix: MutPtr<Matrix>, angle: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipRotateMatrix(matrix.rawAddress.toString(), angle.toDouble(), order) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRotatePathGradientTransform(brush: MutPtr<GpPathGradient>, angle: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipRotatePathGradientTransform(brush.rawAddress.toString(), angle.toDouble(), order) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRotatePenTransform(pen: MutPtr<GpPen>, angle: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipRotatePenTransform(pen.rawAddress.toString(), angle.toDouble(), order) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRotateTextureTransform(brush: MutPtr<GpTexture>, angle: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipRotateTextureTransform(brush.rawAddress.toString(), angle.toDouble(), order) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRotateWorldTransform(graphics: MutPtr<GpGraphics>, angle: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipRotateWorldTransform(graphics.rawAddress.toString(), angle.toDouble(), order) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSaveAdd(image: MutPtr<GpImage>, encoderparams: ConstPtr<EncoderParameters>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSaveAdd(image.rawAddress.toString(), encoderparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSaveAddImage(image: MutPtr<GpImage>, newimage: MutPtr<GpImage>, encoderparams: ConstPtr<EncoderParameters>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSaveAddImage(image.rawAddress.toString(), newimage.rawAddress.toString(), encoderparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSaveGraphics(graphics: MutPtr<GpGraphics>, state: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSaveGraphics(graphics.rawAddress.toString(), state.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSaveImageToFile(image: MutPtr<GpImage>, filename: Pcwstr, clsidencoder: ConstPtr<Guid>, encoderparams: ConstPtr<EncoderParameters>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSaveImageToFile(image.rawAddress.toString(), filename.rawAddress.toString(), clsidencoder.rawAddress.toString(), encoderparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSaveImageToStream(image: MutPtr<GpImage>, stream: MutPtr<CVoid>, clsidencoder: ConstPtr<Guid>, encoderparams: ConstPtr<EncoderParameters>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSaveImageToStream(image.rawAddress.toString(), stream.rawAddress.toString(), clsidencoder.rawAddress.toString(), encoderparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipScaleLineTransform(brush: MutPtr<GpLineGradient>, sx: Float, sy: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipScaleLineTransform(brush.rawAddress.toString(), sx.toDouble(), sy.toDouble(), order) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipScaleMatrix(matrix: MutPtr<Matrix>, scalex: Float, scaley: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipScaleMatrix(matrix.rawAddress.toString(), scalex.toDouble(), scaley.toDouble(), order) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipScalePathGradientTransform(brush: MutPtr<GpPathGradient>, sx: Float, sy: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipScalePathGradientTransform(brush.rawAddress.toString(), sx.toDouble(), sy.toDouble(), order) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipScalePenTransform(pen: MutPtr<GpPen>, sx: Float, sy: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipScalePenTransform(pen.rawAddress.toString(), sx.toDouble(), sy.toDouble(), order) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipScaleTextureTransform(brush: MutPtr<GpTexture>, sx: Float, sy: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipScaleTextureTransform(brush.rawAddress.toString(), sx.toDouble(), sy.toDouble(), order) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipScaleWorldTransform(graphics: MutPtr<GpGraphics>, sx: Float, sy: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipScaleWorldTransform(graphics.rawAddress.toString(), sx.toDouble(), sy.toDouble(), order) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetAdjustableArrowCapFillState(cap: MutPtr<GpAdjustableArrowCap>, fillstate: Bool): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapFillState(cap.rawAddress.toString(), fillstate) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetAdjustableArrowCapHeight(cap: MutPtr<GpAdjustableArrowCap>, height: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapHeight(cap.rawAddress.toString(), height.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetAdjustableArrowCapMiddleInset(cap: MutPtr<GpAdjustableArrowCap>, middleinset: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapMiddleInset(cap.rawAddress.toString(), middleinset.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetAdjustableArrowCapWidth(cap: MutPtr<GpAdjustableArrowCap>, width: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapWidth(cap.rawAddress.toString(), width.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetClipGraphics(graphics: MutPtr<GpGraphics>, srcgraphics: MutPtr<GpGraphics>, combinemode: CombineMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetClipGraphics(graphics.rawAddress.toString(), srcgraphics.rawAddress.toString(), combinemode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetClipHrgn(graphics: MutPtr<GpGraphics>, hrgn: Hrgn, combinemode: CombineMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetClipHrgn(graphics.rawAddress.toString(), hrgn.rawAddress.toString(), combinemode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetClipPath(graphics: MutPtr<GpGraphics>, path: MutPtr<GpPath>, combinemode: CombineMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetClipPath(graphics.rawAddress.toString(), path.rawAddress.toString(), combinemode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetClipRect(graphics: MutPtr<GpGraphics>, x: Float, y: Float, width: Float, height: Float, combinemode: CombineMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetClipRect(graphics.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), combinemode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetClipRectI(graphics: MutPtr<GpGraphics>, x: Int, y: Int, width: Int, height: Int, combinemode: CombineMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetClipRectI(graphics.rawAddress.toString(), x, y, width, height, combinemode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetClipRegion(graphics: MutPtr<GpGraphics>, region: MutPtr<GpRegion>, combinemode: CombineMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetClipRegion(graphics.rawAddress.toString(), region.rawAddress.toString(), combinemode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetCompositingMode(graphics: MutPtr<GpGraphics>, compositingmode: CompositingMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetCompositingMode(graphics.rawAddress.toString(), compositingmode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetCompositingQuality(graphics: MutPtr<GpGraphics>, compositingquality: CompositingQuality): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetCompositingQuality(graphics.rawAddress.toString(), compositingquality) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetCustomLineCapBaseCap(customcap: MutPtr<GpCustomLineCap>, basecap: LineCap): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapBaseCap(customcap.rawAddress.toString(), basecap) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetCustomLineCapBaseInset(customcap: MutPtr<GpCustomLineCap>, inset: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapBaseInset(customcap.rawAddress.toString(), inset.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetCustomLineCapStrokeCaps(customcap: MutPtr<GpCustomLineCap>, startcap: LineCap, endcap: LineCap): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapStrokeCaps(customcap.rawAddress.toString(), startcap, endcap) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetCustomLineCapStrokeJoin(customcap: MutPtr<GpCustomLineCap>, linejoin: LineJoin): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapStrokeJoin(customcap.rawAddress.toString(), linejoin) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetCustomLineCapWidthScale(customcap: MutPtr<GpCustomLineCap>, widthscale: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapWidthScale(customcap.rawAddress.toString(), widthscale.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetEffectParameters(effect: MutPtr<CGpEffect>, params: ConstPtr<CVoid>, size: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetEffectParameters(effect.rawAddress.toString(), params.rawAddress.toString(), size.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetEmpty(region: MutPtr<GpRegion>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetEmpty(region.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesCachedBackground(imageattr: MutPtr<GpImageAttributes>, enableflag: Bool): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesCachedBackground(imageattr.rawAddress.toString(), enableflag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesColorKeys(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType, enableflag: Bool, colorlow: UInt, colorhigh: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesColorKeys(imageattr.rawAddress.toString(), type, enableflag, colorlow.toInt(), colorhigh.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesColorMatrix(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType, enableflag: Bool, colormatrix: ConstPtr<ColorMatrix>, graymatrix: ConstPtr<ColorMatrix>, flags: ColorMatrixFlags): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesColorMatrix(imageattr.rawAddress.toString(), type, enableflag, colormatrix.rawAddress.toString(), graymatrix.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesGamma(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType, enableflag: Bool, gamma: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesGamma(imageattr.rawAddress.toString(), type, enableflag, gamma.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesNoOp(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType, enableflag: Bool): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesNoOp(imageattr.rawAddress.toString(), type, enableflag) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesOutputChannel(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType, enableflag: Bool, channelflags: ColorChannelFlags): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesOutputChannel(imageattr.rawAddress.toString(), type, enableflag, channelflags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesOutputChannelColorProfile(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType, enableflag: Bool, colorprofilefilename: Pcwstr): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesOutputChannelColorProfile(imageattr.rawAddress.toString(), type, enableflag, colorprofilefilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesRemapTable(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType, enableflag: Bool, mapsize: UInt, map: ConstPtr<ColorMap>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesRemapTable(imageattr.rawAddress.toString(), type, enableflag, mapsize.toInt(), map.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesThreshold(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType, enableflag: Bool, threshold: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesThreshold(imageattr.rawAddress.toString(), type, enableflag, threshold.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesToIdentity(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesToIdentity(imageattr.rawAddress.toString(), type) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesWrapMode(imageattr: MutPtr<GpImageAttributes>, wrap: WrapMode, argb: UInt, clamp: Bool): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesWrapMode(imageattr.rawAddress.toString(), wrap, argb.toInt(), clamp) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImagePalette(image: MutPtr<GpImage>, palette: ConstPtr<ColorPalette>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetImagePalette(image.rawAddress.toString(), palette.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetInfinite(region: MutPtr<GpRegion>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetInfinite(region.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetInterpolationMode(graphics: MutPtr<GpGraphics>, interpolationmode: InterpolationMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetInterpolationMode(graphics.rawAddress.toString(), interpolationmode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetLineBlend(brush: MutPtr<GpLineGradient>, blend: ConstPtr<Float>, positions: ConstPtr<Float>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetLineBlend(brush.rawAddress.toString(), blend.rawAddress.toString(), positions.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetLineColors(brush: MutPtr<GpLineGradient>, color1: UInt, color2: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetLineColors(brush.rawAddress.toString(), color1.toInt(), color2.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetLineGammaCorrection(brush: MutPtr<GpLineGradient>, usegammacorrection: Bool): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetLineGammaCorrection(brush.rawAddress.toString(), usegammacorrection) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetLineLinearBlend(brush: MutPtr<GpLineGradient>, focus: Float, scale: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetLineLinearBlend(brush.rawAddress.toString(), focus.toDouble(), scale.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetLinePresetBlend(brush: MutPtr<GpLineGradient>, blend: ConstPtr<UInt>, positions: ConstPtr<Float>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetLinePresetBlend(brush.rawAddress.toString(), blend.rawAddress.toString(), positions.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetLineSigmaBlend(brush: MutPtr<GpLineGradient>, focus: Float, scale: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetLineSigmaBlend(brush.rawAddress.toString(), focus.toDouble(), scale.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetLineTransform(brush: MutPtr<GpLineGradient>, matrix: ConstPtr<Matrix>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetLineTransform(brush.rawAddress.toString(), matrix.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetLineWrapMode(brush: MutPtr<GpLineGradient>, wrapmode: WrapMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetLineWrapMode(brush.rawAddress.toString(), wrapmode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetMatrixElements(matrix: MutPtr<Matrix>, m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetMatrixElements(matrix.rawAddress.toString(), m11.toDouble(), m12.toDouble(), m21.toDouble(), m22.toDouble(), dx.toDouble(), dy.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetMetafileDownLevelRasterizationLimit(metafile: MutPtr<GpMetafile>, metafilerasterizationlimitdpi: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetMetafileDownLevelRasterizationLimit(metafile.rawAddress.toString(), metafilerasterizationlimitdpi.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPageScale(graphics: MutPtr<GpGraphics>, scale: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPageScale(graphics.rawAddress.toString(), scale.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPageUnit(graphics: MutPtr<GpGraphics>, unit: Unit): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPageUnit(graphics.rawAddress.toString(), unit) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathFillMode(path: MutPtr<GpPath>, fillmode: FillMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPathFillMode(path.rawAddress.toString(), fillmode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientBlend(brush: MutPtr<GpPathGradient>, blend: ConstPtr<Float>, positions: ConstPtr<Float>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientBlend(brush.rawAddress.toString(), blend.rawAddress.toString(), positions.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientCenterColor(brush: MutPtr<GpPathGradient>, colors: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientCenterColor(brush.rawAddress.toString(), colors.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientCenterPoint(brush: MutPtr<GpPathGradient>, points: ConstPtr<PointF>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientCenterPoint(brush.rawAddress.toString(), points.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientCenterPointI(brush: MutPtr<GpPathGradient>, points: ConstPtr<Point>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientCenterPointI(brush.rawAddress.toString(), points.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientFocusScales(brush: MutPtr<GpPathGradient>, xscale: Float, yscale: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientFocusScales(brush.rawAddress.toString(), xscale.toDouble(), yscale.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientGammaCorrection(brush: MutPtr<GpPathGradient>, usegammacorrection: Bool): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientGammaCorrection(brush.rawAddress.toString(), usegammacorrection) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientLinearBlend(brush: MutPtr<GpPathGradient>, focus: Float, scale: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientLinearBlend(brush.rawAddress.toString(), focus.toDouble(), scale.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientPath(brush: MutPtr<GpPathGradient>, path: ConstPtr<GpPath>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientPath(brush.rawAddress.toString(), path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientPresetBlend(brush: MutPtr<GpPathGradient>, blend: ConstPtr<UInt>, positions: ConstPtr<Float>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientPresetBlend(brush.rawAddress.toString(), blend.rawAddress.toString(), positions.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientSigmaBlend(brush: MutPtr<GpPathGradient>, focus: Float, scale: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientSigmaBlend(brush.rawAddress.toString(), focus.toDouble(), scale.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientSurroundColorsWithCount(brush: MutPtr<GpPathGradient>, color: ConstPtr<UInt>, count: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientSurroundColorsWithCount(brush.rawAddress.toString(), color.rawAddress.toString(), count.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientTransform(brush: MutPtr<GpPathGradient>, matrix: MutPtr<Matrix>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientTransform(brush.rawAddress.toString(), matrix.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientWrapMode(brush: MutPtr<GpPathGradient>, wrapmode: WrapMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientWrapMode(brush.rawAddress.toString(), wrapmode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathMarker(path: MutPtr<GpPath>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPathMarker(path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenBrushFill(pen: MutPtr<GpPen>, brush: MutPtr<GpBrush>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPenBrushFill(pen.rawAddress.toString(), brush.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenColor(pen: MutPtr<GpPen>, argb: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPenColor(pen.rawAddress.toString(), argb.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenCompoundArray(pen: MutPtr<GpPen>, dash: ConstPtr<Float>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPenCompoundArray(pen.rawAddress.toString(), dash.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenCustomEndCap(pen: MutPtr<GpPen>, customcap: MutPtr<GpCustomLineCap>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPenCustomEndCap(pen.rawAddress.toString(), customcap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenCustomStartCap(pen: MutPtr<GpPen>, customcap: MutPtr<GpCustomLineCap>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPenCustomStartCap(pen.rawAddress.toString(), customcap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenDashArray(pen: MutPtr<GpPen>, dash: ConstPtr<Float>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPenDashArray(pen.rawAddress.toString(), dash.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenDashCap197819(pen: MutPtr<GpPen>, dashcap: DashCap): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPenDashCap197819(pen.rawAddress.toString(), dashcap) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenDashOffset(pen: MutPtr<GpPen>, offset: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPenDashOffset(pen.rawAddress.toString(), offset.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenDashStyle(pen: MutPtr<GpPen>, dashstyle: DashStyle): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPenDashStyle(pen.rawAddress.toString(), dashstyle) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenEndCap(pen: MutPtr<GpPen>, endcap: LineCap): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPenEndCap(pen.rawAddress.toString(), endcap) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenLineCap197819(pen: MutPtr<GpPen>, startcap: LineCap, endcap: LineCap, dashcap: DashCap): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPenLineCap197819(pen.rawAddress.toString(), startcap, endcap, dashcap) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenLineJoin(pen: MutPtr<GpPen>, linejoin: LineJoin): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPenLineJoin(pen.rawAddress.toString(), linejoin) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenMiterLimit(pen: MutPtr<GpPen>, miterlimit: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPenMiterLimit(pen.rawAddress.toString(), miterlimit.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenMode(pen: MutPtr<GpPen>, penmode: PenAlignment): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPenMode(pen.rawAddress.toString(), penmode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenStartCap(pen: MutPtr<GpPen>, startcap: LineCap): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPenStartCap(pen.rawAddress.toString(), startcap) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenTransform(pen: MutPtr<GpPen>, matrix: MutPtr<Matrix>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPenTransform(pen.rawAddress.toString(), matrix.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenUnit(pen: MutPtr<GpPen>, unit: Unit): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPenUnit(pen.rawAddress.toString(), unit) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenWidth(pen: MutPtr<GpPen>, width: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPenWidth(pen.rawAddress.toString(), width.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPixelOffsetMode(graphics: MutPtr<GpGraphics>, pixeloffsetmode: PixelOffsetMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPixelOffsetMode(graphics.rawAddress.toString(), pixeloffsetmode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPropertyItem(image: MutPtr<GpImage>, item: ConstPtr<PropertyItem>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetPropertyItem(image.rawAddress.toString(), item.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetRenderingOrigin(graphics: MutPtr<GpGraphics>, x: Int, y: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetRenderingOrigin(graphics.rawAddress.toString(), x, y) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetSmoothingMode(graphics: MutPtr<GpGraphics>, smoothingmode: SmoothingMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetSmoothingMode(graphics.rawAddress.toString(), smoothingmode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetSolidFillColor(brush: MutPtr<GpSolidFill>, color: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetSolidFillColor(brush.rawAddress.toString(), color.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetStringFormatAlign(format: MutPtr<GpStringFormat>, align: StringAlignment): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatAlign(format.rawAddress.toString(), align) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetStringFormatDigitSubstitution(format: MutPtr<GpStringFormat>, language: UShort, substitute: StringDigitSubstitute): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatDigitSubstitution(format.rawAddress.toString(), language.toInt(), substitute) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetStringFormatFlags(format: MutPtr<GpStringFormat>, flags: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatFlags(format.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetStringFormatHotkeyPrefix(format: MutPtr<GpStringFormat>, hotkeyprefix: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatHotkeyPrefix(format.rawAddress.toString(), hotkeyprefix) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetStringFormatLineAlign(format: MutPtr<GpStringFormat>, align: StringAlignment): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatLineAlign(format.rawAddress.toString(), align) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetStringFormatMeasurableCharacterRanges(format: MutPtr<GpStringFormat>, rangecount: Int, ranges: ConstPtr<CharacterRange>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatMeasurableCharacterRanges(format.rawAddress.toString(), rangecount, ranges.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetStringFormatTabStops(format: MutPtr<GpStringFormat>, firsttaboffset: Float, count: Int, tabstops: ConstPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatTabStops(format.rawAddress.toString(), firsttaboffset.toDouble(), count, tabstops.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetStringFormatTrimming(format: MutPtr<GpStringFormat>, trimming: StringTrimming): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatTrimming(format.rawAddress.toString(), trimming) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetTextContrast(graphics: MutPtr<GpGraphics>, contrast: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetTextContrast(graphics.rawAddress.toString(), contrast.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetTextRenderingHint(graphics: MutPtr<GpGraphics>, mode: TextRenderingHint): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetTextRenderingHint(graphics.rawAddress.toString(), mode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetTextureTransform(brush: MutPtr<GpTexture>, matrix: ConstPtr<Matrix>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetTextureTransform(brush.rawAddress.toString(), matrix.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetTextureWrapMode(brush: MutPtr<GpTexture>, wrapmode: WrapMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetTextureWrapMode(brush.rawAddress.toString(), wrapmode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetWorldTransform(graphics: MutPtr<GpGraphics>, matrix: MutPtr<Matrix>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipSetWorldTransform(graphics.rawAddress.toString(), matrix.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipShearMatrix(matrix: MutPtr<Matrix>, shearx: Float, sheary: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipShearMatrix(matrix.rawAddress.toString(), shearx.toDouble(), sheary.toDouble(), order) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipStartPathFigure(path: MutPtr<GpPath>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipStartPathFigure(path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipStringFormatGetGenericDefault(format: MutPtr<MutPtr<GpStringFormat>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipStringFormatGetGenericDefault(format.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipStringFormatGetGenericTypographic(format: MutPtr<MutPtr<GpStringFormat>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipStringFormatGetGenericTypographic(format.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTestControl(control: GpTestControlEnum, param1: MutPtr<CVoid>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipTestControl(control, param1.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTransformMatrixPoints(matrix: MutPtr<Matrix>, pts: MutPtr<PointF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipTransformMatrixPoints(matrix.rawAddress.toString(), pts.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTransformMatrixPointsI(matrix: MutPtr<Matrix>, pts: MutPtr<Point>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipTransformMatrixPointsI(matrix.rawAddress.toString(), pts.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTransformPath(path: MutPtr<GpPath>, matrix: MutPtr<Matrix>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipTransformPath(path.rawAddress.toString(), matrix.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTransformPoints(graphics: MutPtr<GpGraphics>, destspace: CoordinateSpace, srcspace: CoordinateSpace, points: MutPtr<PointF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipTransformPoints(graphics.rawAddress.toString(), destspace, srcspace, points.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTransformPointsI(graphics: MutPtr<GpGraphics>, destspace: CoordinateSpace, srcspace: CoordinateSpace, points: MutPtr<Point>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipTransformPointsI(graphics.rawAddress.toString(), destspace, srcspace, points.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTransformRegion(region: MutPtr<GpRegion>, matrix: MutPtr<Matrix>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipTransformRegion(region.rawAddress.toString(), matrix.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslateClip(graphics: MutPtr<GpGraphics>, dx: Float, dy: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipTranslateClip(graphics.rawAddress.toString(), dx.toDouble(), dy.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslateClipI(graphics: MutPtr<GpGraphics>, dx: Int, dy: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipTranslateClipI(graphics.rawAddress.toString(), dx, dy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslateLineTransform(brush: MutPtr<GpLineGradient>, dx: Float, dy: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipTranslateLineTransform(brush.rawAddress.toString(), dx.toDouble(), dy.toDouble(), order) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslateMatrix(matrix: MutPtr<Matrix>, offsetx: Float, offsety: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipTranslateMatrix(matrix.rawAddress.toString(), offsetx.toDouble(), offsety.toDouble(), order) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslatePathGradientTransform(brush: MutPtr<GpPathGradient>, dx: Float, dy: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipTranslatePathGradientTransform(brush.rawAddress.toString(), dx.toDouble(), dy.toDouble(), order) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslatePenTransform(pen: MutPtr<GpPen>, dx: Float, dy: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipTranslatePenTransform(pen.rawAddress.toString(), dx.toDouble(), dy.toDouble(), order) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslateRegion(region: MutPtr<GpRegion>, dx: Float, dy: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipTranslateRegion(region.rawAddress.toString(), dx.toDouble(), dy.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslateRegionI(region: MutPtr<GpRegion>, dx: Int, dy: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipTranslateRegionI(region.rawAddress.toString(), dx, dy) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslateTextureTransform(brush: MutPtr<GpTexture>, dx: Float, dy: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipTranslateTextureTransform(brush.rawAddress.toString(), dx.toDouble(), dy.toDouble(), order) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslateWorldTransform(graphics: MutPtr<GpGraphics>, dx: Float, dy: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipTranslateWorldTransform(graphics.rawAddress.toString(), dx.toDouble(), dy.toDouble(), order) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipVectorTransformMatrixPoints(matrix: MutPtr<Matrix>, pts: MutPtr<PointF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipVectorTransformMatrixPoints(matrix.rawAddress.toString(), pts.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipVectorTransformMatrixPointsI(matrix: MutPtr<Matrix>, pts: MutPtr<Point>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipVectorTransformMatrixPointsI(matrix.rawAddress.toString(), pts.rawAddress.toString(), count) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipWarpPath(path: MutPtr<GpPath>, matrix: MutPtr<Matrix>, points: ConstPtr<PointF>, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, warpmode: WarpMode, flatness: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipWarpPath(path.rawAddress.toString(), matrix.rawAddress.toString(), points.rawAddress.toString(), count, srcx.toDouble(), srcy.toDouble(), srcwidth.toDouble(), srcheight.toDouble(), warpmode, flatness.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipWidenPath(nativepath: MutPtr<GpPath>, pen: MutPtr<GpPen>, matrix: MutPtr<Matrix>, flatness: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipWidenPath(nativepath.rawAddress.toString(), pen.rawAddress.toString(), matrix.rawAddress.toString(), flatness.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipWindingModeOutline(path: MutPtr<GpPath>, matrix: MutPtr<Matrix>, flatness: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdipWindingModeOutline(path.rawAddress.toString(), matrix.rawAddress.toString(), flatness.toDouble()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiplusNotificationHook(token: MutPtr<ULong>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdiplusNotificationHook(token.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiplusNotificationUnhook(token: ULong) {
    if (windowsWin32GraphicsGdiplusNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsGdiplusGdiplusNotificationUnhook(token.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gdiplusShutdown(token: ULong) {
    if (windowsWin32GraphicsGdiplusNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsGdiplusGdiplusShutdown(token.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gdiplusStartup(token: MutPtr<ULong>, input: ConstPtr<GdiplusStartupInput>, output: MutPtr<GdiplusStartupOutput>): Status =
    if (windowsWin32GraphicsGdiplusNapiAvailable) wasmWindowssysWindowsWin32GraphicsGdiplusGdiplusStartup(token.rawAddress.toString(), input.rawAddress.toString(), output.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
