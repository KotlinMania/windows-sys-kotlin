@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32NetworkmanagementMulticastNapiAddon(): Boolean

private val windowsWin32NetworkmanagementMulticastNapiAvailable: Boolean = initWindowsWin32NetworkmanagementMulticastNapiAddon()

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementMulticastMcastApiCleanup()")
private external fun wasmWindowssysWindowsWin32NetworkmanagementMulticastMcastApiCleanup()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementMulticastMcastApiStartup(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementMulticastMcastApiStartup(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementMulticastMcastEnumerateScopes(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementMulticastMcastEnumerateScopes(p0: Int, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementMulticastMcastGenUID(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementMulticastMcastGenUID(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementMulticastMcastReleaseAddress(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementMulticastMcastReleaseAddress(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementMulticastMcastRenewAddress(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementMulticastMcastRenewAddress(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementMulticastMcastRequestAddress(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementMulticastMcastRequestAddress(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

public actual fun mcastApiCleanup() {
    if (windowsWin32NetworkmanagementMulticastNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementMulticastMcastApiCleanup()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mcastApiStartup(version: MutPtr): UInt =
    if (windowsWin32NetworkmanagementMulticastNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementMulticastMcastApiStartup(version.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mcastEnumerateScopes(addrfamily: UShort, requery: Bool, pscopelist: MutPtr, pscopelen: MutPtr, pscopecount: MutPtr): UInt =
    if (windowsWin32NetworkmanagementMulticastNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementMulticastMcastEnumerateScopes(addrfamily.toInt(), requery, pscopelist.rawAddress.toString(), pscopelen.rawAddress.toString(), pscopecount.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mcastGenUID(prequestid: MutPtr): UInt =
    if (windowsWin32NetworkmanagementMulticastNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementMulticastMcastGenUID(prequestid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mcastReleaseAddress(addrfamily: UShort, prequestid: MutPtr, preleaserequest: MutPtr): UInt =
    if (windowsWin32NetworkmanagementMulticastNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementMulticastMcastReleaseAddress(addrfamily.toInt(), prequestid.rawAddress.toString(), preleaserequest.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mcastRenewAddress(addrfamily: UShort, prequestid: MutPtr, prenewrequest: MutPtr, prenewresponse: MutPtr): UInt =
    if (windowsWin32NetworkmanagementMulticastNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementMulticastMcastRenewAddress(addrfamily.toInt(), prequestid.rawAddress.toString(), prenewrequest.rawAddress.toString(), prenewresponse.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mcastRequestAddress(addrfamily: UShort, prequestid: MutPtr, pscopectx: MutPtr, paddrrequest: MutPtr, paddrresponse: MutPtr): UInt =
    if (windowsWin32NetworkmanagementMulticastNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementMulticastMcastRequestAddress(addrfamily.toInt(), prequestid.rawAddress.toString(), pscopectx.rawAddress.toString(), paddrrequest.rawAddress.toString(), paddrresponse.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
