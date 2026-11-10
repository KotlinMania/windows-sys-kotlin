@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.filehistory

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32StorageFilehistoryNapiAddon(): Boolean

private val _windowsWin32StorageFilehistoryNapiAvailable: Boolean = _initWindowsWin32StorageFilehistoryNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filehistory_fhServiceBlockBackup(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filehistory_fhServiceBlockBackup(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filehistory_fhServiceClosePipe(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filehistory_fhServiceClosePipe(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filehistory_fhServiceOpenPipe(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filehistory_fhServiceOpenPipe(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filehistory_fhServiceReloadConfiguration(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filehistory_fhServiceReloadConfiguration(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filehistory_fhServiceStartBackup(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filehistory_fhServiceStartBackup(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filehistory_fhServiceStopBackup(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_filehistory_fhServiceStopBackup(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_filehistory_fhServiceUnblockBackup(p0)")
private external fun _wasm_windowssys_windows_win32_storage_filehistory_fhServiceUnblockBackup(p0: String): Int

public actual fun fhServiceBlockBackup(pipe: FhServicePipeHandle): Hresult =
    if (_windowsWin32StorageFilehistoryNapiAvailable) _wasm_windowssys_windows_win32_storage_filehistory_fhServiceBlockBackup((pipe?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fhServiceClosePipe(pipe: FhServicePipeHandle): Hresult =
    if (_windowsWin32StorageFilehistoryNapiAvailable) _wasm_windowssys_windows_win32_storage_filehistory_fhServiceClosePipe((pipe?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fhServiceOpenPipe(startserviceifstopped: Bool, pipe: COpaquePointer?): Hresult =
    if (_windowsWin32StorageFilehistoryNapiAvailable) _wasm_windowssys_windows_win32_storage_filehistory_fhServiceOpenPipe(startserviceifstopped, (pipe?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fhServiceReloadConfiguration(pipe: FhServicePipeHandle): Hresult =
    if (_windowsWin32StorageFilehistoryNapiAvailable) _wasm_windowssys_windows_win32_storage_filehistory_fhServiceReloadConfiguration((pipe?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fhServiceStartBackup(pipe: FhServicePipeHandle, lowpriorityio: Bool): Hresult =
    if (_windowsWin32StorageFilehistoryNapiAvailable) _wasm_windowssys_windows_win32_storage_filehistory_fhServiceStartBackup((pipe?.value ?: 0L).toString(), lowpriorityio) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fhServiceStopBackup(pipe: FhServicePipeHandle, stoptracking: Bool): Hresult =
    if (_windowsWin32StorageFilehistoryNapiAvailable) _wasm_windowssys_windows_win32_storage_filehistory_fhServiceStopBackup((pipe?.value ?: 0L).toString(), stoptracking) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fhServiceUnblockBackup(pipe: FhServicePipeHandle): Hresult =
    if (_windowsWin32StorageFilehistoryNapiAvailable) _wasm_windowssys_windows_win32_storage_filehistory_fhServiceUnblockBackup((pipe?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
