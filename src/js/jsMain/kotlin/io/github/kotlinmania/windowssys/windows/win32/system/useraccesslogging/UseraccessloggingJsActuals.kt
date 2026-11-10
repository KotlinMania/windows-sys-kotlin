@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.useraccesslogging

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

private val _windowsWin32SystemUseraccessloggingNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun ualInstrument(data: COpaquePointer?): Hresult =
    if (_windowsWin32SystemUseraccessloggingNapiAddon != null) (_windowsWin32SystemUseraccessloggingNapiAddon.windowssys_windows_win32_system_useraccesslogging_ualInstrument((data?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ualRegisterProduct(wszproductname: Pcwstr, wszrolename: Pcwstr, wszguid: Pcwstr): Hresult =
    if (_windowsWin32SystemUseraccessloggingNapiAddon != null) (_windowsWin32SystemUseraccessloggingNapiAddon.windowssys_windows_win32_system_useraccesslogging_ualRegisterProduct((wszproductname?.value ?: 0L).toString(), (wszrolename?.value ?: 0L).toString(), (wszguid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ualStart(data: COpaquePointer?): Hresult =
    if (_windowsWin32SystemUseraccessloggingNapiAddon != null) (_windowsWin32SystemUseraccessloggingNapiAddon.windowssys_windows_win32_system_useraccesslogging_ualStart((data?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ualStop(data: COpaquePointer?): Hresult =
    if (_windowsWin32SystemUseraccessloggingNapiAddon != null) (_windowsWin32SystemUseraccessloggingNapiAddon.windowssys_windows_win32_system_useraccesslogging_ualStop((data?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
