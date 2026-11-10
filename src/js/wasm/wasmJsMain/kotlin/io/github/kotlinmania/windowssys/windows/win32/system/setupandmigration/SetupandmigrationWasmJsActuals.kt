@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.setupandmigration

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SystemSetupandmigrationNapiAddon(): Boolean

private val _windowsWin32SystemSetupandmigrationNapiAvailable: Boolean = _initWindowsWin32SystemSetupandmigrationNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_setupandmigration_oOBEComplete(p0)")
private external fun _wasm_windowssys_windows_win32_system_setupandmigration_oOBEComplete(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_setupandmigration_registerWaitUntilOOBECompleted(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_setupandmigration_registerWaitUntilOOBECompleted(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_setupandmigration_unregisterWaitUntilOOBECompleted(p0)")
private external fun _wasm_windowssys_windows_win32_system_setupandmigration_unregisterWaitUntilOOBECompleted(p0: String): Int

public actual fun oOBEComplete(isoobecomplete: COpaquePointer?): Bool =
    if (_windowsWin32SystemSetupandmigrationNapiAvailable) _wasm_windowssys_windows_win32_system_setupandmigration_oOBEComplete((isoobecomplete?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerWaitUntilOOBECompleted(oobecompletedcallback: OobeCompletedCallback, callbackcontext: COpaquePointer?, waithandle: COpaquePointer?): Bool =
    if (_windowsWin32SystemSetupandmigrationNapiAvailable) _wasm_windowssys_windows_win32_system_setupandmigration_registerWaitUntilOOBECompleted(0L.toString(), (callbackcontext?.value ?: 0L).toString(), (waithandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterWaitUntilOOBECompleted(waithandle: COpaquePointer?): Bool =
    if (_windowsWin32SystemSetupandmigrationNapiAvailable) _wasm_windowssys_windows_win32_system_setupandmigration_unregisterWaitUntilOOBECompleted((waithandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
