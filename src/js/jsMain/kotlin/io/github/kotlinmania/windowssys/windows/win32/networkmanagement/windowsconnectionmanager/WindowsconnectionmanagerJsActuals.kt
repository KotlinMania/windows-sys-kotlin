@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private val windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun freeInterfaceContextTable(interfacecontexttable: ConstPtr) {
    if (windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon != null) {
        windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerFreeInterfaceContextTable(interfacecontexttable.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getInterfaceContextTableForHostName(hostname: Pcwstr, proxyname: Pcwstr, flags: UInt, connectionprofilefilterrawdata: ConstPtr, connectionprofilefilterrawdatasize: UInt, interfacecontexttable: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon != null) (windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerGetInterfaceContextTableForHostName(hostname.rawAddress.toString(), proxyname.rawAddress.toString(), flags.toInt(), connectionprofilefilterrawdata.rawAddress.toString(), connectionprofilefilterrawdatasize.toInt(), interfacecontexttable.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun onDemandGetRoutingHint(destinationhostname: Pcwstr, interfaceindex: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon != null) (windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerOnDemandGetRoutingHint(destinationhostname.rawAddress.toString(), interfaceindex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun onDemandRegisterNotification(callback: OndemandNotificationCallback, callbackcontext: ConstPtr, registrationhandle: MutPtr): Hresult =
    if (windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon != null) (windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerOnDemandRegisterNotification(0L.toString(), callbackcontext.rawAddress.toString(), registrationhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun onDemandUnRegisterNotification(registrationhandle: Handle): Hresult =
    if (windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon != null) (windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerOnDemandUnRegisterNotification(registrationhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcmFreeMemory(pmemory: MutPtr) {
    if (windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon != null) {
        windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmFreeMemory(pmemory.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wcmGetProfileList(preserved: ConstPtr, ppprofilelist: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon != null) (windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmGetProfileList(preserved.rawAddress.toString(), ppprofilelist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcmQueryProperty(pinterface: ConstPtr, strprofilename: Pcwstr, property: WcmProperty, preserved: ConstPtr, pdwdatasize: MutPtr, ppdata: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon != null) (windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmQueryProperty(pinterface.rawAddress.toString(), strprofilename.rawAddress.toString(), property, preserved.rawAddress.toString(), pdwdatasize.rawAddress.toString(), ppdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcmSetProfileList(pprofilelist: ConstPtr, dwposition: UInt, fignoreunknownprofiles: Bool, preserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon != null) (windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmSetProfileList(pprofilelist.rawAddress.toString(), dwposition.toInt(), fignoreunknownprofiles, preserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcmSetProperty(pinterface: ConstPtr, strprofilename: Pcwstr, property: WcmProperty, preserved: ConstPtr, dwdatasize: UInt, pbdata: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon != null) (windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmSetProperty(pinterface.rawAddress.toString(), strprofilename.rawAddress.toString(), property, preserved.rawAddress.toString(), dwdatasize.toInt(), pbdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
