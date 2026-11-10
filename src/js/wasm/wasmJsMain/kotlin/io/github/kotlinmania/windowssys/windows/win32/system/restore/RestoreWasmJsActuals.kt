@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.restore

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SystemRestoreNapiAddon(): Boolean

private val _windowsWin32SystemRestoreNapiAvailable: Boolean = _initWindowsWin32SystemRestoreNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_restore_sRRemoveRestorePoint(p0)")
private external fun _wasm_windowssys_windows_win32_system_restore_sRRemoveRestorePoint(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_restore_sRSetRestorePointA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_restore_sRSetRestorePointA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_restore_sRSetRestorePointW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_restore_sRSetRestorePointW(p0: String, p1: String): Int

public actual fun sRRemoveRestorePoint(dwrpnum: UInt): UInt =
    if (_windowsWin32SystemRestoreNapiAvailable) _wasm_windowssys_windows_win32_system_restore_sRRemoveRestorePoint(dwrpnum.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sRSetRestorePointA(prestoreptspec: COpaquePointer?, psmgrstatus: COpaquePointer?): Bool =
    if (_windowsWin32SystemRestoreNapiAvailable) _wasm_windowssys_windows_win32_system_restore_sRSetRestorePointA((prestoreptspec?.value ?: 0L).toString(), (psmgrstatus?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sRSetRestorePointW(prestoreptspec: COpaquePointer?, psmgrstatus: COpaquePointer?): Bool =
    if (_windowsWin32SystemRestoreNapiAvailable) _wasm_windowssys_windows_win32_system_restore_sRSetRestorePointW((prestoreptspec?.value ?: 0L).toString(), (psmgrstatus?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
