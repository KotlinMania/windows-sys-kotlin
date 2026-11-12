@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.opengl

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Colorref
import io.github.kotlinmania.windowssys.windows.win32.foundation.Proc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Henhmetafile

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32GraphicsOpenglNapiAddon(): Boolean

private val windowsWin32GraphicsOpenglNapiAvailable: Boolean = initWindowsWin32GraphicsOpenglNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglChoosePixelFormat(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglChoosePixelFormat(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglDescribePixelFormat(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglDescribePixelFormat(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGetEnhMetaFilePixelFormat(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGetEnhMetaFilePixelFormat(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGetPixelFormat(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGetPixelFormat(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglSetPixelFormat(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglSetPixelFormat(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglSwapBuffers(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglSwapBuffers(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlAccum(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlAccum(p0: Int, p1: Double)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlAlphaFunc(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlAlphaFunc(p0: Int, p1: Double)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlAreTexturesResident(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlAreTexturesResident(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlArrayElement(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlArrayElement(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlBegin(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlBegin(p0: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlBindTexture(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlBindTexture(p0: Int, p1: Int)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlBitmap(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlBitmap(p0: Int, p1: Int, p2: Double, p3: Double, p4: Double, p5: Double, p6: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlBlendFunc(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlBlendFunc(p0: Int, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlCallList(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlCallList(p0: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlCallLists(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlCallLists(p0: Int, p1: Int, p2: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlClear(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlClear(p0: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlClearAccum(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlClearAccum(p0: Double, p1: Double, p2: Double, p3: Double)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlClearColor(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlClearColor(p0: Double, p1: Double, p2: Double, p3: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlClearDepth(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlClearDepth(p0: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlClearIndex(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlClearIndex(p0: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlClearStencil(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlClearStencil(p0: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlClipPlane(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlClipPlane(p0: Int, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlColor3b(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlColor3b(p0: Int, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlColor3bv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlColor3bv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlColor3d(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlColor3d(p0: Double, p1: Double, p2: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlColor3dv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlColor3dv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlColor3f(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlColor3f(p0: Double, p1: Double, p2: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlColor3fv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlColor3fv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlColor3i(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlColor3i(p0: Int, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlColor3iv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlColor3iv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlColor3s(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlColor3s(p0: Int, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlColor3sv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlColor3sv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlColor3ub(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlColor3ub(p0: Int, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlColor3ubv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlColor3ubv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlColor3ui(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlColor3ui(p0: Int, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlColor3uiv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlColor3uiv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlColor3us(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlColor3us(p0: Int, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlColor3usv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlColor3usv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlColor4b(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlColor4b(p0: Int, p1: Int, p2: Int, p3: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlColor4bv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlColor4bv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlColor4d(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlColor4d(p0: Double, p1: Double, p2: Double, p3: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlColor4dv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlColor4dv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlColor4f(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlColor4f(p0: Double, p1: Double, p2: Double, p3: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlColor4fv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlColor4fv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlColor4i(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlColor4i(p0: Int, p1: Int, p2: Int, p3: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlColor4iv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlColor4iv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlColor4s(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlColor4s(p0: Int, p1: Int, p2: Int, p3: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlColor4sv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlColor4sv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlColor4ub(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlColor4ub(p0: Int, p1: Int, p2: Int, p3: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlColor4ubv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlColor4ubv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlColor4ui(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlColor4ui(p0: Int, p1: Int, p2: Int, p3: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlColor4uiv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlColor4uiv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlColor4us(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlColor4us(p0: Int, p1: Int, p2: Int, p3: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlColor4usv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlColor4usv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlColorMask(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlColorMask(p0: Int, p1: Int, p2: Int, p3: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlColorMaterial(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlColorMaterial(p0: Int, p1: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlColorPointer(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlColorPointer(p0: Int, p1: Int, p2: Int, p3: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlCopyPixels(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlCopyPixels(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlCopyTexImage1D(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlCopyTexImage1D(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlCopyTexImage2D(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlCopyTexImage2D(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlCopyTexSubImage1D(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlCopyTexSubImage1D(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlCopyTexSubImage2D(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlCopyTexSubImage2D(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlCullFace(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlCullFace(p0: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlDeleteLists(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlDeleteLists(p0: Int, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlDeleteTextures(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlDeleteTextures(p0: Int, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlDepthFunc(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlDepthFunc(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlDepthMask(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlDepthMask(p0: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlDepthRange(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlDepthRange(p0: Double, p1: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlDisable(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlDisable(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlDisableClientState(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlDisableClientState(p0: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlDrawArrays(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlDrawArrays(p0: Int, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlDrawBuffer(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlDrawBuffer(p0: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlDrawElements(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlDrawElements(p0: Int, p1: Int, p2: Int, p3: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlDrawPixels(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlDrawPixels(p0: Int, p1: Int, p2: Int, p3: Int, p4: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlEdgeFlag(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlEdgeFlag(p0: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlEdgeFlagPointer(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlEdgeFlagPointer(p0: Int, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlEdgeFlagv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlEdgeFlagv(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlEnable(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlEnable(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlEnableClientState(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlEnableClientState(p0: Int)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlEnd()")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlEnd()

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlEndList()")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlEndList()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlEvalCoord1d(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlEvalCoord1d(p0: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlEvalCoord1dv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlEvalCoord1dv(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlEvalCoord1f(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlEvalCoord1f(p0: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlEvalCoord1fv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlEvalCoord1fv(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlEvalCoord2d(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlEvalCoord2d(p0: Double, p1: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlEvalCoord2dv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlEvalCoord2dv(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlEvalCoord2f(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlEvalCoord2f(p0: Double, p1: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlEvalCoord2fv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlEvalCoord2fv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlEvalMesh1(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlEvalMesh1(p0: Int, p1: Int, p2: Int)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlEvalMesh2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlEvalMesh2(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlEvalPoint1(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlEvalPoint1(p0: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlEvalPoint2(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlEvalPoint2(p0: Int, p1: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlFeedbackBuffer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlFeedbackBuffer(p0: Int, p1: Int, p2: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlFinish()")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlFinish()

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlFlush()")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlFlush()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlFogf(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlFogf(p0: Int, p1: Double)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlFogfv(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlFogfv(p0: Int, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlFogi(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlFogi(p0: Int, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlFogiv(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlFogiv(p0: Int, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlFrontFace(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlFrontFace(p0: Int)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlFrustum(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlFrustum(p0: Double, p1: Double, p2: Double, p3: Double, p4: Double, p5: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlGenLists(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlGenLists(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlGenTextures(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlGenTextures(p0: Int, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlGetBooleanv(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlGetBooleanv(p0: Int, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlGetClipPlane(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlGetClipPlane(p0: Int, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlGetDoublev(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlGetDoublev(p0: Int, p1: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlGetError()")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlGetError(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlGetFloatv(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlGetFloatv(p0: Int, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlGetIntegerv(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlGetIntegerv(p0: Int, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlGetLightfv(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlGetLightfv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlGetLightiv(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlGetLightiv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlGetMapdv(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlGetMapdv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlGetMapfv(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlGetMapfv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlGetMapiv(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlGetMapiv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlGetMaterialfv(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlGetMaterialfv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlGetMaterialiv(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlGetMaterialiv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlGetPixelMapfv(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlGetPixelMapfv(p0: Int, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlGetPixelMapuiv(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlGetPixelMapuiv(p0: Int, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlGetPixelMapusv(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlGetPixelMapusv(p0: Int, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlGetPointerv(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlGetPointerv(p0: Int, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlGetPolygonStipple(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlGetPolygonStipple(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlGetString(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlGetString(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlGetTexEnvfv(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlGetTexEnvfv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlGetTexEnviv(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlGetTexEnviv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlGetTexGendv(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlGetTexGendv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlGetTexGenfv(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlGetTexGenfv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlGetTexGeniv(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlGetTexGeniv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlGetTexImage(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlGetTexImage(p0: Int, p1: Int, p2: Int, p3: Int, p4: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlGetTexLevelParameterfv(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlGetTexLevelParameterfv(p0: Int, p1: Int, p2: Int, p3: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlGetTexLevelParameteriv(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlGetTexLevelParameteriv(p0: Int, p1: Int, p2: Int, p3: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlGetTexParameterfv(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlGetTexParameterfv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlGetTexParameteriv(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlGetTexParameteriv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlHint(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlHint(p0: Int, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlIndexMask(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlIndexMask(p0: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlIndexPointer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlIndexPointer(p0: Int, p1: Int, p2: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlIndexd(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlIndexd(p0: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlIndexdv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlIndexdv(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlIndexf(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlIndexf(p0: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlIndexfv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlIndexfv(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlIndexi(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlIndexi(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlIndexiv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlIndexiv(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlIndexs(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlIndexs(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlIndexsv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlIndexsv(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlIndexub(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlIndexub(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlIndexubv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlIndexubv(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlInitNames()")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlInitNames()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlInterleavedArrays(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlInterleavedArrays(p0: Int, p1: Int, p2: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlIsEnabled(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlIsEnabled(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlIsList(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlIsList(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlIsTexture(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlIsTexture(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlLightModelf(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlLightModelf(p0: Int, p1: Double)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlLightModelfv(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlLightModelfv(p0: Int, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlLightModeli(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlLightModeli(p0: Int, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlLightModeliv(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlLightModeliv(p0: Int, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlLightf(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlLightf(p0: Int, p1: Int, p2: Double)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlLightfv(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlLightfv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlLighti(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlLighti(p0: Int, p1: Int, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlLightiv(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlLightiv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlLineStipple(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlLineStipple(p0: Int, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlLineWidth(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlLineWidth(p0: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlListBase(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlListBase(p0: Int)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlLoadIdentity()")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlLoadIdentity()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlLoadMatrixd(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlLoadMatrixd(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlLoadMatrixf(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlLoadMatrixf(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlLoadName(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlLoadName(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlLogicOp(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlLogicOp(p0: Int)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlMap1d(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlMap1d(p0: Int, p1: Double, p2: Double, p3: Int, p4: Int, p5: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlMap1f(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlMap1f(p0: Int, p1: Double, p2: Double, p3: Int, p4: Int, p5: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlMap2d(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlMap2d(p0: Int, p1: Double, p2: Double, p3: Int, p4: Int, p5: Double, p6: Double, p7: Int, p8: Int, p9: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlMap2f(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlMap2f(p0: Int, p1: Double, p2: Double, p3: Int, p4: Int, p5: Double, p6: Double, p7: Int, p8: Int, p9: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlMapGrid1d(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlMapGrid1d(p0: Int, p1: Double, p2: Double)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlMapGrid1f(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlMapGrid1f(p0: Int, p1: Double, p2: Double)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlMapGrid2d(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlMapGrid2d(p0: Int, p1: Double, p2: Double, p3: Int, p4: Double, p5: Double)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlMapGrid2f(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlMapGrid2f(p0: Int, p1: Double, p2: Double, p3: Int, p4: Double, p5: Double)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlMaterialf(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlMaterialf(p0: Int, p1: Int, p2: Double)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlMaterialfv(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlMaterialfv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlMateriali(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlMateriali(p0: Int, p1: Int, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlMaterialiv(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlMaterialiv(p0: Int, p1: Int, p2: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlMatrixMode(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlMatrixMode(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlMultMatrixd(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlMultMatrixd(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlMultMatrixf(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlMultMatrixf(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlNewList(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlNewList(p0: Int, p1: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlNormal3b(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlNormal3b(p0: Int, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlNormal3bv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlNormal3bv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlNormal3d(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlNormal3d(p0: Double, p1: Double, p2: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlNormal3dv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlNormal3dv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlNormal3f(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlNormal3f(p0: Double, p1: Double, p2: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlNormal3fv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlNormal3fv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlNormal3i(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlNormal3i(p0: Int, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlNormal3iv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlNormal3iv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlNormal3s(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlNormal3s(p0: Int, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlNormal3sv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlNormal3sv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlNormalPointer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlNormalPointer(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlOrtho(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlOrtho(p0: Double, p1: Double, p2: Double, p3: Double, p4: Double, p5: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlPassThrough(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlPassThrough(p0: Double)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlPixelMapfv(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlPixelMapfv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlPixelMapuiv(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlPixelMapuiv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlPixelMapusv(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlPixelMapusv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlPixelStoref(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlPixelStoref(p0: Int, p1: Double)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlPixelStorei(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlPixelStorei(p0: Int, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlPixelTransferf(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlPixelTransferf(p0: Int, p1: Double)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlPixelTransferi(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlPixelTransferi(p0: Int, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlPixelZoom(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlPixelZoom(p0: Double, p1: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlPointSize(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlPointSize(p0: Double)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlPolygonMode(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlPolygonMode(p0: Int, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlPolygonOffset(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlPolygonOffset(p0: Double, p1: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlPolygonStipple(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlPolygonStipple(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlPopAttrib()")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlPopAttrib()

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlPopClientAttrib()")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlPopClientAttrib()

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlPopMatrix()")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlPopMatrix()

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlPopName()")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlPopName()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlPrioritizeTextures(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlPrioritizeTextures(p0: Int, p1: String, p2: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlPushAttrib(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlPushAttrib(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlPushClientAttrib(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlPushClientAttrib(p0: Int)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlPushMatrix()")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlPushMatrix()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlPushName(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlPushName(p0: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlRasterPos2d(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos2d(p0: Double, p1: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlRasterPos2dv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos2dv(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlRasterPos2f(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos2f(p0: Double, p1: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlRasterPos2fv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos2fv(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlRasterPos2i(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos2i(p0: Int, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlRasterPos2iv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos2iv(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlRasterPos2s(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos2s(p0: Int, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlRasterPos2sv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos2sv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlRasterPos3d(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos3d(p0: Double, p1: Double, p2: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlRasterPos3dv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos3dv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlRasterPos3f(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos3f(p0: Double, p1: Double, p2: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlRasterPos3fv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos3fv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlRasterPos3i(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos3i(p0: Int, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlRasterPos3iv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos3iv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlRasterPos3s(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos3s(p0: Int, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlRasterPos3sv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos3sv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlRasterPos4d(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos4d(p0: Double, p1: Double, p2: Double, p3: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlRasterPos4dv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos4dv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlRasterPos4f(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos4f(p0: Double, p1: Double, p2: Double, p3: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlRasterPos4fv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos4fv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlRasterPos4i(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos4i(p0: Int, p1: Int, p2: Int, p3: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlRasterPos4iv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos4iv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlRasterPos4s(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos4s(p0: Int, p1: Int, p2: Int, p3: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlRasterPos4sv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos4sv(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlReadBuffer(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlReadBuffer(p0: Int)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlReadPixels(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlReadPixels(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlRectd(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlRectd(p0: Double, p1: Double, p2: Double, p3: Double)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlRectdv(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlRectdv(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlRectf(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlRectf(p0: Double, p1: Double, p2: Double, p3: Double)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlRectfv(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlRectfv(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlRecti(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlRecti(p0: Int, p1: Int, p2: Int, p3: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlRectiv(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlRectiv(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlRects(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlRects(p0: Int, p1: Int, p2: Int, p3: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlRectsv(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlRectsv(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlRenderMode(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlRenderMode(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlRotated(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlRotated(p0: Double, p1: Double, p2: Double, p3: Double)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlRotatef(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlRotatef(p0: Double, p1: Double, p2: Double, p3: Double)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlScaled(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlScaled(p0: Double, p1: Double, p2: Double)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlScalef(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlScalef(p0: Double, p1: Double, p2: Double)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlScissor(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlScissor(p0: Int, p1: Int, p2: Int, p3: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlSelectBuffer(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlSelectBuffer(p0: Int, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlShadeModel(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlShadeModel(p0: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlStencilFunc(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlStencilFunc(p0: Int, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlStencilMask(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlStencilMask(p0: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlStencilOp(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlStencilOp(p0: Int, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexCoord1d(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord1d(p0: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexCoord1dv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord1dv(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexCoord1f(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord1f(p0: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexCoord1fv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord1fv(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexCoord1i(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord1i(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexCoord1iv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord1iv(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexCoord1s(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord1s(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexCoord1sv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord1sv(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexCoord2d(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord2d(p0: Double, p1: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexCoord2dv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord2dv(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexCoord2f(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord2f(p0: Double, p1: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexCoord2fv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord2fv(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexCoord2i(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord2i(p0: Int, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexCoord2iv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord2iv(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexCoord2s(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord2s(p0: Int, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexCoord2sv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord2sv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexCoord3d(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord3d(p0: Double, p1: Double, p2: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexCoord3dv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord3dv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexCoord3f(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord3f(p0: Double, p1: Double, p2: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexCoord3fv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord3fv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexCoord3i(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord3i(p0: Int, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexCoord3iv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord3iv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexCoord3s(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord3s(p0: Int, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexCoord3sv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord3sv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexCoord4d(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord4d(p0: Double, p1: Double, p2: Double, p3: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexCoord4dv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord4dv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexCoord4f(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord4f(p0: Double, p1: Double, p2: Double, p3: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexCoord4fv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord4fv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexCoord4i(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord4i(p0: Int, p1: Int, p2: Int, p3: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexCoord4iv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord4iv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexCoord4s(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord4s(p0: Int, p1: Int, p2: Int, p3: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexCoord4sv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord4sv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexCoordPointer(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoordPointer(p0: Int, p1: Int, p2: Int, p3: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexEnvf(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexEnvf(p0: Int, p1: Int, p2: Double)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexEnvfv(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexEnvfv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexEnvi(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexEnvi(p0: Int, p1: Int, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexEnviv(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexEnviv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexGend(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexGend(p0: Int, p1: Int, p2: Double)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexGendv(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexGendv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexGenf(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexGenf(p0: Int, p1: Int, p2: Double)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexGenfv(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexGenfv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexGeni(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexGeni(p0: Int, p1: Int, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexGeniv(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexGeniv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexImage1D(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexImage1D(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexImage2D(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexImage2D(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexParameterf(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexParameterf(p0: Int, p1: Int, p2: Double)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexParameterfv(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexParameterfv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexParameteri(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexParameteri(p0: Int, p1: Int, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexParameteriv(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexParameteriv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexSubImage1D(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexSubImage1D(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTexSubImage2D(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTexSubImage2D(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTranslated(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTranslated(p0: Double, p1: Double, p2: Double)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlTranslatef(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlTranslatef(p0: Double, p1: Double, p2: Double)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlVertex2d(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlVertex2d(p0: Double, p1: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlVertex2dv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlVertex2dv(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlVertex2f(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlVertex2f(p0: Double, p1: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlVertex2fv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlVertex2fv(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlVertex2i(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlVertex2i(p0: Int, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlVertex2iv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlVertex2iv(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlVertex2s(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlVertex2s(p0: Int, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlVertex2sv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlVertex2sv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlVertex3d(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlVertex3d(p0: Double, p1: Double, p2: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlVertex3dv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlVertex3dv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlVertex3f(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlVertex3f(p0: Double, p1: Double, p2: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlVertex3fv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlVertex3fv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlVertex3i(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlVertex3i(p0: Int, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlVertex3iv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlVertex3iv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlVertex3s(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlVertex3s(p0: Int, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlVertex3sv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlVertex3sv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlVertex4d(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlVertex4d(p0: Double, p1: Double, p2: Double, p3: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlVertex4dv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlVertex4dv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlVertex4f(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlVertex4f(p0: Double, p1: Double, p2: Double, p3: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlVertex4fv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlVertex4fv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlVertex4i(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlVertex4i(p0: Int, p1: Int, p2: Int, p3: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlVertex4iv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlVertex4iv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlVertex4s(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlVertex4s(p0: Int, p1: Int, p2: Int, p3: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlVertex4sv(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlVertex4sv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlVertexPointer(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlVertexPointer(p0: Int, p1: Int, p2: Int, p3: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGlViewport(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGlViewport(p0: Int, p1: Int, p2: Int, p3: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluBeginCurve(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluBeginCurve(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluBeginPolygon(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluBeginPolygon(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluBeginSurface(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluBeginSurface(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluBeginTrim(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluBeginTrim(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluBuild1DMipmaps(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluBuild1DMipmaps(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluBuild2DMipmaps(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluBuild2DMipmaps(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluCylinder(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluCylinder(p0: String, p1: Double, p2: Double, p3: Double, p4: Int, p5: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluDeleteNurbsRenderer(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluDeleteNurbsRenderer(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluDeleteQuadric(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluDeleteQuadric(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluDeleteTess(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluDeleteTess(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluDisk(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluDisk(p0: String, p1: Double, p2: Double, p3: Int, p4: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluEndCurve(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluEndCurve(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluEndPolygon(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluEndPolygon(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluEndSurface(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluEndSurface(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluEndTrim(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluEndTrim(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluErrorString(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluErrorString(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluErrorUnicodeStringEXT(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluErrorUnicodeStringEXT(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluGetNurbsProperty(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluGetNurbsProperty(p0: String, p1: Int, p2: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluGetString(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluGetString(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluGetTessProperty(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluGetTessProperty(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluLoadSamplingMatrices(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluLoadSamplingMatrices(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluLookAt(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluLookAt(p0: Double, p1: Double, p2: Double, p3: Double, p4: Double, p5: Double, p6: Double, p7: Double, p8: Double)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluNewNurbsRenderer()")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluNewNurbsRenderer(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluNewQuadric()")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluNewQuadric(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluNewTess()")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluNewTess(): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluNextContour(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluNextContour(p0: String, p1: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluNurbsCallback(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluNurbsCallback(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluNurbsCurve(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluNurbsCurve(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluNurbsProperty(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluNurbsProperty(p0: String, p1: Int, p2: Double)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluNurbsSurface(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluNurbsSurface(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int, p7: String, p8: Int, p9: Int, p10: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluOrtho2D(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluOrtho2D(p0: Double, p1: Double, p2: Double, p3: Double)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluPartialDisk(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluPartialDisk(p0: String, p1: Double, p2: Double, p3: Int, p4: Int, p5: Double, p6: Double)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluPerspective(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluPerspective(p0: Double, p1: Double, p2: Double, p3: Double)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluPickMatrix(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluPickMatrix(p0: Double, p1: Double, p2: Double, p3: Double, p4: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluProject(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluProject(p0: Double, p1: Double, p2: Double, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluPwlCurve(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluPwlCurve(p0: String, p1: Int, p2: String, p3: Int, p4: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluQuadricCallback(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluQuadricCallback(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluQuadricDrawStyle(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluQuadricDrawStyle(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluQuadricNormals(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluQuadricNormals(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluQuadricOrientation(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluQuadricOrientation(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluQuadricTexture(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluQuadricTexture(p0: String, p1: Int)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluScaleImage(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluScaleImage(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: Int, p7: Int, p8: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluSphere(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluSphere(p0: String, p1: Double, p2: Int, p3: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluTessBeginContour(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluTessBeginContour(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluTessBeginPolygon(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluTessBeginPolygon(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluTessCallback(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluTessCallback(p0: String, p1: Int, p2: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluTessEndContour(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluTessEndContour(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluTessEndPolygon(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluTessEndPolygon(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluTessNormal(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluTessNormal(p0: String, p1: Double, p2: Double, p3: Double)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluTessProperty(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluTessProperty(p0: String, p1: Int, p2: Double)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluTessVertex(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluTessVertex(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglGluUnProject(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglGluUnProject(p0: Double, p1: Double, p2: Double, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglWglCopyContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglWglCopyContext(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglWglCreateContext(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglWglCreateContext(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglWglCreateLayerContext(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglWglCreateLayerContext(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglWglDeleteContext(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglWglDeleteContext(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglWglDescribeLayerPlane(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglWglDescribeLayerPlane(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglWglGetCurrentContext()")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglWglGetCurrentContext(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglWglGetCurrentDC()")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglWglGetCurrentDC(): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglWglGetLayerPaletteEntries(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglWglGetLayerPaletteEntries(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglWglGetProcAddress(p0)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglWglGetProcAddress(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglWglMakeCurrent(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglWglMakeCurrent(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglWglRealizeLayerPalette(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglWglRealizeLayerPalette(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglWglSetLayerPaletteEntries(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglWglSetLayerPaletteEntries(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglWglShareLists(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglWglShareLists(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglWglSwapLayerBuffers(p0, p1)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglWglSwapLayerBuffers(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglWglUseFontBitmapsA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglWglUseFontBitmapsA(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglWglUseFontBitmapsW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglWglUseFontBitmapsW(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglWglUseFontOutlinesA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglWglUseFontOutlinesA(p0: String, p1: Int, p2: Int, p3: Int, p4: Double, p5: Double, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32GraphicsOpenglWglUseFontOutlinesW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32GraphicsOpenglWglUseFontOutlinesW(p0: String, p1: Int, p2: Int, p3: Int, p4: Double, p5: Double, p6: Int, p7: String): Int

public actual fun choosePixelFormat(hdc: Hdc, ppfd: ConstPtr<Pixelformatdescriptor>): Int =
    if (windowsWin32GraphicsOpenglNapiAvailable) wasmWindowssysWindowsWin32GraphicsOpenglChoosePixelFormat(hdc.rawAddress.toString(), ppfd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun describePixelFormat(hdc: Hdc, ipixelformat: Int, nbytes: UInt, ppfd: MutPtr<Pixelformatdescriptor>): Int =
    if (windowsWin32GraphicsOpenglNapiAvailable) wasmWindowssysWindowsWin32GraphicsOpenglDescribePixelFormat(hdc.rawAddress.toString(), ipixelformat, nbytes.toInt(), ppfd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnhMetaFilePixelFormat(hemf: Henhmetafile, cbbuffer: UInt, ppfd: MutPtr<Pixelformatdescriptor>): UInt =
    if (windowsWin32GraphicsOpenglNapiAvailable) wasmWindowssysWindowsWin32GraphicsOpenglGetEnhMetaFilePixelFormat(hemf.rawAddress.toString(), cbbuffer.toInt(), ppfd.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPixelFormat(hdc: Hdc): Int =
    if (windowsWin32GraphicsOpenglNapiAvailable) wasmWindowssysWindowsWin32GraphicsOpenglGetPixelFormat(hdc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPixelFormat(hdc: Hdc, format: Int, ppfd: ConstPtr<Pixelformatdescriptor>): Bool =
    if (windowsWin32GraphicsOpenglNapiAvailable) wasmWindowssysWindowsWin32GraphicsOpenglSetPixelFormat(hdc.rawAddress.toString(), format, ppfd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swapBuffers(param0: Hdc): Bool =
    if (windowsWin32GraphicsOpenglNapiAvailable) wasmWindowssysWindowsWin32GraphicsOpenglSwapBuffers(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glAccum(op: UInt, value: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlAccum(op.toInt(), value.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glAlphaFunc(func: UInt, ref: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlAlphaFunc(func.toInt(), ref.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glAreTexturesResident(n: Int, textures: ConstPtr<UInt>, residences: MutPtr<UByte>): UByte =
    if (windowsWin32GraphicsOpenglNapiAvailable) wasmWindowssysWindowsWin32GraphicsOpenglGlAreTexturesResident(n, textures.rawAddress.toString(), residences.rawAddress.toString()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glArrayElement(i: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlArrayElement(i)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glBegin(mode: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlBegin(mode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glBindTexture(target: UInt, texture: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlBindTexture(target.toInt(), texture.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glBitmap(width: Int, height: Int, xorig: Float, yorig: Float, xmove: Float, ymove: Float, bitmap: ConstPtr<UByte>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlBitmap(width, height, xorig.toDouble(), yorig.toDouble(), xmove.toDouble(), ymove.toDouble(), bitmap.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glBlendFunc(sfactor: UInt, dfactor: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlBlendFunc(sfactor.toInt(), dfactor.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glCallList(list: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlCallList(list.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glCallLists(n: Int, type: UInt, lists: ConstPtr<CVoid>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlCallLists(n, type.toInt(), lists.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glClear(mask: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlClear(mask.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glClearAccum(red: Float, green: Float, blue: Float, alpha: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlClearAccum(red.toDouble(), green.toDouble(), blue.toDouble(), alpha.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glClearColor(red: Float, green: Float, blue: Float, alpha: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlClearColor(red.toDouble(), green.toDouble(), blue.toDouble(), alpha.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glClearDepth(depth: Double) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlClearDepth(depth)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glClearIndex(c: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlClearIndex(c.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glClearStencil(s: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlClearStencil(s)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glClipPlane(plane: UInt, equation: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlClipPlane(plane.toInt(), equation.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3b(red: Byte, green: Byte, blue: Byte) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlColor3b(red.toInt(), green.toInt(), blue.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3bv(v: ConstPtr<Byte>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlColor3bv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3d(red: Double, green: Double, blue: Double) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlColor3d(red, green, blue)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3dv(v: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlColor3dv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3f(red: Float, green: Float, blue: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlColor3f(red.toDouble(), green.toDouble(), blue.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3fv(v: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlColor3fv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3i(red: Int, green: Int, blue: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlColor3i(red, green, blue)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3iv(v: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlColor3iv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3s(red: Short, green: Short, blue: Short) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlColor3s(red.toInt(), green.toInt(), blue.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3sv(v: ConstPtr<Short>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlColor3sv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3ub(red: UByte, green: UByte, blue: UByte) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlColor3ub(red.toInt(), green.toInt(), blue.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3ubv(v: ConstPtr<UByte>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlColor3ubv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3ui(red: UInt, green: UInt, blue: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlColor3ui(red.toInt(), green.toInt(), blue.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3uiv(v: ConstPtr<UInt>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlColor3uiv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3us(red: UShort, green: UShort, blue: UShort) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlColor3us(red.toInt(), green.toInt(), blue.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3usv(v: ConstPtr<UShort>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlColor3usv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4b(red: Byte, green: Byte, blue: Byte, alpha: Byte) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlColor4b(red.toInt(), green.toInt(), blue.toInt(), alpha.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4bv(v: ConstPtr<Byte>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlColor4bv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4d(red: Double, green: Double, blue: Double, alpha: Double) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlColor4d(red, green, blue, alpha)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4dv(v: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlColor4dv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4f(red: Float, green: Float, blue: Float, alpha: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlColor4f(red.toDouble(), green.toDouble(), blue.toDouble(), alpha.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4fv(v: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlColor4fv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4i(red: Int, green: Int, blue: Int, alpha: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlColor4i(red, green, blue, alpha)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4iv(v: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlColor4iv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4s(red: Short, green: Short, blue: Short, alpha: Short) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlColor4s(red.toInt(), green.toInt(), blue.toInt(), alpha.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4sv(v: ConstPtr<Short>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlColor4sv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4ub(red: UByte, green: UByte, blue: UByte, alpha: UByte) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlColor4ub(red.toInt(), green.toInt(), blue.toInt(), alpha.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4ubv(v: ConstPtr<UByte>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlColor4ubv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4ui(red: UInt, green: UInt, blue: UInt, alpha: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlColor4ui(red.toInt(), green.toInt(), blue.toInt(), alpha.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4uiv(v: ConstPtr<UInt>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlColor4uiv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4us(red: UShort, green: UShort, blue: UShort, alpha: UShort) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlColor4us(red.toInt(), green.toInt(), blue.toInt(), alpha.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4usv(v: ConstPtr<UShort>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlColor4usv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColorMask(red: UByte, green: UByte, blue: UByte, alpha: UByte) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlColorMask(red.toInt(), green.toInt(), blue.toInt(), alpha.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColorMaterial(face: UInt, mode: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlColorMaterial(face.toInt(), mode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColorPointer(size: Int, type: UInt, stride: Int, pointer: ConstPtr<CVoid>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlColorPointer(size, type.toInt(), stride, pointer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glCopyPixels(x: Int, y: Int, width: Int, height: Int, type: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlCopyPixels(x, y, width, height, type.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glCopyTexImage1D(target: UInt, level: Int, internalformat: UInt, x: Int, y: Int, width: Int, border: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlCopyTexImage1D(target.toInt(), level, internalformat.toInt(), x, y, width, border)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glCopyTexImage2D(target: UInt, level: Int, internalformat: UInt, x: Int, y: Int, width: Int, height: Int, border: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlCopyTexImage2D(target.toInt(), level, internalformat.toInt(), x, y, width, height, border)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glCopyTexSubImage1D(target: UInt, level: Int, xoffset: Int, x: Int, y: Int, width: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlCopyTexSubImage1D(target.toInt(), level, xoffset, x, y, width)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glCopyTexSubImage2D(target: UInt, level: Int, xoffset: Int, yoffset: Int, x: Int, y: Int, width: Int, height: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlCopyTexSubImage2D(target.toInt(), level, xoffset, yoffset, x, y, width, height)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glCullFace(mode: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlCullFace(mode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glDeleteLists(list: UInt, range: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlDeleteLists(list.toInt(), range)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glDeleteTextures(n: Int, textures: ConstPtr<UInt>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlDeleteTextures(n, textures.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glDepthFunc(func: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlDepthFunc(func.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glDepthMask(flag: UByte) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlDepthMask(flag.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glDepthRange(znear: Double, zfar: Double) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlDepthRange(znear, zfar)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glDisable(cap: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlDisable(cap.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glDisableClientState(array: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlDisableClientState(array.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glDrawArrays(mode: UInt, first: Int, count: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlDrawArrays(mode.toInt(), first, count)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glDrawBuffer(mode: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlDrawBuffer(mode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glDrawElements(mode: UInt, count: Int, type: UInt, indices: ConstPtr<CVoid>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlDrawElements(mode.toInt(), count, type.toInt(), indices.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glDrawPixels(width: Int, height: Int, format: UInt, type: UInt, pixels: ConstPtr<CVoid>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlDrawPixels(width, height, format.toInt(), type.toInt(), pixels.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEdgeFlag(flag: UByte) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlEdgeFlag(flag.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEdgeFlagPointer(stride: Int, pointer: ConstPtr<CVoid>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlEdgeFlagPointer(stride, pointer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEdgeFlagv(flag: ConstPtr<UByte>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlEdgeFlagv(flag.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEnable(cap: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlEnable(cap.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEnableClientState(array: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlEnableClientState(array.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEnd() {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlEnd()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEndList() {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlEndList()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEvalCoord1d(u: Double) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlEvalCoord1d(u)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEvalCoord1dv(u: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlEvalCoord1dv(u.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEvalCoord1f(u: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlEvalCoord1f(u.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEvalCoord1fv(u: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlEvalCoord1fv(u.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEvalCoord2d(u: Double, v: Double) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlEvalCoord2d(u, v)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEvalCoord2dv(u: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlEvalCoord2dv(u.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEvalCoord2f(u: Float, v: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlEvalCoord2f(u.toDouble(), v.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEvalCoord2fv(u: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlEvalCoord2fv(u.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEvalMesh1(mode: UInt, i1: Int, i2: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlEvalMesh1(mode.toInt(), i1, i2)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEvalMesh2(mode: UInt, i1: Int, i2: Int, j1: Int, j2: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlEvalMesh2(mode.toInt(), i1, i2, j1, j2)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEvalPoint1(i: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlEvalPoint1(i)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEvalPoint2(i: Int, j: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlEvalPoint2(i, j)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glFeedbackBuffer(size: Int, type: UInt, buffer: MutPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlFeedbackBuffer(size, type.toInt(), buffer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glFinish() {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlFinish()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glFlush() {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlFlush()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glFogf(pname: UInt, param1: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlFogf(pname.toInt(), param1.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glFogfv(pname: UInt, params: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlFogfv(pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glFogi(pname: UInt, param1: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlFogi(pname.toInt(), param1)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glFogiv(pname: UInt, params: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlFogiv(pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glFrontFace(mode: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlFrontFace(mode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glFrustum(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlFrustum(left, right, bottom, top, znear, zfar)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGenLists(range: Int): UInt =
    if (windowsWin32GraphicsOpenglNapiAvailable) wasmWindowssysWindowsWin32GraphicsOpenglGlGenLists(range).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glGenTextures(n: Int, textures: MutPtr<UInt>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlGenTextures(n, textures.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetBooleanv(pname: UInt, params: MutPtr<UByte>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlGetBooleanv(pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetClipPlane(plane: UInt, equation: MutPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlGetClipPlane(plane.toInt(), equation.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetDoublev(pname: UInt, params: MutPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlGetDoublev(pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetError(): UInt =
    if (windowsWin32GraphicsOpenglNapiAvailable) wasmWindowssysWindowsWin32GraphicsOpenglGlGetError().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glGetFloatv(pname: UInt, params: MutPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlGetFloatv(pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetIntegerv(pname: UInt, params: MutPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlGetIntegerv(pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetLightfv(light: UInt, pname: UInt, params: MutPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlGetLightfv(light.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetLightiv(light: UInt, pname: UInt, params: MutPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlGetLightiv(light.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetMapdv(target: UInt, query: UInt, v: MutPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlGetMapdv(target.toInt(), query.toInt(), v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetMapfv(target: UInt, query: UInt, v: MutPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlGetMapfv(target.toInt(), query.toInt(), v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetMapiv(target: UInt, query: UInt, v: MutPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlGetMapiv(target.toInt(), query.toInt(), v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetMaterialfv(face: UInt, pname: UInt, params: MutPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlGetMaterialfv(face.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetMaterialiv(face: UInt, pname: UInt, params: MutPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlGetMaterialiv(face.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetPixelMapfv(map: UInt, values: MutPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlGetPixelMapfv(map.toInt(), values.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetPixelMapuiv(map: UInt, values: MutPtr<UInt>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlGetPixelMapuiv(map.toInt(), values.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetPixelMapusv(map: UInt, values: MutPtr<UShort>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlGetPixelMapusv(map.toInt(), values.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetPointerv(pname: UInt, params: MutPtr<MutPtr<CVoid>>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlGetPointerv(pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetPolygonStipple(mask: MutPtr<UByte>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlGetPolygonStipple(mask.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetString(name: UInt): MutPtr<UByte> =
    if (windowsWin32GraphicsOpenglNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsOpenglGlGetString(name.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glGetTexEnvfv(target: UInt, pname: UInt, params: MutPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlGetTexEnvfv(target.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetTexEnviv(target: UInt, pname: UInt, params: MutPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlGetTexEnviv(target.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetTexGendv(coord: UInt, pname: UInt, params: MutPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlGetTexGendv(coord.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetTexGenfv(coord: UInt, pname: UInt, params: MutPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlGetTexGenfv(coord.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetTexGeniv(coord: UInt, pname: UInt, params: MutPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlGetTexGeniv(coord.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetTexImage(target: UInt, level: Int, format: UInt, type: UInt, pixels: MutPtr<CVoid>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlGetTexImage(target.toInt(), level, format.toInt(), type.toInt(), pixels.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetTexLevelParameterfv(target: UInt, level: Int, pname: UInt, params: MutPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlGetTexLevelParameterfv(target.toInt(), level, pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetTexLevelParameteriv(target: UInt, level: Int, pname: UInt, params: MutPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlGetTexLevelParameteriv(target.toInt(), level, pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetTexParameterfv(target: UInt, pname: UInt, params: MutPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlGetTexParameterfv(target.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetTexParameteriv(target: UInt, pname: UInt, params: MutPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlGetTexParameteriv(target.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glHint(target: UInt, mode: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlHint(target.toInt(), mode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIndexMask(mask: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlIndexMask(mask.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIndexPointer(type: UInt, stride: Int, pointer: ConstPtr<CVoid>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlIndexPointer(type.toInt(), stride, pointer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIndexd(c: Double) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlIndexd(c)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIndexdv(c: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlIndexdv(c.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIndexf(c: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlIndexf(c.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIndexfv(c: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlIndexfv(c.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIndexi(c: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlIndexi(c)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIndexiv(c: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlIndexiv(c.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIndexs(c: Short) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlIndexs(c.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIndexsv(c: ConstPtr<Short>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlIndexsv(c.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIndexub(c: UByte) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlIndexub(c.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIndexubv(c: ConstPtr<UByte>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlIndexubv(c.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glInitNames() {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlInitNames()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glInterleavedArrays(format: UInt, stride: Int, pointer: ConstPtr<CVoid>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlInterleavedArrays(format.toInt(), stride, pointer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIsEnabled(cap: UInt): UByte =
    if (windowsWin32GraphicsOpenglNapiAvailable) wasmWindowssysWindowsWin32GraphicsOpenglGlIsEnabled(cap.toInt()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glIsList(list: UInt): UByte =
    if (windowsWin32GraphicsOpenglNapiAvailable) wasmWindowssysWindowsWin32GraphicsOpenglGlIsList(list.toInt()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glIsTexture(texture: UInt): UByte =
    if (windowsWin32GraphicsOpenglNapiAvailable) wasmWindowssysWindowsWin32GraphicsOpenglGlIsTexture(texture.toInt()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glLightModelf(pname: UInt, param1: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlLightModelf(pname.toInt(), param1.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLightModelfv(pname: UInt, params: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlLightModelfv(pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLightModeli(pname: UInt, param1: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlLightModeli(pname.toInt(), param1)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLightModeliv(pname: UInt, params: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlLightModeliv(pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLightf(light: UInt, pname: UInt, param2: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlLightf(light.toInt(), pname.toInt(), param2.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLightfv(light: UInt, pname: UInt, params: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlLightfv(light.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLighti(light: UInt, pname: UInt, param2: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlLighti(light.toInt(), pname.toInt(), param2)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLightiv(light: UInt, pname: UInt, params: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlLightiv(light.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLineStipple(factor: Int, pattern: UShort) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlLineStipple(factor, pattern.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLineWidth(width: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlLineWidth(width.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glListBase(base: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlListBase(base.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLoadIdentity() {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlLoadIdentity()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLoadMatrixd(m: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlLoadMatrixd(m.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLoadMatrixf(m: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlLoadMatrixf(m.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLoadName(name: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlLoadName(name.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLogicOp(opcode: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlLogicOp(opcode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMap1d(target: UInt, u1: Double, u2: Double, stride: Int, order: Int, points: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlMap1d(target.toInt(), u1, u2, stride, order, points.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMap1f(target: UInt, u1: Float, u2: Float, stride: Int, order: Int, points: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlMap1f(target.toInt(), u1.toDouble(), u2.toDouble(), stride, order, points.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMap2d(target: UInt, u1: Double, u2: Double, ustride: Int, uorder: Int, v1: Double, v2: Double, vstride: Int, vorder: Int, points: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlMap2d(target.toInt(), u1, u2, ustride, uorder, v1, v2, vstride, vorder, points.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMap2f(target: UInt, u1: Float, u2: Float, ustride: Int, uorder: Int, v1: Float, v2: Float, vstride: Int, vorder: Int, points: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlMap2f(target.toInt(), u1.toDouble(), u2.toDouble(), ustride, uorder, v1.toDouble(), v2.toDouble(), vstride, vorder, points.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMapGrid1d(un: Int, u1: Double, u2: Double) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlMapGrid1d(un, u1, u2)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMapGrid1f(un: Int, u1: Float, u2: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlMapGrid1f(un, u1.toDouble(), u2.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMapGrid2d(un: Int, u1: Double, u2: Double, vn: Int, v1: Double, v2: Double) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlMapGrid2d(un, u1, u2, vn, v1, v2)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMapGrid2f(un: Int, u1: Float, u2: Float, vn: Int, v1: Float, v2: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlMapGrid2f(un, u1.toDouble(), u2.toDouble(), vn, v1.toDouble(), v2.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMaterialf(face: UInt, pname: UInt, param2: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlMaterialf(face.toInt(), pname.toInt(), param2.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMaterialfv(face: UInt, pname: UInt, params: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlMaterialfv(face.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMateriali(face: UInt, pname: UInt, param2: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlMateriali(face.toInt(), pname.toInt(), param2)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMaterialiv(face: UInt, pname: UInt, params: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlMaterialiv(face.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMatrixMode(mode: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlMatrixMode(mode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMultMatrixd(m: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlMultMatrixd(m.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMultMatrixf(m: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlMultMatrixf(m.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glNewList(list: UInt, mode: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlNewList(list.toInt(), mode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glNormal3b(nx: Byte, ny: Byte, nz: Byte) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlNormal3b(nx.toInt(), ny.toInt(), nz.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glNormal3bv(v: ConstPtr<Byte>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlNormal3bv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glNormal3d(nx: Double, ny: Double, nz: Double) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlNormal3d(nx, ny, nz)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glNormal3dv(v: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlNormal3dv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glNormal3f(nx: Float, ny: Float, nz: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlNormal3f(nx.toDouble(), ny.toDouble(), nz.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glNormal3fv(v: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlNormal3fv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glNormal3i(nx: Int, ny: Int, nz: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlNormal3i(nx, ny, nz)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glNormal3iv(v: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlNormal3iv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glNormal3s(nx: Short, ny: Short, nz: Short) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlNormal3s(nx.toInt(), ny.toInt(), nz.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glNormal3sv(v: ConstPtr<Short>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlNormal3sv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glNormalPointer(type: UInt, stride: Int, pointer: ConstPtr<CVoid>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlNormalPointer(type.toInt(), stride, pointer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glOrtho(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlOrtho(left, right, bottom, top, znear, zfar)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPassThrough(token: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlPassThrough(token.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPixelMapfv(map: UInt, mapsize: Int, values: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlPixelMapfv(map.toInt(), mapsize, values.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPixelMapuiv(map: UInt, mapsize: Int, values: ConstPtr<UInt>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlPixelMapuiv(map.toInt(), mapsize, values.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPixelMapusv(map: UInt, mapsize: Int, values: ConstPtr<UShort>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlPixelMapusv(map.toInt(), mapsize, values.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPixelStoref(pname: UInt, param1: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlPixelStoref(pname.toInt(), param1.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPixelStorei(pname: UInt, param1: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlPixelStorei(pname.toInt(), param1)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPixelTransferf(pname: UInt, param1: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlPixelTransferf(pname.toInt(), param1.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPixelTransferi(pname: UInt, param1: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlPixelTransferi(pname.toInt(), param1)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPixelZoom(xfactor: Float, yfactor: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlPixelZoom(xfactor.toDouble(), yfactor.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPointSize(size: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlPointSize(size.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPolygonMode(face: UInt, mode: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlPolygonMode(face.toInt(), mode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPolygonOffset(factor: Float, units: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlPolygonOffset(factor.toDouble(), units.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPolygonStipple(mask: ConstPtr<UByte>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlPolygonStipple(mask.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPopAttrib() {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlPopAttrib()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPopClientAttrib() {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlPopClientAttrib()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPopMatrix() {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlPopMatrix()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPopName() {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlPopName()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPrioritizeTextures(n: Int, textures: ConstPtr<UInt>, priorities: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlPrioritizeTextures(n, textures.rawAddress.toString(), priorities.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPushAttrib(mask: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlPushAttrib(mask.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPushClientAttrib(mask: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlPushClientAttrib(mask.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPushMatrix() {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlPushMatrix()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPushName(name: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlPushName(name.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos2d(x: Double, y: Double) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos2d(x, y)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos2dv(v: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos2dv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos2f(x: Float, y: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos2f(x.toDouble(), y.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos2fv(v: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos2fv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos2i(x: Int, y: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos2i(x, y)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos2iv(v: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos2iv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos2s(x: Short, y: Short) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos2s(x.toInt(), y.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos2sv(v: ConstPtr<Short>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos2sv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos3d(x: Double, y: Double, z: Double) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos3d(x, y, z)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos3dv(v: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos3dv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos3f(x: Float, y: Float, z: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos3f(x.toDouble(), y.toDouble(), z.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos3fv(v: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos3fv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos3i(x: Int, y: Int, z: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos3i(x, y, z)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos3iv(v: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos3iv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos3s(x: Short, y: Short, z: Short) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos3s(x.toInt(), y.toInt(), z.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos3sv(v: ConstPtr<Short>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos3sv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos4d(x: Double, y: Double, z: Double, w: Double) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos4d(x, y, z, w)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos4dv(v: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos4dv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos4f(x: Float, y: Float, z: Float, w: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos4f(x.toDouble(), y.toDouble(), z.toDouble(), w.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos4fv(v: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos4fv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos4i(x: Int, y: Int, z: Int, w: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos4i(x, y, z, w)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos4iv(v: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos4iv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos4s(x: Short, y: Short, z: Short, w: Short) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos4s(x.toInt(), y.toInt(), z.toInt(), w.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos4sv(v: ConstPtr<Short>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlRasterPos4sv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glReadBuffer(mode: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlReadBuffer(mode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glReadPixels(x: Int, y: Int, width: Int, height: Int, format: UInt, type: UInt, pixels: MutPtr<CVoid>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlReadPixels(x, y, width, height, format.toInt(), type.toInt(), pixels.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRectd(x1: Double, y1: Double, x2: Double, y2: Double) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlRectd(x1, y1, x2, y2)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRectdv(v1: ConstPtr<Double>, v2: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlRectdv(v1.rawAddress.toString(), v2.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRectf(x1: Float, y1: Float, x2: Float, y2: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlRectf(x1.toDouble(), y1.toDouble(), x2.toDouble(), y2.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRectfv(v1: ConstPtr<Float>, v2: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlRectfv(v1.rawAddress.toString(), v2.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRecti(x1: Int, y1: Int, x2: Int, y2: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlRecti(x1, y1, x2, y2)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRectiv(v1: ConstPtr<Int>, v2: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlRectiv(v1.rawAddress.toString(), v2.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRects(x1: Short, y1: Short, x2: Short, y2: Short) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlRects(x1.toInt(), y1.toInt(), x2.toInt(), y2.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRectsv(v1: ConstPtr<Short>, v2: ConstPtr<Short>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlRectsv(v1.rawAddress.toString(), v2.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRenderMode(mode: UInt): Int =
    if (windowsWin32GraphicsOpenglNapiAvailable) wasmWindowssysWindowsWin32GraphicsOpenglGlRenderMode(mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glRotated(angle: Double, x: Double, y: Double, z: Double) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlRotated(angle, x, y, z)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRotatef(angle: Float, x: Float, y: Float, z: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlRotatef(angle.toDouble(), x.toDouble(), y.toDouble(), z.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glScaled(x: Double, y: Double, z: Double) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlScaled(x, y, z)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glScalef(x: Float, y: Float, z: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlScalef(x.toDouble(), y.toDouble(), z.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glScissor(x: Int, y: Int, width: Int, height: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlScissor(x, y, width, height)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glSelectBuffer(size: Int, buffer: MutPtr<UInt>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlSelectBuffer(size, buffer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glShadeModel(mode: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlShadeModel(mode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glStencilFunc(func: UInt, ref: Int, mask: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlStencilFunc(func.toInt(), ref, mask.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glStencilMask(mask: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlStencilMask(mask.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glStencilOp(fail: UInt, zfail: UInt, zpass: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlStencilOp(fail.toInt(), zfail.toInt(), zpass.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord1d(s: Double) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord1d(s)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord1dv(v: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord1dv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord1f(s: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord1f(s.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord1fv(v: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord1fv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord1i(s: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord1i(s)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord1iv(v: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord1iv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord1s(s: Short) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord1s(s.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord1sv(v: ConstPtr<Short>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord1sv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord2d(s: Double, t: Double) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord2d(s, t)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord2dv(v: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord2dv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord2f(s: Float, t: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord2f(s.toDouble(), t.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord2fv(v: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord2fv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord2i(s: Int, t: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord2i(s, t)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord2iv(v: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord2iv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord2s(s: Short, t: Short) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord2s(s.toInt(), t.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord2sv(v: ConstPtr<Short>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord2sv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord3d(s: Double, t: Double, r: Double) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord3d(s, t, r)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord3dv(v: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord3dv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord3f(s: Float, t: Float, r: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord3f(s.toDouble(), t.toDouble(), r.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord3fv(v: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord3fv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord3i(s: Int, t: Int, r: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord3i(s, t, r)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord3iv(v: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord3iv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord3s(s: Short, t: Short, r: Short) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord3s(s.toInt(), t.toInt(), r.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord3sv(v: ConstPtr<Short>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord3sv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord4d(s: Double, t: Double, r: Double, q: Double) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord4d(s, t, r, q)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord4dv(v: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord4dv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord4f(s: Float, t: Float, r: Float, q: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord4f(s.toDouble(), t.toDouble(), r.toDouble(), q.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord4fv(v: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord4fv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord4i(s: Int, t: Int, r: Int, q: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord4i(s, t, r, q)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord4iv(v: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord4iv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord4s(s: Short, t: Short, r: Short, q: Short) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord4s(s.toInt(), t.toInt(), r.toInt(), q.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord4sv(v: ConstPtr<Short>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoord4sv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoordPointer(size: Int, type: UInt, stride: Int, pointer: ConstPtr<CVoid>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexCoordPointer(size, type.toInt(), stride, pointer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexEnvf(target: UInt, pname: UInt, param2: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexEnvf(target.toInt(), pname.toInt(), param2.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexEnvfv(target: UInt, pname: UInt, params: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexEnvfv(target.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexEnvi(target: UInt, pname: UInt, param2: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexEnvi(target.toInt(), pname.toInt(), param2)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexEnviv(target: UInt, pname: UInt, params: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexEnviv(target.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexGend(coord: UInt, pname: UInt, param2: Double) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexGend(coord.toInt(), pname.toInt(), param2)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexGendv(coord: UInt, pname: UInt, params: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexGendv(coord.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexGenf(coord: UInt, pname: UInt, param2: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexGenf(coord.toInt(), pname.toInt(), param2.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexGenfv(coord: UInt, pname: UInt, params: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexGenfv(coord.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexGeni(coord: UInt, pname: UInt, param2: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexGeni(coord.toInt(), pname.toInt(), param2)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexGeniv(coord: UInt, pname: UInt, params: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexGeniv(coord.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexImage1D(target: UInt, level: Int, internalformat: Int, width: Int, border: Int, format: UInt, type: UInt, pixels: ConstPtr<CVoid>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexImage1D(target.toInt(), level, internalformat, width, border, format.toInt(), type.toInt(), pixels.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexImage2D(target: UInt, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: UInt, type: UInt, pixels: ConstPtr<CVoid>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexImage2D(target.toInt(), level, internalformat, width, height, border, format.toInt(), type.toInt(), pixels.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexParameterf(target: UInt, pname: UInt, param2: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexParameterf(target.toInt(), pname.toInt(), param2.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexParameterfv(target: UInt, pname: UInt, params: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexParameterfv(target.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexParameteri(target: UInt, pname: UInt, param2: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexParameteri(target.toInt(), pname.toInt(), param2)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexParameteriv(target: UInt, pname: UInt, params: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexParameteriv(target.toInt(), pname.toInt(), params.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexSubImage1D(target: UInt, level: Int, xoffset: Int, width: Int, format: UInt, type: UInt, pixels: ConstPtr<CVoid>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexSubImage1D(target.toInt(), level, xoffset, width, format.toInt(), type.toInt(), pixels.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexSubImage2D(target: UInt, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: UInt, type: UInt, pixels: ConstPtr<CVoid>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTexSubImage2D(target.toInt(), level, xoffset, yoffset, width, height, format.toInt(), type.toInt(), pixels.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTranslated(x: Double, y: Double, z: Double) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTranslated(x, y, z)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTranslatef(x: Float, y: Float, z: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlTranslatef(x.toDouble(), y.toDouble(), z.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex2d(x: Double, y: Double) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlVertex2d(x, y)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex2dv(v: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlVertex2dv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex2f(x: Float, y: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlVertex2f(x.toDouble(), y.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex2fv(v: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlVertex2fv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex2i(x: Int, y: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlVertex2i(x, y)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex2iv(v: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlVertex2iv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex2s(x: Short, y: Short) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlVertex2s(x.toInt(), y.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex2sv(v: ConstPtr<Short>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlVertex2sv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex3d(x: Double, y: Double, z: Double) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlVertex3d(x, y, z)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex3dv(v: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlVertex3dv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex3f(x: Float, y: Float, z: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlVertex3f(x.toDouble(), y.toDouble(), z.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex3fv(v: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlVertex3fv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex3i(x: Int, y: Int, z: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlVertex3i(x, y, z)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex3iv(v: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlVertex3iv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex3s(x: Short, y: Short, z: Short) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlVertex3s(x.toInt(), y.toInt(), z.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex3sv(v: ConstPtr<Short>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlVertex3sv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex4d(x: Double, y: Double, z: Double, w: Double) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlVertex4d(x, y, z, w)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex4dv(v: ConstPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlVertex4dv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex4f(x: Float, y: Float, z: Float, w: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlVertex4f(x.toDouble(), y.toDouble(), z.toDouble(), w.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex4fv(v: ConstPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlVertex4fv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex4i(x: Int, y: Int, z: Int, w: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlVertex4i(x, y, z, w)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex4iv(v: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlVertex4iv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex4s(x: Short, y: Short, z: Short, w: Short) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlVertex4s(x.toInt(), y.toInt(), z.toInt(), w.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex4sv(v: ConstPtr<Short>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlVertex4sv(v.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertexPointer(size: Int, type: UInt, stride: Int, pointer: ConstPtr<CVoid>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlVertexPointer(size, type.toInt(), stride, pointer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glViewport(x: Int, y: Int, width: Int, height: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGlViewport(x, y, width, height)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluBeginCurve(nobj: MutPtr<GLUnurbs>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluBeginCurve(nobj.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluBeginPolygon(tess: MutPtr<GLUtesselator>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluBeginPolygon(tess.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluBeginSurface(nobj: MutPtr<GLUnurbs>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluBeginSurface(nobj.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluBeginTrim(nobj: MutPtr<GLUnurbs>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluBeginTrim(nobj.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluBuild1DMipmaps(target: UInt, components: Int, width: Int, format: UInt, type: UInt, data: ConstPtr<CVoid>): Int =
    if (windowsWin32GraphicsOpenglNapiAvailable) wasmWindowssysWindowsWin32GraphicsOpenglGluBuild1DMipmaps(target.toInt(), components, width, format.toInt(), type.toInt(), data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gluBuild2DMipmaps(target: UInt, components: Int, width: Int, height: Int, format: UInt, type: UInt, data: ConstPtr<CVoid>): Int =
    if (windowsWin32GraphicsOpenglNapiAvailable) wasmWindowssysWindowsWin32GraphicsOpenglGluBuild2DMipmaps(target.toInt(), components, width, height, format.toInt(), type.toInt(), data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gluCylinder(qobj: MutPtr<GLUquadric>, baseradius: Double, topradius: Double, height: Double, slices: Int, stacks: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluCylinder(qobj.rawAddress.toString(), baseradius, topradius, height, slices, stacks)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluDeleteNurbsRenderer(nobj: MutPtr<GLUnurbs>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluDeleteNurbsRenderer(nobj.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluDeleteQuadric(state: MutPtr<GLUquadric>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluDeleteQuadric(state.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluDeleteTess(tess: MutPtr<GLUtesselator>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluDeleteTess(tess.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluDisk(qobj: MutPtr<GLUquadric>, innerradius: Double, outerradius: Double, slices: Int, loops: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluDisk(qobj.rawAddress.toString(), innerradius, outerradius, slices, loops)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluEndCurve(nobj: MutPtr<GLUnurbs>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluEndCurve(nobj.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluEndPolygon(tess: MutPtr<GLUtesselator>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluEndPolygon(tess.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluEndSurface(nobj: MutPtr<GLUnurbs>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluEndSurface(nobj.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluEndTrim(nobj: MutPtr<GLUnurbs>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluEndTrim(nobj.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluErrorString(errcode: UInt): MutPtr<UByte> =
    if (windowsWin32GraphicsOpenglNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsOpenglGluErrorString(errcode.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gluErrorUnicodeStringEXT(errcode: UInt): Pcwstr =
    if (windowsWin32GraphicsOpenglNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32GraphicsOpenglGluErrorUnicodeStringEXT(errcode.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gluGetNurbsProperty(nobj: MutPtr<GLUnurbs>, property: UInt, value: MutPtr<Float>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluGetNurbsProperty(nobj.rawAddress.toString(), property.toInt(), value.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluGetString(name: UInt): MutPtr<UByte> =
    if (windowsWin32GraphicsOpenglNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsOpenglGluGetString(name.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gluGetTessProperty(tess: MutPtr<GLUtesselator>, which: UInt, value: MutPtr<Double>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluGetTessProperty(tess.rawAddress.toString(), which.toInt(), value.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluLoadSamplingMatrices(nobj: MutPtr<GLUnurbs>, modelmatrix: ConstPtr<Float>, projmatrix: ConstPtr<Float>, viewport: ConstPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluLoadSamplingMatrices(nobj.rawAddress.toString(), modelmatrix.rawAddress.toString(), projmatrix.rawAddress.toString(), viewport.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluLookAt(eyex: Double, eyey: Double, eyez: Double, centerx: Double, centery: Double, centerz: Double, upx: Double, upy: Double, upz: Double) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluLookAt(eyex, eyey, eyez, centerx, centery, centerz, upx, upy, upz)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluNewNurbsRenderer(): MutPtr<GLUnurbs> =
    if (windowsWin32GraphicsOpenglNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsOpenglGluNewNurbsRenderer().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gluNewQuadric(): MutPtr<GLUquadric> =
    if (windowsWin32GraphicsOpenglNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsOpenglGluNewQuadric().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gluNewTess(): MutPtr<GLUtesselator> =
    if (windowsWin32GraphicsOpenglNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsOpenglGluNewTess().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gluNextContour(tess: MutPtr<GLUtesselator>, type: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluNextContour(tess.rawAddress.toString(), type.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluNurbsCallback(nobj: MutPtr<GLUnurbs>, which: UInt, fn: Long) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluNurbsCallback(nobj.rawAddress.toString(), which.toInt(), fn.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluNurbsCurve(nobj: MutPtr<GLUnurbs>, nknots: Int, knot: MutPtr<Float>, stride: Int, ctlarray: MutPtr<Float>, order: Int, type: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluNurbsCurve(nobj.rawAddress.toString(), nknots, knot.rawAddress.toString(), stride, ctlarray.rawAddress.toString(), order, type.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluNurbsProperty(nobj: MutPtr<GLUnurbs>, property: UInt, value: Float) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluNurbsProperty(nobj.rawAddress.toString(), property.toInt(), value.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluNurbsSurface(nobj: MutPtr<GLUnurbs>, sknotCount: Int, sknot: MutPtr<Float>, tknotCount: Int, tknot: MutPtr<Float>, sStride: Int, tStride: Int, ctlarray: MutPtr<Float>, sorder: Int, torder: Int, type: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluNurbsSurface(nobj.rawAddress.toString(), sknotCount, sknot.rawAddress.toString(), tknotCount, tknot.rawAddress.toString(), sStride, tStride, ctlarray.rawAddress.toString(), sorder, torder, type.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluOrtho2D(left: Double, right: Double, bottom: Double, top: Double) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluOrtho2D(left, right, bottom, top)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluPartialDisk(qobj: MutPtr<GLUquadric>, innerradius: Double, outerradius: Double, slices: Int, loops: Int, startangle: Double, sweepangle: Double) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluPartialDisk(qobj.rawAddress.toString(), innerradius, outerradius, slices, loops, startangle, sweepangle)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluPerspective(fovy: Double, aspect: Double, znear: Double, zfar: Double) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluPerspective(fovy, aspect, znear, zfar)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluPickMatrix(x: Double, y: Double, width: Double, height: Double, viewport: MutPtr<Int>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluPickMatrix(x, y, width, height, viewport.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluProject(objx: Double, objy: Double, objz: Double, modelmatrix: ConstPtr<Double>, projmatrix: ConstPtr<Double>, viewport: ConstPtr<Int>, winx: MutPtr<Double>, winy: MutPtr<Double>, winz: MutPtr<Double>): Int =
    if (windowsWin32GraphicsOpenglNapiAvailable) wasmWindowssysWindowsWin32GraphicsOpenglGluProject(objx, objy, objz, modelmatrix.rawAddress.toString(), projmatrix.rawAddress.toString(), viewport.rawAddress.toString(), winx.rawAddress.toString(), winy.rawAddress.toString(), winz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gluPwlCurve(nobj: MutPtr<GLUnurbs>, count: Int, array: MutPtr<Float>, stride: Int, type: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluPwlCurve(nobj.rawAddress.toString(), count, array.rawAddress.toString(), stride, type.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluQuadricCallback(qobj: MutPtr<GLUquadric>, which: UInt, fn: Long) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluQuadricCallback(qobj.rawAddress.toString(), which.toInt(), fn.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluQuadricDrawStyle(quadobject: MutPtr<GLUquadric>, drawstyle: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluQuadricDrawStyle(quadobject.rawAddress.toString(), drawstyle.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluQuadricNormals(quadobject: MutPtr<GLUquadric>, normals: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluQuadricNormals(quadobject.rawAddress.toString(), normals.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluQuadricOrientation(quadobject: MutPtr<GLUquadric>, orientation: UInt) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluQuadricOrientation(quadobject.rawAddress.toString(), orientation.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluQuadricTexture(quadobject: MutPtr<GLUquadric>, texturecoords: UByte) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluQuadricTexture(quadobject.rawAddress.toString(), texturecoords.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluScaleImage(format: UInt, widthin: Int, heightin: Int, typein: UInt, datain: ConstPtr<CVoid>, widthout: Int, heightout: Int, typeout: UInt, dataout: MutPtr<CVoid>): Int =
    if (windowsWin32GraphicsOpenglNapiAvailable) wasmWindowssysWindowsWin32GraphicsOpenglGluScaleImage(format.toInt(), widthin, heightin, typein.toInt(), datain.rawAddress.toString(), widthout, heightout, typeout.toInt(), dataout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gluSphere(qobj: MutPtr<GLUquadric>, radius: Double, slices: Int, stacks: Int) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluSphere(qobj.rawAddress.toString(), radius, slices, stacks)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluTessBeginContour(tess: MutPtr<GLUtesselator>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluTessBeginContour(tess.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluTessBeginPolygon(tess: MutPtr<GLUtesselator>, polygonData: MutPtr<CVoid>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluTessBeginPolygon(tess.rawAddress.toString(), polygonData.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluTessCallback(tess: MutPtr<GLUtesselator>, which: UInt, fn: Long) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluTessCallback(tess.rawAddress.toString(), which.toInt(), fn.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluTessEndContour(tess: MutPtr<GLUtesselator>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluTessEndContour(tess.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluTessEndPolygon(tess: MutPtr<GLUtesselator>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluTessEndPolygon(tess.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluTessNormal(tess: MutPtr<GLUtesselator>, x: Double, y: Double, z: Double) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluTessNormal(tess.rawAddress.toString(), x, y, z)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluTessProperty(tess: MutPtr<GLUtesselator>, which: UInt, value: Double) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluTessProperty(tess.rawAddress.toString(), which.toInt(), value)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluTessVertex(tess: MutPtr<GLUtesselator>, coords: MutPtr<Double>, data: MutPtr<CVoid>) {
    if (windowsWin32GraphicsOpenglNapiAvailable) {
        wasmWindowssysWindowsWin32GraphicsOpenglGluTessVertex(tess.rawAddress.toString(), coords.rawAddress.toString(), data.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluUnProject(winx: Double, winy: Double, winz: Double, modelmatrix: ConstPtr<Double>, projmatrix: ConstPtr<Double>, viewport: ConstPtr<Int>, objx: MutPtr<Double>, objy: MutPtr<Double>, objz: MutPtr<Double>): Int =
    if (windowsWin32GraphicsOpenglNapiAvailable) wasmWindowssysWindowsWin32GraphicsOpenglGluUnProject(winx, winy, winz, modelmatrix.rawAddress.toString(), projmatrix.rawAddress.toString(), viewport.rawAddress.toString(), objx.rawAddress.toString(), objy.rawAddress.toString(), objz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglCopyContext(param0: Hglrc, param1: Hglrc, param2: UInt): Bool =
    if (windowsWin32GraphicsOpenglNapiAvailable) wasmWindowssysWindowsWin32GraphicsOpenglWglCopyContext(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglCreateContext(param0: Hdc): Hglrc =
    if (windowsWin32GraphicsOpenglNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsOpenglWglCreateContext(param0.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglCreateLayerContext(param0: Hdc, param1: Int): Hglrc =
    if (windowsWin32GraphicsOpenglNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsOpenglWglCreateLayerContext(param0.rawAddress.toString(), param1).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglDeleteContext(param0: Hglrc): Bool =
    if (windowsWin32GraphicsOpenglNapiAvailable) wasmWindowssysWindowsWin32GraphicsOpenglWglDeleteContext(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglDescribeLayerPlane(param0: Hdc, param1: Int, param2: Int, param3: UInt, param4: MutPtr<Layerplanedescriptor>): Bool =
    if (windowsWin32GraphicsOpenglNapiAvailable) wasmWindowssysWindowsWin32GraphicsOpenglWglDescribeLayerPlane(param0.rawAddress.toString(), param1, param2, param3.toInt(), param4.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglGetCurrentContext(): Hglrc =
    if (windowsWin32GraphicsOpenglNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsOpenglWglGetCurrentContext().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglGetCurrentDC(): Hdc =
    if (windowsWin32GraphicsOpenglNapiAvailable) MutPtr(wasmWindowssysWindowsWin32GraphicsOpenglWglGetCurrentDC().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglGetLayerPaletteEntries(param0: Hdc, param1: Int, param2: Int, param3: Int, param4: MutPtr<Colorref>): Int =
    if (windowsWin32GraphicsOpenglNapiAvailable) wasmWindowssysWindowsWin32GraphicsOpenglWglGetLayerPaletteEntries(param0.rawAddress.toString(), param1, param2, param3, param4.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglGetProcAddress(param0: Pcstr): Proc =
    if (windowsWin32GraphicsOpenglNapiAvailable) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglMakeCurrent(param0: Hdc, param1: Hglrc): Bool =
    if (windowsWin32GraphicsOpenglNapiAvailable) wasmWindowssysWindowsWin32GraphicsOpenglWglMakeCurrent(param0.rawAddress.toString(), param1.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglRealizeLayerPalette(param0: Hdc, param1: Int, param2: Bool): Bool =
    if (windowsWin32GraphicsOpenglNapiAvailable) wasmWindowssysWindowsWin32GraphicsOpenglWglRealizeLayerPalette(param0.rawAddress.toString(), param1, param2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglSetLayerPaletteEntries(param0: Hdc, param1: Int, param2: Int, param3: Int, param4: ConstPtr<Colorref>): Int =
    if (windowsWin32GraphicsOpenglNapiAvailable) wasmWindowssysWindowsWin32GraphicsOpenglWglSetLayerPaletteEntries(param0.rawAddress.toString(), param1, param2, param3, param4.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglShareLists(param0: Hglrc, param1: Hglrc): Bool =
    if (windowsWin32GraphicsOpenglNapiAvailable) wasmWindowssysWindowsWin32GraphicsOpenglWglShareLists(param0.rawAddress.toString(), param1.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglSwapLayerBuffers(param0: Hdc, param1: UInt): Bool =
    if (windowsWin32GraphicsOpenglNapiAvailable) wasmWindowssysWindowsWin32GraphicsOpenglWglSwapLayerBuffers(param0.rawAddress.toString(), param1.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglUseFontBitmapsA(param0: Hdc, param1: UInt, param2: UInt, param3: UInt): Bool =
    if (windowsWin32GraphicsOpenglNapiAvailable) wasmWindowssysWindowsWin32GraphicsOpenglWglUseFontBitmapsA(param0.rawAddress.toString(), param1.toInt(), param2.toInt(), param3.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglUseFontBitmapsW(param0: Hdc, param1: UInt, param2: UInt, param3: UInt): Bool =
    if (windowsWin32GraphicsOpenglNapiAvailable) wasmWindowssysWindowsWin32GraphicsOpenglWglUseFontBitmapsW(param0.rawAddress.toString(), param1.toInt(), param2.toInt(), param3.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglUseFontOutlinesA(param0: Hdc, param1: UInt, param2: UInt, param3: UInt, param4: Float, param5: Float, param6: Int, param7: MutPtr<Glyphmetricsfloat>): Bool =
    if (windowsWin32GraphicsOpenglNapiAvailable) wasmWindowssysWindowsWin32GraphicsOpenglWglUseFontOutlinesA(param0.rawAddress.toString(), param1.toInt(), param2.toInt(), param3.toInt(), param4.toDouble(), param5.toDouble(), param6, param7.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglUseFontOutlinesW(param0: Hdc, param1: UInt, param2: UInt, param3: UInt, param4: Float, param5: Float, param6: Int, param7: MutPtr<Glyphmetricsfloat>): Bool =
    if (windowsWin32GraphicsOpenglNapiAvailable) wasmWindowssysWindowsWin32GraphicsOpenglWglUseFontOutlinesW(param0.rawAddress.toString(), param1.toInt(), param2.toInt(), param3.toInt(), param4.toDouble(), param5.toDouble(), param6, param7.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
