@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.Socket
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SocketAddressList
import io.github.kotlinmania.windowssys.windows.win32.security.Sid

private val windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun ndfCancelIncident(handle: ConstPtr<CVoid>): Hresult =
    if (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon != null) (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCancelIncident(handle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfCloseIncident(handle: MutPtr<CVoid>): Hresult =
    if (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon != null) (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCloseIncident(handle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfCreateConnectivityIncident(handle: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon != null) (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateConnectivityIncident(handle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfCreateDNSIncident(hostname: Pcwstr, querytype: UShort, handle: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon != null) (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateDNSIncident(hostname.rawAddress.toString(), querytype.toInt(), handle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfCreateGroupingIncident(cloudname: Pcwstr, groupname: Pcwstr, identity: Pcwstr, invitation: Pcwstr, addresses: ConstPtr<SocketAddressList>, appid: Pcwstr, handle: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon != null) (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateGroupingIncident(cloudname.rawAddress.toString(), groupname.rawAddress.toString(), identity.rawAddress.toString(), invitation.rawAddress.toString(), addresses.rawAddress.toString(), appid.rawAddress.toString(), handle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfCreateIncident(helperclassname: Pcwstr, celt: UInt, attributes: ConstPtr<HelperAttribute>, handle: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon != null) (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateIncident(helperclassname.rawAddress.toString(), celt.toInt(), attributes.rawAddress.toString(), handle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfCreateNetConnectionIncident(handle: MutPtr<MutPtr<CVoid>>, id: Guid): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfCreatePnrpIncident(cloudname: Pcwstr, peername: Pcwstr, diagnosepublish: Bool, appid: Pcwstr, handle: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon != null) (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreatePnrpIncident(cloudname.rawAddress.toString(), peername.rawAddress.toString(), diagnosepublish, appid.rawAddress.toString(), handle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfCreateSharingIncident(uncpath: Pcwstr, handle: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon != null) (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateSharingIncident(uncpath.rawAddress.toString(), handle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfCreateWebIncident(url: Pcwstr, handle: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon != null) (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateWebIncident(url.rawAddress.toString(), handle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfCreateWebIncidentEx(url: Pcwstr, usewinhttp: Bool, modulename: Pcwstr, handle: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon != null) (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateWebIncidentEx(url.rawAddress.toString(), usewinhttp, modulename.rawAddress.toString(), handle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfCreateWinSockIncident(sock: Socket, host: Pcwstr, port: UShort, appid: Pcwstr, userid: ConstPtr<Sid>, handle: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon != null) (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateWinSockIncident(sock.toString(), host.rawAddress.toString(), port.toInt(), appid.rawAddress.toString(), userid.rawAddress.toString(), handle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfDiagnoseIncident(handle: ConstPtr<CVoid>, rootcausecount: MutPtr<UInt>, rootcauses: MutPtr<MutPtr<RootCauseInfo>>, dwwait: UInt, dwflags: UInt): Hresult =
    if (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon != null) (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfDiagnoseIncident(handle.rawAddress.toString(), rootcausecount.rawAddress.toString(), rootcauses.rawAddress.toString(), dwwait.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfExecuteDiagnosis(handle: ConstPtr<CVoid>, hwnd: Hwnd): Hresult =
    if (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon != null) (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfExecuteDiagnosis(handle.rawAddress.toString(), hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfGetTraceFile(handle: ConstPtr<CVoid>, tracefilelocation: MutPtr<Pcwstr>): Hresult =
    if (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon != null) (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfGetTraceFile(handle.rawAddress.toString(), tracefilelocation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfRepairIncident(handle: ConstPtr<CVoid>, repairex: ConstPtr<RepairInfoEx>, dwwait: UInt): Hresult =
    if (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon != null) (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfRepairIncident(handle.rawAddress.toString(), repairex.rawAddress.toString(), dwwait.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
