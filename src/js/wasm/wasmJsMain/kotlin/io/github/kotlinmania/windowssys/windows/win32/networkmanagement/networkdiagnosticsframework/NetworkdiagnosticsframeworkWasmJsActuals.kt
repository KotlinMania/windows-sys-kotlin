@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

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

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon(): Boolean

private val windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAvailable: Boolean = initWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCancelIncident(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCancelIncident(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCloseIncident(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCloseIncident(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateConnectivityIncident(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateConnectivityIncident(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateDNSIncident(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateDNSIncident(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateGroupingIncident(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateGroupingIncident(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateIncident(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateIncident(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreatePnrpIncident(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreatePnrpIncident(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateSharingIncident(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateSharingIncident(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateWebIncident(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateWebIncident(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateWebIncidentEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateWebIncidentEx(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateWinSockIncident(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateWinSockIncident(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfDiagnoseIncident(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfDiagnoseIncident(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfExecuteDiagnosis(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfExecuteDiagnosis(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfGetTraceFile(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfGetTraceFile(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfRepairIncident(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfRepairIncident(p0: String, p1: String, p2: Int): Int

public actual fun ndfCancelIncident(handle: ConstPtr<CVoid>): Hresult =
    if (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCancelIncident(handle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfCloseIncident(handle: MutPtr<CVoid>): Hresult =
    if (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCloseIncident(handle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfCreateConnectivityIncident(handle: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateConnectivityIncident(handle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfCreateDNSIncident(hostname: Pcwstr, querytype: UShort, handle: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateDNSIncident(hostname.rawAddress.toString(), querytype.toInt(), handle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfCreateGroupingIncident(cloudname: Pcwstr, groupname: Pcwstr, identity: Pcwstr, invitation: Pcwstr, addresses: ConstPtr<SocketAddressList>, appid: Pcwstr, handle: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateGroupingIncident(cloudname.rawAddress.toString(), groupname.rawAddress.toString(), identity.rawAddress.toString(), invitation.rawAddress.toString(), addresses.rawAddress.toString(), appid.rawAddress.toString(), handle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfCreateIncident(helperclassname: Pcwstr, celt: UInt, attributes: ConstPtr<HelperAttribute>, handle: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateIncident(helperclassname.rawAddress.toString(), celt.toInt(), attributes.rawAddress.toString(), handle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfCreateNetConnectionIncident(handle: MutPtr<MutPtr<CVoid>>, id: Guid): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfCreatePnrpIncident(cloudname: Pcwstr, peername: Pcwstr, diagnosepublish: Bool, appid: Pcwstr, handle: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreatePnrpIncident(cloudname.rawAddress.toString(), peername.rawAddress.toString(), diagnosepublish, appid.rawAddress.toString(), handle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfCreateSharingIncident(uncpath: Pcwstr, handle: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateSharingIncident(uncpath.rawAddress.toString(), handle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfCreateWebIncident(url: Pcwstr, handle: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateWebIncident(url.rawAddress.toString(), handle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfCreateWebIncidentEx(url: Pcwstr, usewinhttp: Bool, modulename: Pcwstr, handle: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateWebIncidentEx(url.rawAddress.toString(), usewinhttp, modulename.rawAddress.toString(), handle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfCreateWinSockIncident(sock: Socket, host: Pcwstr, port: UShort, appid: Pcwstr, userid: ConstPtr<Sid>, handle: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateWinSockIncident(sock.toString(), host.rawAddress.toString(), port.toInt(), appid.rawAddress.toString(), userid.rawAddress.toString(), handle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfDiagnoseIncident(handle: ConstPtr<CVoid>, rootcausecount: MutPtr<UInt>, rootcauses: MutPtr<MutPtr<RootCauseInfo>>, dwwait: UInt, dwflags: UInt): Hresult =
    if (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfDiagnoseIncident(handle.rawAddress.toString(), rootcausecount.rawAddress.toString(), rootcauses.rawAddress.toString(), dwwait.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfExecuteDiagnosis(handle: ConstPtr<CVoid>, hwnd: Hwnd): Hresult =
    if (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfExecuteDiagnosis(handle.rawAddress.toString(), hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfGetTraceFile(handle: ConstPtr<CVoid>, tracefilelocation: MutPtr<Pcwstr>): Hresult =
    if (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfGetTraceFile(handle.rawAddress.toString(), tracefilelocation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfRepairIncident(handle: ConstPtr<CVoid>, repairex: ConstPtr<RepairInfoEx>, dwwait: UInt): Hresult =
    if (windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfRepairIncident(handle.rawAddress.toString(), repairex.rawAddress.toString(), dwwait.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")
