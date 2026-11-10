@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool

private val _windowsWin32DevicesSerialcommunicationNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun comDBClaimNextFreePort(hcomdb: Hcomdb, comnumber: COpaquePointer?): Int =
    if (_windowsWin32DevicesSerialcommunicationNapiAddon != null) (_windowsWin32DevicesSerialcommunicationNapiAddon.windowssys_windows_win32_devices_serialcommunication_comDBClaimNextFreePort((hcomdb?.value ?: 0L).toString(), (comnumber?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun comDBClaimPort(hcomdb: Hcomdb, comnumber: UInt, forceclaim: Bool, forced: COpaquePointer?): Int =
    if (_windowsWin32DevicesSerialcommunicationNapiAddon != null) (_windowsWin32DevicesSerialcommunicationNapiAddon.windowssys_windows_win32_devices_serialcommunication_comDBClaimPort((hcomdb?.value ?: 0L).toString(), comnumber.toInt(), forceclaim, (forced?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun comDBClose(hcomdb: Hcomdb): Int =
    if (_windowsWin32DevicesSerialcommunicationNapiAddon != null) (_windowsWin32DevicesSerialcommunicationNapiAddon.windowssys_windows_win32_devices_serialcommunication_comDBClose((hcomdb?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun comDBGetCurrentPortUsage(hcomdb: Hcomdb, buffer: COpaquePointer?, buffersize: UInt, reporttype: UInt, maxportsreported: COpaquePointer?): Int =
    if (_windowsWin32DevicesSerialcommunicationNapiAddon != null) (_windowsWin32DevicesSerialcommunicationNapiAddon.windowssys_windows_win32_devices_serialcommunication_comDBGetCurrentPortUsage((hcomdb?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), buffersize.toInt(), reporttype.toInt(), (maxportsreported?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun comDBOpen(phcomdb: COpaquePointer?): Int =
    if (_windowsWin32DevicesSerialcommunicationNapiAddon != null) (_windowsWin32DevicesSerialcommunicationNapiAddon.windowssys_windows_win32_devices_serialcommunication_comDBOpen((phcomdb?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun comDBReleasePort(hcomdb: Hcomdb, comnumber: UInt): Int =
    if (_windowsWin32DevicesSerialcommunicationNapiAddon != null) (_windowsWin32DevicesSerialcommunicationNapiAddon.windowssys_windows_win32_devices_serialcommunication_comDBReleasePort((hcomdb?.value ?: 0L).toString(), comnumber.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun comDBResizeDatabase(hcomdb: Hcomdb, newsize: UInt): Int =
    if (_windowsWin32DevicesSerialcommunicationNapiAddon != null) (_windowsWin32DevicesSerialcommunicationNapiAddon.windowssys_windows_win32_devices_serialcommunication_comDBResizeDatabase((hcomdb?.value ?: 0L).toString(), newsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
