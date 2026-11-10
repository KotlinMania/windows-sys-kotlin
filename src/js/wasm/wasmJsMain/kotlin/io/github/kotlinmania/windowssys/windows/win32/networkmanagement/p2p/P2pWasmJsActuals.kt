@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32NetworkmanagementP2pNapiAddon(): Boolean

private val _windowsWin32NetworkmanagementP2pNapiAvailable: Boolean = _initWindowsWin32NetworkmanagementP2pNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_drtClose(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_drtClose(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_drtContinueSearch(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_drtContinueSearch(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_drtCreateDerivedKey(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_drtCreateDerivedKey(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_drtCreateDerivedKeySecurityProvider(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_drtCreateDerivedKeySecurityProvider(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_drtCreateDnsBootstrapResolver(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_drtCreateDnsBootstrapResolver(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_drtCreateIpv6UdpTransport(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_drtCreateIpv6UdpTransport(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_drtCreateNullSecurityProvider(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_drtCreateNullSecurityProvider(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_drtCreatePnrpBootstrapResolver(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_drtCreatePnrpBootstrapResolver(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_drtDeleteDerivedKeySecurityProvider(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_drtDeleteDerivedKeySecurityProvider(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_drtDeleteDnsBootstrapResolver(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_drtDeleteDnsBootstrapResolver(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_drtDeleteIpv6UdpTransport(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_drtDeleteIpv6UdpTransport(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_drtDeleteNullSecurityProvider(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_drtDeleteNullSecurityProvider(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_drtDeletePnrpBootstrapResolver(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_drtDeletePnrpBootstrapResolver(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_drtEndSearch(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_drtEndSearch(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_drtGetEventData(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_drtGetEventData(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_drtGetEventDataSize(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_drtGetEventDataSize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_drtGetInstanceName(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_drtGetInstanceName(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_drtGetInstanceNameSize(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_drtGetInstanceNameSize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_drtGetSearchPath(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_drtGetSearchPath(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_drtGetSearchPathSize(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_drtGetSearchPathSize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_drtGetSearchResult(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_drtGetSearchResult(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_drtGetSearchResultSize(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_drtGetSearchResultSize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_drtOpen(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_drtOpen(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_drtRegisterKey(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_drtRegisterKey(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_drtStartSearch(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_drtStartSearch(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_drtUnregisterKey(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_drtUnregisterKey(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_drtUpdateKey(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_drtUpdateKey(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabAddContact(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabAddContact(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabAsyncInviteContact(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabAsyncInviteContact(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabAsyncInviteEndpoint(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabAsyncInviteEndpoint(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabCancelInvitation(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabCancelInvitation(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabCloseHandle(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabCloseHandle(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabDeleteContact(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabDeleteContact(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabDeleteEndpointData(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabDeleteEndpointData(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabDeleteObject(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabDeleteObject(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumApplicationRegistrationInfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumApplicationRegistrationInfo(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumApplications(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumApplications(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumContacts(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumContacts(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumEndpoints(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumEndpoints(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumObjects(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumObjects(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumPeopleNearMe(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumPeopleNearMe(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabExportContact(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabExportContact(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabGetAppLaunchInfo(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabGetAppLaunchInfo(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabGetApplicationRegistrationInfo(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabGetApplicationRegistrationInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabGetContact(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabGetContact(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabGetEndpointName(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabGetEndpointName(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabGetEventData(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabGetEventData(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabGetInvitationResponse(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabGetInvitationResponse(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabGetPresenceInfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabGetPresenceInfo(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabGetSigninOptions(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabGetSigninOptions(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabInviteContact(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabInviteContact(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabInviteEndpoint(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabInviteEndpoint(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabParseContact(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabParseContact(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabQueryContactData(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabQueryContactData(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabRefreshEndpointData(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabRefreshEndpointData(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabRegisterApplication(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabRegisterApplication(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabRegisterEvent(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabRegisterEvent(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabSetEndpointName(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabSetEndpointName(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabSetObject(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabSetObject(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabSetPresenceInfo(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabSetPresenceInfo(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabShutdown()")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabShutdown(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabSignin(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabSignin(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabSignout(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabSignout(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabStartup(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabStartup(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabSubscribeEndpointData(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabSubscribeEndpointData(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabUnregisterApplication(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabUnregisterApplication(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabUnregisterEvent(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabUnregisterEvent(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabUnsubscribeEndpointData(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabUnsubscribeEndpointData(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCollabUpdateContact(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabUpdateContact(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerCreatePeerName(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCreatePeerName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerDistClientAddContentInformation(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistClientAddContentInformation(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerDistClientAddData(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistClientAddData(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerDistClientBlockRead(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistClientBlockRead(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerDistClientCancelAsyncOperation(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistClientCancelAsyncOperation(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerDistClientCloseContent(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistClientCloseContent(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerDistClientCompleteContentInformation(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistClientCompleteContentInformation(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerDistClientFlushContent(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistClientFlushContent(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerDistClientGetInformationByHandle(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistClientGetInformationByHandle(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerDistClientOpenContent(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistClientOpenContent(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerDistClientStreamRead(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistClientStreamRead(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerDistGetOverlappedResult(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistGetOverlappedResult(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerDistGetStatus(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistGetStatus(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerDistGetStatusEx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistGetStatusEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerDistRegisterForStatusChangeNotification(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistRegisterForStatusChangeNotification(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerDistRegisterForStatusChangeNotificationEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistRegisterForStatusChangeNotificationEx(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerDistServerCancelAsyncOperation(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistServerCancelAsyncOperation(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerDistServerCloseContentInformation(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistServerCloseContentInformation(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerDistServerCloseStreamHandle(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistServerCloseStreamHandle(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerDistServerOpenContentInformation(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistServerOpenContentInformation(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerDistServerOpenContentInformationEx(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistServerOpenContentInformationEx(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerDistServerPublishAddToStream(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistServerPublishAddToStream(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerDistServerPublishCompleteStream(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistServerPublishCompleteStream(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerDistServerPublishStream(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistServerPublishStream(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerDistServerRetrieveContentInformation(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistServerRetrieveContentInformation(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerDistServerUnpublish(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistServerUnpublish(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerDistShutdown(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistShutdown(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerDistStartup(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistStartup(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerDistUnregisterForStatusChangeNotification(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistUnregisterForStatusChangeNotification(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerEndEnumeration(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerEndEnumeration(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerEnumGroups(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerEnumGroups(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerEnumIdentities(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerEnumIdentities(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerFreeData(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerFreeData(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGetItemCount(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGetItemCount(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGetNextItem(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGetNextItem(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGraphAddRecord(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphAddRecord(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGraphClose(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphClose(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGraphCloseDirectConnection(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphCloseDirectConnection(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGraphConnect(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphConnect(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGraphCreate(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGraphDelete(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphDelete(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGraphDeleteRecord(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphDeleteRecord(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGraphEndEnumeration(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphEndEnumeration(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGraphEnumConnections(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphEnumConnections(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGraphEnumNodes(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphEnumNodes(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGraphEnumRecords(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphEnumRecords(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGraphExportDatabase(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphExportDatabase(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGraphFreeData(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphFreeData(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGraphGetEventData(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphGetEventData(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGraphGetItemCount(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphGetItemCount(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGraphGetNextItem(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphGetNextItem(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGraphGetNodeInfo(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphGetNodeInfo(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGraphGetProperties(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphGetProperties(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGraphGetRecord(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphGetRecord(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGraphGetStatus(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphGetStatus(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGraphImportDatabase(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphImportDatabase(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGraphListen(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphListen(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGraphOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphOpen(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGraphOpenDirectConnection(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphOpenDirectConnection(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGraphPeerTimeToUniversalTime(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphPeerTimeToUniversalTime(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGraphRegisterEvent(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphRegisterEvent(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGraphSearchRecords(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphSearchRecords(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGraphSendData(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphSendData(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGraphSetNodeAttributes(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphSetNodeAttributes(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGraphSetPresence(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphSetPresence(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGraphSetProperties(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphSetProperties(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGraphShutdown()")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphShutdown(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGraphStartup(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphStartup(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGraphUniversalTimeToPeerTime(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphUniversalTimeToPeerTime(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGraphUnregisterEvent(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphUnregisterEvent(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGraphUpdateRecord(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphUpdateRecord(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGraphValidateDeferredRecords(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphValidateDeferredRecords(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGroupAddRecord(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupAddRecord(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGroupClose(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupClose(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGroupCloseDirectConnection(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupCloseDirectConnection(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGroupConnect(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupConnect(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGroupConnectByAddress(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupConnectByAddress(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGroupCreate(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupCreate(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGroupCreateInvitation(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupCreateInvitation(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGroupCreatePasswordInvitation(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupCreatePasswordInvitation(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGroupDelete(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupDelete(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGroupDeleteRecord(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupDeleteRecord(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGroupEnumConnections(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupEnumConnections(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGroupEnumMembers(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupEnumMembers(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGroupEnumRecords(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupEnumRecords(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGroupExportConfig(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupExportConfig(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGroupExportDatabase(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupExportDatabase(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGroupGetEventData(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupGetEventData(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGroupGetProperties(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupGetProperties(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGroupGetRecord(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupGetRecord(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGroupGetStatus(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupGetStatus(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGroupImportConfig(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupImportConfig(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGroupImportDatabase(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupImportDatabase(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGroupIssueCredentials(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupIssueCredentials(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGroupJoin(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupJoin(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGroupOpen(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupOpen(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGroupOpenDirectConnection(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupOpenDirectConnection(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGroupParseInvitation(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupParseInvitation(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGroupPasswordJoin(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupPasswordJoin(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGroupPeerTimeToUniversalTime(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupPeerTimeToUniversalTime(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGroupRegisterEvent(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupRegisterEvent(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGroupResumePasswordAuthentication(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupResumePasswordAuthentication(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGroupSearchRecords(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupSearchRecords(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGroupSendData(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupSendData(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGroupSetProperties(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupSetProperties(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGroupShutdown()")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupShutdown(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGroupStartup(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupStartup(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGroupUniversalTimeToPeerTime(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupUniversalTimeToPeerTime(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGroupUnregisterEvent(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupUnregisterEvent(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerGroupUpdateRecord(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupUpdateRecord(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerHostNameToPeerName(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerHostNameToPeerName(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerIdentityCreate(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerIdentityCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerIdentityDelete(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerIdentityDelete(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerIdentityExport(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerIdentityExport(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerIdentityGetCryptKey(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerIdentityGetCryptKey(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerIdentityGetDefault(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerIdentityGetDefault(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerIdentityGetFriendlyName(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerIdentityGetFriendlyName(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerIdentityGetXML(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerIdentityGetXML(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerIdentityImport(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerIdentityImport(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerIdentitySetFriendlyName(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerIdentitySetFriendlyName(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerNameToPeerHostName(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerNameToPeerHostName(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerPnrpEndResolve(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerPnrpEndResolve(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerPnrpGetCloudInfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerPnrpGetCloudInfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerPnrpGetEndpoint(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerPnrpGetEndpoint(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerPnrpRegister(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerPnrpRegister(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerPnrpResolve(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerPnrpResolve(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerPnrpShutdown()")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerPnrpShutdown(): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerPnrpStartResolve(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerPnrpStartResolve(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerPnrpStartup(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerPnrpStartup(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerPnrpUnregister(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerPnrpUnregister(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_p2p_peerPnrpUpdateRegistration(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_p2p_peerPnrpUpdateRegistration(p0: String, p1: String): Int

public actual fun drtClose(hdrt: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_p2p_drtClose((hdrt?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun drtContinueSearch(hsearchcontext: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_drtContinueSearch((hsearchcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtCreateDerivedKey(plocalcert: COpaquePointer?, pkey: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_drtCreateDerivedKey((plocalcert?.value ?: 0L).toString(), (pkey?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtCreateDerivedKeySecurityProvider(prootcert: COpaquePointer?, plocalcert: COpaquePointer?, ppsecurityprovider: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_drtCreateDerivedKeySecurityProvider((prootcert?.value ?: 0L).toString(), (plocalcert?.value ?: 0L).toString(), (ppsecurityprovider?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtCreateDnsBootstrapResolver(port: UShort, pwszaddress: Pcwstr, ppmodule: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_drtCreateDnsBootstrapResolver(port.toInt(), (pwszaddress?.value ?: 0L).toString(), (ppmodule?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtCreateIpv6UdpTransport(scope: DrtScope, dwscopeid: UInt, dwlocalitythreshold: UInt, pwport: COpaquePointer?, phtransport: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_drtCreateIpv6UdpTransport(scope, dwscopeid.toInt(), dwlocalitythreshold.toInt(), (pwport?.value ?: 0L).toString(), (phtransport?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtCreateNullSecurityProvider(ppsecurityprovider: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_drtCreateNullSecurityProvider((ppsecurityprovider?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtCreatePnrpBootstrapResolver(fpublish: Bool, pwzpeername: Pcwstr, pwzcloudname: Pcwstr, pwzpublishingidentity: Pcwstr, ppresolver: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_drtCreatePnrpBootstrapResolver(fpublish, (pwzpeername?.value ?: 0L).toString(), (pwzcloudname?.value ?: 0L).toString(), (pwzpublishingidentity?.value ?: 0L).toString(), (ppresolver?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtDeleteDerivedKeySecurityProvider(psecurityprovider: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_p2p_drtDeleteDerivedKeySecurityProvider((psecurityprovider?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun drtDeleteDnsBootstrapResolver(presolver: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_p2p_drtDeleteDnsBootstrapResolver((presolver?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun drtDeleteIpv6UdpTransport(htransport: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_drtDeleteIpv6UdpTransport((htransport?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtDeleteNullSecurityProvider(psecurityprovider: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_p2p_drtDeleteNullSecurityProvider((psecurityprovider?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun drtDeletePnrpBootstrapResolver(presolver: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_p2p_drtDeletePnrpBootstrapResolver((presolver?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun drtEndSearch(hsearchcontext: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_drtEndSearch((hsearchcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtGetEventData(hdrt: COpaquePointer?, uleventdatalen: UInt, peventdata: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_drtGetEventData((hdrt?.value ?: 0L).toString(), uleventdatalen.toInt(), (peventdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtGetEventDataSize(hdrt: COpaquePointer?, puleventdatalen: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_drtGetEventDataSize((hdrt?.value ?: 0L).toString(), (puleventdatalen?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtGetInstanceName(hdrt: COpaquePointer?, ulcbinstancenamesize: UInt, pwzdrtinstancename: Pwstr): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_drtGetInstanceName((hdrt?.value ?: 0L).toString(), ulcbinstancenamesize.toInt(), (pwzdrtinstancename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtGetInstanceNameSize(hdrt: COpaquePointer?, pulcbinstancenamesize: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_drtGetInstanceNameSize((hdrt?.value ?: 0L).toString(), (pulcbinstancenamesize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtGetSearchPath(hsearchcontext: COpaquePointer?, ulsearchpathsize: UInt, psearchpath: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_drtGetSearchPath((hsearchcontext?.value ?: 0L).toString(), ulsearchpathsize.toInt(), (psearchpath?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtGetSearchPathSize(hsearchcontext: COpaquePointer?, pulsearchpathsize: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_drtGetSearchPathSize((hsearchcontext?.value ?: 0L).toString(), (pulsearchpathsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtGetSearchResult(hsearchcontext: COpaquePointer?, ulsearchresultsize: UInt, psearchresult: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_drtGetSearchResult((hsearchcontext?.value ?: 0L).toString(), ulsearchresultsize.toInt(), (psearchresult?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtGetSearchResultSize(hsearchcontext: COpaquePointer?, pulsearchresultsize: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_drtGetSearchResultSize((hsearchcontext?.value ?: 0L).toString(), (pulsearchresultsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtOpen(psettings: COpaquePointer?, hevent: Handle, pvcontext: COpaquePointer?, phdrt: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_drtOpen((psettings?.value ?: 0L).toString(), (hevent?.value ?: 0L).toString(), (pvcontext?.value ?: 0L).toString(), (phdrt?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtRegisterKey(hdrt: COpaquePointer?, pregistration: COpaquePointer?, pvkeycontext: COpaquePointer?, phkeyregistration: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_drtRegisterKey((hdrt?.value ?: 0L).toString(), (pregistration?.value ?: 0L).toString(), (pvkeycontext?.value ?: 0L).toString(), (phkeyregistration?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtStartSearch(hdrt: COpaquePointer?, pkey: COpaquePointer?, pinfo: COpaquePointer?, timeout: UInt, hevent: Handle, pvcontext: COpaquePointer?, hsearchcontext: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_drtStartSearch((hdrt?.value ?: 0L).toString(), (pkey?.value ?: 0L).toString(), (pinfo?.value ?: 0L).toString(), timeout.toInt(), (hevent?.value ?: 0L).toString(), (pvcontext?.value ?: 0L).toString(), (hsearchcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtUnregisterKey(hkeyregistration: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_p2p_drtUnregisterKey((hkeyregistration?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun drtUpdateKey(hkeyregistration: COpaquePointer?, pappdata: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_drtUpdateKey((hkeyregistration?.value ?: 0L).toString(), (pappdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabAddContact(pwzcontactdata: Pcwstr, ppcontact: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabAddContact((pwzcontactdata?.value ?: 0L).toString(), (ppcontact?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabAsyncInviteContact(pccontact: COpaquePointer?, pcendpoint: COpaquePointer?, pcinvitation: COpaquePointer?, hevent: Handle, phinvitation: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabAsyncInviteContact((pccontact?.value ?: 0L).toString(), (pcendpoint?.value ?: 0L).toString(), (pcinvitation?.value ?: 0L).toString(), (hevent?.value ?: 0L).toString(), (phinvitation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabAsyncInviteEndpoint(pcendpoint: COpaquePointer?, pcinvitation: COpaquePointer?, hevent: Handle, phinvitation: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabAsyncInviteEndpoint((pcendpoint?.value ?: 0L).toString(), (pcinvitation?.value ?: 0L).toString(), (hevent?.value ?: 0L).toString(), (phinvitation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabCancelInvitation(hinvitation: Handle): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabCancelInvitation((hinvitation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabCloseHandle(hinvitation: Handle): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabCloseHandle((hinvitation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabDeleteContact(pwzpeername: Pcwstr): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabDeleteContact((pwzpeername?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabDeleteEndpointData(pcendpoint: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabDeleteEndpointData((pcendpoint?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabDeleteObject(pobjectid: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabDeleteObject((pobjectid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabEnumApplicationRegistrationInfo(registrationtype: PeerApplicationRegistrationType, phpeerenum: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumApplicationRegistrationInfo(registrationtype, (phpeerenum?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabEnumApplications(pcendpoint: COpaquePointer?, papplicationid: COpaquePointer?, phpeerenum: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumApplications((pcendpoint?.value ?: 0L).toString(), (papplicationid?.value ?: 0L).toString(), (phpeerenum?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabEnumContacts(phpeerenum: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumContacts((phpeerenum?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabEnumEndpoints(pccontact: COpaquePointer?, phpeerenum: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumEndpoints((pccontact?.value ?: 0L).toString(), (phpeerenum?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabEnumObjects(pcendpoint: COpaquePointer?, pobjectid: COpaquePointer?, phpeerenum: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumObjects((pcendpoint?.value ?: 0L).toString(), (pobjectid?.value ?: 0L).toString(), (phpeerenum?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabEnumPeopleNearMe(phpeerenum: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabEnumPeopleNearMe((phpeerenum?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabExportContact(pwzpeername: Pcwstr, ppwzcontactdata: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabExportContact((pwzpeername?.value ?: 0L).toString(), (ppwzcontactdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabGetAppLaunchInfo(pplaunchinfo: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabGetAppLaunchInfo((pplaunchinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabGetApplicationRegistrationInfo(papplicationid: COpaquePointer?, registrationtype: PeerApplicationRegistrationType, ppapplication: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabGetApplicationRegistrationInfo((papplicationid?.value ?: 0L).toString(), registrationtype, (ppapplication?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabGetContact(pwzpeername: Pcwstr, ppcontact: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabGetContact((pwzpeername?.value ?: 0L).toString(), (ppcontact?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabGetEndpointName(ppwzendpointname: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabGetEndpointName((ppwzendpointname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabGetEventData(hpeerevent: COpaquePointer?, ppeventdata: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabGetEventData((hpeerevent?.value ?: 0L).toString(), (ppeventdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabGetInvitationResponse(hinvitation: Handle, ppinvitationresponse: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabGetInvitationResponse((hinvitation?.value ?: 0L).toString(), (ppinvitationresponse?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabGetPresenceInfo(pcendpoint: COpaquePointer?, pppresenceinfo: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabGetPresenceInfo((pcendpoint?.value ?: 0L).toString(), (pppresenceinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabGetSigninOptions(pdwsigninoptions: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabGetSigninOptions((pdwsigninoptions?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabInviteContact(pccontact: COpaquePointer?, pcendpoint: COpaquePointer?, pcinvitation: COpaquePointer?, ppresponse: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabInviteContact((pccontact?.value ?: 0L).toString(), (pcendpoint?.value ?: 0L).toString(), (pcinvitation?.value ?: 0L).toString(), (ppresponse?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabInviteEndpoint(pcendpoint: COpaquePointer?, pcinvitation: COpaquePointer?, ppresponse: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabInviteEndpoint((pcendpoint?.value ?: 0L).toString(), (pcinvitation?.value ?: 0L).toString(), (ppresponse?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabParseContact(pwzcontactdata: Pcwstr, ppcontact: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabParseContact((pwzcontactdata?.value ?: 0L).toString(), (ppcontact?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabQueryContactData(pcendpoint: COpaquePointer?, ppwzcontactdata: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabQueryContactData((pcendpoint?.value ?: 0L).toString(), (ppwzcontactdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabRefreshEndpointData(pcendpoint: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabRefreshEndpointData((pcendpoint?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabRegisterApplication(pcapplication: COpaquePointer?, registrationtype: PeerApplicationRegistrationType): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabRegisterApplication((pcapplication?.value ?: 0L).toString(), registrationtype) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabRegisterEvent(hevent: Handle, ceventregistration: UInt, peventregistrations: COpaquePointer?, phpeerevent: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabRegisterEvent((hevent?.value ?: 0L).toString(), ceventregistration.toInt(), (peventregistrations?.value ?: 0L).toString(), (phpeerevent?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabSetEndpointName(pwzendpointname: Pcwstr): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabSetEndpointName((pwzendpointname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabSetObject(pcobject: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabSetObject((pcobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabSetPresenceInfo(pcpresenceinfo: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabSetPresenceInfo((pcpresenceinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabShutdown(): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabShutdown() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabSignin(hwndparent: Hwnd, dwsigninoptions: UInt): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabSignin((hwndparent?.value ?: 0L).toString(), dwsigninoptions.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabSignout(dwsigninoptions: UInt): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabSignout(dwsigninoptions.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabStartup(wversionrequested: UShort): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabStartup(wversionrequested.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabSubscribeEndpointData(pcendpoint: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabSubscribeEndpointData((pcendpoint?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabUnregisterApplication(papplicationid: COpaquePointer?, registrationtype: PeerApplicationRegistrationType): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabUnregisterApplication((papplicationid?.value ?: 0L).toString(), registrationtype) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabUnregisterEvent(hpeerevent: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabUnregisterEvent((hpeerevent?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabUnsubscribeEndpointData(pcendpoint: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabUnsubscribeEndpointData((pcendpoint?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabUpdateContact(pcontact: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCollabUpdateContact((pcontact?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCreatePeerName(pwzidentity: Pcwstr, pwzclassifier: Pcwstr, ppwzpeername: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerCreatePeerName((pwzidentity?.value ?: 0L).toString(), (pwzclassifier?.value ?: 0L).toString(), (ppwzpeername?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistClientAddContentInformation(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: UInt, pbuffer: COpaquePointer?, lpoverlapped: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistClientAddContentInformation(hpeerdist.toString(), hcontenthandle.toString(), cbnumberofbytes.toInt(), (pbuffer?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistClientAddData(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: UInt, pbuffer: COpaquePointer?, lpoverlapped: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistClientAddData(hpeerdist.toString(), hcontenthandle.toString(), cbnumberofbytes.toInt(), (pbuffer?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistClientBlockRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: UInt, pbuffer: COpaquePointer?, dwtimeoutinmilliseconds: UInt, lpoverlapped: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistClientBlockRead(hpeerdist.toString(), hcontenthandle.toString(), cbmaxnumberofbytes.toInt(), (pbuffer?.value ?: 0L).toString(), dwtimeoutinmilliseconds.toInt(), (lpoverlapped?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistClientCancelAsyncOperation(hpeerdist: Long, hcontenthandle: Long, poverlapped: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistClientCancelAsyncOperation(hpeerdist.toString(), hcontenthandle.toString(), (poverlapped?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistClientCloseContent(hpeerdist: Long, hcontenthandle: Long): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistClientCloseContent(hpeerdist.toString(), hcontenthandle.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistClientCompleteContentInformation(hpeerdist: Long, hcontenthandle: Long, lpoverlapped: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistClientCompleteContentInformation(hpeerdist.toString(), hcontenthandle.toString(), (lpoverlapped?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistClientFlushContent(hpeerdist: Long, pcontenttag: COpaquePointer?, hcompletionport: Handle, ulcompletionkey: ULong, lpoverlapped: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistClientFlushContent(hpeerdist.toString(), (pcontenttag?.value ?: 0L).toString(), (hcompletionport?.value ?: 0L).toString(), ulcompletionkey.toString(), (lpoverlapped?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistClientGetInformationByHandle(hpeerdist: Long, hcontenthandle: Long, peerdistclientinfoclass: PeerdistClientInfoByHandleClass, dwbuffersize: UInt, lpinformation: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistClientGetInformationByHandle(hpeerdist.toString(), hcontenthandle.toString(), peerdistclientinfoclass, dwbuffersize.toInt(), (lpinformation?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistClientOpenContent(hpeerdist: Long, pcontenttag: COpaquePointer?, hcompletionport: Handle, ulcompletionkey: ULong, phcontenthandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistClientOpenContent(hpeerdist.toString(), (pcontenttag?.value ?: 0L).toString(), (hcompletionport?.value ?: 0L).toString(), ulcompletionkey.toString(), (phcontenthandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistClientStreamRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: UInt, pbuffer: COpaquePointer?, dwtimeoutinmilliseconds: UInt, lpoverlapped: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistClientStreamRead(hpeerdist.toString(), hcontenthandle.toString(), cbmaxnumberofbytes.toInt(), (pbuffer?.value ?: 0L).toString(), dwtimeoutinmilliseconds.toInt(), (lpoverlapped?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistGetOverlappedResult(lpoverlapped: COpaquePointer?, lpnumberofbytestransferred: COpaquePointer?, bwait: Bool): Bool =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistGetOverlappedResult((lpoverlapped?.value ?: 0L).toString(), (lpnumberofbytestransferred?.value ?: 0L).toString(), bwait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistGetStatus(hpeerdist: Long, ppeerdiststatus: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistGetStatus(hpeerdist.toString(), (ppeerdiststatus?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistGetStatusEx(hpeerdist: Long, ppeerdiststatus: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistGetStatusEx(hpeerdist.toString(), (ppeerdiststatus?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistRegisterForStatusChangeNotification(hpeerdist: Long, hcompletionport: Handle, ulcompletionkey: ULong, lpoverlapped: COpaquePointer?, ppeerdiststatus: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistRegisterForStatusChangeNotification(hpeerdist.toString(), (hcompletionport?.value ?: 0L).toString(), ulcompletionkey.toString(), (lpoverlapped?.value ?: 0L).toString(), (ppeerdiststatus?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistRegisterForStatusChangeNotificationEx(hpeerdist: Long, hcompletionport: Handle, ulcompletionkey: ULong, lpoverlapped: COpaquePointer?, ppeerdiststatus: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistRegisterForStatusChangeNotificationEx(hpeerdist.toString(), (hcompletionport?.value ?: 0L).toString(), ulcompletionkey.toString(), (lpoverlapped?.value ?: 0L).toString(), (ppeerdiststatus?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistServerCancelAsyncOperation(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: COpaquePointer?, poverlapped: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistServerCancelAsyncOperation(hpeerdist.toString(), cbcontentidentifier.toInt(), (pcontentidentifier?.value ?: 0L).toString(), (poverlapped?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistServerCloseContentInformation(hpeerdist: Long, hcontentinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistServerCloseContentInformation(hpeerdist.toString(), hcontentinfo.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistServerCloseStreamHandle(hpeerdist: Long, hstream: Long): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistServerCloseStreamHandle(hpeerdist.toString(), hstream.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistServerOpenContentInformation(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: COpaquePointer?, ullcontentoffset: ULong, cbcontentlength: ULong, hcompletionport: Handle, ulcompletionkey: ULong, phcontentinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistServerOpenContentInformation(hpeerdist.toString(), cbcontentidentifier.toInt(), (pcontentidentifier?.value ?: 0L).toString(), ullcontentoffset.toString(), cbcontentlength.toString(), (hcompletionport?.value ?: 0L).toString(), ulcompletionkey.toString(), (phcontentinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistServerOpenContentInformationEx(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: COpaquePointer?, ullcontentoffset: ULong, cbcontentlength: ULong, pretrievaloptions: COpaquePointer?, hcompletionport: Handle, ulcompletionkey: ULong, phcontentinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistServerOpenContentInformationEx(hpeerdist.toString(), cbcontentidentifier.toInt(), (pcontentidentifier?.value ?: 0L).toString(), ullcontentoffset.toString(), cbcontentlength.toString(), (pretrievaloptions?.value ?: 0L).toString(), (hcompletionport?.value ?: 0L).toString(), ulcompletionkey.toString(), (phcontentinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistServerPublishAddToStream(hpeerdist: Long, hstream: Long, cbnumberofbytes: UInt, pbuffer: COpaquePointer?, lpoverlapped: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistServerPublishAddToStream(hpeerdist.toString(), hstream.toString(), cbnumberofbytes.toInt(), (pbuffer?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistServerPublishCompleteStream(hpeerdist: Long, hstream: Long, lpoverlapped: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistServerPublishCompleteStream(hpeerdist.toString(), hstream.toString(), (lpoverlapped?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistServerPublishStream(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: COpaquePointer?, cbcontentlength: ULong, ppublishoptions: COpaquePointer?, hcompletionport: Handle, ulcompletionkey: ULong, phstream: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistServerPublishStream(hpeerdist.toString(), cbcontentidentifier.toInt(), (pcontentidentifier?.value ?: 0L).toString(), cbcontentlength.toString(), (ppublishoptions?.value ?: 0L).toString(), (hcompletionport?.value ?: 0L).toString(), ulcompletionkey.toString(), (phstream?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistServerRetrieveContentInformation(hpeerdist: Long, hcontentinfo: Long, cbmaxnumberofbytes: UInt, pbuffer: COpaquePointer?, lpoverlapped: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistServerRetrieveContentInformation(hpeerdist.toString(), hcontentinfo.toString(), cbmaxnumberofbytes.toInt(), (pbuffer?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistServerUnpublish(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistServerUnpublish(hpeerdist.toString(), cbcontentidentifier.toInt(), (pcontentidentifier?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistShutdown(hpeerdist: Long): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistShutdown(hpeerdist.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistStartup(dwversionrequested: UInt, phpeerdist: COpaquePointer?, pdwsupportedversion: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistStartup(dwversionrequested.toInt(), (phpeerdist?.value ?: 0L).toString(), (pdwsupportedversion?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistUnregisterForStatusChangeNotification(hpeerdist: Long): UInt =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerDistUnregisterForStatusChangeNotification(hpeerdist.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerEndEnumeration(hpeerenum: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerEndEnumeration((hpeerenum?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerEnumGroups(pwzidentity: Pcwstr, phpeerenum: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerEnumGroups((pwzidentity?.value ?: 0L).toString(), (phpeerenum?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerEnumIdentities(phpeerenum: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerEnumIdentities((phpeerenum?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerFreeData(pvdata: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_p2p_peerFreeData((pvdata?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun peerGetItemCount(hpeerenum: COpaquePointer?, pcount: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGetItemCount((hpeerenum?.value ?: 0L).toString(), (pcount?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGetNextItem(hpeerenum: COpaquePointer?, pcount: COpaquePointer?, pppvitems: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGetNextItem((hpeerenum?.value ?: 0L).toString(), (pcount?.value ?: 0L).toString(), (pppvitems?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphAddRecord(hgraph: COpaquePointer?, precord: COpaquePointer?, precordid: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphAddRecord((hgraph?.value ?: 0L).toString(), (precord?.value ?: 0L).toString(), (precordid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphClose(hgraph: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphClose((hgraph?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphCloseDirectConnection(hgraph: COpaquePointer?, ullconnectionid: ULong): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphCloseDirectConnection((hgraph?.value ?: 0L).toString(), ullconnectionid.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphConnect(hgraph: COpaquePointer?, pwzpeerid: Pcwstr, paddress: COpaquePointer?, pullconnectionid: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphConnect((hgraph?.value ?: 0L).toString(), (pwzpeerid?.value ?: 0L).toString(), (paddress?.value ?: 0L).toString(), (pullconnectionid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphCreate(pgraphproperties: COpaquePointer?, pwzdatabasename: Pcwstr, psecurityinterface: COpaquePointer?, phgraph: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphCreate((pgraphproperties?.value ?: 0L).toString(), (pwzdatabasename?.value ?: 0L).toString(), (psecurityinterface?.value ?: 0L).toString(), (phgraph?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphDelete(pwzgraphid: Pcwstr, pwzpeerid: Pcwstr, pwzdatabasename: Pcwstr): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphDelete((pwzgraphid?.value ?: 0L).toString(), (pwzpeerid?.value ?: 0L).toString(), (pwzdatabasename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphDeleteRecord(hgraph: COpaquePointer?, precordid: COpaquePointer?, flocal: Bool): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphDeleteRecord((hgraph?.value ?: 0L).toString(), (precordid?.value ?: 0L).toString(), flocal) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphEndEnumeration(hpeerenum: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphEndEnumeration((hpeerenum?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphEnumConnections(hgraph: COpaquePointer?, dwflags: UInt, phpeerenum: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphEnumConnections((hgraph?.value ?: 0L).toString(), dwflags.toInt(), (phpeerenum?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphEnumNodes(hgraph: COpaquePointer?, pwzpeerid: Pcwstr, phpeerenum: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphEnumNodes((hgraph?.value ?: 0L).toString(), (pwzpeerid?.value ?: 0L).toString(), (phpeerenum?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphEnumRecords(hgraph: COpaquePointer?, precordtype: COpaquePointer?, pwzpeerid: Pcwstr, phpeerenum: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphEnumRecords((hgraph?.value ?: 0L).toString(), (precordtype?.value ?: 0L).toString(), (pwzpeerid?.value ?: 0L).toString(), (phpeerenum?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphExportDatabase(hgraph: COpaquePointer?, pwzfilepath: Pcwstr): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphExportDatabase((hgraph?.value ?: 0L).toString(), (pwzfilepath?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphFreeData(pvdata: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphFreeData((pvdata?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun peerGraphGetEventData(hpeerevent: COpaquePointer?, ppeventdata: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphGetEventData((hpeerevent?.value ?: 0L).toString(), (ppeventdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphGetItemCount(hpeerenum: COpaquePointer?, pcount: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphGetItemCount((hpeerenum?.value ?: 0L).toString(), (pcount?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphGetNextItem(hpeerenum: COpaquePointer?, pcount: COpaquePointer?, pppvitems: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphGetNextItem((hpeerenum?.value ?: 0L).toString(), (pcount?.value ?: 0L).toString(), (pppvitems?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphGetNodeInfo(hgraph: COpaquePointer?, ullnodeid: ULong, ppnodeinfo: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphGetNodeInfo((hgraph?.value ?: 0L).toString(), ullnodeid.toString(), (ppnodeinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphGetProperties(hgraph: COpaquePointer?, ppgraphproperties: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphGetProperties((hgraph?.value ?: 0L).toString(), (ppgraphproperties?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphGetRecord(hgraph: COpaquePointer?, precordid: COpaquePointer?, pprecord: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphGetRecord((hgraph?.value ?: 0L).toString(), (precordid?.value ?: 0L).toString(), (pprecord?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphGetStatus(hgraph: COpaquePointer?, pdwstatus: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphGetStatus((hgraph?.value ?: 0L).toString(), (pdwstatus?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphImportDatabase(hgraph: COpaquePointer?, pwzfilepath: Pcwstr): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphImportDatabase((hgraph?.value ?: 0L).toString(), (pwzfilepath?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphListen(hgraph: COpaquePointer?, dwscope: UInt, dwscopeid: UInt, wport: UShort): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphListen((hgraph?.value ?: 0L).toString(), dwscope.toInt(), dwscopeid.toInt(), wport.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphOpen(pwzgraphid: Pcwstr, pwzpeerid: Pcwstr, pwzdatabasename: Pcwstr, psecurityinterface: COpaquePointer?, crecordtypesyncprecedence: UInt, precordtypesyncprecedence: COpaquePointer?, phgraph: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphOpen((pwzgraphid?.value ?: 0L).toString(), (pwzpeerid?.value ?: 0L).toString(), (pwzdatabasename?.value ?: 0L).toString(), (psecurityinterface?.value ?: 0L).toString(), crecordtypesyncprecedence.toInt(), (precordtypesyncprecedence?.value ?: 0L).toString(), (phgraph?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphOpenDirectConnection(hgraph: COpaquePointer?, pwzpeerid: Pcwstr, paddress: COpaquePointer?, pullconnectionid: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphOpenDirectConnection((hgraph?.value ?: 0L).toString(), (pwzpeerid?.value ?: 0L).toString(), (paddress?.value ?: 0L).toString(), (pullconnectionid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphPeerTimeToUniversalTime(hgraph: COpaquePointer?, pftpeertime: COpaquePointer?, pftuniversaltime: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphPeerTimeToUniversalTime((hgraph?.value ?: 0L).toString(), (pftpeertime?.value ?: 0L).toString(), (pftuniversaltime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphRegisterEvent(hgraph: COpaquePointer?, hevent: Handle, ceventregistrations: UInt, peventregistrations: COpaquePointer?, phpeerevent: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphRegisterEvent((hgraph?.value ?: 0L).toString(), (hevent?.value ?: 0L).toString(), ceventregistrations.toInt(), (peventregistrations?.value ?: 0L).toString(), (phpeerevent?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphSearchRecords(hgraph: COpaquePointer?, pwzcriteria: Pcwstr, phpeerenum: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphSearchRecords((hgraph?.value ?: 0L).toString(), (pwzcriteria?.value ?: 0L).toString(), (phpeerenum?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphSendData(hgraph: COpaquePointer?, ullconnectionid: ULong, ptype: COpaquePointer?, cbdata: UInt, pvdata: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphSendData((hgraph?.value ?: 0L).toString(), ullconnectionid.toString(), (ptype?.value ?: 0L).toString(), cbdata.toInt(), (pvdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphSetNodeAttributes(hgraph: COpaquePointer?, pwzattributes: Pcwstr): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphSetNodeAttributes((hgraph?.value ?: 0L).toString(), (pwzattributes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphSetPresence(hgraph: COpaquePointer?, fpresent: Bool): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphSetPresence((hgraph?.value ?: 0L).toString(), fpresent) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphSetProperties(hgraph: COpaquePointer?, pgraphproperties: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphSetProperties((hgraph?.value ?: 0L).toString(), (pgraphproperties?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphShutdown(): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphShutdown() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphStartup(wversionrequested: UShort, pversiondata: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphStartup(wversionrequested.toInt(), (pversiondata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphUniversalTimeToPeerTime(hgraph: COpaquePointer?, pftuniversaltime: COpaquePointer?, pftpeertime: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphUniversalTimeToPeerTime((hgraph?.value ?: 0L).toString(), (pftuniversaltime?.value ?: 0L).toString(), (pftpeertime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphUnregisterEvent(hpeerevent: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphUnregisterEvent((hpeerevent?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphUpdateRecord(hgraph: COpaquePointer?, precord: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphUpdateRecord((hgraph?.value ?: 0L).toString(), (precord?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphValidateDeferredRecords(hgraph: COpaquePointer?, crecordids: UInt, precordids: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGraphValidateDeferredRecords((hgraph?.value ?: 0L).toString(), crecordids.toInt(), (precordids?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupAddRecord(hgroup: COpaquePointer?, precord: COpaquePointer?, precordid: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupAddRecord((hgroup?.value ?: 0L).toString(), (precord?.value ?: 0L).toString(), (precordid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupClose(hgroup: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupClose((hgroup?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupCloseDirectConnection(hgroup: COpaquePointer?, ullconnectionid: ULong): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupCloseDirectConnection((hgroup?.value ?: 0L).toString(), ullconnectionid.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupConnect(hgroup: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupConnect((hgroup?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupConnectByAddress(hgroup: COpaquePointer?, caddresses: UInt, paddresses: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupConnectByAddress((hgroup?.value ?: 0L).toString(), caddresses.toInt(), (paddresses?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupCreate(pproperties: COpaquePointer?, phgroup: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupCreate((pproperties?.value ?: 0L).toString(), (phgroup?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupCreateInvitation(hgroup: COpaquePointer?, pwzidentityinfo: Pcwstr, pftexpiration: COpaquePointer?, croles: UInt, proles: COpaquePointer?, ppwzinvitation: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupCreateInvitation((hgroup?.value ?: 0L).toString(), (pwzidentityinfo?.value ?: 0L).toString(), (pftexpiration?.value ?: 0L).toString(), croles.toInt(), (proles?.value ?: 0L).toString(), (ppwzinvitation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupCreatePasswordInvitation(hgroup: COpaquePointer?, ppwzinvitation: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupCreatePasswordInvitation((hgroup?.value ?: 0L).toString(), (ppwzinvitation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupDelete(pwzidentity: Pcwstr, pwzgrouppeername: Pcwstr): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupDelete((pwzidentity?.value ?: 0L).toString(), (pwzgrouppeername?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupDeleteRecord(hgroup: COpaquePointer?, precordid: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupDeleteRecord((hgroup?.value ?: 0L).toString(), (precordid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupEnumConnections(hgroup: COpaquePointer?, dwflags: UInt, phpeerenum: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupEnumConnections((hgroup?.value ?: 0L).toString(), dwflags.toInt(), (phpeerenum?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupEnumMembers(hgroup: COpaquePointer?, dwflags: UInt, pwzidentity: Pcwstr, phpeerenum: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupEnumMembers((hgroup?.value ?: 0L).toString(), dwflags.toInt(), (pwzidentity?.value ?: 0L).toString(), (phpeerenum?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupEnumRecords(hgroup: COpaquePointer?, precordtype: COpaquePointer?, phpeerenum: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupEnumRecords((hgroup?.value ?: 0L).toString(), (precordtype?.value ?: 0L).toString(), (phpeerenum?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupExportConfig(hgroup: COpaquePointer?, pwzpassword: Pcwstr, ppwzxml: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupExportConfig((hgroup?.value ?: 0L).toString(), (pwzpassword?.value ?: 0L).toString(), (ppwzxml?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupExportDatabase(hgroup: COpaquePointer?, pwzfilepath: Pcwstr): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupExportDatabase((hgroup?.value ?: 0L).toString(), (pwzfilepath?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupGetEventData(hpeerevent: COpaquePointer?, ppeventdata: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupGetEventData((hpeerevent?.value ?: 0L).toString(), (ppeventdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupGetProperties(hgroup: COpaquePointer?, ppproperties: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupGetProperties((hgroup?.value ?: 0L).toString(), (ppproperties?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupGetRecord(hgroup: COpaquePointer?, precordid: COpaquePointer?, pprecord: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupGetRecord((hgroup?.value ?: 0L).toString(), (precordid?.value ?: 0L).toString(), (pprecord?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupGetStatus(hgroup: COpaquePointer?, pdwstatus: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupGetStatus((hgroup?.value ?: 0L).toString(), (pdwstatus?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupImportConfig(pwzxml: Pcwstr, pwzpassword: Pcwstr, foverwrite: Bool, ppwzidentity: COpaquePointer?, ppwzgroup: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupImportConfig((pwzxml?.value ?: 0L).toString(), (pwzpassword?.value ?: 0L).toString(), foverwrite, (ppwzidentity?.value ?: 0L).toString(), (ppwzgroup?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupImportDatabase(hgroup: COpaquePointer?, pwzfilepath: Pcwstr): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupImportDatabase((hgroup?.value ?: 0L).toString(), (pwzfilepath?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupIssueCredentials(hgroup: COpaquePointer?, pwzsubjectidentity: Pcwstr, pcredentialinfo: COpaquePointer?, dwflags: UInt, ppwzinvitation: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupIssueCredentials((hgroup?.value ?: 0L).toString(), (pwzsubjectidentity?.value ?: 0L).toString(), (pcredentialinfo?.value ?: 0L).toString(), dwflags.toInt(), (ppwzinvitation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupJoin(pwzidentity: Pcwstr, pwzinvitation: Pcwstr, pwzcloud: Pcwstr, phgroup: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupJoin((pwzidentity?.value ?: 0L).toString(), (pwzinvitation?.value ?: 0L).toString(), (pwzcloud?.value ?: 0L).toString(), (phgroup?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupOpen(pwzidentity: Pcwstr, pwzgrouppeername: Pcwstr, pwzcloud: Pcwstr, phgroup: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupOpen((pwzidentity?.value ?: 0L).toString(), (pwzgrouppeername?.value ?: 0L).toString(), (pwzcloud?.value ?: 0L).toString(), (phgroup?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupOpenDirectConnection(hgroup: COpaquePointer?, pwzidentity: Pcwstr, paddress: COpaquePointer?, pullconnectionid: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupOpenDirectConnection((hgroup?.value ?: 0L).toString(), (pwzidentity?.value ?: 0L).toString(), (paddress?.value ?: 0L).toString(), (pullconnectionid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupParseInvitation(pwzinvitation: Pcwstr, ppinvitationinfo: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupParseInvitation((pwzinvitation?.value ?: 0L).toString(), (ppinvitationinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupPasswordJoin(pwzidentity: Pcwstr, pwzinvitation: Pcwstr, pwzpassword: Pcwstr, pwzcloud: Pcwstr, phgroup: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupPasswordJoin((pwzidentity?.value ?: 0L).toString(), (pwzinvitation?.value ?: 0L).toString(), (pwzpassword?.value ?: 0L).toString(), (pwzcloud?.value ?: 0L).toString(), (phgroup?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupPeerTimeToUniversalTime(hgroup: COpaquePointer?, pftpeertime: COpaquePointer?, pftuniversaltime: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupPeerTimeToUniversalTime((hgroup?.value ?: 0L).toString(), (pftpeertime?.value ?: 0L).toString(), (pftuniversaltime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupRegisterEvent(hgroup: COpaquePointer?, hevent: Handle, ceventregistration: UInt, peventregistrations: COpaquePointer?, phpeerevent: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupRegisterEvent((hgroup?.value ?: 0L).toString(), (hevent?.value ?: 0L).toString(), ceventregistration.toInt(), (peventregistrations?.value ?: 0L).toString(), (phpeerevent?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupResumePasswordAuthentication(hgroup: COpaquePointer?, hpeereventhandle: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupResumePasswordAuthentication((hgroup?.value ?: 0L).toString(), (hpeereventhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupSearchRecords(hgroup: COpaquePointer?, pwzcriteria: Pcwstr, phpeerenum: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupSearchRecords((hgroup?.value ?: 0L).toString(), (pwzcriteria?.value ?: 0L).toString(), (phpeerenum?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupSendData(hgroup: COpaquePointer?, ullconnectionid: ULong, ptype: COpaquePointer?, cbdata: UInt, pvdata: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupSendData((hgroup?.value ?: 0L).toString(), ullconnectionid.toString(), (ptype?.value ?: 0L).toString(), cbdata.toInt(), (pvdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupSetProperties(hgroup: COpaquePointer?, pproperties: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupSetProperties((hgroup?.value ?: 0L).toString(), (pproperties?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupShutdown(): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupShutdown() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupStartup(wversionrequested: UShort, pversiondata: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupStartup(wversionrequested.toInt(), (pversiondata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupUniversalTimeToPeerTime(hgroup: COpaquePointer?, pftuniversaltime: COpaquePointer?, pftpeertime: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupUniversalTimeToPeerTime((hgroup?.value ?: 0L).toString(), (pftuniversaltime?.value ?: 0L).toString(), (pftpeertime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupUnregisterEvent(hpeerevent: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupUnregisterEvent((hpeerevent?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupUpdateRecord(hgroup: COpaquePointer?, precord: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerGroupUpdateRecord((hgroup?.value ?: 0L).toString(), (precord?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerHostNameToPeerName(pwzhostname: Pcwstr, ppwzpeername: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerHostNameToPeerName((pwzhostname?.value ?: 0L).toString(), (ppwzpeername?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerIdentityCreate(pwzclassifier: Pcwstr, pwzfriendlyname: Pcwstr, hcryptprov: ULong, ppwzidentity: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerIdentityCreate((pwzclassifier?.value ?: 0L).toString(), (pwzfriendlyname?.value ?: 0L).toString(), hcryptprov.toString(), (ppwzidentity?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerIdentityDelete(pwzidentity: Pcwstr): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerIdentityDelete((pwzidentity?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerIdentityExport(pwzidentity: Pcwstr, pwzpassword: Pcwstr, ppwzexportxml: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerIdentityExport((pwzidentity?.value ?: 0L).toString(), (pwzpassword?.value ?: 0L).toString(), (ppwzexportxml?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerIdentityGetCryptKey(pwzidentity: Pcwstr, phcryptprov: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerIdentityGetCryptKey((pwzidentity?.value ?: 0L).toString(), (phcryptprov?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerIdentityGetDefault(ppwzpeername: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerIdentityGetDefault((ppwzpeername?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerIdentityGetFriendlyName(pwzidentity: Pcwstr, ppwzfriendlyname: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerIdentityGetFriendlyName((pwzidentity?.value ?: 0L).toString(), (ppwzfriendlyname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerIdentityGetXML(pwzidentity: Pcwstr, ppwzidentityxml: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerIdentityGetXML((pwzidentity?.value ?: 0L).toString(), (ppwzidentityxml?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerIdentityImport(pwzimportxml: Pcwstr, pwzpassword: Pcwstr, ppwzidentity: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerIdentityImport((pwzimportxml?.value ?: 0L).toString(), (pwzpassword?.value ?: 0L).toString(), (ppwzidentity?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerIdentitySetFriendlyName(pwzidentity: Pcwstr, pwzfriendlyname: Pcwstr): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerIdentitySetFriendlyName((pwzidentity?.value ?: 0L).toString(), (pwzfriendlyname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerNameToPeerHostName(pwzpeername: Pcwstr, ppwzhostname: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerNameToPeerHostName((pwzpeername?.value ?: 0L).toString(), (ppwzhostname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerPnrpEndResolve(hresolve: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerPnrpEndResolve((hresolve?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerPnrpGetCloudInfo(pcnumclouds: COpaquePointer?, ppcloudinfo: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerPnrpGetCloudInfo((pcnumclouds?.value ?: 0L).toString(), (ppcloudinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerPnrpGetEndpoint(hresolve: COpaquePointer?, ppendpoint: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerPnrpGetEndpoint((hresolve?.value ?: 0L).toString(), (ppendpoint?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerPnrpRegister(pcwzpeername: Pcwstr, pregistrationinfo: COpaquePointer?, phregistration: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerPnrpRegister((pcwzpeername?.value ?: 0L).toString(), (pregistrationinfo?.value ?: 0L).toString(), (phregistration?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerPnrpResolve(pcwzpeername: Pcwstr, pcwzcloudname: Pcwstr, pcendpoints: COpaquePointer?, ppendpoints: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerPnrpResolve((pcwzpeername?.value ?: 0L).toString(), (pcwzcloudname?.value ?: 0L).toString(), (pcendpoints?.value ?: 0L).toString(), (ppendpoints?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerPnrpShutdown(): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerPnrpShutdown() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerPnrpStartResolve(pcwzpeername: Pcwstr, pcwzcloudname: Pcwstr, cmaxendpoints: UInt, hevent: Handle, phresolve: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerPnrpStartResolve((pcwzpeername?.value ?: 0L).toString(), (pcwzcloudname?.value ?: 0L).toString(), cmaxendpoints.toInt(), (hevent?.value ?: 0L).toString(), (phresolve?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerPnrpStartup(wversionrequested: UShort): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerPnrpStartup(wversionrequested.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerPnrpUnregister(hregistration: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerPnrpUnregister((hregistration?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerPnrpUpdateRegistration(hregistration: COpaquePointer?, pregistrationinfo: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementP2pNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_p2p_peerPnrpUpdateRegistration((hregistration?.value ?: 0L).toString(), (pregistrationinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
