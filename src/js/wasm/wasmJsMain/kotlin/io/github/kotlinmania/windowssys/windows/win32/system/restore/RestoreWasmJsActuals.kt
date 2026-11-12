@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.restore

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemRestoreNapiAddon(): Boolean

private val windowsWin32SystemRestoreNapiAvailable: Boolean = initWindowsWin32SystemRestoreNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRestoreSRRemoveRestorePoint(p0)")
private external fun wasmWindowssysWindowsWin32SystemRestoreSRRemoveRestorePoint(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRestoreSRSetRestorePointA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRestoreSRSetRestorePointA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRestoreSRSetRestorePointW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRestoreSRSetRestorePointW(p0: String, p1: String): Int

public actual fun sRRemoveRestorePoint(dwrpnum: UInt): UInt =
    if (windowsWin32SystemRestoreNapiAvailable) wasmWindowssysWindowsWin32SystemRestoreSRRemoveRestorePoint(dwrpnum.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sRSetRestorePointA(prestoreptspec: ConstPtr<Restorepointinfoa>, psmgrstatus: MutPtr<Statemgrstatus>): Bool =
    if (windowsWin32SystemRestoreNapiAvailable) wasmWindowssysWindowsWin32SystemRestoreSRSetRestorePointA(prestoreptspec.rawAddress.toString(), psmgrstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sRSetRestorePointW(prestoreptspec: ConstPtr<Restorepointinfow>, psmgrstatus: MutPtr<Statemgrstatus>): Bool =
    if (windowsWin32SystemRestoreNapiAvailable) wasmWindowssysWindowsWin32SystemRestoreSRSetRestorePointW(prestoreptspec.rawAddress.toString(), psmgrstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
