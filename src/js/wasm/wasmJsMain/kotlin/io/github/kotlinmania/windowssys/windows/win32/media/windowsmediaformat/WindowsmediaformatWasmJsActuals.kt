@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32MediaWindowsmediaformatNapiAddon(): Boolean

private val _windowsWin32MediaWindowsmediaformatNapiAvailable: Boolean = _initWindowsWin32MediaWindowsmediaformatNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_windowsmediaformat_wMCreateBackupRestorer(p0, p1)")
private external fun _wasm_windowssys_windows_win32_media_windowsmediaformat_wMCreateBackupRestorer(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_windowsmediaformat_wMCreateEditor(p0)")
private external fun _wasm_windowssys_windows_win32_media_windowsmediaformat_wMCreateEditor(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_windowsmediaformat_wMCreateIndexer(p0)")
private external fun _wasm_windowssys_windows_win32_media_windowsmediaformat_wMCreateIndexer(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_windowsmediaformat_wMCreateProfileManager(p0)")
private external fun _wasm_windowssys_windows_win32_media_windowsmediaformat_wMCreateProfileManager(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_windowsmediaformat_wMCreateReader(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_windowsmediaformat_wMCreateReader(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_windowsmediaformat_wMCreateSyncReader(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_media_windowsmediaformat_wMCreateSyncReader(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_windowsmediaformat_wMCreateWriter(p0, p1)")
private external fun _wasm_windowssys_windows_win32_media_windowsmediaformat_wMCreateWriter(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_windowsmediaformat_wMCreateWriterFileSink(p0)")
private external fun _wasm_windowssys_windows_win32_media_windowsmediaformat_wMCreateWriterFileSink(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_windowsmediaformat_wMCreateWriterNetworkSink(p0)")
private external fun _wasm_windowssys_windows_win32_media_windowsmediaformat_wMCreateWriterNetworkSink(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_windowsmediaformat_wMCreateWriterPushSink(p0)")
private external fun _wasm_windowssys_windows_win32_media_windowsmediaformat_wMCreateWriterPushSink(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_media_windowsmediaformat_wMIsContentProtected(p0, p1)")
private external fun _wasm_windowssys_windows_win32_media_windowsmediaformat_wMIsContentProtected(p0: String, p1: String): Int

public actual fun wMCreateBackupRestorer(pcallback: COpaquePointer?, ppbackup: COpaquePointer?): Hresult =
    if (_windowsWin32MediaWindowsmediaformatNapiAvailable) _wasm_windowssys_windows_win32_media_windowsmediaformat_wMCreateBackupRestorer((pcallback?.value ?: 0L).toString(), (ppbackup?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMCreateEditor(ppeditor: COpaquePointer?): Hresult =
    if (_windowsWin32MediaWindowsmediaformatNapiAvailable) _wasm_windowssys_windows_win32_media_windowsmediaformat_wMCreateEditor((ppeditor?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMCreateIndexer(ppindexer: COpaquePointer?): Hresult =
    if (_windowsWin32MediaWindowsmediaformatNapiAvailable) _wasm_windowssys_windows_win32_media_windowsmediaformat_wMCreateIndexer((ppindexer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMCreateProfileManager(ppprofilemanager: COpaquePointer?): Hresult =
    if (_windowsWin32MediaWindowsmediaformatNapiAvailable) _wasm_windowssys_windows_win32_media_windowsmediaformat_wMCreateProfileManager((ppprofilemanager?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMCreateReader(punkcert: COpaquePointer?, dwrights: UInt, ppreader: COpaquePointer?): Hresult =
    if (_windowsWin32MediaWindowsmediaformatNapiAvailable) _wasm_windowssys_windows_win32_media_windowsmediaformat_wMCreateReader((punkcert?.value ?: 0L).toString(), dwrights.toInt(), (ppreader?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMCreateSyncReader(punkcert: COpaquePointer?, dwrights: UInt, ppsyncreader: COpaquePointer?): Hresult =
    if (_windowsWin32MediaWindowsmediaformatNapiAvailable) _wasm_windowssys_windows_win32_media_windowsmediaformat_wMCreateSyncReader((punkcert?.value ?: 0L).toString(), dwrights.toInt(), (ppsyncreader?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMCreateWriter(punkcert: COpaquePointer?, ppwriter: COpaquePointer?): Hresult =
    if (_windowsWin32MediaWindowsmediaformatNapiAvailable) _wasm_windowssys_windows_win32_media_windowsmediaformat_wMCreateWriter((punkcert?.value ?: 0L).toString(), (ppwriter?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMCreateWriterFileSink(ppsink: COpaquePointer?): Hresult =
    if (_windowsWin32MediaWindowsmediaformatNapiAvailable) _wasm_windowssys_windows_win32_media_windowsmediaformat_wMCreateWriterFileSink((ppsink?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMCreateWriterNetworkSink(ppsink: COpaquePointer?): Hresult =
    if (_windowsWin32MediaWindowsmediaformatNapiAvailable) _wasm_windowssys_windows_win32_media_windowsmediaformat_wMCreateWriterNetworkSink((ppsink?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMCreateWriterPushSink(ppsink: COpaquePointer?): Hresult =
    if (_windowsWin32MediaWindowsmediaformatNapiAvailable) _wasm_windowssys_windows_win32_media_windowsmediaformat_wMCreateWriterPushSink((ppsink?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMIsContentProtected(pwszfilename: Pcwstr, pfisprotected: COpaquePointer?): Hresult =
    if (_windowsWin32MediaWindowsmediaformatNapiAvailable) _wasm_windowssys_windows_win32_media_windowsmediaformat_wMIsContentProtected((pwszfilename?.value ?: 0L).toString(), (pfisprotected?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
