@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.systeminformation

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWdkSystemSysteminformationNapiAddon(): Boolean

private val _windowsWdkSystemSysteminformationNapiAvailable: Boolean = _initWindowsWdkSystemSysteminformationNapiAddon()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systeminformation_ntQuerySystemInformation(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systeminformation_ntQuerySystemInformation(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systeminformation_ntQuerySystemTime(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systeminformation_ntQuerySystemTime(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systeminformation_ntQueryTimerResolution(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systeminformation_ntQueryTimerResolution(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systeminformation_zwQuerySystemInformation(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systeminformation_zwQuerySystemInformation(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systeminformation_zwQuerySystemTime(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systeminformation_zwQuerySystemTime(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systeminformation_zwQueryTimerResolution(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systeminformation_zwQueryTimerResolution(p0: String, p1: String, p2: String): Int

public actual fun ntQuerySystemInformation(systeminformationclass: SystemInformationClass, systeminformation: COpaquePointer?, systeminformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSysteminformationNapiAvailable) _wasm_windowssys_windows_wdk_system_systeminformation_ntQuerySystemInformation(systeminformationclass, (systeminformation?.value ?: 0L).toString(), systeminformationlength.toInt(), (returnlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQuerySystemTime(systemtime: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSysteminformationNapiAvailable) _wasm_windowssys_windows_wdk_system_systeminformation_ntQuerySystemTime((systemtime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryTimerResolution(maximumtime: COpaquePointer?, minimumtime: COpaquePointer?, currenttime: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSysteminformationNapiAvailable) _wasm_windowssys_windows_wdk_system_systeminformation_ntQueryTimerResolution((maximumtime?.value ?: 0L).toString(), (minimumtime?.value ?: 0L).toString(), (currenttime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQuerySystemInformation(systeminformationclass: SystemInformationClass, systeminformation: COpaquePointer?, systeminformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSysteminformationNapiAvailable) _wasm_windowssys_windows_wdk_system_systeminformation_zwQuerySystemInformation(systeminformationclass, (systeminformation?.value ?: 0L).toString(), systeminformationlength.toInt(), (returnlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQuerySystemTime(systemtime: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSysteminformationNapiAvailable) _wasm_windowssys_windows_wdk_system_systeminformation_zwQuerySystemTime((systemtime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryTimerResolution(maximumtime: COpaquePointer?, minimumtime: COpaquePointer?, currenttime: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSysteminformationNapiAvailable) _wasm_windowssys_windows_wdk_system_systeminformation_zwQueryTimerResolution((maximumtime?.value ?: 0L).toString(), (minimumtime?.value ?: 0L).toString(), (currenttime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
