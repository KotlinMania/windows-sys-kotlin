@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.correlationvector

import io.github.kotlinmania.windowssys.COpaquePointer

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SystemCorrelationvectorNapiAddon(): Boolean

private val _windowsWin32SystemCorrelationvectorNapiAvailable: Boolean = _initWindowsWin32SystemCorrelationvectorNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_correlationvector_rtlExtendCorrelationVector(p0)")
private external fun _wasm_windowssys_windows_win32_system_correlationvector_rtlExtendCorrelationVector(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_correlationvector_rtlIncrementCorrelationVector(p0)")
private external fun _wasm_windowssys_windows_win32_system_correlationvector_rtlIncrementCorrelationVector(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_correlationvector_rtlInitializeCorrelationVector(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_correlationvector_rtlInitializeCorrelationVector(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_correlationvector_rtlValidateCorrelationVector(p0)")
private external fun _wasm_windowssys_windows_win32_system_correlationvector_rtlValidateCorrelationVector(p0: String): Int

public actual fun rtlExtendCorrelationVector(correlationvector: COpaquePointer?): UInt =
    if (_windowsWin32SystemCorrelationvectorNapiAvailable) _wasm_windowssys_windows_win32_system_correlationvector_rtlExtendCorrelationVector((correlationvector?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIncrementCorrelationVector(correlationvector: COpaquePointer?): UInt =
    if (_windowsWin32SystemCorrelationvectorNapiAvailable) _wasm_windowssys_windows_win32_system_correlationvector_rtlIncrementCorrelationVector((correlationvector?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitializeCorrelationVector(correlationvector: COpaquePointer?, version: Int, guid: COpaquePointer?): UInt =
    if (_windowsWin32SystemCorrelationvectorNapiAvailable) _wasm_windowssys_windows_win32_system_correlationvector_rtlInitializeCorrelationVector((correlationvector?.value ?: 0L).toString(), version, (guid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlValidateCorrelationVector(vector: COpaquePointer?): UInt =
    if (_windowsWin32SystemCorrelationvectorNapiAvailable) _wasm_windowssys_windows_win32_system_correlationvector_rtlValidateCorrelationVector((vector?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
