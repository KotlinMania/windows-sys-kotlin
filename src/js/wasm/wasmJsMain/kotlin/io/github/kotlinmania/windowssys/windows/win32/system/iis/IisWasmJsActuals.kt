@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.iis

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemIisNapiAddon(): Boolean

private val windowsWin32SystemIisNapiAvailable: Boolean = initWindowsWin32SystemIisNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemIisGetExtensionVersion(p0)")
private external fun wasmWindowssysWindowsWin32SystemIisGetExtensionVersion(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemIisGetFilterVersion(p0)")
private external fun wasmWindowssysWindowsWin32SystemIisGetFilterVersion(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemIisHttpExtensionProc(p0)")
private external fun wasmWindowssysWindowsWin32SystemIisHttpExtensionProc(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemIisHttpFilterProc(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemIisHttpFilterProc(p0: String, p1: Int, p2: String): Int

public actual fun getExtensionVersion(pver: MutPtr): Bool =
    if (windowsWin32SystemIisNapiAvailable) wasmWindowssysWindowsWin32SystemIisGetExtensionVersion(pver.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFilterVersion(pver: MutPtr): Bool =
    if (windowsWin32SystemIisNapiAvailable) wasmWindowssysWindowsWin32SystemIisGetFilterVersion(pver.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpExtensionProc(pecb: ConstPtr): UInt =
    if (windowsWin32SystemIisNapiAvailable) wasmWindowssysWindowsWin32SystemIisHttpExtensionProc(pecb.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpFilterProc(pfc: MutPtr, notificationtype: UInt, pvnotification: MutPtr): UInt =
    if (windowsWin32SystemIisNapiAvailable) wasmWindowssysWindowsWin32SystemIisHttpFilterProc(pfc.rawAddress.toString(), notificationtype.toInt(), pvnotification.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
