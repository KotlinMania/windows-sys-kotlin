@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.filehistory

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult

private val _windowsWin32StorageFilehistoryNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun fhServiceBlockBackup(pipe: FhServicePipeHandle): Hresult =
    if (_windowsWin32StorageFilehistoryNapiAddon != null) (_windowsWin32StorageFilehistoryNapiAddon.windowssys_windows_win32_storage_filehistory_fhServiceBlockBackup((pipe?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fhServiceClosePipe(pipe: FhServicePipeHandle): Hresult =
    if (_windowsWin32StorageFilehistoryNapiAddon != null) (_windowsWin32StorageFilehistoryNapiAddon.windowssys_windows_win32_storage_filehistory_fhServiceClosePipe((pipe?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fhServiceOpenPipe(startserviceifstopped: Bool, pipe: COpaquePointer?): Hresult =
    if (_windowsWin32StorageFilehistoryNapiAddon != null) (_windowsWin32StorageFilehistoryNapiAddon.windowssys_windows_win32_storage_filehistory_fhServiceOpenPipe(startserviceifstopped, (pipe?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fhServiceReloadConfiguration(pipe: FhServicePipeHandle): Hresult =
    if (_windowsWin32StorageFilehistoryNapiAddon != null) (_windowsWin32StorageFilehistoryNapiAddon.windowssys_windows_win32_storage_filehistory_fhServiceReloadConfiguration((pipe?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fhServiceStartBackup(pipe: FhServicePipeHandle, lowpriorityio: Bool): Hresult =
    if (_windowsWin32StorageFilehistoryNapiAddon != null) (_windowsWin32StorageFilehistoryNapiAddon.windowssys_windows_win32_storage_filehistory_fhServiceStartBackup((pipe?.value ?: 0L).toString(), lowpriorityio) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fhServiceStopBackup(pipe: FhServicePipeHandle, stoptracking: Bool): Hresult =
    if (_windowsWin32StorageFilehistoryNapiAddon != null) (_windowsWin32StorageFilehistoryNapiAddon.windowssys_windows_win32_storage_filehistory_fhServiceStopBackup((pipe?.value ?: 0L).toString(), stoptracking) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fhServiceUnblockBackup(pipe: FhServicePipeHandle): Hresult =
    if (_windowsWin32StorageFilehistoryNapiAddon != null) (_windowsWin32StorageFilehistoryNapiAddon.windowssys_windows_win32_storage_filehistory_fhServiceUnblockBackup((pipe?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
