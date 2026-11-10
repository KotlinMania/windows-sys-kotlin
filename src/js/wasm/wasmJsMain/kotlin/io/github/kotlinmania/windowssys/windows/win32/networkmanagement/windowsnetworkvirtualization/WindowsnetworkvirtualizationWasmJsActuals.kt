@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsnetworkvirtualization

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32NetworkmanagementWindowsnetworkvirtualizationNapiAddon(): Boolean

private val _windowsWin32NetworkmanagementWindowsnetworkvirtualizationNapiAvailable: Boolean = _initWindowsWin32NetworkmanagementWindowsnetworkvirtualizationNapiAddon()

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_windowsnetworkvirtualization_wnvOpen()")
private external fun _wasm_windowssys_windows_win32_networkmanagement_windowsnetworkvirtualization_wnvOpen(): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_windowsnetworkvirtualization_wnvRequestNotification(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_windowsnetworkvirtualization_wnvRequestNotification(p0: String, p1: String, p2: String, p3: String): Int

public actual fun wnvOpen(): Handle =
    if (_windowsWin32NetworkmanagementWindowsnetworkvirtualizationNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_windowsnetworkvirtualization_wnvOpen().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wnvRequestNotification(wnvhandle: Handle, notificationparam: COpaquePointer?, overlapped: COpaquePointer?, bytestransferred: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWindowsnetworkvirtualizationNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_windowsnetworkvirtualization_wnvRequestNotification((wnvhandle?.value ?: 0L).toString(), (notificationparam?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString(), (bytestransferred?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
