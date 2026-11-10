@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private val _windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun freeInterfaceContextTable(interfacecontexttable: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon != null) {
        _windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_freeInterfaceContextTable((interfacecontexttable?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getInterfaceContextTableForHostName(hostname: Pcwstr, proxyname: Pcwstr, flags: UInt, connectionprofilefilterrawdata: COpaquePointer?, connectionprofilefilterrawdatasize: UInt, interfacecontexttable: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon != null) (_windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_getInterfaceContextTableForHostName((hostname?.value ?: 0L).toString(), (proxyname?.value ?: 0L).toString(), flags.toInt(), (connectionprofilefilterrawdata?.value ?: 0L).toString(), connectionprofilefilterrawdatasize.toInt(), (interfacecontexttable?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun onDemandGetRoutingHint(destinationhostname: Pcwstr, interfaceindex: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon != null) (_windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_onDemandGetRoutingHint((destinationhostname?.value ?: 0L).toString(), (interfaceindex?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun onDemandRegisterNotification(callback: OndemandNotificationCallback, callbackcontext: COpaquePointer?, registrationhandle: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon != null) (_windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_onDemandRegisterNotification(0L.toString(), (callbackcontext?.value ?: 0L).toString(), (registrationhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun onDemandUnRegisterNotification(registrationhandle: Handle): Hresult =
    if (_windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon != null) (_windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_onDemandUnRegisterNotification((registrationhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcmFreeMemory(pmemory: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon != null) {
        _windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_wcmFreeMemory((pmemory?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wcmGetProfileList(preserved: COpaquePointer?, ppprofilelist: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon != null) (_windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_wcmGetProfileList((preserved?.value ?: 0L).toString(), (ppprofilelist?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcmQueryProperty(pinterface: COpaquePointer?, strprofilename: Pcwstr, property: WcmProperty, preserved: COpaquePointer?, pdwdatasize: COpaquePointer?, ppdata: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon != null) (_windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_wcmQueryProperty((pinterface?.value ?: 0L).toString(), (strprofilename?.value ?: 0L).toString(), property, (preserved?.value ?: 0L).toString(), (pdwdatasize?.value ?: 0L).toString(), (ppdata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcmSetProfileList(pprofilelist: COpaquePointer?, dwposition: UInt, fignoreunknownprofiles: Bool, preserved: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon != null) (_windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_wcmSetProfileList((pprofilelist?.value ?: 0L).toString(), dwposition.toInt(), fignoreunknownprofiles, (preserved?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wcmSetProperty(pinterface: COpaquePointer?, strprofilename: Pcwstr, property: WcmProperty, preserved: COpaquePointer?, dwdatasize: UInt, pbdata: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon != null) (_windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_wcmSetProperty((pinterface?.value ?: 0L).toString(), (strprofilename?.value ?: 0L).toString(), property, (preserved?.value ?: 0L).toString(), dwdatasize.toInt(), (pbdata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
