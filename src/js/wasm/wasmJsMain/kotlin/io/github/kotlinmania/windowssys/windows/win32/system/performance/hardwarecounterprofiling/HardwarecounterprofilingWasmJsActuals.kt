@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.performance.hardwarecounterprofiling

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SystemPerformanceHardwarecounterprofilingNapiAddon(): Boolean

private val _windowsWin32SystemPerformanceHardwarecounterprofilingNapiAvailable: Boolean = _initWindowsWin32SystemPerformanceHardwarecounterprofilingNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_hardwarecounterprofiling_disableThreadProfiling(p0)")
private external fun _wasm_windowssys_windows_win32_system_performance_hardwarecounterprofiling_disableThreadProfiling(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_hardwarecounterprofiling_enableThreadProfiling(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_hardwarecounterprofiling_enableThreadProfiling(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_hardwarecounterprofiling_queryThreadProfiling(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_performance_hardwarecounterprofiling_queryThreadProfiling(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_hardwarecounterprofiling_readThreadProfilingData(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_performance_hardwarecounterprofiling_readThreadProfilingData(p0: String, p1: Int, p2: String): Int

public actual fun disableThreadProfiling(performancedatahandle: Handle): UInt =
    if (_windowsWin32SystemPerformanceHardwarecounterprofilingNapiAvailable) _wasm_windowssys_windows_win32_system_performance_hardwarecounterprofiling_disableThreadProfiling((performancedatahandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableThreadProfiling(threadhandle: Handle, flags: UInt, hardwarecounters: ULong, performancedatahandle: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceHardwarecounterprofilingNapiAvailable) _wasm_windowssys_windows_win32_system_performance_hardwarecounterprofiling_enableThreadProfiling((threadhandle?.value ?: 0L).toString(), flags.toInt(), hardwarecounters.toString(), (performancedatahandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryThreadProfiling(threadhandle: Handle, enabled: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceHardwarecounterprofilingNapiAvailable) _wasm_windowssys_windows_win32_system_performance_hardwarecounterprofiling_queryThreadProfiling((threadhandle?.value ?: 0L).toString(), (enabled?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readThreadProfilingData(performancedatahandle: Handle, flags: UInt, performancedata: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceHardwarecounterprofilingNapiAvailable) _wasm_windowssys_windows_win32_system_performance_hardwarecounterprofiling_readThreadProfilingData((performancedatahandle?.value ?: 0L).toString(), flags.toInt(), (performancedata?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
