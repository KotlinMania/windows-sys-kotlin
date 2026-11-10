@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.In6Addr

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32NetworkmanagementRrasNapiAddon(): Boolean

private val _windowsWin32NetworkmanagementRrasNapiAvailable: Boolean = _initWindowsWin32NetworkmanagementRrasNapiAddon()

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mgmAddGroupMembershipEntry(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mgmAddGroupMembershipEntry(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mgmDeRegisterMProtocol(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mgmDeRegisterMProtocol(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mgmDeleteGroupMembershipEntry(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mgmDeleteGroupMembershipEntry(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mgmGetFirstMfe(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mgmGetFirstMfe(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mgmGetFirstMfeStats(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mgmGetFirstMfeStats(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mgmGetMfe(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mgmGetMfe(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mgmGetMfeStats(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mgmGetMfeStats(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mgmGetNextMfe(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mgmGetNextMfe(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mgmGetNextMfeStats(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mgmGetNextMfeStats(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mgmGetProtocolOnInterface(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mgmGetProtocolOnInterface(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mgmGroupEnumerationEnd(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mgmGroupEnumerationEnd(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mgmGroupEnumerationGetNext(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mgmGroupEnumerationGetNext(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mgmGroupEnumerationStart(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mgmGroupEnumerationStart(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mgmRegisterMProtocol(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mgmRegisterMProtocol(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mgmReleaseInterfaceOwnership(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mgmReleaseInterfaceOwnership(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mgmTakeInterfaceOwnership(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mgmTakeInterfaceOwnership(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminBufferFree(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminBufferFree(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminConnectionClearStats(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminConnectionClearStats(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminConnectionEnum(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminConnectionEnum(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminConnectionEnumEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminConnectionEnumEx(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminConnectionGetInfo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminConnectionGetInfo(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminConnectionGetInfoEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminConnectionGetInfoEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminConnectionRemoveQuarantine(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminConnectionRemoveQuarantine(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminDeregisterConnectionNotification(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminDeregisterConnectionNotification(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminDeviceEnum(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminDeviceEnum(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminEstablishDomainRasServer(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminEstablishDomainRasServer(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminGetErrorString(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminGetErrorString(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminGetPDCServer(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminGetPDCServer(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceConnect(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceConnect(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceCreate(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceCreate(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceDelete(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceDelete(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceDeviceGetInfo(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceDeviceGetInfo(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceDeviceSetInfo(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceDeviceSetInfo(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceDisconnect(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceDisconnect(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceEnum(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceEnum(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceGetCredentials(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceGetCredentials(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceGetCredentialsEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceGetCredentialsEx(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceGetCustomInfoEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceGetCustomInfoEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceGetHandle(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceGetHandle(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceGetInfo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceGetInfo(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceQueryUpdateResult(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceQueryUpdateResult(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceSetCredentials(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceSetCredentials(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceSetCredentialsEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceSetCredentialsEx(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceSetCustomInfoEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceSetCustomInfoEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceSetInfo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceSetInfo(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceTransportAdd(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceTransportAdd(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceTransportGetInfo(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceTransportGetInfo(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceTransportRemove(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceTransportRemove(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceTransportSetInfo(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceTransportSetInfo(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceUpdatePhonebookInfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceUpdatePhonebookInfo(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceUpdateRoutes(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceUpdateRoutes(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminIsDomainRasServer(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminIsDomainRasServer(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminIsServiceInitialized(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminIsServiceInitialized(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminIsServiceRunning(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminIsServiceRunning(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminMIBBufferFree(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminMIBBufferFree(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminMIBEntryCreate(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminMIBEntryCreate(p0: String, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminMIBEntryDelete(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminMIBEntryDelete(p0: String, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminMIBEntryGet(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminMIBEntryGet(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminMIBEntryGetFirst(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminMIBEntryGetFirst(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminMIBEntryGetNext(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminMIBEntryGetNext(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminMIBEntrySet(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminMIBEntrySet(p0: String, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminMIBServerConnect(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminMIBServerConnect(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminMIBServerDisconnect(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminMIBServerDisconnect(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminPortClearStats(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminPortClearStats(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminPortDisconnect(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminPortDisconnect(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminPortEnum(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminPortEnum(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminPortGetInfo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminPortGetInfo(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminPortReset(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminPortReset(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminRegisterConnectionNotification(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminRegisterConnectionNotification(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminSendUserMessage(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminSendUserMessage(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminServerConnect(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminServerConnect(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminServerDisconnect(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminServerDisconnect(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminServerGetCredentials(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminServerGetCredentials(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminServerGetInfo(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminServerGetInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminServerGetInfoEx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminServerGetInfoEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminServerSetCredentials(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminServerSetCredentials(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminServerSetInfo(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminServerSetInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminServerSetInfoEx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminServerSetInfoEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminTransportCreate(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminTransportCreate(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminTransportGetInfo(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminTransportGetInfo(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminTransportSetInfo(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminTransportSetInfo(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminUpdateConnection(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminUpdateConnection(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminUserGetInfo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminUserGetInfo(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprAdminUserSetInfo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminUserSetInfo(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprConfigBufferFree(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigBufferFree(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprConfigFilterGetInfo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigFilterGetInfo(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprConfigFilterSetInfo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigFilterSetInfo(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprConfigGetFriendlyName(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigGetFriendlyName(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprConfigGetGuidName(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigGetGuidName(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceCreate(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceCreate(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceDelete(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceDelete(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceEnum(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceEnum(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceGetCustomInfoEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceGetCustomInfoEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceGetHandle(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceGetHandle(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceGetInfo(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceGetInfo(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceSetCustomInfoEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceSetCustomInfoEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceSetInfo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceSetInfo(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceTransportAdd(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceTransportAdd(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceTransportEnum(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceTransportEnum(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceTransportGetHandle(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceTransportGetHandle(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceTransportGetInfo(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceTransportGetInfo(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceTransportRemove(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceTransportRemove(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceTransportSetInfo(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceTransportSetInfo(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprConfigServerBackup(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigServerBackup(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprConfigServerConnect(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigServerConnect(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprConfigServerDisconnect(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigServerDisconnect(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprConfigServerGetInfo(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigServerGetInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprConfigServerGetInfoEx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigServerGetInfoEx(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprConfigServerInstall(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigServerInstall(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprConfigServerRefresh(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigServerRefresh(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprConfigServerRestore(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigServerRestore(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprConfigServerSetInfo(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigServerSetInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprConfigServerSetInfoEx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigServerSetInfoEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprConfigTransportCreate(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigTransportCreate(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprConfigTransportDelete(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigTransportDelete(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprConfigTransportEnum(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigTransportEnum(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprConfigTransportGetHandle(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigTransportGetHandle(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprConfigTransportGetInfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigTransportGetInfo(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprConfigTransportSetInfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigTransportSetInfo(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprInfoBlockAdd(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprInfoBlockAdd(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprInfoBlockFind(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprInfoBlockFind(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprInfoBlockQuerySize(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprInfoBlockQuerySize(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprInfoBlockRemove(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprInfoBlockRemove(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprInfoBlockSet(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprInfoBlockSet(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprInfoCreate(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprInfoCreate(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprInfoDelete(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprInfoDelete(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprInfoDuplicate(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprInfoDuplicate(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_mprInfoRemoveAll(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_mprInfoRemoveAll(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasClearConnectionStatistics(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasClearConnectionStatistics(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasClearLinkStatistics(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasClearLinkStatistics(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasConnectionNotificationA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasConnectionNotificationA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasConnectionNotificationW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasConnectionNotificationW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasCreatePhonebookEntryA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasCreatePhonebookEntryA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasCreatePhonebookEntryW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasCreatePhonebookEntryW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasDeleteEntryA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasDeleteEntryA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasDeleteEntryW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasDeleteEntryW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasDeleteSubEntryA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasDeleteSubEntryA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasDeleteSubEntryW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasDeleteSubEntryW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasDialA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasDialA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasDialDlgA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasDialDlgA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasDialDlgW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasDialDlgW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasDialW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasDialW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasEditPhonebookEntryA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasEditPhonebookEntryA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasEditPhonebookEntryW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasEditPhonebookEntryW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasEntryDlgA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasEntryDlgA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasEntryDlgW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasEntryDlgW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasEnumAutodialAddressesA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasEnumAutodialAddressesA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasEnumAutodialAddressesW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasEnumAutodialAddressesW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasEnumConnectionsA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasEnumConnectionsA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasEnumConnectionsW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasEnumConnectionsW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasEnumDevicesA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasEnumDevicesA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasEnumDevicesW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasEnumDevicesW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasEnumEntriesA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasEnumEntriesA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasEnumEntriesW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasEnumEntriesW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasFreeEapUserIdentityA(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasFreeEapUserIdentityA(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasFreeEapUserIdentityW(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasFreeEapUserIdentityW(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasGetAutodialAddressA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetAutodialAddressA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasGetAutodialAddressW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetAutodialAddressW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasGetAutodialEnableA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetAutodialEnableA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasGetAutodialEnableW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetAutodialEnableW(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasGetAutodialParamA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetAutodialParamA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasGetAutodialParamW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetAutodialParamW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasGetConnectStatusA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetConnectStatusA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasGetConnectStatusW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetConnectStatusW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasGetConnectionStatistics(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetConnectionStatistics(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasGetCountryInfoA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetCountryInfoA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasGetCountryInfoW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetCountryInfoW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasGetCredentialsA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetCredentialsA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasGetCredentialsW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetCredentialsW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasGetCustomAuthDataA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetCustomAuthDataA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasGetCustomAuthDataW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetCustomAuthDataW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasGetEapUserDataA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetEapUserDataA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasGetEapUserDataW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetEapUserDataW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasGetEapUserIdentityA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetEapUserIdentityA(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasGetEapUserIdentityW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetEapUserIdentityW(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasGetEntryDialParamsA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetEntryDialParamsA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasGetEntryDialParamsW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetEntryDialParamsW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasGetEntryPropertiesA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetEntryPropertiesA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasGetEntryPropertiesW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetEntryPropertiesW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasGetErrorStringA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetErrorStringA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasGetErrorStringW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetErrorStringW(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasGetLinkStatistics(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetLinkStatistics(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasGetPCscf(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetPCscf(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasGetProjectionInfoA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetProjectionInfoA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasGetProjectionInfoEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetProjectionInfoEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasGetProjectionInfoW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetProjectionInfoW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasGetSubEntryHandleA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetSubEntryHandleA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasGetSubEntryHandleW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetSubEntryHandleW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasGetSubEntryPropertiesA(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetSubEntryPropertiesA(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasGetSubEntryPropertiesW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetSubEntryPropertiesW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasHangUpA(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasHangUpA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasHangUpW(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasHangUpW(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasInvokeEapUI(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasInvokeEapUI(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasPhonebookDlgA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasPhonebookDlgA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasPhonebookDlgW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasPhonebookDlgW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasRenameEntryA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasRenameEntryA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasRenameEntryW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasRenameEntryW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasSetAutodialAddressA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasSetAutodialAddressA(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasSetAutodialAddressW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasSetAutodialAddressW(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasSetAutodialEnableA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasSetAutodialEnableA(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasSetAutodialEnableW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasSetAutodialEnableW(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasSetAutodialParamA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasSetAutodialParamA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasSetAutodialParamW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasSetAutodialParamW(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasSetCredentialsA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasSetCredentialsA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasSetCredentialsW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasSetCredentialsW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasSetCustomAuthDataA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasSetCustomAuthDataA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasSetCustomAuthDataW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasSetCustomAuthDataW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasSetEapUserDataA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasSetEapUserDataA(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasSetEapUserDataW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasSetEapUserDataW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasSetEntryDialParamsA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasSetEntryDialParamsA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasSetEntryDialParamsW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasSetEntryDialParamsW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasSetEntryPropertiesA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasSetEntryPropertiesA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasSetEntryPropertiesW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasSetEntryPropertiesW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasSetSubEntryPropertiesA(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasSetSubEntryPropertiesA(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasSetSubEntryPropertiesW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasSetSubEntryPropertiesW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasUpdateConnection(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasUpdateConnection(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasValidateEntryNameA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasValidateEntryNameA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rasValidateEntryNameW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rasValidateEntryNameW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmAddNextHop(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmAddNextHop(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmAddRouteToDest(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmAddRouteToDest(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmBlockMethods(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmBlockMethods(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmConvertNetAddressToIpv6AddressAndLength(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmConvertNetAddressToIpv6AddressAndLength(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmCreateDestEnum(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmCreateDestEnum(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmCreateNextHopEnum(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmCreateNextHopEnum(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmCreateRouteEnum(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmCreateRouteEnum(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: Int, p8: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmCreateRouteList(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmCreateRouteList(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmCreateRouteListEnum(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmCreateRouteListEnum(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmDeleteEnumHandle(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmDeleteEnumHandle(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmDeleteNextHop(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmDeleteNextHop(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmDeleteRouteList(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmDeleteRouteList(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmDeleteRouteToDest(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmDeleteRouteToDest(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmDeregisterEntity(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmDeregisterEntity(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmDeregisterFromChangeNotification(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmDeregisterFromChangeNotification(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmFindNextHop(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmFindNextHop(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmGetChangeStatus(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmGetChangeStatus(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmGetChangedDests(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmGetChangedDests(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmGetDestInfo(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmGetDestInfo(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmGetEntityInfo(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmGetEntityInfo(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmGetEntityMethods(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmGetEntityMethods(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmGetEnumDests(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmGetEnumDests(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmGetEnumNextHops(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmGetEnumNextHops(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmGetEnumRoutes(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmGetEnumRoutes(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmGetExactMatchDestination(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmGetExactMatchDestination(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmGetExactMatchRoute(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmGetExactMatchRoute(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmGetLessSpecificDestination(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmGetLessSpecificDestination(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmGetListEnumRoutes(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmGetListEnumRoutes(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmGetMostSpecificDestination(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmGetMostSpecificDestination(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmGetNextHopInfo(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmGetNextHopInfo(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmGetNextHopPointer(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmGetNextHopPointer(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmGetOpaqueInformationPointer(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmGetOpaqueInformationPointer(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmGetRegisteredEntities(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmGetRegisteredEntities(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmGetRouteInfo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmGetRouteInfo(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmGetRoutePointer(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmGetRoutePointer(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmHoldDestination(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmHoldDestination(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmIgnoreChangedDests(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmIgnoreChangedDests(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmInsertInRouteList(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmInsertInRouteList(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmInvokeMethod(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmInvokeMethod(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmIsBestRoute(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmIsBestRoute(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmIsMarkedForChangeNotification(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmIsMarkedForChangeNotification(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmLockDestination(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmLockDestination(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmLockNextHop(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmLockNextHop(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmLockRoute(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmLockRoute(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmMarkDestForChangeNotification(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmMarkDestForChangeNotification(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmReferenceHandles(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmReferenceHandles(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmRegisterEntity(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmRegisterEntity(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmRegisterForChangeNotification(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmRegisterForChangeNotification(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmReleaseChangedDests(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmReleaseChangedDests(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmReleaseDestInfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmReleaseDestInfo(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmReleaseDests(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmReleaseDests(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmReleaseEntities(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmReleaseEntities(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmReleaseEntityInfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmReleaseEntityInfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmReleaseNextHopInfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmReleaseNextHopInfo(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmReleaseNextHops(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmReleaseNextHops(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmReleaseRouteInfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmReleaseRouteInfo(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmReleaseRoutes(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmReleaseRoutes(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_rras_rtmUpdateAndUnlockRoute(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_rras_rtmUpdateAndUnlockRoute(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

public actual fun mgmAddGroupMembershipEntry(hprotocol: Handle, dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, dwifindex: UInt, dwifnexthopipaddr: UInt, dwflags: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mgmAddGroupMembershipEntry((hprotocol?.value ?: 0L).toString(), dwsourceaddr.toInt(), dwsourcemask.toInt(), dwgroupaddr.toInt(), dwgroupmask.toInt(), dwifindex.toInt(), dwifnexthopipaddr.toInt(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmDeRegisterMProtocol(hprotocol: Handle): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mgmDeRegisterMProtocol((hprotocol?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmDeleteGroupMembershipEntry(hprotocol: Handle, dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, dwifindex: UInt, dwifnexthopipaddr: UInt, dwflags: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mgmDeleteGroupMembershipEntry((hprotocol?.value ?: 0L).toString(), dwsourceaddr.toInt(), dwsourcemask.toInt(), dwgroupaddr.toInt(), dwgroupmask.toInt(), dwifindex.toInt(), dwifnexthopipaddr.toInt(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmGetFirstMfe(pdwbuffersize: COpaquePointer?, pbbuffer: COpaquePointer?, pdwnumentries: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mgmGetFirstMfe((pdwbuffersize?.value ?: 0L).toString(), (pbbuffer?.value ?: 0L).toString(), (pdwnumentries?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmGetFirstMfeStats(pdwbuffersize: COpaquePointer?, pbbuffer: COpaquePointer?, pdwnumentries: COpaquePointer?, dwflags: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mgmGetFirstMfeStats((pdwbuffersize?.value ?: 0L).toString(), (pbbuffer?.value ?: 0L).toString(), (pdwnumentries?.value ?: 0L).toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmGetMfe(pimm: COpaquePointer?, pdwbuffersize: COpaquePointer?, pbbuffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mgmGetMfe((pimm?.value ?: 0L).toString(), (pdwbuffersize?.value ?: 0L).toString(), (pbbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmGetMfeStats(pimm: COpaquePointer?, pdwbuffersize: COpaquePointer?, pbbuffer: COpaquePointer?, dwflags: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mgmGetMfeStats((pimm?.value ?: 0L).toString(), (pdwbuffersize?.value ?: 0L).toString(), (pbbuffer?.value ?: 0L).toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmGetNextMfe(pimmstart: COpaquePointer?, pdwbuffersize: COpaquePointer?, pbbuffer: COpaquePointer?, pdwnumentries: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mgmGetNextMfe((pimmstart?.value ?: 0L).toString(), (pdwbuffersize?.value ?: 0L).toString(), (pbbuffer?.value ?: 0L).toString(), (pdwnumentries?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmGetNextMfeStats(pimmstart: COpaquePointer?, pdwbuffersize: COpaquePointer?, pbbuffer: COpaquePointer?, pdwnumentries: COpaquePointer?, dwflags: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mgmGetNextMfeStats((pimmstart?.value ?: 0L).toString(), (pdwbuffersize?.value ?: 0L).toString(), (pbbuffer?.value ?: 0L).toString(), (pdwnumentries?.value ?: 0L).toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmGetProtocolOnInterface(dwifindex: UInt, dwifnexthopaddr: UInt, pdwifprotocolid: COpaquePointer?, pdwifcomponentid: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mgmGetProtocolOnInterface(dwifindex.toInt(), dwifnexthopaddr.toInt(), (pdwifprotocolid?.value ?: 0L).toString(), (pdwifcomponentid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmGroupEnumerationEnd(henum: Handle): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mgmGroupEnumerationEnd((henum?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmGroupEnumerationGetNext(henum: Handle, pdwbuffersize: COpaquePointer?, pbbuffer: COpaquePointer?, pdwnumentries: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mgmGroupEnumerationGetNext((henum?.value ?: 0L).toString(), (pdwbuffersize?.value ?: 0L).toString(), (pbbuffer?.value ?: 0L).toString(), (pdwnumentries?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmGroupEnumerationStart(hprotocol: Handle, metenumtype: MgmEnumTypes, phenumhandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mgmGroupEnumerationStart((hprotocol?.value ?: 0L).toString(), metenumtype, (phenumhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmRegisterMProtocol(prpiinfo: COpaquePointer?, dwprotocolid: UInt, dwcomponentid: UInt, phprotocol: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mgmRegisterMProtocol((prpiinfo?.value ?: 0L).toString(), dwprotocolid.toInt(), dwcomponentid.toInt(), (phprotocol?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmReleaseInterfaceOwnership(hprotocol: Handle, dwifindex: UInt, dwifnexthopaddr: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mgmReleaseInterfaceOwnership((hprotocol?.value ?: 0L).toString(), dwifindex.toInt(), dwifnexthopaddr.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmTakeInterfaceOwnership(hprotocol: Handle, dwifindex: UInt, dwifnexthopaddr: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mgmTakeInterfaceOwnership((hprotocol?.value ?: 0L).toString(), dwifindex.toInt(), dwifnexthopaddr.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminBufferFree(pbuffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminBufferFree((pbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminConnectionClearStats(hrasserver: Long, hrasconnection: Handle): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminConnectionClearStats(hrasserver.toString(), (hrasconnection?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminConnectionEnum(hrasserver: Long, dwlevel: UInt, lplpbbuffer: COpaquePointer?, dwprefmaxlen: UInt, lpdwentriesread: COpaquePointer?, lpdwtotalentries: COpaquePointer?, lpdwresumehandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminConnectionEnum(hrasserver.toString(), dwlevel.toInt(), (lplpbbuffer?.value ?: 0L).toString(), dwprefmaxlen.toInt(), (lpdwentriesread?.value ?: 0L).toString(), (lpdwtotalentries?.value ?: 0L).toString(), (lpdwresumehandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminConnectionEnumEx(hrasserver: Long, pobjectheader: COpaquePointer?, dwpreferedmaxlen: UInt, lpdwentriesread: COpaquePointer?, lpdwtotalentries: COpaquePointer?, pprasconn: COpaquePointer?, lpdwresumehandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminConnectionEnumEx(hrasserver.toString(), (pobjectheader?.value ?: 0L).toString(), dwpreferedmaxlen.toInt(), (lpdwentriesread?.value ?: 0L).toString(), (lpdwtotalentries?.value ?: 0L).toString(), (pprasconn?.value ?: 0L).toString(), (lpdwresumehandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminConnectionGetInfo(hrasserver: Long, dwlevel: UInt, hrasconnection: Handle, lplpbbuffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminConnectionGetInfo(hrasserver.toString(), dwlevel.toInt(), (hrasconnection?.value ?: 0L).toString(), (lplpbbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminConnectionGetInfoEx(hrasserver: Long, hrasconnection: Handle, prasconnection: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminConnectionGetInfoEx(hrasserver.toString(), (hrasconnection?.value ?: 0L).toString(), (prasconnection?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminConnectionRemoveQuarantine(hrasserver: Handle, hrasconnection: Handle, fisipaddress: Bool): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminConnectionRemoveQuarantine((hrasserver?.value ?: 0L).toString(), (hrasconnection?.value ?: 0L).toString(), fisipaddress).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminDeregisterConnectionNotification(hmprserver: Long, heventnotification: Handle): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminDeregisterConnectionNotification(hmprserver.toString(), (heventnotification?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminDeviceEnum(hmprserver: Long, dwlevel: UInt, lplpbbuffer: COpaquePointer?, lpdwtotalentries: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminDeviceEnum(hmprserver.toString(), dwlevel.toInt(), (lplpbbuffer?.value ?: 0L).toString(), (lpdwtotalentries?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminEstablishDomainRasServer(pszdomain: Pcwstr, pszmachine: Pcwstr, benable: Bool): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminEstablishDomainRasServer((pszdomain?.value ?: 0L).toString(), (pszmachine?.value ?: 0L).toString(), benable).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminGetErrorString(dwerror: UInt, lplpwserrorstring: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminGetErrorString(dwerror.toInt(), (lplpwserrorstring?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminGetPDCServer(lpszdomain: Pcwstr, lpszserver: Pcwstr, lpszpdcserver: Pwstr): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminGetPDCServer((lpszdomain?.value ?: 0L).toString(), (lpszserver?.value ?: 0L).toString(), (lpszpdcserver?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceConnect(hmprserver: Long, hinterface: Handle, hevent: Handle, fsynchronous: Bool): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceConnect(hmprserver.toString(), (hinterface?.value ?: 0L).toString(), (hevent?.value ?: 0L).toString(), fsynchronous).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceCreate(hmprserver: Long, dwlevel: UInt, lpbbuffer: COpaquePointer?, phinterface: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceCreate(hmprserver.toString(), dwlevel.toInt(), (lpbbuffer?.value ?: 0L).toString(), (phinterface?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceDelete(hmprserver: Long, hinterface: Handle): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceDelete(hmprserver.toString(), (hinterface?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceDeviceGetInfo(hmprserver: Long, hinterface: Handle, dwindex: UInt, dwlevel: UInt, lplpbuffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceDeviceGetInfo(hmprserver.toString(), (hinterface?.value ?: 0L).toString(), dwindex.toInt(), dwlevel.toInt(), (lplpbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceDeviceSetInfo(hmprserver: Long, hinterface: Handle, dwindex: UInt, dwlevel: UInt, lpbbuffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceDeviceSetInfo(hmprserver.toString(), (hinterface?.value ?: 0L).toString(), dwindex.toInt(), dwlevel.toInt(), (lpbbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceDisconnect(hmprserver: Long, hinterface: Handle): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceDisconnect(hmprserver.toString(), (hinterface?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceEnum(hmprserver: Long, dwlevel: UInt, lplpbbuffer: COpaquePointer?, dwprefmaxlen: UInt, lpdwentriesread: COpaquePointer?, lpdwtotalentries: COpaquePointer?, lpdwresumehandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceEnum(hmprserver.toString(), dwlevel.toInt(), (lplpbbuffer?.value ?: 0L).toString(), dwprefmaxlen.toInt(), (lpdwentriesread?.value ?: 0L).toString(), (lpdwtotalentries?.value ?: 0L).toString(), (lpdwresumehandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceGetCredentials(lpwsserver: Pcwstr, lpwsinterfacename: Pcwstr, lpwsusername: Pwstr, lpwspassword: Pwstr, lpwsdomainname: Pwstr): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceGetCredentials((lpwsserver?.value ?: 0L).toString(), (lpwsinterfacename?.value ?: 0L).toString(), (lpwsusername?.value ?: 0L).toString(), (lpwspassword?.value ?: 0L).toString(), (lpwsdomainname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceGetCredentialsEx(hmprserver: Long, hinterface: Handle, dwlevel: UInt, lplpbbuffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceGetCredentialsEx(hmprserver.toString(), (hinterface?.value ?: 0L).toString(), dwlevel.toInt(), (lplpbbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceGetCustomInfoEx(hmprserver: Long, hinterface: Handle, pcustominfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceGetCustomInfoEx(hmprserver.toString(), (hinterface?.value ?: 0L).toString(), (pcustominfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceGetHandle(hmprserver: Long, lpwsinterfacename: Pcwstr, phinterface: COpaquePointer?, fincludeclientinterfaces: Bool): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceGetHandle(hmprserver.toString(), (lpwsinterfacename?.value ?: 0L).toString(), (phinterface?.value ?: 0L).toString(), fincludeclientinterfaces).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceGetInfo(hmprserver: Long, hinterface: Handle, dwlevel: UInt, lplpbbuffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceGetInfo(hmprserver.toString(), (hinterface?.value ?: 0L).toString(), dwlevel.toInt(), (lplpbbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceQueryUpdateResult(hmprserver: Long, hinterface: Handle, dwprotocolid: UInt, lpdwupdateresult: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceQueryUpdateResult(hmprserver.toString(), (hinterface?.value ?: 0L).toString(), dwprotocolid.toInt(), (lpdwupdateresult?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceSetCredentials(lpwsserver: Pcwstr, lpwsinterfacename: Pcwstr, lpwsusername: Pcwstr, lpwsdomainname: Pcwstr, lpwspassword: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceSetCredentials((lpwsserver?.value ?: 0L).toString(), (lpwsinterfacename?.value ?: 0L).toString(), (lpwsusername?.value ?: 0L).toString(), (lpwsdomainname?.value ?: 0L).toString(), (lpwspassword?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceSetCredentialsEx(hmprserver: Long, hinterface: Handle, dwlevel: UInt, lpbbuffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceSetCredentialsEx(hmprserver.toString(), (hinterface?.value ?: 0L).toString(), dwlevel.toInt(), (lpbbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceSetCustomInfoEx(hmprserver: Long, hinterface: Handle, pcustominfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceSetCustomInfoEx(hmprserver.toString(), (hinterface?.value ?: 0L).toString(), (pcustominfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceSetInfo(hmprserver: Long, hinterface: Handle, dwlevel: UInt, lpbbuffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceSetInfo(hmprserver.toString(), (hinterface?.value ?: 0L).toString(), dwlevel.toInt(), (lpbbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceTransportAdd(hmprserver: Long, hinterface: Handle, dwtransportid: UInt, pinterfaceinfo: COpaquePointer?, dwinterfaceinfosize: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceTransportAdd(hmprserver.toString(), (hinterface?.value ?: 0L).toString(), dwtransportid.toInt(), (pinterfaceinfo?.value ?: 0L).toString(), dwinterfaceinfosize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceTransportGetInfo(hmprserver: Long, hinterface: Handle, dwtransportid: UInt, ppinterfaceinfo: COpaquePointer?, lpdwinterfaceinfosize: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceTransportGetInfo(hmprserver.toString(), (hinterface?.value ?: 0L).toString(), dwtransportid.toInt(), (ppinterfaceinfo?.value ?: 0L).toString(), (lpdwinterfaceinfosize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceTransportRemove(hmprserver: Long, hinterface: Handle, dwtransportid: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceTransportRemove(hmprserver.toString(), (hinterface?.value ?: 0L).toString(), dwtransportid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceTransportSetInfo(hmprserver: Long, hinterface: Handle, dwtransportid: UInt, pinterfaceinfo: COpaquePointer?, dwinterfaceinfosize: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceTransportSetInfo(hmprserver.toString(), (hinterface?.value ?: 0L).toString(), dwtransportid.toInt(), (pinterfaceinfo?.value ?: 0L).toString(), dwinterfaceinfosize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceUpdatePhonebookInfo(hmprserver: Long, hinterface: Handle): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceUpdatePhonebookInfo(hmprserver.toString(), (hinterface?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceUpdateRoutes(hmprserver: Long, hinterface: Handle, dwprotocolid: UInt, hevent: Handle): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminInterfaceUpdateRoutes(hmprserver.toString(), (hinterface?.value ?: 0L).toString(), dwprotocolid.toInt(), (hevent?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminIsDomainRasServer(pszdomain: Pcwstr, pszmachine: Pcwstr, pbisrasserver: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminIsDomainRasServer((pszdomain?.value ?: 0L).toString(), (pszmachine?.value ?: 0L).toString(), (pbisrasserver?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminIsServiceInitialized(lpwsservername: Pcwstr, fisserviceinitialized: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminIsServiceInitialized((lpwsservername?.value ?: 0L).toString(), (fisserviceinitialized?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminIsServiceRunning(lpwsservername: Pcwstr): Bool =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminIsServiceRunning((lpwsservername?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminMIBBufferFree(pbuffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminMIBBufferFree((pbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminMIBEntryCreate(hmibserver: Long, dwpid: UInt, dwroutingpid: UInt, lpentry: COpaquePointer?, dwentrysize: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminMIBEntryCreate(hmibserver.toString(), dwpid.toInt(), dwroutingpid.toInt(), (lpentry?.value ?: 0L).toString(), dwentrysize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminMIBEntryDelete(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpentry: COpaquePointer?, dwentrysize: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminMIBEntryDelete(hmibserver.toString(), dwprotocolid.toInt(), dwroutingpid.toInt(), (lpentry?.value ?: 0L).toString(), dwentrysize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminMIBEntryGet(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: COpaquePointer?, dwinentrysize: UInt, lplpoutentry: COpaquePointer?, lpoutentrysize: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminMIBEntryGet(hmibserver.toString(), dwprotocolid.toInt(), dwroutingpid.toInt(), (lpinentry?.value ?: 0L).toString(), dwinentrysize.toInt(), (lplpoutentry?.value ?: 0L).toString(), (lpoutentrysize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminMIBEntryGetFirst(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: COpaquePointer?, dwinentrysize: UInt, lplpoutentry: COpaquePointer?, lpoutentrysize: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminMIBEntryGetFirst(hmibserver.toString(), dwprotocolid.toInt(), dwroutingpid.toInt(), (lpinentry?.value ?: 0L).toString(), dwinentrysize.toInt(), (lplpoutentry?.value ?: 0L).toString(), (lpoutentrysize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminMIBEntryGetNext(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: COpaquePointer?, dwinentrysize: UInt, lplpoutentry: COpaquePointer?, lpoutentrysize: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminMIBEntryGetNext(hmibserver.toString(), dwprotocolid.toInt(), dwroutingpid.toInt(), (lpinentry?.value ?: 0L).toString(), dwinentrysize.toInt(), (lplpoutentry?.value ?: 0L).toString(), (lpoutentrysize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminMIBEntrySet(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpentry: COpaquePointer?, dwentrysize: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminMIBEntrySet(hmibserver.toString(), dwprotocolid.toInt(), dwroutingpid.toInt(), (lpentry?.value ?: 0L).toString(), dwentrysize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminMIBServerConnect(lpwsservername: Pcwstr, phmibserver: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminMIBServerConnect((lpwsservername?.value ?: 0L).toString(), (phmibserver?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminMIBServerDisconnect(hmibserver: Long) {
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminMIBServerDisconnect(hmibserver.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mprAdminPortClearStats(hrasserver: Long, hport: Handle): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminPortClearStats(hrasserver.toString(), (hport?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminPortDisconnect(hrasserver: Long, hport: Handle): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminPortDisconnect(hrasserver.toString(), (hport?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminPortEnum(hrasserver: Long, dwlevel: UInt, hrasconnection: Handle, lplpbbuffer: COpaquePointer?, dwprefmaxlen: UInt, lpdwentriesread: COpaquePointer?, lpdwtotalentries: COpaquePointer?, lpdwresumehandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminPortEnum(hrasserver.toString(), dwlevel.toInt(), (hrasconnection?.value ?: 0L).toString(), (lplpbbuffer?.value ?: 0L).toString(), dwprefmaxlen.toInt(), (lpdwentriesread?.value ?: 0L).toString(), (lpdwtotalentries?.value ?: 0L).toString(), (lpdwresumehandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminPortGetInfo(hrasserver: Long, dwlevel: UInt, hport: Handle, lplpbbuffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminPortGetInfo(hrasserver.toString(), dwlevel.toInt(), (hport?.value ?: 0L).toString(), (lplpbbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminPortReset(hrasserver: Long, hport: Handle): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminPortReset(hrasserver.toString(), (hport?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminRegisterConnectionNotification(hmprserver: Long, heventnotification: Handle): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminRegisterConnectionNotification(hmprserver.toString(), (heventnotification?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminSendUserMessage(hmprserver: Long, hconnection: Handle, lpwszmessage: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminSendUserMessage(hmprserver.toString(), (hconnection?.value ?: 0L).toString(), (lpwszmessage?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminServerConnect(lpwsservername: Pcwstr, phmprserver: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminServerConnect((lpwsservername?.value ?: 0L).toString(), (phmprserver?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminServerDisconnect(hmprserver: Long) {
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminServerDisconnect(hmprserver.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mprAdminServerGetCredentials(hmprserver: Long, dwlevel: UInt, lplpbbuffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminServerGetCredentials(hmprserver.toString(), dwlevel.toInt(), (lplpbbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminServerGetInfo(hmprserver: Long, dwlevel: UInt, lplpbbuffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminServerGetInfo(hmprserver.toString(), dwlevel.toInt(), (lplpbbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminServerGetInfoEx(hmprserver: Long, pserverinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminServerGetInfoEx(hmprserver.toString(), (pserverinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminServerSetCredentials(hmprserver: Long, dwlevel: UInt, lpbbuffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminServerSetCredentials(hmprserver.toString(), dwlevel.toInt(), (lpbbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminServerSetInfo(hmprserver: Long, dwlevel: UInt, lpbbuffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminServerSetInfo(hmprserver.toString(), dwlevel.toInt(), (lpbbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminServerSetInfoEx(hmprserver: Long, pserverinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminServerSetInfoEx(hmprserver.toString(), (pserverinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminTransportCreate(hmprserver: Long, dwtransportid: UInt, lpwstransportname: Pcwstr, pglobalinfo: COpaquePointer?, dwglobalinfosize: UInt, pclientinterfaceinfo: COpaquePointer?, dwclientinterfaceinfosize: UInt, lpwsdllpath: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminTransportCreate(hmprserver.toString(), dwtransportid.toInt(), (lpwstransportname?.value ?: 0L).toString(), (pglobalinfo?.value ?: 0L).toString(), dwglobalinfosize.toInt(), (pclientinterfaceinfo?.value ?: 0L).toString(), dwclientinterfaceinfosize.toInt(), (lpwsdllpath?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminTransportGetInfo(hmprserver: Long, dwtransportid: UInt, ppglobalinfo: COpaquePointer?, lpdwglobalinfosize: COpaquePointer?, ppclientinterfaceinfo: COpaquePointer?, lpdwclientinterfaceinfosize: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminTransportGetInfo(hmprserver.toString(), dwtransportid.toInt(), (ppglobalinfo?.value ?: 0L).toString(), (lpdwglobalinfosize?.value ?: 0L).toString(), (ppclientinterfaceinfo?.value ?: 0L).toString(), (lpdwclientinterfaceinfosize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminTransportSetInfo(hmprserver: Long, dwtransportid: UInt, pglobalinfo: COpaquePointer?, dwglobalinfosize: UInt, pclientinterfaceinfo: COpaquePointer?, dwclientinterfaceinfosize: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminTransportSetInfo(hmprserver.toString(), dwtransportid.toInt(), (pglobalinfo?.value ?: 0L).toString(), dwglobalinfosize.toInt(), (pclientinterfaceinfo?.value ?: 0L).toString(), dwclientinterfaceinfosize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminUpdateConnection(hrasserver: Long, hrasconnection: Handle, prasupdateconnection: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminUpdateConnection(hrasserver.toString(), (hrasconnection?.value ?: 0L).toString(), (prasupdateconnection?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminUserGetInfo(lpszserver: Pcwstr, lpszuser: Pcwstr, dwlevel: UInt, lpbbuffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminUserGetInfo((lpszserver?.value ?: 0L).toString(), (lpszuser?.value ?: 0L).toString(), dwlevel.toInt(), (lpbbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminUserSetInfo(lpszserver: Pcwstr, lpszuser: Pcwstr, dwlevel: UInt, lpbbuffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprAdminUserSetInfo((lpszserver?.value ?: 0L).toString(), (lpszuser?.value ?: 0L).toString(), dwlevel.toInt(), (lpbbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigBufferFree(pbuffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigBufferFree((pbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigFilterGetInfo(hmprconfig: Handle, dwlevel: UInt, dwtransportid: UInt, lpbuffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigFilterGetInfo((hmprconfig?.value ?: 0L).toString(), dwlevel.toInt(), dwtransportid.toInt(), (lpbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigFilterSetInfo(hmprconfig: Handle, dwlevel: UInt, dwtransportid: UInt, lpbuffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigFilterSetInfo((hmprconfig?.value ?: 0L).toString(), dwlevel.toInt(), dwtransportid.toInt(), (lpbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigGetFriendlyName(hmprconfig: Handle, pszguidname: Pcwstr, pszbuffer: Pwstr, dwbuffersize: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigGetFriendlyName((hmprconfig?.value ?: 0L).toString(), (pszguidname?.value ?: 0L).toString(), (pszbuffer?.value ?: 0L).toString(), dwbuffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigGetGuidName(hmprconfig: Handle, pszfriendlyname: Pcwstr, pszbuffer: Pwstr, dwbuffersize: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigGetGuidName((hmprconfig?.value ?: 0L).toString(), (pszfriendlyname?.value ?: 0L).toString(), (pszbuffer?.value ?: 0L).toString(), dwbuffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceCreate(hmprconfig: Handle, dwlevel: UInt, lpbbuffer: COpaquePointer?, phrouterinterface: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceCreate((hmprconfig?.value ?: 0L).toString(), dwlevel.toInt(), (lpbbuffer?.value ?: 0L).toString(), (phrouterinterface?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceDelete(hmprconfig: Handle, hrouterinterface: Handle): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceDelete((hmprconfig?.value ?: 0L).toString(), (hrouterinterface?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceEnum(hmprconfig: Handle, dwlevel: UInt, lplpbuffer: COpaquePointer?, dwprefmaxlen: UInt, lpdwentriesread: COpaquePointer?, lpdwtotalentries: COpaquePointer?, lpdwresumehandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceEnum((hmprconfig?.value ?: 0L).toString(), dwlevel.toInt(), (lplpbuffer?.value ?: 0L).toString(), dwprefmaxlen.toInt(), (lpdwentriesread?.value ?: 0L).toString(), (lpdwtotalentries?.value ?: 0L).toString(), (lpdwresumehandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceGetCustomInfoEx(hmprconfig: Handle, hrouterinterface: Handle, pcustominfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceGetCustomInfoEx((hmprconfig?.value ?: 0L).toString(), (hrouterinterface?.value ?: 0L).toString(), (pcustominfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceGetHandle(hmprconfig: Handle, lpwsinterfacename: Pcwstr, phrouterinterface: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceGetHandle((hmprconfig?.value ?: 0L).toString(), (lpwsinterfacename?.value ?: 0L).toString(), (phrouterinterface?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceGetInfo(hmprconfig: Handle, hrouterinterface: Handle, dwlevel: UInt, lplpbuffer: COpaquePointer?, lpdwbuffersize: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceGetInfo((hmprconfig?.value ?: 0L).toString(), (hrouterinterface?.value ?: 0L).toString(), dwlevel.toInt(), (lplpbuffer?.value ?: 0L).toString(), (lpdwbuffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceSetCustomInfoEx(hmprconfig: Handle, hrouterinterface: Handle, pcustominfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceSetCustomInfoEx((hmprconfig?.value ?: 0L).toString(), (hrouterinterface?.value ?: 0L).toString(), (pcustominfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceSetInfo(hmprconfig: Handle, hrouterinterface: Handle, dwlevel: UInt, lpbbuffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceSetInfo((hmprconfig?.value ?: 0L).toString(), (hrouterinterface?.value ?: 0L).toString(), dwlevel.toInt(), (lpbbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceTransportAdd(hmprconfig: Handle, hrouterinterface: Handle, dwtransportid: UInt, lpwstransportname: Pcwstr, pinterfaceinfo: COpaquePointer?, dwinterfaceinfosize: UInt, phrouteriftransport: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceTransportAdd((hmprconfig?.value ?: 0L).toString(), (hrouterinterface?.value ?: 0L).toString(), dwtransportid.toInt(), (lpwstransportname?.value ?: 0L).toString(), (pinterfaceinfo?.value ?: 0L).toString(), dwinterfaceinfosize.toInt(), (phrouteriftransport?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceTransportEnum(hmprconfig: Handle, hrouterinterface: Handle, dwlevel: UInt, lplpbuffer: COpaquePointer?, dwprefmaxlen: UInt, lpdwentriesread: COpaquePointer?, lpdwtotalentries: COpaquePointer?, lpdwresumehandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceTransportEnum((hmprconfig?.value ?: 0L).toString(), (hrouterinterface?.value ?: 0L).toString(), dwlevel.toInt(), (lplpbuffer?.value ?: 0L).toString(), dwprefmaxlen.toInt(), (lpdwentriesread?.value ?: 0L).toString(), (lpdwtotalentries?.value ?: 0L).toString(), (lpdwresumehandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceTransportGetHandle(hmprconfig: Handle, hrouterinterface: Handle, dwtransportid: UInt, phrouteriftransport: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceTransportGetHandle((hmprconfig?.value ?: 0L).toString(), (hrouterinterface?.value ?: 0L).toString(), dwtransportid.toInt(), (phrouteriftransport?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceTransportGetInfo(hmprconfig: Handle, hrouterinterface: Handle, hrouteriftransport: Handle, ppinterfaceinfo: COpaquePointer?, lpdwinterfaceinfosize: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceTransportGetInfo((hmprconfig?.value ?: 0L).toString(), (hrouterinterface?.value ?: 0L).toString(), (hrouteriftransport?.value ?: 0L).toString(), (ppinterfaceinfo?.value ?: 0L).toString(), (lpdwinterfaceinfosize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceTransportRemove(hmprconfig: Handle, hrouterinterface: Handle, hrouteriftransport: Handle): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceTransportRemove((hmprconfig?.value ?: 0L).toString(), (hrouterinterface?.value ?: 0L).toString(), (hrouteriftransport?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceTransportSetInfo(hmprconfig: Handle, hrouterinterface: Handle, hrouteriftransport: Handle, pinterfaceinfo: COpaquePointer?, dwinterfaceinfosize: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigInterfaceTransportSetInfo((hmprconfig?.value ?: 0L).toString(), (hrouterinterface?.value ?: 0L).toString(), (hrouteriftransport?.value ?: 0L).toString(), (pinterfaceinfo?.value ?: 0L).toString(), dwinterfaceinfosize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigServerBackup(hmprconfig: Handle, lpwspath: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigServerBackup((hmprconfig?.value ?: 0L).toString(), (lpwspath?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigServerConnect(lpwsservername: Pcwstr, phmprconfig: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigServerConnect((lpwsservername?.value ?: 0L).toString(), (phmprconfig?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigServerDisconnect(hmprconfig: Handle) {
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigServerDisconnect((hmprconfig?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mprConfigServerGetInfo(hmprconfig: Handle, dwlevel: UInt, lplpbbuffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigServerGetInfo((hmprconfig?.value ?: 0L).toString(), dwlevel.toInt(), (lplpbbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigServerGetInfoEx(hmprconfig: Handle, pserverinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigServerGetInfoEx((hmprconfig?.value ?: 0L).toString(), (pserverinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigServerInstall(dwlevel: UInt, pbuffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigServerInstall(dwlevel.toInt(), (pbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigServerRefresh(hmprconfig: Handle): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigServerRefresh((hmprconfig?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigServerRestore(hmprconfig: Handle, lpwspath: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigServerRestore((hmprconfig?.value ?: 0L).toString(), (lpwspath?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigServerSetInfo(hmprserver: Long, dwlevel: UInt, lpbbuffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigServerSetInfo(hmprserver.toString(), dwlevel.toInt(), (lpbbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigServerSetInfoEx(hmprconfig: Handle, psetserverconfig: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigServerSetInfoEx((hmprconfig?.value ?: 0L).toString(), (psetserverconfig?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigTransportCreate(hmprconfig: Handle, dwtransportid: UInt, lpwstransportname: Pcwstr, pglobalinfo: COpaquePointer?, dwglobalinfosize: UInt, pclientinterfaceinfo: COpaquePointer?, dwclientinterfaceinfosize: UInt, lpwsdllpath: Pcwstr, phroutertransport: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigTransportCreate((hmprconfig?.value ?: 0L).toString(), dwtransportid.toInt(), (lpwstransportname?.value ?: 0L).toString(), (pglobalinfo?.value ?: 0L).toString(), dwglobalinfosize.toInt(), (pclientinterfaceinfo?.value ?: 0L).toString(), dwclientinterfaceinfosize.toInt(), (lpwsdllpath?.value ?: 0L).toString(), (phroutertransport?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigTransportDelete(hmprconfig: Handle, hroutertransport: Handle): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigTransportDelete((hmprconfig?.value ?: 0L).toString(), (hroutertransport?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigTransportEnum(hmprconfig: Handle, dwlevel: UInt, lplpbuffer: COpaquePointer?, dwprefmaxlen: UInt, lpdwentriesread: COpaquePointer?, lpdwtotalentries: COpaquePointer?, lpdwresumehandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigTransportEnum((hmprconfig?.value ?: 0L).toString(), dwlevel.toInt(), (lplpbuffer?.value ?: 0L).toString(), dwprefmaxlen.toInt(), (lpdwentriesread?.value ?: 0L).toString(), (lpdwtotalentries?.value ?: 0L).toString(), (lpdwresumehandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigTransportGetHandle(hmprconfig: Handle, dwtransportid: UInt, phroutertransport: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigTransportGetHandle((hmprconfig?.value ?: 0L).toString(), dwtransportid.toInt(), (phroutertransport?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigTransportGetInfo(hmprconfig: Handle, hroutertransport: Handle, ppglobalinfo: COpaquePointer?, lpdwglobalinfosize: COpaquePointer?, ppclientinterfaceinfo: COpaquePointer?, lpdwclientinterfaceinfosize: COpaquePointer?, lplpwsdllpath: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigTransportGetInfo((hmprconfig?.value ?: 0L).toString(), (hroutertransport?.value ?: 0L).toString(), (ppglobalinfo?.value ?: 0L).toString(), (lpdwglobalinfosize?.value ?: 0L).toString(), (ppclientinterfaceinfo?.value ?: 0L).toString(), (lpdwclientinterfaceinfosize?.value ?: 0L).toString(), (lplpwsdllpath?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigTransportSetInfo(hmprconfig: Handle, hroutertransport: Handle, pglobalinfo: COpaquePointer?, dwglobalinfosize: UInt, pclientinterfaceinfo: COpaquePointer?, dwclientinterfaceinfosize: UInt, lpwsdllpath: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprConfigTransportSetInfo((hmprconfig?.value ?: 0L).toString(), (hroutertransport?.value ?: 0L).toString(), (pglobalinfo?.value ?: 0L).toString(), dwglobalinfosize.toInt(), (pclientinterfaceinfo?.value ?: 0L).toString(), dwclientinterfaceinfosize.toInt(), (lpwsdllpath?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprInfoBlockAdd(lpheader: COpaquePointer?, dwinfotype: UInt, dwitemsize: UInt, dwitemcount: UInt, lpitemdata: COpaquePointer?, lplpnewheader: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprInfoBlockAdd((lpheader?.value ?: 0L).toString(), dwinfotype.toInt(), dwitemsize.toInt(), dwitemcount.toInt(), (lpitemdata?.value ?: 0L).toString(), (lplpnewheader?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprInfoBlockFind(lpheader: COpaquePointer?, dwinfotype: UInt, lpdwitemsize: COpaquePointer?, lpdwitemcount: COpaquePointer?, lplpitemdata: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprInfoBlockFind((lpheader?.value ?: 0L).toString(), dwinfotype.toInt(), (lpdwitemsize?.value ?: 0L).toString(), (lpdwitemcount?.value ?: 0L).toString(), (lplpitemdata?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprInfoBlockQuerySize(lpheader: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprInfoBlockQuerySize((lpheader?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprInfoBlockRemove(lpheader: COpaquePointer?, dwinfotype: UInt, lplpnewheader: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprInfoBlockRemove((lpheader?.value ?: 0L).toString(), dwinfotype.toInt(), (lplpnewheader?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprInfoBlockSet(lpheader: COpaquePointer?, dwinfotype: UInt, dwitemsize: UInt, dwitemcount: UInt, lpitemdata: COpaquePointer?, lplpnewheader: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprInfoBlockSet((lpheader?.value ?: 0L).toString(), dwinfotype.toInt(), dwitemsize.toInt(), dwitemcount.toInt(), (lpitemdata?.value ?: 0L).toString(), (lplpnewheader?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprInfoCreate(dwversion: UInt, lplpnewheader: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprInfoCreate(dwversion.toInt(), (lplpnewheader?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprInfoDelete(lpheader: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprInfoDelete((lpheader?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprInfoDuplicate(lpheader: COpaquePointer?, lplpnewheader: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprInfoDuplicate((lpheader?.value ?: 0L).toString(), (lplpnewheader?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprInfoRemoveAll(lpheader: COpaquePointer?, lplpnewheader: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_mprInfoRemoveAll((lpheader?.value ?: 0L).toString(), (lplpnewheader?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasClearConnectionStatistics(hrasconn: Hrasconn): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasClearConnectionStatistics((hrasconn?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasClearLinkStatistics(hrasconn: Hrasconn, dwsubentry: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasClearLinkStatistics((hrasconn?.value ?: 0L).toString(), dwsubentry.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasConnectionNotificationA(param0: Hrasconn, param1: Handle, param2: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasConnectionNotificationA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), param2.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasConnectionNotificationW(param0: Hrasconn, param1: Handle, param2: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasConnectionNotificationW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), param2.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasCreatePhonebookEntryA(param0: Hwnd, param1: Pcstr): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasCreatePhonebookEntryA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasCreatePhonebookEntryW(param0: Hwnd, param1: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasCreatePhonebookEntryW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasDeleteEntryA(param0: Pcstr, param1: Pcstr): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasDeleteEntryA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasDeleteEntryW(param0: Pcwstr, param1: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasDeleteEntryW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasDeleteSubEntryA(pszphonebook: Pcstr, pszentry: Pcstr, dwsubentryid: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasDeleteSubEntryA((pszphonebook?.value ?: 0L).toString(), (pszentry?.value ?: 0L).toString(), dwsubentryid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasDeleteSubEntryW(pszphonebook: Pcwstr, pszentry: Pcwstr, dwsubentryid: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasDeleteSubEntryW((pszphonebook?.value ?: 0L).toString(), (pszentry?.value ?: 0L).toString(), dwsubentryid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasDialA(param0: COpaquePointer?, param1: Pcstr, param2: COpaquePointer?, param3: UInt, param4: COpaquePointer?, param5: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasDialA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString(), param3.toInt(), (param4?.value ?: 0L).toString(), (param5?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasDialDlgA(lpszphonebook: Pcstr, lpszentry: Pcstr, lpszphonenumber: Pcstr, lpinfo: COpaquePointer?): Bool =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasDialDlgA((lpszphonebook?.value ?: 0L).toString(), (lpszentry?.value ?: 0L).toString(), (lpszphonenumber?.value ?: 0L).toString(), (lpinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasDialDlgW(lpszphonebook: Pcwstr, lpszentry: Pcwstr, lpszphonenumber: Pcwstr, lpinfo: COpaquePointer?): Bool =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasDialDlgW((lpszphonebook?.value ?: 0L).toString(), (lpszentry?.value ?: 0L).toString(), (lpszphonenumber?.value ?: 0L).toString(), (lpinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasDialW(param0: COpaquePointer?, param1: Pcwstr, param2: COpaquePointer?, param3: UInt, param4: COpaquePointer?, param5: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasDialW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString(), param3.toInt(), (param4?.value ?: 0L).toString(), (param5?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasEditPhonebookEntryA(param0: Hwnd, param1: Pcstr, param2: Pcstr): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasEditPhonebookEntryA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasEditPhonebookEntryW(param0: Hwnd, param1: Pcwstr, param2: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasEditPhonebookEntryW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasEntryDlgA(lpszphonebook: Pcstr, lpszentry: Pcstr, lpinfo: COpaquePointer?): Bool =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasEntryDlgA((lpszphonebook?.value ?: 0L).toString(), (lpszentry?.value ?: 0L).toString(), (lpinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasEntryDlgW(lpszphonebook: Pcwstr, lpszentry: Pcwstr, lpinfo: COpaquePointer?): Bool =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasEntryDlgW((lpszphonebook?.value ?: 0L).toString(), (lpszentry?.value ?: 0L).toString(), (lpinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasEnumAutodialAddressesA(lpprasautodialaddresses: COpaquePointer?, lpdwcbrasautodialaddresses: COpaquePointer?, lpdwcrasautodialaddresses: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasEnumAutodialAddressesA((lpprasautodialaddresses?.value ?: 0L).toString(), (lpdwcbrasautodialaddresses?.value ?: 0L).toString(), (lpdwcrasautodialaddresses?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasEnumAutodialAddressesW(lpprasautodialaddresses: COpaquePointer?, lpdwcbrasautodialaddresses: COpaquePointer?, lpdwcrasautodialaddresses: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasEnumAutodialAddressesW((lpprasautodialaddresses?.value ?: 0L).toString(), (lpdwcbrasautodialaddresses?.value ?: 0L).toString(), (lpdwcrasautodialaddresses?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasEnumConnectionsA(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasEnumConnectionsA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasEnumConnectionsW(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasEnumConnectionsW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasEnumDevicesA(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasEnumDevicesA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasEnumDevicesW(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasEnumDevicesW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasEnumEntriesA(param0: Pcstr, param1: Pcstr, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasEnumEntriesA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString(), (param3?.value ?: 0L).toString(), (param4?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasEnumEntriesW(param0: Pcwstr, param1: Pcwstr, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasEnumEntriesW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString(), (param3?.value ?: 0L).toString(), (param4?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasFreeEapUserIdentityA(praseapuseridentity: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_rras_rasFreeEapUserIdentityA((praseapuseridentity?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rasFreeEapUserIdentityW(praseapuseridentity: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_rras_rasFreeEapUserIdentityW((praseapuseridentity?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rasGetAutodialAddressA(param0: Pcstr, param1: COpaquePointer?, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetAutodialAddressA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString(), (param3?.value ?: 0L).toString(), (param4?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetAutodialAddressW(param0: Pcwstr, param1: COpaquePointer?, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetAutodialAddressW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString(), (param3?.value ?: 0L).toString(), (param4?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetAutodialEnableA(param0: UInt, param1: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetAutodialEnableA(param0.toInt(), (param1?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetAutodialEnableW(param0: UInt, param1: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetAutodialEnableW(param0.toInt(), (param1?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetAutodialParamA(param0: UInt, param1: COpaquePointer?, param2: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetAutodialParamA(param0.toInt(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetAutodialParamW(param0: UInt, param1: COpaquePointer?, param2: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetAutodialParamW(param0.toInt(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetConnectStatusA(param0: Hrasconn, param1: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetConnectStatusA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetConnectStatusW(param0: Hrasconn, param1: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetConnectStatusW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetConnectionStatistics(hrasconn: Hrasconn, lpstatistics: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetConnectionStatistics((hrasconn?.value ?: 0L).toString(), (lpstatistics?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetCountryInfoA(param0: COpaquePointer?, param1: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetCountryInfoA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetCountryInfoW(param0: COpaquePointer?, param1: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetCountryInfoW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetCredentialsA(param0: Pcstr, param1: Pcstr, param2: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetCredentialsA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetCredentialsW(param0: Pcwstr, param1: Pcwstr, param2: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetCredentialsW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetCustomAuthDataA(pszphonebook: Pcstr, pszentry: Pcstr, pbcustomauthdata: COpaquePointer?, pdwsizeofcustomauthdata: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetCustomAuthDataA((pszphonebook?.value ?: 0L).toString(), (pszentry?.value ?: 0L).toString(), (pbcustomauthdata?.value ?: 0L).toString(), (pdwsizeofcustomauthdata?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetCustomAuthDataW(pszphonebook: Pcwstr, pszentry: Pcwstr, pbcustomauthdata: COpaquePointer?, pdwsizeofcustomauthdata: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetCustomAuthDataW((pszphonebook?.value ?: 0L).toString(), (pszentry?.value ?: 0L).toString(), (pbcustomauthdata?.value ?: 0L).toString(), (pdwsizeofcustomauthdata?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetEapUserDataA(htoken: Handle, pszphonebook: Pcstr, pszentry: Pcstr, pbeapdata: COpaquePointer?, pdwsizeofeapdata: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetEapUserDataA((htoken?.value ?: 0L).toString(), (pszphonebook?.value ?: 0L).toString(), (pszentry?.value ?: 0L).toString(), (pbeapdata?.value ?: 0L).toString(), (pdwsizeofeapdata?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetEapUserDataW(htoken: Handle, pszphonebook: Pcwstr, pszentry: Pcwstr, pbeapdata: COpaquePointer?, pdwsizeofeapdata: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetEapUserDataW((htoken?.value ?: 0L).toString(), (pszphonebook?.value ?: 0L).toString(), (pszentry?.value ?: 0L).toString(), (pbeapdata?.value ?: 0L).toString(), (pdwsizeofeapdata?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetEapUserIdentityA(pszphonebook: Pcstr, pszentry: Pcstr, dwflags: UInt, hwnd: Hwnd, ppraseapuseridentity: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetEapUserIdentityA((pszphonebook?.value ?: 0L).toString(), (pszentry?.value ?: 0L).toString(), dwflags.toInt(), (hwnd?.value ?: 0L).toString(), (ppraseapuseridentity?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetEapUserIdentityW(pszphonebook: Pcwstr, pszentry: Pcwstr, dwflags: UInt, hwnd: Hwnd, ppraseapuseridentity: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetEapUserIdentityW((pszphonebook?.value ?: 0L).toString(), (pszentry?.value ?: 0L).toString(), dwflags.toInt(), (hwnd?.value ?: 0L).toString(), (ppraseapuseridentity?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetEntryDialParamsA(param0: Pcstr, param1: COpaquePointer?, param2: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetEntryDialParamsA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetEntryDialParamsW(param0: Pcwstr, param1: COpaquePointer?, param2: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetEntryDialParamsW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetEntryPropertiesA(param0: Pcstr, param1: Pcstr, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?, param5: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetEntryPropertiesA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString(), (param3?.value ?: 0L).toString(), (param4?.value ?: 0L).toString(), (param5?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetEntryPropertiesW(param0: Pcwstr, param1: Pcwstr, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?, param5: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetEntryPropertiesW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString(), (param3?.value ?: 0L).toString(), (param4?.value ?: 0L).toString(), (param5?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetErrorStringA(resourceid: UInt, lpszstring: Pstr, inbufsize: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetErrorStringA(resourceid.toInt(), (lpszstring?.value ?: 0L).toString(), inbufsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetErrorStringW(resourceid: UInt, lpszstring: Pwstr, inbufsize: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetErrorStringW(resourceid.toInt(), (lpszstring?.value ?: 0L).toString(), inbufsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetLinkStatistics(hrasconn: Hrasconn, dwsubentry: UInt, lpstatistics: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetLinkStatistics((hrasconn?.value ?: 0L).toString(), dwsubentry.toInt(), (lpstatistics?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetPCscf(lpszpcscf: Pwstr): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetPCscf((lpszpcscf?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetProjectionInfoA(param0: Hrasconn, param1: Rasprojection, param2: COpaquePointer?, param3: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetProjectionInfoA((param0?.value ?: 0L).toString(), param1, (param2?.value ?: 0L).toString(), (param3?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetProjectionInfoEx(hrasconn: Hrasconn, prasprojection: COpaquePointer?, lpdwsize: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetProjectionInfoEx((hrasconn?.value ?: 0L).toString(), (prasprojection?.value ?: 0L).toString(), (lpdwsize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetProjectionInfoW(param0: Hrasconn, param1: Rasprojection, param2: COpaquePointer?, param3: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetProjectionInfoW((param0?.value ?: 0L).toString(), param1, (param2?.value ?: 0L).toString(), (param3?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetSubEntryHandleA(param0: Hrasconn, param1: UInt, param2: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetSubEntryHandleA((param0?.value ?: 0L).toString(), param1.toInt(), (param2?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetSubEntryHandleW(param0: Hrasconn, param1: UInt, param2: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetSubEntryHandleW((param0?.value ?: 0L).toString(), param1.toInt(), (param2?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetSubEntryPropertiesA(param0: Pcstr, param1: Pcstr, param2: UInt, param3: COpaquePointer?, param4: COpaquePointer?, param5: COpaquePointer?, param6: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetSubEntryPropertiesA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), param2.toInt(), (param3?.value ?: 0L).toString(), (param4?.value ?: 0L).toString(), (param5?.value ?: 0L).toString(), (param6?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetSubEntryPropertiesW(param0: Pcwstr, param1: Pcwstr, param2: UInt, param3: COpaquePointer?, param4: COpaquePointer?, param5: COpaquePointer?, param6: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasGetSubEntryPropertiesW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), param2.toInt(), (param3?.value ?: 0L).toString(), (param4?.value ?: 0L).toString(), (param5?.value ?: 0L).toString(), (param6?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasHangUpA(param0: Hrasconn): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasHangUpA((param0?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasHangUpW(param0: Hrasconn): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasHangUpW((param0?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasInvokeEapUI(param0: Hrasconn, param1: UInt, param2: COpaquePointer?, param3: Hwnd): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasInvokeEapUI((param0?.value ?: 0L).toString(), param1.toInt(), (param2?.value ?: 0L).toString(), (param3?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasPhonebookDlgA(lpszphonebook: Pcstr, lpszentry: Pcstr, lpinfo: COpaquePointer?): Bool =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasPhonebookDlgA((lpszphonebook?.value ?: 0L).toString(), (lpszentry?.value ?: 0L).toString(), (lpinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasPhonebookDlgW(lpszphonebook: Pcwstr, lpszentry: Pcwstr, lpinfo: COpaquePointer?): Bool =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasPhonebookDlgW((lpszphonebook?.value ?: 0L).toString(), (lpszentry?.value ?: 0L).toString(), (lpinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasRenameEntryA(param0: Pcstr, param1: Pcstr, param2: Pcstr): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasRenameEntryA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasRenameEntryW(param0: Pcwstr, param1: Pcwstr, param2: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasRenameEntryW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetAutodialAddressA(param0: Pcstr, param1: UInt, param2: COpaquePointer?, param3: UInt, param4: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasSetAutodialAddressA((param0?.value ?: 0L).toString(), param1.toInt(), (param2?.value ?: 0L).toString(), param3.toInt(), param4.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetAutodialAddressW(param0: Pcwstr, param1: UInt, param2: COpaquePointer?, param3: UInt, param4: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasSetAutodialAddressW((param0?.value ?: 0L).toString(), param1.toInt(), (param2?.value ?: 0L).toString(), param3.toInt(), param4.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetAutodialEnableA(param0: UInt, param1: Bool): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasSetAutodialEnableA(param0.toInt(), param1).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetAutodialEnableW(param0: UInt, param1: Bool): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasSetAutodialEnableW(param0.toInt(), param1).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetAutodialParamA(param0: UInt, param1: COpaquePointer?, param2: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasSetAutodialParamA(param0.toInt(), (param1?.value ?: 0L).toString(), param2.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetAutodialParamW(param0: UInt, param1: COpaquePointer?, param2: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasSetAutodialParamW(param0.toInt(), (param1?.value ?: 0L).toString(), param2.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetCredentialsA(param0: Pcstr, param1: Pcstr, param2: COpaquePointer?, param3: Bool): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasSetCredentialsA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString(), param3).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetCredentialsW(param0: Pcwstr, param1: Pcwstr, param2: COpaquePointer?, param3: Bool): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasSetCredentialsW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString(), param3).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetCustomAuthDataA(pszphonebook: Pcstr, pszentry: Pcstr, pbcustomauthdata: COpaquePointer?, dwsizeofcustomauthdata: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasSetCustomAuthDataA((pszphonebook?.value ?: 0L).toString(), (pszentry?.value ?: 0L).toString(), (pbcustomauthdata?.value ?: 0L).toString(), dwsizeofcustomauthdata.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetCustomAuthDataW(pszphonebook: Pcwstr, pszentry: Pcwstr, pbcustomauthdata: COpaquePointer?, dwsizeofcustomauthdata: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasSetCustomAuthDataW((pszphonebook?.value ?: 0L).toString(), (pszentry?.value ?: 0L).toString(), (pbcustomauthdata?.value ?: 0L).toString(), dwsizeofcustomauthdata.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetEapUserDataA(htoken: Handle, pszphonebook: Pcstr, pszentry: Pcstr, pbeapdata: COpaquePointer?, dwsizeofeapdata: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasSetEapUserDataA((htoken?.value ?: 0L).toString(), (pszphonebook?.value ?: 0L).toString(), (pszentry?.value ?: 0L).toString(), (pbeapdata?.value ?: 0L).toString(), dwsizeofeapdata.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetEapUserDataW(htoken: Handle, pszphonebook: Pcwstr, pszentry: Pcwstr, pbeapdata: COpaquePointer?, dwsizeofeapdata: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasSetEapUserDataW((htoken?.value ?: 0L).toString(), (pszphonebook?.value ?: 0L).toString(), (pszentry?.value ?: 0L).toString(), (pbeapdata?.value ?: 0L).toString(), dwsizeofeapdata.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetEntryDialParamsA(param0: Pcstr, param1: COpaquePointer?, param2: Bool): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasSetEntryDialParamsA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), param2).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetEntryDialParamsW(param0: Pcwstr, param1: COpaquePointer?, param2: Bool): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasSetEntryDialParamsW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), param2).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetEntryPropertiesA(param0: Pcstr, param1: Pcstr, param2: COpaquePointer?, param3: UInt, param4: COpaquePointer?, param5: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasSetEntryPropertiesA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString(), param3.toInt(), (param4?.value ?: 0L).toString(), param5.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetEntryPropertiesW(param0: Pcwstr, param1: Pcwstr, param2: COpaquePointer?, param3: UInt, param4: COpaquePointer?, param5: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasSetEntryPropertiesW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString(), param3.toInt(), (param4?.value ?: 0L).toString(), param5.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetSubEntryPropertiesA(param0: Pcstr, param1: Pcstr, param2: UInt, param3: COpaquePointer?, param4: UInt, param5: COpaquePointer?, param6: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasSetSubEntryPropertiesA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), param2.toInt(), (param3?.value ?: 0L).toString(), param4.toInt(), (param5?.value ?: 0L).toString(), param6.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetSubEntryPropertiesW(param0: Pcwstr, param1: Pcwstr, param2: UInt, param3: COpaquePointer?, param4: UInt, param5: COpaquePointer?, param6: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasSetSubEntryPropertiesW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), param2.toInt(), (param3?.value ?: 0L).toString(), param4.toInt(), (param5?.value ?: 0L).toString(), param6.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasUpdateConnection(hrasconn: Hrasconn, lprasupdateconn: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasUpdateConnection((hrasconn?.value ?: 0L).toString(), (lprasupdateconn?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasValidateEntryNameA(param0: Pcstr, param1: Pcstr): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasValidateEntryNameA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasValidateEntryNameW(param0: Pcwstr, param1: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rasValidateEntryNameW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmAddNextHop(rtmreghandle: Long, nexthopinfo: COpaquePointer?, nexthophandle: COpaquePointer?, changeflags: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmAddNextHop(rtmreghandle.toString(), (nexthopinfo?.value ?: 0L).toString(), (nexthophandle?.value ?: 0L).toString(), (changeflags?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmAddRouteToDest(rtmreghandle: Long, routehandle: COpaquePointer?, destaddress: COpaquePointer?, routeinfo: COpaquePointer?, timetolive: UInt, routelisthandle: Long, notifytype: UInt, notifyhandle: Long, changeflags: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmAddRouteToDest(rtmreghandle.toString(), (routehandle?.value ?: 0L).toString(), (destaddress?.value ?: 0L).toString(), (routeinfo?.value ?: 0L).toString(), timetolive.toInt(), routelisthandle.toString(), notifytype.toInt(), notifyhandle.toString(), (changeflags?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmBlockMethods(rtmreghandle: Long, targethandle: Handle, targettype: UByte, blockingflag: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmBlockMethods(rtmreghandle.toString(), (targethandle?.value ?: 0L).toString(), targettype.toInt(), blockingflag.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmConvertIpv6AddressAndLengthToNetAddress(pnetaddress: COpaquePointer?, address: In6Addr, dwlength: UInt, dwaddresssize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmConvertNetAddressToIpv6AddressAndLength(pnetaddress: COpaquePointer?, paddress: COpaquePointer?, plength: COpaquePointer?, dwaddresssize: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmConvertNetAddressToIpv6AddressAndLength((pnetaddress?.value ?: 0L).toString(), (paddress?.value ?: 0L).toString(), (plength?.value ?: 0L).toString(), dwaddresssize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmCreateDestEnum(rtmreghandle: Long, targetviews: UInt, enumflags: UInt, netaddress: COpaquePointer?, protocolid: UInt, rtmenumhandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmCreateDestEnum(rtmreghandle.toString(), targetviews.toInt(), enumflags.toInt(), (netaddress?.value ?: 0L).toString(), protocolid.toInt(), (rtmenumhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmCreateNextHopEnum(rtmreghandle: Long, enumflags: UInt, netaddress: COpaquePointer?, rtmenumhandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmCreateNextHopEnum(rtmreghandle.toString(), enumflags.toInt(), (netaddress?.value ?: 0L).toString(), (rtmenumhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmCreateRouteEnum(rtmreghandle: Long, desthandle: Long, targetviews: UInt, enumflags: UInt, startdest: COpaquePointer?, matchingflags: UInt, criteriaroute: COpaquePointer?, criteriainterface: UInt, rtmenumhandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmCreateRouteEnum(rtmreghandle.toString(), desthandle.toString(), targetviews.toInt(), enumflags.toInt(), (startdest?.value ?: 0L).toString(), matchingflags.toInt(), (criteriaroute?.value ?: 0L).toString(), criteriainterface.toInt(), (rtmenumhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmCreateRouteList(rtmreghandle: Long, routelisthandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmCreateRouteList(rtmreghandle.toString(), (routelisthandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmCreateRouteListEnum(rtmreghandle: Long, routelisthandle: Long, rtmenumhandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmCreateRouteListEnum(rtmreghandle.toString(), routelisthandle.toString(), (rtmenumhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmDeleteEnumHandle(rtmreghandle: Long, enumhandle: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmDeleteEnumHandle(rtmreghandle.toString(), enumhandle.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmDeleteNextHop(rtmreghandle: Long, nexthophandle: Long, nexthopinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmDeleteNextHop(rtmreghandle.toString(), nexthophandle.toString(), (nexthopinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmDeleteRouteList(rtmreghandle: Long, routelisthandle: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmDeleteRouteList(rtmreghandle.toString(), routelisthandle.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmDeleteRouteToDest(rtmreghandle: Long, routehandle: Long, changeflags: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmDeleteRouteToDest(rtmreghandle.toString(), routehandle.toString(), (changeflags?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmDeregisterEntity(rtmreghandle: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmDeregisterEntity(rtmreghandle.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmDeregisterFromChangeNotification(rtmreghandle: Long, notifyhandle: Long): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmDeregisterFromChangeNotification(rtmreghandle.toString(), notifyhandle.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmFindNextHop(rtmreghandle: Long, nexthopinfo: COpaquePointer?, nexthophandle: COpaquePointer?, nexthoppointer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmFindNextHop(rtmreghandle.toString(), (nexthopinfo?.value ?: 0L).toString(), (nexthophandle?.value ?: 0L).toString(), (nexthoppointer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetChangeStatus(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, changestatus: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmGetChangeStatus(rtmreghandle.toString(), notifyhandle.toString(), desthandle.toString(), (changestatus?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: COpaquePointer?, changeddests: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmGetChangedDests(rtmreghandle.toString(), notifyhandle.toString(), (numdests?.value ?: 0L).toString(), (changeddests?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetDestInfo(rtmreghandle: Long, desthandle: Long, protocolid: UInt, targetviews: UInt, destinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmGetDestInfo(rtmreghandle.toString(), desthandle.toString(), protocolid.toInt(), targetviews.toInt(), (destinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetEntityInfo(rtmreghandle: Long, entityhandle: Long, entityinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmGetEntityInfo(rtmreghandle.toString(), entityhandle.toString(), (entityinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetEntityMethods(rtmreghandle: Long, entityhandle: Long, nummethods: COpaquePointer?, exptmethods: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmGetEntityMethods(rtmreghandle.toString(), entityhandle.toString(), (nummethods?.value ?: 0L).toString(), (exptmethods?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetEnumDests(rtmreghandle: Long, enumhandle: Long, numdests: COpaquePointer?, destinfos: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmGetEnumDests(rtmreghandle.toString(), enumhandle.toString(), (numdests?.value ?: 0L).toString(), (destinfos?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetEnumNextHops(rtmreghandle: Long, enumhandle: Long, numnexthops: COpaquePointer?, nexthophandles: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmGetEnumNextHops(rtmreghandle.toString(), enumhandle.toString(), (numnexthops?.value ?: 0L).toString(), (nexthophandles?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetEnumRoutes(rtmreghandle: Long, enumhandle: Long, numroutes: COpaquePointer?, routehandles: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmGetEnumRoutes(rtmreghandle.toString(), enumhandle.toString(), (numroutes?.value ?: 0L).toString(), (routehandles?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetExactMatchDestination(rtmreghandle: Long, destaddress: COpaquePointer?, protocolid: UInt, targetviews: UInt, destinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmGetExactMatchDestination(rtmreghandle.toString(), (destaddress?.value ?: 0L).toString(), protocolid.toInt(), targetviews.toInt(), (destinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetExactMatchRoute(rtmreghandle: Long, destaddress: COpaquePointer?, matchingflags: UInt, routeinfo: COpaquePointer?, interfaceindex: UInt, targetviews: UInt, routehandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmGetExactMatchRoute(rtmreghandle.toString(), (destaddress?.value ?: 0L).toString(), matchingflags.toInt(), (routeinfo?.value ?: 0L).toString(), interfaceindex.toInt(), targetviews.toInt(), (routehandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetLessSpecificDestination(rtmreghandle: Long, desthandle: Long, protocolid: UInt, targetviews: UInt, destinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmGetLessSpecificDestination(rtmreghandle.toString(), desthandle.toString(), protocolid.toInt(), targetviews.toInt(), (destinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetListEnumRoutes(rtmreghandle: Long, enumhandle: Long, numroutes: COpaquePointer?, routehandles: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmGetListEnumRoutes(rtmreghandle.toString(), enumhandle.toString(), (numroutes?.value ?: 0L).toString(), (routehandles?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetMostSpecificDestination(rtmreghandle: Long, destaddress: COpaquePointer?, protocolid: UInt, targetviews: UInt, destinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmGetMostSpecificDestination(rtmreghandle.toString(), (destaddress?.value ?: 0L).toString(), protocolid.toInt(), targetviews.toInt(), (destinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetNextHopInfo(rtmreghandle: Long, nexthophandle: Long, nexthopinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmGetNextHopInfo(rtmreghandle.toString(), nexthophandle.toString(), (nexthopinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetNextHopPointer(rtmreghandle: Long, nexthophandle: Long, nexthoppointer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmGetNextHopPointer(rtmreghandle.toString(), nexthophandle.toString(), (nexthoppointer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetOpaqueInformationPointer(rtmreghandle: Long, desthandle: Long, opaqueinfopointer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmGetOpaqueInformationPointer(rtmreghandle.toString(), desthandle.toString(), (opaqueinfopointer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetRegisteredEntities(rtmreghandle: Long, numentities: COpaquePointer?, entityhandles: COpaquePointer?, entityinfos: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmGetRegisteredEntities(rtmreghandle.toString(), (numentities?.value ?: 0L).toString(), (entityhandles?.value ?: 0L).toString(), (entityinfos?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetRouteInfo(rtmreghandle: Long, routehandle: Long, routeinfo: COpaquePointer?, destaddress: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmGetRouteInfo(rtmreghandle.toString(), routehandle.toString(), (routeinfo?.value ?: 0L).toString(), (destaddress?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetRoutePointer(rtmreghandle: Long, routehandle: Long, routepointer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmGetRoutePointer(rtmreghandle.toString(), routehandle.toString(), (routepointer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmHoldDestination(rtmreghandle: Long, desthandle: Long, targetviews: UInt, holdtime: UInt): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmHoldDestination(rtmreghandle.toString(), desthandle.toString(), targetviews.toInt(), holdtime.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmIgnoreChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: UInt, changeddests: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmIgnoreChangedDests(rtmreghandle.toString(), notifyhandle.toString(), numdests.toInt(), (changeddests?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmInsertInRouteList(rtmreghandle: Long, routelisthandle: Long, numroutes: UInt, routehandles: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmInsertInRouteList(rtmreghandle.toString(), routelisthandle.toString(), numroutes.toInt(), (routehandles?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmInvokeMethod(rtmreghandle: Long, entityhandle: Long, input: COpaquePointer?, outputsize: COpaquePointer?, output: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmInvokeMethod(rtmreghandle.toString(), entityhandle.toString(), (input?.value ?: 0L).toString(), (outputsize?.value ?: 0L).toString(), (output?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmIsBestRoute(rtmreghandle: Long, routehandle: Long, bestinviews: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmIsBestRoute(rtmreghandle.toString(), routehandle.toString(), (bestinviews?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmIsMarkedForChangeNotification(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, destmarked: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmIsMarkedForChangeNotification(rtmreghandle.toString(), notifyhandle.toString(), desthandle.toString(), (destmarked?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmLockDestination(rtmreghandle: Long, desthandle: Long, exclusive: Bool, lockdest: Bool): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmLockDestination(rtmreghandle.toString(), desthandle.toString(), exclusive, lockdest).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmLockNextHop(rtmreghandle: Long, nexthophandle: Long, exclusive: Bool, locknexthop: Bool, nexthoppointer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmLockNextHop(rtmreghandle.toString(), nexthophandle.toString(), exclusive, locknexthop, (nexthoppointer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmLockRoute(rtmreghandle: Long, routehandle: Long, exclusive: Bool, lockroute: Bool, routepointer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmLockRoute(rtmreghandle.toString(), routehandle.toString(), exclusive, lockroute, (routepointer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmMarkDestForChangeNotification(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, markdest: Bool): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmMarkDestForChangeNotification(rtmreghandle.toString(), notifyhandle.toString(), desthandle.toString(), markdest).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmReferenceHandles(rtmreghandle: Long, numhandles: UInt, rtmhandles: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmReferenceHandles(rtmreghandle.toString(), numhandles.toInt(), (rtmhandles?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmRegisterEntity(rtmentityinfo: COpaquePointer?, exportmethods: COpaquePointer?, eventcallback: RtmEventCallback, reserveopaquepointer: Bool, rtmregprofile: COpaquePointer?, rtmreghandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmRegisterEntity((rtmentityinfo?.value ?: 0L).toString(), (exportmethods?.value ?: 0L).toString(), 0L.toString(), reserveopaquepointer, (rtmregprofile?.value ?: 0L).toString(), (rtmreghandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmRegisterForChangeNotification(rtmreghandle: Long, targetviews: UInt, notifyflags: UInt, notifycontext: COpaquePointer?, notifyhandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmRegisterForChangeNotification(rtmreghandle.toString(), targetviews.toInt(), notifyflags.toInt(), (notifycontext?.value ?: 0L).toString(), (notifyhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmReleaseChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: UInt, changeddests: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmReleaseChangedDests(rtmreghandle.toString(), notifyhandle.toString(), numdests.toInt(), (changeddests?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmReleaseDestInfo(rtmreghandle: Long, destinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmReleaseDestInfo(rtmreghandle.toString(), (destinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmReleaseDests(rtmreghandle: Long, numdests: UInt, destinfos: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmReleaseDests(rtmreghandle.toString(), numdests.toInt(), (destinfos?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmReleaseEntities(rtmreghandle: Long, numentities: UInt, entityhandles: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmReleaseEntities(rtmreghandle.toString(), numentities.toInt(), (entityhandles?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmReleaseEntityInfo(rtmreghandle: Long, entityinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmReleaseEntityInfo(rtmreghandle.toString(), (entityinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmReleaseNextHopInfo(rtmreghandle: Long, nexthopinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmReleaseNextHopInfo(rtmreghandle.toString(), (nexthopinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmReleaseNextHops(rtmreghandle: Long, numnexthops: UInt, nexthophandles: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmReleaseNextHops(rtmreghandle.toString(), numnexthops.toInt(), (nexthophandles?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmReleaseRouteInfo(rtmreghandle: Long, routeinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmReleaseRouteInfo(rtmreghandle.toString(), (routeinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmReleaseRoutes(rtmreghandle: Long, numroutes: UInt, routehandles: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmReleaseRoutes(rtmreghandle.toString(), numroutes.toInt(), (routehandles?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmUpdateAndUnlockRoute(rtmreghandle: Long, routehandle: Long, timetolive: UInt, routelisthandle: Long, notifytype: UInt, notifyhandle: Long, changeflags: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementRrasNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_rras_rtmUpdateAndUnlockRoute(rtmreghandle.toString(), routehandle.toString(), timetolive.toInt(), routelisthandle.toString(), notifytype.toInt(), notifyhandle.toString(), (changeflags?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
