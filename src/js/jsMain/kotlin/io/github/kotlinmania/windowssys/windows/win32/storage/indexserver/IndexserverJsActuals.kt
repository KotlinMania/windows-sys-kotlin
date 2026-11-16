@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.indexserver

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

private val windowsWin32StorageIndexserverNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun bindIFilterFromStorage(pstg: MutPtr, punkouter: MutPtr, ppiunk: MutPtr): Hresult =
    if (windowsWin32StorageIndexserverNapiAddon != null) (windowsWin32StorageIndexserverNapiAddon.windowssysWindowsWin32StorageIndexserverBindIFilterFromStorage(pstg.rawAddress.toString(), punkouter.rawAddress.toString(), ppiunk.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bindIFilterFromStream(pstm: MutPtr, punkouter: MutPtr, ppiunk: MutPtr): Hresult =
    if (windowsWin32StorageIndexserverNapiAddon != null) (windowsWin32StorageIndexserverNapiAddon.windowssysWindowsWin32StorageIndexserverBindIFilterFromStream(pstm.rawAddress.toString(), punkouter.rawAddress.toString(), ppiunk.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadIFilter(pwcspath: Pcwstr, punkouter: MutPtr, ppiunk: MutPtr): Hresult =
    if (windowsWin32StorageIndexserverNapiAddon != null) (windowsWin32StorageIndexserverNapiAddon.windowssysWindowsWin32StorageIndexserverLoadIFilter(pwcspath.rawAddress.toString(), punkouter.rawAddress.toString(), ppiunk.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadIFilterEx(pwcspath: Pcwstr, dwflags: UInt, riid: ConstPtr, ppiunk: MutPtr): Hresult =
    if (windowsWin32StorageIndexserverNapiAddon != null) (windowsWin32StorageIndexserverNapiAddon.windowssysWindowsWin32StorageIndexserverLoadIFilterEx(pwcspath.rawAddress.toString(), dwflags.toInt(), riid.rawAddress.toString(), ppiunk.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
