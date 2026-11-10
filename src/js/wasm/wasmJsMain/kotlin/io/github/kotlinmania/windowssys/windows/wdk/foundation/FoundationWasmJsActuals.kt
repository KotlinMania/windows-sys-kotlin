@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.wdk.foundation

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWdkFoundationNapiAddon(): Boolean

private val _windowsWdkFoundationNapiAvailable: Boolean = _initWindowsWdkFoundationNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_foundation_ntClose(p0)")
private external fun _wasm_windowssys_windows_wdk_foundation_ntClose(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_foundation_ntQueryObject(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_foundation_ntQueryObject(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

public actual fun ntClose(handle: Handle): Ntstatus =
    if (_windowsWdkFoundationNapiAvailable) _wasm_windowssys_windows_wdk_foundation_ntClose((handle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryObject(handle: Handle, objectinformationclass: ObjectInformationClass, objectinformation: COpaquePointer?, objectinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkFoundationNapiAvailable) _wasm_windowssys_windows_wdk_foundation_ntQueryObject((handle?.value ?: 0L).toString(), objectinformationclass, (objectinformation?.value ?: 0L).toString(), objectinformationlength.toInt(), (returnlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
