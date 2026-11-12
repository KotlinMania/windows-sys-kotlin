@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon(): Boolean

private val windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAvailable: Boolean = initWindowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerFreeInterfaceContextTable(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerFreeInterfaceContextTable(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerGetInterfaceContextTableForHostName(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerGetInterfaceContextTableForHostName(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerOnDemandGetRoutingHint(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerOnDemandGetRoutingHint(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerOnDemandRegisterNotification(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerOnDemandRegisterNotification(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerOnDemandUnRegisterNotification(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerOnDemandUnRegisterNotification(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmFreeMemory(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmFreeMemory(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmGetProfileList(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmGetProfileList(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmQueryProperty(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmQueryProperty(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmSetProfileList(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmSetProfileList(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmSetProperty(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmSetProperty(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

public actual fun freeInterfaceContextTable(interfacecontexttable: ConstPtr) {
    if (windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerFreeInterfaceContextTable(interfacecontexttable.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getInterfaceContextTableForHostName(hostname: Pcwstr, proxyname: Pcwstr, flags: UInt, connectionprofilefilterrawdata: ConstPtr, connectionprofilefilterrawdatasize: UInt, interfacecontexttable: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerGetInterfaceContextTableForHostName(hostname.rawAddress.toString(), proxyname.rawAddress.toString(), flags.toInt(), connectionprofilefilterrawdata.rawAddress.toString(), connectionprofilefilterrawdatasize.toInt(), interfacecontexttable.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun onDemandGetRoutingHint(destinationhostname: Pcwstr, interfaceindex: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerOnDemandGetRoutingHint(destinationhostname.rawAddress.toString(), interfaceindex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun onDemandRegisterNotification(callback: OndemandNotificationCallback, callbackcontext: ConstPtr, registrationhandle: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerOnDemandRegisterNotification(0L.toString(), callbackcontext.rawAddress.toString(), registrationhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun onDemandUnRegisterNotification(registrationhandle: Handle): Hresult =
    if (windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerOnDemandUnRegisterNotification(registrationhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcmFreeMemory(pmemory: MutPtr) {
    if (windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmFreeMemory(pmemory.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wcmGetProfileList(preserved: ConstPtr, ppprofilelist: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmGetProfileList(preserved.rawAddress.toString(), ppprofilelist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcmQueryProperty(pinterface: ConstPtr, strprofilename: Pcwstr, property: WcmProperty, preserved: ConstPtr, pdwdatasize: MutPtr, ppdata: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmQueryProperty(pinterface.rawAddress.toString(), strprofilename.rawAddress.toString(), property, preserved.rawAddress.toString(), pdwdatasize.rawAddress.toString(), ppdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcmSetProfileList(pprofilelist: ConstPtr, dwposition: UInt, fignoreunknownprofiles: Bool, preserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmSetProfileList(pprofilelist.rawAddress.toString(), dwposition.toInt(), fignoreunknownprofiles, preserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcmSetProperty(pinterface: ConstPtr, strprofilename: Pcwstr, property: WcmProperty, preserved: ConstPtr, dwdatasize: UInt, pbdata: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmSetProperty(pinterface.rawAddress.toString(), strprofilename.rawAddress.toString(), property, preserved.rawAddress.toString(), dwdatasize.toInt(), pbdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
