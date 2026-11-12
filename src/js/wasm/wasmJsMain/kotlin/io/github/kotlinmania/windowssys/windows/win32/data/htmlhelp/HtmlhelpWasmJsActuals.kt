@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.data.htmlhelp

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32DataHtmlhelpNapiAddon(): Boolean

private val windowsWin32DataHtmlhelpNapiAvailable: Boolean = initWindowsWin32DataHtmlhelpNapiAddon()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataHtmlhelpHtmlHelpA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DataHtmlhelpHtmlHelpA(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataHtmlhelpHtmlHelpW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DataHtmlhelpHtmlHelpW(p0: String, p1: String, p2: Int, p3: String): String

public actual fun htmlHelpA(hwndcaller: Hwnd, pszfile: Pcstr, ucommand: UInt, dwdata: ULong): Hwnd =
    if (windowsWin32DataHtmlhelpNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DataHtmlhelpHtmlHelpA(hwndcaller.rawAddress.toString(), pszfile.rawAddress.toString(), ucommand.toInt(), dwdata.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun htmlHelpW(hwndcaller: Hwnd, pszfile: Pcwstr, ucommand: UInt, dwdata: ULong): Hwnd =
    if (windowsWin32DataHtmlhelpNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DataHtmlhelpHtmlHelpW(hwndcaller.rawAddress.toString(), pszfile.rawAddress.toString(), ucommand.toInt(), dwdata.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")
