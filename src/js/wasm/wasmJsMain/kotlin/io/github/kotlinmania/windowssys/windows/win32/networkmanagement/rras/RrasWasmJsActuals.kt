@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.In6Addr

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32NetworkmanagementRrasNapiAddon(): Boolean

private val windowsWin32NetworkmanagementRrasNapiAvailable: Boolean = initWindowsWin32NetworkmanagementRrasNapiAddon()

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMgmAddGroupMembershipEntry(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMgmAddGroupMembershipEntry(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMgmDeRegisterMProtocol(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMgmDeRegisterMProtocol(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMgmDeleteGroupMembershipEntry(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMgmDeleteGroupMembershipEntry(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMgmGetFirstMfe(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMgmGetFirstMfe(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMgmGetFirstMfeStats(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMgmGetFirstMfeStats(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMgmGetMfe(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMgmGetMfe(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMgmGetMfeStats(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMgmGetMfeStats(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMgmGetNextMfe(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMgmGetNextMfe(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMgmGetNextMfeStats(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMgmGetNextMfeStats(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMgmGetProtocolOnInterface(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMgmGetProtocolOnInterface(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMgmGroupEnumerationEnd(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMgmGroupEnumerationEnd(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMgmGroupEnumerationGetNext(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMgmGroupEnumerationGetNext(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMgmGroupEnumerationStart(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMgmGroupEnumerationStart(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMgmRegisterMProtocol(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMgmRegisterMProtocol(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMgmReleaseInterfaceOwnership(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMgmReleaseInterfaceOwnership(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMgmTakeInterfaceOwnership(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMgmTakeInterfaceOwnership(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminBufferFree(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminBufferFree(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionClearStats(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionClearStats(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionEnum(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionEnum(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionEnumEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionEnumEx(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionGetInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionGetInfo(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionGetInfoEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionGetInfoEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionRemoveQuarantine(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionRemoveQuarantine(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminDeregisterConnectionNotification(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminDeregisterConnectionNotification(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminDeviceEnum(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminDeviceEnum(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminEstablishDomainRasServer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminEstablishDomainRasServer(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminGetErrorString(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminGetErrorString(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminGetPDCServer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminGetPDCServer(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceConnect(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceConnect(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceCreate(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceCreate(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDelete(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDelete(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDeviceGetInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDeviceGetInfo(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDeviceSetInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDeviceSetInfo(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDisconnect(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDisconnect(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceEnum(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceEnum(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetCredentials(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetCredentials(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetCredentialsEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetCredentialsEx(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetCustomInfoEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetCustomInfoEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetHandle(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetHandle(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetInfo(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceQueryUpdateResult(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceQueryUpdateResult(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetCredentials(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetCredentials(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetCredentialsEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetCredentialsEx(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetCustomInfoEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetCustomInfoEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetInfo(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportAdd(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportAdd(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportGetInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportGetInfo(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportRemove(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportRemove(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportSetInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportSetInfo(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceUpdatePhonebookInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceUpdatePhonebookInfo(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceUpdateRoutes(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceUpdateRoutes(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminIsDomainRasServer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminIsDomainRasServer(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminIsServiceInitialized(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminIsServiceInitialized(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminIsServiceRunning(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminIsServiceRunning(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBBufferFree(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminMIBBufferFree(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryCreate(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryCreate(p0: String, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryDelete(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryDelete(p0: String, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryGet(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryGet(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryGetFirst(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryGetFirst(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryGetNext(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryGetNext(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntrySet(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntrySet(p0: String, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBServerConnect(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminMIBServerConnect(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminMIBServerDisconnect(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminMIBServerDisconnect(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminPortClearStats(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminPortClearStats(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminPortDisconnect(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminPortDisconnect(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminPortEnum(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminPortEnum(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminPortGetInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminPortGetInfo(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminPortReset(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminPortReset(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminRegisterConnectionNotification(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminRegisterConnectionNotification(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminSendUserMessage(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminSendUserMessage(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminServerConnect(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminServerConnect(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminServerDisconnect(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminServerDisconnect(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminServerGetCredentials(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminServerGetCredentials(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminServerGetInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminServerGetInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminServerGetInfoEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminServerGetInfoEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminServerSetCredentials(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminServerSetCredentials(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminServerSetInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminServerSetInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminServerSetInfoEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminServerSetInfoEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminTransportCreate(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminTransportCreate(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminTransportGetInfo(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminTransportGetInfo(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminTransportSetInfo(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminTransportSetInfo(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminUpdateConnection(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminUpdateConnection(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminUserGetInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminUserGetInfo(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprAdminUserSetInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminUserSetInfo(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprConfigBufferFree(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigBufferFree(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprConfigFilterGetInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigFilterGetInfo(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprConfigFilterSetInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigFilterSetInfo(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprConfigGetFriendlyName(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigGetFriendlyName(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprConfigGetGuidName(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigGetGuidName(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceCreate(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceCreate(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceDelete(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceDelete(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceEnum(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceEnum(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceGetCustomInfoEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceGetCustomInfoEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceGetHandle(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceGetHandle(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceGetInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceGetInfo(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceSetCustomInfoEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceSetCustomInfoEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceSetInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceSetInfo(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportAdd(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportAdd(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportEnum(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportEnum(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportGetHandle(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportGetHandle(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportGetInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportGetInfo(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportRemove(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportRemove(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportSetInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportSetInfo(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprConfigServerBackup(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigServerBackup(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprConfigServerConnect(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigServerConnect(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprConfigServerDisconnect(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigServerDisconnect(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprConfigServerGetInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigServerGetInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprConfigServerGetInfoEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigServerGetInfoEx(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprConfigServerInstall(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigServerInstall(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprConfigServerRefresh(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigServerRefresh(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprConfigServerRestore(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigServerRestore(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprConfigServerSetInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigServerSetInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprConfigServerSetInfoEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigServerSetInfoEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportCreate(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigTransportCreate(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportDelete(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigTransportDelete(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportEnum(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigTransportEnum(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportGetHandle(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigTransportGetHandle(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportGetInfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigTransportGetInfo(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprConfigTransportSetInfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigTransportSetInfo(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockAdd(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprInfoBlockAdd(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockFind(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprInfoBlockFind(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockQuerySize(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprInfoBlockQuerySize(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockRemove(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprInfoBlockRemove(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprInfoBlockSet(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprInfoBlockSet(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprInfoCreate(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprInfoCreate(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprInfoDelete(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprInfoDelete(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprInfoDuplicate(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprInfoDuplicate(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasMprInfoRemoveAll(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasMprInfoRemoveAll(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasClearConnectionStatistics(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasClearConnectionStatistics(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasClearLinkStatistics(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasClearLinkStatistics(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasConnectionNotificationA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasConnectionNotificationA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasConnectionNotificationW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasConnectionNotificationW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasCreatePhonebookEntryA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasCreatePhonebookEntryA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasCreatePhonebookEntryW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasCreatePhonebookEntryW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasDeleteEntryA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasDeleteEntryA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasDeleteEntryW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasDeleteEntryW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasDeleteSubEntryA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasDeleteSubEntryA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasDeleteSubEntryW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasDeleteSubEntryW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasDialA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasDialA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasDialDlgA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasDialDlgA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasDialDlgW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasDialDlgW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasDialW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasDialW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasEditPhonebookEntryA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasEditPhonebookEntryA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasEditPhonebookEntryW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasEditPhonebookEntryW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasEntryDlgA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasEntryDlgA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasEntryDlgW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasEntryDlgW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasEnumAutodialAddressesA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasEnumAutodialAddressesA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasEnumAutodialAddressesW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasEnumAutodialAddressesW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasEnumConnectionsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasEnumConnectionsA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasEnumConnectionsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasEnumConnectionsW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasEnumDevicesA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasEnumDevicesA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasEnumDevicesW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasEnumDevicesW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasEnumEntriesA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasEnumEntriesA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasEnumEntriesW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasEnumEntriesW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasFreeEapUserIdentityA(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasFreeEapUserIdentityA(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasFreeEapUserIdentityW(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasFreeEapUserIdentityW(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialAddressA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetAutodialAddressA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialAddressW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetAutodialAddressW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialEnableA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetAutodialEnableA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialEnableW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetAutodialEnableW(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialParamA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetAutodialParamA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasGetAutodialParamW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetAutodialParamW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasGetConnectStatusA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetConnectStatusA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasGetConnectStatusW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetConnectStatusW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasGetConnectionStatistics(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetConnectionStatistics(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasGetCountryInfoA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetCountryInfoA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasGetCountryInfoW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetCountryInfoW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasGetCredentialsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetCredentialsA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasGetCredentialsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetCredentialsW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasGetCustomAuthDataA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetCustomAuthDataA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasGetCustomAuthDataW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetCustomAuthDataW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserDataA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetEapUserDataA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserDataW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetEapUserDataW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserIdentityA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetEapUserIdentityA(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasGetEapUserIdentityW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetEapUserIdentityW(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasGetEntryDialParamsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetEntryDialParamsA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasGetEntryDialParamsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetEntryDialParamsW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasGetEntryPropertiesA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetEntryPropertiesA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasGetEntryPropertiesW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetEntryPropertiesW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasGetErrorStringA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetErrorStringA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasGetErrorStringW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetErrorStringW(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasGetLinkStatistics(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetLinkStatistics(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasGetPCscf(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetPCscf(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasGetProjectionInfoA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetProjectionInfoA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasGetProjectionInfoEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetProjectionInfoEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasGetProjectionInfoW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetProjectionInfoW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryHandleA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryHandleA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryHandleW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryHandleW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryPropertiesA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryPropertiesA(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryPropertiesW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryPropertiesW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasHangUpA(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasHangUpA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasHangUpW(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasHangUpW(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasInvokeEapUI(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasInvokeEapUI(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasPhonebookDlgA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasPhonebookDlgA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasPhonebookDlgW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasPhonebookDlgW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasRenameEntryA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasRenameEntryA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasRenameEntryW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasRenameEntryW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialAddressA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasSetAutodialAddressA(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialAddressW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasSetAutodialAddressW(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialEnableA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasSetAutodialEnableA(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialEnableW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasSetAutodialEnableW(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialParamA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasSetAutodialParamA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasSetAutodialParamW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasSetAutodialParamW(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasSetCredentialsA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasSetCredentialsA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasSetCredentialsW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasSetCredentialsW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasSetCustomAuthDataA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasSetCustomAuthDataA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasSetCustomAuthDataW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasSetCustomAuthDataW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasSetEapUserDataA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasSetEapUserDataA(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasSetEapUserDataW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasSetEapUserDataW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasSetEntryDialParamsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasSetEntryDialParamsA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasSetEntryDialParamsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasSetEntryDialParamsW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasSetEntryPropertiesA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasSetEntryPropertiesA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasSetEntryPropertiesW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasSetEntryPropertiesW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasSetSubEntryPropertiesA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasSetSubEntryPropertiesA(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasSetSubEntryPropertiesW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasSetSubEntryPropertiesW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasUpdateConnection(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasUpdateConnection(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasValidateEntryNameA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasValidateEntryNameA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRasValidateEntryNameW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRasValidateEntryNameW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmAddNextHop(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmAddNextHop(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmAddRouteToDest(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmAddRouteToDest(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmBlockMethods(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmBlockMethods(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmConvertNetAddressToIpv6AddressAndLength(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmConvertNetAddressToIpv6AddressAndLength(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmCreateDestEnum(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmCreateDestEnum(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmCreateNextHopEnum(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmCreateNextHopEnum(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmCreateRouteEnum(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmCreateRouteEnum(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: Int, p8: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmCreateRouteList(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmCreateRouteList(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmCreateRouteListEnum(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmCreateRouteListEnum(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmDeleteEnumHandle(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmDeleteEnumHandle(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmDeleteNextHop(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmDeleteNextHop(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmDeleteRouteList(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmDeleteRouteList(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmDeleteRouteToDest(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmDeleteRouteToDest(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmDeregisterEntity(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmDeregisterEntity(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmDeregisterFromChangeNotification(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmDeregisterFromChangeNotification(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmFindNextHop(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmFindNextHop(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmGetChangeStatus(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmGetChangeStatus(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmGetChangedDests(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmGetChangedDests(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmGetDestInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmGetDestInfo(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmGetEntityInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmGetEntityInfo(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmGetEntityMethods(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmGetEntityMethods(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmGetEnumDests(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmGetEnumDests(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmGetEnumNextHops(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmGetEnumNextHops(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmGetEnumRoutes(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmGetEnumRoutes(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmGetExactMatchDestination(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmGetExactMatchDestination(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmGetExactMatchRoute(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmGetExactMatchRoute(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmGetLessSpecificDestination(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmGetLessSpecificDestination(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmGetListEnumRoutes(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmGetListEnumRoutes(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmGetMostSpecificDestination(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmGetMostSpecificDestination(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmGetNextHopInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmGetNextHopInfo(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmGetNextHopPointer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmGetNextHopPointer(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmGetOpaqueInformationPointer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmGetOpaqueInformationPointer(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmGetRegisteredEntities(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmGetRegisteredEntities(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmGetRouteInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmGetRouteInfo(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmGetRoutePointer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmGetRoutePointer(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmHoldDestination(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmHoldDestination(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmIgnoreChangedDests(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmIgnoreChangedDests(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmInsertInRouteList(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmInsertInRouteList(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmInvokeMethod(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmInvokeMethod(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmIsBestRoute(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmIsBestRoute(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmIsMarkedForChangeNotification(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmIsMarkedForChangeNotification(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmLockDestination(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmLockDestination(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmLockNextHop(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmLockNextHop(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmLockRoute(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmLockRoute(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmMarkDestForChangeNotification(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmMarkDestForChangeNotification(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmReferenceHandles(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmReferenceHandles(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmRegisterEntity(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmRegisterEntity(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmRegisterForChangeNotification(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmRegisterForChangeNotification(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmReleaseChangedDests(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmReleaseChangedDests(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmReleaseDestInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmReleaseDestInfo(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmReleaseDests(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmReleaseDests(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmReleaseEntities(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmReleaseEntities(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmReleaseEntityInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmReleaseEntityInfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmReleaseNextHopInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmReleaseNextHopInfo(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmReleaseNextHops(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmReleaseNextHops(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmReleaseRouteInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmReleaseRouteInfo(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmReleaseRoutes(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmReleaseRoutes(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementRrasRtmUpdateAndUnlockRoute(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementRrasRtmUpdateAndUnlockRoute(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

public actual fun mgmAddGroupMembershipEntry(hprotocol: Handle, dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, dwifindex: UInt, dwifnexthopipaddr: UInt, dwflags: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMgmAddGroupMembershipEntry(hprotocol.rawAddress.toString(), dwsourceaddr.toInt(), dwsourcemask.toInt(), dwgroupaddr.toInt(), dwgroupmask.toInt(), dwifindex.toInt(), dwifnexthopipaddr.toInt(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmDeRegisterMProtocol(hprotocol: Handle): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMgmDeRegisterMProtocol(hprotocol.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmDeleteGroupMembershipEntry(hprotocol: Handle, dwsourceaddr: UInt, dwsourcemask: UInt, dwgroupaddr: UInt, dwgroupmask: UInt, dwifindex: UInt, dwifnexthopipaddr: UInt, dwflags: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMgmDeleteGroupMembershipEntry(hprotocol.rawAddress.toString(), dwsourceaddr.toInt(), dwsourcemask.toInt(), dwgroupaddr.toInt(), dwgroupmask.toInt(), dwifindex.toInt(), dwifnexthopipaddr.toInt(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmGetFirstMfe(pdwbuffersize: MutPtr, pbbuffer: MutPtr, pdwnumentries: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMgmGetFirstMfe(pdwbuffersize.rawAddress.toString(), pbbuffer.rawAddress.toString(), pdwnumentries.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmGetFirstMfeStats(pdwbuffersize: MutPtr, pbbuffer: MutPtr, pdwnumentries: MutPtr, dwflags: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMgmGetFirstMfeStats(pdwbuffersize.rawAddress.toString(), pbbuffer.rawAddress.toString(), pdwnumentries.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmGetMfe(pimm: MutPtr, pdwbuffersize: MutPtr, pbbuffer: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMgmGetMfe(pimm.rawAddress.toString(), pdwbuffersize.rawAddress.toString(), pbbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmGetMfeStats(pimm: MutPtr, pdwbuffersize: MutPtr, pbbuffer: MutPtr, dwflags: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMgmGetMfeStats(pimm.rawAddress.toString(), pdwbuffersize.rawAddress.toString(), pbbuffer.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmGetNextMfe(pimmstart: MutPtr, pdwbuffersize: MutPtr, pbbuffer: MutPtr, pdwnumentries: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMgmGetNextMfe(pimmstart.rawAddress.toString(), pdwbuffersize.rawAddress.toString(), pbbuffer.rawAddress.toString(), pdwnumentries.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmGetNextMfeStats(pimmstart: MutPtr, pdwbuffersize: MutPtr, pbbuffer: MutPtr, pdwnumentries: MutPtr, dwflags: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMgmGetNextMfeStats(pimmstart.rawAddress.toString(), pdwbuffersize.rawAddress.toString(), pbbuffer.rawAddress.toString(), pdwnumentries.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmGetProtocolOnInterface(dwifindex: UInt, dwifnexthopaddr: UInt, pdwifprotocolid: MutPtr, pdwifcomponentid: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMgmGetProtocolOnInterface(dwifindex.toInt(), dwifnexthopaddr.toInt(), pdwifprotocolid.rawAddress.toString(), pdwifcomponentid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmGroupEnumerationEnd(henum: Handle): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMgmGroupEnumerationEnd(henum.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmGroupEnumerationGetNext(henum: Handle, pdwbuffersize: MutPtr, pbbuffer: MutPtr, pdwnumentries: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMgmGroupEnumerationGetNext(henum.rawAddress.toString(), pdwbuffersize.rawAddress.toString(), pbbuffer.rawAddress.toString(), pdwnumentries.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmGroupEnumerationStart(hprotocol: Handle, metenumtype: MgmEnumTypes, phenumhandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMgmGroupEnumerationStart(hprotocol.rawAddress.toString(), metenumtype, phenumhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmRegisterMProtocol(prpiinfo: MutPtr, dwprotocolid: UInt, dwcomponentid: UInt, phprotocol: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMgmRegisterMProtocol(prpiinfo.rawAddress.toString(), dwprotocolid.toInt(), dwcomponentid.toInt(), phprotocol.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmReleaseInterfaceOwnership(hprotocol: Handle, dwifindex: UInt, dwifnexthopaddr: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMgmReleaseInterfaceOwnership(hprotocol.rawAddress.toString(), dwifindex.toInt(), dwifnexthopaddr.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mgmTakeInterfaceOwnership(hprotocol: Handle, dwifindex: UInt, dwifnexthopaddr: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMgmTakeInterfaceOwnership(hprotocol.rawAddress.toString(), dwifindex.toInt(), dwifnexthopaddr.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminBufferFree(pbuffer: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminBufferFree(pbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminConnectionClearStats(hrasserver: Long, hrasconnection: Handle): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionClearStats(hrasserver.toString(), hrasconnection.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminConnectionEnum(hrasserver: Long, dwlevel: UInt, lplpbbuffer: MutPtr, dwprefmaxlen: UInt, lpdwentriesread: MutPtr, lpdwtotalentries: MutPtr, lpdwresumehandle: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionEnum(hrasserver.toString(), dwlevel.toInt(), lplpbbuffer.rawAddress.toString(), dwprefmaxlen.toInt(), lpdwentriesread.rawAddress.toString(), lpdwtotalentries.rawAddress.toString(), lpdwresumehandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminConnectionEnumEx(hrasserver: Long, pobjectheader: ConstPtr, dwpreferedmaxlen: UInt, lpdwentriesread: MutPtr, lpdwtotalentries: MutPtr, pprasconn: MutPtr, lpdwresumehandle: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionEnumEx(hrasserver.toString(), pobjectheader.rawAddress.toString(), dwpreferedmaxlen.toInt(), lpdwentriesread.rawAddress.toString(), lpdwtotalentries.rawAddress.toString(), pprasconn.rawAddress.toString(), lpdwresumehandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminConnectionGetInfo(hrasserver: Long, dwlevel: UInt, hrasconnection: Handle, lplpbbuffer: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionGetInfo(hrasserver.toString(), dwlevel.toInt(), hrasconnection.rawAddress.toString(), lplpbbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminConnectionGetInfoEx(hrasserver: Long, hrasconnection: Handle, prasconnection: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionGetInfoEx(hrasserver.toString(), hrasconnection.rawAddress.toString(), prasconnection.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminConnectionRemoveQuarantine(hrasserver: Handle, hrasconnection: Handle, fisipaddress: Bool): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminConnectionRemoveQuarantine(hrasserver.rawAddress.toString(), hrasconnection.rawAddress.toString(), fisipaddress).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminDeregisterConnectionNotification(hmprserver: Long, heventnotification: Handle): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminDeregisterConnectionNotification(hmprserver.toString(), heventnotification.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminDeviceEnum(hmprserver: Long, dwlevel: UInt, lplpbbuffer: MutPtr, lpdwtotalentries: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminDeviceEnum(hmprserver.toString(), dwlevel.toInt(), lplpbbuffer.rawAddress.toString(), lpdwtotalentries.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminEstablishDomainRasServer(pszdomain: Pcwstr, pszmachine: Pcwstr, benable: Bool): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminEstablishDomainRasServer(pszdomain.rawAddress.toString(), pszmachine.rawAddress.toString(), benable).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminGetErrorString(dwerror: UInt, lplpwserrorstring: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminGetErrorString(dwerror.toInt(), lplpwserrorstring.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminGetPDCServer(lpszdomain: Pcwstr, lpszserver: Pcwstr, lpszpdcserver: Pwstr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminGetPDCServer(lpszdomain.rawAddress.toString(), lpszserver.rawAddress.toString(), lpszpdcserver.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceConnect(hmprserver: Long, hinterface: Handle, hevent: Handle, fsynchronous: Bool): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceConnect(hmprserver.toString(), hinterface.rawAddress.toString(), hevent.rawAddress.toString(), fsynchronous).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceCreate(hmprserver: Long, dwlevel: UInt, lpbbuffer: ConstPtr, phinterface: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceCreate(hmprserver.toString(), dwlevel.toInt(), lpbbuffer.rawAddress.toString(), phinterface.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceDelete(hmprserver: Long, hinterface: Handle): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDelete(hmprserver.toString(), hinterface.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceDeviceGetInfo(hmprserver: Long, hinterface: Handle, dwindex: UInt, dwlevel: UInt, lplpbuffer: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDeviceGetInfo(hmprserver.toString(), hinterface.rawAddress.toString(), dwindex.toInt(), dwlevel.toInt(), lplpbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceDeviceSetInfo(hmprserver: Long, hinterface: Handle, dwindex: UInt, dwlevel: UInt, lpbbuffer: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDeviceSetInfo(hmprserver.toString(), hinterface.rawAddress.toString(), dwindex.toInt(), dwlevel.toInt(), lpbbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceDisconnect(hmprserver: Long, hinterface: Handle): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceDisconnect(hmprserver.toString(), hinterface.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceEnum(hmprserver: Long, dwlevel: UInt, lplpbbuffer: MutPtr, dwprefmaxlen: UInt, lpdwentriesread: MutPtr, lpdwtotalentries: MutPtr, lpdwresumehandle: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceEnum(hmprserver.toString(), dwlevel.toInt(), lplpbbuffer.rawAddress.toString(), dwprefmaxlen.toInt(), lpdwentriesread.rawAddress.toString(), lpdwtotalentries.rawAddress.toString(), lpdwresumehandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceGetCredentials(lpwsserver: Pcwstr, lpwsinterfacename: Pcwstr, lpwsusername: Pwstr, lpwspassword: Pwstr, lpwsdomainname: Pwstr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetCredentials(lpwsserver.rawAddress.toString(), lpwsinterfacename.rawAddress.toString(), lpwsusername.rawAddress.toString(), lpwspassword.rawAddress.toString(), lpwsdomainname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceGetCredentialsEx(hmprserver: Long, hinterface: Handle, dwlevel: UInt, lplpbbuffer: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetCredentialsEx(hmprserver.toString(), hinterface.rawAddress.toString(), dwlevel.toInt(), lplpbbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceGetCustomInfoEx(hmprserver: Long, hinterface: Handle, pcustominfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetCustomInfoEx(hmprserver.toString(), hinterface.rawAddress.toString(), pcustominfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceGetHandle(hmprserver: Long, lpwsinterfacename: Pcwstr, phinterface: MutPtr, fincludeclientinterfaces: Bool): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetHandle(hmprserver.toString(), lpwsinterfacename.rawAddress.toString(), phinterface.rawAddress.toString(), fincludeclientinterfaces).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceGetInfo(hmprserver: Long, hinterface: Handle, dwlevel: UInt, lplpbbuffer: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceGetInfo(hmprserver.toString(), hinterface.rawAddress.toString(), dwlevel.toInt(), lplpbbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceQueryUpdateResult(hmprserver: Long, hinterface: Handle, dwprotocolid: UInt, lpdwupdateresult: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceQueryUpdateResult(hmprserver.toString(), hinterface.rawAddress.toString(), dwprotocolid.toInt(), lpdwupdateresult.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceSetCredentials(lpwsserver: Pcwstr, lpwsinterfacename: Pcwstr, lpwsusername: Pcwstr, lpwsdomainname: Pcwstr, lpwspassword: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetCredentials(lpwsserver.rawAddress.toString(), lpwsinterfacename.rawAddress.toString(), lpwsusername.rawAddress.toString(), lpwsdomainname.rawAddress.toString(), lpwspassword.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceSetCredentialsEx(hmprserver: Long, hinterface: Handle, dwlevel: UInt, lpbbuffer: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetCredentialsEx(hmprserver.toString(), hinterface.rawAddress.toString(), dwlevel.toInt(), lpbbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceSetCustomInfoEx(hmprserver: Long, hinterface: Handle, pcustominfo: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetCustomInfoEx(hmprserver.toString(), hinterface.rawAddress.toString(), pcustominfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceSetInfo(hmprserver: Long, hinterface: Handle, dwlevel: UInt, lpbbuffer: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceSetInfo(hmprserver.toString(), hinterface.rawAddress.toString(), dwlevel.toInt(), lpbbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceTransportAdd(hmprserver: Long, hinterface: Handle, dwtransportid: UInt, pinterfaceinfo: ConstPtr, dwinterfaceinfosize: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportAdd(hmprserver.toString(), hinterface.rawAddress.toString(), dwtransportid.toInt(), pinterfaceinfo.rawAddress.toString(), dwinterfaceinfosize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceTransportGetInfo(hmprserver: Long, hinterface: Handle, dwtransportid: UInt, ppinterfaceinfo: MutPtr, lpdwinterfaceinfosize: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportGetInfo(hmprserver.toString(), hinterface.rawAddress.toString(), dwtransportid.toInt(), ppinterfaceinfo.rawAddress.toString(), lpdwinterfaceinfosize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceTransportRemove(hmprserver: Long, hinterface: Handle, dwtransportid: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportRemove(hmprserver.toString(), hinterface.rawAddress.toString(), dwtransportid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceTransportSetInfo(hmprserver: Long, hinterface: Handle, dwtransportid: UInt, pinterfaceinfo: ConstPtr, dwinterfaceinfosize: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceTransportSetInfo(hmprserver.toString(), hinterface.rawAddress.toString(), dwtransportid.toInt(), pinterfaceinfo.rawAddress.toString(), dwinterfaceinfosize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceUpdatePhonebookInfo(hmprserver: Long, hinterface: Handle): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceUpdatePhonebookInfo(hmprserver.toString(), hinterface.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminInterfaceUpdateRoutes(hmprserver: Long, hinterface: Handle, dwprotocolid: UInt, hevent: Handle): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminInterfaceUpdateRoutes(hmprserver.toString(), hinterface.rawAddress.toString(), dwprotocolid.toInt(), hevent.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminIsDomainRasServer(pszdomain: Pcwstr, pszmachine: Pcwstr, pbisrasserver: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminIsDomainRasServer(pszdomain.rawAddress.toString(), pszmachine.rawAddress.toString(), pbisrasserver.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminIsServiceInitialized(lpwsservername: Pcwstr, fisserviceinitialized: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminIsServiceInitialized(lpwsservername.rawAddress.toString(), fisserviceinitialized.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminIsServiceRunning(lpwsservername: Pcwstr): Bool =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminIsServiceRunning(lpwsservername.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminMIBBufferFree(pbuffer: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminMIBBufferFree(pbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminMIBEntryCreate(hmibserver: Long, dwpid: UInt, dwroutingpid: UInt, lpentry: ConstPtr, dwentrysize: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryCreate(hmibserver.toString(), dwpid.toInt(), dwroutingpid.toInt(), lpentry.rawAddress.toString(), dwentrysize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminMIBEntryDelete(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpentry: ConstPtr, dwentrysize: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryDelete(hmibserver.toString(), dwprotocolid.toInt(), dwroutingpid.toInt(), lpentry.rawAddress.toString(), dwentrysize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminMIBEntryGet(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: ConstPtr, dwinentrysize: UInt, lplpoutentry: MutPtr, lpoutentrysize: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryGet(hmibserver.toString(), dwprotocolid.toInt(), dwroutingpid.toInt(), lpinentry.rawAddress.toString(), dwinentrysize.toInt(), lplpoutentry.rawAddress.toString(), lpoutentrysize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminMIBEntryGetFirst(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: ConstPtr, dwinentrysize: UInt, lplpoutentry: MutPtr, lpoutentrysize: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryGetFirst(hmibserver.toString(), dwprotocolid.toInt(), dwroutingpid.toInt(), lpinentry.rawAddress.toString(), dwinentrysize.toInt(), lplpoutentry.rawAddress.toString(), lpoutentrysize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminMIBEntryGetNext(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpinentry: ConstPtr, dwinentrysize: UInt, lplpoutentry: MutPtr, lpoutentrysize: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntryGetNext(hmibserver.toString(), dwprotocolid.toInt(), dwroutingpid.toInt(), lpinentry.rawAddress.toString(), dwinentrysize.toInt(), lplpoutentry.rawAddress.toString(), lpoutentrysize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminMIBEntrySet(hmibserver: Long, dwprotocolid: UInt, dwroutingpid: UInt, lpentry: ConstPtr, dwentrysize: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminMIBEntrySet(hmibserver.toString(), dwprotocolid.toInt(), dwroutingpid.toInt(), lpentry.rawAddress.toString(), dwentrysize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminMIBServerConnect(lpwsservername: Pcwstr, phmibserver: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminMIBServerConnect(lpwsservername.rawAddress.toString(), phmibserver.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminMIBServerDisconnect(hmibserver: Long) {
    if (windowsWin32NetworkmanagementRrasNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminMIBServerDisconnect(hmibserver.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mprAdminPortClearStats(hrasserver: Long, hport: Handle): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminPortClearStats(hrasserver.toString(), hport.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminPortDisconnect(hrasserver: Long, hport: Handle): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminPortDisconnect(hrasserver.toString(), hport.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminPortEnum(hrasserver: Long, dwlevel: UInt, hrasconnection: Handle, lplpbbuffer: MutPtr, dwprefmaxlen: UInt, lpdwentriesread: MutPtr, lpdwtotalentries: MutPtr, lpdwresumehandle: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminPortEnum(hrasserver.toString(), dwlevel.toInt(), hrasconnection.rawAddress.toString(), lplpbbuffer.rawAddress.toString(), dwprefmaxlen.toInt(), lpdwentriesread.rawAddress.toString(), lpdwtotalentries.rawAddress.toString(), lpdwresumehandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminPortGetInfo(hrasserver: Long, dwlevel: UInt, hport: Handle, lplpbbuffer: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminPortGetInfo(hrasserver.toString(), dwlevel.toInt(), hport.rawAddress.toString(), lplpbbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminPortReset(hrasserver: Long, hport: Handle): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminPortReset(hrasserver.toString(), hport.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminRegisterConnectionNotification(hmprserver: Long, heventnotification: Handle): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminRegisterConnectionNotification(hmprserver.toString(), heventnotification.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminSendUserMessage(hmprserver: Long, hconnection: Handle, lpwszmessage: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminSendUserMessage(hmprserver.toString(), hconnection.rawAddress.toString(), lpwszmessage.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminServerConnect(lpwsservername: Pcwstr, phmprserver: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminServerConnect(lpwsservername.rawAddress.toString(), phmprserver.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminServerDisconnect(hmprserver: Long) {
    if (windowsWin32NetworkmanagementRrasNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminServerDisconnect(hmprserver.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mprAdminServerGetCredentials(hmprserver: Long, dwlevel: UInt, lplpbbuffer: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminServerGetCredentials(hmprserver.toString(), dwlevel.toInt(), lplpbbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminServerGetInfo(hmprserver: Long, dwlevel: UInt, lplpbbuffer: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminServerGetInfo(hmprserver.toString(), dwlevel.toInt(), lplpbbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminServerGetInfoEx(hmprserver: Long, pserverinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminServerGetInfoEx(hmprserver.toString(), pserverinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminServerSetCredentials(hmprserver: Long, dwlevel: UInt, lpbbuffer: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminServerSetCredentials(hmprserver.toString(), dwlevel.toInt(), lpbbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminServerSetInfo(hmprserver: Long, dwlevel: UInt, lpbbuffer: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminServerSetInfo(hmprserver.toString(), dwlevel.toInt(), lpbbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminServerSetInfoEx(hmprserver: Long, pserverinfo: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminServerSetInfoEx(hmprserver.toString(), pserverinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminTransportCreate(hmprserver: Long, dwtransportid: UInt, lpwstransportname: Pcwstr, pglobalinfo: ConstPtr, dwglobalinfosize: UInt, pclientinterfaceinfo: ConstPtr, dwclientinterfaceinfosize: UInt, lpwsdllpath: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminTransportCreate(hmprserver.toString(), dwtransportid.toInt(), lpwstransportname.rawAddress.toString(), pglobalinfo.rawAddress.toString(), dwglobalinfosize.toInt(), pclientinterfaceinfo.rawAddress.toString(), dwclientinterfaceinfosize.toInt(), lpwsdllpath.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminTransportGetInfo(hmprserver: Long, dwtransportid: UInt, ppglobalinfo: MutPtr, lpdwglobalinfosize: MutPtr, ppclientinterfaceinfo: MutPtr, lpdwclientinterfaceinfosize: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminTransportGetInfo(hmprserver.toString(), dwtransportid.toInt(), ppglobalinfo.rawAddress.toString(), lpdwglobalinfosize.rawAddress.toString(), ppclientinterfaceinfo.rawAddress.toString(), lpdwclientinterfaceinfosize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminTransportSetInfo(hmprserver: Long, dwtransportid: UInt, pglobalinfo: ConstPtr, dwglobalinfosize: UInt, pclientinterfaceinfo: ConstPtr, dwclientinterfaceinfosize: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminTransportSetInfo(hmprserver.toString(), dwtransportid.toInt(), pglobalinfo.rawAddress.toString(), dwglobalinfosize.toInt(), pclientinterfaceinfo.rawAddress.toString(), dwclientinterfaceinfosize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminUpdateConnection(hrasserver: Long, hrasconnection: Handle, prasupdateconnection: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminUpdateConnection(hrasserver.toString(), hrasconnection.rawAddress.toString(), prasupdateconnection.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminUserGetInfo(lpszserver: Pcwstr, lpszuser: Pcwstr, dwlevel: UInt, lpbbuffer: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminUserGetInfo(lpszserver.rawAddress.toString(), lpszuser.rawAddress.toString(), dwlevel.toInt(), lpbbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprAdminUserSetInfo(lpszserver: Pcwstr, lpszuser: Pcwstr, dwlevel: UInt, lpbbuffer: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprAdminUserSetInfo(lpszserver.rawAddress.toString(), lpszuser.rawAddress.toString(), dwlevel.toInt(), lpbbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigBufferFree(pbuffer: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigBufferFree(pbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigFilterGetInfo(hmprconfig: Handle, dwlevel: UInt, dwtransportid: UInt, lpbuffer: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigFilterGetInfo(hmprconfig.rawAddress.toString(), dwlevel.toInt(), dwtransportid.toInt(), lpbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigFilterSetInfo(hmprconfig: Handle, dwlevel: UInt, dwtransportid: UInt, lpbuffer: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigFilterSetInfo(hmprconfig.rawAddress.toString(), dwlevel.toInt(), dwtransportid.toInt(), lpbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigGetFriendlyName(hmprconfig: Handle, pszguidname: Pcwstr, pszbuffer: Pwstr, dwbuffersize: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigGetFriendlyName(hmprconfig.rawAddress.toString(), pszguidname.rawAddress.toString(), pszbuffer.rawAddress.toString(), dwbuffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigGetGuidName(hmprconfig: Handle, pszfriendlyname: Pcwstr, pszbuffer: Pwstr, dwbuffersize: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigGetGuidName(hmprconfig.rawAddress.toString(), pszfriendlyname.rawAddress.toString(), pszbuffer.rawAddress.toString(), dwbuffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceCreate(hmprconfig: Handle, dwlevel: UInt, lpbbuffer: ConstPtr, phrouterinterface: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceCreate(hmprconfig.rawAddress.toString(), dwlevel.toInt(), lpbbuffer.rawAddress.toString(), phrouterinterface.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceDelete(hmprconfig: Handle, hrouterinterface: Handle): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceDelete(hmprconfig.rawAddress.toString(), hrouterinterface.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceEnum(hmprconfig: Handle, dwlevel: UInt, lplpbuffer: MutPtr, dwprefmaxlen: UInt, lpdwentriesread: MutPtr, lpdwtotalentries: MutPtr, lpdwresumehandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceEnum(hmprconfig.rawAddress.toString(), dwlevel.toInt(), lplpbuffer.rawAddress.toString(), dwprefmaxlen.toInt(), lpdwentriesread.rawAddress.toString(), lpdwtotalentries.rawAddress.toString(), lpdwresumehandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceGetCustomInfoEx(hmprconfig: Handle, hrouterinterface: Handle, pcustominfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceGetCustomInfoEx(hmprconfig.rawAddress.toString(), hrouterinterface.rawAddress.toString(), pcustominfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceGetHandle(hmprconfig: Handle, lpwsinterfacename: Pcwstr, phrouterinterface: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceGetHandle(hmprconfig.rawAddress.toString(), lpwsinterfacename.rawAddress.toString(), phrouterinterface.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceGetInfo(hmprconfig: Handle, hrouterinterface: Handle, dwlevel: UInt, lplpbuffer: MutPtr, lpdwbuffersize: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceGetInfo(hmprconfig.rawAddress.toString(), hrouterinterface.rawAddress.toString(), dwlevel.toInt(), lplpbuffer.rawAddress.toString(), lpdwbuffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceSetCustomInfoEx(hmprconfig: Handle, hrouterinterface: Handle, pcustominfo: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceSetCustomInfoEx(hmprconfig.rawAddress.toString(), hrouterinterface.rawAddress.toString(), pcustominfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceSetInfo(hmprconfig: Handle, hrouterinterface: Handle, dwlevel: UInt, lpbbuffer: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceSetInfo(hmprconfig.rawAddress.toString(), hrouterinterface.rawAddress.toString(), dwlevel.toInt(), lpbbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceTransportAdd(hmprconfig: Handle, hrouterinterface: Handle, dwtransportid: UInt, lpwstransportname: Pcwstr, pinterfaceinfo: ConstPtr, dwinterfaceinfosize: UInt, phrouteriftransport: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportAdd(hmprconfig.rawAddress.toString(), hrouterinterface.rawAddress.toString(), dwtransportid.toInt(), lpwstransportname.rawAddress.toString(), pinterfaceinfo.rawAddress.toString(), dwinterfaceinfosize.toInt(), phrouteriftransport.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceTransportEnum(hmprconfig: Handle, hrouterinterface: Handle, dwlevel: UInt, lplpbuffer: MutPtr, dwprefmaxlen: UInt, lpdwentriesread: MutPtr, lpdwtotalentries: MutPtr, lpdwresumehandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportEnum(hmprconfig.rawAddress.toString(), hrouterinterface.rawAddress.toString(), dwlevel.toInt(), lplpbuffer.rawAddress.toString(), dwprefmaxlen.toInt(), lpdwentriesread.rawAddress.toString(), lpdwtotalentries.rawAddress.toString(), lpdwresumehandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceTransportGetHandle(hmprconfig: Handle, hrouterinterface: Handle, dwtransportid: UInt, phrouteriftransport: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportGetHandle(hmprconfig.rawAddress.toString(), hrouterinterface.rawAddress.toString(), dwtransportid.toInt(), phrouteriftransport.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceTransportGetInfo(hmprconfig: Handle, hrouterinterface: Handle, hrouteriftransport: Handle, ppinterfaceinfo: MutPtr, lpdwinterfaceinfosize: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportGetInfo(hmprconfig.rawAddress.toString(), hrouterinterface.rawAddress.toString(), hrouteriftransport.rawAddress.toString(), ppinterfaceinfo.rawAddress.toString(), lpdwinterfaceinfosize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceTransportRemove(hmprconfig: Handle, hrouterinterface: Handle, hrouteriftransport: Handle): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportRemove(hmprconfig.rawAddress.toString(), hrouterinterface.rawAddress.toString(), hrouteriftransport.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigInterfaceTransportSetInfo(hmprconfig: Handle, hrouterinterface: Handle, hrouteriftransport: Handle, pinterfaceinfo: ConstPtr, dwinterfaceinfosize: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigInterfaceTransportSetInfo(hmprconfig.rawAddress.toString(), hrouterinterface.rawAddress.toString(), hrouteriftransport.rawAddress.toString(), pinterfaceinfo.rawAddress.toString(), dwinterfaceinfosize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigServerBackup(hmprconfig: Handle, lpwspath: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigServerBackup(hmprconfig.rawAddress.toString(), lpwspath.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigServerConnect(lpwsservername: Pcwstr, phmprconfig: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigServerConnect(lpwsservername.rawAddress.toString(), phmprconfig.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigServerDisconnect(hmprconfig: Handle) {
    if (windowsWin32NetworkmanagementRrasNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigServerDisconnect(hmprconfig.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mprConfigServerGetInfo(hmprconfig: Handle, dwlevel: UInt, lplpbbuffer: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigServerGetInfo(hmprconfig.rawAddress.toString(), dwlevel.toInt(), lplpbbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigServerGetInfoEx(hmprconfig: Handle, pserverinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigServerGetInfoEx(hmprconfig.rawAddress.toString(), pserverinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigServerInstall(dwlevel: UInt, pbuffer: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigServerInstall(dwlevel.toInt(), pbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigServerRefresh(hmprconfig: Handle): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigServerRefresh(hmprconfig.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigServerRestore(hmprconfig: Handle, lpwspath: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigServerRestore(hmprconfig.rawAddress.toString(), lpwspath.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigServerSetInfo(hmprserver: Long, dwlevel: UInt, lpbbuffer: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigServerSetInfo(hmprserver.toString(), dwlevel.toInt(), lpbbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigServerSetInfoEx(hmprconfig: Handle, psetserverconfig: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigServerSetInfoEx(hmprconfig.rawAddress.toString(), psetserverconfig.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigTransportCreate(hmprconfig: Handle, dwtransportid: UInt, lpwstransportname: Pcwstr, pglobalinfo: ConstPtr, dwglobalinfosize: UInt, pclientinterfaceinfo: ConstPtr, dwclientinterfaceinfosize: UInt, lpwsdllpath: Pcwstr, phroutertransport: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigTransportCreate(hmprconfig.rawAddress.toString(), dwtransportid.toInt(), lpwstransportname.rawAddress.toString(), pglobalinfo.rawAddress.toString(), dwglobalinfosize.toInt(), pclientinterfaceinfo.rawAddress.toString(), dwclientinterfaceinfosize.toInt(), lpwsdllpath.rawAddress.toString(), phroutertransport.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigTransportDelete(hmprconfig: Handle, hroutertransport: Handle): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigTransportDelete(hmprconfig.rawAddress.toString(), hroutertransport.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigTransportEnum(hmprconfig: Handle, dwlevel: UInt, lplpbuffer: MutPtr, dwprefmaxlen: UInt, lpdwentriesread: MutPtr, lpdwtotalentries: MutPtr, lpdwresumehandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigTransportEnum(hmprconfig.rawAddress.toString(), dwlevel.toInt(), lplpbuffer.rawAddress.toString(), dwprefmaxlen.toInt(), lpdwentriesread.rawAddress.toString(), lpdwtotalentries.rawAddress.toString(), lpdwresumehandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigTransportGetHandle(hmprconfig: Handle, dwtransportid: UInt, phroutertransport: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigTransportGetHandle(hmprconfig.rawAddress.toString(), dwtransportid.toInt(), phroutertransport.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigTransportGetInfo(hmprconfig: Handle, hroutertransport: Handle, ppglobalinfo: MutPtr, lpdwglobalinfosize: MutPtr, ppclientinterfaceinfo: MutPtr, lpdwclientinterfaceinfosize: MutPtr, lplpwsdllpath: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigTransportGetInfo(hmprconfig.rawAddress.toString(), hroutertransport.rawAddress.toString(), ppglobalinfo.rawAddress.toString(), lpdwglobalinfosize.rawAddress.toString(), ppclientinterfaceinfo.rawAddress.toString(), lpdwclientinterfaceinfosize.rawAddress.toString(), lplpwsdllpath.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprConfigTransportSetInfo(hmprconfig: Handle, hroutertransport: Handle, pglobalinfo: ConstPtr, dwglobalinfosize: UInt, pclientinterfaceinfo: ConstPtr, dwclientinterfaceinfosize: UInt, lpwsdllpath: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprConfigTransportSetInfo(hmprconfig.rawAddress.toString(), hroutertransport.rawAddress.toString(), pglobalinfo.rawAddress.toString(), dwglobalinfosize.toInt(), pclientinterfaceinfo.rawAddress.toString(), dwclientinterfaceinfosize.toInt(), lpwsdllpath.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprInfoBlockAdd(lpheader: ConstPtr, dwinfotype: UInt, dwitemsize: UInt, dwitemcount: UInt, lpitemdata: ConstPtr, lplpnewheader: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprInfoBlockAdd(lpheader.rawAddress.toString(), dwinfotype.toInt(), dwitemsize.toInt(), dwitemcount.toInt(), lpitemdata.rawAddress.toString(), lplpnewheader.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprInfoBlockFind(lpheader: ConstPtr, dwinfotype: UInt, lpdwitemsize: MutPtr, lpdwitemcount: MutPtr, lplpitemdata: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprInfoBlockFind(lpheader.rawAddress.toString(), dwinfotype.toInt(), lpdwitemsize.rawAddress.toString(), lpdwitemcount.rawAddress.toString(), lplpitemdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprInfoBlockQuerySize(lpheader: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprInfoBlockQuerySize(lpheader.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprInfoBlockRemove(lpheader: ConstPtr, dwinfotype: UInt, lplpnewheader: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprInfoBlockRemove(lpheader.rawAddress.toString(), dwinfotype.toInt(), lplpnewheader.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprInfoBlockSet(lpheader: ConstPtr, dwinfotype: UInt, dwitemsize: UInt, dwitemcount: UInt, lpitemdata: ConstPtr, lplpnewheader: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprInfoBlockSet(lpheader.rawAddress.toString(), dwinfotype.toInt(), dwitemsize.toInt(), dwitemcount.toInt(), lpitemdata.rawAddress.toString(), lplpnewheader.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprInfoCreate(dwversion: UInt, lplpnewheader: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprInfoCreate(dwversion.toInt(), lplpnewheader.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprInfoDelete(lpheader: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprInfoDelete(lpheader.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprInfoDuplicate(lpheader: ConstPtr, lplpnewheader: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprInfoDuplicate(lpheader.rawAddress.toString(), lplpnewheader.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprInfoRemoveAll(lpheader: ConstPtr, lplpnewheader: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasMprInfoRemoveAll(lpheader.rawAddress.toString(), lplpnewheader.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasClearConnectionStatistics(hrasconn: Hrasconn): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasClearConnectionStatistics(hrasconn.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasClearLinkStatistics(hrasconn: Hrasconn, dwsubentry: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasClearLinkStatistics(hrasconn.rawAddress.toString(), dwsubentry.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasConnectionNotificationA(param0: Hrasconn, param1: Handle, param2: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasConnectionNotificationA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasConnectionNotificationW(param0: Hrasconn, param1: Handle, param2: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasConnectionNotificationW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasCreatePhonebookEntryA(param0: Hwnd, param1: Pcstr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasCreatePhonebookEntryA(param0.rawAddress.toString(), param1.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasCreatePhonebookEntryW(param0: Hwnd, param1: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasCreatePhonebookEntryW(param0.rawAddress.toString(), param1.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasDeleteEntryA(param0: Pcstr, param1: Pcstr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasDeleteEntryA(param0.rawAddress.toString(), param1.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasDeleteEntryW(param0: Pcwstr, param1: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasDeleteEntryW(param0.rawAddress.toString(), param1.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasDeleteSubEntryA(pszphonebook: Pcstr, pszentry: Pcstr, dwsubentryid: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasDeleteSubEntryA(pszphonebook.rawAddress.toString(), pszentry.rawAddress.toString(), dwsubentryid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasDeleteSubEntryW(pszphonebook: Pcwstr, pszentry: Pcwstr, dwsubentryid: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasDeleteSubEntryW(pszphonebook.rawAddress.toString(), pszentry.rawAddress.toString(), dwsubentryid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasDialA(param0: ConstPtr, param1: Pcstr, param2: ConstPtr, param3: UInt, param4: ConstPtr, param5: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasDialA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), param3.toInt(), param4.rawAddress.toString(), param5.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasDialDlgA(lpszphonebook: Pcstr, lpszentry: Pcstr, lpszphonenumber: Pcstr, lpinfo: MutPtr): Bool =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasDialDlgA(lpszphonebook.rawAddress.toString(), lpszentry.rawAddress.toString(), lpszphonenumber.rawAddress.toString(), lpinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasDialDlgW(lpszphonebook: Pcwstr, lpszentry: Pcwstr, lpszphonenumber: Pcwstr, lpinfo: MutPtr): Bool =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasDialDlgW(lpszphonebook.rawAddress.toString(), lpszentry.rawAddress.toString(), lpszphonenumber.rawAddress.toString(), lpinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasDialW(param0: ConstPtr, param1: Pcwstr, param2: ConstPtr, param3: UInt, param4: ConstPtr, param5: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasDialW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), param3.toInt(), param4.rawAddress.toString(), param5.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasEditPhonebookEntryA(param0: Hwnd, param1: Pcstr, param2: Pcstr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasEditPhonebookEntryA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasEditPhonebookEntryW(param0: Hwnd, param1: Pcwstr, param2: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasEditPhonebookEntryW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasEntryDlgA(lpszphonebook: Pcstr, lpszentry: Pcstr, lpinfo: MutPtr): Bool =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasEntryDlgA(lpszphonebook.rawAddress.toString(), lpszentry.rawAddress.toString(), lpinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasEntryDlgW(lpszphonebook: Pcwstr, lpszentry: Pcwstr, lpinfo: MutPtr): Bool =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasEntryDlgW(lpszphonebook.rawAddress.toString(), lpszentry.rawAddress.toString(), lpinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasEnumAutodialAddressesA(lpprasautodialaddresses: MutPtr, lpdwcbrasautodialaddresses: MutPtr, lpdwcrasautodialaddresses: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasEnumAutodialAddressesA(lpprasautodialaddresses.rawAddress.toString(), lpdwcbrasautodialaddresses.rawAddress.toString(), lpdwcrasautodialaddresses.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasEnumAutodialAddressesW(lpprasautodialaddresses: MutPtr, lpdwcbrasautodialaddresses: MutPtr, lpdwcrasautodialaddresses: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasEnumAutodialAddressesW(lpprasautodialaddresses.rawAddress.toString(), lpdwcbrasautodialaddresses.rawAddress.toString(), lpdwcrasautodialaddresses.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasEnumConnectionsA(param0: MutPtr, param1: MutPtr, param2: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasEnumConnectionsA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasEnumConnectionsW(param0: MutPtr, param1: MutPtr, param2: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasEnumConnectionsW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasEnumDevicesA(param0: MutPtr, param1: MutPtr, param2: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasEnumDevicesA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasEnumDevicesW(param0: MutPtr, param1: MutPtr, param2: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasEnumDevicesW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasEnumEntriesA(param0: Pcstr, param1: Pcstr, param2: MutPtr, param3: MutPtr, param4: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasEnumEntriesA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), param3.rawAddress.toString(), param4.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasEnumEntriesW(param0: Pcwstr, param1: Pcwstr, param2: MutPtr, param3: MutPtr, param4: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasEnumEntriesW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), param3.rawAddress.toString(), param4.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasFreeEapUserIdentityA(praseapuseridentity: ConstPtr) {
    if (windowsWin32NetworkmanagementRrasNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementRrasRasFreeEapUserIdentityA(praseapuseridentity.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rasFreeEapUserIdentityW(praseapuseridentity: ConstPtr) {
    if (windowsWin32NetworkmanagementRrasNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementRrasRasFreeEapUserIdentityW(praseapuseridentity.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rasGetAutodialAddressA(param0: Pcstr, param1: ConstPtr, param2: MutPtr, param3: MutPtr, param4: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetAutodialAddressA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), param3.rawAddress.toString(), param4.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetAutodialAddressW(param0: Pcwstr, param1: ConstPtr, param2: MutPtr, param3: MutPtr, param4: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetAutodialAddressW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), param3.rawAddress.toString(), param4.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetAutodialEnableA(param0: UInt, param1: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetAutodialEnableA(param0.toInt(), param1.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetAutodialEnableW(param0: UInt, param1: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetAutodialEnableW(param0.toInt(), param1.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetAutodialParamA(param0: UInt, param1: MutPtr, param2: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetAutodialParamA(param0.toInt(), param1.rawAddress.toString(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetAutodialParamW(param0: UInt, param1: MutPtr, param2: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetAutodialParamW(param0.toInt(), param1.rawAddress.toString(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetConnectStatusA(param0: Hrasconn, param1: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetConnectStatusA(param0.rawAddress.toString(), param1.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetConnectStatusW(param0: Hrasconn, param1: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetConnectStatusW(param0.rawAddress.toString(), param1.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetConnectionStatistics(hrasconn: Hrasconn, lpstatistics: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetConnectionStatistics(hrasconn.rawAddress.toString(), lpstatistics.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetCountryInfoA(param0: MutPtr, param1: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetCountryInfoA(param0.rawAddress.toString(), param1.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetCountryInfoW(param0: MutPtr, param1: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetCountryInfoW(param0.rawAddress.toString(), param1.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetCredentialsA(param0: Pcstr, param1: Pcstr, param2: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetCredentialsA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetCredentialsW(param0: Pcwstr, param1: Pcwstr, param2: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetCredentialsW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetCustomAuthDataA(pszphonebook: Pcstr, pszentry: Pcstr, pbcustomauthdata: MutPtr, pdwsizeofcustomauthdata: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetCustomAuthDataA(pszphonebook.rawAddress.toString(), pszentry.rawAddress.toString(), pbcustomauthdata.rawAddress.toString(), pdwsizeofcustomauthdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetCustomAuthDataW(pszphonebook: Pcwstr, pszentry: Pcwstr, pbcustomauthdata: MutPtr, pdwsizeofcustomauthdata: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetCustomAuthDataW(pszphonebook.rawAddress.toString(), pszentry.rawAddress.toString(), pbcustomauthdata.rawAddress.toString(), pdwsizeofcustomauthdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetEapUserDataA(htoken: Handle, pszphonebook: Pcstr, pszentry: Pcstr, pbeapdata: MutPtr, pdwsizeofeapdata: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetEapUserDataA(htoken.rawAddress.toString(), pszphonebook.rawAddress.toString(), pszentry.rawAddress.toString(), pbeapdata.rawAddress.toString(), pdwsizeofeapdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetEapUserDataW(htoken: Handle, pszphonebook: Pcwstr, pszentry: Pcwstr, pbeapdata: MutPtr, pdwsizeofeapdata: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetEapUserDataW(htoken.rawAddress.toString(), pszphonebook.rawAddress.toString(), pszentry.rawAddress.toString(), pbeapdata.rawAddress.toString(), pdwsizeofeapdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetEapUserIdentityA(pszphonebook: Pcstr, pszentry: Pcstr, dwflags: UInt, hwnd: Hwnd, ppraseapuseridentity: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetEapUserIdentityA(pszphonebook.rawAddress.toString(), pszentry.rawAddress.toString(), dwflags.toInt(), hwnd.rawAddress.toString(), ppraseapuseridentity.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetEapUserIdentityW(pszphonebook: Pcwstr, pszentry: Pcwstr, dwflags: UInt, hwnd: Hwnd, ppraseapuseridentity: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetEapUserIdentityW(pszphonebook.rawAddress.toString(), pszentry.rawAddress.toString(), dwflags.toInt(), hwnd.rawAddress.toString(), ppraseapuseridentity.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetEntryDialParamsA(param0: Pcstr, param1: MutPtr, param2: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetEntryDialParamsA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetEntryDialParamsW(param0: Pcwstr, param1: MutPtr, param2: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetEntryDialParamsW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetEntryPropertiesA(param0: Pcstr, param1: Pcstr, param2: MutPtr, param3: MutPtr, param4: MutPtr, param5: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetEntryPropertiesA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), param3.rawAddress.toString(), param4.rawAddress.toString(), param5.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetEntryPropertiesW(param0: Pcwstr, param1: Pcwstr, param2: MutPtr, param3: MutPtr, param4: MutPtr, param5: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetEntryPropertiesW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), param3.rawAddress.toString(), param4.rawAddress.toString(), param5.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetErrorStringA(resourceid: UInt, lpszstring: Pstr, inbufsize: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetErrorStringA(resourceid.toInt(), lpszstring.rawAddress.toString(), inbufsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetErrorStringW(resourceid: UInt, lpszstring: Pwstr, inbufsize: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetErrorStringW(resourceid.toInt(), lpszstring.rawAddress.toString(), inbufsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetLinkStatistics(hrasconn: Hrasconn, dwsubentry: UInt, lpstatistics: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetLinkStatistics(hrasconn.rawAddress.toString(), dwsubentry.toInt(), lpstatistics.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetPCscf(lpszpcscf: Pwstr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetPCscf(lpszpcscf.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetProjectionInfoA(param0: Hrasconn, param1: Rasprojection, param2: MutPtr, param3: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetProjectionInfoA(param0.rawAddress.toString(), param1, param2.rawAddress.toString(), param3.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetProjectionInfoEx(hrasconn: Hrasconn, prasprojection: MutPtr, lpdwsize: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetProjectionInfoEx(hrasconn.rawAddress.toString(), prasprojection.rawAddress.toString(), lpdwsize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetProjectionInfoW(param0: Hrasconn, param1: Rasprojection, param2: MutPtr, param3: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetProjectionInfoW(param0.rawAddress.toString(), param1, param2.rawAddress.toString(), param3.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetSubEntryHandleA(param0: Hrasconn, param1: UInt, param2: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryHandleA(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetSubEntryHandleW(param0: Hrasconn, param1: UInt, param2: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryHandleW(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetSubEntryPropertiesA(param0: Pcstr, param1: Pcstr, param2: UInt, param3: MutPtr, param4: MutPtr, param5: MutPtr, param6: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryPropertiesA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.toInt(), param3.rawAddress.toString(), param4.rawAddress.toString(), param5.rawAddress.toString(), param6.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasGetSubEntryPropertiesW(param0: Pcwstr, param1: Pcwstr, param2: UInt, param3: MutPtr, param4: MutPtr, param5: MutPtr, param6: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasGetSubEntryPropertiesW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.toInt(), param3.rawAddress.toString(), param4.rawAddress.toString(), param5.rawAddress.toString(), param6.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasHangUpA(param0: Hrasconn): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasHangUpA(param0.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasHangUpW(param0: Hrasconn): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasHangUpW(param0.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasInvokeEapUI(param0: Hrasconn, param1: UInt, param2: ConstPtr, param3: Hwnd): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasInvokeEapUI(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString(), param3.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasPhonebookDlgA(lpszphonebook: Pcstr, lpszentry: Pcstr, lpinfo: MutPtr): Bool =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasPhonebookDlgA(lpszphonebook.rawAddress.toString(), lpszentry.rawAddress.toString(), lpinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasPhonebookDlgW(lpszphonebook: Pcwstr, lpszentry: Pcwstr, lpinfo: MutPtr): Bool =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasPhonebookDlgW(lpszphonebook.rawAddress.toString(), lpszentry.rawAddress.toString(), lpinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasRenameEntryA(param0: Pcstr, param1: Pcstr, param2: Pcstr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasRenameEntryA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasRenameEntryW(param0: Pcwstr, param1: Pcwstr, param2: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasRenameEntryW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetAutodialAddressA(param0: Pcstr, param1: UInt, param2: ConstPtr, param3: UInt, param4: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasSetAutodialAddressA(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString(), param3.toInt(), param4.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetAutodialAddressW(param0: Pcwstr, param1: UInt, param2: ConstPtr, param3: UInt, param4: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasSetAutodialAddressW(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString(), param3.toInt(), param4.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetAutodialEnableA(param0: UInt, param1: Bool): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasSetAutodialEnableA(param0.toInt(), param1).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetAutodialEnableW(param0: UInt, param1: Bool): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasSetAutodialEnableW(param0.toInt(), param1).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetAutodialParamA(param0: UInt, param1: ConstPtr, param2: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasSetAutodialParamA(param0.toInt(), param1.rawAddress.toString(), param2.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetAutodialParamW(param0: UInt, param1: ConstPtr, param2: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasSetAutodialParamW(param0.toInt(), param1.rawAddress.toString(), param2.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetCredentialsA(param0: Pcstr, param1: Pcstr, param2: ConstPtr, param3: Bool): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasSetCredentialsA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), param3).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetCredentialsW(param0: Pcwstr, param1: Pcwstr, param2: ConstPtr, param3: Bool): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasSetCredentialsW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), param3).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetCustomAuthDataA(pszphonebook: Pcstr, pszentry: Pcstr, pbcustomauthdata: ConstPtr, dwsizeofcustomauthdata: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasSetCustomAuthDataA(pszphonebook.rawAddress.toString(), pszentry.rawAddress.toString(), pbcustomauthdata.rawAddress.toString(), dwsizeofcustomauthdata.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetCustomAuthDataW(pszphonebook: Pcwstr, pszentry: Pcwstr, pbcustomauthdata: ConstPtr, dwsizeofcustomauthdata: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasSetCustomAuthDataW(pszphonebook.rawAddress.toString(), pszentry.rawAddress.toString(), pbcustomauthdata.rawAddress.toString(), dwsizeofcustomauthdata.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetEapUserDataA(htoken: Handle, pszphonebook: Pcstr, pszentry: Pcstr, pbeapdata: ConstPtr, dwsizeofeapdata: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasSetEapUserDataA(htoken.rawAddress.toString(), pszphonebook.rawAddress.toString(), pszentry.rawAddress.toString(), pbeapdata.rawAddress.toString(), dwsizeofeapdata.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetEapUserDataW(htoken: Handle, pszphonebook: Pcwstr, pszentry: Pcwstr, pbeapdata: ConstPtr, dwsizeofeapdata: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasSetEapUserDataW(htoken.rawAddress.toString(), pszphonebook.rawAddress.toString(), pszentry.rawAddress.toString(), pbeapdata.rawAddress.toString(), dwsizeofeapdata.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetEntryDialParamsA(param0: Pcstr, param1: ConstPtr, param2: Bool): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasSetEntryDialParamsA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetEntryDialParamsW(param0: Pcwstr, param1: ConstPtr, param2: Bool): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasSetEntryDialParamsW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetEntryPropertiesA(param0: Pcstr, param1: Pcstr, param2: ConstPtr, param3: UInt, param4: ConstPtr, param5: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasSetEntryPropertiesA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), param3.toInt(), param4.rawAddress.toString(), param5.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetEntryPropertiesW(param0: Pcwstr, param1: Pcwstr, param2: ConstPtr, param3: UInt, param4: ConstPtr, param5: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasSetEntryPropertiesW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), param3.toInt(), param4.rawAddress.toString(), param5.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetSubEntryPropertiesA(param0: Pcstr, param1: Pcstr, param2: UInt, param3: ConstPtr, param4: UInt, param5: ConstPtr, param6: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasSetSubEntryPropertiesA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.toInt(), param3.rawAddress.toString(), param4.toInt(), param5.rawAddress.toString(), param6.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasSetSubEntryPropertiesW(param0: Pcwstr, param1: Pcwstr, param2: UInt, param3: ConstPtr, param4: UInt, param5: ConstPtr, param6: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasSetSubEntryPropertiesW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.toInt(), param3.rawAddress.toString(), param4.toInt(), param5.rawAddress.toString(), param6.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasUpdateConnection(hrasconn: Hrasconn, lprasupdateconn: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasUpdateConnection(hrasconn.rawAddress.toString(), lprasupdateconn.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasValidateEntryNameA(param0: Pcstr, param1: Pcstr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasValidateEntryNameA(param0.rawAddress.toString(), param1.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rasValidateEntryNameW(param0: Pcwstr, param1: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRasValidateEntryNameW(param0.rawAddress.toString(), param1.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmAddNextHop(rtmreghandle: Long, nexthopinfo: MutPtr, nexthophandle: MutPtr, changeflags: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmAddNextHop(rtmreghandle.toString(), nexthopinfo.rawAddress.toString(), nexthophandle.rawAddress.toString(), changeflags.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmAddRouteToDest(rtmreghandle: Long, routehandle: MutPtr, destaddress: MutPtr, routeinfo: MutPtr, timetolive: UInt, routelisthandle: Long, notifytype: UInt, notifyhandle: Long, changeflags: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmAddRouteToDest(rtmreghandle.toString(), routehandle.rawAddress.toString(), destaddress.rawAddress.toString(), routeinfo.rawAddress.toString(), timetolive.toInt(), routelisthandle.toString(), notifytype.toInt(), notifyhandle.toString(), changeflags.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmBlockMethods(rtmreghandle: Long, targethandle: Handle, targettype: UByte, blockingflag: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmBlockMethods(rtmreghandle.toString(), targethandle.rawAddress.toString(), targettype.toInt(), blockingflag.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmConvertIpv6AddressAndLengthToNetAddress(pnetaddress: MutPtr, address: In6Addr, dwlength: UInt, dwaddresssize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmConvertNetAddressToIpv6AddressAndLength(pnetaddress: MutPtr, paddress: MutPtr, plength: MutPtr, dwaddresssize: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmConvertNetAddressToIpv6AddressAndLength(pnetaddress.rawAddress.toString(), paddress.rawAddress.toString(), plength.rawAddress.toString(), dwaddresssize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmCreateDestEnum(rtmreghandle: Long, targetviews: UInt, enumflags: UInt, netaddress: MutPtr, protocolid: UInt, rtmenumhandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmCreateDestEnum(rtmreghandle.toString(), targetviews.toInt(), enumflags.toInt(), netaddress.rawAddress.toString(), protocolid.toInt(), rtmenumhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmCreateNextHopEnum(rtmreghandle: Long, enumflags: UInt, netaddress: MutPtr, rtmenumhandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmCreateNextHopEnum(rtmreghandle.toString(), enumflags.toInt(), netaddress.rawAddress.toString(), rtmenumhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmCreateRouteEnum(rtmreghandle: Long, desthandle: Long, targetviews: UInt, enumflags: UInt, startdest: MutPtr, matchingflags: UInt, criteriaroute: MutPtr, criteriainterface: UInt, rtmenumhandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmCreateRouteEnum(rtmreghandle.toString(), desthandle.toString(), targetviews.toInt(), enumflags.toInt(), startdest.rawAddress.toString(), matchingflags.toInt(), criteriaroute.rawAddress.toString(), criteriainterface.toInt(), rtmenumhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmCreateRouteList(rtmreghandle: Long, routelisthandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmCreateRouteList(rtmreghandle.toString(), routelisthandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmCreateRouteListEnum(rtmreghandle: Long, routelisthandle: Long, rtmenumhandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmCreateRouteListEnum(rtmreghandle.toString(), routelisthandle.toString(), rtmenumhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmDeleteEnumHandle(rtmreghandle: Long, enumhandle: Long): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmDeleteEnumHandle(rtmreghandle.toString(), enumhandle.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmDeleteNextHop(rtmreghandle: Long, nexthophandle: Long, nexthopinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmDeleteNextHop(rtmreghandle.toString(), nexthophandle.toString(), nexthopinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmDeleteRouteList(rtmreghandle: Long, routelisthandle: Long): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmDeleteRouteList(rtmreghandle.toString(), routelisthandle.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmDeleteRouteToDest(rtmreghandle: Long, routehandle: Long, changeflags: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmDeleteRouteToDest(rtmreghandle.toString(), routehandle.toString(), changeflags.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmDeregisterEntity(rtmreghandle: Long): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmDeregisterEntity(rtmreghandle.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmDeregisterFromChangeNotification(rtmreghandle: Long, notifyhandle: Long): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmDeregisterFromChangeNotification(rtmreghandle.toString(), notifyhandle.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmFindNextHop(rtmreghandle: Long, nexthopinfo: MutPtr, nexthophandle: MutPtr, nexthoppointer: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmFindNextHop(rtmreghandle.toString(), nexthopinfo.rawAddress.toString(), nexthophandle.rawAddress.toString(), nexthoppointer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetChangeStatus(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, changestatus: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmGetChangeStatus(rtmreghandle.toString(), notifyhandle.toString(), desthandle.toString(), changestatus.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: MutPtr, changeddests: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmGetChangedDests(rtmreghandle.toString(), notifyhandle.toString(), numdests.rawAddress.toString(), changeddests.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetDestInfo(rtmreghandle: Long, desthandle: Long, protocolid: UInt, targetviews: UInt, destinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmGetDestInfo(rtmreghandle.toString(), desthandle.toString(), protocolid.toInt(), targetviews.toInt(), destinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetEntityInfo(rtmreghandle: Long, entityhandle: Long, entityinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmGetEntityInfo(rtmreghandle.toString(), entityhandle.toString(), entityinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetEntityMethods(rtmreghandle: Long, entityhandle: Long, nummethods: MutPtr, exptmethods: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmGetEntityMethods(rtmreghandle.toString(), entityhandle.toString(), nummethods.rawAddress.toString(), exptmethods.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetEnumDests(rtmreghandle: Long, enumhandle: Long, numdests: MutPtr, destinfos: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmGetEnumDests(rtmreghandle.toString(), enumhandle.toString(), numdests.rawAddress.toString(), destinfos.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetEnumNextHops(rtmreghandle: Long, enumhandle: Long, numnexthops: MutPtr, nexthophandles: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmGetEnumNextHops(rtmreghandle.toString(), enumhandle.toString(), numnexthops.rawAddress.toString(), nexthophandles.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetEnumRoutes(rtmreghandle: Long, enumhandle: Long, numroutes: MutPtr, routehandles: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmGetEnumRoutes(rtmreghandle.toString(), enumhandle.toString(), numroutes.rawAddress.toString(), routehandles.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetExactMatchDestination(rtmreghandle: Long, destaddress: MutPtr, protocolid: UInt, targetviews: UInt, destinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmGetExactMatchDestination(rtmreghandle.toString(), destaddress.rawAddress.toString(), protocolid.toInt(), targetviews.toInt(), destinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetExactMatchRoute(rtmreghandle: Long, destaddress: MutPtr, matchingflags: UInt, routeinfo: MutPtr, interfaceindex: UInt, targetviews: UInt, routehandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmGetExactMatchRoute(rtmreghandle.toString(), destaddress.rawAddress.toString(), matchingflags.toInt(), routeinfo.rawAddress.toString(), interfaceindex.toInt(), targetviews.toInt(), routehandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetLessSpecificDestination(rtmreghandle: Long, desthandle: Long, protocolid: UInt, targetviews: UInt, destinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmGetLessSpecificDestination(rtmreghandle.toString(), desthandle.toString(), protocolid.toInt(), targetviews.toInt(), destinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetListEnumRoutes(rtmreghandle: Long, enumhandle: Long, numroutes: MutPtr, routehandles: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmGetListEnumRoutes(rtmreghandle.toString(), enumhandle.toString(), numroutes.rawAddress.toString(), routehandles.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetMostSpecificDestination(rtmreghandle: Long, destaddress: MutPtr, protocolid: UInt, targetviews: UInt, destinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmGetMostSpecificDestination(rtmreghandle.toString(), destaddress.rawAddress.toString(), protocolid.toInt(), targetviews.toInt(), destinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetNextHopInfo(rtmreghandle: Long, nexthophandle: Long, nexthopinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmGetNextHopInfo(rtmreghandle.toString(), nexthophandle.toString(), nexthopinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetNextHopPointer(rtmreghandle: Long, nexthophandle: Long, nexthoppointer: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmGetNextHopPointer(rtmreghandle.toString(), nexthophandle.toString(), nexthoppointer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetOpaqueInformationPointer(rtmreghandle: Long, desthandle: Long, opaqueinfopointer: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmGetOpaqueInformationPointer(rtmreghandle.toString(), desthandle.toString(), opaqueinfopointer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetRegisteredEntities(rtmreghandle: Long, numentities: MutPtr, entityhandles: MutPtr, entityinfos: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmGetRegisteredEntities(rtmreghandle.toString(), numentities.rawAddress.toString(), entityhandles.rawAddress.toString(), entityinfos.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetRouteInfo(rtmreghandle: Long, routehandle: Long, routeinfo: MutPtr, destaddress: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmGetRouteInfo(rtmreghandle.toString(), routehandle.toString(), routeinfo.rawAddress.toString(), destaddress.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmGetRoutePointer(rtmreghandle: Long, routehandle: Long, routepointer: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmGetRoutePointer(rtmreghandle.toString(), routehandle.toString(), routepointer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmHoldDestination(rtmreghandle: Long, desthandle: Long, targetviews: UInt, holdtime: UInt): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmHoldDestination(rtmreghandle.toString(), desthandle.toString(), targetviews.toInt(), holdtime.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmIgnoreChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: UInt, changeddests: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmIgnoreChangedDests(rtmreghandle.toString(), notifyhandle.toString(), numdests.toInt(), changeddests.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmInsertInRouteList(rtmreghandle: Long, routelisthandle: Long, numroutes: UInt, routehandles: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmInsertInRouteList(rtmreghandle.toString(), routelisthandle.toString(), numroutes.toInt(), routehandles.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmInvokeMethod(rtmreghandle: Long, entityhandle: Long, input: MutPtr, outputsize: MutPtr, output: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmInvokeMethod(rtmreghandle.toString(), entityhandle.toString(), input.rawAddress.toString(), outputsize.rawAddress.toString(), output.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmIsBestRoute(rtmreghandle: Long, routehandle: Long, bestinviews: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmIsBestRoute(rtmreghandle.toString(), routehandle.toString(), bestinviews.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmIsMarkedForChangeNotification(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, destmarked: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmIsMarkedForChangeNotification(rtmreghandle.toString(), notifyhandle.toString(), desthandle.toString(), destmarked.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmLockDestination(rtmreghandle: Long, desthandle: Long, exclusive: Bool, lockdest: Bool): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmLockDestination(rtmreghandle.toString(), desthandle.toString(), exclusive, lockdest).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmLockNextHop(rtmreghandle: Long, nexthophandle: Long, exclusive: Bool, locknexthop: Bool, nexthoppointer: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmLockNextHop(rtmreghandle.toString(), nexthophandle.toString(), exclusive, locknexthop, nexthoppointer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmLockRoute(rtmreghandle: Long, routehandle: Long, exclusive: Bool, lockroute: Bool, routepointer: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmLockRoute(rtmreghandle.toString(), routehandle.toString(), exclusive, lockroute, routepointer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmMarkDestForChangeNotification(rtmreghandle: Long, notifyhandle: Long, desthandle: Long, markdest: Bool): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmMarkDestForChangeNotification(rtmreghandle.toString(), notifyhandle.toString(), desthandle.toString(), markdest).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmReferenceHandles(rtmreghandle: Long, numhandles: UInt, rtmhandles: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmReferenceHandles(rtmreghandle.toString(), numhandles.toInt(), rtmhandles.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmRegisterEntity(rtmentityinfo: MutPtr, exportmethods: MutPtr, eventcallback: RtmEventCallback, reserveopaquepointer: Bool, rtmregprofile: MutPtr, rtmreghandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmRegisterEntity(rtmentityinfo.rawAddress.toString(), exportmethods.rawAddress.toString(), 0L.toString(), reserveopaquepointer, rtmregprofile.rawAddress.toString(), rtmreghandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmRegisterForChangeNotification(rtmreghandle: Long, targetviews: UInt, notifyflags: UInt, notifycontext: MutPtr, notifyhandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmRegisterForChangeNotification(rtmreghandle.toString(), targetviews.toInt(), notifyflags.toInt(), notifycontext.rawAddress.toString(), notifyhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmReleaseChangedDests(rtmreghandle: Long, notifyhandle: Long, numdests: UInt, changeddests: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmReleaseChangedDests(rtmreghandle.toString(), notifyhandle.toString(), numdests.toInt(), changeddests.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmReleaseDestInfo(rtmreghandle: Long, destinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmReleaseDestInfo(rtmreghandle.toString(), destinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmReleaseDests(rtmreghandle: Long, numdests: UInt, destinfos: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmReleaseDests(rtmreghandle.toString(), numdests.toInt(), destinfos.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmReleaseEntities(rtmreghandle: Long, numentities: UInt, entityhandles: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmReleaseEntities(rtmreghandle.toString(), numentities.toInt(), entityhandles.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmReleaseEntityInfo(rtmreghandle: Long, entityinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmReleaseEntityInfo(rtmreghandle.toString(), entityinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmReleaseNextHopInfo(rtmreghandle: Long, nexthopinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmReleaseNextHopInfo(rtmreghandle.toString(), nexthopinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmReleaseNextHops(rtmreghandle: Long, numnexthops: UInt, nexthophandles: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmReleaseNextHops(rtmreghandle.toString(), numnexthops.toInt(), nexthophandles.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmReleaseRouteInfo(rtmreghandle: Long, routeinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmReleaseRouteInfo(rtmreghandle.toString(), routeinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmReleaseRoutes(rtmreghandle: Long, numroutes: UInt, routehandles: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmReleaseRoutes(rtmreghandle.toString(), numroutes.toInt(), routehandles.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtmUpdateAndUnlockRoute(rtmreghandle: Long, routehandle: Long, timetolive: UInt, routelisthandle: Long, notifytype: UInt, notifyhandle: Long, changeflags: MutPtr): UInt =
    if (windowsWin32NetworkmanagementRrasNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementRrasRtmUpdateAndUnlockRoute(rtmreghandle.toString(), routehandle.toString(), timetolive.toInt(), routelisthandle.toString(), notifytype.toInt(), notifyhandle.toString(), changeflags.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
