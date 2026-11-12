@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.filehistory

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32StorageFilehistoryNapiAddon(): Boolean

private val windowsWin32StorageFilehistoryNapiAvailable: Boolean = initWindowsWin32StorageFilehistoryNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilehistoryFhServiceBlockBackup(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilehistoryFhServiceBlockBackup(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilehistoryFhServiceClosePipe(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilehistoryFhServiceClosePipe(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilehistoryFhServiceOpenPipe(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilehistoryFhServiceOpenPipe(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilehistoryFhServiceReloadConfiguration(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilehistoryFhServiceReloadConfiguration(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilehistoryFhServiceStartBackup(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilehistoryFhServiceStartBackup(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilehistoryFhServiceStopBackup(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageFilehistoryFhServiceStopBackup(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageFilehistoryFhServiceUnblockBackup(p0)")
private external fun wasmWindowssysWindowsWin32StorageFilehistoryFhServiceUnblockBackup(p0: String): Int

public actual fun fhServiceBlockBackup(pipe: FhServicePipeHandle): Hresult =
    if (windowsWin32StorageFilehistoryNapiAvailable) wasmWindowssysWindowsWin32StorageFilehistoryFhServiceBlockBackup(pipe.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fhServiceClosePipe(pipe: FhServicePipeHandle): Hresult =
    if (windowsWin32StorageFilehistoryNapiAvailable) wasmWindowssysWindowsWin32StorageFilehistoryFhServiceClosePipe(pipe.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fhServiceOpenPipe(startserviceifstopped: Bool, pipe: MutPtr): Hresult =
    if (windowsWin32StorageFilehistoryNapiAvailable) wasmWindowssysWindowsWin32StorageFilehistoryFhServiceOpenPipe(startserviceifstopped, pipe.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fhServiceReloadConfiguration(pipe: FhServicePipeHandle): Hresult =
    if (windowsWin32StorageFilehistoryNapiAvailable) wasmWindowssysWindowsWin32StorageFilehistoryFhServiceReloadConfiguration(pipe.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fhServiceStartBackup(pipe: FhServicePipeHandle, lowpriorityio: Bool): Hresult =
    if (windowsWin32StorageFilehistoryNapiAvailable) wasmWindowssysWindowsWin32StorageFilehistoryFhServiceStartBackup(pipe.rawAddress.toString(), lowpriorityio) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fhServiceStopBackup(pipe: FhServicePipeHandle, stoptracking: Bool): Hresult =
    if (windowsWin32StorageFilehistoryNapiAvailable) wasmWindowssysWindowsWin32StorageFilehistoryFhServiceStopBackup(pipe.rawAddress.toString(), stoptracking) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fhServiceUnblockBackup(pipe: FhServicePipeHandle): Hresult =
    if (windowsWin32StorageFilehistoryNapiAvailable) wasmWindowssysWindowsWin32StorageFilehistoryFhServiceUnblockBackup(pipe.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
