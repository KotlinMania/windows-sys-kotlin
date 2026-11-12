@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.com.marshal

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hglobal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hpalette
import io.github.kotlinmania.windowssys.windows.win32.system.com.Safearray
import io.github.kotlinmania.windowssys.windows.win32.system.com.Stgmedium
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Haccel
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hmenu

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemComMarshalNapiAddon(): Boolean

private val windowsWin32SystemComMarshalNapiAvailable: Boolean = initWindowsWin32SystemComMarshalNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalBstrUserFree(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalBstrUserFree(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalBstrUserFree64(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalBstrUserFree64(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalBstrUserMarshal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalBstrUserMarshal(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalBstrUserMarshal64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalBstrUserMarshal64(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalBstrUserSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalBstrUserSize(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalBstrUserSize64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalBstrUserSize64(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalBstrUserUnmarshal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalBstrUserUnmarshal(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalBstrUserUnmarshal64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalBstrUserUnmarshal64(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalClipformatUserFree(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalClipformatUserFree(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalClipformatUserFree64(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalClipformatUserFree64(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalClipformatUserMarshal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalClipformatUserMarshal(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalClipformatUserMarshal64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalClipformatUserMarshal64(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalClipformatUserSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalClipformatUserSize(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalClipformatUserSize64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalClipformatUserSize64(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalClipformatUserUnmarshal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalClipformatUserUnmarshal(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalClipformatUserUnmarshal64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalClipformatUserUnmarshal64(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalCoGetMarshalSizeMax(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalCoGetMarshalSizeMax(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalCoGetStandardMarshal(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalCoGetStandardMarshal(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalCoGetStdMarshalEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalCoGetStdMarshalEx(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalCoMarshalHresult(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalCoMarshalHresult(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalCoMarshalInterThreadInterfaceInStream(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalCoMarshalInterThreadInterfaceInStream(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalCoMarshalInterface(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalCoMarshalInterface(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalCoReleaseMarshalData(p0)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalCoReleaseMarshalData(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalCoUnmarshalHresult(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalCoUnmarshalHresult(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalCoUnmarshalInterface(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalCoUnmarshalInterface(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHaccelUserFree(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHaccelUserFree(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHaccelUserFree64(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHaccelUserFree64(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHaccelUserMarshal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHaccelUserMarshal(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHaccelUserMarshal64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHaccelUserMarshal64(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHaccelUserSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHaccelUserSize(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHaccelUserSize64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHaccelUserSize64(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHaccelUserUnmarshal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHaccelUserUnmarshal(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHaccelUserUnmarshal64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHaccelUserUnmarshal64(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHbitmapUserFree(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHbitmapUserFree(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHbitmapUserFree64(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHbitmapUserFree64(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHbitmapUserMarshal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHbitmapUserMarshal(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHbitmapUserMarshal64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHbitmapUserMarshal64(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHbitmapUserSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHbitmapUserSize(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHbitmapUserSize64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHbitmapUserSize64(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHbitmapUserUnmarshal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHbitmapUserUnmarshal(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHbitmapUserUnmarshal64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHbitmapUserUnmarshal64(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHdcUserFree(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHdcUserFree(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHdcUserFree64(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHdcUserFree64(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHdcUserMarshal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHdcUserMarshal(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHdcUserMarshal64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHdcUserMarshal64(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHdcUserSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHdcUserSize(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHdcUserSize64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHdcUserSize64(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHdcUserUnmarshal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHdcUserUnmarshal(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHdcUserUnmarshal64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHdcUserUnmarshal64(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHglobalUserFree(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHglobalUserFree(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHglobalUserFree64(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHglobalUserFree64(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHglobalUserMarshal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHglobalUserMarshal(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHglobalUserMarshal64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHglobalUserMarshal64(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHglobalUserSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHglobalUserSize(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHglobalUserSize64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHglobalUserSize64(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHglobalUserUnmarshal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHglobalUserUnmarshal(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHglobalUserUnmarshal64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHglobalUserUnmarshal64(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHiconUserFree(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHiconUserFree(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHiconUserFree64(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHiconUserFree64(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHiconUserMarshal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHiconUserMarshal(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHiconUserMarshal64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHiconUserMarshal64(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHiconUserSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHiconUserSize(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHiconUserSize64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHiconUserSize64(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHiconUserUnmarshal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHiconUserUnmarshal(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHiconUserUnmarshal64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHiconUserUnmarshal64(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHmenuUserFree(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHmenuUserFree(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHmenuUserFree64(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHmenuUserFree64(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHmenuUserMarshal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHmenuUserMarshal(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHmenuUserMarshal64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHmenuUserMarshal64(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHmenuUserSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHmenuUserSize(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHmenuUserSize64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHmenuUserSize64(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHmenuUserUnmarshal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHmenuUserUnmarshal(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHmenuUserUnmarshal64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHmenuUserUnmarshal64(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHpaletteUserFree(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHpaletteUserFree(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHpaletteUserFree64(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHpaletteUserFree64(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHpaletteUserMarshal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHpaletteUserMarshal(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHpaletteUserMarshal64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHpaletteUserMarshal64(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHpaletteUserSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHpaletteUserSize(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHpaletteUserSize64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHpaletteUserSize64(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHpaletteUserUnmarshal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHpaletteUserUnmarshal(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHpaletteUserUnmarshal64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHpaletteUserUnmarshal64(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHwndUserFree(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHwndUserFree(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHwndUserFree64(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHwndUserFree64(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHwndUserMarshal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHwndUserMarshal(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHwndUserMarshal64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHwndUserMarshal64(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHwndUserSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHwndUserSize(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHwndUserSize64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHwndUserSize64(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHwndUserUnmarshal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHwndUserUnmarshal(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalHwndUserUnmarshal64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalHwndUserUnmarshal64(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalLpsafearrayUserFree(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalLpsafearrayUserFree(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalLpsafearrayUserFree64(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalLpsafearrayUserFree64(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalLpsafearrayUserMarshal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalLpsafearrayUserMarshal(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalLpsafearrayUserMarshal64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalLpsafearrayUserMarshal64(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalLpsafearrayUserSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalLpsafearrayUserSize(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalLpsafearrayUserSize64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalLpsafearrayUserSize64(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalLpsafearrayUserUnmarshal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalLpsafearrayUserUnmarshal(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalLpsafearrayUserUnmarshal64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalLpsafearrayUserUnmarshal64(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalSnbUserFree(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalSnbUserFree(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalSnbUserFree64(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalSnbUserFree64(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalSnbUserMarshal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalSnbUserMarshal(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalSnbUserMarshal64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalSnbUserMarshal64(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalSnbUserSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalSnbUserSize(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalSnbUserSize64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalSnbUserSize64(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalSnbUserUnmarshal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalSnbUserUnmarshal(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalSnbUserUnmarshal64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalSnbUserUnmarshal64(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalStgmediumUserFree(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalStgmediumUserFree(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalStgmediumUserFree64(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalStgmediumUserFree64(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalStgmediumUserMarshal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalStgmediumUserMarshal(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalStgmediumUserMarshal64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalStgmediumUserMarshal64(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalStgmediumUserSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalStgmediumUserSize(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalStgmediumUserSize64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalStgmediumUserSize64(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalStgmediumUserUnmarshal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalStgmediumUserUnmarshal(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMarshalStgmediumUserUnmarshal64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMarshalStgmediumUserUnmarshal64(p0: String, p1: String, p2: String): String

public actual fun bstrUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Bstr>) {
    if (windowsWin32SystemComMarshalNapiAvailable) {
        wasmWindowssysWindowsWin32SystemComMarshalBstrUserFree(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun bstrUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Bstr>) {
    if (windowsWin32SystemComMarshalNapiAvailable) {
        wasmWindowssysWindowsWin32SystemComMarshalBstrUserFree64(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun bstrUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Bstr>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalBstrUserMarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bstrUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Bstr>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalBstrUserMarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bstrUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Bstr>): UInt =
    if (windowsWin32SystemComMarshalNapiAvailable) wasmWindowssysWindowsWin32SystemComMarshalBstrUserSize(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bstrUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Bstr>): UInt =
    if (windowsWin32SystemComMarshalNapiAvailable) wasmWindowssysWindowsWin32SystemComMarshalBstrUserSize64(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bstrUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Bstr>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalBstrUserUnmarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bstrUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Bstr>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalBstrUserUnmarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clipformatUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<UShort>) {
    if (windowsWin32SystemComMarshalNapiAvailable) {
        wasmWindowssysWindowsWin32SystemComMarshalClipformatUserFree(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun clipformatUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<UShort>) {
    if (windowsWin32SystemComMarshalNapiAvailable) {
        wasmWindowssysWindowsWin32SystemComMarshalClipformatUserFree64(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun clipformatUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<UShort>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalClipformatUserMarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clipformatUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<UShort>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalClipformatUserMarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clipformatUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<UShort>): UInt =
    if (windowsWin32SystemComMarshalNapiAvailable) wasmWindowssysWindowsWin32SystemComMarshalClipformatUserSize(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clipformatUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<UShort>): UInt =
    if (windowsWin32SystemComMarshalNapiAvailable) wasmWindowssysWindowsWin32SystemComMarshalClipformatUserSize64(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clipformatUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<UShort>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalClipformatUserUnmarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clipformatUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<UShort>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalClipformatUserUnmarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetMarshalSizeMax(pulsize: MutPtr<UInt>, riid: ConstPtr<Guid>, punk: MutPtr<CVoid>, dwdestcontext: UInt, pvdestcontext: ConstPtr<CVoid>, mshlflags: UInt): Hresult =
    if (windowsWin32SystemComMarshalNapiAvailable) wasmWindowssysWindowsWin32SystemComMarshalCoGetMarshalSizeMax(pulsize.rawAddress.toString(), riid.rawAddress.toString(), punk.rawAddress.toString(), dwdestcontext.toInt(), pvdestcontext.rawAddress.toString(), mshlflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetStandardMarshal(riid: ConstPtr<Guid>, punk: MutPtr<CVoid>, dwdestcontext: UInt, pvdestcontext: ConstPtr<CVoid>, mshlflags: UInt, ppmarshal: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComMarshalNapiAvailable) wasmWindowssysWindowsWin32SystemComMarshalCoGetStandardMarshal(riid.rawAddress.toString(), punk.rawAddress.toString(), dwdestcontext.toInt(), pvdestcontext.rawAddress.toString(), mshlflags.toInt(), ppmarshal.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetStdMarshalEx(punkouter: MutPtr<CVoid>, smexflags: UInt, ppunkinner: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComMarshalNapiAvailable) wasmWindowssysWindowsWin32SystemComMarshalCoGetStdMarshalEx(punkouter.rawAddress.toString(), smexflags.toInt(), ppunkinner.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coMarshalHresult(pstm: MutPtr<CVoid>, hresult: Hresult): Hresult =
    if (windowsWin32SystemComMarshalNapiAvailable) wasmWindowssysWindowsWin32SystemComMarshalCoMarshalHresult(pstm.rawAddress.toString(), hresult) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coMarshalInterThreadInterfaceInStream(riid: ConstPtr<Guid>, punk: MutPtr<CVoid>, ppstm: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComMarshalNapiAvailable) wasmWindowssysWindowsWin32SystemComMarshalCoMarshalInterThreadInterfaceInStream(riid.rawAddress.toString(), punk.rawAddress.toString(), ppstm.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coMarshalInterface(pstm: MutPtr<CVoid>, riid: ConstPtr<Guid>, punk: MutPtr<CVoid>, dwdestcontext: UInt, pvdestcontext: ConstPtr<CVoid>, mshlflags: UInt): Hresult =
    if (windowsWin32SystemComMarshalNapiAvailable) wasmWindowssysWindowsWin32SystemComMarshalCoMarshalInterface(pstm.rawAddress.toString(), riid.rawAddress.toString(), punk.rawAddress.toString(), dwdestcontext.toInt(), pvdestcontext.rawAddress.toString(), mshlflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coReleaseMarshalData(pstm: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemComMarshalNapiAvailable) wasmWindowssysWindowsWin32SystemComMarshalCoReleaseMarshalData(pstm.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coUnmarshalHresult(pstm: MutPtr<CVoid>, phresult: MutPtr<Hresult>): Hresult =
    if (windowsWin32SystemComMarshalNapiAvailable) wasmWindowssysWindowsWin32SystemComMarshalCoUnmarshalHresult(pstm.rawAddress.toString(), phresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coUnmarshalInterface(pstm: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComMarshalNapiAvailable) wasmWindowssysWindowsWin32SystemComMarshalCoUnmarshalInterface(pstm.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun haccelUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Haccel>) {
    if (windowsWin32SystemComMarshalNapiAvailable) {
        wasmWindowssysWindowsWin32SystemComMarshalHaccelUserFree(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun haccelUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Haccel>) {
    if (windowsWin32SystemComMarshalNapiAvailable) {
        wasmWindowssysWindowsWin32SystemComMarshalHaccelUserFree64(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun haccelUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Haccel>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalHaccelUserMarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun haccelUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Haccel>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalHaccelUserMarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun haccelUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Haccel>): UInt =
    if (windowsWin32SystemComMarshalNapiAvailable) wasmWindowssysWindowsWin32SystemComMarshalHaccelUserSize(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun haccelUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Haccel>): UInt =
    if (windowsWin32SystemComMarshalNapiAvailable) wasmWindowssysWindowsWin32SystemComMarshalHaccelUserSize64(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun haccelUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Haccel>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalHaccelUserUnmarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun haccelUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Haccel>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalHaccelUserUnmarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hbitmapUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hbitmap>) {
    if (windowsWin32SystemComMarshalNapiAvailable) {
        wasmWindowssysWindowsWin32SystemComMarshalHbitmapUserFree(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hbitmapUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hbitmap>) {
    if (windowsWin32SystemComMarshalNapiAvailable) {
        wasmWindowssysWindowsWin32SystemComMarshalHbitmapUserFree64(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hbitmapUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hbitmap>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalHbitmapUserMarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hbitmapUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hbitmap>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalHbitmapUserMarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hbitmapUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hbitmap>): UInt =
    if (windowsWin32SystemComMarshalNapiAvailable) wasmWindowssysWindowsWin32SystemComMarshalHbitmapUserSize(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hbitmapUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hbitmap>): UInt =
    if (windowsWin32SystemComMarshalNapiAvailable) wasmWindowssysWindowsWin32SystemComMarshalHbitmapUserSize64(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hbitmapUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hbitmap>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalHbitmapUserUnmarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hbitmapUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hbitmap>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalHbitmapUserUnmarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdcUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hdc>) {
    if (windowsWin32SystemComMarshalNapiAvailable) {
        wasmWindowssysWindowsWin32SystemComMarshalHdcUserFree(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hdcUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hdc>) {
    if (windowsWin32SystemComMarshalNapiAvailable) {
        wasmWindowssysWindowsWin32SystemComMarshalHdcUserFree64(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hdcUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hdc>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalHdcUserMarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdcUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hdc>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalHdcUserMarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdcUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hdc>): UInt =
    if (windowsWin32SystemComMarshalNapiAvailable) wasmWindowssysWindowsWin32SystemComMarshalHdcUserSize(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdcUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hdc>): UInt =
    if (windowsWin32SystemComMarshalNapiAvailable) wasmWindowssysWindowsWin32SystemComMarshalHdcUserSize64(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdcUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hdc>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalHdcUserUnmarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdcUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hdc>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalHdcUserUnmarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hglobalUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hglobal>) {
    if (windowsWin32SystemComMarshalNapiAvailable) {
        wasmWindowssysWindowsWin32SystemComMarshalHglobalUserFree(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hglobalUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hglobal>) {
    if (windowsWin32SystemComMarshalNapiAvailable) {
        wasmWindowssysWindowsWin32SystemComMarshalHglobalUserFree64(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hglobalUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hglobal>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalHglobalUserMarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hglobalUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hglobal>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalHglobalUserMarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hglobalUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hglobal>): UInt =
    if (windowsWin32SystemComMarshalNapiAvailable) wasmWindowssysWindowsWin32SystemComMarshalHglobalUserSize(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hglobalUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hglobal>): UInt =
    if (windowsWin32SystemComMarshalNapiAvailable) wasmWindowssysWindowsWin32SystemComMarshalHglobalUserSize64(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hglobalUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hglobal>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalHglobalUserUnmarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hglobalUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hglobal>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalHglobalUserUnmarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hiconUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hicon>) {
    if (windowsWin32SystemComMarshalNapiAvailable) {
        wasmWindowssysWindowsWin32SystemComMarshalHiconUserFree(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hiconUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hicon>) {
    if (windowsWin32SystemComMarshalNapiAvailable) {
        wasmWindowssysWindowsWin32SystemComMarshalHiconUserFree64(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hiconUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hicon>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalHiconUserMarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hiconUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hicon>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalHiconUserMarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hiconUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hicon>): UInt =
    if (windowsWin32SystemComMarshalNapiAvailable) wasmWindowssysWindowsWin32SystemComMarshalHiconUserSize(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hiconUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hicon>): UInt =
    if (windowsWin32SystemComMarshalNapiAvailable) wasmWindowssysWindowsWin32SystemComMarshalHiconUserSize64(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hiconUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hicon>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalHiconUserUnmarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hiconUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hicon>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalHiconUserUnmarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hmenuUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hmenu>) {
    if (windowsWin32SystemComMarshalNapiAvailable) {
        wasmWindowssysWindowsWin32SystemComMarshalHmenuUserFree(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hmenuUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hmenu>) {
    if (windowsWin32SystemComMarshalNapiAvailable) {
        wasmWindowssysWindowsWin32SystemComMarshalHmenuUserFree64(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hmenuUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hmenu>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalHmenuUserMarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hmenuUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hmenu>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalHmenuUserMarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hmenuUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hmenu>): UInt =
    if (windowsWin32SystemComMarshalNapiAvailable) wasmWindowssysWindowsWin32SystemComMarshalHmenuUserSize(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hmenuUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hmenu>): UInt =
    if (windowsWin32SystemComMarshalNapiAvailable) wasmWindowssysWindowsWin32SystemComMarshalHmenuUserSize64(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hmenuUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hmenu>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalHmenuUserUnmarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hmenuUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hmenu>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalHmenuUserUnmarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hpaletteUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hpalette>) {
    if (windowsWin32SystemComMarshalNapiAvailable) {
        wasmWindowssysWindowsWin32SystemComMarshalHpaletteUserFree(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hpaletteUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hpalette>) {
    if (windowsWin32SystemComMarshalNapiAvailable) {
        wasmWindowssysWindowsWin32SystemComMarshalHpaletteUserFree64(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hpaletteUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hpalette>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalHpaletteUserMarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hpaletteUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hpalette>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalHpaletteUserMarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hpaletteUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hpalette>): UInt =
    if (windowsWin32SystemComMarshalNapiAvailable) wasmWindowssysWindowsWin32SystemComMarshalHpaletteUserSize(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hpaletteUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hpalette>): UInt =
    if (windowsWin32SystemComMarshalNapiAvailable) wasmWindowssysWindowsWin32SystemComMarshalHpaletteUserSize64(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hpaletteUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hpalette>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalHpaletteUserUnmarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hpaletteUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hpalette>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalHpaletteUserUnmarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hwndUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hwnd>) {
    if (windowsWin32SystemComMarshalNapiAvailable) {
        wasmWindowssysWindowsWin32SystemComMarshalHwndUserFree(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hwndUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hwnd>) {
    if (windowsWin32SystemComMarshalNapiAvailable) {
        wasmWindowssysWindowsWin32SystemComMarshalHwndUserFree64(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hwndUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hwnd>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalHwndUserMarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hwndUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hwnd>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalHwndUserMarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hwndUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hwnd>): UInt =
    if (windowsWin32SystemComMarshalNapiAvailable) wasmWindowssysWindowsWin32SystemComMarshalHwndUserSize(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hwndUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hwnd>): UInt =
    if (windowsWin32SystemComMarshalNapiAvailable) wasmWindowssysWindowsWin32SystemComMarshalHwndUserSize64(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hwndUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hwnd>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalHwndUserUnmarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hwndUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hwnd>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalHwndUserUnmarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lpsafearrayUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<ConstPtr<Safearray>>) {
    if (windowsWin32SystemComMarshalNapiAvailable) {
        wasmWindowssysWindowsWin32SystemComMarshalLpsafearrayUserFree(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun lpsafearrayUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<ConstPtr<Safearray>>) {
    if (windowsWin32SystemComMarshalNapiAvailable) {
        wasmWindowssysWindowsWin32SystemComMarshalLpsafearrayUserFree64(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun lpsafearrayUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<ConstPtr<Safearray>>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalLpsafearrayUserMarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lpsafearrayUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<ConstPtr<Safearray>>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalLpsafearrayUserMarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lpsafearrayUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<ConstPtr<Safearray>>): UInt =
    if (windowsWin32SystemComMarshalNapiAvailable) wasmWindowssysWindowsWin32SystemComMarshalLpsafearrayUserSize(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lpsafearrayUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<ConstPtr<Safearray>>): UInt =
    if (windowsWin32SystemComMarshalNapiAvailable) wasmWindowssysWindowsWin32SystemComMarshalLpsafearrayUserSize64(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lpsafearrayUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<MutPtr<Safearray>>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalLpsafearrayUserUnmarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lpsafearrayUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<MutPtr<Safearray>>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalLpsafearrayUserUnmarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snbUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<ConstPtr<ConstPtr<UShort>>>) {
    if (windowsWin32SystemComMarshalNapiAvailable) {
        wasmWindowssysWindowsWin32SystemComMarshalSnbUserFree(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun snbUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<ConstPtr<ConstPtr<UShort>>>) {
    if (windowsWin32SystemComMarshalNapiAvailable) {
        wasmWindowssysWindowsWin32SystemComMarshalSnbUserFree64(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun snbUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<ConstPtr<ConstPtr<UShort>>>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalSnbUserMarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snbUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<ConstPtr<ConstPtr<UShort>>>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalSnbUserMarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snbUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<ConstPtr<ConstPtr<UShort>>>): UInt =
    if (windowsWin32SystemComMarshalNapiAvailable) wasmWindowssysWindowsWin32SystemComMarshalSnbUserSize(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snbUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<ConstPtr<ConstPtr<UShort>>>): UInt =
    if (windowsWin32SystemComMarshalNapiAvailable) wasmWindowssysWindowsWin32SystemComMarshalSnbUserSize64(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snbUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<MutPtr<MutPtr<UShort>>>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalSnbUserUnmarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snbUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<MutPtr<MutPtr<UShort>>>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalSnbUserUnmarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgmediumUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Stgmedium>) {
    if (windowsWin32SystemComMarshalNapiAvailable) {
        wasmWindowssysWindowsWin32SystemComMarshalStgmediumUserFree(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun stgmediumUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Stgmedium>) {
    if (windowsWin32SystemComMarshalNapiAvailable) {
        wasmWindowssysWindowsWin32SystemComMarshalStgmediumUserFree64(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun stgmediumUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Stgmedium>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalStgmediumUserMarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgmediumUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Stgmedium>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalStgmediumUserMarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgmediumUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Stgmedium>): UInt =
    if (windowsWin32SystemComMarshalNapiAvailable) wasmWindowssysWindowsWin32SystemComMarshalStgmediumUserSize(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgmediumUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Stgmedium>): UInt =
    if (windowsWin32SystemComMarshalNapiAvailable) wasmWindowssysWindowsWin32SystemComMarshalStgmediumUserSize64(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgmediumUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Stgmedium>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalStgmediumUserUnmarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgmediumUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Stgmedium>): MutPtr<UByte> =
    if (windowsWin32SystemComMarshalNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComMarshalStgmediumUserUnmarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")
