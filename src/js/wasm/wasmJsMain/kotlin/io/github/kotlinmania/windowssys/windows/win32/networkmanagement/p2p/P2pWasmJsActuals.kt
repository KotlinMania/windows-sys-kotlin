@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertContext
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32NetworkmanagementP2pNapiAddon(): Boolean

private val windowsWin32NetworkmanagementP2pNapiAvailable: Boolean = initWindowsWin32NetworkmanagementP2pNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pDrtClose(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pDrtClose(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pDrtContinueSearch(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pDrtContinueSearch(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pDrtCreateDerivedKey(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pDrtCreateDerivedKey(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pDrtCreateDerivedKeySecurityProvider(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pDrtCreateDerivedKeySecurityProvider(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pDrtCreateDnsBootstrapResolver(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pDrtCreateDnsBootstrapResolver(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pDrtCreateIpv6UdpTransport(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pDrtCreateIpv6UdpTransport(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pDrtCreateNullSecurityProvider(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pDrtCreateNullSecurityProvider(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pDrtCreatePnrpBootstrapResolver(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pDrtCreatePnrpBootstrapResolver(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pDrtDeleteDerivedKeySecurityProvider(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pDrtDeleteDerivedKeySecurityProvider(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pDrtDeleteDnsBootstrapResolver(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pDrtDeleteDnsBootstrapResolver(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pDrtDeleteIpv6UdpTransport(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pDrtDeleteIpv6UdpTransport(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pDrtDeleteNullSecurityProvider(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pDrtDeleteNullSecurityProvider(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pDrtDeletePnrpBootstrapResolver(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pDrtDeletePnrpBootstrapResolver(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pDrtEndSearch(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pDrtEndSearch(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pDrtGetEventData(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pDrtGetEventData(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pDrtGetEventDataSize(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pDrtGetEventDataSize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pDrtGetInstanceName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pDrtGetInstanceName(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pDrtGetInstanceNameSize(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pDrtGetInstanceNameSize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pDrtGetSearchPath(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pDrtGetSearchPath(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pDrtGetSearchPathSize(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pDrtGetSearchPathSize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pDrtGetSearchResult(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pDrtGetSearchResult(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pDrtGetSearchResultSize(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pDrtGetSearchResultSize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pDrtOpen(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pDrtOpen(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pDrtRegisterKey(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pDrtRegisterKey(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pDrtStartSearch(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pDrtStartSearch(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pDrtUnregisterKey(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pDrtUnregisterKey(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pDrtUpdateKey(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pDrtUpdateKey(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabAddContact(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabAddContact(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabAsyncInviteContact(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabAsyncInviteContact(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabAsyncInviteEndpoint(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabAsyncInviteEndpoint(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabCancelInvitation(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabCancelInvitation(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabCloseHandle(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabCloseHandle(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabDeleteContact(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabDeleteContact(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabDeleteEndpointData(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabDeleteEndpointData(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabDeleteObject(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabDeleteObject(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumApplicationRegistrationInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumApplicationRegistrationInfo(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumApplications(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumApplications(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumContacts(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumContacts(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumEndpoints(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumEndpoints(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumObjects(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumObjects(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumPeopleNearMe(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumPeopleNearMe(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabExportContact(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabExportContact(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetAppLaunchInfo(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabGetAppLaunchInfo(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetApplicationRegistrationInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabGetApplicationRegistrationInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetContact(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabGetContact(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetEndpointName(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabGetEndpointName(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetEventData(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabGetEventData(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetInvitationResponse(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabGetInvitationResponse(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetPresenceInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabGetPresenceInfo(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabGetSigninOptions(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabGetSigninOptions(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabInviteContact(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabInviteContact(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabInviteEndpoint(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabInviteEndpoint(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabParseContact(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabParseContact(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabQueryContactData(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabQueryContactData(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabRefreshEndpointData(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabRefreshEndpointData(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabRegisterApplication(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabRegisterApplication(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabRegisterEvent(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabRegisterEvent(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabSetEndpointName(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabSetEndpointName(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabSetObject(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabSetObject(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabSetPresenceInfo(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabSetPresenceInfo(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabShutdown()")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabShutdown(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabSignin(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabSignin(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabSignout(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabSignout(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabStartup(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabStartup(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabSubscribeEndpointData(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabSubscribeEndpointData(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabUnregisterApplication(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabUnregisterApplication(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabUnregisterEvent(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabUnregisterEvent(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabUnsubscribeEndpointData(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabUnsubscribeEndpointData(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCollabUpdateContact(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabUpdateContact(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerCreatePeerName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCreatePeerName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientAddContentInformation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistClientAddContentInformation(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientAddData(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistClientAddData(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientBlockRead(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistClientBlockRead(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientCancelAsyncOperation(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistClientCancelAsyncOperation(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientCloseContent(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistClientCloseContent(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientCompleteContentInformation(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistClientCompleteContentInformation(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientFlushContent(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistClientFlushContent(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientGetInformationByHandle(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistClientGetInformationByHandle(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientOpenContent(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistClientOpenContent(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerDistClientStreamRead(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistClientStreamRead(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerDistGetOverlappedResult(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistGetOverlappedResult(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerDistGetStatus(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistGetStatus(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerDistGetStatusEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistGetStatusEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerDistRegisterForStatusChangeNotification(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistRegisterForStatusChangeNotification(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerDistRegisterForStatusChangeNotificationEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistRegisterForStatusChangeNotificationEx(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerCancelAsyncOperation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistServerCancelAsyncOperation(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerCloseContentInformation(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistServerCloseContentInformation(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerCloseStreamHandle(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistServerCloseStreamHandle(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerOpenContentInformation(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistServerOpenContentInformation(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerOpenContentInformationEx(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistServerOpenContentInformationEx(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerPublishAddToStream(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistServerPublishAddToStream(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerPublishCompleteStream(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistServerPublishCompleteStream(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerPublishStream(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistServerPublishStream(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerRetrieveContentInformation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistServerRetrieveContentInformation(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerDistServerUnpublish(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistServerUnpublish(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerDistShutdown(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistShutdown(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerDistStartup(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistStartup(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerDistUnregisterForStatusChangeNotification(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistUnregisterForStatusChangeNotification(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerEndEnumeration(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerEndEnumeration(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerEnumGroups(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerEnumGroups(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerEnumIdentities(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerEnumIdentities(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerFreeData(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerFreeData(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGetItemCount(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGetItemCount(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGetNextItem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGetNextItem(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGraphAddRecord(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphAddRecord(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGraphClose(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphClose(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGraphCloseDirectConnection(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphCloseDirectConnection(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGraphConnect(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphConnect(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGraphCreate(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGraphDelete(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphDelete(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGraphDeleteRecord(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphDeleteRecord(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGraphEndEnumeration(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphEndEnumeration(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGraphEnumConnections(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphEnumConnections(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGraphEnumNodes(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphEnumNodes(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGraphEnumRecords(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphEnumRecords(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGraphExportDatabase(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphExportDatabase(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGraphFreeData(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphFreeData(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetEventData(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphGetEventData(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetItemCount(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphGetItemCount(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetNextItem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphGetNextItem(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetNodeInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphGetNodeInfo(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetProperties(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphGetProperties(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetRecord(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphGetRecord(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGraphGetStatus(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphGetStatus(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGraphImportDatabase(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphImportDatabase(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGraphListen(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphListen(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGraphOpen(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphOpen(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGraphOpenDirectConnection(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphOpenDirectConnection(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGraphPeerTimeToUniversalTime(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphPeerTimeToUniversalTime(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGraphRegisterEvent(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphRegisterEvent(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGraphSearchRecords(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphSearchRecords(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGraphSendData(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphSendData(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGraphSetNodeAttributes(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphSetNodeAttributes(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGraphSetPresence(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphSetPresence(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGraphSetProperties(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphSetProperties(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGraphShutdown()")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphShutdown(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGraphStartup(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphStartup(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGraphUniversalTimeToPeerTime(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphUniversalTimeToPeerTime(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGraphUnregisterEvent(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphUnregisterEvent(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGraphUpdateRecord(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphUpdateRecord(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGraphValidateDeferredRecords(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphValidateDeferredRecords(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGroupAddRecord(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupAddRecord(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGroupClose(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupClose(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGroupCloseDirectConnection(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupCloseDirectConnection(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGroupConnect(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupConnect(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGroupConnectByAddress(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupConnectByAddress(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGroupCreate(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupCreate(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGroupCreateInvitation(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupCreateInvitation(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGroupCreatePasswordInvitation(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupCreatePasswordInvitation(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGroupDelete(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupDelete(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGroupDeleteRecord(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupDeleteRecord(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGroupEnumConnections(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupEnumConnections(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGroupEnumMembers(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupEnumMembers(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGroupEnumRecords(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupEnumRecords(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGroupExportConfig(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupExportConfig(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGroupExportDatabase(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupExportDatabase(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGroupGetEventData(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupGetEventData(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGroupGetProperties(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupGetProperties(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGroupGetRecord(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupGetRecord(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGroupGetStatus(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupGetStatus(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGroupImportConfig(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupImportConfig(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGroupImportDatabase(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupImportDatabase(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGroupIssueCredentials(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupIssueCredentials(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGroupJoin(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupJoin(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGroupOpen(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupOpen(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGroupOpenDirectConnection(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupOpenDirectConnection(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGroupParseInvitation(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupParseInvitation(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGroupPasswordJoin(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupPasswordJoin(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGroupPeerTimeToUniversalTime(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupPeerTimeToUniversalTime(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGroupRegisterEvent(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupRegisterEvent(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGroupResumePasswordAuthentication(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupResumePasswordAuthentication(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGroupSearchRecords(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupSearchRecords(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGroupSendData(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupSendData(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGroupSetProperties(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupSetProperties(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGroupShutdown()")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupShutdown(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGroupStartup(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupStartup(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGroupUniversalTimeToPeerTime(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupUniversalTimeToPeerTime(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGroupUnregisterEvent(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupUnregisterEvent(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerGroupUpdateRecord(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupUpdateRecord(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerHostNameToPeerName(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerHostNameToPeerName(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerIdentityCreate(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerIdentityCreate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerIdentityDelete(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerIdentityDelete(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerIdentityExport(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerIdentityExport(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerIdentityGetCryptKey(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerIdentityGetCryptKey(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerIdentityGetDefault(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerIdentityGetDefault(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerIdentityGetFriendlyName(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerIdentityGetFriendlyName(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerIdentityGetXML(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerIdentityGetXML(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerIdentityImport(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerIdentityImport(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerIdentitySetFriendlyName(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerIdentitySetFriendlyName(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerNameToPeerHostName(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerNameToPeerHostName(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpEndResolve(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerPnrpEndResolve(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpGetCloudInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerPnrpGetCloudInfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpGetEndpoint(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerPnrpGetEndpoint(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpRegister(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerPnrpRegister(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpResolve(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerPnrpResolve(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpShutdown()")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerPnrpShutdown(): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpStartResolve(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerPnrpStartResolve(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpStartup(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerPnrpStartup(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpUnregister(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerPnrpUnregister(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementP2pPeerPnrpUpdateRegistration(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementP2pPeerPnrpUpdateRegistration(p0: String, p1: String): Int

public actual fun drtClose(hdrt: ConstPtr<CVoid>) {
    if (windowsWin32NetworkmanagementP2pNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementP2pDrtClose(hdrt.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun drtContinueSearch(hsearchcontext: ConstPtr<CVoid>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pDrtContinueSearch(hsearchcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtCreateDerivedKey(plocalcert: ConstPtr<CertContext>, pkey: MutPtr<DrtData>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pDrtCreateDerivedKey(plocalcert.rawAddress.toString(), pkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtCreateDerivedKeySecurityProvider(prootcert: ConstPtr<CertContext>, plocalcert: ConstPtr<CertContext>, ppsecurityprovider: MutPtr<MutPtr<DrtSecurityProvider>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pDrtCreateDerivedKeySecurityProvider(prootcert.rawAddress.toString(), plocalcert.rawAddress.toString(), ppsecurityprovider.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtCreateDnsBootstrapResolver(port: UShort, pwszaddress: Pcwstr, ppmodule: MutPtr<MutPtr<DrtBootstrapProvider>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pDrtCreateDnsBootstrapResolver(port.toInt(), pwszaddress.rawAddress.toString(), ppmodule.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtCreateIpv6UdpTransport(scope: DrtScope, dwscopeid: UInt, dwlocalitythreshold: UInt, pwport: MutPtr<UShort>, phtransport: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pDrtCreateIpv6UdpTransport(scope, dwscopeid.toInt(), dwlocalitythreshold.toInt(), pwport.rawAddress.toString(), phtransport.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtCreateNullSecurityProvider(ppsecurityprovider: MutPtr<MutPtr<DrtSecurityProvider>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pDrtCreateNullSecurityProvider(ppsecurityprovider.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtCreatePnrpBootstrapResolver(fpublish: Bool, pwzpeername: Pcwstr, pwzcloudname: Pcwstr, pwzpublishingidentity: Pcwstr, ppresolver: MutPtr<MutPtr<DrtBootstrapProvider>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pDrtCreatePnrpBootstrapResolver(fpublish, pwzpeername.rawAddress.toString(), pwzcloudname.rawAddress.toString(), pwzpublishingidentity.rawAddress.toString(), ppresolver.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtDeleteDerivedKeySecurityProvider(psecurityprovider: ConstPtr<DrtSecurityProvider>) {
    if (windowsWin32NetworkmanagementP2pNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementP2pDrtDeleteDerivedKeySecurityProvider(psecurityprovider.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun drtDeleteDnsBootstrapResolver(presolver: ConstPtr<DrtBootstrapProvider>) {
    if (windowsWin32NetworkmanagementP2pNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementP2pDrtDeleteDnsBootstrapResolver(presolver.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun drtDeleteIpv6UdpTransport(htransport: ConstPtr<CVoid>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pDrtDeleteIpv6UdpTransport(htransport.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtDeleteNullSecurityProvider(psecurityprovider: ConstPtr<DrtSecurityProvider>) {
    if (windowsWin32NetworkmanagementP2pNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementP2pDrtDeleteNullSecurityProvider(psecurityprovider.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun drtDeletePnrpBootstrapResolver(presolver: ConstPtr<DrtBootstrapProvider>) {
    if (windowsWin32NetworkmanagementP2pNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementP2pDrtDeletePnrpBootstrapResolver(presolver.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun drtEndSearch(hsearchcontext: ConstPtr<CVoid>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pDrtEndSearch(hsearchcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtGetEventData(hdrt: ConstPtr<CVoid>, uleventdatalen: UInt, peventdata: MutPtr<DrtEventData>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pDrtGetEventData(hdrt.rawAddress.toString(), uleventdatalen.toInt(), peventdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtGetEventDataSize(hdrt: ConstPtr<CVoid>, puleventdatalen: MutPtr<UInt>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pDrtGetEventDataSize(hdrt.rawAddress.toString(), puleventdatalen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtGetInstanceName(hdrt: ConstPtr<CVoid>, ulcbinstancenamesize: UInt, pwzdrtinstancename: Pwstr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pDrtGetInstanceName(hdrt.rawAddress.toString(), ulcbinstancenamesize.toInt(), pwzdrtinstancename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtGetInstanceNameSize(hdrt: ConstPtr<CVoid>, pulcbinstancenamesize: MutPtr<UInt>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pDrtGetInstanceNameSize(hdrt.rawAddress.toString(), pulcbinstancenamesize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtGetSearchPath(hsearchcontext: ConstPtr<CVoid>, ulsearchpathsize: UInt, psearchpath: MutPtr<DrtAddressList>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pDrtGetSearchPath(hsearchcontext.rawAddress.toString(), ulsearchpathsize.toInt(), psearchpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtGetSearchPathSize(hsearchcontext: ConstPtr<CVoid>, pulsearchpathsize: MutPtr<UInt>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pDrtGetSearchPathSize(hsearchcontext.rawAddress.toString(), pulsearchpathsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtGetSearchResult(hsearchcontext: ConstPtr<CVoid>, ulsearchresultsize: UInt, psearchresult: MutPtr<DrtSearchResult>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pDrtGetSearchResult(hsearchcontext.rawAddress.toString(), ulsearchresultsize.toInt(), psearchresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtGetSearchResultSize(hsearchcontext: ConstPtr<CVoid>, pulsearchresultsize: MutPtr<UInt>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pDrtGetSearchResultSize(hsearchcontext.rawAddress.toString(), pulsearchresultsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtOpen(psettings: ConstPtr<DrtSettings>, hevent: Handle, pvcontext: ConstPtr<CVoid>, phdrt: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pDrtOpen(psettings.rawAddress.toString(), hevent.rawAddress.toString(), pvcontext.rawAddress.toString(), phdrt.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtRegisterKey(hdrt: ConstPtr<CVoid>, pregistration: ConstPtr<DrtRegistration>, pvkeycontext: ConstPtr<CVoid>, phkeyregistration: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pDrtRegisterKey(hdrt.rawAddress.toString(), pregistration.rawAddress.toString(), pvkeycontext.rawAddress.toString(), phkeyregistration.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtStartSearch(hdrt: ConstPtr<CVoid>, pkey: ConstPtr<DrtData>, pinfo: ConstPtr<DrtSearchInfo>, timeout: UInt, hevent: Handle, pvcontext: ConstPtr<CVoid>, hsearchcontext: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pDrtStartSearch(hdrt.rawAddress.toString(), pkey.rawAddress.toString(), pinfo.rawAddress.toString(), timeout.toInt(), hevent.rawAddress.toString(), pvcontext.rawAddress.toString(), hsearchcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drtUnregisterKey(hkeyregistration: ConstPtr<CVoid>) {
    if (windowsWin32NetworkmanagementP2pNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementP2pDrtUnregisterKey(hkeyregistration.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun drtUpdateKey(hkeyregistration: ConstPtr<CVoid>, pappdata: ConstPtr<DrtData>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pDrtUpdateKey(hkeyregistration.rawAddress.toString(), pappdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabAddContact(pwzcontactdata: Pcwstr, ppcontact: MutPtr<MutPtr<PeerContact>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabAddContact(pwzcontactdata.rawAddress.toString(), ppcontact.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabAsyncInviteContact(pccontact: ConstPtr<PeerContact>, pcendpoint: ConstPtr<PeerEndpoint>, pcinvitation: ConstPtr<PeerInvitation>, hevent: Handle, phinvitation: MutPtr<Handle>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabAsyncInviteContact(pccontact.rawAddress.toString(), pcendpoint.rawAddress.toString(), pcinvitation.rawAddress.toString(), hevent.rawAddress.toString(), phinvitation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabAsyncInviteEndpoint(pcendpoint: ConstPtr<PeerEndpoint>, pcinvitation: ConstPtr<PeerInvitation>, hevent: Handle, phinvitation: MutPtr<Handle>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabAsyncInviteEndpoint(pcendpoint.rawAddress.toString(), pcinvitation.rawAddress.toString(), hevent.rawAddress.toString(), phinvitation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabCancelInvitation(hinvitation: Handle): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabCancelInvitation(hinvitation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabCloseHandle(hinvitation: Handle): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabCloseHandle(hinvitation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabDeleteContact(pwzpeername: Pcwstr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabDeleteContact(pwzpeername.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabDeleteEndpointData(pcendpoint: ConstPtr<PeerEndpoint>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabDeleteEndpointData(pcendpoint.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabDeleteObject(pobjectid: ConstPtr<Guid>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabDeleteObject(pobjectid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabEnumApplicationRegistrationInfo(registrationtype: PeerApplicationRegistrationType, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumApplicationRegistrationInfo(registrationtype, phpeerenum.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabEnumApplications(pcendpoint: ConstPtr<PeerEndpoint>, papplicationid: ConstPtr<Guid>, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumApplications(pcendpoint.rawAddress.toString(), papplicationid.rawAddress.toString(), phpeerenum.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabEnumContacts(phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumContacts(phpeerenum.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabEnumEndpoints(pccontact: ConstPtr<PeerContact>, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumEndpoints(pccontact.rawAddress.toString(), phpeerenum.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabEnumObjects(pcendpoint: ConstPtr<PeerEndpoint>, pobjectid: ConstPtr<Guid>, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumObjects(pcendpoint.rawAddress.toString(), pobjectid.rawAddress.toString(), phpeerenum.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabEnumPeopleNearMe(phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabEnumPeopleNearMe(phpeerenum.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabExportContact(pwzpeername: Pcwstr, ppwzcontactdata: MutPtr<Pwstr>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabExportContact(pwzpeername.rawAddress.toString(), ppwzcontactdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabGetAppLaunchInfo(pplaunchinfo: MutPtr<MutPtr<PeerAppLaunchInfo>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabGetAppLaunchInfo(pplaunchinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabGetApplicationRegistrationInfo(papplicationid: ConstPtr<Guid>, registrationtype: PeerApplicationRegistrationType, ppapplication: MutPtr<MutPtr<PeerApplicationRegistrationInfo>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabGetApplicationRegistrationInfo(papplicationid.rawAddress.toString(), registrationtype, ppapplication.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabGetContact(pwzpeername: Pcwstr, ppcontact: MutPtr<MutPtr<PeerContact>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabGetContact(pwzpeername.rawAddress.toString(), ppcontact.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabGetEndpointName(ppwzendpointname: MutPtr<Pwstr>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabGetEndpointName(ppwzendpointname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabGetEventData(hpeerevent: ConstPtr<CVoid>, ppeventdata: MutPtr<MutPtr<PeerCollabEventData>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabGetEventData(hpeerevent.rawAddress.toString(), ppeventdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabGetInvitationResponse(hinvitation: Handle, ppinvitationresponse: MutPtr<MutPtr<PeerInvitationResponse>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabGetInvitationResponse(hinvitation.rawAddress.toString(), ppinvitationresponse.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabGetPresenceInfo(pcendpoint: ConstPtr<PeerEndpoint>, pppresenceinfo: MutPtr<MutPtr<PeerPresenceInfo>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabGetPresenceInfo(pcendpoint.rawAddress.toString(), pppresenceinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabGetSigninOptions(pdwsigninoptions: MutPtr<UInt>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabGetSigninOptions(pdwsigninoptions.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabInviteContact(pccontact: ConstPtr<PeerContact>, pcendpoint: ConstPtr<PeerEndpoint>, pcinvitation: ConstPtr<PeerInvitation>, ppresponse: MutPtr<MutPtr<PeerInvitationResponse>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabInviteContact(pccontact.rawAddress.toString(), pcendpoint.rawAddress.toString(), pcinvitation.rawAddress.toString(), ppresponse.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabInviteEndpoint(pcendpoint: ConstPtr<PeerEndpoint>, pcinvitation: ConstPtr<PeerInvitation>, ppresponse: MutPtr<MutPtr<PeerInvitationResponse>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabInviteEndpoint(pcendpoint.rawAddress.toString(), pcinvitation.rawAddress.toString(), ppresponse.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabParseContact(pwzcontactdata: Pcwstr, ppcontact: MutPtr<MutPtr<PeerContact>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabParseContact(pwzcontactdata.rawAddress.toString(), ppcontact.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabQueryContactData(pcendpoint: ConstPtr<PeerEndpoint>, ppwzcontactdata: MutPtr<Pwstr>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabQueryContactData(pcendpoint.rawAddress.toString(), ppwzcontactdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabRefreshEndpointData(pcendpoint: ConstPtr<PeerEndpoint>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabRefreshEndpointData(pcendpoint.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabRegisterApplication(pcapplication: ConstPtr<PeerApplicationRegistrationInfo>, registrationtype: PeerApplicationRegistrationType): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabRegisterApplication(pcapplication.rawAddress.toString(), registrationtype) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabRegisterEvent(hevent: Handle, ceventregistration: UInt, peventregistrations: ConstPtr<PeerCollabEventRegistration>, phpeerevent: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabRegisterEvent(hevent.rawAddress.toString(), ceventregistration.toInt(), peventregistrations.rawAddress.toString(), phpeerevent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabSetEndpointName(pwzendpointname: Pcwstr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabSetEndpointName(pwzendpointname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabSetObject(pcobject: ConstPtr<PeerObject>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabSetObject(pcobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabSetPresenceInfo(pcpresenceinfo: ConstPtr<PeerPresenceInfo>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabSetPresenceInfo(pcpresenceinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabShutdown(): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabShutdown() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabSignin(hwndparent: Hwnd, dwsigninoptions: UInt): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabSignin(hwndparent.rawAddress.toString(), dwsigninoptions.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabSignout(dwsigninoptions: UInt): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabSignout(dwsigninoptions.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabStartup(wversionrequested: UShort): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabStartup(wversionrequested.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabSubscribeEndpointData(pcendpoint: ConstPtr<PeerEndpoint>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabSubscribeEndpointData(pcendpoint.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabUnregisterApplication(papplicationid: ConstPtr<Guid>, registrationtype: PeerApplicationRegistrationType): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabUnregisterApplication(papplicationid.rawAddress.toString(), registrationtype) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabUnregisterEvent(hpeerevent: ConstPtr<CVoid>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabUnregisterEvent(hpeerevent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabUnsubscribeEndpointData(pcendpoint: ConstPtr<PeerEndpoint>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabUnsubscribeEndpointData(pcendpoint.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCollabUpdateContact(pcontact: ConstPtr<PeerContact>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCollabUpdateContact(pcontact.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerCreatePeerName(pwzidentity: Pcwstr, pwzclassifier: Pcwstr, ppwzpeername: MutPtr<Pwstr>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerCreatePeerName(pwzidentity.rawAddress.toString(), pwzclassifier.rawAddress.toString(), ppwzpeername.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistClientAddContentInformation(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: UInt, pbuffer: ConstPtr<UByte>, lpoverlapped: ConstPtr<Overlapped>): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistClientAddContentInformation(hpeerdist.toString(), hcontenthandle.toString(), cbnumberofbytes.toInt(), pbuffer.rawAddress.toString(), lpoverlapped.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistClientAddData(hpeerdist: Long, hcontenthandle: Long, cbnumberofbytes: UInt, pbuffer: ConstPtr<UByte>, lpoverlapped: ConstPtr<Overlapped>): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistClientAddData(hpeerdist.toString(), hcontenthandle.toString(), cbnumberofbytes.toInt(), pbuffer.rawAddress.toString(), lpoverlapped.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistClientBlockRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: UInt, pbuffer: MutPtr<UByte>, dwtimeoutinmilliseconds: UInt, lpoverlapped: ConstPtr<Overlapped>): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistClientBlockRead(hpeerdist.toString(), hcontenthandle.toString(), cbmaxnumberofbytes.toInt(), pbuffer.rawAddress.toString(), dwtimeoutinmilliseconds.toInt(), lpoverlapped.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistClientCancelAsyncOperation(hpeerdist: Long, hcontenthandle: Long, poverlapped: ConstPtr<Overlapped>): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistClientCancelAsyncOperation(hpeerdist.toString(), hcontenthandle.toString(), poverlapped.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistClientCloseContent(hpeerdist: Long, hcontenthandle: Long): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistClientCloseContent(hpeerdist.toString(), hcontenthandle.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistClientCompleteContentInformation(hpeerdist: Long, hcontenthandle: Long, lpoverlapped: ConstPtr<Overlapped>): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistClientCompleteContentInformation(hpeerdist.toString(), hcontenthandle.toString(), lpoverlapped.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistClientFlushContent(hpeerdist: Long, pcontenttag: ConstPtr<PeerdistContentTag>, hcompletionport: Handle, ulcompletionkey: ULong, lpoverlapped: ConstPtr<Overlapped>): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistClientFlushContent(hpeerdist.toString(), pcontenttag.rawAddress.toString(), hcompletionport.rawAddress.toString(), ulcompletionkey.toString(), lpoverlapped.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistClientGetInformationByHandle(hpeerdist: Long, hcontenthandle: Long, peerdistclientinfoclass: PeerdistClientInfoByHandleClass, dwbuffersize: UInt, lpinformation: MutPtr<CVoid>): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistClientGetInformationByHandle(hpeerdist.toString(), hcontenthandle.toString(), peerdistclientinfoclass, dwbuffersize.toInt(), lpinformation.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistClientOpenContent(hpeerdist: Long, pcontenttag: ConstPtr<PeerdistContentTag>, hcompletionport: Handle, ulcompletionkey: ULong, phcontenthandle: MutPtr<Long>): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistClientOpenContent(hpeerdist.toString(), pcontenttag.rawAddress.toString(), hcompletionport.rawAddress.toString(), ulcompletionkey.toString(), phcontenthandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistClientStreamRead(hpeerdist: Long, hcontenthandle: Long, cbmaxnumberofbytes: UInt, pbuffer: MutPtr<UByte>, dwtimeoutinmilliseconds: UInt, lpoverlapped: ConstPtr<Overlapped>): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistClientStreamRead(hpeerdist.toString(), hcontenthandle.toString(), cbmaxnumberofbytes.toInt(), pbuffer.rawAddress.toString(), dwtimeoutinmilliseconds.toInt(), lpoverlapped.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistGetOverlappedResult(lpoverlapped: ConstPtr<Overlapped>, lpnumberofbytestransferred: MutPtr<UInt>, bwait: Bool): Bool =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistGetOverlappedResult(lpoverlapped.rawAddress.toString(), lpnumberofbytestransferred.rawAddress.toString(), bwait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistGetStatus(hpeerdist: Long, ppeerdiststatus: MutPtr<PeerdistStatus>): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistGetStatus(hpeerdist.toString(), ppeerdiststatus.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistGetStatusEx(hpeerdist: Long, ppeerdiststatus: MutPtr<PeerdistStatusInfo>): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistGetStatusEx(hpeerdist.toString(), ppeerdiststatus.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistRegisterForStatusChangeNotification(hpeerdist: Long, hcompletionport: Handle, ulcompletionkey: ULong, lpoverlapped: ConstPtr<Overlapped>, ppeerdiststatus: MutPtr<PeerdistStatus>): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistRegisterForStatusChangeNotification(hpeerdist.toString(), hcompletionport.rawAddress.toString(), ulcompletionkey.toString(), lpoverlapped.rawAddress.toString(), ppeerdiststatus.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistRegisterForStatusChangeNotificationEx(hpeerdist: Long, hcompletionport: Handle, ulcompletionkey: ULong, lpoverlapped: ConstPtr<Overlapped>, ppeerdiststatus: MutPtr<PeerdistStatusInfo>): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistRegisterForStatusChangeNotificationEx(hpeerdist.toString(), hcompletionport.rawAddress.toString(), ulcompletionkey.toString(), lpoverlapped.rawAddress.toString(), ppeerdiststatus.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistServerCancelAsyncOperation(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: ConstPtr<UByte>, poverlapped: ConstPtr<Overlapped>): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistServerCancelAsyncOperation(hpeerdist.toString(), cbcontentidentifier.toInt(), pcontentidentifier.rawAddress.toString(), poverlapped.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistServerCloseContentInformation(hpeerdist: Long, hcontentinfo: Long): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistServerCloseContentInformation(hpeerdist.toString(), hcontentinfo.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistServerCloseStreamHandle(hpeerdist: Long, hstream: Long): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistServerCloseStreamHandle(hpeerdist.toString(), hstream.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistServerOpenContentInformation(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: ConstPtr<UByte>, ullcontentoffset: ULong, cbcontentlength: ULong, hcompletionport: Handle, ulcompletionkey: ULong, phcontentinfo: MutPtr<Long>): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistServerOpenContentInformation(hpeerdist.toString(), cbcontentidentifier.toInt(), pcontentidentifier.rawAddress.toString(), ullcontentoffset.toString(), cbcontentlength.toString(), hcompletionport.rawAddress.toString(), ulcompletionkey.toString(), phcontentinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistServerOpenContentInformationEx(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: ConstPtr<UByte>, ullcontentoffset: ULong, cbcontentlength: ULong, pretrievaloptions: ConstPtr<PeerdistRetrievalOptions>, hcompletionport: Handle, ulcompletionkey: ULong, phcontentinfo: MutPtr<Long>): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistServerOpenContentInformationEx(hpeerdist.toString(), cbcontentidentifier.toInt(), pcontentidentifier.rawAddress.toString(), ullcontentoffset.toString(), cbcontentlength.toString(), pretrievaloptions.rawAddress.toString(), hcompletionport.rawAddress.toString(), ulcompletionkey.toString(), phcontentinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistServerPublishAddToStream(hpeerdist: Long, hstream: Long, cbnumberofbytes: UInt, pbuffer: ConstPtr<UByte>, lpoverlapped: ConstPtr<Overlapped>): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistServerPublishAddToStream(hpeerdist.toString(), hstream.toString(), cbnumberofbytes.toInt(), pbuffer.rawAddress.toString(), lpoverlapped.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistServerPublishCompleteStream(hpeerdist: Long, hstream: Long, lpoverlapped: ConstPtr<Overlapped>): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistServerPublishCompleteStream(hpeerdist.toString(), hstream.toString(), lpoverlapped.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistServerPublishStream(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: ConstPtr<UByte>, cbcontentlength: ULong, ppublishoptions: ConstPtr<PeerdistPublicationOptions>, hcompletionport: Handle, ulcompletionkey: ULong, phstream: MutPtr<Long>): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistServerPublishStream(hpeerdist.toString(), cbcontentidentifier.toInt(), pcontentidentifier.rawAddress.toString(), cbcontentlength.toString(), ppublishoptions.rawAddress.toString(), hcompletionport.rawAddress.toString(), ulcompletionkey.toString(), phstream.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistServerRetrieveContentInformation(hpeerdist: Long, hcontentinfo: Long, cbmaxnumberofbytes: UInt, pbuffer: MutPtr<UByte>, lpoverlapped: ConstPtr<Overlapped>): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistServerRetrieveContentInformation(hpeerdist.toString(), hcontentinfo.toString(), cbmaxnumberofbytes.toInt(), pbuffer.rawAddress.toString(), lpoverlapped.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistServerUnpublish(hpeerdist: Long, cbcontentidentifier: UInt, pcontentidentifier: ConstPtr<UByte>): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistServerUnpublish(hpeerdist.toString(), cbcontentidentifier.toInt(), pcontentidentifier.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistShutdown(hpeerdist: Long): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistShutdown(hpeerdist.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistStartup(dwversionrequested: UInt, phpeerdist: MutPtr<Long>, pdwsupportedversion: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistStartup(dwversionrequested.toInt(), phpeerdist.rawAddress.toString(), pdwsupportedversion.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerDistUnregisterForStatusChangeNotification(hpeerdist: Long): UInt =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerDistUnregisterForStatusChangeNotification(hpeerdist.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerEndEnumeration(hpeerenum: ConstPtr<CVoid>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerEndEnumeration(hpeerenum.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerEnumGroups(pwzidentity: Pcwstr, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerEnumGroups(pwzidentity.rawAddress.toString(), phpeerenum.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerEnumIdentities(phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerEnumIdentities(phpeerenum.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerFreeData(pvdata: ConstPtr<CVoid>) {
    if (windowsWin32NetworkmanagementP2pNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementP2pPeerFreeData(pvdata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun peerGetItemCount(hpeerenum: ConstPtr<CVoid>, pcount: MutPtr<UInt>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGetItemCount(hpeerenum.rawAddress.toString(), pcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGetNextItem(hpeerenum: ConstPtr<CVoid>, pcount: MutPtr<UInt>, pppvitems: MutPtr<MutPtr<MutPtr<CVoid>>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGetNextItem(hpeerenum.rawAddress.toString(), pcount.rawAddress.toString(), pppvitems.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphAddRecord(hgraph: ConstPtr<CVoid>, precord: ConstPtr<PeerRecord>, precordid: MutPtr<Guid>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphAddRecord(hgraph.rawAddress.toString(), precord.rawAddress.toString(), precordid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphClose(hgraph: ConstPtr<CVoid>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphClose(hgraph.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphCloseDirectConnection(hgraph: ConstPtr<CVoid>, ullconnectionid: ULong): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphCloseDirectConnection(hgraph.rawAddress.toString(), ullconnectionid.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphConnect(hgraph: ConstPtr<CVoid>, pwzpeerid: Pcwstr, paddress: ConstPtr<PeerAddress>, pullconnectionid: MutPtr<ULong>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphConnect(hgraph.rawAddress.toString(), pwzpeerid.rawAddress.toString(), paddress.rawAddress.toString(), pullconnectionid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphCreate(pgraphproperties: ConstPtr<PeerGraphProperties>, pwzdatabasename: Pcwstr, psecurityinterface: ConstPtr<PeerSecurityInterface>, phgraph: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphCreate(pgraphproperties.rawAddress.toString(), pwzdatabasename.rawAddress.toString(), psecurityinterface.rawAddress.toString(), phgraph.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphDelete(pwzgraphid: Pcwstr, pwzpeerid: Pcwstr, pwzdatabasename: Pcwstr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphDelete(pwzgraphid.rawAddress.toString(), pwzpeerid.rawAddress.toString(), pwzdatabasename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphDeleteRecord(hgraph: ConstPtr<CVoid>, precordid: ConstPtr<Guid>, flocal: Bool): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphDeleteRecord(hgraph.rawAddress.toString(), precordid.rawAddress.toString(), flocal) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphEndEnumeration(hpeerenum: ConstPtr<CVoid>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphEndEnumeration(hpeerenum.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphEnumConnections(hgraph: ConstPtr<CVoid>, dwflags: UInt, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphEnumConnections(hgraph.rawAddress.toString(), dwflags.toInt(), phpeerenum.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphEnumNodes(hgraph: ConstPtr<CVoid>, pwzpeerid: Pcwstr, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphEnumNodes(hgraph.rawAddress.toString(), pwzpeerid.rawAddress.toString(), phpeerenum.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphEnumRecords(hgraph: ConstPtr<CVoid>, precordtype: ConstPtr<Guid>, pwzpeerid: Pcwstr, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphEnumRecords(hgraph.rawAddress.toString(), precordtype.rawAddress.toString(), pwzpeerid.rawAddress.toString(), phpeerenum.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphExportDatabase(hgraph: ConstPtr<CVoid>, pwzfilepath: Pcwstr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphExportDatabase(hgraph.rawAddress.toString(), pwzfilepath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphFreeData(pvdata: ConstPtr<CVoid>) {
    if (windowsWin32NetworkmanagementP2pNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphFreeData(pvdata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun peerGraphGetEventData(hpeerevent: ConstPtr<CVoid>, ppeventdata: MutPtr<MutPtr<PeerGraphEventData>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphGetEventData(hpeerevent.rawAddress.toString(), ppeventdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphGetItemCount(hpeerenum: ConstPtr<CVoid>, pcount: MutPtr<UInt>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphGetItemCount(hpeerenum.rawAddress.toString(), pcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphGetNextItem(hpeerenum: ConstPtr<CVoid>, pcount: MutPtr<UInt>, pppvitems: MutPtr<MutPtr<MutPtr<CVoid>>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphGetNextItem(hpeerenum.rawAddress.toString(), pcount.rawAddress.toString(), pppvitems.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphGetNodeInfo(hgraph: ConstPtr<CVoid>, ullnodeid: ULong, ppnodeinfo: MutPtr<MutPtr<PeerNodeInfo>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphGetNodeInfo(hgraph.rawAddress.toString(), ullnodeid.toString(), ppnodeinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphGetProperties(hgraph: ConstPtr<CVoid>, ppgraphproperties: MutPtr<MutPtr<PeerGraphProperties>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphGetProperties(hgraph.rawAddress.toString(), ppgraphproperties.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphGetRecord(hgraph: ConstPtr<CVoid>, precordid: ConstPtr<Guid>, pprecord: MutPtr<MutPtr<PeerRecord>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphGetRecord(hgraph.rawAddress.toString(), precordid.rawAddress.toString(), pprecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphGetStatus(hgraph: ConstPtr<CVoid>, pdwstatus: MutPtr<UInt>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphGetStatus(hgraph.rawAddress.toString(), pdwstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphImportDatabase(hgraph: ConstPtr<CVoid>, pwzfilepath: Pcwstr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphImportDatabase(hgraph.rawAddress.toString(), pwzfilepath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphListen(hgraph: ConstPtr<CVoid>, dwscope: UInt, dwscopeid: UInt, wport: UShort): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphListen(hgraph.rawAddress.toString(), dwscope.toInt(), dwscopeid.toInt(), wport.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphOpen(pwzgraphid: Pcwstr, pwzpeerid: Pcwstr, pwzdatabasename: Pcwstr, psecurityinterface: ConstPtr<PeerSecurityInterface>, crecordtypesyncprecedence: UInt, precordtypesyncprecedence: ConstPtr<Guid>, phgraph: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphOpen(pwzgraphid.rawAddress.toString(), pwzpeerid.rawAddress.toString(), pwzdatabasename.rawAddress.toString(), psecurityinterface.rawAddress.toString(), crecordtypesyncprecedence.toInt(), precordtypesyncprecedence.rawAddress.toString(), phgraph.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphOpenDirectConnection(hgraph: ConstPtr<CVoid>, pwzpeerid: Pcwstr, paddress: ConstPtr<PeerAddress>, pullconnectionid: MutPtr<ULong>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphOpenDirectConnection(hgraph.rawAddress.toString(), pwzpeerid.rawAddress.toString(), paddress.rawAddress.toString(), pullconnectionid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphPeerTimeToUniversalTime(hgraph: ConstPtr<CVoid>, pftpeertime: ConstPtr<Filetime>, pftuniversaltime: MutPtr<Filetime>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphPeerTimeToUniversalTime(hgraph.rawAddress.toString(), pftpeertime.rawAddress.toString(), pftuniversaltime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphRegisterEvent(hgraph: ConstPtr<CVoid>, hevent: Handle, ceventregistrations: UInt, peventregistrations: ConstPtr<PeerGraphEventRegistration>, phpeerevent: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphRegisterEvent(hgraph.rawAddress.toString(), hevent.rawAddress.toString(), ceventregistrations.toInt(), peventregistrations.rawAddress.toString(), phpeerevent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphSearchRecords(hgraph: ConstPtr<CVoid>, pwzcriteria: Pcwstr, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphSearchRecords(hgraph.rawAddress.toString(), pwzcriteria.rawAddress.toString(), phpeerenum.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphSendData(hgraph: ConstPtr<CVoid>, ullconnectionid: ULong, ptype: ConstPtr<Guid>, cbdata: UInt, pvdata: ConstPtr<CVoid>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphSendData(hgraph.rawAddress.toString(), ullconnectionid.toString(), ptype.rawAddress.toString(), cbdata.toInt(), pvdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphSetNodeAttributes(hgraph: ConstPtr<CVoid>, pwzattributes: Pcwstr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphSetNodeAttributes(hgraph.rawAddress.toString(), pwzattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphSetPresence(hgraph: ConstPtr<CVoid>, fpresent: Bool): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphSetPresence(hgraph.rawAddress.toString(), fpresent) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphSetProperties(hgraph: ConstPtr<CVoid>, pgraphproperties: ConstPtr<PeerGraphProperties>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphSetProperties(hgraph.rawAddress.toString(), pgraphproperties.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphShutdown(): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphShutdown() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphStartup(wversionrequested: UShort, pversiondata: MutPtr<PeerVersionData>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphStartup(wversionrequested.toInt(), pversiondata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphUniversalTimeToPeerTime(hgraph: ConstPtr<CVoid>, pftuniversaltime: ConstPtr<Filetime>, pftpeertime: MutPtr<Filetime>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphUniversalTimeToPeerTime(hgraph.rawAddress.toString(), pftuniversaltime.rawAddress.toString(), pftpeertime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphUnregisterEvent(hpeerevent: ConstPtr<CVoid>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphUnregisterEvent(hpeerevent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphUpdateRecord(hgraph: ConstPtr<CVoid>, precord: ConstPtr<PeerRecord>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphUpdateRecord(hgraph.rawAddress.toString(), precord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGraphValidateDeferredRecords(hgraph: ConstPtr<CVoid>, crecordids: UInt, precordids: ConstPtr<Guid>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGraphValidateDeferredRecords(hgraph.rawAddress.toString(), crecordids.toInt(), precordids.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupAddRecord(hgroup: ConstPtr<CVoid>, precord: ConstPtr<PeerRecord>, precordid: MutPtr<Guid>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupAddRecord(hgroup.rawAddress.toString(), precord.rawAddress.toString(), precordid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupClose(hgroup: ConstPtr<CVoid>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupClose(hgroup.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupCloseDirectConnection(hgroup: ConstPtr<CVoid>, ullconnectionid: ULong): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupCloseDirectConnection(hgroup.rawAddress.toString(), ullconnectionid.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupConnect(hgroup: ConstPtr<CVoid>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupConnect(hgroup.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupConnectByAddress(hgroup: ConstPtr<CVoid>, caddresses: UInt, paddresses: ConstPtr<PeerAddress>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupConnectByAddress(hgroup.rawAddress.toString(), caddresses.toInt(), paddresses.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupCreate(pproperties: ConstPtr<PeerGroupProperties>, phgroup: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupCreate(pproperties.rawAddress.toString(), phgroup.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupCreateInvitation(hgroup: ConstPtr<CVoid>, pwzidentityinfo: Pcwstr, pftexpiration: ConstPtr<Filetime>, croles: UInt, proles: ConstPtr<Guid>, ppwzinvitation: MutPtr<Pwstr>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupCreateInvitation(hgroup.rawAddress.toString(), pwzidentityinfo.rawAddress.toString(), pftexpiration.rawAddress.toString(), croles.toInt(), proles.rawAddress.toString(), ppwzinvitation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupCreatePasswordInvitation(hgroup: ConstPtr<CVoid>, ppwzinvitation: MutPtr<Pwstr>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupCreatePasswordInvitation(hgroup.rawAddress.toString(), ppwzinvitation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupDelete(pwzidentity: Pcwstr, pwzgrouppeername: Pcwstr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupDelete(pwzidentity.rawAddress.toString(), pwzgrouppeername.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupDeleteRecord(hgroup: ConstPtr<CVoid>, precordid: ConstPtr<Guid>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupDeleteRecord(hgroup.rawAddress.toString(), precordid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupEnumConnections(hgroup: ConstPtr<CVoid>, dwflags: UInt, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupEnumConnections(hgroup.rawAddress.toString(), dwflags.toInt(), phpeerenum.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupEnumMembers(hgroup: ConstPtr<CVoid>, dwflags: UInt, pwzidentity: Pcwstr, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupEnumMembers(hgroup.rawAddress.toString(), dwflags.toInt(), pwzidentity.rawAddress.toString(), phpeerenum.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupEnumRecords(hgroup: ConstPtr<CVoid>, precordtype: ConstPtr<Guid>, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupEnumRecords(hgroup.rawAddress.toString(), precordtype.rawAddress.toString(), phpeerenum.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupExportConfig(hgroup: ConstPtr<CVoid>, pwzpassword: Pcwstr, ppwzxml: MutPtr<Pwstr>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupExportConfig(hgroup.rawAddress.toString(), pwzpassword.rawAddress.toString(), ppwzxml.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupExportDatabase(hgroup: ConstPtr<CVoid>, pwzfilepath: Pcwstr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupExportDatabase(hgroup.rawAddress.toString(), pwzfilepath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupGetEventData(hpeerevent: ConstPtr<CVoid>, ppeventdata: MutPtr<MutPtr<PeerGroupEventData>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupGetEventData(hpeerevent.rawAddress.toString(), ppeventdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupGetProperties(hgroup: ConstPtr<CVoid>, ppproperties: MutPtr<MutPtr<PeerGroupProperties>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupGetProperties(hgroup.rawAddress.toString(), ppproperties.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupGetRecord(hgroup: ConstPtr<CVoid>, precordid: ConstPtr<Guid>, pprecord: MutPtr<MutPtr<PeerRecord>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupGetRecord(hgroup.rawAddress.toString(), precordid.rawAddress.toString(), pprecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupGetStatus(hgroup: ConstPtr<CVoid>, pdwstatus: MutPtr<UInt>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupGetStatus(hgroup.rawAddress.toString(), pdwstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupImportConfig(pwzxml: Pcwstr, pwzpassword: Pcwstr, foverwrite: Bool, ppwzidentity: MutPtr<Pwstr>, ppwzgroup: MutPtr<Pwstr>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupImportConfig(pwzxml.rawAddress.toString(), pwzpassword.rawAddress.toString(), foverwrite, ppwzidentity.rawAddress.toString(), ppwzgroup.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupImportDatabase(hgroup: ConstPtr<CVoid>, pwzfilepath: Pcwstr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupImportDatabase(hgroup.rawAddress.toString(), pwzfilepath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupIssueCredentials(hgroup: ConstPtr<CVoid>, pwzsubjectidentity: Pcwstr, pcredentialinfo: ConstPtr<PeerCredentialInfo>, dwflags: UInt, ppwzinvitation: MutPtr<Pwstr>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupIssueCredentials(hgroup.rawAddress.toString(), pwzsubjectidentity.rawAddress.toString(), pcredentialinfo.rawAddress.toString(), dwflags.toInt(), ppwzinvitation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupJoin(pwzidentity: Pcwstr, pwzinvitation: Pcwstr, pwzcloud: Pcwstr, phgroup: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupJoin(pwzidentity.rawAddress.toString(), pwzinvitation.rawAddress.toString(), pwzcloud.rawAddress.toString(), phgroup.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupOpen(pwzidentity: Pcwstr, pwzgrouppeername: Pcwstr, pwzcloud: Pcwstr, phgroup: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupOpen(pwzidentity.rawAddress.toString(), pwzgrouppeername.rawAddress.toString(), pwzcloud.rawAddress.toString(), phgroup.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupOpenDirectConnection(hgroup: ConstPtr<CVoid>, pwzidentity: Pcwstr, paddress: ConstPtr<PeerAddress>, pullconnectionid: MutPtr<ULong>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupOpenDirectConnection(hgroup.rawAddress.toString(), pwzidentity.rawAddress.toString(), paddress.rawAddress.toString(), pullconnectionid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupParseInvitation(pwzinvitation: Pcwstr, ppinvitationinfo: MutPtr<MutPtr<PeerInvitationInfo>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupParseInvitation(pwzinvitation.rawAddress.toString(), ppinvitationinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupPasswordJoin(pwzidentity: Pcwstr, pwzinvitation: Pcwstr, pwzpassword: Pcwstr, pwzcloud: Pcwstr, phgroup: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupPasswordJoin(pwzidentity.rawAddress.toString(), pwzinvitation.rawAddress.toString(), pwzpassword.rawAddress.toString(), pwzcloud.rawAddress.toString(), phgroup.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupPeerTimeToUniversalTime(hgroup: ConstPtr<CVoid>, pftpeertime: ConstPtr<Filetime>, pftuniversaltime: MutPtr<Filetime>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupPeerTimeToUniversalTime(hgroup.rawAddress.toString(), pftpeertime.rawAddress.toString(), pftuniversaltime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupRegisterEvent(hgroup: ConstPtr<CVoid>, hevent: Handle, ceventregistration: UInt, peventregistrations: ConstPtr<PeerGroupEventRegistration>, phpeerevent: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupRegisterEvent(hgroup.rawAddress.toString(), hevent.rawAddress.toString(), ceventregistration.toInt(), peventregistrations.rawAddress.toString(), phpeerevent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupResumePasswordAuthentication(hgroup: ConstPtr<CVoid>, hpeereventhandle: ConstPtr<CVoid>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupResumePasswordAuthentication(hgroup.rawAddress.toString(), hpeereventhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupSearchRecords(hgroup: ConstPtr<CVoid>, pwzcriteria: Pcwstr, phpeerenum: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupSearchRecords(hgroup.rawAddress.toString(), pwzcriteria.rawAddress.toString(), phpeerenum.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupSendData(hgroup: ConstPtr<CVoid>, ullconnectionid: ULong, ptype: ConstPtr<Guid>, cbdata: UInt, pvdata: ConstPtr<CVoid>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupSendData(hgroup.rawAddress.toString(), ullconnectionid.toString(), ptype.rawAddress.toString(), cbdata.toInt(), pvdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupSetProperties(hgroup: ConstPtr<CVoid>, pproperties: ConstPtr<PeerGroupProperties>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupSetProperties(hgroup.rawAddress.toString(), pproperties.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupShutdown(): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupShutdown() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupStartup(wversionrequested: UShort, pversiondata: MutPtr<PeerVersionData>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupStartup(wversionrequested.toInt(), pversiondata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupUniversalTimeToPeerTime(hgroup: ConstPtr<CVoid>, pftuniversaltime: ConstPtr<Filetime>, pftpeertime: MutPtr<Filetime>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupUniversalTimeToPeerTime(hgroup.rawAddress.toString(), pftuniversaltime.rawAddress.toString(), pftpeertime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupUnregisterEvent(hpeerevent: ConstPtr<CVoid>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupUnregisterEvent(hpeerevent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerGroupUpdateRecord(hgroup: ConstPtr<CVoid>, precord: ConstPtr<PeerRecord>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerGroupUpdateRecord(hgroup.rawAddress.toString(), precord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerHostNameToPeerName(pwzhostname: Pcwstr, ppwzpeername: MutPtr<Pwstr>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerHostNameToPeerName(pwzhostname.rawAddress.toString(), ppwzpeername.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerIdentityCreate(pwzclassifier: Pcwstr, pwzfriendlyname: Pcwstr, hcryptprov: ULong, ppwzidentity: MutPtr<Pwstr>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerIdentityCreate(pwzclassifier.rawAddress.toString(), pwzfriendlyname.rawAddress.toString(), hcryptprov.toString(), ppwzidentity.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerIdentityDelete(pwzidentity: Pcwstr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerIdentityDelete(pwzidentity.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerIdentityExport(pwzidentity: Pcwstr, pwzpassword: Pcwstr, ppwzexportxml: MutPtr<Pwstr>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerIdentityExport(pwzidentity.rawAddress.toString(), pwzpassword.rawAddress.toString(), ppwzexportxml.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerIdentityGetCryptKey(pwzidentity: Pcwstr, phcryptprov: MutPtr<ULong>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerIdentityGetCryptKey(pwzidentity.rawAddress.toString(), phcryptprov.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerIdentityGetDefault(ppwzpeername: MutPtr<Pwstr>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerIdentityGetDefault(ppwzpeername.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerIdentityGetFriendlyName(pwzidentity: Pcwstr, ppwzfriendlyname: MutPtr<Pwstr>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerIdentityGetFriendlyName(pwzidentity.rawAddress.toString(), ppwzfriendlyname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerIdentityGetXML(pwzidentity: Pcwstr, ppwzidentityxml: MutPtr<Pwstr>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerIdentityGetXML(pwzidentity.rawAddress.toString(), ppwzidentityxml.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerIdentityImport(pwzimportxml: Pcwstr, pwzpassword: Pcwstr, ppwzidentity: MutPtr<Pwstr>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerIdentityImport(pwzimportxml.rawAddress.toString(), pwzpassword.rawAddress.toString(), ppwzidentity.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerIdentitySetFriendlyName(pwzidentity: Pcwstr, pwzfriendlyname: Pcwstr): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerIdentitySetFriendlyName(pwzidentity.rawAddress.toString(), pwzfriendlyname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerNameToPeerHostName(pwzpeername: Pcwstr, ppwzhostname: MutPtr<Pwstr>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerNameToPeerHostName(pwzpeername.rawAddress.toString(), ppwzhostname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerPnrpEndResolve(hresolve: ConstPtr<CVoid>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerPnrpEndResolve(hresolve.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerPnrpGetCloudInfo(pcnumclouds: MutPtr<UInt>, ppcloudinfo: MutPtr<MutPtr<PeerPnrpCloudInfo>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerPnrpGetCloudInfo(pcnumclouds.rawAddress.toString(), ppcloudinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerPnrpGetEndpoint(hresolve: ConstPtr<CVoid>, ppendpoint: MutPtr<MutPtr<PeerPnrpEndpointInfo>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerPnrpGetEndpoint(hresolve.rawAddress.toString(), ppendpoint.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerPnrpRegister(pcwzpeername: Pcwstr, pregistrationinfo: ConstPtr<PeerPnrpRegistrationInfo>, phregistration: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerPnrpRegister(pcwzpeername.rawAddress.toString(), pregistrationinfo.rawAddress.toString(), phregistration.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerPnrpResolve(pcwzpeername: Pcwstr, pcwzcloudname: Pcwstr, pcendpoints: MutPtr<UInt>, ppendpoints: MutPtr<MutPtr<PeerPnrpEndpointInfo>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerPnrpResolve(pcwzpeername.rawAddress.toString(), pcwzcloudname.rawAddress.toString(), pcendpoints.rawAddress.toString(), ppendpoints.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerPnrpShutdown(): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerPnrpShutdown() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerPnrpStartResolve(pcwzpeername: Pcwstr, pcwzcloudname: Pcwstr, cmaxendpoints: UInt, hevent: Handle, phresolve: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerPnrpStartResolve(pcwzpeername.rawAddress.toString(), pcwzcloudname.rawAddress.toString(), cmaxendpoints.toInt(), hevent.rawAddress.toString(), phresolve.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerPnrpStartup(wversionrequested: UShort): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerPnrpStartup(wversionrequested.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerPnrpUnregister(hregistration: ConstPtr<CVoid>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerPnrpUnregister(hregistration.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun peerPnrpUpdateRegistration(hregistration: ConstPtr<CVoid>, pregistrationinfo: ConstPtr<PeerPnrpRegistrationInfo>): Hresult =
    if (windowsWin32NetworkmanagementP2pNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementP2pPeerPnrpUpdateRegistration(hregistration.rawAddress.toString(), pregistrationinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
