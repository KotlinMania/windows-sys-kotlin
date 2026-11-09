@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.PSID

private val _windowsWin32NetworkmanagementWindowsfirewallNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun NcFreeNetconProperties(pprops: Long) {
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) {
        _windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssys_windows_win32_networkmanagement_windowsfirewall_NcFreeNetconProperties(pprops.toString())
    }
}

public actual fun NcIsValidConnectionName(pszwname: PCWSTR): BOOL =
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssys_windows_win32_networkmanagement_windowsfirewall_NcIsValidConnectionName(pszwname.toString()) as Int) else 0

public actual fun NetworkIsolationDiagnoseConnectFailureAndGetInfo(wszservername: PCWSTR, netisoerror: Long): UInt =
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationDiagnoseConnectFailureAndGetInfo(wszservername.toString(), netisoerror.toString()) as Int).toUInt() else 0u

public actual fun NetworkIsolationEnumAppContainers(flags: UInt, pdwnumpublicappcs: Long, pppublicappcs: Long): UInt =
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationEnumAppContainers(flags.toInt(), pdwnumpublicappcs.toString(), pppublicappcs.toString()) as Int).toUInt() else 0u

public actual fun NetworkIsolationEnumerateAppContainerRules(newenum: Long): HRESULT =
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationEnumerateAppContainerRules(newenum.toString()) as Int) else 0

public actual fun NetworkIsolationFreeAppContainers(ppublicappcs: Long): UInt =
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationFreeAppContainers(ppublicappcs.toString()) as Int).toUInt() else 0u

public actual fun NetworkIsolationGetAppContainerConfig(pdwnumpublicappcs: Long, appcontainersids: Long): UInt =
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationGetAppContainerConfig(pdwnumpublicappcs.toString(), appcontainersids.toString()) as Int).toUInt() else 0u

public actual fun NetworkIsolationGetEnterpriseIdAsync(wszservername: PCWSTR, dwflags: UInt, context: Long, callback: PNETISO_EDP_ID_CALLBACK_FN, hoperation: Long): UInt =
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationGetEnterpriseIdAsync(wszservername.toString(), dwflags.toInt(), context.toString(), callback.toLong().toString(), hoperation.toString()) as Int).toUInt() else 0u

public actual fun NetworkIsolationGetEnterpriseIdClose(hoperation: HANDLE, bwaitforoperation: BOOL): UInt =
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationGetEnterpriseIdClose(hoperation.toString(), bwaitforoperation) as Int).toUInt() else 0u

public actual fun NetworkIsolationRegisterForAppContainerChanges(flags: UInt, callback: PAC_CHANGES_CALLBACK_FN, context: Long, registrationobject: Long): UInt =
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationRegisterForAppContainerChanges(flags.toInt(), callback.toLong().toString(), context.toString(), registrationobject.toString()) as Int).toUInt() else 0u

public actual fun NetworkIsolationSetAppContainerConfig(dwnumpublicappcs: UInt, appcontainersids: Long): UInt =
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationSetAppContainerConfig(dwnumpublicappcs.toInt(), appcontainersids.toString()) as Int).toUInt() else 0u

public actual fun NetworkIsolationSetupAppContainerBinaries(applicationcontainersid: PSID, packagefullname: PCWSTR, packagefolder: PCWSTR, displayname: PCWSTR, bbinariesfullycomputed: BOOL, binaries: Long, binariescount: UInt): HRESULT =
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationSetupAppContainerBinaries(applicationcontainersid.toString(), packagefullname.toString(), packagefolder.toString(), displayname.toString(), bbinariesfullycomputed, binaries.toString(), binariescount.toInt()) as Int) else 0

public actual fun NetworkIsolationUnregisterForAppContainerChanges(registrationobject: HANDLE): UInt =
    if (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon != null) (_windowsWin32NetworkmanagementWindowsfirewallNapiAddon.windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationUnregisterForAppContainerChanges(registrationobject.toString()) as Int).toUInt() else 0u
