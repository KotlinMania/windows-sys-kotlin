@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

private val windowsWin32NetworkmanagementMulticastNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun mcastApiCleanup() {
    if (windowsWin32NetworkmanagementMulticastNapiAddon != null) {
        windowsWin32NetworkmanagementMulticastNapiAddon.windowssysWindowsWin32NetworkmanagementMulticastMcastApiCleanup()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mcastApiStartup(version: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementMulticastNapiAddon != null) (windowsWin32NetworkmanagementMulticastNapiAddon.windowssysWindowsWin32NetworkmanagementMulticastMcastApiStartup(version.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mcastEnumerateScopes(addrfamily: UShort, requery: Bool, pscopelist: MutPtr<McastScopeEntry>, pscopelen: MutPtr<UInt>, pscopecount: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementMulticastNapiAddon != null) (windowsWin32NetworkmanagementMulticastNapiAddon.windowssysWindowsWin32NetworkmanagementMulticastMcastEnumerateScopes(addrfamily.toInt(), requery, pscopelist.rawAddress.toString(), pscopelen.rawAddress.toString(), pscopecount.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mcastGenUID(prequestid: MutPtr<McastClientUid>): UInt =
    if (windowsWin32NetworkmanagementMulticastNapiAddon != null) (windowsWin32NetworkmanagementMulticastNapiAddon.windowssysWindowsWin32NetworkmanagementMulticastMcastGenUID(prequestid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mcastReleaseAddress(addrfamily: UShort, prequestid: MutPtr<McastClientUid>, preleaserequest: MutPtr<McastLeaseRequest>): UInt =
    if (windowsWin32NetworkmanagementMulticastNapiAddon != null) (windowsWin32NetworkmanagementMulticastNapiAddon.windowssysWindowsWin32NetworkmanagementMulticastMcastReleaseAddress(addrfamily.toInt(), prequestid.rawAddress.toString(), preleaserequest.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mcastRenewAddress(addrfamily: UShort, prequestid: MutPtr<McastClientUid>, prenewrequest: MutPtr<McastLeaseRequest>, prenewresponse: MutPtr<McastLeaseResponse>): UInt =
    if (windowsWin32NetworkmanagementMulticastNapiAddon != null) (windowsWin32NetworkmanagementMulticastNapiAddon.windowssysWindowsWin32NetworkmanagementMulticastMcastRenewAddress(addrfamily.toInt(), prequestid.rawAddress.toString(), prenewrequest.rawAddress.toString(), prenewresponse.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mcastRequestAddress(addrfamily: UShort, prequestid: MutPtr<McastClientUid>, pscopectx: MutPtr<McastScopeCtx>, paddrrequest: MutPtr<McastLeaseRequest>, paddrresponse: MutPtr<McastLeaseResponse>): UInt =
    if (windowsWin32NetworkmanagementMulticastNapiAddon != null) (windowsWin32NetworkmanagementMulticastNapiAddon.windowssysWindowsWin32NetworkmanagementMulticastMcastRequestAddress(addrfamily.toInt(), prequestid.rawAddress.toString(), pscopectx.rawAddress.toString(), paddrrequest.rawAddress.toString(), paddrresponse.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
