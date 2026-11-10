@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32DevicesSerialcommunicationNapiAddon(): Boolean

private val _windowsWin32DevicesSerialcommunicationNapiAvailable: Boolean = _initWindowsWin32DevicesSerialcommunicationNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_serialcommunication_comDBClaimNextFreePort(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_serialcommunication_comDBClaimNextFreePort(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_serialcommunication_comDBClaimPort(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_devices_serialcommunication_comDBClaimPort(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_serialcommunication_comDBClose(p0)")
private external fun _wasm_windowssys_windows_win32_devices_serialcommunication_comDBClose(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_serialcommunication_comDBGetCurrentPortUsage(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_devices_serialcommunication_comDBGetCurrentPortUsage(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_serialcommunication_comDBOpen(p0)")
private external fun _wasm_windowssys_windows_win32_devices_serialcommunication_comDBOpen(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_serialcommunication_comDBReleasePort(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_serialcommunication_comDBReleasePort(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_serialcommunication_comDBResizeDatabase(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_serialcommunication_comDBResizeDatabase(p0: String, p1: Int): Int

public actual fun comDBClaimNextFreePort(hcomdb: Hcomdb, comnumber: COpaquePointer?): Int =
    if (_windowsWin32DevicesSerialcommunicationNapiAvailable) _wasm_windowssys_windows_win32_devices_serialcommunication_comDBClaimNextFreePort((hcomdb?.value ?: 0L).toString(), (comnumber?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun comDBClaimPort(hcomdb: Hcomdb, comnumber: UInt, forceclaim: Bool, forced: COpaquePointer?): Int =
    if (_windowsWin32DevicesSerialcommunicationNapiAvailable) _wasm_windowssys_windows_win32_devices_serialcommunication_comDBClaimPort((hcomdb?.value ?: 0L).toString(), comnumber.toInt(), forceclaim, (forced?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun comDBClose(hcomdb: Hcomdb): Int =
    if (_windowsWin32DevicesSerialcommunicationNapiAvailable) _wasm_windowssys_windows_win32_devices_serialcommunication_comDBClose((hcomdb?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun comDBGetCurrentPortUsage(hcomdb: Hcomdb, buffer: COpaquePointer?, buffersize: UInt, reporttype: UInt, maxportsreported: COpaquePointer?): Int =
    if (_windowsWin32DevicesSerialcommunicationNapiAvailable) _wasm_windowssys_windows_win32_devices_serialcommunication_comDBGetCurrentPortUsage((hcomdb?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), buffersize.toInt(), reporttype.toInt(), (maxportsreported?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun comDBOpen(phcomdb: COpaquePointer?): Int =
    if (_windowsWin32DevicesSerialcommunicationNapiAvailable) _wasm_windowssys_windows_win32_devices_serialcommunication_comDBOpen((phcomdb?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun comDBReleasePort(hcomdb: Hcomdb, comnumber: UInt): Int =
    if (_windowsWin32DevicesSerialcommunicationNapiAvailable) _wasm_windowssys_windows_win32_devices_serialcommunication_comDBReleasePort((hcomdb?.value ?: 0L).toString(), comnumber.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun comDBResizeDatabase(hcomdb: Hcomdb, newsize: UInt): Int =
    if (_windowsWin32DevicesSerialcommunicationNapiAvailable) _wasm_windowssys_windows_win32_devices_serialcommunication_comDBResizeDatabase((hcomdb?.value ?: 0L).toString(), newsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")
