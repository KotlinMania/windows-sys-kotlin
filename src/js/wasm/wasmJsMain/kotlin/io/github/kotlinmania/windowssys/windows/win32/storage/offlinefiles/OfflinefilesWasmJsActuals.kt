@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.offlinefiles

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32StorageOfflinefilesNapiAddon(): Boolean

private val _windowsWin32StorageOfflinefilesNapiAvailable: Boolean = _initWindowsWin32StorageOfflinefilesNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_offlinefiles_offlineFilesEnable(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_offlinefiles_offlineFilesEnable(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_offlinefiles_offlineFilesQueryStatus(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_offlinefiles_offlineFilesQueryStatus(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_offlinefiles_offlineFilesQueryStatusEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_offlinefiles_offlineFilesQueryStatusEx(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_offlinefiles_offlineFilesStart()")
private external fun _wasm_windowssys_windows_win32_storage_offlinefiles_offlineFilesStart(): Int

public actual fun offlineFilesEnable(benable: Bool, pbrebootrequired: COpaquePointer?): UInt =
    if (_windowsWin32StorageOfflinefilesNapiAvailable) _wasm_windowssys_windows_win32_storage_offlinefiles_offlineFilesEnable(benable, (pbrebootrequired?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun offlineFilesQueryStatus(pbactive: COpaquePointer?, pbenabled: COpaquePointer?): UInt =
    if (_windowsWin32StorageOfflinefilesNapiAvailable) _wasm_windowssys_windows_win32_storage_offlinefiles_offlineFilesQueryStatus((pbactive?.value ?: 0L).toString(), (pbenabled?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun offlineFilesQueryStatusEx(pbactive: COpaquePointer?, pbenabled: COpaquePointer?, pbavailable: COpaquePointer?): UInt =
    if (_windowsWin32StorageOfflinefilesNapiAvailable) _wasm_windowssys_windows_win32_storage_offlinefiles_offlineFilesQueryStatusEx((pbactive?.value ?: 0L).toString(), (pbenabled?.value ?: 0L).toString(), (pbavailable?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun offlineFilesStart(): UInt =
    if (_windowsWin32StorageOfflinefilesNapiAvailable) _wasm_windowssys_windows_win32_storage_offlinefiles_offlineFilesStart().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
