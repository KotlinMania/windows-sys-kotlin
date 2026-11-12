@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.media.multimedia

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
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
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Bitmapinfo
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Bitmapinfoheader
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hpalette
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Paletteentry
import io.github.kotlinmania.windowssys.windows.win32.media.Htask
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.Openfilenamea
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.Openfilenamew

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32MediaMultimediaNapiAddon(): Boolean

private val windowsWin32MediaMultimediaNapiAvailable: Boolean = initWindowsWin32MediaMultimediaNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIBuildFilterA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIBuildFilterA(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIBuildFilterW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIBuildFilterW(p0: String, p1: Int, p2: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIClearClipboard()")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIClearClipboard(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIFileAddRef(p0)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIFileAddRef(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIFileCreateStreamA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIFileCreateStreamA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIFileCreateStreamW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIFileCreateStreamW(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIFileEndRecord(p0)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIFileEndRecord(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIFileExit()")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIFileExit()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIFileGetStream(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIFileGetStream(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIFileInfoA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIFileInfoA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIFileInfoW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIFileInfoW(p0: String, p1: String, p2: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIFileInit()")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIFileInit()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIFileOpenA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIFileOpenA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIFileOpenW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIFileOpenW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIFileReadData(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIFileReadData(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIFileRelease(p0)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIFileRelease(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIFileWriteData(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIFileWriteData(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIGetFromClipboard(p0)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIGetFromClipboard(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIMakeCompressedStream(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIMakeCompressedStream(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIMakeFileFromStreams(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIMakeFileFromStreams(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIMakeStreamFromClipboard(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIMakeStreamFromClipboard(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIPutFileOnClipboard(p0)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIPutFileOnClipboard(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVISaveA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVISaveA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: Int, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVISaveOptions(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVISaveOptions(p0: String, p1: Int, p2: Int, p3: String, p4: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVISaveOptionsFree(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVISaveOptionsFree(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVISaveVA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVISaveVA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVISaveVW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVISaveVW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVISaveW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVISaveW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: Int, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIStreamAddRef(p0)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIStreamAddRef(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIStreamBeginStreaming(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIStreamBeginStreaming(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIStreamCreate(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIStreamCreate(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIStreamEndStreaming(p0)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIStreamEndStreaming(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIStreamFindSample(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIStreamFindSample(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIStreamGetFrame(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIStreamGetFrame(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIStreamGetFrameClose(p0)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIStreamGetFrameClose(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIStreamGetFrameOpen(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIStreamGetFrameOpen(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIStreamInfoA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIStreamInfoA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIStreamInfoW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIStreamInfoW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIStreamLength(p0)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIStreamLength(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIStreamOpenFromFileA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIStreamOpenFromFileA(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIStreamOpenFromFileW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIStreamOpenFromFileW(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIStreamRead(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIStreamRead(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIStreamReadData(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIStreamReadData(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIStreamReadFormat(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIStreamReadFormat(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIStreamRelease(p0)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIStreamRelease(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIStreamSampleToTime(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIStreamSampleToTime(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIStreamSetFormat(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIStreamSetFormat(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIStreamStart(p0)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIStreamStart(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIStreamTimeToSample(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIStreamTimeToSample(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIStreamWrite(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIStreamWrite(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaAVIStreamWriteData(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaAVIStreamWriteData(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaCloseDriver(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaCloseDriver(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaCreateEditableStream(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaCreateEditableStream(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaDefDriverProc(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaDefDriverProc(p0: String, p1: String, p2: Int, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaDrawDibBegin(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaDrawDibBegin(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: Int, p7: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaDrawDibChangePalette(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaDrawDibChangePalette(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaDrawDibClose(p0)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaDrawDibClose(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaDrawDibDraw(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaDrawDibDraw(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int, p6: String, p7: String, p8: Int, p9: Int, p10: Int, p11: Int, p12: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaDrawDibEnd(p0)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaDrawDibEnd(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaDrawDibGetBuffer(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaDrawDibGetBuffer(p0: String, p1: String, p2: Int, p3: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaDrawDibGetPalette(p0)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaDrawDibGetPalette(p0: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaDrawDibOpen()")
private external fun wasmWindowssysWindowsWin32MediaMultimediaDrawDibOpen(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaDrawDibProfileDisplay(p0)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaDrawDibProfileDisplay(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaDrawDibRealize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaDrawDibRealize(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaDrawDibSetPalette(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaDrawDibSetPalette(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaDrawDibStart(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaDrawDibStart(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaDrawDibStop(p0)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaDrawDibStop(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaDrawDibTime(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaDrawDibTime(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaDriverCallback(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaDriverCallback(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaDrvGetModuleHandle(p0)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaDrvGetModuleHandle(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaEditStreamClone(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaEditStreamClone(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaEditStreamCopy(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaEditStreamCopy(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaEditStreamCut(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaEditStreamCut(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaEditStreamPaste(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaEditStreamPaste(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaEditStreamSetInfoA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaEditStreamSetInfoA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaEditStreamSetInfoW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaEditStreamSetInfoW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaEditStreamSetNameA(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaEditStreamSetNameA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaEditStreamSetNameW(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaEditStreamSetNameW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaGetDriverModuleHandle(p0)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaGetDriverModuleHandle(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaGetOpenFileNamePreviewA(p0)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaGetOpenFileNamePreviewA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaGetOpenFileNamePreviewW(p0)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaGetOpenFileNamePreviewW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaGetSaveFileNamePreviewA(p0)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaGetSaveFileNamePreviewA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaGetSaveFileNamePreviewW(p0)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaGetSaveFileNamePreviewW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaICClose(p0)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaICClose(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaICCompress(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaICCompress(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: Int, p9: Int, p10: Int, p11: String, p12: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaICCompressorChoose(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaICCompressorChoose(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaICCompressorFree(p0)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaICCompressorFree(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaICDecompress(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaICDecompress(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaICDraw(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaICDraw(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaICDrawBegin(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaICDrawBegin(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: Int, p7: Int, p8: Int, p9: String, p10: Int, p11: Int, p12: Int, p13: Int, p14: Int, p15: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaICGetDisplayFormat(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaICGetDisplayFormat(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaICGetInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaICGetInfo(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaICImageCompress(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaICImageCompress(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaICImageDecompress(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaICImageDecompress(p0: String, p1: Int, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaICInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaICInfo(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaICInstall(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaICInstall(p0: Int, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaICLocate(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaICLocate(p0: Int, p1: Int, p2: String, p3: String, p4: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaICOpen(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaICOpen(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaICRemove(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaICRemove(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaICSendMessage(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaICSendMessage(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaICSeqCompressFrame(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaICSeqCompressFrame(p0: String, p1: Int, p2: String, p3: String, p4: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaICSeqCompressFrameEnd(p0)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaICSeqCompressFrameEnd(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaICSeqCompressFrameStart(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaICSeqCompressFrameStart(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMCIWndCreateA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMCIWndCreateA(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMCIWndCreateW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMCIWndCreateW(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMCIWndRegisterClass()")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMCIWndRegisterClass(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaOpenDriver(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaOpenDriver(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaSendDriverMessage(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaSendDriverMessage(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaVideoForWindowsVersion()")
private external fun wasmWindowssysWindowsWin32MediaMultimediaVideoForWindowsVersion(): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaCapCreateCaptureWindowA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaCapCreateCaptureWindowA(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: String, p7: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaCapCreateCaptureWindowW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaCapCreateCaptureWindowW(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: String, p7: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaCapGetDriverDescriptionA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaCapGetDriverDescriptionA(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaCapGetDriverDescriptionW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaCapGetDriverDescriptionW(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaJoyGetDevCapsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaJoyGetDevCapsA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaJoyGetDevCapsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaJoyGetDevCapsW(p0: String, p1: String, p2: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaJoyGetNumDevs()")
private external fun wasmWindowssysWindowsWin32MediaMultimediaJoyGetNumDevs(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaJoyGetPos(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaJoyGetPos(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaJoyGetPosEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaJoyGetPosEx(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaJoyGetThreshold(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaJoyGetThreshold(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaJoyReleaseCapture(p0)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaJoyReleaseCapture(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaJoySetCapture(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaJoySetCapture(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaJoySetThreshold(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaJoySetThreshold(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMciDriverNotify(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMciDriverNotify(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMciDriverYield(p0)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMciDriverYield(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMciFreeCommandResource(p0)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMciFreeCommandResource(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMciGetCreatorTask(p0)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMciGetCreatorTask(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMciGetDeviceIDA(p0)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMciGetDeviceIDA(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMciGetDeviceIDFromElementIDA(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMciGetDeviceIDFromElementIDA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMciGetDeviceIDFromElementIDW(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMciGetDeviceIDFromElementIDW(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMciGetDeviceIDW(p0)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMciGetDeviceIDW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMciGetDriverData(p0)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMciGetDriverData(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMciGetErrorStringA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMciGetErrorStringA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMciGetErrorStringW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMciGetErrorStringW(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMciGetYieldProc(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMciGetYieldProc(p0: Int, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMciLoadCommandResource(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMciLoadCommandResource(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMciSendCommandA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMciSendCommandA(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMciSendCommandW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMciSendCommandW(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMciSendStringA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMciSendStringA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMciSendStringW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMciSendStringW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMciSetDriverData(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMciSetDriverData(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMciSetYieldProc(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMciSetYieldProc(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMmDrvInstall(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMmDrvInstall(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMmGetCurrentTask()")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMmGetCurrentTask(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMmTaskBlock(p0)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMmTaskBlock(p0: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMmTaskCreate(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMmTaskCreate(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMmTaskSignal(p0)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMmTaskSignal(p0: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMmTaskYield()")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMmTaskYield()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMmioAdvance(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMmioAdvance(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMmioAscend(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMmioAscend(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMmioClose(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMmioClose(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMmioCreateChunk(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMmioCreateChunk(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMmioDescend(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMmioDescend(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMmioFlush(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMmioFlush(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMmioGetInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMmioGetInfo(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMmioInstallIOProcA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMmioInstallIOProcA(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMmioInstallIOProcW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMmioInstallIOProcW(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMmioOpenA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMmioOpenA(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMmioOpenW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMmioOpenW(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMmioRead(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMmioRead(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMmioRenameA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMmioRenameA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMmioRenameW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMmioRenameW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMmioSeek(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMmioSeek(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMmioSendMessage(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMmioSendMessage(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMmioSetBuffer(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMmioSetBuffer(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMmioSetInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMmioSetInfo(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMmioStringToFOURCCA(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMmioStringToFOURCCA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMmioStringToFOURCCW(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMmioStringToFOURCCW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaMmioWrite(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaMmioWrite(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaMultimediaSndOpenSound(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32MediaMultimediaSndOpenSound(p0: String, p1: String, p2: Int, p3: String): Int

public actual fun aVIBuildFilterA(lpszfilter: Pstr, cbfilter: Int, fsaving: Bool): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIBuildFilterA(lpszfilter.rawAddress.toString(), cbfilter, fsaving) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIBuildFilterW(lpszfilter: Pwstr, cbfilter: Int, fsaving: Bool): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIBuildFilterW(lpszfilter.rawAddress.toString(), cbfilter, fsaving) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIClearClipboard(): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIClearClipboard() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileAddRef(pfile: MutPtr<CVoid>): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIFileAddRef(pfile.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileCreateStreamA(pfile: MutPtr<CVoid>, ppavi: MutPtr<MutPtr<CVoid>>, psi: ConstPtr<Avistreaminfoa>): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIFileCreateStreamA(pfile.rawAddress.toString(), ppavi.rawAddress.toString(), psi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileCreateStreamW(pfile: MutPtr<CVoid>, ppavi: MutPtr<MutPtr<CVoid>>, psi: ConstPtr<Avistreaminfow>): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIFileCreateStreamW(pfile.rawAddress.toString(), ppavi.rawAddress.toString(), psi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileEndRecord(pfile: MutPtr<CVoid>): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIFileEndRecord(pfile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileExit() {
    if (windowsWin32MediaMultimediaNapiAvailable) {
        wasmWindowssysWindowsWin32MediaMultimediaAVIFileExit()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun aVIFileGetStream(pfile: MutPtr<CVoid>, ppavi: MutPtr<MutPtr<CVoid>>, fcctype: UInt, lparam: Int): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIFileGetStream(pfile.rawAddress.toString(), ppavi.rawAddress.toString(), fcctype.toInt(), lparam) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileInfoA(pfile: MutPtr<CVoid>, pfi: MutPtr<Avifileinfoa>, lsize: Int): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIFileInfoA(pfile.rawAddress.toString(), pfi.rawAddress.toString(), lsize) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileInfoW(pfile: MutPtr<CVoid>, pfi: MutPtr<Avifileinfow>, lsize: Int): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIFileInfoW(pfile.rawAddress.toString(), pfi.rawAddress.toString(), lsize) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileInit() {
    if (windowsWin32MediaMultimediaNapiAvailable) {
        wasmWindowssysWindowsWin32MediaMultimediaAVIFileInit()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun aVIFileOpenA(ppfile: MutPtr<MutPtr<CVoid>>, szfile: Pcstr, umode: UInt, lphandler: ConstPtr<Guid>): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIFileOpenA(ppfile.rawAddress.toString(), szfile.rawAddress.toString(), umode.toInt(), lphandler.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileOpenW(ppfile: MutPtr<MutPtr<CVoid>>, szfile: Pcwstr, umode: UInt, lphandler: ConstPtr<Guid>): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIFileOpenW(ppfile.rawAddress.toString(), szfile.rawAddress.toString(), umode.toInt(), lphandler.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileReadData(pfile: MutPtr<CVoid>, ckid: UInt, lpdata: MutPtr<CVoid>, lpcbdata: MutPtr<Int>): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIFileReadData(pfile.rawAddress.toString(), ckid.toInt(), lpdata.rawAddress.toString(), lpcbdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileRelease(pfile: MutPtr<CVoid>): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIFileRelease(pfile.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIFileWriteData(pfile: MutPtr<CVoid>, ckid: UInt, lpdata: ConstPtr<CVoid>, cbdata: Int): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIFileWriteData(pfile.rawAddress.toString(), ckid.toInt(), lpdata.rawAddress.toString(), cbdata) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIGetFromClipboard(lppf: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIGetFromClipboard(lppf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIMakeCompressedStream(ppscompressed: MutPtr<MutPtr<CVoid>>, ppssource: MutPtr<CVoid>, lpoptions: ConstPtr<Avicompressoptions>, pclsidhandler: ConstPtr<Guid>): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIMakeCompressedStream(ppscompressed.rawAddress.toString(), ppssource.rawAddress.toString(), lpoptions.rawAddress.toString(), pclsidhandler.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIMakeFileFromStreams(ppfile: MutPtr<MutPtr<CVoid>>, nstreams: Int, papstreams: ConstPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIMakeFileFromStreams(ppfile.rawAddress.toString(), nstreams, papstreams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIMakeStreamFromClipboard(cfformat: UInt, hglobal: Handle, ppstream: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIMakeStreamFromClipboard(cfformat.toInt(), hglobal.rawAddress.toString(), ppstream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIPutFileOnClipboard(pf: MutPtr<CVoid>): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIPutFileOnClipboard(pf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVISaveA(szfile: Pcstr, pclsidhandler: ConstPtr<Guid>, lpfncallback: Avisavecallback, nstreams: Int, pfile: MutPtr<CVoid>, lpoptions: ConstPtr<Avicompressoptions>, vararg variadicArgs: Long): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVISaveA(szfile.rawAddress.toString(), pclsidhandler.rawAddress.toString(), 0L.toString(), nstreams, pfile.rawAddress.toString(), lpoptions.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVISaveOptions(hwnd: Hwnd, uiflags: UInt, nstreams: Int, ppavi: ConstPtr<MutPtr<CVoid>>, plpoptions: MutPtr<MutPtr<Avicompressoptions>>): Long =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVISaveOptions(hwnd.rawAddress.toString(), uiflags.toInt(), nstreams, ppavi.rawAddress.toString(), plpoptions.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVISaveOptionsFree(nstreams: Int, plpoptions: ConstPtr<ConstPtr<Avicompressoptions>>): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVISaveOptionsFree(nstreams, plpoptions.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVISaveVA(szfile: Pcstr, pclsidhandler: ConstPtr<Guid>, lpfncallback: Avisavecallback, nstreams: Int, ppavi: ConstPtr<MutPtr<CVoid>>, plpoptions: ConstPtr<ConstPtr<Avicompressoptions>>): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVISaveVA(szfile.rawAddress.toString(), pclsidhandler.rawAddress.toString(), 0L.toString(), nstreams, ppavi.rawAddress.toString(), plpoptions.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVISaveVW(szfile: Pcwstr, pclsidhandler: ConstPtr<Guid>, lpfncallback: Avisavecallback, nstreams: Int, ppavi: ConstPtr<MutPtr<CVoid>>, plpoptions: ConstPtr<ConstPtr<Avicompressoptions>>): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVISaveVW(szfile.rawAddress.toString(), pclsidhandler.rawAddress.toString(), 0L.toString(), nstreams, ppavi.rawAddress.toString(), plpoptions.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVISaveW(szfile: Pcwstr, pclsidhandler: ConstPtr<Guid>, lpfncallback: Avisavecallback, nstreams: Int, pfile: MutPtr<CVoid>, lpoptions: ConstPtr<Avicompressoptions>, vararg variadicArgs: Long): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVISaveW(szfile.rawAddress.toString(), pclsidhandler.rawAddress.toString(), 0L.toString(), nstreams, pfile.rawAddress.toString(), lpoptions.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamAddRef(pavi: MutPtr<CVoid>): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIStreamAddRef(pavi.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamBeginStreaming(pavi: MutPtr<CVoid>, lstart: Int, lend: Int, lrate: Int): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIStreamBeginStreaming(pavi.rawAddress.toString(), lstart, lend, lrate) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamCreate(ppavi: MutPtr<MutPtr<CVoid>>, lparam1: Int, lparam2: Int, pclsidhandler: ConstPtr<Guid>): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIStreamCreate(ppavi.rawAddress.toString(), lparam1, lparam2, pclsidhandler.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamEndStreaming(pavi: MutPtr<CVoid>): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIStreamEndStreaming(pavi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamFindSample(pavi: MutPtr<CVoid>, lpos: Int, lflags: Int): Int =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIStreamFindSample(pavi.rawAddress.toString(), lpos, lflags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamGetFrame(pg: MutPtr<CVoid>, lpos: Int): MutPtr<CVoid> =
    if (windowsWin32MediaMultimediaNapiAvailable) MutPtr(wasmWindowssysWindowsWin32MediaMultimediaAVIStreamGetFrame(pg.rawAddress.toString(), lpos).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamGetFrameClose(pg: MutPtr<CVoid>): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIStreamGetFrameClose(pg.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamGetFrameOpen(pavi: MutPtr<CVoid>, lpbiwanted: ConstPtr<Bitmapinfoheader>): MutPtr<CVoid> =
    if (windowsWin32MediaMultimediaNapiAvailable) MutPtr(wasmWindowssysWindowsWin32MediaMultimediaAVIStreamGetFrameOpen(pavi.rawAddress.toString(), lpbiwanted.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamInfoA(pavi: MutPtr<CVoid>, psi: MutPtr<Avistreaminfoa>, lsize: Int): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIStreamInfoA(pavi.rawAddress.toString(), psi.rawAddress.toString(), lsize) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamInfoW(pavi: MutPtr<CVoid>, psi: MutPtr<Avistreaminfow>, lsize: Int): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIStreamInfoW(pavi.rawAddress.toString(), psi.rawAddress.toString(), lsize) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamLength(pavi: MutPtr<CVoid>): Int =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIStreamLength(pavi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamOpenFromFileA(ppavi: MutPtr<MutPtr<CVoid>>, szfile: Pcstr, fcctype: UInt, lparam: Int, mode: UInt, pclsidhandler: ConstPtr<Guid>): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIStreamOpenFromFileA(ppavi.rawAddress.toString(), szfile.rawAddress.toString(), fcctype.toInt(), lparam, mode.toInt(), pclsidhandler.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamOpenFromFileW(ppavi: MutPtr<MutPtr<CVoid>>, szfile: Pcwstr, fcctype: UInt, lparam: Int, mode: UInt, pclsidhandler: ConstPtr<Guid>): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIStreamOpenFromFileW(ppavi.rawAddress.toString(), szfile.rawAddress.toString(), fcctype.toInt(), lparam, mode.toInt(), pclsidhandler.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamRead(pavi: MutPtr<CVoid>, lstart: Int, lsamples: Int, lpbuffer: MutPtr<CVoid>, cbbuffer: Int, plbytes: MutPtr<Int>, plsamples: MutPtr<Int>): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIStreamRead(pavi.rawAddress.toString(), lstart, lsamples, lpbuffer.rawAddress.toString(), cbbuffer, plbytes.rawAddress.toString(), plsamples.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamReadData(pavi: MutPtr<CVoid>, fcc: UInt, lp: MutPtr<CVoid>, lpcb: MutPtr<Int>): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIStreamReadData(pavi.rawAddress.toString(), fcc.toInt(), lp.rawAddress.toString(), lpcb.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamReadFormat(pavi: MutPtr<CVoid>, lpos: Int, lpformat: MutPtr<CVoid>, lpcbformat: MutPtr<Int>): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIStreamReadFormat(pavi.rawAddress.toString(), lpos, lpformat.rawAddress.toString(), lpcbformat.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamRelease(pavi: MutPtr<CVoid>): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIStreamRelease(pavi.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamSampleToTime(pavi: MutPtr<CVoid>, lsample: Int): Int =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIStreamSampleToTime(pavi.rawAddress.toString(), lsample) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamSetFormat(pavi: MutPtr<CVoid>, lpos: Int, lpformat: ConstPtr<CVoid>, cbformat: Int): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIStreamSetFormat(pavi.rawAddress.toString(), lpos, lpformat.rawAddress.toString(), cbformat) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamStart(pavi: MutPtr<CVoid>): Int =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIStreamStart(pavi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamTimeToSample(pavi: MutPtr<CVoid>, ltime: Int): Int =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIStreamTimeToSample(pavi.rawAddress.toString(), ltime) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamWrite(pavi: MutPtr<CVoid>, lstart: Int, lsamples: Int, lpbuffer: ConstPtr<CVoid>, cbbuffer: Int, dwflags: UInt, plsampwritten: MutPtr<Int>, plbyteswritten: MutPtr<Int>): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIStreamWrite(pavi.rawAddress.toString(), lstart, lsamples, lpbuffer.rawAddress.toString(), cbbuffer, dwflags.toInt(), plsampwritten.rawAddress.toString(), plbyteswritten.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aVIStreamWriteData(pavi: MutPtr<CVoid>, fcc: UInt, lp: ConstPtr<CVoid>, cb: Int): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaAVIStreamWriteData(pavi.rawAddress.toString(), fcc.toInt(), lp.rawAddress.toString(), cb) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeDriver(hdriver: Hdrvr, lparam1: Lparam, lparam2: Lparam): Lresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaCloseDriver(hdriver.rawAddress.toString(), lparam1.toString(), lparam2.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEditableStream(ppseditable: MutPtr<MutPtr<CVoid>>, pssource: MutPtr<CVoid>): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaCreateEditableStream(ppseditable.rawAddress.toString(), pssource.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun defDriverProc(dwdriveridentifier: ULong, hdrvr: Hdrvr, umsg: UInt, lparam1: Lparam, lparam2: Lparam): Lresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaDefDriverProc(dwdriveridentifier.toString(), hdrvr.rawAddress.toString(), umsg.toInt(), lparam1.toString(), lparam2.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibBegin(hdd: Long, hdc: Hdc, dxdst: Int, dydst: Int, lpbi: ConstPtr<Bitmapinfoheader>, dxsrc: Int, dysrc: Int, wflags: UInt): Bool =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaDrawDibBegin(hdd.toString(), hdc.rawAddress.toString(), dxdst, dydst, lpbi.rawAddress.toString(), dxsrc, dysrc, wflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibChangePalette(hdd: Long, istart: Int, ilen: Int, lppe: ConstPtr<Paletteentry>): Bool =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaDrawDibChangePalette(hdd.toString(), istart, ilen, lppe.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibClose(hdd: Long): Bool =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaDrawDibClose(hdd.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibDraw(hdd: Long, hdc: Hdc, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: ConstPtr<Bitmapinfoheader>, lpbits: ConstPtr<CVoid>, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, wflags: UInt): Bool =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaDrawDibDraw(hdd.toString(), hdc.rawAddress.toString(), xdst, ydst, dxdst, dydst, lpbi.rawAddress.toString(), lpbits.rawAddress.toString(), xsrc, ysrc, dxsrc, dysrc, wflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibEnd(hdd: Long): Bool =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaDrawDibEnd(hdd.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibGetBuffer(hdd: Long, lpbi: MutPtr<Bitmapinfoheader>, dwsize: UInt, dwflags: UInt): MutPtr<CVoid> =
    if (windowsWin32MediaMultimediaNapiAvailable) MutPtr(wasmWindowssysWindowsWin32MediaMultimediaDrawDibGetBuffer(hdd.toString(), lpbi.rawAddress.toString(), dwsize.toInt(), dwflags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibGetPalette(hdd: Long): Hpalette =
    if (windowsWin32MediaMultimediaNapiAvailable) MutPtr(wasmWindowssysWindowsWin32MediaMultimediaDrawDibGetPalette(hdd.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibOpen(): Long =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaDrawDibOpen().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibProfileDisplay(lpbi: ConstPtr<Bitmapinfoheader>): Lresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaDrawDibProfileDisplay(lpbi.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibRealize(hdd: Long, hdc: Hdc, fbackground: Bool): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaDrawDibRealize(hdd.toString(), hdc.rawAddress.toString(), fbackground).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibSetPalette(hdd: Long, hpal: Hpalette): Bool =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaDrawDibSetPalette(hdd.toString(), hpal.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibStart(hdd: Long, rate: UInt): Bool =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaDrawDibStart(hdd.toString(), rate.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibStop(hdd: Long): Bool =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaDrawDibStop(hdd.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawDibTime(hdd: Long, lpddtime: MutPtr<Drawdibtime>): Bool =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaDrawDibTime(hdd.toString(), lpddtime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun driverCallback(dwcallback: ULong, dwflags: UInt, hdevice: Hdrvr, dwmsg: UInt, dwuser: ULong, dwparam1: ULong, dwparam2: ULong): Bool =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaDriverCallback(dwcallback.toString(), dwflags.toInt(), hdevice.rawAddress.toString(), dwmsg.toInt(), dwuser.toString(), dwparam1.toString(), dwparam2.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drvGetModuleHandle(hdriver: Hdrvr): Hmodule =
    if (windowsWin32MediaMultimediaNapiAvailable) MutPtr(wasmWindowssysWindowsWin32MediaMultimediaDrvGetModuleHandle(hdriver.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun editStreamClone(pavi: MutPtr<CVoid>, ppresult: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaEditStreamClone(pavi.rawAddress.toString(), ppresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun editStreamCopy(pavi: MutPtr<CVoid>, plstart: MutPtr<Int>, pllength: MutPtr<Int>, ppresult: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaEditStreamCopy(pavi.rawAddress.toString(), plstart.rawAddress.toString(), pllength.rawAddress.toString(), ppresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun editStreamCut(pavi: MutPtr<CVoid>, plstart: MutPtr<Int>, pllength: MutPtr<Int>, ppresult: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaEditStreamCut(pavi.rawAddress.toString(), plstart.rawAddress.toString(), pllength.rawAddress.toString(), ppresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun editStreamPaste(pavi: MutPtr<CVoid>, plpos: MutPtr<Int>, pllength: MutPtr<Int>, pstream: MutPtr<CVoid>, lstart: Int, lend: Int): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaEditStreamPaste(pavi.rawAddress.toString(), plpos.rawAddress.toString(), pllength.rawAddress.toString(), pstream.rawAddress.toString(), lstart, lend) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun editStreamSetInfoA(pavi: MutPtr<CVoid>, lpinfo: ConstPtr<Avistreaminfoa>, cbinfo: Int): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaEditStreamSetInfoA(pavi.rawAddress.toString(), lpinfo.rawAddress.toString(), cbinfo) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun editStreamSetInfoW(pavi: MutPtr<CVoid>, lpinfo: ConstPtr<Avistreaminfow>, cbinfo: Int): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaEditStreamSetInfoW(pavi.rawAddress.toString(), lpinfo.rawAddress.toString(), cbinfo) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun editStreamSetNameA(pavi: MutPtr<CVoid>, lpszname: Pcstr): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaEditStreamSetNameA(pavi.rawAddress.toString(), lpszname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun editStreamSetNameW(pavi: MutPtr<CVoid>, lpszname: Pcwstr): Hresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaEditStreamSetNameW(pavi.rawAddress.toString(), lpszname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDriverModuleHandle(hdriver: Hdrvr): Hmodule =
    if (windowsWin32MediaMultimediaNapiAvailable) MutPtr(wasmWindowssysWindowsWin32MediaMultimediaGetDriverModuleHandle(hdriver.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOpenFileNamePreviewA(lpofn: MutPtr<Openfilenamea>): Bool =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaGetOpenFileNamePreviewA(lpofn.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOpenFileNamePreviewW(lpofn: MutPtr<Openfilenamew>): Bool =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaGetOpenFileNamePreviewW(lpofn.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSaveFileNamePreviewA(lpofn: MutPtr<Openfilenamea>): Bool =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaGetSaveFileNamePreviewA(lpofn.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSaveFileNamePreviewW(lpofn: MutPtr<Openfilenamew>): Bool =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaGetSaveFileNamePreviewW(lpofn.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCClose(hic: Hic): Lresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaICClose(hic.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCCompress(hic: Hic, dwflags: UInt, lpbioutput: ConstPtr<Bitmapinfoheader>, lpdata: MutPtr<CVoid>, lpbiinput: ConstPtr<Bitmapinfoheader>, lpbits: ConstPtr<CVoid>, lpckid: MutPtr<UInt>, lpdwflags: MutPtr<UInt>, lframenum: Int, dwframesize: UInt, dwquality: UInt, lpbiprev: ConstPtr<Bitmapinfoheader>, lpprev: ConstPtr<CVoid>): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaICCompress(hic.rawAddress.toString(), dwflags.toInt(), lpbioutput.rawAddress.toString(), lpdata.rawAddress.toString(), lpbiinput.rawAddress.toString(), lpbits.rawAddress.toString(), lpckid.rawAddress.toString(), lpdwflags.rawAddress.toString(), lframenum, dwframesize.toInt(), dwquality.toInt(), lpbiprev.rawAddress.toString(), lpprev.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCCompressorChoose(hwnd: Hwnd, uiflags: UInt, pvin: ConstPtr<CVoid>, lpdata: ConstPtr<CVoid>, pc: MutPtr<Compvars>, lpsztitle: Pcstr): Bool =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaICCompressorChoose(hwnd.rawAddress.toString(), uiflags.toInt(), pvin.rawAddress.toString(), lpdata.rawAddress.toString(), pc.rawAddress.toString(), lpsztitle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCCompressorFree(pc: ConstPtr<Compvars>) {
    if (windowsWin32MediaMultimediaNapiAvailable) {
        wasmWindowssysWindowsWin32MediaMultimediaICCompressorFree(pc.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iCDecompress(hic: Hic, dwflags: UInt, lpbiformat: ConstPtr<Bitmapinfoheader>, lpdata: ConstPtr<CVoid>, lpbi: ConstPtr<Bitmapinfoheader>, lpbits: MutPtr<CVoid>): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaICDecompress(hic.rawAddress.toString(), dwflags.toInt(), lpbiformat.rawAddress.toString(), lpdata.rawAddress.toString(), lpbi.rawAddress.toString(), lpbits.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCDraw(hic: Hic, dwflags: UInt, lpformat: ConstPtr<CVoid>, lpdata: ConstPtr<CVoid>, cbdata: UInt, ltime: Int): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaICDraw(hic.rawAddress.toString(), dwflags.toInt(), lpformat.rawAddress.toString(), lpdata.rawAddress.toString(), cbdata.toInt(), ltime).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCDrawBegin(hic: Hic, dwflags: UInt, hpal: Hpalette, hwnd: Hwnd, hdc: Hdc, xdst: Int, ydst: Int, dxdst: Int, dydst: Int, lpbi: ConstPtr<Bitmapinfoheader>, xsrc: Int, ysrc: Int, dxsrc: Int, dysrc: Int, dwrate: UInt, dwscale: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaICDrawBegin(hic.rawAddress.toString(), dwflags.toInt(), hpal.rawAddress.toString(), hwnd.rawAddress.toString(), hdc.rawAddress.toString(), xdst, ydst, dxdst, dydst, lpbi.rawAddress.toString(), xsrc, ysrc, dxsrc, dysrc, dwrate.toInt(), dwscale.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCGetDisplayFormat(hic: Hic, lpbiin: ConstPtr<Bitmapinfoheader>, lpbiout: MutPtr<Bitmapinfoheader>, bitdepth: Int, dx: Int, dy: Int): Hic =
    if (windowsWin32MediaMultimediaNapiAvailable) MutPtr(wasmWindowssysWindowsWin32MediaMultimediaICGetDisplayFormat(hic.rawAddress.toString(), lpbiin.rawAddress.toString(), lpbiout.rawAddress.toString(), bitdepth, dx, dy).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCGetInfo(hic: Hic, picinfo: MutPtr<Icinfo>, cb: UInt): Lresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaICGetInfo(hic.rawAddress.toString(), picinfo.rawAddress.toString(), cb.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCImageCompress(hic: Hic, uiflags: UInt, lpbiin: ConstPtr<Bitmapinfo>, lpbits: ConstPtr<CVoid>, lpbiout: ConstPtr<Bitmapinfo>, lquality: Int, plsize: MutPtr<Int>): Handle =
    if (windowsWin32MediaMultimediaNapiAvailable) MutPtr(wasmWindowssysWindowsWin32MediaMultimediaICImageCompress(hic.rawAddress.toString(), uiflags.toInt(), lpbiin.rawAddress.toString(), lpbits.rawAddress.toString(), lpbiout.rawAddress.toString(), lquality, plsize.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCImageDecompress(hic: Hic, uiflags: UInt, lpbiin: ConstPtr<Bitmapinfo>, lpbits: ConstPtr<CVoid>, lpbiout: ConstPtr<Bitmapinfo>): Handle =
    if (windowsWin32MediaMultimediaNapiAvailable) MutPtr(wasmWindowssysWindowsWin32MediaMultimediaICImageDecompress(hic.rawAddress.toString(), uiflags.toInt(), lpbiin.rawAddress.toString(), lpbits.rawAddress.toString(), lpbiout.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCInfo(fcctype: UInt, fcchandler: UInt, lpicinfo: MutPtr<Icinfo>): Bool =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaICInfo(fcctype.toInt(), fcchandler.toInt(), lpicinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCInstall(fcctype: UInt, fcchandler: UInt, lparam: Lparam, szdesc: Pcstr, wflags: UInt): Bool =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaICInstall(fcctype.toInt(), fcchandler.toInt(), lparam.toString(), szdesc.rawAddress.toString(), wflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCLocate(fcctype: UInt, fcchandler: UInt, lpbiin: ConstPtr<Bitmapinfoheader>, lpbiout: ConstPtr<Bitmapinfoheader>, wflags: UShort): Hic =
    if (windowsWin32MediaMultimediaNapiAvailable) MutPtr(wasmWindowssysWindowsWin32MediaMultimediaICLocate(fcctype.toInt(), fcchandler.toInt(), lpbiin.rawAddress.toString(), lpbiout.rawAddress.toString(), wflags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCOpen(fcctype: UInt, fcchandler: UInt, wmode: UInt): Hic =
    if (windowsWin32MediaMultimediaNapiAvailable) MutPtr(wasmWindowssysWindowsWin32MediaMultimediaICOpen(fcctype.toInt(), fcchandler.toInt(), wmode.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCOpenFunction(fcctype: UInt, fcchandler: UInt, wmode: UInt, lpfnhandler: Farproc): Hic =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCRemove(fcctype: UInt, fcchandler: UInt, wflags: UInt): Bool =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaICRemove(fcctype.toInt(), fcchandler.toInt(), wflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCSendMessage(hic: Hic, msg: UInt, dw1: ULong, dw2: ULong): Lresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaICSendMessage(hic.rawAddress.toString(), msg.toInt(), dw1.toString(), dw2.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCSeqCompressFrame(pc: ConstPtr<Compvars>, uiflags: UInt, lpbits: ConstPtr<CVoid>, pfkey: MutPtr<Bool>, plsize: MutPtr<Int>): MutPtr<CVoid> =
    if (windowsWin32MediaMultimediaNapiAvailable) MutPtr(wasmWindowssysWindowsWin32MediaMultimediaICSeqCompressFrame(pc.rawAddress.toString(), uiflags.toInt(), lpbits.rawAddress.toString(), pfkey.rawAddress.toString(), plsize.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iCSeqCompressFrameEnd(pc: ConstPtr<Compvars>) {
    if (windowsWin32MediaMultimediaNapiAvailable) {
        wasmWindowssysWindowsWin32MediaMultimediaICSeqCompressFrameEnd(pc.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iCSeqCompressFrameStart(pc: ConstPtr<Compvars>, lpbiin: ConstPtr<Bitmapinfo>): Bool =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaICSeqCompressFrameStart(pc.rawAddress.toString(), lpbiin.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mCIWndCreateA(hwndparent: Hwnd, hinstance: Hinstance, dwstyle: UInt, szfile: Pcstr): Hwnd =
    if (windowsWin32MediaMultimediaNapiAvailable) MutPtr(wasmWindowssysWindowsWin32MediaMultimediaMCIWndCreateA(hwndparent.rawAddress.toString(), hinstance.rawAddress.toString(), dwstyle.toInt(), szfile.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mCIWndCreateW(hwndparent: Hwnd, hinstance: Hinstance, dwstyle: UInt, szfile: Pcwstr): Hwnd =
    if (windowsWin32MediaMultimediaNapiAvailable) MutPtr(wasmWindowssysWindowsWin32MediaMultimediaMCIWndCreateW(hwndparent.rawAddress.toString(), hinstance.rawAddress.toString(), dwstyle.toInt(), szfile.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mCIWndRegisterClass(): Bool =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMCIWndRegisterClass() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openDriver(szdrivername: Pcwstr, szsectionname: Pcwstr, lparam2: Lparam): Hdrvr =
    if (windowsWin32MediaMultimediaNapiAvailable) MutPtr(wasmWindowssysWindowsWin32MediaMultimediaOpenDriver(szdrivername.rawAddress.toString(), szsectionname.rawAddress.toString(), lparam2.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendDriverMessage(hdriver: Hdrvr, message: UInt, lparam1: Lparam, lparam2: Lparam): Lresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaSendDriverMessage(hdriver.rawAddress.toString(), message.toInt(), lparam1.toString(), lparam2.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun videoForWindowsVersion(): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaVideoForWindowsVersion().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capCreateCaptureWindowA(lpszwindowname: Pcstr, dwstyle: UInt, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, nid: Int): Hwnd =
    if (windowsWin32MediaMultimediaNapiAvailable) MutPtr(wasmWindowssysWindowsWin32MediaMultimediaCapCreateCaptureWindowA(lpszwindowname.rawAddress.toString(), dwstyle.toInt(), x, y, nwidth, nheight, hwndparent.rawAddress.toString(), nid).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capCreateCaptureWindowW(lpszwindowname: Pcwstr, dwstyle: UInt, x: Int, y: Int, nwidth: Int, nheight: Int, hwndparent: Hwnd, nid: Int): Hwnd =
    if (windowsWin32MediaMultimediaNapiAvailable) MutPtr(wasmWindowssysWindowsWin32MediaMultimediaCapCreateCaptureWindowW(lpszwindowname.rawAddress.toString(), dwstyle.toInt(), x, y, nwidth, nheight, hwndparent.rawAddress.toString(), nid).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capGetDriverDescriptionA(wdriverindex: UInt, lpszname: Pstr, cbname: Int, lpszver: Pstr, cbver: Int): Bool =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaCapGetDriverDescriptionA(wdriverindex.toInt(), lpszname.rawAddress.toString(), cbname, lpszver.rawAddress.toString(), cbver) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun capGetDriverDescriptionW(wdriverindex: UInt, lpszname: Pwstr, cbname: Int, lpszver: Pwstr, cbver: Int): Bool =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaCapGetDriverDescriptionW(wdriverindex.toInt(), lpszname.rawAddress.toString(), cbname, lpszver.rawAddress.toString(), cbver) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joyGetDevCapsA(ujoyid: ULong, pjc: MutPtr<Joycapsa>, cbjc: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaJoyGetDevCapsA(ujoyid.toString(), pjc.rawAddress.toString(), cbjc.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joyGetDevCapsW(ujoyid: ULong, pjc: MutPtr<Joycapsw>, cbjc: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaJoyGetDevCapsW(ujoyid.toString(), pjc.rawAddress.toString(), cbjc.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joyGetNumDevs(): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaJoyGetNumDevs().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joyGetPos(ujoyid: UInt, pji: MutPtr<Joyinfo>): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaJoyGetPos(ujoyid.toInt(), pji.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joyGetPosEx(ujoyid: UInt, pji: MutPtr<Joyinfoex>): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaJoyGetPosEx(ujoyid.toInt(), pji.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joyGetThreshold(ujoyid: UInt, puthreshold: MutPtr<UInt>): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaJoyGetThreshold(ujoyid.toInt(), puthreshold.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joyReleaseCapture(ujoyid: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaJoyReleaseCapture(ujoyid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joySetCapture(hwnd: Hwnd, ujoyid: UInt, uperiod: UInt, fchanged: Bool): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaJoySetCapture(hwnd.rawAddress.toString(), ujoyid.toInt(), uperiod.toInt(), fchanged).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun joySetThreshold(ujoyid: UInt, uthreshold: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaJoySetThreshold(ujoyid.toInt(), uthreshold.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciDriverNotify(hwndcallback: Handle, wdeviceid: UInt, ustatus: UInt): Bool =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMciDriverNotify(hwndcallback.rawAddress.toString(), wdeviceid.toInt(), ustatus.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciDriverYield(wdeviceid: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMciDriverYield(wdeviceid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciFreeCommandResource(wtable: UInt): Bool =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMciFreeCommandResource(wtable.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciGetCreatorTask(mciid: UInt): Htask =
    if (windowsWin32MediaMultimediaNapiAvailable) MutPtr(wasmWindowssysWindowsWin32MediaMultimediaMciGetCreatorTask(mciid.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciGetDeviceIDA(pszdevice: Pcstr): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMciGetDeviceIDA(pszdevice.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciGetDeviceIDFromElementIDA(dwelementid: UInt, lpstrtype: Pcstr): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMciGetDeviceIDFromElementIDA(dwelementid.toInt(), lpstrtype.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciGetDeviceIDFromElementIDW(dwelementid: UInt, lpstrtype: Pcwstr): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMciGetDeviceIDFromElementIDW(dwelementid.toInt(), lpstrtype.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciGetDeviceIDW(pszdevice: Pcwstr): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMciGetDeviceIDW(pszdevice.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciGetDriverData(wdeviceid: UInt): ULong =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMciGetDriverData(wdeviceid.toInt()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciGetErrorStringA(mcierr: UInt, psztext: Pstr, cchtext: UInt): Bool =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMciGetErrorStringA(mcierr.toInt(), psztext.rawAddress.toString(), cchtext.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciGetErrorStringW(mcierr: UInt, psztext: Pwstr, cchtext: UInt): Bool =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMciGetErrorStringW(mcierr.toInt(), psztext.rawAddress.toString(), cchtext.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciGetYieldProc(mciid: UInt, pdwyielddata: ConstPtr<UInt>): Yieldproc =
    if (windowsWin32MediaMultimediaNapiAvailable) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciLoadCommandResource(hinstance: Handle, lpresname: Pcwstr, wtype: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMciLoadCommandResource(hinstance.rawAddress.toString(), lpresname.rawAddress.toString(), wtype.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciSendCommandA(mciid: UInt, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMciSendCommandA(mciid.toInt(), umsg.toInt(), dwparam1.toString(), dwparam2.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciSendCommandW(mciid: UInt, umsg: UInt, dwparam1: ULong, dwparam2: ULong): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMciSendCommandW(mciid.toInt(), umsg.toInt(), dwparam1.toString(), dwparam2.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciSendStringA(lpstrcommand: Pcstr, lpstrreturnstring: Pstr, ureturnlength: UInt, hwndcallback: Hwnd): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMciSendStringA(lpstrcommand.rawAddress.toString(), lpstrreturnstring.rawAddress.toString(), ureturnlength.toInt(), hwndcallback.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciSendStringW(lpstrcommand: Pcwstr, lpstrreturnstring: Pwstr, ureturnlength: UInt, hwndcallback: Hwnd): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMciSendStringW(lpstrcommand.rawAddress.toString(), lpstrreturnstring.rawAddress.toString(), ureturnlength.toInt(), hwndcallback.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciSetDriverData(wdeviceid: UInt, dwdata: ULong): Bool =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMciSetDriverData(wdeviceid.toInt(), dwdata.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mciSetYieldProc(mciid: UInt, fpyieldproc: Yieldproc, dwyielddata: UInt): Bool =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMciSetYieldProc(mciid.toInt(), 0L.toString(), dwyielddata.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmDrvInstall(hdriver: Hdrvr, wszdrventry: Pcwstr, drvmessage: Drivermsgproc, wflags: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMmDrvInstall(hdriver.rawAddress.toString(), wszdrventry.rawAddress.toString(), 0L.toString(), wflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmGetCurrentTask(): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMmGetCurrentTask().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmTaskBlock(h: UInt) {
    if (windowsWin32MediaMultimediaNapiAvailable) {
        wasmWindowssysWindowsWin32MediaMultimediaMmTaskBlock(h.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmTaskCreate(lpfn: Lptaskcallback, lph: MutPtr<Handle>, dwinst: ULong): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMmTaskCreate(0L.toString(), lph.rawAddress.toString(), dwinst.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmTaskSignal(h: UInt): Bool =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMmTaskSignal(h.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmTaskYield() {
    if (windowsWin32MediaMultimediaNapiAvailable) {
        wasmWindowssysWindowsWin32MediaMultimediaMmTaskYield()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmioAdvance(hmmio: Hmmio, pmmioinfo: ConstPtr<Mmioinfo>, fuadvance: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMmioAdvance(hmmio.rawAddress.toString(), pmmioinfo.rawAddress.toString(), fuadvance.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioAscend(hmmio: Hmmio, pmmcki: ConstPtr<Mmckinfo>, fuascend: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMmioAscend(hmmio.rawAddress.toString(), pmmcki.rawAddress.toString(), fuascend.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioClose(hmmio: Hmmio, fuclose: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMmioClose(hmmio.rawAddress.toString(), fuclose.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioCreateChunk(hmmio: Hmmio, pmmcki: ConstPtr<Mmckinfo>, fucreate: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMmioCreateChunk(hmmio.rawAddress.toString(), pmmcki.rawAddress.toString(), fucreate.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioDescend(hmmio: Hmmio, pmmcki: MutPtr<Mmckinfo>, pmmckiparent: ConstPtr<Mmckinfo>, fudescend: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMmioDescend(hmmio.rawAddress.toString(), pmmcki.rawAddress.toString(), pmmckiparent.rawAddress.toString(), fudescend.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioFlush(hmmio: Hmmio, fuflush: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMmioFlush(hmmio.rawAddress.toString(), fuflush.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioGetInfo(hmmio: Hmmio, pmmioinfo: MutPtr<Mmioinfo>, fuinfo: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMmioGetInfo(hmmio.rawAddress.toString(), pmmioinfo.rawAddress.toString(), fuinfo.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioInstallIOProcA(fccioproc: UInt, pioproc: Lpmmioproc, dwflags: UInt): Lpmmioproc =
    if (windowsWin32MediaMultimediaNapiAvailable) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioInstallIOProcW(fccioproc: UInt, pioproc: Lpmmioproc, dwflags: UInt): Lpmmioproc =
    if (windowsWin32MediaMultimediaNapiAvailable) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioOpenA(pszfilename: Pstr, pmmioinfo: MutPtr<Mmioinfo>, fdwopen: UInt): Hmmio =
    if (windowsWin32MediaMultimediaNapiAvailable) MutPtr(wasmWindowssysWindowsWin32MediaMultimediaMmioOpenA(pszfilename.rawAddress.toString(), pmmioinfo.rawAddress.toString(), fdwopen.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioOpenW(pszfilename: Pwstr, pmmioinfo: MutPtr<Mmioinfo>, fdwopen: UInt): Hmmio =
    if (windowsWin32MediaMultimediaNapiAvailable) MutPtr(wasmWindowssysWindowsWin32MediaMultimediaMmioOpenW(pszfilename.rawAddress.toString(), pmmioinfo.rawAddress.toString(), fdwopen.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioRead(hmmio: Hmmio, pch: MutPtr<Byte>, cch: Int): Int =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMmioRead(hmmio.rawAddress.toString(), pch.rawAddress.toString(), cch) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioRenameA(pszfilename: Pcstr, psznewfilename: Pcstr, pmmioinfo: ConstPtr<Mmioinfo>, fdwrename: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMmioRenameA(pszfilename.rawAddress.toString(), psznewfilename.rawAddress.toString(), pmmioinfo.rawAddress.toString(), fdwrename.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioRenameW(pszfilename: Pcwstr, psznewfilename: Pcwstr, pmmioinfo: ConstPtr<Mmioinfo>, fdwrename: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMmioRenameW(pszfilename.rawAddress.toString(), psznewfilename.rawAddress.toString(), pmmioinfo.rawAddress.toString(), fdwrename.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioSeek(hmmio: Hmmio, loffset: Int, iorigin: Int): Int =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMmioSeek(hmmio.rawAddress.toString(), loffset, iorigin) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioSendMessage(hmmio: Hmmio, umsg: UInt, lparam1: Lparam, lparam2: Lparam): Lresult =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMmioSendMessage(hmmio.rawAddress.toString(), umsg.toInt(), lparam1.toString(), lparam2.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioSetBuffer(hmmio: Hmmio, pchbuffer: Pstr, cchbuffer: Int, fubuffer: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMmioSetBuffer(hmmio.rawAddress.toString(), pchbuffer.rawAddress.toString(), cchbuffer, fubuffer.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioSetInfo(hmmio: Hmmio, pmmioinfo: ConstPtr<Mmioinfo>, fuinfo: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMmioSetInfo(hmmio.rawAddress.toString(), pmmioinfo.rawAddress.toString(), fuinfo.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioStringToFOURCCA(sz: Pcstr, uflags: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMmioStringToFOURCCA(sz.rawAddress.toString(), uflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioStringToFOURCCW(sz: Pcwstr, uflags: UInt): UInt =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMmioStringToFOURCCW(sz.rawAddress.toString(), uflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmioWrite(hmmio: Hmmio, pch: Pcstr, cch: Int): Int =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaMmioWrite(hmmio.rawAddress.toString(), pch.rawAddress.toString(), cch) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sndOpenSound(eventname: Pcwstr, appname: Pcwstr, flags: Int, filehandle: MutPtr<Handle>): Int =
    if (windowsWin32MediaMultimediaNapiAvailable) wasmWindowssysWindowsWin32MediaMultimediaSndOpenSound(eventname.rawAddress.toString(), appname.rawAddress.toString(), flags, filehandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
