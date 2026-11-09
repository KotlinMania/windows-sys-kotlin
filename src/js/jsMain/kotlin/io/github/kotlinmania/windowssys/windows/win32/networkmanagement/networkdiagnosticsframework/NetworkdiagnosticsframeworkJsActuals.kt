@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SOCKET

private val _windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun NdfCancelIncident(handle: Long): HRESULT =
    if (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon != null) (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCancelIncident(handle.toString()) as Int) else 0

public actual fun NdfCloseIncident(handle: Long): HRESULT =
    if (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon != null) (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCloseIncident(handle.toString()) as Int) else 0

public actual fun NdfCreateConnectivityIncident(handle: Long): HRESULT =
    if (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon != null) (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateConnectivityIncident(handle.toString()) as Int) else 0

public actual fun NdfCreateDNSIncident(hostname: PCWSTR, querytype: UShort, handle: Long): HRESULT =
    if (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon != null) (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateDNSIncident(hostname.toString(), querytype.toInt(), handle.toString()) as Int) else 0

public actual fun NdfCreateGroupingIncident(cloudname: PCWSTR, groupname: PCWSTR, identity: PCWSTR, invitation: PCWSTR, addresses: Long, appid: PCWSTR, handle: Long): HRESULT =
    if (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon != null) (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateGroupingIncident(cloudname.toString(), groupname.toString(), identity.toString(), invitation.toString(), addresses.toString(), appid.toString(), handle.toString()) as Int) else 0

public actual fun NdfCreateIncident(helperclassname: PCWSTR, celt: UInt, attributes: Long, handle: Long): HRESULT =
    if (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon != null) (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateIncident(helperclassname.toString(), celt.toInt(), attributes.toString(), handle.toString()) as Int) else 0

public actual fun NdfCreateNetConnectionIncident(handle: Long, id: GUID): HRESULT =
    0

public actual fun NdfCreatePnrpIncident(cloudname: PCWSTR, peername: PCWSTR, diagnosepublish: BOOL, appid: PCWSTR, handle: Long): HRESULT =
    if (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon != null) (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreatePnrpIncident(cloudname.toString(), peername.toString(), diagnosepublish, appid.toString(), handle.toString()) as Int) else 0

public actual fun NdfCreateSharingIncident(uncpath: PCWSTR, handle: Long): HRESULT =
    if (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon != null) (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateSharingIncident(uncpath.toString(), handle.toString()) as Int) else 0

public actual fun NdfCreateWebIncident(url: PCWSTR, handle: Long): HRESULT =
    if (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon != null) (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateWebIncident(url.toString(), handle.toString()) as Int) else 0

public actual fun NdfCreateWebIncidentEx(url: PCWSTR, usewinhttp: BOOL, modulename: PCWSTR, handle: Long): HRESULT =
    if (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon != null) (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateWebIncidentEx(url.toString(), usewinhttp, modulename.toString(), handle.toString()) as Int) else 0

public actual fun NdfCreateWinSockIncident(sock: SOCKET, host: PCWSTR, port: UShort, appid: PCWSTR, userid: Long, handle: Long): HRESULT =
    if (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon != null) (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateWinSockIncident(sock.toString(), host.toString(), port.toInt(), appid.toString(), userid.toString(), handle.toString()) as Int) else 0

public actual fun NdfDiagnoseIncident(handle: Long, rootcausecount: Long, rootcauses: Long, dwwait: UInt, dwflags: UInt): HRESULT =
    if (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon != null) (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfDiagnoseIncident(handle.toString(), rootcausecount.toString(), rootcauses.toString(), dwwait.toInt(), dwflags.toInt()) as Int) else 0

public actual fun NdfExecuteDiagnosis(handle: Long, hwnd: HWND): HRESULT =
    if (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon != null) (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfExecuteDiagnosis(handle.toString(), hwnd.toString()) as Int) else 0

public actual fun NdfGetTraceFile(handle: Long, tracefilelocation: Long): HRESULT =
    if (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon != null) (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfGetTraceFile(handle.toString(), tracefilelocation.toString()) as Int) else 0

public actual fun NdfRepairIncident(handle: Long, repairex: Long, dwwait: UInt): HRESULT =
    if (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon != null) (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfRepairIncident(handle.toString(), repairex.toString(), dwwait.toInt()) as Int) else 0
