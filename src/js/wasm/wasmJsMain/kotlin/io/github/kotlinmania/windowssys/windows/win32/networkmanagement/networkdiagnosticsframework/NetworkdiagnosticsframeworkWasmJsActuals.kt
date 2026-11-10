@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.Socket

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon(): Boolean

private val _windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAvailable: Boolean = _initWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCancelIncident(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCancelIncident(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCloseIncident(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCloseIncident(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateConnectivityIncident(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateConnectivityIncident(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateDNSIncident(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateDNSIncident(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateGroupingIncident(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateGroupingIncident(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateIncident(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateIncident(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreatePnrpIncident(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreatePnrpIncident(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateSharingIncident(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateSharingIncident(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateWebIncident(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateWebIncident(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateWebIncidentEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateWebIncidentEx(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateWinSockIncident(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateWinSockIncident(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfDiagnoseIncident(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfDiagnoseIncident(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfExecuteDiagnosis(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfExecuteDiagnosis(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfGetTraceFile(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfGetTraceFile(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfRepairIncident(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfRepairIncident(p0: String, p1: String, p2: Int): Int

public actual fun ndfCancelIncident(handle: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCancelIncident((handle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfCloseIncident(handle: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCloseIncident((handle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfCreateConnectivityIncident(handle: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateConnectivityIncident((handle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfCreateDNSIncident(hostname: Pcwstr, querytype: UShort, handle: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateDNSIncident((hostname?.value ?: 0L).toString(), querytype.toInt(), (handle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfCreateGroupingIncident(cloudname: Pcwstr, groupname: Pcwstr, identity: Pcwstr, invitation: Pcwstr, addresses: COpaquePointer?, appid: Pcwstr, handle: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateGroupingIncident((cloudname?.value ?: 0L).toString(), (groupname?.value ?: 0L).toString(), (identity?.value ?: 0L).toString(), (invitation?.value ?: 0L).toString(), (addresses?.value ?: 0L).toString(), (appid?.value ?: 0L).toString(), (handle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfCreateIncident(helperclassname: Pcwstr, celt: UInt, attributes: COpaquePointer?, handle: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateIncident((helperclassname?.value ?: 0L).toString(), celt.toInt(), (attributes?.value ?: 0L).toString(), (handle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfCreateNetConnectionIncident(handle: COpaquePointer?, id: Guid): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfCreatePnrpIncident(cloudname: Pcwstr, peername: Pcwstr, diagnosepublish: Bool, appid: Pcwstr, handle: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreatePnrpIncident((cloudname?.value ?: 0L).toString(), (peername?.value ?: 0L).toString(), diagnosepublish, (appid?.value ?: 0L).toString(), (handle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfCreateSharingIncident(uncpath: Pcwstr, handle: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateSharingIncident((uncpath?.value ?: 0L).toString(), (handle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfCreateWebIncident(url: Pcwstr, handle: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateWebIncident((url?.value ?: 0L).toString(), (handle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfCreateWebIncidentEx(url: Pcwstr, usewinhttp: Bool, modulename: Pcwstr, handle: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateWebIncidentEx((url?.value ?: 0L).toString(), usewinhttp, (modulename?.value ?: 0L).toString(), (handle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfCreateWinSockIncident(sock: Socket, host: Pcwstr, port: UShort, appid: Pcwstr, userid: COpaquePointer?, handle: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateWinSockIncident(sock.toString(), (host?.value ?: 0L).toString(), port.toInt(), (appid?.value ?: 0L).toString(), (userid?.value ?: 0L).toString(), (handle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfDiagnoseIncident(handle: COpaquePointer?, rootcausecount: COpaquePointer?, rootcauses: COpaquePointer?, dwwait: UInt, dwflags: UInt): Hresult =
    if (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfDiagnoseIncident((handle?.value ?: 0L).toString(), (rootcausecount?.value ?: 0L).toString(), (rootcauses?.value ?: 0L).toString(), dwwait.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfExecuteDiagnosis(handle: COpaquePointer?, hwnd: Hwnd): Hresult =
    if (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfExecuteDiagnosis((handle?.value ?: 0L).toString(), (hwnd?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfGetTraceFile(handle: COpaquePointer?, tracefilelocation: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfGetTraceFile((handle?.value ?: 0L).toString(), (tracefilelocation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ndfRepairIncident(handle: COpaquePointer?, repairex: COpaquePointer?, dwwait: UInt): Hresult =
    if (_windowsWin32NetworkmanagementNetworkdiagnosticsframeworkNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfRepairIncident((handle?.value ?: 0L).toString(), (repairex?.value ?: 0L).toString(), dwwait.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")
