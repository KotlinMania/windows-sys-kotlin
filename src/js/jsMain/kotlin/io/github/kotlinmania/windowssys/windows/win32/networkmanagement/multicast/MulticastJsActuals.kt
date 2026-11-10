@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool

private val _windowsWin32NetworkmanagementMulticastNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun mcastApiCleanup() {
    if (_windowsWin32NetworkmanagementMulticastNapiAddon != null) {
        _windowsWin32NetworkmanagementMulticastNapiAddon.windowssys_windows_win32_networkmanagement_multicast_mcastApiCleanup()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mcastApiStartup(version: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementMulticastNapiAddon != null) (_windowsWin32NetworkmanagementMulticastNapiAddon.windowssys_windows_win32_networkmanagement_multicast_mcastApiStartup((version?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mcastEnumerateScopes(addrfamily: UShort, requery: Bool, pscopelist: COpaquePointer?, pscopelen: COpaquePointer?, pscopecount: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementMulticastNapiAddon != null) (_windowsWin32NetworkmanagementMulticastNapiAddon.windowssys_windows_win32_networkmanagement_multicast_mcastEnumerateScopes(addrfamily.toInt(), requery, (pscopelist?.value ?: 0L).toString(), (pscopelen?.value ?: 0L).toString(), (pscopecount?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mcastGenUID(prequestid: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementMulticastNapiAddon != null) (_windowsWin32NetworkmanagementMulticastNapiAddon.windowssys_windows_win32_networkmanagement_multicast_mcastGenUID((prequestid?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mcastReleaseAddress(addrfamily: UShort, prequestid: COpaquePointer?, preleaserequest: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementMulticastNapiAddon != null) (_windowsWin32NetworkmanagementMulticastNapiAddon.windowssys_windows_win32_networkmanagement_multicast_mcastReleaseAddress(addrfamily.toInt(), (prequestid?.value ?: 0L).toString(), (preleaserequest?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mcastRenewAddress(addrfamily: UShort, prequestid: COpaquePointer?, prenewrequest: COpaquePointer?, prenewresponse: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementMulticastNapiAddon != null) (_windowsWin32NetworkmanagementMulticastNapiAddon.windowssys_windows_win32_networkmanagement_multicast_mcastRenewAddress(addrfamily.toInt(), (prequestid?.value ?: 0L).toString(), (prenewrequest?.value ?: 0L).toString(), (prenewresponse?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mcastRequestAddress(addrfamily: UShort, prequestid: COpaquePointer?, pscopectx: COpaquePointer?, paddrrequest: COpaquePointer?, paddrresponse: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementMulticastNapiAddon != null) (_windowsWin32NetworkmanagementMulticastNapiAddon.windowssys_windows_win32_networkmanagement_multicast_mcastRequestAddress(addrfamily.toInt(), (prequestid?.value ?: 0L).toString(), (pscopectx?.value ?: 0L).toString(), (paddrrequest?.value ?: 0L).toString(), (paddrresponse?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
