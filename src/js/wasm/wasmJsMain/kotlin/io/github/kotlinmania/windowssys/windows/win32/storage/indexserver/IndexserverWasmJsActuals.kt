@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.indexserver

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32StorageIndexserverNapiAddon(): Boolean

private val _windowsWin32StorageIndexserverNapiAvailable: Boolean = _initWindowsWin32StorageIndexserverNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_indexserver_bindIFilterFromStorage(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_indexserver_bindIFilterFromStorage(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_indexserver_bindIFilterFromStream(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_indexserver_bindIFilterFromStream(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_indexserver_loadIFilter(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_indexserver_loadIFilter(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_indexserver_loadIFilterEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_indexserver_loadIFilterEx(p0: String, p1: Int, p2: String, p3: String): Int

public actual fun bindIFilterFromStorage(pstg: COpaquePointer?, punkouter: COpaquePointer?, ppiunk: COpaquePointer?): Hresult =
    if (_windowsWin32StorageIndexserverNapiAvailable) _wasm_windowssys_windows_win32_storage_indexserver_bindIFilterFromStorage((pstg?.value ?: 0L).toString(), (punkouter?.value ?: 0L).toString(), (ppiunk?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bindIFilterFromStream(pstm: COpaquePointer?, punkouter: COpaquePointer?, ppiunk: COpaquePointer?): Hresult =
    if (_windowsWin32StorageIndexserverNapiAvailable) _wasm_windowssys_windows_win32_storage_indexserver_bindIFilterFromStream((pstm?.value ?: 0L).toString(), (punkouter?.value ?: 0L).toString(), (ppiunk?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadIFilter(pwcspath: Pcwstr, punkouter: COpaquePointer?, ppiunk: COpaquePointer?): Hresult =
    if (_windowsWin32StorageIndexserverNapiAvailable) _wasm_windowssys_windows_win32_storage_indexserver_loadIFilter((pwcspath?.value ?: 0L).toString(), (punkouter?.value ?: 0L).toString(), (ppiunk?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadIFilterEx(pwcspath: Pcwstr, dwflags: UInt, riid: COpaquePointer?, ppiunk: COpaquePointer?): Hresult =
    if (_windowsWin32StorageIndexserverNapiAvailable) _wasm_windowssys_windows_win32_storage_indexserver_loadIFilterEx((pwcspath?.value ?: 0L).toString(), dwflags.toInt(), (riid?.value ?: 0L).toString(), (ppiunk?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
