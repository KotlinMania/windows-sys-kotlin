@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

private val _windowsWin32MediaWindowsmediaformatNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun wMCreateBackupRestorer(pcallback: COpaquePointer?, ppbackup: COpaquePointer?): Hresult =
    if (_windowsWin32MediaWindowsmediaformatNapiAddon != null) (_windowsWin32MediaWindowsmediaformatNapiAddon.windowssys_windows_win32_media_windowsmediaformat_wMCreateBackupRestorer((pcallback?.value ?: 0L).toString(), (ppbackup?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMCreateEditor(ppeditor: COpaquePointer?): Hresult =
    if (_windowsWin32MediaWindowsmediaformatNapiAddon != null) (_windowsWin32MediaWindowsmediaformatNapiAddon.windowssys_windows_win32_media_windowsmediaformat_wMCreateEditor((ppeditor?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMCreateIndexer(ppindexer: COpaquePointer?): Hresult =
    if (_windowsWin32MediaWindowsmediaformatNapiAddon != null) (_windowsWin32MediaWindowsmediaformatNapiAddon.windowssys_windows_win32_media_windowsmediaformat_wMCreateIndexer((ppindexer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMCreateProfileManager(ppprofilemanager: COpaquePointer?): Hresult =
    if (_windowsWin32MediaWindowsmediaformatNapiAddon != null) (_windowsWin32MediaWindowsmediaformatNapiAddon.windowssys_windows_win32_media_windowsmediaformat_wMCreateProfileManager((ppprofilemanager?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMCreateReader(punkcert: COpaquePointer?, dwrights: UInt, ppreader: COpaquePointer?): Hresult =
    if (_windowsWin32MediaWindowsmediaformatNapiAddon != null) (_windowsWin32MediaWindowsmediaformatNapiAddon.windowssys_windows_win32_media_windowsmediaformat_wMCreateReader((punkcert?.value ?: 0L).toString(), dwrights.toInt(), (ppreader?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMCreateSyncReader(punkcert: COpaquePointer?, dwrights: UInt, ppsyncreader: COpaquePointer?): Hresult =
    if (_windowsWin32MediaWindowsmediaformatNapiAddon != null) (_windowsWin32MediaWindowsmediaformatNapiAddon.windowssys_windows_win32_media_windowsmediaformat_wMCreateSyncReader((punkcert?.value ?: 0L).toString(), dwrights.toInt(), (ppsyncreader?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMCreateWriter(punkcert: COpaquePointer?, ppwriter: COpaquePointer?): Hresult =
    if (_windowsWin32MediaWindowsmediaformatNapiAddon != null) (_windowsWin32MediaWindowsmediaformatNapiAddon.windowssys_windows_win32_media_windowsmediaformat_wMCreateWriter((punkcert?.value ?: 0L).toString(), (ppwriter?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMCreateWriterFileSink(ppsink: COpaquePointer?): Hresult =
    if (_windowsWin32MediaWindowsmediaformatNapiAddon != null) (_windowsWin32MediaWindowsmediaformatNapiAddon.windowssys_windows_win32_media_windowsmediaformat_wMCreateWriterFileSink((ppsink?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMCreateWriterNetworkSink(ppsink: COpaquePointer?): Hresult =
    if (_windowsWin32MediaWindowsmediaformatNapiAddon != null) (_windowsWin32MediaWindowsmediaformatNapiAddon.windowssys_windows_win32_media_windowsmediaformat_wMCreateWriterNetworkSink((ppsink?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMCreateWriterPushSink(ppsink: COpaquePointer?): Hresult =
    if (_windowsWin32MediaWindowsmediaformatNapiAddon != null) (_windowsWin32MediaWindowsmediaformatNapiAddon.windowssys_windows_win32_media_windowsmediaformat_wMCreateWriterPushSink((ppsink?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMIsContentProtected(pwszfilename: Pcwstr, pfisprotected: COpaquePointer?): Hresult =
    if (_windowsWin32MediaWindowsmediaformatNapiAddon != null) (_windowsWin32MediaWindowsmediaformatNapiAddon.windowssys_windows_win32_media_windowsmediaformat_wMIsContentProtected((pwszfilename?.value ?: 0L).toString(), (pfisprotected?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
