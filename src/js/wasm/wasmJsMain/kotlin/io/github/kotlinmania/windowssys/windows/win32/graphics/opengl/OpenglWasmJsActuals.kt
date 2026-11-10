@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.opengl

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Proc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Henhmetafile

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32GraphicsOpenglNapiAddon(): Boolean

private val _windowsWin32GraphicsOpenglNapiAvailable: Boolean = _initWindowsWin32GraphicsOpenglNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_choosePixelFormat(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_choosePixelFormat(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_describePixelFormat(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_describePixelFormat(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_getEnhMetaFilePixelFormat(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_getEnhMetaFilePixelFormat(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_getPixelFormat(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_getPixelFormat(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_setPixelFormat(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_setPixelFormat(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_swapBuffers(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_swapBuffers(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glAccum(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glAccum(p0: Int, p1: Double)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glAlphaFunc(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glAlphaFunc(p0: Int, p1: Double)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glAreTexturesResident(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glAreTexturesResident(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glArrayElement(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glArrayElement(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glBegin(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glBegin(p0: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glBindTexture(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glBindTexture(p0: Int, p1: Int)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glBitmap(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glBitmap(p0: Int, p1: Int, p2: Double, p3: Double, p4: Double, p5: Double, p6: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glBlendFunc(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glBlendFunc(p0: Int, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glCallList(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glCallList(p0: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glCallLists(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glCallLists(p0: Int, p1: Int, p2: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glClear(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glClear(p0: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glClearAccum(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glClearAccum(p0: Double, p1: Double, p2: Double, p3: Double)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glClearColor(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glClearColor(p0: Double, p1: Double, p2: Double, p3: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glClearDepth(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glClearDepth(p0: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glClearIndex(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glClearIndex(p0: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glClearStencil(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glClearStencil(p0: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glClipPlane(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glClipPlane(p0: Int, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glColor3b(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glColor3b(p0: Int, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glColor3bv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glColor3bv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glColor3d(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glColor3d(p0: Double, p1: Double, p2: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glColor3dv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glColor3dv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glColor3f(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glColor3f(p0: Double, p1: Double, p2: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glColor3fv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glColor3fv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glColor3i(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glColor3i(p0: Int, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glColor3iv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glColor3iv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glColor3s(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glColor3s(p0: Int, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glColor3sv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glColor3sv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glColor3ub(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glColor3ub(p0: Int, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glColor3ubv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glColor3ubv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glColor3ui(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glColor3ui(p0: Int, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glColor3uiv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glColor3uiv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glColor3us(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glColor3us(p0: Int, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glColor3usv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glColor3usv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glColor4b(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glColor4b(p0: Int, p1: Int, p2: Int, p3: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glColor4bv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glColor4bv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glColor4d(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glColor4d(p0: Double, p1: Double, p2: Double, p3: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glColor4dv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glColor4dv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glColor4f(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glColor4f(p0: Double, p1: Double, p2: Double, p3: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glColor4fv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glColor4fv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glColor4i(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glColor4i(p0: Int, p1: Int, p2: Int, p3: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glColor4iv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glColor4iv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glColor4s(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glColor4s(p0: Int, p1: Int, p2: Int, p3: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glColor4sv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glColor4sv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glColor4ub(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glColor4ub(p0: Int, p1: Int, p2: Int, p3: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glColor4ubv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glColor4ubv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glColor4ui(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glColor4ui(p0: Int, p1: Int, p2: Int, p3: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glColor4uiv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glColor4uiv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glColor4us(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glColor4us(p0: Int, p1: Int, p2: Int, p3: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glColor4usv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glColor4usv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glColorMask(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glColorMask(p0: Int, p1: Int, p2: Int, p3: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glColorMaterial(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glColorMaterial(p0: Int, p1: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glColorPointer(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glColorPointer(p0: Int, p1: Int, p2: Int, p3: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glCopyPixels(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glCopyPixels(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glCopyTexImage1D(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glCopyTexImage1D(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glCopyTexImage2D(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glCopyTexImage2D(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glCopyTexSubImage1D(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glCopyTexSubImage1D(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glCopyTexSubImage2D(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glCopyTexSubImage2D(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glCullFace(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glCullFace(p0: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glDeleteLists(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glDeleteLists(p0: Int, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glDeleteTextures(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glDeleteTextures(p0: Int, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glDepthFunc(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glDepthFunc(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glDepthMask(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glDepthMask(p0: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glDepthRange(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glDepthRange(p0: Double, p1: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glDisable(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glDisable(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glDisableClientState(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glDisableClientState(p0: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glDrawArrays(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glDrawArrays(p0: Int, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glDrawBuffer(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glDrawBuffer(p0: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glDrawElements(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glDrawElements(p0: Int, p1: Int, p2: Int, p3: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glDrawPixels(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glDrawPixels(p0: Int, p1: Int, p2: Int, p3: Int, p4: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glEdgeFlag(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glEdgeFlag(p0: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glEdgeFlagPointer(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glEdgeFlagPointer(p0: Int, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glEdgeFlagv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glEdgeFlagv(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glEnable(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glEnable(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glEnableClientState(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glEnableClientState(p0: Int)

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glEnd()")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glEnd()

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glEndList()")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glEndList()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glEvalCoord1d(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glEvalCoord1d(p0: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glEvalCoord1dv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glEvalCoord1dv(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glEvalCoord1f(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glEvalCoord1f(p0: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glEvalCoord1fv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glEvalCoord1fv(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glEvalCoord2d(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glEvalCoord2d(p0: Double, p1: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glEvalCoord2dv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glEvalCoord2dv(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glEvalCoord2f(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glEvalCoord2f(p0: Double, p1: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glEvalCoord2fv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glEvalCoord2fv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glEvalMesh1(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glEvalMesh1(p0: Int, p1: Int, p2: Int)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glEvalMesh2(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glEvalMesh2(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glEvalPoint1(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glEvalPoint1(p0: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glEvalPoint2(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glEvalPoint2(p0: Int, p1: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glFeedbackBuffer(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glFeedbackBuffer(p0: Int, p1: Int, p2: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glFinish()")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glFinish()

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glFlush()")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glFlush()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glFogf(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glFogf(p0: Int, p1: Double)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glFogfv(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glFogfv(p0: Int, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glFogi(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glFogi(p0: Int, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glFogiv(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glFogiv(p0: Int, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glFrontFace(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glFrontFace(p0: Int)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glFrustum(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glFrustum(p0: Double, p1: Double, p2: Double, p3: Double, p4: Double, p5: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glGenLists(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glGenLists(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glGenTextures(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glGenTextures(p0: Int, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glGetBooleanv(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glGetBooleanv(p0: Int, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glGetClipPlane(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glGetClipPlane(p0: Int, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glGetDoublev(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glGetDoublev(p0: Int, p1: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glGetError()")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glGetError(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glGetFloatv(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glGetFloatv(p0: Int, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glGetIntegerv(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glGetIntegerv(p0: Int, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glGetLightfv(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glGetLightfv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glGetLightiv(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glGetLightiv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glGetMapdv(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glGetMapdv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glGetMapfv(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glGetMapfv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glGetMapiv(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glGetMapiv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glGetMaterialfv(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glGetMaterialfv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glGetMaterialiv(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glGetMaterialiv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glGetPixelMapfv(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glGetPixelMapfv(p0: Int, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glGetPixelMapuiv(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glGetPixelMapuiv(p0: Int, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glGetPixelMapusv(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glGetPixelMapusv(p0: Int, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glGetPointerv(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glGetPointerv(p0: Int, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glGetPolygonStipple(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glGetPolygonStipple(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glGetString(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glGetString(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glGetTexEnvfv(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glGetTexEnvfv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glGetTexEnviv(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glGetTexEnviv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glGetTexGendv(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glGetTexGendv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glGetTexGenfv(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glGetTexGenfv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glGetTexGeniv(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glGetTexGeniv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glGetTexImage(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glGetTexImage(p0: Int, p1: Int, p2: Int, p3: Int, p4: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glGetTexLevelParameterfv(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glGetTexLevelParameterfv(p0: Int, p1: Int, p2: Int, p3: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glGetTexLevelParameteriv(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glGetTexLevelParameteriv(p0: Int, p1: Int, p2: Int, p3: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glGetTexParameterfv(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glGetTexParameterfv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glGetTexParameteriv(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glGetTexParameteriv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glHint(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glHint(p0: Int, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glIndexMask(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glIndexMask(p0: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glIndexPointer(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glIndexPointer(p0: Int, p1: Int, p2: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glIndexd(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glIndexd(p0: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glIndexdv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glIndexdv(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glIndexf(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glIndexf(p0: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glIndexfv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glIndexfv(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glIndexi(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glIndexi(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glIndexiv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glIndexiv(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glIndexs(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glIndexs(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glIndexsv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glIndexsv(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glIndexub(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glIndexub(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glIndexubv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glIndexubv(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glInitNames()")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glInitNames()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glInterleavedArrays(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glInterleavedArrays(p0: Int, p1: Int, p2: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glIsEnabled(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glIsEnabled(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glIsList(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glIsList(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glIsTexture(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glIsTexture(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glLightModelf(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glLightModelf(p0: Int, p1: Double)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glLightModelfv(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glLightModelfv(p0: Int, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glLightModeli(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glLightModeli(p0: Int, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glLightModeliv(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glLightModeliv(p0: Int, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glLightf(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glLightf(p0: Int, p1: Int, p2: Double)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glLightfv(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glLightfv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glLighti(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glLighti(p0: Int, p1: Int, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glLightiv(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glLightiv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glLineStipple(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glLineStipple(p0: Int, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glLineWidth(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glLineWidth(p0: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glListBase(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glListBase(p0: Int)

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glLoadIdentity()")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glLoadIdentity()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glLoadMatrixd(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glLoadMatrixd(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glLoadMatrixf(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glLoadMatrixf(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glLoadName(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glLoadName(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glLogicOp(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glLogicOp(p0: Int)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glMap1d(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glMap1d(p0: Int, p1: Double, p2: Double, p3: Int, p4: Int, p5: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glMap1f(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glMap1f(p0: Int, p1: Double, p2: Double, p3: Int, p4: Int, p5: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glMap2d(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glMap2d(p0: Int, p1: Double, p2: Double, p3: Int, p4: Int, p5: Double, p6: Double, p7: Int, p8: Int, p9: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glMap2f(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glMap2f(p0: Int, p1: Double, p2: Double, p3: Int, p4: Int, p5: Double, p6: Double, p7: Int, p8: Int, p9: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glMapGrid1d(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glMapGrid1d(p0: Int, p1: Double, p2: Double)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glMapGrid1f(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glMapGrid1f(p0: Int, p1: Double, p2: Double)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glMapGrid2d(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glMapGrid2d(p0: Int, p1: Double, p2: Double, p3: Int, p4: Double, p5: Double)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glMapGrid2f(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glMapGrid2f(p0: Int, p1: Double, p2: Double, p3: Int, p4: Double, p5: Double)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glMaterialf(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glMaterialf(p0: Int, p1: Int, p2: Double)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glMaterialfv(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glMaterialfv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glMateriali(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glMateriali(p0: Int, p1: Int, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glMaterialiv(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glMaterialiv(p0: Int, p1: Int, p2: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glMatrixMode(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glMatrixMode(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glMultMatrixd(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glMultMatrixd(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glMultMatrixf(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glMultMatrixf(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glNewList(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glNewList(p0: Int, p1: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glNormal3b(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glNormal3b(p0: Int, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glNormal3bv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glNormal3bv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glNormal3d(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glNormal3d(p0: Double, p1: Double, p2: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glNormal3dv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glNormal3dv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glNormal3f(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glNormal3f(p0: Double, p1: Double, p2: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glNormal3fv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glNormal3fv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glNormal3i(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glNormal3i(p0: Int, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glNormal3iv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glNormal3iv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glNormal3s(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glNormal3s(p0: Int, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glNormal3sv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glNormal3sv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glNormalPointer(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glNormalPointer(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glOrtho(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glOrtho(p0: Double, p1: Double, p2: Double, p3: Double, p4: Double, p5: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glPassThrough(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glPassThrough(p0: Double)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glPixelMapfv(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glPixelMapfv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glPixelMapuiv(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glPixelMapuiv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glPixelMapusv(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glPixelMapusv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glPixelStoref(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glPixelStoref(p0: Int, p1: Double)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glPixelStorei(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glPixelStorei(p0: Int, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glPixelTransferf(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glPixelTransferf(p0: Int, p1: Double)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glPixelTransferi(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glPixelTransferi(p0: Int, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glPixelZoom(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glPixelZoom(p0: Double, p1: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glPointSize(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glPointSize(p0: Double)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glPolygonMode(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glPolygonMode(p0: Int, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glPolygonOffset(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glPolygonOffset(p0: Double, p1: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glPolygonStipple(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glPolygonStipple(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glPopAttrib()")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glPopAttrib()

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glPopClientAttrib()")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glPopClientAttrib()

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glPopMatrix()")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glPopMatrix()

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glPopName()")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glPopName()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glPrioritizeTextures(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glPrioritizeTextures(p0: Int, p1: String, p2: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glPushAttrib(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glPushAttrib(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glPushClientAttrib(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glPushClientAttrib(p0: Int)

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glPushMatrix()")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glPushMatrix()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glPushName(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glPushName(p0: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glRasterPos2d(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos2d(p0: Double, p1: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glRasterPos2dv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos2dv(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glRasterPos2f(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos2f(p0: Double, p1: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glRasterPos2fv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos2fv(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glRasterPos2i(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos2i(p0: Int, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glRasterPos2iv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos2iv(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glRasterPos2s(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos2s(p0: Int, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glRasterPos2sv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos2sv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glRasterPos3d(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos3d(p0: Double, p1: Double, p2: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glRasterPos3dv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos3dv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glRasterPos3f(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos3f(p0: Double, p1: Double, p2: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glRasterPos3fv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos3fv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glRasterPos3i(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos3i(p0: Int, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glRasterPos3iv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos3iv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glRasterPos3s(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos3s(p0: Int, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glRasterPos3sv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos3sv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glRasterPos4d(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos4d(p0: Double, p1: Double, p2: Double, p3: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glRasterPos4dv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos4dv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glRasterPos4f(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos4f(p0: Double, p1: Double, p2: Double, p3: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glRasterPos4fv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos4fv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glRasterPos4i(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos4i(p0: Int, p1: Int, p2: Int, p3: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glRasterPos4iv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos4iv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glRasterPos4s(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos4s(p0: Int, p1: Int, p2: Int, p3: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glRasterPos4sv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos4sv(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glReadBuffer(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glReadBuffer(p0: Int)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glReadPixels(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glReadPixels(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glRectd(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glRectd(p0: Double, p1: Double, p2: Double, p3: Double)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glRectdv(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glRectdv(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glRectf(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glRectf(p0: Double, p1: Double, p2: Double, p3: Double)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glRectfv(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glRectfv(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glRecti(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glRecti(p0: Int, p1: Int, p2: Int, p3: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glRectiv(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glRectiv(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glRects(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glRects(p0: Int, p1: Int, p2: Int, p3: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glRectsv(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glRectsv(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glRenderMode(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glRenderMode(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glRotated(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glRotated(p0: Double, p1: Double, p2: Double, p3: Double)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glRotatef(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glRotatef(p0: Double, p1: Double, p2: Double, p3: Double)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glScaled(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glScaled(p0: Double, p1: Double, p2: Double)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glScalef(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glScalef(p0: Double, p1: Double, p2: Double)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glScissor(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glScissor(p0: Int, p1: Int, p2: Int, p3: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glSelectBuffer(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glSelectBuffer(p0: Int, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glShadeModel(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glShadeModel(p0: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glStencilFunc(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glStencilFunc(p0: Int, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glStencilMask(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glStencilMask(p0: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glStencilOp(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glStencilOp(p0: Int, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexCoord1d(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord1d(p0: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexCoord1dv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord1dv(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexCoord1f(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord1f(p0: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexCoord1fv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord1fv(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexCoord1i(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord1i(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexCoord1iv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord1iv(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexCoord1s(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord1s(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexCoord1sv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord1sv(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexCoord2d(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord2d(p0: Double, p1: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexCoord2dv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord2dv(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexCoord2f(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord2f(p0: Double, p1: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexCoord2fv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord2fv(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexCoord2i(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord2i(p0: Int, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexCoord2iv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord2iv(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexCoord2s(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord2s(p0: Int, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexCoord2sv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord2sv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexCoord3d(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord3d(p0: Double, p1: Double, p2: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexCoord3dv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord3dv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexCoord3f(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord3f(p0: Double, p1: Double, p2: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexCoord3fv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord3fv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexCoord3i(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord3i(p0: Int, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexCoord3iv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord3iv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexCoord3s(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord3s(p0: Int, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexCoord3sv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord3sv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexCoord4d(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord4d(p0: Double, p1: Double, p2: Double, p3: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexCoord4dv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord4dv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexCoord4f(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord4f(p0: Double, p1: Double, p2: Double, p3: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexCoord4fv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord4fv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexCoord4i(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord4i(p0: Int, p1: Int, p2: Int, p3: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexCoord4iv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord4iv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexCoord4s(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord4s(p0: Int, p1: Int, p2: Int, p3: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexCoord4sv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord4sv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexCoordPointer(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexCoordPointer(p0: Int, p1: Int, p2: Int, p3: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexEnvf(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexEnvf(p0: Int, p1: Int, p2: Double)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexEnvfv(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexEnvfv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexEnvi(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexEnvi(p0: Int, p1: Int, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexEnviv(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexEnviv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexGend(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexGend(p0: Int, p1: Int, p2: Double)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexGendv(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexGendv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexGenf(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexGenf(p0: Int, p1: Int, p2: Double)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexGenfv(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexGenfv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexGeni(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexGeni(p0: Int, p1: Int, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexGeniv(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexGeniv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexImage1D(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexImage1D(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexImage2D(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexImage2D(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexParameterf(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexParameterf(p0: Int, p1: Int, p2: Double)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexParameterfv(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexParameterfv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexParameteri(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexParameteri(p0: Int, p1: Int, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexParameteriv(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexParameteriv(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexSubImage1D(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexSubImage1D(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTexSubImage2D(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTexSubImage2D(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTranslated(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTranslated(p0: Double, p1: Double, p2: Double)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glTranslatef(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glTranslatef(p0: Double, p1: Double, p2: Double)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glVertex2d(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glVertex2d(p0: Double, p1: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glVertex2dv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glVertex2dv(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glVertex2f(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glVertex2f(p0: Double, p1: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glVertex2fv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glVertex2fv(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glVertex2i(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glVertex2i(p0: Int, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glVertex2iv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glVertex2iv(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glVertex2s(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glVertex2s(p0: Int, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glVertex2sv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glVertex2sv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glVertex3d(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glVertex3d(p0: Double, p1: Double, p2: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glVertex3dv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glVertex3dv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glVertex3f(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glVertex3f(p0: Double, p1: Double, p2: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glVertex3fv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glVertex3fv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glVertex3i(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glVertex3i(p0: Int, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glVertex3iv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glVertex3iv(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glVertex3s(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glVertex3s(p0: Int, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glVertex3sv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glVertex3sv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glVertex4d(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glVertex4d(p0: Double, p1: Double, p2: Double, p3: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glVertex4dv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glVertex4dv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glVertex4f(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glVertex4f(p0: Double, p1: Double, p2: Double, p3: Double)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glVertex4fv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glVertex4fv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glVertex4i(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glVertex4i(p0: Int, p1: Int, p2: Int, p3: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glVertex4iv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glVertex4iv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glVertex4s(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glVertex4s(p0: Int, p1: Int, p2: Int, p3: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glVertex4sv(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glVertex4sv(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glVertexPointer(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glVertexPointer(p0: Int, p1: Int, p2: Int, p3: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_glViewport(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_glViewport(p0: Int, p1: Int, p2: Int, p3: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluBeginCurve(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluBeginCurve(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluBeginPolygon(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluBeginPolygon(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluBeginSurface(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluBeginSurface(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluBeginTrim(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluBeginTrim(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluBuild1DMipmaps(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluBuild1DMipmaps(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluBuild2DMipmaps(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluBuild2DMipmaps(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluCylinder(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluCylinder(p0: String, p1: Double, p2: Double, p3: Double, p4: Int, p5: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluDeleteNurbsRenderer(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluDeleteNurbsRenderer(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluDeleteQuadric(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluDeleteQuadric(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluDeleteTess(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluDeleteTess(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluDisk(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluDisk(p0: String, p1: Double, p2: Double, p3: Int, p4: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluEndCurve(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluEndCurve(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluEndPolygon(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluEndPolygon(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluEndSurface(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluEndSurface(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluEndTrim(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluEndTrim(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluErrorString(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluErrorString(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluErrorUnicodeStringEXT(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluErrorUnicodeStringEXT(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluGetNurbsProperty(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluGetNurbsProperty(p0: String, p1: Int, p2: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluGetString(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluGetString(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluGetTessProperty(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluGetTessProperty(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluLoadSamplingMatrices(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluLoadSamplingMatrices(p0: String, p1: String, p2: String, p3: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluLookAt(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluLookAt(p0: Double, p1: Double, p2: Double, p3: Double, p4: Double, p5: Double, p6: Double, p7: Double, p8: Double)

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluNewNurbsRenderer()")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluNewNurbsRenderer(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluNewQuadric()")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluNewQuadric(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluNewTess()")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluNewTess(): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluNextContour(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluNextContour(p0: String, p1: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluNurbsCallback(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluNurbsCallback(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluNurbsCurve(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluNurbsCurve(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluNurbsProperty(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluNurbsProperty(p0: String, p1: Int, p2: Double)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluNurbsSurface(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluNurbsSurface(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int, p7: String, p8: Int, p9: Int, p10: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluOrtho2D(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluOrtho2D(p0: Double, p1: Double, p2: Double, p3: Double)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluPartialDisk(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluPartialDisk(p0: String, p1: Double, p2: Double, p3: Int, p4: Int, p5: Double, p6: Double)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluPerspective(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluPerspective(p0: Double, p1: Double, p2: Double, p3: Double)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluPickMatrix(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluPickMatrix(p0: Double, p1: Double, p2: Double, p3: Double, p4: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluProject(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluProject(p0: Double, p1: Double, p2: Double, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluPwlCurve(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluPwlCurve(p0: String, p1: Int, p2: String, p3: Int, p4: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluQuadricCallback(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluQuadricCallback(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluQuadricDrawStyle(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluQuadricDrawStyle(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluQuadricNormals(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluQuadricNormals(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluQuadricOrientation(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluQuadricOrientation(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluQuadricTexture(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluQuadricTexture(p0: String, p1: Int)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluScaleImage(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluScaleImage(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: Int, p7: Int, p8: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluSphere(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluSphere(p0: String, p1: Double, p2: Int, p3: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluTessBeginContour(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluTessBeginContour(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluTessBeginPolygon(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluTessBeginPolygon(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluTessCallback(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluTessCallback(p0: String, p1: Int, p2: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluTessEndContour(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluTessEndContour(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluTessEndPolygon(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluTessEndPolygon(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluTessNormal(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluTessNormal(p0: String, p1: Double, p2: Double, p3: Double)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluTessProperty(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluTessProperty(p0: String, p1: Int, p2: Double)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluTessVertex(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluTessVertex(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_gluUnProject(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_gluUnProject(p0: Double, p1: Double, p2: Double, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_wglCopyContext(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_wglCopyContext(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_wglCreateContext(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_wglCreateContext(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_wglCreateLayerContext(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_wglCreateLayerContext(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_wglDeleteContext(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_wglDeleteContext(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_wglDescribeLayerPlane(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_wglDescribeLayerPlane(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_wglGetCurrentContext()")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_wglGetCurrentContext(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_wglGetCurrentDC()")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_wglGetCurrentDC(): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_wglGetLayerPaletteEntries(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_wglGetLayerPaletteEntries(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_wglGetProcAddress(p0)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_wglGetProcAddress(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_wglMakeCurrent(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_wglMakeCurrent(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_wglRealizeLayerPalette(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_wglRealizeLayerPalette(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_wglSetLayerPaletteEntries(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_wglSetLayerPaletteEntries(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_wglShareLists(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_wglShareLists(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_wglSwapLayerBuffers(p0, p1)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_wglSwapLayerBuffers(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_wglUseFontBitmapsA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_wglUseFontBitmapsA(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_wglUseFontBitmapsW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_wglUseFontBitmapsW(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_wglUseFontOutlinesA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_wglUseFontOutlinesA(p0: String, p1: Int, p2: Int, p3: Int, p4: Double, p5: Double, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_graphics_opengl_wglUseFontOutlinesW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_graphics_opengl_wglUseFontOutlinesW(p0: String, p1: Int, p2: Int, p3: Int, p4: Double, p5: Double, p6: Int, p7: String): Int

public actual fun choosePixelFormat(hdc: Hdc, ppfd: COpaquePointer?): Int =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_choosePixelFormat((hdc?.value ?: 0L).toString(), (ppfd?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun describePixelFormat(hdc: Hdc, ipixelformat: Int, nbytes: UInt, ppfd: COpaquePointer?): Int =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_describePixelFormat((hdc?.value ?: 0L).toString(), ipixelformat, nbytes.toInt(), (ppfd?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnhMetaFilePixelFormat(hemf: Henhmetafile, cbbuffer: UInt, ppfd: COpaquePointer?): UInt =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_getEnhMetaFilePixelFormat((hemf?.value ?: 0L).toString(), cbbuffer.toInt(), (ppfd?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPixelFormat(hdc: Hdc): Int =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_getPixelFormat((hdc?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPixelFormat(hdc: Hdc, format: Int, ppfd: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_setPixelFormat((hdc?.value ?: 0L).toString(), format, (ppfd?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swapBuffers(param0: Hdc): Bool =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_swapBuffers((param0?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glAccum(op: UInt, value: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glAccum(op.toInt(), value.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glAlphaFunc(func: UInt, ref: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glAlphaFunc(func.toInt(), ref.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glAreTexturesResident(n: Int, textures: COpaquePointer?, residences: COpaquePointer?): UByte =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_glAreTexturesResident(n, (textures?.value ?: 0L).toString(), (residences?.value ?: 0L).toString()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glArrayElement(i: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glArrayElement(i)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glBegin(mode: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glBegin(mode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glBindTexture(target: UInt, texture: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glBindTexture(target.toInt(), texture.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glBitmap(width: Int, height: Int, xorig: Float, yorig: Float, xmove: Float, ymove: Float, bitmap: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glBitmap(width, height, xorig.toDouble(), yorig.toDouble(), xmove.toDouble(), ymove.toDouble(), (bitmap?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glBlendFunc(sfactor: UInt, dfactor: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glBlendFunc(sfactor.toInt(), dfactor.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glCallList(list: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glCallList(list.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glCallLists(n: Int, type: UInt, lists: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glCallLists(n, type.toInt(), (lists?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glClear(mask: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glClear(mask.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glClearAccum(red: Float, green: Float, blue: Float, alpha: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glClearAccum(red.toDouble(), green.toDouble(), blue.toDouble(), alpha.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glClearColor(red: Float, green: Float, blue: Float, alpha: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glClearColor(red.toDouble(), green.toDouble(), blue.toDouble(), alpha.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glClearDepth(depth: Double) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glClearDepth(depth)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glClearIndex(c: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glClearIndex(c.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glClearStencil(s: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glClearStencil(s)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glClipPlane(plane: UInt, equation: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glClipPlane(plane.toInt(), (equation?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3b(red: Byte, green: Byte, blue: Byte) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glColor3b(red.toInt(), green.toInt(), blue.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3bv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glColor3bv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3d(red: Double, green: Double, blue: Double) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glColor3d(red, green, blue)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3dv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glColor3dv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3f(red: Float, green: Float, blue: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glColor3f(red.toDouble(), green.toDouble(), blue.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3fv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glColor3fv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3i(red: Int, green: Int, blue: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glColor3i(red, green, blue)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3iv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glColor3iv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3s(red: Short, green: Short, blue: Short) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glColor3s(red.toInt(), green.toInt(), blue.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3sv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glColor3sv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3ub(red: UByte, green: UByte, blue: UByte) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glColor3ub(red.toInt(), green.toInt(), blue.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3ubv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glColor3ubv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3ui(red: UInt, green: UInt, blue: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glColor3ui(red.toInt(), green.toInt(), blue.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3uiv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glColor3uiv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3us(red: UShort, green: UShort, blue: UShort) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glColor3us(red.toInt(), green.toInt(), blue.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor3usv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glColor3usv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4b(red: Byte, green: Byte, blue: Byte, alpha: Byte) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glColor4b(red.toInt(), green.toInt(), blue.toInt(), alpha.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4bv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glColor4bv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4d(red: Double, green: Double, blue: Double, alpha: Double) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glColor4d(red, green, blue, alpha)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4dv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glColor4dv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4f(red: Float, green: Float, blue: Float, alpha: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glColor4f(red.toDouble(), green.toDouble(), blue.toDouble(), alpha.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4fv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glColor4fv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4i(red: Int, green: Int, blue: Int, alpha: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glColor4i(red, green, blue, alpha)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4iv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glColor4iv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4s(red: Short, green: Short, blue: Short, alpha: Short) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glColor4s(red.toInt(), green.toInt(), blue.toInt(), alpha.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4sv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glColor4sv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4ub(red: UByte, green: UByte, blue: UByte, alpha: UByte) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glColor4ub(red.toInt(), green.toInt(), blue.toInt(), alpha.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4ubv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glColor4ubv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4ui(red: UInt, green: UInt, blue: UInt, alpha: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glColor4ui(red.toInt(), green.toInt(), blue.toInt(), alpha.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4uiv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glColor4uiv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4us(red: UShort, green: UShort, blue: UShort, alpha: UShort) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glColor4us(red.toInt(), green.toInt(), blue.toInt(), alpha.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColor4usv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glColor4usv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColorMask(red: UByte, green: UByte, blue: UByte, alpha: UByte) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glColorMask(red.toInt(), green.toInt(), blue.toInt(), alpha.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColorMaterial(face: UInt, mode: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glColorMaterial(face.toInt(), mode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glColorPointer(size: Int, type: UInt, stride: Int, pointer: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glColorPointer(size, type.toInt(), stride, (pointer?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glCopyPixels(x: Int, y: Int, width: Int, height: Int, type: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glCopyPixels(x, y, width, height, type.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glCopyTexImage1D(target: UInt, level: Int, internalformat: UInt, x: Int, y: Int, width: Int, border: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glCopyTexImage1D(target.toInt(), level, internalformat.toInt(), x, y, width, border)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glCopyTexImage2D(target: UInt, level: Int, internalformat: UInt, x: Int, y: Int, width: Int, height: Int, border: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glCopyTexImage2D(target.toInt(), level, internalformat.toInt(), x, y, width, height, border)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glCopyTexSubImage1D(target: UInt, level: Int, xoffset: Int, x: Int, y: Int, width: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glCopyTexSubImage1D(target.toInt(), level, xoffset, x, y, width)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glCopyTexSubImage2D(target: UInt, level: Int, xoffset: Int, yoffset: Int, x: Int, y: Int, width: Int, height: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glCopyTexSubImage2D(target.toInt(), level, xoffset, yoffset, x, y, width, height)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glCullFace(mode: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glCullFace(mode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glDeleteLists(list: UInt, range: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glDeleteLists(list.toInt(), range)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glDeleteTextures(n: Int, textures: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glDeleteTextures(n, (textures?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glDepthFunc(func: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glDepthFunc(func.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glDepthMask(flag: UByte) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glDepthMask(flag.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glDepthRange(znear: Double, zfar: Double) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glDepthRange(znear, zfar)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glDisable(cap: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glDisable(cap.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glDisableClientState(array: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glDisableClientState(array.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glDrawArrays(mode: UInt, first: Int, count: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glDrawArrays(mode.toInt(), first, count)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glDrawBuffer(mode: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glDrawBuffer(mode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glDrawElements(mode: UInt, count: Int, type: UInt, indices: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glDrawElements(mode.toInt(), count, type.toInt(), (indices?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glDrawPixels(width: Int, height: Int, format: UInt, type: UInt, pixels: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glDrawPixels(width, height, format.toInt(), type.toInt(), (pixels?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEdgeFlag(flag: UByte) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glEdgeFlag(flag.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEdgeFlagPointer(stride: Int, pointer: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glEdgeFlagPointer(stride, (pointer?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEdgeFlagv(flag: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glEdgeFlagv((flag?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEnable(cap: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glEnable(cap.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEnableClientState(array: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glEnableClientState(array.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEnd() {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glEnd()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEndList() {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glEndList()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEvalCoord1d(u: Double) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glEvalCoord1d(u)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEvalCoord1dv(u: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glEvalCoord1dv((u?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEvalCoord1f(u: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glEvalCoord1f(u.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEvalCoord1fv(u: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glEvalCoord1fv((u?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEvalCoord2d(u: Double, v: Double) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glEvalCoord2d(u, v)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEvalCoord2dv(u: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glEvalCoord2dv((u?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEvalCoord2f(u: Float, v: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glEvalCoord2f(u.toDouble(), v.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEvalCoord2fv(u: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glEvalCoord2fv((u?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEvalMesh1(mode: UInt, i1: Int, i2: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glEvalMesh1(mode.toInt(), i1, i2)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEvalMesh2(mode: UInt, i1: Int, i2: Int, j1: Int, j2: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glEvalMesh2(mode.toInt(), i1, i2, j1, j2)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEvalPoint1(i: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glEvalPoint1(i)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glEvalPoint2(i: Int, j: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glEvalPoint2(i, j)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glFeedbackBuffer(size: Int, type: UInt, buffer: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glFeedbackBuffer(size, type.toInt(), (buffer?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glFinish() {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glFinish()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glFlush() {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glFlush()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glFogf(pname: UInt, param1: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glFogf(pname.toInt(), param1.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glFogfv(pname: UInt, params: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glFogfv(pname.toInt(), (params?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glFogi(pname: UInt, param1: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glFogi(pname.toInt(), param1)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glFogiv(pname: UInt, params: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glFogiv(pname.toInt(), (params?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glFrontFace(mode: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glFrontFace(mode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glFrustum(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glFrustum(left, right, bottom, top, znear, zfar)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGenLists(range: Int): UInt =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_glGenLists(range).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glGenTextures(n: Int, textures: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glGenTextures(n, (textures?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetBooleanv(pname: UInt, params: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glGetBooleanv(pname.toInt(), (params?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetClipPlane(plane: UInt, equation: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glGetClipPlane(plane.toInt(), (equation?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetDoublev(pname: UInt, params: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glGetDoublev(pname.toInt(), (params?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetError(): UInt =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_glGetError().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glGetFloatv(pname: UInt, params: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glGetFloatv(pname.toInt(), (params?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetIntegerv(pname: UInt, params: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glGetIntegerv(pname.toInt(), (params?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetLightfv(light: UInt, pname: UInt, params: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glGetLightfv(light.toInt(), pname.toInt(), (params?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetLightiv(light: UInt, pname: UInt, params: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glGetLightiv(light.toInt(), pname.toInt(), (params?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetMapdv(target: UInt, query: UInt, v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glGetMapdv(target.toInt(), query.toInt(), (v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetMapfv(target: UInt, query: UInt, v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glGetMapfv(target.toInt(), query.toInt(), (v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetMapiv(target: UInt, query: UInt, v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glGetMapiv(target.toInt(), query.toInt(), (v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetMaterialfv(face: UInt, pname: UInt, params: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glGetMaterialfv(face.toInt(), pname.toInt(), (params?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetMaterialiv(face: UInt, pname: UInt, params: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glGetMaterialiv(face.toInt(), pname.toInt(), (params?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetPixelMapfv(map: UInt, values: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glGetPixelMapfv(map.toInt(), (values?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetPixelMapuiv(map: UInt, values: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glGetPixelMapuiv(map.toInt(), (values?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetPixelMapusv(map: UInt, values: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glGetPixelMapusv(map.toInt(), (values?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetPointerv(pname: UInt, params: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glGetPointerv(pname.toInt(), (params?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetPolygonStipple(mask: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glGetPolygonStipple((mask?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetString(name: UInt): COpaquePointer? =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_glGetString(name.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glGetTexEnvfv(target: UInt, pname: UInt, params: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glGetTexEnvfv(target.toInt(), pname.toInt(), (params?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetTexEnviv(target: UInt, pname: UInt, params: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glGetTexEnviv(target.toInt(), pname.toInt(), (params?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetTexGendv(coord: UInt, pname: UInt, params: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glGetTexGendv(coord.toInt(), pname.toInt(), (params?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetTexGenfv(coord: UInt, pname: UInt, params: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glGetTexGenfv(coord.toInt(), pname.toInt(), (params?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetTexGeniv(coord: UInt, pname: UInt, params: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glGetTexGeniv(coord.toInt(), pname.toInt(), (params?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetTexImage(target: UInt, level: Int, format: UInt, type: UInt, pixels: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glGetTexImage(target.toInt(), level, format.toInt(), type.toInt(), (pixels?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetTexLevelParameterfv(target: UInt, level: Int, pname: UInt, params: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glGetTexLevelParameterfv(target.toInt(), level, pname.toInt(), (params?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetTexLevelParameteriv(target: UInt, level: Int, pname: UInt, params: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glGetTexLevelParameteriv(target.toInt(), level, pname.toInt(), (params?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetTexParameterfv(target: UInt, pname: UInt, params: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glGetTexParameterfv(target.toInt(), pname.toInt(), (params?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glGetTexParameteriv(target: UInt, pname: UInt, params: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glGetTexParameteriv(target.toInt(), pname.toInt(), (params?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glHint(target: UInt, mode: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glHint(target.toInt(), mode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIndexMask(mask: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glIndexMask(mask.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIndexPointer(type: UInt, stride: Int, pointer: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glIndexPointer(type.toInt(), stride, (pointer?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIndexd(c: Double) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glIndexd(c)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIndexdv(c: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glIndexdv((c?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIndexf(c: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glIndexf(c.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIndexfv(c: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glIndexfv((c?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIndexi(c: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glIndexi(c)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIndexiv(c: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glIndexiv((c?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIndexs(c: Short) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glIndexs(c.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIndexsv(c: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glIndexsv((c?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIndexub(c: UByte) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glIndexub(c.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIndexubv(c: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glIndexubv((c?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glInitNames() {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glInitNames()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glInterleavedArrays(format: UInt, stride: Int, pointer: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glInterleavedArrays(format.toInt(), stride, (pointer?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glIsEnabled(cap: UInt): UByte =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_glIsEnabled(cap.toInt()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glIsList(list: UInt): UByte =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_glIsList(list.toInt()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glIsTexture(texture: UInt): UByte =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_glIsTexture(texture.toInt()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glLightModelf(pname: UInt, param1: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glLightModelf(pname.toInt(), param1.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLightModelfv(pname: UInt, params: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glLightModelfv(pname.toInt(), (params?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLightModeli(pname: UInt, param1: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glLightModeli(pname.toInt(), param1)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLightModeliv(pname: UInt, params: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glLightModeliv(pname.toInt(), (params?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLightf(light: UInt, pname: UInt, param2: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glLightf(light.toInt(), pname.toInt(), param2.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLightfv(light: UInt, pname: UInt, params: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glLightfv(light.toInt(), pname.toInt(), (params?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLighti(light: UInt, pname: UInt, param2: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glLighti(light.toInt(), pname.toInt(), param2)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLightiv(light: UInt, pname: UInt, params: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glLightiv(light.toInt(), pname.toInt(), (params?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLineStipple(factor: Int, pattern: UShort) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glLineStipple(factor, pattern.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLineWidth(width: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glLineWidth(width.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glListBase(base: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glListBase(base.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLoadIdentity() {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glLoadIdentity()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLoadMatrixd(m: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glLoadMatrixd((m?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLoadMatrixf(m: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glLoadMatrixf((m?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLoadName(name: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glLoadName(name.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glLogicOp(opcode: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glLogicOp(opcode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMap1d(target: UInt, u1: Double, u2: Double, stride: Int, order: Int, points: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glMap1d(target.toInt(), u1, u2, stride, order, (points?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMap1f(target: UInt, u1: Float, u2: Float, stride: Int, order: Int, points: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glMap1f(target.toInt(), u1.toDouble(), u2.toDouble(), stride, order, (points?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMap2d(target: UInt, u1: Double, u2: Double, ustride: Int, uorder: Int, v1: Double, v2: Double, vstride: Int, vorder: Int, points: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glMap2d(target.toInt(), u1, u2, ustride, uorder, v1, v2, vstride, vorder, (points?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMap2f(target: UInt, u1: Float, u2: Float, ustride: Int, uorder: Int, v1: Float, v2: Float, vstride: Int, vorder: Int, points: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glMap2f(target.toInt(), u1.toDouble(), u2.toDouble(), ustride, uorder, v1.toDouble(), v2.toDouble(), vstride, vorder, (points?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMapGrid1d(un: Int, u1: Double, u2: Double) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glMapGrid1d(un, u1, u2)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMapGrid1f(un: Int, u1: Float, u2: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glMapGrid1f(un, u1.toDouble(), u2.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMapGrid2d(un: Int, u1: Double, u2: Double, vn: Int, v1: Double, v2: Double) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glMapGrid2d(un, u1, u2, vn, v1, v2)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMapGrid2f(un: Int, u1: Float, u2: Float, vn: Int, v1: Float, v2: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glMapGrid2f(un, u1.toDouble(), u2.toDouble(), vn, v1.toDouble(), v2.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMaterialf(face: UInt, pname: UInt, param2: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glMaterialf(face.toInt(), pname.toInt(), param2.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMaterialfv(face: UInt, pname: UInt, params: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glMaterialfv(face.toInt(), pname.toInt(), (params?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMateriali(face: UInt, pname: UInt, param2: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glMateriali(face.toInt(), pname.toInt(), param2)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMaterialiv(face: UInt, pname: UInt, params: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glMaterialiv(face.toInt(), pname.toInt(), (params?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMatrixMode(mode: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glMatrixMode(mode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMultMatrixd(m: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glMultMatrixd((m?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glMultMatrixf(m: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glMultMatrixf((m?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glNewList(list: UInt, mode: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glNewList(list.toInt(), mode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glNormal3b(nx: Byte, ny: Byte, nz: Byte) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glNormal3b(nx.toInt(), ny.toInt(), nz.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glNormal3bv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glNormal3bv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glNormal3d(nx: Double, ny: Double, nz: Double) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glNormal3d(nx, ny, nz)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glNormal3dv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glNormal3dv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glNormal3f(nx: Float, ny: Float, nz: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glNormal3f(nx.toDouble(), ny.toDouble(), nz.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glNormal3fv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glNormal3fv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glNormal3i(nx: Int, ny: Int, nz: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glNormal3i(nx, ny, nz)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glNormal3iv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glNormal3iv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glNormal3s(nx: Short, ny: Short, nz: Short) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glNormal3s(nx.toInt(), ny.toInt(), nz.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glNormal3sv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glNormal3sv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glNormalPointer(type: UInt, stride: Int, pointer: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glNormalPointer(type.toInt(), stride, (pointer?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glOrtho(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glOrtho(left, right, bottom, top, znear, zfar)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPassThrough(token: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glPassThrough(token.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPixelMapfv(map: UInt, mapsize: Int, values: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glPixelMapfv(map.toInt(), mapsize, (values?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPixelMapuiv(map: UInt, mapsize: Int, values: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glPixelMapuiv(map.toInt(), mapsize, (values?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPixelMapusv(map: UInt, mapsize: Int, values: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glPixelMapusv(map.toInt(), mapsize, (values?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPixelStoref(pname: UInt, param1: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glPixelStoref(pname.toInt(), param1.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPixelStorei(pname: UInt, param1: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glPixelStorei(pname.toInt(), param1)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPixelTransferf(pname: UInt, param1: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glPixelTransferf(pname.toInt(), param1.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPixelTransferi(pname: UInt, param1: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glPixelTransferi(pname.toInt(), param1)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPixelZoom(xfactor: Float, yfactor: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glPixelZoom(xfactor.toDouble(), yfactor.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPointSize(size: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glPointSize(size.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPolygonMode(face: UInt, mode: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glPolygonMode(face.toInt(), mode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPolygonOffset(factor: Float, units: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glPolygonOffset(factor.toDouble(), units.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPolygonStipple(mask: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glPolygonStipple((mask?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPopAttrib() {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glPopAttrib()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPopClientAttrib() {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glPopClientAttrib()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPopMatrix() {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glPopMatrix()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPopName() {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glPopName()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPrioritizeTextures(n: Int, textures: COpaquePointer?, priorities: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glPrioritizeTextures(n, (textures?.value ?: 0L).toString(), (priorities?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPushAttrib(mask: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glPushAttrib(mask.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPushClientAttrib(mask: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glPushClientAttrib(mask.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPushMatrix() {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glPushMatrix()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glPushName(name: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glPushName(name.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos2d(x: Double, y: Double) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos2d(x, y)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos2dv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos2dv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos2f(x: Float, y: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos2f(x.toDouble(), y.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos2fv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos2fv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos2i(x: Int, y: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos2i(x, y)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos2iv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos2iv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos2s(x: Short, y: Short) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos2s(x.toInt(), y.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos2sv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos2sv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos3d(x: Double, y: Double, z: Double) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos3d(x, y, z)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos3dv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos3dv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos3f(x: Float, y: Float, z: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos3f(x.toDouble(), y.toDouble(), z.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos3fv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos3fv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos3i(x: Int, y: Int, z: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos3i(x, y, z)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos3iv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos3iv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos3s(x: Short, y: Short, z: Short) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos3s(x.toInt(), y.toInt(), z.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos3sv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos3sv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos4d(x: Double, y: Double, z: Double, w: Double) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos4d(x, y, z, w)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos4dv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos4dv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos4f(x: Float, y: Float, z: Float, w: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos4f(x.toDouble(), y.toDouble(), z.toDouble(), w.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos4fv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos4fv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos4i(x: Int, y: Int, z: Int, w: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos4i(x, y, z, w)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos4iv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos4iv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos4s(x: Short, y: Short, z: Short, w: Short) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos4s(x.toInt(), y.toInt(), z.toInt(), w.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRasterPos4sv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glRasterPos4sv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glReadBuffer(mode: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glReadBuffer(mode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glReadPixels(x: Int, y: Int, width: Int, height: Int, format: UInt, type: UInt, pixels: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glReadPixels(x, y, width, height, format.toInt(), type.toInt(), (pixels?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRectd(x1: Double, y1: Double, x2: Double, y2: Double) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glRectd(x1, y1, x2, y2)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRectdv(v1: COpaquePointer?, v2: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glRectdv((v1?.value ?: 0L).toString(), (v2?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRectf(x1: Float, y1: Float, x2: Float, y2: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glRectf(x1.toDouble(), y1.toDouble(), x2.toDouble(), y2.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRectfv(v1: COpaquePointer?, v2: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glRectfv((v1?.value ?: 0L).toString(), (v2?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRecti(x1: Int, y1: Int, x2: Int, y2: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glRecti(x1, y1, x2, y2)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRectiv(v1: COpaquePointer?, v2: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glRectiv((v1?.value ?: 0L).toString(), (v2?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRects(x1: Short, y1: Short, x2: Short, y2: Short) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glRects(x1.toInt(), y1.toInt(), x2.toInt(), y2.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRectsv(v1: COpaquePointer?, v2: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glRectsv((v1?.value ?: 0L).toString(), (v2?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRenderMode(mode: UInt): Int =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_glRenderMode(mode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun glRotated(angle: Double, x: Double, y: Double, z: Double) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glRotated(angle, x, y, z)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glRotatef(angle: Float, x: Float, y: Float, z: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glRotatef(angle.toDouble(), x.toDouble(), y.toDouble(), z.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glScaled(x: Double, y: Double, z: Double) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glScaled(x, y, z)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glScalef(x: Float, y: Float, z: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glScalef(x.toDouble(), y.toDouble(), z.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glScissor(x: Int, y: Int, width: Int, height: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glScissor(x, y, width, height)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glSelectBuffer(size: Int, buffer: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glSelectBuffer(size, (buffer?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glShadeModel(mode: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glShadeModel(mode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glStencilFunc(func: UInt, ref: Int, mask: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glStencilFunc(func.toInt(), ref, mask.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glStencilMask(mask: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glStencilMask(mask.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glStencilOp(fail: UInt, zfail: UInt, zpass: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glStencilOp(fail.toInt(), zfail.toInt(), zpass.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord1d(s: Double) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord1d(s)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord1dv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord1dv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord1f(s: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord1f(s.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord1fv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord1fv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord1i(s: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord1i(s)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord1iv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord1iv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord1s(s: Short) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord1s(s.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord1sv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord1sv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord2d(s: Double, t: Double) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord2d(s, t)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord2dv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord2dv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord2f(s: Float, t: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord2f(s.toDouble(), t.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord2fv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord2fv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord2i(s: Int, t: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord2i(s, t)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord2iv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord2iv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord2s(s: Short, t: Short) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord2s(s.toInt(), t.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord2sv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord2sv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord3d(s: Double, t: Double, r: Double) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord3d(s, t, r)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord3dv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord3dv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord3f(s: Float, t: Float, r: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord3f(s.toDouble(), t.toDouble(), r.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord3fv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord3fv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord3i(s: Int, t: Int, r: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord3i(s, t, r)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord3iv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord3iv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord3s(s: Short, t: Short, r: Short) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord3s(s.toInt(), t.toInt(), r.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord3sv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord3sv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord4d(s: Double, t: Double, r: Double, q: Double) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord4d(s, t, r, q)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord4dv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord4dv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord4f(s: Float, t: Float, r: Float, q: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord4f(s.toDouble(), t.toDouble(), r.toDouble(), q.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord4fv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord4fv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord4i(s: Int, t: Int, r: Int, q: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord4i(s, t, r, q)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord4iv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord4iv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord4s(s: Short, t: Short, r: Short, q: Short) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord4s(s.toInt(), t.toInt(), r.toInt(), q.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoord4sv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexCoord4sv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexCoordPointer(size: Int, type: UInt, stride: Int, pointer: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexCoordPointer(size, type.toInt(), stride, (pointer?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexEnvf(target: UInt, pname: UInt, param2: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexEnvf(target.toInt(), pname.toInt(), param2.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexEnvfv(target: UInt, pname: UInt, params: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexEnvfv(target.toInt(), pname.toInt(), (params?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexEnvi(target: UInt, pname: UInt, param2: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexEnvi(target.toInt(), pname.toInt(), param2)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexEnviv(target: UInt, pname: UInt, params: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexEnviv(target.toInt(), pname.toInt(), (params?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexGend(coord: UInt, pname: UInt, param2: Double) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexGend(coord.toInt(), pname.toInt(), param2)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexGendv(coord: UInt, pname: UInt, params: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexGendv(coord.toInt(), pname.toInt(), (params?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexGenf(coord: UInt, pname: UInt, param2: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexGenf(coord.toInt(), pname.toInt(), param2.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexGenfv(coord: UInt, pname: UInt, params: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexGenfv(coord.toInt(), pname.toInt(), (params?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexGeni(coord: UInt, pname: UInt, param2: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexGeni(coord.toInt(), pname.toInt(), param2)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexGeniv(coord: UInt, pname: UInt, params: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexGeniv(coord.toInt(), pname.toInt(), (params?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexImage1D(target: UInt, level: Int, internalformat: Int, width: Int, border: Int, format: UInt, type: UInt, pixels: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexImage1D(target.toInt(), level, internalformat, width, border, format.toInt(), type.toInt(), (pixels?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexImage2D(target: UInt, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: UInt, type: UInt, pixels: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexImage2D(target.toInt(), level, internalformat, width, height, border, format.toInt(), type.toInt(), (pixels?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexParameterf(target: UInt, pname: UInt, param2: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexParameterf(target.toInt(), pname.toInt(), param2.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexParameterfv(target: UInt, pname: UInt, params: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexParameterfv(target.toInt(), pname.toInt(), (params?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexParameteri(target: UInt, pname: UInt, param2: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexParameteri(target.toInt(), pname.toInt(), param2)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexParameteriv(target: UInt, pname: UInt, params: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexParameteriv(target.toInt(), pname.toInt(), (params?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexSubImage1D(target: UInt, level: Int, xoffset: Int, width: Int, format: UInt, type: UInt, pixels: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexSubImage1D(target.toInt(), level, xoffset, width, format.toInt(), type.toInt(), (pixels?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTexSubImage2D(target: UInt, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: UInt, type: UInt, pixels: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTexSubImage2D(target.toInt(), level, xoffset, yoffset, width, height, format.toInt(), type.toInt(), (pixels?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTranslated(x: Double, y: Double, z: Double) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTranslated(x, y, z)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glTranslatef(x: Float, y: Float, z: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glTranslatef(x.toDouble(), y.toDouble(), z.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex2d(x: Double, y: Double) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glVertex2d(x, y)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex2dv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glVertex2dv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex2f(x: Float, y: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glVertex2f(x.toDouble(), y.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex2fv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glVertex2fv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex2i(x: Int, y: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glVertex2i(x, y)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex2iv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glVertex2iv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex2s(x: Short, y: Short) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glVertex2s(x.toInt(), y.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex2sv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glVertex2sv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex3d(x: Double, y: Double, z: Double) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glVertex3d(x, y, z)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex3dv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glVertex3dv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex3f(x: Float, y: Float, z: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glVertex3f(x.toDouble(), y.toDouble(), z.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex3fv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glVertex3fv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex3i(x: Int, y: Int, z: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glVertex3i(x, y, z)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex3iv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glVertex3iv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex3s(x: Short, y: Short, z: Short) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glVertex3s(x.toInt(), y.toInt(), z.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex3sv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glVertex3sv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex4d(x: Double, y: Double, z: Double, w: Double) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glVertex4d(x, y, z, w)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex4dv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glVertex4dv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex4f(x: Float, y: Float, z: Float, w: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glVertex4f(x.toDouble(), y.toDouble(), z.toDouble(), w.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex4fv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glVertex4fv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex4i(x: Int, y: Int, z: Int, w: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glVertex4i(x, y, z, w)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex4iv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glVertex4iv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex4s(x: Short, y: Short, z: Short, w: Short) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glVertex4s(x.toInt(), y.toInt(), z.toInt(), w.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertex4sv(v: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glVertex4sv((v?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glVertexPointer(size: Int, type: UInt, stride: Int, pointer: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glVertexPointer(size, type.toInt(), stride, (pointer?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun glViewport(x: Int, y: Int, width: Int, height: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_glViewport(x, y, width, height)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluBeginCurve(nobj: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluBeginCurve((nobj?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluBeginPolygon(tess: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluBeginPolygon((tess?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluBeginSurface(nobj: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluBeginSurface((nobj?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluBeginTrim(nobj: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluBeginTrim((nobj?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluBuild1DMipmaps(target: UInt, components: Int, width: Int, format: UInt, type: UInt, data: COpaquePointer?): Int =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_gluBuild1DMipmaps(target.toInt(), components, width, format.toInt(), type.toInt(), (data?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gluBuild2DMipmaps(target: UInt, components: Int, width: Int, height: Int, format: UInt, type: UInt, data: COpaquePointer?): Int =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_gluBuild2DMipmaps(target.toInt(), components, width, height, format.toInt(), type.toInt(), (data?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gluCylinder(qobj: COpaquePointer?, baseradius: Double, topradius: Double, height: Double, slices: Int, stacks: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluCylinder((qobj?.value ?: 0L).toString(), baseradius, topradius, height, slices, stacks)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluDeleteNurbsRenderer(nobj: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluDeleteNurbsRenderer((nobj?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluDeleteQuadric(state: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluDeleteQuadric((state?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluDeleteTess(tess: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluDeleteTess((tess?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluDisk(qobj: COpaquePointer?, innerradius: Double, outerradius: Double, slices: Int, loops: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluDisk((qobj?.value ?: 0L).toString(), innerradius, outerradius, slices, loops)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluEndCurve(nobj: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluEndCurve((nobj?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluEndPolygon(tess: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluEndPolygon((tess?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluEndSurface(nobj: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluEndSurface((nobj?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluEndTrim(nobj: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluEndTrim((nobj?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluErrorString(errcode: UInt): COpaquePointer? =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_gluErrorString(errcode.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gluErrorUnicodeStringEXT(errcode: UInt): Pcwstr =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_gluErrorUnicodeStringEXT(errcode.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gluGetNurbsProperty(nobj: COpaquePointer?, property: UInt, value: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluGetNurbsProperty((nobj?.value ?: 0L).toString(), property.toInt(), (value?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluGetString(name: UInt): COpaquePointer? =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_gluGetString(name.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gluGetTessProperty(tess: COpaquePointer?, which: UInt, value: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluGetTessProperty((tess?.value ?: 0L).toString(), which.toInt(), (value?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluLoadSamplingMatrices(nobj: COpaquePointer?, modelmatrix: COpaquePointer?, projmatrix: COpaquePointer?, viewport: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluLoadSamplingMatrices((nobj?.value ?: 0L).toString(), (modelmatrix?.value ?: 0L).toString(), (projmatrix?.value ?: 0L).toString(), (viewport?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluLookAt(eyex: Double, eyey: Double, eyez: Double, centerx: Double, centery: Double, centerz: Double, upx: Double, upy: Double, upz: Double) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluLookAt(eyex, eyey, eyez, centerx, centery, centerz, upx, upy, upz)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluNewNurbsRenderer(): COpaquePointer? =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_gluNewNurbsRenderer().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gluNewQuadric(): COpaquePointer? =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_gluNewQuadric().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gluNewTess(): COpaquePointer? =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_gluNewTess().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gluNextContour(tess: COpaquePointer?, type: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluNextContour((tess?.value ?: 0L).toString(), type.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluNurbsCallback(nobj: COpaquePointer?, which: UInt, fn: Long) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluNurbsCallback((nobj?.value ?: 0L).toString(), which.toInt(), fn.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluNurbsCurve(nobj: COpaquePointer?, nknots: Int, knot: COpaquePointer?, stride: Int, ctlarray: COpaquePointer?, order: Int, type: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluNurbsCurve((nobj?.value ?: 0L).toString(), nknots, (knot?.value ?: 0L).toString(), stride, (ctlarray?.value ?: 0L).toString(), order, type.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluNurbsProperty(nobj: COpaquePointer?, property: UInt, value: Float) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluNurbsProperty((nobj?.value ?: 0L).toString(), property.toInt(), value.toDouble())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluNurbsSurface(nobj: COpaquePointer?, sknotCount: Int, sknot: COpaquePointer?, tknotCount: Int, tknot: COpaquePointer?, sStride: Int, tStride: Int, ctlarray: COpaquePointer?, sorder: Int, torder: Int, type: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluNurbsSurface((nobj?.value ?: 0L).toString(), sknotCount, (sknot?.value ?: 0L).toString(), tknotCount, (tknot?.value ?: 0L).toString(), sStride, tStride, (ctlarray?.value ?: 0L).toString(), sorder, torder, type.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluOrtho2D(left: Double, right: Double, bottom: Double, top: Double) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluOrtho2D(left, right, bottom, top)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluPartialDisk(qobj: COpaquePointer?, innerradius: Double, outerradius: Double, slices: Int, loops: Int, startangle: Double, sweepangle: Double) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluPartialDisk((qobj?.value ?: 0L).toString(), innerradius, outerradius, slices, loops, startangle, sweepangle)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluPerspective(fovy: Double, aspect: Double, znear: Double, zfar: Double) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluPerspective(fovy, aspect, znear, zfar)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluPickMatrix(x: Double, y: Double, width: Double, height: Double, viewport: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluPickMatrix(x, y, width, height, (viewport?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluProject(objx: Double, objy: Double, objz: Double, modelmatrix: COpaquePointer?, projmatrix: COpaquePointer?, viewport: COpaquePointer?, winx: COpaquePointer?, winy: COpaquePointer?, winz: COpaquePointer?): Int =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_gluProject(objx, objy, objz, (modelmatrix?.value ?: 0L).toString(), (projmatrix?.value ?: 0L).toString(), (viewport?.value ?: 0L).toString(), (winx?.value ?: 0L).toString(), (winy?.value ?: 0L).toString(), (winz?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gluPwlCurve(nobj: COpaquePointer?, count: Int, array: COpaquePointer?, stride: Int, type: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluPwlCurve((nobj?.value ?: 0L).toString(), count, (array?.value ?: 0L).toString(), stride, type.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluQuadricCallback(qobj: COpaquePointer?, which: UInt, fn: Long) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluQuadricCallback((qobj?.value ?: 0L).toString(), which.toInt(), fn.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluQuadricDrawStyle(quadobject: COpaquePointer?, drawstyle: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluQuadricDrawStyle((quadobject?.value ?: 0L).toString(), drawstyle.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluQuadricNormals(quadobject: COpaquePointer?, normals: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluQuadricNormals((quadobject?.value ?: 0L).toString(), normals.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluQuadricOrientation(quadobject: COpaquePointer?, orientation: UInt) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluQuadricOrientation((quadobject?.value ?: 0L).toString(), orientation.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluQuadricTexture(quadobject: COpaquePointer?, texturecoords: UByte) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluQuadricTexture((quadobject?.value ?: 0L).toString(), texturecoords.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluScaleImage(format: UInt, widthin: Int, heightin: Int, typein: UInt, datain: COpaquePointer?, widthout: Int, heightout: Int, typeout: UInt, dataout: COpaquePointer?): Int =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_gluScaleImage(format.toInt(), widthin, heightin, typein.toInt(), (datain?.value ?: 0L).toString(), widthout, heightout, typeout.toInt(), (dataout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gluSphere(qobj: COpaquePointer?, radius: Double, slices: Int, stacks: Int) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluSphere((qobj?.value ?: 0L).toString(), radius, slices, stacks)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluTessBeginContour(tess: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluTessBeginContour((tess?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluTessBeginPolygon(tess: COpaquePointer?, polygonData: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluTessBeginPolygon((tess?.value ?: 0L).toString(), (polygonData?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluTessCallback(tess: COpaquePointer?, which: UInt, fn: Long) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluTessCallback((tess?.value ?: 0L).toString(), which.toInt(), fn.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluTessEndContour(tess: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluTessEndContour((tess?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluTessEndPolygon(tess: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluTessEndPolygon((tess?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluTessNormal(tess: COpaquePointer?, x: Double, y: Double, z: Double) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluTessNormal((tess?.value ?: 0L).toString(), x, y, z)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluTessProperty(tess: COpaquePointer?, which: UInt, value: Double) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluTessProperty((tess?.value ?: 0L).toString(), which.toInt(), value)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluTessVertex(tess: COpaquePointer?, coords: COpaquePointer?, data: COpaquePointer?) {
    if (_windowsWin32GraphicsOpenglNapiAvailable) {
        _wasm_windowssys_windows_win32_graphics_opengl_gluTessVertex((tess?.value ?: 0L).toString(), (coords?.value ?: 0L).toString(), (data?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gluUnProject(winx: Double, winy: Double, winz: Double, modelmatrix: COpaquePointer?, projmatrix: COpaquePointer?, viewport: COpaquePointer?, objx: COpaquePointer?, objy: COpaquePointer?, objz: COpaquePointer?): Int =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_gluUnProject(winx, winy, winz, (modelmatrix?.value ?: 0L).toString(), (projmatrix?.value ?: 0L).toString(), (viewport?.value ?: 0L).toString(), (objx?.value ?: 0L).toString(), (objy?.value ?: 0L).toString(), (objz?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglCopyContext(param0: Hglrc, param1: Hglrc, param2: UInt): Bool =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_wglCopyContext((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), param2.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglCreateContext(param0: Hdc): Hglrc =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_wglCreateContext((param0?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglCreateLayerContext(param0: Hdc, param1: Int): Hglrc =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_wglCreateLayerContext((param0?.value ?: 0L).toString(), param1).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglDeleteContext(param0: Hglrc): Bool =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_wglDeleteContext((param0?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglDescribeLayerPlane(param0: Hdc, param1: Int, param2: Int, param3: UInt, param4: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_wglDescribeLayerPlane((param0?.value ?: 0L).toString(), param1, param2, param3.toInt(), (param4?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglGetCurrentContext(): Hglrc =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_wglGetCurrentContext().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglGetCurrentDC(): Hdc =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_wglGetCurrentDC().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglGetLayerPaletteEntries(param0: Hdc, param1: Int, param2: Int, param3: Int, param4: COpaquePointer?): Int =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_wglGetLayerPaletteEntries((param0?.value ?: 0L).toString(), param1, param2, param3, (param4?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglGetProcAddress(param0: Pcstr): Proc =
    if (_windowsWin32GraphicsOpenglNapiAvailable) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglMakeCurrent(param0: Hdc, param1: Hglrc): Bool =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_wglMakeCurrent((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglRealizeLayerPalette(param0: Hdc, param1: Int, param2: Bool): Bool =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_wglRealizeLayerPalette((param0?.value ?: 0L).toString(), param1, param2) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglSetLayerPaletteEntries(param0: Hdc, param1: Int, param2: Int, param3: Int, param4: COpaquePointer?): Int =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_wglSetLayerPaletteEntries((param0?.value ?: 0L).toString(), param1, param2, param3, (param4?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglShareLists(param0: Hglrc, param1: Hglrc): Bool =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_wglShareLists((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglSwapLayerBuffers(param0: Hdc, param1: UInt): Bool =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_wglSwapLayerBuffers((param0?.value ?: 0L).toString(), param1.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglUseFontBitmapsA(param0: Hdc, param1: UInt, param2: UInt, param3: UInt): Bool =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_wglUseFontBitmapsA((param0?.value ?: 0L).toString(), param1.toInt(), param2.toInt(), param3.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglUseFontBitmapsW(param0: Hdc, param1: UInt, param2: UInt, param3: UInt): Bool =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_wglUseFontBitmapsW((param0?.value ?: 0L).toString(), param1.toInt(), param2.toInt(), param3.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglUseFontOutlinesA(param0: Hdc, param1: UInt, param2: UInt, param3: UInt, param4: Float, param5: Float, param6: Int, param7: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_wglUseFontOutlinesA((param0?.value ?: 0L).toString(), param1.toInt(), param2.toInt(), param3.toInt(), param4.toDouble(), param5.toDouble(), param6, (param7?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglUseFontOutlinesW(param0: Hdc, param1: UInt, param2: UInt, param3: UInt, param4: Float, param5: Float, param6: Int, param7: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsOpenglNapiAvailable) _wasm_windowssys_windows_win32_graphics_opengl_wglUseFontOutlinesW((param0?.value ?: 0L).toString(), param1.toInt(), param2.toInt(), param3.toInt(), param4.toDouble(), param5.toDouble(), param6, (param7?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
