@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.media.multimedia

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Farproc
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hpalette
import io.github.kotlinmania.windowssys.windows.win32.media.Htask

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32MediaMultimediaNapiAddon(): Boolean

private val _windowsWin32MediaMultimediaNapiAvailable: Boolean = _initWindowsWin32MediaMultimediaNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIBuildFilterA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIBuildFilterA(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIBuildFilterW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIBuildFilterW(p0: String, p1: Int, p2: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIClearClipboard()")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIClearClipboard(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIFileAddRef(p0)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIFileAddRef(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIFileCreateStreamA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIFileCreateStreamA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIFileCreateStreamW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIFileCreateStreamW(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIFileEndRecord(p0)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIFileEndRecord(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIFileExit()")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIFileExit()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIFileGetStream(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIFileGetStream(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIFileInfoA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIFileInfoA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIFileInfoW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIFileInfoW(p0: String, p1: String, p2: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIFileInit()")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIFileInit()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIFileOpenA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIFileOpenA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIFileOpenW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIFileOpenW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIFileReadData(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIFileReadData(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIFileRelease(p0)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIFileRelease(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIFileWriteData(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIFileWriteData(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIGetFromClipboard(p0)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIGetFromClipboard(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIMakeCompressedStream(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIMakeCompressedStream(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIMakeFileFromStreams(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIMakeFileFromStreams(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIMakeStreamFromClipboard(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIMakeStreamFromClipboard(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIPutFileOnClipboard(p0)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIPutFileOnClipboard(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVISaveA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVISaveA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: Int, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVISaveOptions(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVISaveOptions(p0: String, p1: Int, p2: Int, p3: String, p4: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVISaveOptionsFree(p0, p1)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVISaveOptionsFree(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVISaveVA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVISaveVA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVISaveVW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVISaveVW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVISaveW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVISaveW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: Int, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIStreamAddRef(p0)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIStreamAddRef(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIStreamBeginStreaming(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIStreamBeginStreaming(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIStreamCreate(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIStreamCreate(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIStreamEndStreaming(p0)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIStreamEndStreaming(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIStreamFindSample(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIStreamFindSample(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIStreamGetFrame(p0, p1)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIStreamGetFrame(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIStreamGetFrameClose(p0)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIStreamGetFrameClose(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIStreamGetFrameOpen(p0, p1)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIStreamGetFrameOpen(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIStreamInfoA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIStreamInfoA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIStreamInfoW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIStreamInfoW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIStreamLength(p0)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIStreamLength(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIStreamOpenFromFileA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIStreamOpenFromFileA(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIStreamOpenFromFileW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIStreamOpenFromFileW(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIStreamRead(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIStreamRead(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIStreamReadData(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIStreamReadData(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIStreamReadFormat(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIStreamReadFormat(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIStreamRelease(p0)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIStreamRelease(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIStreamSampleToTime(p0, p1)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIStreamSampleToTime(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIStreamSetFormat(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIStreamSetFormat(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIStreamStart(p0)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIStreamStart(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIStreamTimeToSample(p0, p1)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIStreamTimeToSample(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIStreamWrite(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIStreamWrite(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_aVIStreamWriteData(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_aVIStreamWriteData(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_closeDriver(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_closeDriver(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_createEditableStream(p0, p1)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_createEditableStream(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_defDriverProc(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_defDriverProc(p0: String, p1: String, p2: Int, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_drawDibBegin(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_drawDibBegin(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: Int, p7: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_drawDibChangePalette(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_drawDibChangePalette(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_drawDibClose(p0)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_drawDibClose(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_drawDibDraw(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_drawDibDraw(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int, p6: String, p7: String, p8: Int, p9: Int, p10: Int, p11: Int, p12: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_drawDibEnd(p0)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_drawDibEnd(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_drawDibGetBuffer(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_drawDibGetBuffer(p0: String, p1: String, p2: Int, p3: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_drawDibGetPalette(p0)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_drawDibGetPalette(p0: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_drawDibOpen()")
private external fun _wasm_windowssys_windows_win32_media_multimedia_drawDibOpen(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_drawDibProfileDisplay(p0)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_drawDibProfileDisplay(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_drawDibRealize(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_drawDibRealize(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_drawDibSetPalette(p0, p1)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_drawDibSetPalette(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_drawDibStart(p0, p1)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_drawDibStart(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_drawDibStop(p0)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_drawDibStop(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_drawDibTime(p0, p1)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_drawDibTime(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_driverCallback(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_driverCallback(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_drvGetModuleHandle(p0)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_drvGetModuleHandle(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_editStreamClone(p0, p1)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_editStreamClone(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_editStreamCopy(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_editStreamCopy(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_editStreamCut(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_editStreamCut(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_editStreamPaste(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_editStreamPaste(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_editStreamSetInfoA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_editStreamSetInfoA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_editStreamSetInfoW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_editStreamSetInfoW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_editStreamSetNameA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_editStreamSetNameA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_editStreamSetNameW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_editStreamSetNameW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_getDriverModuleHandle(p0)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_getDriverModuleHandle(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_getOpenFileNamePreviewA(p0)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_getOpenFileNamePreviewA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_getOpenFileNamePreviewW(p0)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_getOpenFileNamePreviewW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_getSaveFileNamePreviewA(p0)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_getSaveFileNamePreviewA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_getSaveFileNamePreviewW(p0)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_getSaveFileNamePreviewW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_iCClose(p0)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_iCClose(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_iCCompress(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_iCCompress(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: Int, p9: Int, p10: Int, p11: String, p12: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_iCCompressorChoose(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_iCCompressorChoose(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_iCCompressorFree(p0)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_iCCompressorFree(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_iCDecompress(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_iCDecompress(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_iCDraw(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_iCDraw(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_iCDrawBegin(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_iCDrawBegin(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: Int, p7: Int, p8: Int, p9: String, p10: Int, p11: Int, p12: Int, p13: Int, p14: Int, p15: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_iCGetDisplayFormat(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_iCGetDisplayFormat(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_iCGetInfo(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_iCGetInfo(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_iCImageCompress(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_iCImageCompress(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_iCImageDecompress(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_iCImageDecompress(p0: String, p1: Int, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_iCInfo(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_iCInfo(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_iCInstall(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_iCInstall(p0: Int, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_iCLocate(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_iCLocate(p0: Int, p1: Int, p2: String, p3: String, p4: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_iCOpen(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_iCOpen(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_iCRemove(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_iCRemove(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_iCSendMessage(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_iCSendMessage(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_iCSeqCompressFrame(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_iCSeqCompressFrame(p0: String, p1: Int, p2: String, p3: String, p4: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_iCSeqCompressFrameEnd(p0)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_iCSeqCompressFrameEnd(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_iCSeqCompressFrameStart(p0, p1)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_iCSeqCompressFrameStart(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mCIWndCreateA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mCIWndCreateA(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mCIWndCreateW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mCIWndCreateW(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mCIWndRegisterClass()")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mCIWndRegisterClass(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_openDriver(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_openDriver(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_sendDriverMessage(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_sendDriverMessage(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_videoForWindowsVersion()")
private external fun _wasm_windowssys_windows_win32_media_multimedia_videoForWindowsVersion(): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_capCreateCaptureWindowA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_capCreateCaptureWindowA(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: String, p7: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_capCreateCaptureWindowW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_capCreateCaptureWindowW(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: String, p7: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_capGetDriverDescriptionA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_capGetDriverDescriptionA(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_capGetDriverDescriptionW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_capGetDriverDescriptionW(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_joyGetDevCapsA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_joyGetDevCapsA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_joyGetDevCapsW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_joyGetDevCapsW(p0: String, p1: String, p2: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_joyGetNumDevs()")
private external fun _wasm_windowssys_windows_win32_media_multimedia_joyGetNumDevs(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_joyGetPos(p0, p1)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_joyGetPos(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_joyGetPosEx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_joyGetPosEx(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_joyGetThreshold(p0, p1)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_joyGetThreshold(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_joyReleaseCapture(p0)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_joyReleaseCapture(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_joySetCapture(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_joySetCapture(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_joySetThreshold(p0, p1)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_joySetThreshold(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mciDriverNotify(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mciDriverNotify(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mciDriverYield(p0)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mciDriverYield(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mciFreeCommandResource(p0)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mciFreeCommandResource(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mciGetCreatorTask(p0)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mciGetCreatorTask(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mciGetDeviceIDA(p0)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mciGetDeviceIDA(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mciGetDeviceIDFromElementIDA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mciGetDeviceIDFromElementIDA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mciGetDeviceIDFromElementIDW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mciGetDeviceIDFromElementIDW(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mciGetDeviceIDW(p0)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mciGetDeviceIDW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mciGetDriverData(p0)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mciGetDriverData(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mciGetErrorStringA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mciGetErrorStringA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mciGetErrorStringW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mciGetErrorStringW(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mciGetYieldProc(p0, p1)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mciGetYieldProc(p0: Int, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mciLoadCommandResource(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mciLoadCommandResource(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mciSendCommandA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mciSendCommandA(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mciSendCommandW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mciSendCommandW(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mciSendStringA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mciSendStringA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mciSendStringW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mciSendStringW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mciSetDriverData(p0, p1)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mciSetDriverData(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mciSetYieldProc(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mciSetYieldProc(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mmDrvInstall(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mmDrvInstall(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mmGetCurrentTask()")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mmGetCurrentTask(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mmTaskBlock(p0)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mmTaskBlock(p0: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mmTaskCreate(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mmTaskCreate(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mmTaskSignal(p0)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mmTaskSignal(p0: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mmTaskYield()")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mmTaskYield()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mmioAdvance(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mmioAdvance(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mmioAscend(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mmioAscend(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mmioClose(p0, p1)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mmioClose(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mmioCreateChunk(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mmioCreateChunk(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mmioDescend(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mmioDescend(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mmioFlush(p0, p1)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mmioFlush(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mmioGetInfo(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mmioGetInfo(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mmioInstallIOProcA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mmioInstallIOProcA(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mmioInstallIOProcW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mmioInstallIOProcW(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mmioOpenA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mmioOpenA(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mmioOpenW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mmioOpenW(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mmioRead(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mmioRead(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mmioRenameA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mmioRenameA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mmioRenameW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mmioRenameW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mmioSeek(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mmioSeek(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mmioSendMessage(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mmioSendMessage(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mmioSetBuffer(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mmioSetBuffer(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mmioSetInfo(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mmioSetInfo(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mmioStringToFOURCCA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mmioStringToFOURCCA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mmioStringToFOURCCW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mmioStringToFOURCCW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_mmioWrite(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_mmioWrite(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_multimedia_sndOpenSound(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_media_multimedia_sndOpenSound(p0: String, p1: String, p2: Int, p3: String): Int

public actual fun aVIBuildFilterA(lpszfilter: Pstr, cbfilter: Int, fsaving: Bool): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIBuildFilterA((lpszfilter?.value ?: 0L).toString(), cbfilter, fsaving) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIBuildFilterW(lpszfilter: Pwstr, cbfilter: Int, fsaving: Bool): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIBuildFilterW((lpszfilter?.value ?: 0L).toString(), cbfilter, fsaving) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIClearClipboard(): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIClearClipboard() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileAddRef(pfile: COpaquePointer?): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIFileAddRef((pfile?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileCreateStreamA(pfile: COpaquePointer?, ppavi: COpaquePointer?, psi: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIFileCreateStreamA((pfile?.value ?: 0L).toString(), (ppavi?.value ?: 0L).toString(), (psi?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileCreateStreamW(pfile: COpaquePointer?, ppavi: COpaquePointer?, psi: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIFileCreateStreamW((pfile?.value ?: 0L).toString(), (ppavi?.value ?: 0L).toString(), (psi?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileEndRecord(pfile: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIFileEndRecord((pfile?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileExit() {
    if (_windowsWin32MediaMultimediaNapiAvailable) {
        _wasm_windowssys_windows_win32_media_multimedia_aVIFileExit()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun aVIFileGetStream(pfile: COpaquePointer?, ppavi: COpaquePointer?, fcctype: UInt, lparam: Int): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIFileGetStream((pfile?.value ?: 0L).toString(), (ppavi?.value ?: 0L).toString(), fcctype.toInt(), lparam) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileInfoA(pfile: COpaquePointer?, pfi: COpaquePointer?, lsize: Int): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIFileInfoA((pfile?.value ?: 0L).toString(), (pfi?.value ?: 0L).toString(), lsize) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileInfoW(pfile: COpaquePointer?, pfi: COpaquePointer?, lsize: Int): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIFileInfoW((pfile?.value ?: 0L).toString(), (pfi?.value ?: 0L).toString(), lsize) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileInit() {
    if (_windowsWin32MediaMultimediaNapiAvailable) {
        _wasm_windowssys_windows_win32_media_multimedia_aVIFileInit()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun aVIFileOpenA(ppfile: COpaquePointer?, szfile: Pcstr, umode: UInt, lphandler: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIFileOpenA((ppfile?.value ?: 0L).toString(), (szfile?.value ?: 0L).toString(), umode.toInt(), (lphandler?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileOpenW(ppfile: COpaquePointer?, szfile: Pcwstr, umode: UInt, lphandler: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIFileOpenW((ppfile?.value ?: 0L).toString(), (szfile?.value ?: 0L).toString(), umode.toInt(), (lphandler?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileReadData(pfile: COpaquePointer?, ckid: UInt, lpdata: COpaquePointer?, lpcbdata: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIFileReadData((pfile?.value ?: 0L).toString(), ckid.toInt(), (lpdata?.value ?: 0L).toString(), (lpcbdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileRelease(pfile: COpaquePointer?): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIFileRelease((pfile?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileWriteData(pfile: COpaquePointer?, ckid: UInt, lpdata: COpaquePointer?, cbdata: Int): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIFileWriteData((pfile?.value ?: 0L).toString(), ckid.toInt(), (lpdata?.value ?: 0L).toString(), cbdata) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIGetFromClipboard(lppf: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIGetFromClipboard((lppf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIMakeCompressedStream(ppscompressed: COpaquePointer?, ppssource: COpaquePointer?, lpoptions: COpaquePointer?, pclsidhandler: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIMakeCompressedStream((ppscompressed?.value ?: 0L).toString(), (ppssource?.value ?: 0L).toString(), (lpoptions?.value ?: 0L).toString(), (pclsidhandler?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIMakeFileFromStreams(ppfile: COpaquePointer?, nstreams: Int, papstreams: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIMakeFileFromStreams((ppfile?.value ?: 0L).toString(), nstreams, (papstreams?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIMakeStreamFromClipboard(cfformat: UInt, hglobal: Handle, ppstream: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIMakeStreamFromClipboard(cfformat.toInt(), (hglobal?.value ?: 0L).toString(), (ppstream?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIPutFileOnClipboard(pf: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIPutFileOnClipboard((pf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVISaveA(szfile: Pcstr, pclsidhandler: COpaquePointer?, lpfncallback: Avisavecallback, nstreams: Int, pfile: COpaquePointer?, lpoptions: COpaquePointer?, vararg variadicArgs: Long): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVISaveA((szfile?.value ?: 0L).toString(), (pclsidhandler?.value ?: 0L).toString(), 0L.toString(), nstreams, (pfile?.value ?: 0L).toString(), (lpoptions?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVISaveOptions(hwnd: Hwnd, uiflags: UInt, nstreams: Int, ppavi: COpaquePointer?, plpoptions: COpaquePointer?): Long =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVISaveOptions((hwnd?.value ?: 0L).toString(), uiflags.toInt(), nstreams, (ppavi?.value ?: 0L).toString(), (plpoptions?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVISaveOptionsFree(nstreams: Int, plpoptions: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVISaveOptionsFree(nstreams, (plpoptions?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVISaveVA(szfile: Pcstr, pclsidhandler: COpaquePointer?, lpfncallback: Avisavecallback, nstreams: Int, ppavi: COpaquePointer?, plpoptions: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVISaveVA((szfile?.value ?: 0L).toString(), (pclsidhandler?.value ?: 0L).toString(), 0L.toString(), nstreams, (ppavi?.value ?: 0L).toString(), (plpoptions?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVISaveVW(szfile: Pcwstr, pclsidhandler: COpaquePointer?, lpfncallback: Avisavecallback, nstreams: Int, ppavi: COpaquePointer?, plpoptions: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVISaveVW((szfile?.value ?: 0L).toString(), (pclsidhandler?.value ?: 0L).toString(), 0L.toString(), nstreams, (ppavi?.value ?: 0L).toString(), (plpoptions?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVISaveW(szfile: Pcwstr, pclsidhandler: COpaquePointer?, lpfncallback: Avisavecallback, nstreams: Int, pfile: COpaquePointer?, lpoptions: COpaquePointer?, vararg variadicArgs: Long): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVISaveW((szfile?.value ?: 0L).toString(), (pclsidhandler?.value ?: 0L).toString(), 0L.toString(), nstreams, (pfile?.value ?: 0L).toString(), (lpoptions?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamAddRef(pavi: COpaquePointer?): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIStreamAddRef((pavi?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamBeginStreaming(pavi: COpaquePointer?, lstart: Int, lend: Int, lrate: Int): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIStreamBeginStreaming((pavi?.value ?: 0L).toString(), lstart, lend, lrate) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamCreate(ppavi: COpaquePointer?, lparam1: Int, lparam2: Int, pclsidhandler: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIStreamCreate((ppavi?.value ?: 0L).toString(), lparam1, lparam2, (pclsidhandler?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamEndStreaming(pavi: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIStreamEndStreaming((pavi?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamFindSample(pavi: COpaquePointer?, lpos: Int, lflags: Int): Int =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIStreamFindSample((pavi?.value ?: 0L).toString(), lpos, lflags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamGetFrame(pg: COpaquePointer?, lpos: Int): COpaquePointer? =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIStreamGetFrame((pg?.value ?: 0L).toString(), lpos).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamGetFrameClose(pg: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIStreamGetFrameClose((pg?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamGetFrameOpen(pavi: COpaquePointer?, lpbiwanted: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIStreamGetFrameOpen((pavi?.value ?: 0L).toString(), (lpbiwanted?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamInfoA(pavi: COpaquePointer?, psi: COpaquePointer?, lsize: Int): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIStreamInfoA((pavi?.value ?: 0L).toString(), (psi?.value ?: 0L).toString(), lsize) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamInfoW(pavi: COpaquePointer?, psi: COpaquePointer?, lsize: Int): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIStreamInfoW((pavi?.value ?: 0L).toString(), (psi?.value ?: 0L).toString(), lsize) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamLength(pavi: COpaquePointer?): Int =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIStreamLength((pavi?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamOpenFromFileA(ppavi: COpaquePointer?, szfile: Pcstr, fcctype: UInt, lparam: Int, mode: UInt, pclsidhandler: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIStreamOpenFromFileA((ppavi?.value ?: 0L).toString(), (szfile?.value ?: 0L).toString(), fcctype.toInt(), lparam, mode.toInt(), (pclsidhandler?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamOpenFromFileW(ppavi: COpaquePointer?, szfile: Pcwstr, fcctype: UInt, lparam: Int, mode: UInt, pclsidhandler: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIStreamOpenFromFileW((ppavi?.value ?: 0L).toString(), (szfile?.value ?: 0L).toString(), fcctype.toInt(), lparam, mode.toInt(), (pclsidhandler?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamRead(pavi: COpaquePointer?, lstart: Int, lsamples: Int, lpbuffer: COpaquePointer?, cbbuffer: Int, plbytes: COpaquePointer?, plsamples: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIStreamRead((pavi?.value ?: 0L).toString(), lstart, lsamples, (lpbuffer?.value ?: 0L).toString(), cbbuffer, (plbytes?.value ?: 0L).toString(), (plsamples?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamReadData(pavi: COpaquePointer?, fcc: UInt, lp: COpaquePointer?, lpcb: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIStreamReadData((pavi?.value ?: 0L).toString(), fcc.toInt(), (lp?.value ?: 0L).toString(), (lpcb?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamReadFormat(pavi: COpaquePointer?, lpos: Int, lpformat: COpaquePointer?, lpcbformat: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIStreamReadFormat((pavi?.value ?: 0L).toString(), lpos, (lpformat?.value ?: 0L).toString(), (lpcbformat?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamRelease(pavi: COpaquePointer?): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIStreamRelease((pavi?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamSampleToTime(pavi: COpaquePointer?, lsample: Int): Int =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIStreamSampleToTime((pavi?.value ?: 0L).toString(), lsample) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamSetFormat(pavi: COpaquePointer?, lpos: Int, lpformat: COpaquePointer?, cbformat: Int): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIStreamSetFormat((pavi?.value ?: 0L).toString(), lpos, (lpformat?.value ?: 0L).toString(), cbformat) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamStart(pavi: COpaquePointer?): Int =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIStreamStart((pavi?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamTimeToSample(pavi: COpaquePointer?, ltime: Int): Int =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIStreamTimeToSample((pavi?.value ?: 0L).toString(), ltime) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamWrite(pavi: COpaquePointer?, lstart: Int, lsamples: Int, lpbuffer: COpaquePointer?, cbbuffer: Int, dwflags: UInt, plsampwritten: COpaquePointer?, plbyteswritten: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIStreamWrite((pavi?.value ?: 0L).toString(), lstart, lsamples, (lpbuffer?.value ?: 0L).toString(), cbbuffer, dwflags.toInt(), (plsampwritten?.value ?: 0L).toString(), (plbyteswritten?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamWriteData(pavi: COpaquePointer?, fcc: UInt, lp: COpaquePointer?, cb: Int): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_aVIStreamWriteData((pavi?.value ?: 0L).toString(), fcc.toInt(), (lp?.value ?: 0L).toString(), cb) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeDriver(hdriver: Hdrvr, lparam1: Lparam, lparam2: Lparam): Lresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_closeDriver((hdriver?.value ?: 0L).toString(), lparam1.toString(), lparam2.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEditableStream(ppseditable: COpaquePointer?, pssource: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_createEditableStream((ppseditable?.value ?: 0L).toString(), (pssource?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun defDriverProc(dwdriveridentifier: ULong, hdrvr: Hdrvr, umsg: UInt, lparam1: Lparam, lparam2: Lparam): Lresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_defDriverProc(dwdriveridentifier.toString(), (hdrvr?.value ?: 0L).toString(), umsg.toInt(), lparam1.toString(), lparam2.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibBegin(hdd: Long, hdc: Hdc, dxdst: Int, dydst: Int, lpbi: COpaquePointer?, dxsrc: Int, dysrc: Int, wflags: UInt): Bool =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_drawDibBegin(hdd.toString(), (hdc?.value ?: 0L).toString(), dxdst, dydst, (lpbi?.value ?: 0L).toString(), dxsrc, dysrc, wflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibChangePalette(hdd: Long, istart: Int, ilen: Int, lppe: COpaquePointer?): Bool =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_drawDibChangePalette(hdd.toString(), istart, ilen, (lppe?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibClose(hdd: Long): Bool =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_drawDibClose(hdd.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibDraw(hdd: Long, hdc: Hdc, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: COpaquePointer?, lpbits: COpaquePointer?, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, wflags: UInt): Bool =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_drawDibDraw(hdd.toString(), (hdc?.value ?: 0L).toString(), xdst, ydst, dxdst, dydst, (lpbi?.value ?: 0L).toString(), (lpbits?.value ?: 0L).toString(), xsrc, ysrc, dxsrc, dysrc, wflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibEnd(hdd: Long): Bool =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_drawDibEnd(hdd.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibGetBuffer(hdd: Long, lpbi: COpaquePointer?, dwsize: UInt, dwflags: UInt): COpaquePointer? =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_drawDibGetBuffer(hdd.toString(), (lpbi?.value ?: 0L).toString(), dwsize.toInt(), dwflags.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibGetPalette(hdd: Long): Hpalette =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_drawDibGetPalette(hdd.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibOpen(): Long =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_drawDibOpen().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibProfileDisplay(lpbi: COpaquePointer?): Lresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_drawDibProfileDisplay((lpbi?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibRealize(hdd: Long, hdc: Hdc, fbackground: Bool): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_drawDibRealize(hdd.toString(), (hdc?.value ?: 0L).toString(), fbackground).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibSetPalette(hdd: Long, hpal: Hpalette): Bool =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_drawDibSetPalette(hdd.toString(), (hpal?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibStart(hdd: Long, rate: UInt): Bool =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_drawDibStart(hdd.toString(), rate.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibStop(hdd: Long): Bool =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_drawDibStop(hdd.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibTime(hdd: Long, lpddtime: COpaquePointer?): Bool =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_drawDibTime(hdd.toString(), (lpddtime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun driverCallback(dwcallback: ULong, dwflags: UInt, hdevice: Hdrvr, dwmsg: UInt, dwuser: ULong, dwparam1: ULong, dwparam2: ULong): Bool =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_driverCallback(dwcallback.toString(), dwflags.toInt(), (hdevice?.value ?: 0L).toString(), dwmsg.toInt(), dwuser.toString(), dwparam1.toString(), dwparam2.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drvGetModuleHandle(hdriver: Hdrvr): Hmodule =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_drvGetModuleHandle((hdriver?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun editStreamClone(pavi: COpaquePointer?, ppresult: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_editStreamClone((pavi?.value ?: 0L).toString(), (ppresult?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun editStreamCopy(pavi: COpaquePointer?, plstart: COpaquePointer?, pllength: COpaquePointer?, ppresult: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_editStreamCopy((pavi?.value ?: 0L).toString(), (plstart?.value ?: 0L).toString(), (pllength?.value ?: 0L).toString(), (ppresult?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun editStreamCut(pavi: COpaquePointer?, plstart: COpaquePointer?, pllength: COpaquePointer?, ppresult: COpaquePointer?): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_editStreamCut((pavi?.value ?: 0L).toString(), (plstart?.value ?: 0L).toString(), (pllength?.value ?: 0L).toString(), (ppresult?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun editStreamPaste(pavi: COpaquePointer?, plpos: COpaquePointer?, pllength: COpaquePointer?, pstream: COpaquePointer?, lstart: Int, lend: Int): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_editStreamPaste((pavi?.value ?: 0L).toString(), (plpos?.value ?: 0L).toString(), (pllength?.value ?: 0L).toString(), (pstream?.value ?: 0L).toString(), lstart, lend) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun editStreamSetInfoA(pavi: COpaquePointer?, lpinfo: COpaquePointer?, cbinfo: Int): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_editStreamSetInfoA((pavi?.value ?: 0L).toString(), (lpinfo?.value ?: 0L).toString(), cbinfo) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun editStreamSetInfoW(pavi: COpaquePointer?, lpinfo: COpaquePointer?, cbinfo: Int): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_editStreamSetInfoW((pavi?.value ?: 0L).toString(), (lpinfo?.value ?: 0L).toString(), cbinfo) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun editStreamSetNameA(pavi: COpaquePointer?, lpszname: Pcstr): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_editStreamSetNameA((pavi?.value ?: 0L).toString(), (lpszname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun editStreamSetNameW(pavi: COpaquePointer?, lpszname: Pcwstr): Hresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_editStreamSetNameW((pavi?.value ?: 0L).toString(), (lpszname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDriverModuleHandle(hdriver: Hdrvr): Hmodule =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_getDriverModuleHandle((hdriver?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOpenFileNamePreviewA(lpofn: COpaquePointer?): Bool =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_getOpenFileNamePreviewA((lpofn?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOpenFileNamePreviewW(lpofn: COpaquePointer?): Bool =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_getOpenFileNamePreviewW((lpofn?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSaveFileNamePreviewA(lpofn: COpaquePointer?): Bool =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_getSaveFileNamePreviewA((lpofn?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSaveFileNamePreviewW(lpofn: COpaquePointer?): Bool =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_getSaveFileNamePreviewW((lpofn?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCClose(hic: Hic): Lresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_iCClose((hic?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCCompress(hic: Hic, dwflags: UInt, lpbioutput: COpaquePointer?, lpdata: COpaquePointer?, lpbiinput: COpaquePointer?, lpbits: COpaquePointer?, lpckid: COpaquePointer?, lpdwflags: COpaquePointer?, lframenum: Int, dwframesize: UInt, dwquality: UInt, lpbiprev: COpaquePointer?, lpprev: COpaquePointer?): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_iCCompress((hic?.value ?: 0L).toString(), dwflags.toInt(), (lpbioutput?.value ?: 0L).toString(), (lpdata?.value ?: 0L).toString(), (lpbiinput?.value ?: 0L).toString(), (lpbits?.value ?: 0L).toString(), (lpckid?.value ?: 0L).toString(), (lpdwflags?.value ?: 0L).toString(), lframenum, dwframesize.toInt(), dwquality.toInt(), (lpbiprev?.value ?: 0L).toString(), (lpprev?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCCompressorChoose(hwnd: Hwnd, uiflags: UInt, pvin: COpaquePointer?, lpdata: COpaquePointer?, pc: COpaquePointer?, lpsztitle: Pcstr): Bool =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_iCCompressorChoose((hwnd?.value ?: 0L).toString(), uiflags.toInt(), (pvin?.value ?: 0L).toString(), (lpdata?.value ?: 0L).toString(), (pc?.value ?: 0L).toString(), (lpsztitle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCCompressorFree(pc: COpaquePointer?) {
    if (_windowsWin32MediaMultimediaNapiAvailable) {
        _wasm_windowssys_windows_win32_media_multimedia_iCCompressorFree((pc?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iCDecompress(hic: Hic, dwflags: UInt, lpbiformat: COpaquePointer?, lpdata: COpaquePointer?, lpbi: COpaquePointer?, lpbits: COpaquePointer?): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_iCDecompress((hic?.value ?: 0L).toString(), dwflags.toInt(), (lpbiformat?.value ?: 0L).toString(), (lpdata?.value ?: 0L).toString(), (lpbi?.value ?: 0L).toString(), (lpbits?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCDraw(hic: Hic, dwflags: UInt, lpformat: COpaquePointer?, lpdata: COpaquePointer?, cbdata: UInt, ltime: Int): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_iCDraw((hic?.value ?: 0L).toString(), dwflags.toInt(), (lpformat?.value ?: 0L).toString(), (lpdata?.value ?: 0L).toString(), cbdata.toInt(), ltime).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCDrawBegin(hic: Hic, dwflags: UInt, hpal: Hpalette, hwnd: Hwnd, hdc: Hdc, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: COpaquePointer?, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, dwrate: UInt, dwscale: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_iCDrawBegin((hic?.value ?: 0L).toString(), dwflags.toInt(), (hpal?.value ?: 0L).toString(), (hwnd?.value ?: 0L).toString(), (hdc?.value ?: 0L).toString(), xdst, ydst, dxdst, dydst, (lpbi?.value ?: 0L).toString(), xsrc, ysrc, dxsrc, dysrc, dwrate.toInt(), dwscale.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCGetDisplayFormat(hic: Hic, lpbiin: COpaquePointer?, lpbiout: COpaquePointer?, bitdepth: Int, dx: Int, dy: Int): Hic =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_iCGetDisplayFormat((hic?.value ?: 0L).toString(), (lpbiin?.value ?: 0L).toString(), (lpbiout?.value ?: 0L).toString(), bitdepth, dx, dy).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCGetInfo(hic: Hic, picinfo: COpaquePointer?, cb: UInt): Lresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_iCGetInfo((hic?.value ?: 0L).toString(), (picinfo?.value ?: 0L).toString(), cb.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCImageCompress(hic: Hic, uiflags: UInt, lpbiin: COpaquePointer?, lpbits: COpaquePointer?, lpbiout: COpaquePointer?, lquality: Int, plsize: COpaquePointer?): Handle =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_iCImageCompress((hic?.value ?: 0L).toString(), uiflags.toInt(), (lpbiin?.value ?: 0L).toString(), (lpbits?.value ?: 0L).toString(), (lpbiout?.value ?: 0L).toString(), lquality, (plsize?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCImageDecompress(hic: Hic, uiflags: UInt, lpbiin: COpaquePointer?, lpbits: COpaquePointer?, lpbiout: COpaquePointer?): Handle =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_iCImageDecompress((hic?.value ?: 0L).toString(), uiflags.toInt(), (lpbiin?.value ?: 0L).toString(), (lpbits?.value ?: 0L).toString(), (lpbiout?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCInfo(fcctype: UInt, fcchandler: UInt, lpicinfo: COpaquePointer?): Bool =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_iCInfo(fcctype.toInt(), fcchandler.toInt(), (lpicinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCInstall(fcctype: UInt, fcchandler: UInt, lparam: Lparam, szdesc: Pcstr, wflags: UInt): Bool =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_iCInstall(fcctype.toInt(), fcchandler.toInt(), lparam.toString(), (szdesc?.value ?: 0L).toString(), wflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCLocate(fcctype: UInt, fcchandler: UInt, lpbiin: COpaquePointer?, lpbiout: COpaquePointer?, wflags: UShort): Hic =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_iCLocate(fcctype.toInt(), fcchandler.toInt(), (lpbiin?.value ?: 0L).toString(), (lpbiout?.value ?: 0L).toString(), wflags.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCOpen(fcctype: UInt, fcchandler: UInt, wmode: UInt): Hic =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_iCOpen(fcctype.toInt(), fcchandler.toInt(), wmode.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCOpenFunction(fcctype: UInt, fcchandler: UInt, wmode: UInt, lpfnhandler: Farproc): Hic =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCRemove(fcctype: UInt, fcchandler: UInt, wflags: UInt): Bool =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_iCRemove(fcctype.toInt(), fcchandler.toInt(), wflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCSendMessage(hic: Hic, msg: UInt, dw1: ULong, dw2: ULong): Lresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_iCSendMessage((hic?.value ?: 0L).toString(), msg.toInt(), dw1.toString(), dw2.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCSeqCompressFrame(pc: COpaquePointer?, uiflags: UInt, lpbits: COpaquePointer?, pfkey: COpaquePointer?, plsize: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_iCSeqCompressFrame((pc?.value ?: 0L).toString(), uiflags.toInt(), (lpbits?.value ?: 0L).toString(), (pfkey?.value ?: 0L).toString(), (plsize?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCSeqCompressFrameEnd(pc: COpaquePointer?) {
    if (_windowsWin32MediaMultimediaNapiAvailable) {
        _wasm_windowssys_windows_win32_media_multimedia_iCSeqCompressFrameEnd((pc?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iCSeqCompressFrameStart(pc: COpaquePointer?, lpbiin: COpaquePointer?): Bool =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_iCSeqCompressFrameStart((pc?.value ?: 0L).toString(), (lpbiin?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mCIWndCreateA(hwndparent: Hwnd, hinstance: Hinstance, dwstyle: UInt, szfile: Pcstr): Hwnd =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mCIWndCreateA((hwndparent?.value ?: 0L).toString(), (hinstance?.value ?: 0L).toString(), dwstyle.toInt(), (szfile?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mCIWndCreateW(hwndparent: Hwnd, hinstance: Hinstance, dwstyle: UInt, szfile: Pcwstr): Hwnd =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mCIWndCreateW((hwndparent?.value ?: 0L).toString(), (hinstance?.value ?: 0L).toString(), dwstyle.toInt(), (szfile?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mCIWndRegisterClass(): Bool =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mCIWndRegisterClass() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openDriver(szdrivername: Pcwstr, szsectionname: Pcwstr, lparam2: Lparam): Hdrvr =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_openDriver((szdrivername?.value ?: 0L).toString(), (szsectionname?.value ?: 0L).toString(), lparam2.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendDriverMessage(hdriver: Hdrvr, message: UInt, lparam1: Lparam, lparam2: Lparam): Lresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_sendDriverMessage((hdriver?.value ?: 0L).toString(), message.toInt(), lparam1.toString(), lparam2.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun videoForWindowsVersion(): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_videoForWindowsVersion().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capCreateCaptureWindowA(lpszwindowname: Pcstr, dwstyle: UInt, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, nid: Int): Hwnd =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_capCreateCaptureWindowA((lpszwindowname?.value ?: 0L).toString(), dwstyle.toInt(), x, y, nwidth, nheight, (hwndparent?.value ?: 0L).toString(), nid).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capCreateCaptureWindowW(lpszwindowname: Pcwstr, dwstyle: UInt, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, nid: Int): Hwnd =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_capCreateCaptureWindowW((lpszwindowname?.value ?: 0L).toString(), dwstyle.toInt(), x, y, nwidth, nheight, (hwndparent?.value ?: 0L).toString(), nid).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capGetDriverDescriptionA(wdriverindex: UInt, lpszname: Pstr, cbname: Int, lpszver: Pstr, cbver: Int): Bool =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_capGetDriverDescriptionA(wdriverindex.toInt(), (lpszname?.value ?: 0L).toString(), cbname, (lpszver?.value ?: 0L).toString(), cbver) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capGetDriverDescriptionW(wdriverindex: UInt, lpszname: Pwstr, cbname: Int, lpszver: Pwstr, cbver: Int): Bool =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_capGetDriverDescriptionW(wdriverindex.toInt(), (lpszname?.value ?: 0L).toString(), cbname, (lpszver?.value ?: 0L).toString(), cbver) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joyGetDevCapsA(ujoyid: ULong, pjc: COpaquePointer?, cbjc: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_joyGetDevCapsA(ujoyid.toString(), (pjc?.value ?: 0L).toString(), cbjc.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joyGetDevCapsW(ujoyid: ULong, pjc: COpaquePointer?, cbjc: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_joyGetDevCapsW(ujoyid.toString(), (pjc?.value ?: 0L).toString(), cbjc.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joyGetNumDevs(): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_joyGetNumDevs().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joyGetPos(ujoyid: UInt, pji: COpaquePointer?): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_joyGetPos(ujoyid.toInt(), (pji?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joyGetPosEx(ujoyid: UInt, pji: COpaquePointer?): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_joyGetPosEx(ujoyid.toInt(), (pji?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joyGetThreshold(ujoyid: UInt, puthreshold: COpaquePointer?): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_joyGetThreshold(ujoyid.toInt(), (puthreshold?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joyReleaseCapture(ujoyid: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_joyReleaseCapture(ujoyid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joySetCapture(hwnd: Hwnd, ujoyid: UInt, uperiod: UInt, fchanged: Bool): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_joySetCapture((hwnd?.value ?: 0L).toString(), ujoyid.toInt(), uperiod.toInt(), fchanged).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joySetThreshold(ujoyid: UInt, uthreshold: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_joySetThreshold(ujoyid.toInt(), uthreshold.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciDriverNotify(hwndcallback: Handle, wdeviceid: UInt, ustatus: UInt): Bool =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mciDriverNotify((hwndcallback?.value ?: 0L).toString(), wdeviceid.toInt(), ustatus.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciDriverYield(wdeviceid: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mciDriverYield(wdeviceid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciFreeCommandResource(wtable: UInt): Bool =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mciFreeCommandResource(wtable.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciGetCreatorTask(mciid: UInt): Htask =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mciGetCreatorTask(mciid.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciGetDeviceIDA(pszdevice: Pcstr): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mciGetDeviceIDA((pszdevice?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciGetDeviceIDFromElementIDA(dwelementid: UInt, lpstrtype: Pcstr): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mciGetDeviceIDFromElementIDA(dwelementid.toInt(), (lpstrtype?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciGetDeviceIDFromElementIDW(dwelementid: UInt, lpstrtype: Pcwstr): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mciGetDeviceIDFromElementIDW(dwelementid.toInt(), (lpstrtype?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciGetDeviceIDW(pszdevice: Pcwstr): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mciGetDeviceIDW((pszdevice?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciGetDriverData(wdeviceid: UInt): ULong =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mciGetDriverData(wdeviceid.toInt()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciGetErrorStringA(mcierr: UInt, psztext: Pstr, cchtext: UInt): Bool =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mciGetErrorStringA(mcierr.toInt(), (psztext?.value ?: 0L).toString(), cchtext.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciGetErrorStringW(mcierr: UInt, psztext: Pwstr, cchtext: UInt): Bool =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mciGetErrorStringW(mcierr.toInt(), (psztext?.value ?: 0L).toString(), cchtext.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciGetYieldProc(mciid: UInt, pdwyielddata: COpaquePointer?): Yieldproc =
    if (_windowsWin32MediaMultimediaNapiAvailable) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciLoadCommandResource(hinstance: Handle, lpresname: Pcwstr, wtype: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mciLoadCommandResource((hinstance?.value ?: 0L).toString(), (lpresname?.value ?: 0L).toString(), wtype.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciSendCommandA(mciid: UInt, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mciSendCommandA(mciid.toInt(), umsg.toInt(), dwparam1.toString(), dwparam2.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciSendCommandW(mciid: UInt, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mciSendCommandW(mciid.toInt(), umsg.toInt(), dwparam1.toString(), dwparam2.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciSendStringA(lpstrcommand: Pcstr, lpstrreturnstring: Pstr, ureturnlength: UInt, hwndcallback: Hwnd): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mciSendStringA((lpstrcommand?.value ?: 0L).toString(), (lpstrreturnstring?.value ?: 0L).toString(), ureturnlength.toInt(), (hwndcallback?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciSendStringW(lpstrcommand: Pcwstr, lpstrreturnstring: Pwstr, ureturnlength: UInt, hwndcallback: Hwnd): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mciSendStringW((lpstrcommand?.value ?: 0L).toString(), (lpstrreturnstring?.value ?: 0L).toString(), ureturnlength.toInt(), (hwndcallback?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciSetDriverData(wdeviceid: UInt, dwdata: ULong): Bool =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mciSetDriverData(wdeviceid.toInt(), dwdata.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciSetYieldProc(mciid: UInt, fpyieldproc: Yieldproc, dwyielddata: UInt): Bool =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mciSetYieldProc(mciid.toInt(), 0L.toString(), dwyielddata.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmDrvInstall(hdriver: Hdrvr, wszdrventry: Pcwstr, drvmessage: Drivermsgproc, wflags: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mmDrvInstall((hdriver?.value ?: 0L).toString(), (wszdrventry?.value ?: 0L).toString(), 0L.toString(), wflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmGetCurrentTask(): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mmGetCurrentTask().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmTaskBlock(h: UInt) {
    if (_windowsWin32MediaMultimediaNapiAvailable) {
        _wasm_windowssys_windows_win32_media_multimedia_mmTaskBlock(h.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmTaskCreate(lpfn: Lptaskcallback, lph: COpaquePointer?, dwinst: ULong): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mmTaskCreate(0L.toString(), (lph?.value ?: 0L).toString(), dwinst.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmTaskSignal(h: UInt): Bool =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mmTaskSignal(h.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmTaskYield() {
    if (_windowsWin32MediaMultimediaNapiAvailable) {
        _wasm_windowssys_windows_win32_media_multimedia_mmTaskYield()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmioAdvance(hmmio: Hmmio, pmmioinfo: COpaquePointer?, fuadvance: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mmioAdvance((hmmio?.value ?: 0L).toString(), (pmmioinfo?.value ?: 0L).toString(), fuadvance.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioAscend(hmmio: Hmmio, pmmcki: COpaquePointer?, fuascend: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mmioAscend((hmmio?.value ?: 0L).toString(), (pmmcki?.value ?: 0L).toString(), fuascend.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioClose(hmmio: Hmmio, fuclose: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mmioClose((hmmio?.value ?: 0L).toString(), fuclose.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioCreateChunk(hmmio: Hmmio, pmmcki: COpaquePointer?, fucreate: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mmioCreateChunk((hmmio?.value ?: 0L).toString(), (pmmcki?.value ?: 0L).toString(), fucreate.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioDescend(hmmio: Hmmio, pmmcki: COpaquePointer?, pmmckiparent: COpaquePointer?, fudescend: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mmioDescend((hmmio?.value ?: 0L).toString(), (pmmcki?.value ?: 0L).toString(), (pmmckiparent?.value ?: 0L).toString(), fudescend.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioFlush(hmmio: Hmmio, fuflush: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mmioFlush((hmmio?.value ?: 0L).toString(), fuflush.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioGetInfo(hmmio: Hmmio, pmmioinfo: COpaquePointer?, fuinfo: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mmioGetInfo((hmmio?.value ?: 0L).toString(), (pmmioinfo?.value ?: 0L).toString(), fuinfo.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioInstallIOProcA(fccioproc: UInt, pioproc: Lpmmioproc, dwflags: UInt): Lpmmioproc =
    if (_windowsWin32MediaMultimediaNapiAvailable) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioInstallIOProcW(fccioproc: UInt, pioproc: Lpmmioproc, dwflags: UInt): Lpmmioproc =
    if (_windowsWin32MediaMultimediaNapiAvailable) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioOpenA(pszfilename: Pstr, pmmioinfo: COpaquePointer?, fdwopen: UInt): Hmmio =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mmioOpenA((pszfilename?.value ?: 0L).toString(), (pmmioinfo?.value ?: 0L).toString(), fdwopen.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioOpenW(pszfilename: Pwstr, pmmioinfo: COpaquePointer?, fdwopen: UInt): Hmmio =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mmioOpenW((pszfilename?.value ?: 0L).toString(), (pmmioinfo?.value ?: 0L).toString(), fdwopen.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioRead(hmmio: Hmmio, pch: COpaquePointer?, cch: Int): Int =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mmioRead((hmmio?.value ?: 0L).toString(), (pch?.value ?: 0L).toString(), cch) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioRenameA(pszfilename: Pcstr, psznewfilename: Pcstr, pmmioinfo: COpaquePointer?, fdwrename: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mmioRenameA((pszfilename?.value ?: 0L).toString(), (psznewfilename?.value ?: 0L).toString(), (pmmioinfo?.value ?: 0L).toString(), fdwrename.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioRenameW(pszfilename: Pcwstr, psznewfilename: Pcwstr, pmmioinfo: COpaquePointer?, fdwrename: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mmioRenameW((pszfilename?.value ?: 0L).toString(), (psznewfilename?.value ?: 0L).toString(), (pmmioinfo?.value ?: 0L).toString(), fdwrename.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioSeek(hmmio: Hmmio, loffset: Int, iorigin: Int): Int =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mmioSeek((hmmio?.value ?: 0L).toString(), loffset, iorigin) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioSendMessage(hmmio: Hmmio, umsg: UInt, lparam1: Lparam, lparam2: Lparam): Lresult =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mmioSendMessage((hmmio?.value ?: 0L).toString(), umsg.toInt(), lparam1.toString(), lparam2.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioSetBuffer(hmmio: Hmmio, pchbuffer: Pstr, cchbuffer: Int, fubuffer: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mmioSetBuffer((hmmio?.value ?: 0L).toString(), (pchbuffer?.value ?: 0L).toString(), cchbuffer, fubuffer.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioSetInfo(hmmio: Hmmio, pmmioinfo: COpaquePointer?, fuinfo: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mmioSetInfo((hmmio?.value ?: 0L).toString(), (pmmioinfo?.value ?: 0L).toString(), fuinfo.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioStringToFOURCCA(sz: Pcstr, uflags: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mmioStringToFOURCCA((sz?.value ?: 0L).toString(), uflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioStringToFOURCCW(sz: Pcwstr, uflags: UInt): UInt =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mmioStringToFOURCCW((sz?.value ?: 0L).toString(), uflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioWrite(hmmio: Hmmio, pch: Pcstr, cch: Int): Int =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_mmioWrite((hmmio?.value ?: 0L).toString(), (pch?.value ?: 0L).toString(), cch) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sndOpenSound(eventname: Pcwstr, appname: Pcwstr, flags: Int, filehandle: COpaquePointer?): Int =
    if (_windowsWin32MediaMultimediaNapiAvailable) _wasm_windowssys_windows_win32_media_multimedia_sndOpenSound((eventname?.value ?: 0L).toString(), (appname?.value ?: 0L).toString(), flags, (filehandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
