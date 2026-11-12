@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32MediaWindowsmediaformatNapiAddon(): Boolean

private val windowsWin32MediaWindowsmediaformatNapiAvailable: Boolean = initWindowsWin32MediaWindowsmediaformatNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaWindowsmediaformatWMCreateBackupRestorer(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaWindowsmediaformatWMCreateBackupRestorer(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaWindowsmediaformatWMCreateEditor(p0)")
private external fun wasmWindowssysWindowsWin32MediaWindowsmediaformatWMCreateEditor(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaWindowsmediaformatWMCreateIndexer(p0)")
private external fun wasmWindowssysWindowsWin32MediaWindowsmediaformatWMCreateIndexer(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaWindowsmediaformatWMCreateProfileManager(p0)")
private external fun wasmWindowssysWindowsWin32MediaWindowsmediaformatWMCreateProfileManager(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaWindowsmediaformatWMCreateReader(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaWindowsmediaformatWMCreateReader(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaWindowsmediaformatWMCreateSyncReader(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32MediaWindowsmediaformatWMCreateSyncReader(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaWindowsmediaformatWMCreateWriter(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaWindowsmediaformatWMCreateWriter(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaWindowsmediaformatWMCreateWriterFileSink(p0)")
private external fun wasmWindowssysWindowsWin32MediaWindowsmediaformatWMCreateWriterFileSink(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaWindowsmediaformatWMCreateWriterNetworkSink(p0)")
private external fun wasmWindowssysWindowsWin32MediaWindowsmediaformatWMCreateWriterNetworkSink(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaWindowsmediaformatWMCreateWriterPushSink(p0)")
private external fun wasmWindowssysWindowsWin32MediaWindowsmediaformatWMCreateWriterPushSink(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32MediaWindowsmediaformatWMIsContentProtected(p0, p1)")
private external fun wasmWindowssysWindowsWin32MediaWindowsmediaformatWMIsContentProtected(p0: String, p1: String): Int

public actual fun wMCreateBackupRestorer(pcallback: MutPtr, ppbackup: MutPtr): Hresult =
    if (windowsWin32MediaWindowsmediaformatNapiAvailable) wasmWindowssysWindowsWin32MediaWindowsmediaformatWMCreateBackupRestorer(pcallback.rawAddress.toString(), ppbackup.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMCreateEditor(ppeditor: MutPtr): Hresult =
    if (windowsWin32MediaWindowsmediaformatNapiAvailable) wasmWindowssysWindowsWin32MediaWindowsmediaformatWMCreateEditor(ppeditor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMCreateIndexer(ppindexer: MutPtr): Hresult =
    if (windowsWin32MediaWindowsmediaformatNapiAvailable) wasmWindowssysWindowsWin32MediaWindowsmediaformatWMCreateIndexer(ppindexer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMCreateProfileManager(ppprofilemanager: MutPtr): Hresult =
    if (windowsWin32MediaWindowsmediaformatNapiAvailable) wasmWindowssysWindowsWin32MediaWindowsmediaformatWMCreateProfileManager(ppprofilemanager.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMCreateReader(punkcert: MutPtr, dwrights: UInt, ppreader: MutPtr): Hresult =
    if (windowsWin32MediaWindowsmediaformatNapiAvailable) wasmWindowssysWindowsWin32MediaWindowsmediaformatWMCreateReader(punkcert.rawAddress.toString(), dwrights.toInt(), ppreader.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMCreateSyncReader(punkcert: MutPtr, dwrights: UInt, ppsyncreader: MutPtr): Hresult =
    if (windowsWin32MediaWindowsmediaformatNapiAvailable) wasmWindowssysWindowsWin32MediaWindowsmediaformatWMCreateSyncReader(punkcert.rawAddress.toString(), dwrights.toInt(), ppsyncreader.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMCreateWriter(punkcert: MutPtr, ppwriter: MutPtr): Hresult =
    if (windowsWin32MediaWindowsmediaformatNapiAvailable) wasmWindowssysWindowsWin32MediaWindowsmediaformatWMCreateWriter(punkcert.rawAddress.toString(), ppwriter.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMCreateWriterFileSink(ppsink: MutPtr): Hresult =
    if (windowsWin32MediaWindowsmediaformatNapiAvailable) wasmWindowssysWindowsWin32MediaWindowsmediaformatWMCreateWriterFileSink(ppsink.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMCreateWriterNetworkSink(ppsink: MutPtr): Hresult =
    if (windowsWin32MediaWindowsmediaformatNapiAvailable) wasmWindowssysWindowsWin32MediaWindowsmediaformatWMCreateWriterNetworkSink(ppsink.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMCreateWriterPushSink(ppsink: MutPtr): Hresult =
    if (windowsWin32MediaWindowsmediaformatNapiAvailable) wasmWindowssysWindowsWin32MediaWindowsmediaformatWMCreateWriterPushSink(ppsink.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wMIsContentProtected(pwszfilename: Pcwstr, pfisprotected: MutPtr): Hresult =
    if (windowsWin32MediaWindowsmediaformatNapiAvailable) wasmWindowssysWindowsWin32MediaWindowsmediaformatWMIsContentProtected(pwszfilename.rawAddress.toString(), pfisprotected.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
