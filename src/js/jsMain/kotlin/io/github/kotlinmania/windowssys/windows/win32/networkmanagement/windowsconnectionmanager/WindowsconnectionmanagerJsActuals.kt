@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private val _windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun FreeInterfaceContextTable(interfacecontexttable: Long) {
    if (_windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon != null) {
        _windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_FreeInterfaceContextTable(interfacecontexttable.toString())
    }
}

public actual fun GetInterfaceContextTableForHostName(hostname: PCWSTR, proxyname: PCWSTR, flags: UInt, connectionprofilefilterrawdata: Long, connectionprofilefilterrawdatasize: UInt, interfacecontexttable: Long): HRESULT =
    if (_windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon != null) (_windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_GetInterfaceContextTableForHostName(hostname.toString(), proxyname.toString(), flags.toInt(), connectionprofilefilterrawdata.toString(), connectionprofilefilterrawdatasize.toInt(), interfacecontexttable.toString()) as Int) else 0

public actual fun OnDemandGetRoutingHint(destinationhostname: PCWSTR, interfaceindex: Long): HRESULT =
    if (_windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon != null) (_windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_OnDemandGetRoutingHint(destinationhostname.toString(), interfaceindex.toString()) as Int) else 0

public actual fun OnDemandRegisterNotification(callback: ONDEMAND_NOTIFICATION_CALLBACK, callbackcontext: Long, registrationhandle: Long): HRESULT =
    if (_windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon != null) (_windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_OnDemandRegisterNotification(callback.toLong().toString(), callbackcontext.toString(), registrationhandle.toString()) as Int) else 0

public actual fun OnDemandUnRegisterNotification(registrationhandle: HANDLE): HRESULT =
    if (_windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon != null) (_windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_OnDemandUnRegisterNotification(registrationhandle.toString()) as Int) else 0

public actual fun WcmFreeMemory(pmemory: Long) {
    if (_windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon != null) {
        _windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_WcmFreeMemory(pmemory.toString())
    }
}

public actual fun WcmGetProfileList(preserved: Long, ppprofilelist: Long): UInt =
    if (_windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon != null) (_windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_WcmGetProfileList(preserved.toString(), ppprofilelist.toString()) as Int).toUInt() else 0u

public actual fun WcmQueryProperty(pinterface: Long, strprofilename: PCWSTR, property: WCM_PROPERTY, preserved: Long, pdwdatasize: Long, ppdata: Long): UInt =
    if (_windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon != null) (_windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_WcmQueryProperty(pinterface.toString(), strprofilename.toString(), property, preserved.toString(), pdwdatasize.toString(), ppdata.toString()) as Int).toUInt() else 0u

public actual fun WcmSetProfileList(pprofilelist: Long, dwposition: UInt, fignoreunknownprofiles: BOOL, preserved: Long): UInt =
    if (_windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon != null) (_windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_WcmSetProfileList(pprofilelist.toString(), dwposition.toInt(), fignoreunknownprofiles, preserved.toString()) as Int).toUInt() else 0u

public actual fun WcmSetProperty(pinterface: Long, strprofilename: PCWSTR, property: WCM_PROPERTY, preserved: Long, dwdatasize: UInt, pbdata: Long): UInt =
    if (_windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon != null) (_windowsWin32NetworkmanagementWindowsconnectionmanagerNapiAddon.windowssys_windows_win32_networkmanagement_windowsconnectionmanager_WcmSetProperty(pinterface.toString(), strprofilename.toString(), property, preserved.toString(), dwdatasize.toInt(), pbdata.toString()) as Int).toUInt() else 0u
