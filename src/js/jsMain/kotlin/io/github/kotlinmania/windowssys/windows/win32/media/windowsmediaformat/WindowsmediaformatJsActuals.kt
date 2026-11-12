@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

private val windowsWin32MediaWindowsmediaformatNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun wMCreateBackupRestorer(pcallback: MutPtr<CVoid>, ppbackup: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32MediaWindowsmediaformatNapiAddon != null) (windowsWin32MediaWindowsmediaformatNapiAddon.windowssysWindowsWin32MediaWindowsmediaformatWMCreateBackupRestorer(pcallback.rawAddress.toString(), ppbackup.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMCreateEditor(ppeditor: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32MediaWindowsmediaformatNapiAddon != null) (windowsWin32MediaWindowsmediaformatNapiAddon.windowssysWindowsWin32MediaWindowsmediaformatWMCreateEditor(ppeditor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMCreateIndexer(ppindexer: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32MediaWindowsmediaformatNapiAddon != null) (windowsWin32MediaWindowsmediaformatNapiAddon.windowssysWindowsWin32MediaWindowsmediaformatWMCreateIndexer(ppindexer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMCreateProfileManager(ppprofilemanager: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32MediaWindowsmediaformatNapiAddon != null) (windowsWin32MediaWindowsmediaformatNapiAddon.windowssysWindowsWin32MediaWindowsmediaformatWMCreateProfileManager(ppprofilemanager.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMCreateReader(punkcert: MutPtr<CVoid>, dwrights: UInt, ppreader: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32MediaWindowsmediaformatNapiAddon != null) (windowsWin32MediaWindowsmediaformatNapiAddon.windowssysWindowsWin32MediaWindowsmediaformatWMCreateReader(punkcert.rawAddress.toString(), dwrights.toInt(), ppreader.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMCreateSyncReader(punkcert: MutPtr<CVoid>, dwrights: UInt, ppsyncreader: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32MediaWindowsmediaformatNapiAddon != null) (windowsWin32MediaWindowsmediaformatNapiAddon.windowssysWindowsWin32MediaWindowsmediaformatWMCreateSyncReader(punkcert.rawAddress.toString(), dwrights.toInt(), ppsyncreader.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMCreateWriter(punkcert: MutPtr<CVoid>, ppwriter: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32MediaWindowsmediaformatNapiAddon != null) (windowsWin32MediaWindowsmediaformatNapiAddon.windowssysWindowsWin32MediaWindowsmediaformatWMCreateWriter(punkcert.rawAddress.toString(), ppwriter.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMCreateWriterFileSink(ppsink: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32MediaWindowsmediaformatNapiAddon != null) (windowsWin32MediaWindowsmediaformatNapiAddon.windowssysWindowsWin32MediaWindowsmediaformatWMCreateWriterFileSink(ppsink.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMCreateWriterNetworkSink(ppsink: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32MediaWindowsmediaformatNapiAddon != null) (windowsWin32MediaWindowsmediaformatNapiAddon.windowssysWindowsWin32MediaWindowsmediaformatWMCreateWriterNetworkSink(ppsink.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMCreateWriterPushSink(ppsink: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32MediaWindowsmediaformatNapiAddon != null) (windowsWin32MediaWindowsmediaformatNapiAddon.windowssysWindowsWin32MediaWindowsmediaformatWMCreateWriterPushSink(ppsink.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMIsContentProtected(pwszfilename: Pcwstr, pfisprotected: MutPtr<Bool>): Hresult =
    if (windowsWin32MediaWindowsmediaformatNapiAddon != null) (windowsWin32MediaWindowsmediaformatNapiAddon.windowssysWindowsWin32MediaWindowsmediaformatWMIsContentProtected(pwszfilename.rawAddress.toString(), pfisprotected.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
