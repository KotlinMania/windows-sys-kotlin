@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32NetworkmanagementNetmanagementNapiAddon(): Boolean

private val _windowsWin32NetworkmanagementNetmanagementNapiAvailable: Boolean = _initWindowsWin32NetworkmanagementNetmanagementNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_getNetScheduleAccountInformation(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_getNetScheduleAccountInformation(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_iNetLogonControl2(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_iNetLogonControl2(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_logErrorA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_logErrorA(p0: Int, p1: Int, p2: String, p3: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_logErrorW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_logErrorW(p0: Int, p1: Int, p2: String, p3: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_logEventA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_logEventA(p0: Int, p1: Int, p2: Int, p3: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_logEventW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_logEventW(p0: Int, p1: Int, p2: Int, p3: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_mprSetupProtocolEnum(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_mprSetupProtocolEnum(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_mprSetupProtocolFree(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_mprSetupProtocolFree(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netAccessAdd(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netAccessAdd(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netAccessDel(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netAccessDel(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netAccessEnum(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netAccessEnum(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netAccessGetInfo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netAccessGetInfo(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netAccessGetUserPerms(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netAccessGetUserPerms(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netAccessSetInfo(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netAccessSetInfo(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netAddAlternateComputerName(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netAddAlternateComputerName(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netAddServiceAccount(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netAddServiceAccount(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netAlertRaise(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netAlertRaise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netAlertRaiseEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netAlertRaiseEx(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netApiBufferAllocate(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netApiBufferAllocate(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netApiBufferFree(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netApiBufferFree(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netApiBufferReallocate(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netApiBufferReallocate(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netApiBufferSize(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netApiBufferSize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netAuditClear(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netAuditClear(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netAuditRead(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netAuditRead(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: Int, p7: String, p8: Int, p9: String, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netAuditWrite(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netAuditWrite(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netConfigGet(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netConfigGet(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netConfigGetAll(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netConfigGetAll(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netConfigSet(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netConfigSet(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netCreateProvisioningPackage(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netCreateProvisioningPackage(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netEnumerateComputerNames(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netEnumerateComputerNames(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netEnumerateServiceAccounts(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netEnumerateServiceAccounts(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netErrorLogClear(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netErrorLogClear(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netErrorLogRead(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netErrorLogRead(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: Int, p7: String, p8: Int, p9: String, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netErrorLogWrite(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netErrorLogWrite(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netFreeAadJoinInformation(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netFreeAadJoinInformation(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netGetAadJoinInformation(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netGetAadJoinInformation(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netGetAnyDCName(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netGetAnyDCName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netGetDCName(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netGetDCName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netGetDisplayInformationIndex(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netGetDisplayInformationIndex(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netGetJoinInformation(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netGetJoinInformation(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netGetJoinableOUs(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netGetJoinableOUs(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netGroupAdd(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netGroupAdd(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netGroupAddUser(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netGroupAddUser(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netGroupDel(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netGroupDel(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netGroupDelUser(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netGroupDelUser(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netGroupEnum(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netGroupEnum(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netGroupGetInfo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netGroupGetInfo(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netGroupGetUsers(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netGroupGetUsers(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netGroupSetInfo(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netGroupSetInfo(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netGroupSetUsers(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netGroupSetUsers(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netIsServiceAccount(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netIsServiceAccount(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netJoinDomain(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netJoinDomain(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupAdd(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupAdd(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupAddMember(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupAddMember(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupAddMembers(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupAddMembers(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupDel(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupDel(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupDelMember(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupDelMember(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupDelMembers(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupDelMembers(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupEnum(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupEnum(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupGetInfo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupGetInfo(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupGetMembers(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupGetMembers(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupSetInfo(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupSetInfo(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupSetMembers(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupSetMembers(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netMessageBufferSend(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netMessageBufferSend(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netMessageNameAdd(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netMessageNameAdd(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netMessageNameDel(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netMessageNameDel(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netMessageNameEnum(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netMessageNameEnum(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netMessageNameGetInfo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netMessageNameGetInfo(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netProvisionComputerAccount(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netProvisionComputerAccount(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netQueryDisplayInformation(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netQueryDisplayInformation(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netQueryServiceAccount(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netQueryServiceAccount(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netRemoteComputerSupports(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netRemoteComputerSupports(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netRemoteTOD(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netRemoteTOD(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netRemoveAlternateComputerName(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netRemoveAlternateComputerName(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netRemoveServiceAccount(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netRemoveServiceAccount(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netRenameMachineInDomain(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netRenameMachineInDomain(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirAdd(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirAdd(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirDel(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirDel(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirEnum(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirEnum(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirGetInfo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirGetInfo(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirLock(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirLock(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirSetInfo(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirSetInfo(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirUnlock(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirUnlock(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netReplGetInfo(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netReplGetInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netReplImportDirAdd(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netReplImportDirAdd(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netReplImportDirDel(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netReplImportDirDel(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netReplImportDirEnum(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netReplImportDirEnum(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netReplImportDirGetInfo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netReplImportDirGetInfo(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netReplImportDirLock(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netReplImportDirLock(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netReplImportDirUnlock(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netReplImportDirUnlock(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netReplSetInfo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netReplSetInfo(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netRequestOfflineDomainJoin(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netRequestOfflineDomainJoin(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netRequestProvisioningPackageInstall(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netRequestProvisioningPackageInstall(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netScheduleJobAdd(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netScheduleJobAdd(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netScheduleJobDel(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netScheduleJobDel(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netScheduleJobEnum(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netScheduleJobEnum(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netScheduleJobGetInfo(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netScheduleJobGetInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netServerComputerNameAdd(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netServerComputerNameAdd(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netServerComputerNameDel(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netServerComputerNameDel(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netServerDiskEnum(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netServerDiskEnum(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netServerEnum(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netServerEnum(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netServerGetInfo(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netServerGetInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netServerSetInfo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netServerSetInfo(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netServerTransportAdd(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netServerTransportAdd(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netServerTransportAddEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netServerTransportAddEx(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netServerTransportDel(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netServerTransportDel(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netServerTransportEnum(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netServerTransportEnum(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netServiceControl(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netServiceControl(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netServiceEnum(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netServiceEnum(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netServiceGetInfo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netServiceGetInfo(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netServiceInstall(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netServiceInstall(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netSetPrimaryComputerName(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netSetPrimaryComputerName(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netUnjoinDomain(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netUnjoinDomain(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netUseAdd(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netUseAdd(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netUseDel(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netUseDel(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netUseEnum(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netUseEnum(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netUseGetInfo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netUseGetInfo(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netUserAdd(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netUserAdd(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netUserChangePassword(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netUserChangePassword(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netUserDel(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netUserDel(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netUserEnum(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netUserEnum(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netUserGetGroups(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netUserGetGroups(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netUserGetInfo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netUserGetInfo(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netUserGetLocalGroups(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netUserGetLocalGroups(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netUserModalsGet(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netUserModalsGet(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netUserModalsSet(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netUserModalsSet(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netUserSetGroups(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netUserSetGroups(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netUserSetInfo(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netUserSetInfo(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netValidateName(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netValidateName(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netValidatePasswordPolicy(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netValidatePasswordPolicy(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netValidatePasswordPolicyFree(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netValidatePasswordPolicyFree(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netWkstaGetInfo(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netWkstaGetInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netWkstaSetInfo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netWkstaSetInfo(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netWkstaTransportAdd(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netWkstaTransportAdd(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netWkstaTransportDel(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netWkstaTransportDel(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netWkstaTransportEnum(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netWkstaTransportEnum(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netWkstaUserEnum(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netWkstaUserEnum(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netWkstaUserGetInfo(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netWkstaUserGetInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_netWkstaUserSetInfo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netWkstaUserSetInfo(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_routerAssert(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_routerAssert(p0: String, p1: String, p2: Int, p3: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_routerGetErrorStringA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_routerGetErrorStringA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_routerGetErrorStringW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_routerGetErrorStringW(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_routerLogDeregisterA(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_routerLogDeregisterA(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_routerLogDeregisterW(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_routerLogDeregisterW(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventA(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventDataA(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventDataA(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventDataW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventDataW(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventExA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventExA(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String, p9: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventExW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventExW(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String, p9: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventStringA(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventStringA(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: Int)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventStringW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventStringW(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: Int)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventValistExA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventValistExA(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventValistExW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventValistExW(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventW(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_routerLogRegisterA(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_routerLogRegisterA(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_routerLogRegisterW(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_routerLogRegisterW(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_setNetScheduleAccountInformation(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_setNetScheduleAccountInformation(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_traceDeregisterA(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_traceDeregisterA(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_traceDeregisterExA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_traceDeregisterExA(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_traceDeregisterExW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_traceDeregisterExW(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_traceDeregisterW(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_traceDeregisterW(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_traceDumpExA(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_traceDumpExA(p0: Int, p1: Int, p2: String, p3: Int, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_traceDumpExW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_traceDumpExW(p0: Int, p1: Int, p2: String, p3: Int, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_traceGetConsoleA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_traceGetConsoleA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_traceGetConsoleW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_traceGetConsoleW(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_tracePrintfA(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_tracePrintfA(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_tracePrintfExA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_tracePrintfExA(p0: Int, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_tracePrintfExW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_tracePrintfExW(p0: Int, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_tracePrintfW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_tracePrintfW(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_tracePutsExA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_tracePutsExA(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_tracePutsExW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_tracePutsExW(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_traceRegisterExA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_traceRegisterExA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_traceRegisterExW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_traceRegisterExW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_traceVprintfExA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_traceVprintfExA(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_netmanagement_traceVprintfExW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_netmanagement_traceVprintfExW(p0: Int, p1: Int, p2: String, p3: String): Int

public actual fun getNetScheduleAccountInformation(pwszservername: Pcwstr, ccaccount: UInt, wszaccount: Pwstr): Hresult =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_getNetScheduleAccountInformation((pwszservername?.value ?: 0L).toString(), ccaccount.toInt(), (wszaccount?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iNetLogonControl2(servername: Pcwstr, functioncode: UInt, querylevel: UInt, data: COpaquePointer?, buffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_iNetLogonControl2((servername?.value ?: 0L).toString(), functioncode.toInt(), querylevel.toInt(), (data?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun logErrorA(dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: COpaquePointer?, dwerrorcode: UInt) {
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_netmanagement_logErrorA(dwmessageid.toInt(), cnumberofsubstrings.toInt(), (plpwssubstrings?.value ?: 0L).toString(), dwerrorcode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun logErrorW(dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: COpaquePointer?, dwerrorcode: UInt) {
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_netmanagement_logErrorW(dwmessageid.toInt(), cnumberofsubstrings.toInt(), (plpwssubstrings?.value ?: 0L).toString(), dwerrorcode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun logEventA(weventtype: UInt, dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_netmanagement_logEventA(weventtype.toInt(), dwmessageid.toInt(), cnumberofsubstrings.toInt(), (plpwssubstrings?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun logEventW(weventtype: UInt, dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_netmanagement_logEventW(weventtype.toInt(), dwmessageid.toInt(), cnumberofsubstrings.toInt(), (plpwssubstrings?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mprSetupProtocolEnum(dwtransportid: UInt, lplpbuffer: COpaquePointer?, lpdwentriesread: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_mprSetupProtocolEnum(dwtransportid.toInt(), (lplpbuffer?.value ?: 0L).toString(), (lpdwentriesread?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprSetupProtocolFree(lpbuffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_mprSetupProtocolFree((lpbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAccessAdd(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netAccessAdd((servername?.value ?: 0L).toString(), level.toInt(), (buf?.value ?: 0L).toString(), (parmErr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAccessDel(servername: Pcwstr, resource: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netAccessDel((servername?.value ?: 0L).toString(), (resource?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAccessEnum(servername: Pcwstr, basepath: Pcwstr, recursive: UInt, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netAccessEnum((servername?.value ?: 0L).toString(), (basepath?.value ?: 0L).toString(), recursive.toInt(), level.toInt(), (bufptr?.value ?: 0L).toString(), prefmaxlen.toInt(), (entriesread?.value ?: 0L).toString(), (totalentries?.value ?: 0L).toString(), (resumeHandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAccessGetInfo(servername: Pcwstr, resource: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netAccessGetInfo((servername?.value ?: 0L).toString(), (resource?.value ?: 0L).toString(), level.toInt(), (bufptr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAccessGetUserPerms(servername: Pcwstr, ugname: Pcwstr, resource: Pcwstr, perms: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netAccessGetUserPerms((servername?.value ?: 0L).toString(), (ugname?.value ?: 0L).toString(), (resource?.value ?: 0L).toString(), (perms?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAccessSetInfo(servername: Pcwstr, resource: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netAccessSetInfo((servername?.value ?: 0L).toString(), (resource?.value ?: 0L).toString(), level.toInt(), (buf?.value ?: 0L).toString(), (parmErr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAddAlternateComputerName(server: Pcwstr, alternatename: Pcwstr, domainaccount: Pcwstr, domainaccountpassword: Pcwstr, reserved: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netAddAlternateComputerName((server?.value ?: 0L).toString(), (alternatename?.value ?: 0L).toString(), (domainaccount?.value ?: 0L).toString(), (domainaccountpassword?.value ?: 0L).toString(), reserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAddServiceAccount(servername: Pcwstr, accountname: Pcwstr, password: Pcwstr, flags: UInt): Ntstatus =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netAddServiceAccount((servername?.value ?: 0L).toString(), (accountname?.value ?: 0L).toString(), (password?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAlertRaise(alerttype: Pcwstr, buffer: COpaquePointer?, buffersize: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netAlertRaise((alerttype?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), buffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAlertRaiseEx(alerttype: Pcwstr, variableinfo: COpaquePointer?, variableinfosize: UInt, servicename: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netAlertRaiseEx((alerttype?.value ?: 0L).toString(), (variableinfo?.value ?: 0L).toString(), variableinfosize.toInt(), (servicename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netApiBufferAllocate(bytecount: UInt, buffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netApiBufferAllocate(bytecount.toInt(), (buffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netApiBufferFree(buffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netApiBufferFree((buffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netApiBufferReallocate(oldbuffer: COpaquePointer?, newbytecount: UInt, newbuffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netApiBufferReallocate((oldbuffer?.value ?: 0L).toString(), newbytecount.toInt(), (newbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netApiBufferSize(buffer: COpaquePointer?, bytecount: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netApiBufferSize((buffer?.value ?: 0L).toString(), (bytecount?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAuditClear(server: Pcwstr, backupfile: Pcwstr, service: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netAuditClear((server?.value ?: 0L).toString(), (backupfile?.value ?: 0L).toString(), (service?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAuditRead(server: Pcwstr, service: Pcwstr, auditloghandle: COpaquePointer?, offset: UInt, reserved1: COpaquePointer?, reserved2: UInt, offsetflag: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, bytesread: COpaquePointer?, totalavailable: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netAuditRead((server?.value ?: 0L).toString(), (service?.value ?: 0L).toString(), (auditloghandle?.value ?: 0L).toString(), offset.toInt(), (reserved1?.value ?: 0L).toString(), reserved2.toInt(), offsetflag.toInt(), (bufptr?.value ?: 0L).toString(), prefmaxlen.toInt(), (bytesread?.value ?: 0L).toString(), (totalavailable?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAuditWrite(type: UInt, buf: COpaquePointer?, numbytes: UInt, service: Pcwstr, reserved: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netAuditWrite(type.toInt(), (buf?.value ?: 0L).toString(), numbytes.toInt(), (service?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netConfigGet(server: Pcwstr, component: Pcwstr, parameter: Pcwstr, bufptr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netConfigGet((server?.value ?: 0L).toString(), (component?.value ?: 0L).toString(), (parameter?.value ?: 0L).toString(), (bufptr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netConfigGetAll(server: Pcwstr, component: Pcwstr, bufptr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netConfigGetAll((server?.value ?: 0L).toString(), (component?.value ?: 0L).toString(), (bufptr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netConfigSet(server: Pcwstr, reserved1: Pcwstr, component: Pcwstr, level: UInt, reserved2: UInt, buf: COpaquePointer?, reserved3: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netConfigSet((server?.value ?: 0L).toString(), (reserved1?.value ?: 0L).toString(), (component?.value ?: 0L).toString(), level.toInt(), reserved2.toInt(), (buf?.value ?: 0L).toString(), reserved3.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netCreateProvisioningPackage(pprovisioningparams: COpaquePointer?, pppackagebindata: COpaquePointer?, pdwpackagebindatasize: COpaquePointer?, pppackagetextdata: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netCreateProvisioningPackage((pprovisioningparams?.value ?: 0L).toString(), (pppackagebindata?.value ?: 0L).toString(), (pdwpackagebindatasize?.value ?: 0L).toString(), (pppackagetextdata?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netEnumerateComputerNames(server: Pcwstr, nametype: NetComputerNameType, reserved: UInt, entrycount: COpaquePointer?, computernames: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netEnumerateComputerNames((server?.value ?: 0L).toString(), nametype, reserved.toInt(), (entrycount?.value ?: 0L).toString(), (computernames?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netEnumerateServiceAccounts(servername: Pcwstr, flags: UInt, accountscount: COpaquePointer?, accounts: COpaquePointer?): Ntstatus =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netEnumerateServiceAccounts((servername?.value ?: 0L).toString(), flags.toInt(), (accountscount?.value ?: 0L).toString(), (accounts?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netErrorLogClear(uncservername: Pcwstr, backupfile: Pcwstr, reserved: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netErrorLogClear((uncservername?.value ?: 0L).toString(), (backupfile?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netErrorLogRead(uncservername: Pcwstr, reserved1: Pcwstr, errorloghandle: COpaquePointer?, offset: UInt, reserved2: COpaquePointer?, reserved3: UInt, offsetflag: UInt, bufptr: COpaquePointer?, prefmaxsize: UInt, bytesread: COpaquePointer?, totalavailable: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netErrorLogRead((uncservername?.value ?: 0L).toString(), (reserved1?.value ?: 0L).toString(), (errorloghandle?.value ?: 0L).toString(), offset.toInt(), (reserved2?.value ?: 0L).toString(), reserved3.toInt(), offsetflag.toInt(), (bufptr?.value ?: 0L).toString(), prefmaxsize.toInt(), (bytesread?.value ?: 0L).toString(), (totalavailable?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netErrorLogWrite(reserved1: COpaquePointer?, code: UInt, component: Pcwstr, buffer: COpaquePointer?, numbytes: UInt, msgbuf: COpaquePointer?, strcount: UInt, reserved2: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netErrorLogWrite((reserved1?.value ?: 0L).toString(), code.toInt(), (component?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), numbytes.toInt(), (msgbuf?.value ?: 0L).toString(), strcount.toInt(), (reserved2?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netFreeAadJoinInformation(pjoininfo: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netFreeAadJoinInformation((pjoininfo?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun netGetAadJoinInformation(pcsztenantid: Pcwstr, ppjoininfo: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netGetAadJoinInformation((pcsztenantid?.value ?: 0L).toString(), (ppjoininfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGetAnyDCName(servername: Pcwstr, domainname: Pcwstr, buffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netGetAnyDCName((servername?.value ?: 0L).toString(), (domainname?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGetDCName(servername: Pcwstr, domainname: Pcwstr, buffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netGetDCName((servername?.value ?: 0L).toString(), (domainname?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGetDisplayInformationIndex(servername: Pcwstr, level: UInt, prefix: Pcwstr, index: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netGetDisplayInformationIndex((servername?.value ?: 0L).toString(), level.toInt(), (prefix?.value ?: 0L).toString(), (index?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGetJoinInformation(lpserver: Pcwstr, lpnamebuffer: COpaquePointer?, buffertype: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netGetJoinInformation((lpserver?.value ?: 0L).toString(), (lpnamebuffer?.value ?: 0L).toString(), (buffertype?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGetJoinableOUs(lpserver: Pcwstr, lpdomain: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, oucount: COpaquePointer?, ous: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netGetJoinableOUs((lpserver?.value ?: 0L).toString(), (lpdomain?.value ?: 0L).toString(), (lpaccount?.value ?: 0L).toString(), (lppassword?.value ?: 0L).toString(), (oucount?.value ?: 0L).toString(), (ous?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGroupAdd(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netGroupAdd((servername?.value ?: 0L).toString(), level.toInt(), (buf?.value ?: 0L).toString(), (parmErr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGroupAddUser(servername: Pcwstr, groupname: Pcwstr, username: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netGroupAddUser((servername?.value ?: 0L).toString(), (groupname?.value ?: 0L).toString(), (username?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGroupDel(servername: Pcwstr, groupname: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netGroupDel((servername?.value ?: 0L).toString(), (groupname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGroupDelUser(servername: Pcwstr, groupname: Pcwstr, username: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netGroupDelUser((servername?.value ?: 0L).toString(), (groupname?.value ?: 0L).toString(), (username?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGroupEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netGroupEnum((servername?.value ?: 0L).toString(), level.toInt(), (bufptr?.value ?: 0L).toString(), prefmaxlen.toInt(), (entriesread?.value ?: 0L).toString(), (totalentries?.value ?: 0L).toString(), (resumeHandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGroupGetInfo(servername: Pcwstr, groupname: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netGroupGetInfo((servername?.value ?: 0L).toString(), (groupname?.value ?: 0L).toString(), level.toInt(), (bufptr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGroupGetUsers(servername: Pcwstr, groupname: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumehandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netGroupGetUsers((servername?.value ?: 0L).toString(), (groupname?.value ?: 0L).toString(), level.toInt(), (bufptr?.value ?: 0L).toString(), prefmaxlen.toInt(), (entriesread?.value ?: 0L).toString(), (totalentries?.value ?: 0L).toString(), (resumehandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGroupSetInfo(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netGroupSetInfo((servername?.value ?: 0L).toString(), (groupname?.value ?: 0L).toString(), level.toInt(), (buf?.value ?: 0L).toString(), (parmErr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGroupSetUsers(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: COpaquePointer?, totalentries: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netGroupSetUsers((servername?.value ?: 0L).toString(), (groupname?.value ?: 0L).toString(), level.toInt(), (buf?.value ?: 0L).toString(), totalentries.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netIsServiceAccount(servername: Pcwstr, accountname: Pcwstr, isservice: COpaquePointer?): Ntstatus =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netIsServiceAccount((servername?.value ?: 0L).toString(), (accountname?.value ?: 0L).toString(), (isservice?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netJoinDomain(lpserver: Pcwstr, lpdomain: Pcwstr, lpmachineaccountou: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, fjoinoptions: NetJoinDomainJoinOptions): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netJoinDomain((lpserver?.value ?: 0L).toString(), (lpdomain?.value ?: 0L).toString(), (lpmachineaccountou?.value ?: 0L).toString(), (lpaccount?.value ?: 0L).toString(), (lppassword?.value ?: 0L).toString(), fjoinoptions.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netLocalGroupAdd(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupAdd((servername?.value ?: 0L).toString(), level.toInt(), (buf?.value ?: 0L).toString(), (parmErr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netLocalGroupAddMember(servername: Pcwstr, groupname: Pcwstr, membersid: Psid): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupAddMember((servername?.value ?: 0L).toString(), (groupname?.value ?: 0L).toString(), (membersid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netLocalGroupAddMembers(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: COpaquePointer?, totalentries: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupAddMembers((servername?.value ?: 0L).toString(), (groupname?.value ?: 0L).toString(), level.toInt(), (buf?.value ?: 0L).toString(), totalentries.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netLocalGroupDel(servername: Pcwstr, groupname: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupDel((servername?.value ?: 0L).toString(), (groupname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netLocalGroupDelMember(servername: Pcwstr, groupname: Pcwstr, membersid: Psid): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupDelMember((servername?.value ?: 0L).toString(), (groupname?.value ?: 0L).toString(), (membersid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netLocalGroupDelMembers(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: COpaquePointer?, totalentries: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupDelMembers((servername?.value ?: 0L).toString(), (groupname?.value ?: 0L).toString(), level.toInt(), (buf?.value ?: 0L).toString(), totalentries.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netLocalGroupEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumehandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupEnum((servername?.value ?: 0L).toString(), level.toInt(), (bufptr?.value ?: 0L).toString(), prefmaxlen.toInt(), (entriesread?.value ?: 0L).toString(), (totalentries?.value ?: 0L).toString(), (resumehandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netLocalGroupGetInfo(servername: Pcwstr, groupname: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupGetInfo((servername?.value ?: 0L).toString(), (groupname?.value ?: 0L).toString(), level.toInt(), (bufptr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netLocalGroupGetMembers(servername: Pcwstr, localgroupname: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumehandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupGetMembers((servername?.value ?: 0L).toString(), (localgroupname?.value ?: 0L).toString(), level.toInt(), (bufptr?.value ?: 0L).toString(), prefmaxlen.toInt(), (entriesread?.value ?: 0L).toString(), (totalentries?.value ?: 0L).toString(), (resumehandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netLocalGroupSetInfo(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupSetInfo((servername?.value ?: 0L).toString(), (groupname?.value ?: 0L).toString(), level.toInt(), (buf?.value ?: 0L).toString(), (parmErr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netLocalGroupSetMembers(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: COpaquePointer?, totalentries: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netLocalGroupSetMembers((servername?.value ?: 0L).toString(), (groupname?.value ?: 0L).toString(), level.toInt(), (buf?.value ?: 0L).toString(), totalentries.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netMessageBufferSend(servername: Pcwstr, msgname: Pcwstr, fromname: Pcwstr, buf: COpaquePointer?, buflen: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netMessageBufferSend((servername?.value ?: 0L).toString(), (msgname?.value ?: 0L).toString(), (fromname?.value ?: 0L).toString(), (buf?.value ?: 0L).toString(), buflen.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netMessageNameAdd(servername: Pcwstr, msgname: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netMessageNameAdd((servername?.value ?: 0L).toString(), (msgname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netMessageNameDel(servername: Pcwstr, msgname: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netMessageNameDel((servername?.value ?: 0L).toString(), (msgname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netMessageNameEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netMessageNameEnum((servername?.value ?: 0L).toString(), level.toInt(), (bufptr?.value ?: 0L).toString(), prefmaxlen.toInt(), (entriesread?.value ?: 0L).toString(), (totalentries?.value ?: 0L).toString(), (resumeHandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netMessageNameGetInfo(servername: Pcwstr, msgname: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netMessageNameGetInfo((servername?.value ?: 0L).toString(), (msgname?.value ?: 0L).toString(), level.toInt(), (bufptr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netProvisionComputerAccount(lpdomain: Pcwstr, lpmachinename: Pcwstr, lpmachineaccountou: Pcwstr, lpdcname: Pcwstr, dwoptions: NetsetupProvision, pprovisionbindata: COpaquePointer?, pdwprovisionbindatasize: COpaquePointer?, pprovisiontextdata: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netProvisionComputerAccount((lpdomain?.value ?: 0L).toString(), (lpmachinename?.value ?: 0L).toString(), (lpmachineaccountou?.value ?: 0L).toString(), (lpdcname?.value ?: 0L).toString(), dwoptions.toInt(), (pprovisionbindata?.value ?: 0L).toString(), (pdwprovisionbindatasize?.value ?: 0L).toString(), (pprovisiontextdata?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netQueryDisplayInformation(servername: Pcwstr, level: UInt, index: UInt, entriesrequested: UInt, preferredmaximumlength: UInt, returnedentrycount: COpaquePointer?, sortedbuffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netQueryDisplayInformation((servername?.value ?: 0L).toString(), level.toInt(), index.toInt(), entriesrequested.toInt(), preferredmaximumlength.toInt(), (returnedentrycount?.value ?: 0L).toString(), (sortedbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netQueryServiceAccount(servername: Pcwstr, accountname: Pcwstr, infolevel: UInt, buffer: COpaquePointer?): Ntstatus =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netQueryServiceAccount((servername?.value ?: 0L).toString(), (accountname?.value ?: 0L).toString(), infolevel.toInt(), (buffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netRemoteComputerSupports(uncservername: Pcwstr, optionswanted: NetRemoteComputerSupportsOptions, optionssupported: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netRemoteComputerSupports((uncservername?.value ?: 0L).toString(), optionswanted.toInt(), (optionssupported?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netRemoteTOD(uncservername: Pcwstr, bufferptr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netRemoteTOD((uncservername?.value ?: 0L).toString(), (bufferptr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netRemoveAlternateComputerName(server: Pcwstr, alternatename: Pcwstr, domainaccount: Pcwstr, domainaccountpassword: Pcwstr, reserved: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netRemoveAlternateComputerName((server?.value ?: 0L).toString(), (alternatename?.value ?: 0L).toString(), (domainaccount?.value ?: 0L).toString(), (domainaccountpassword?.value ?: 0L).toString(), reserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netRemoveServiceAccount(servername: Pcwstr, accountname: Pcwstr, flags: UInt): Ntstatus =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netRemoveServiceAccount((servername?.value ?: 0L).toString(), (accountname?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netRenameMachineInDomain(lpserver: Pcwstr, lpnewmachinename: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, frenameoptions: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netRenameMachineInDomain((lpserver?.value ?: 0L).toString(), (lpnewmachinename?.value ?: 0L).toString(), (lpaccount?.value ?: 0L).toString(), (lppassword?.value ?: 0L).toString(), frenameoptions.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplExportDirAdd(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirAdd((servername?.value ?: 0L).toString(), level.toInt(), (buf?.value ?: 0L).toString(), (parmErr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplExportDirDel(servername: Pcwstr, dirname: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirDel((servername?.value ?: 0L).toString(), (dirname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplExportDirEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumehandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirEnum((servername?.value ?: 0L).toString(), level.toInt(), (bufptr?.value ?: 0L).toString(), prefmaxlen.toInt(), (entriesread?.value ?: 0L).toString(), (totalentries?.value ?: 0L).toString(), (resumehandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplExportDirGetInfo(servername: Pcwstr, dirname: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirGetInfo((servername?.value ?: 0L).toString(), (dirname?.value ?: 0L).toString(), level.toInt(), (bufptr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplExportDirLock(servername: Pcwstr, dirname: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirLock((servername?.value ?: 0L).toString(), (dirname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplExportDirSetInfo(servername: Pcwstr, dirname: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirSetInfo((servername?.value ?: 0L).toString(), (dirname?.value ?: 0L).toString(), level.toInt(), (buf?.value ?: 0L).toString(), (parmErr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplExportDirUnlock(servername: Pcwstr, dirname: Pcwstr, unlockforce: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netReplExportDirUnlock((servername?.value ?: 0L).toString(), (dirname?.value ?: 0L).toString(), unlockforce.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplGetInfo(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netReplGetInfo((servername?.value ?: 0L).toString(), level.toInt(), (bufptr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplImportDirAdd(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netReplImportDirAdd((servername?.value ?: 0L).toString(), level.toInt(), (buf?.value ?: 0L).toString(), (parmErr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplImportDirDel(servername: Pcwstr, dirname: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netReplImportDirDel((servername?.value ?: 0L).toString(), (dirname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplImportDirEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumehandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netReplImportDirEnum((servername?.value ?: 0L).toString(), level.toInt(), (bufptr?.value ?: 0L).toString(), prefmaxlen.toInt(), (entriesread?.value ?: 0L).toString(), (totalentries?.value ?: 0L).toString(), (resumehandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplImportDirGetInfo(servername: Pcwstr, dirname: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netReplImportDirGetInfo((servername?.value ?: 0L).toString(), (dirname?.value ?: 0L).toString(), level.toInt(), (bufptr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplImportDirLock(servername: Pcwstr, dirname: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netReplImportDirLock((servername?.value ?: 0L).toString(), (dirname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplImportDirUnlock(servername: Pcwstr, dirname: Pcwstr, unlockforce: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netReplImportDirUnlock((servername?.value ?: 0L).toString(), (dirname?.value ?: 0L).toString(), unlockforce.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplSetInfo(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netReplSetInfo((servername?.value ?: 0L).toString(), level.toInt(), (buf?.value ?: 0L).toString(), (parmErr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netRequestOfflineDomainJoin(pprovisionbindata: COpaquePointer?, cbprovisionbindatasize: UInt, dwoptions: NetRequestProvisionOptions, lpwindowspath: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netRequestOfflineDomainJoin((pprovisionbindata?.value ?: 0L).toString(), cbprovisionbindatasize.toInt(), dwoptions.toInt(), (lpwindowspath?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netRequestProvisioningPackageInstall(ppackagebindata: COpaquePointer?, dwpackagebindatasize: UInt, dwprovisionoptions: NetRequestProvisionOptions, lpwindowspath: Pcwstr, pvreserved: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netRequestProvisioningPackageInstall((ppackagebindata?.value ?: 0L).toString(), dwpackagebindatasize.toInt(), dwprovisionoptions.toInt(), (lpwindowspath?.value ?: 0L).toString(), (pvreserved?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netScheduleJobAdd(servername: Pcwstr, buffer: COpaquePointer?, jobid: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netScheduleJobAdd((servername?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (jobid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netScheduleJobDel(servername: Pcwstr, minjobid: UInt, maxjobid: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netScheduleJobDel((servername?.value ?: 0L).toString(), minjobid.toInt(), maxjobid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netScheduleJobEnum(servername: Pcwstr, pointertobuffer: COpaquePointer?, prefferedmaximumlength: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumehandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netScheduleJobEnum((servername?.value ?: 0L).toString(), (pointertobuffer?.value ?: 0L).toString(), prefferedmaximumlength.toInt(), (entriesread?.value ?: 0L).toString(), (totalentries?.value ?: 0L).toString(), (resumehandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netScheduleJobGetInfo(servername: Pcwstr, jobid: UInt, pointertobuffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netScheduleJobGetInfo((servername?.value ?: 0L).toString(), jobid.toInt(), (pointertobuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerComputerNameAdd(servername: Pcwstr, emulateddomainname: Pcwstr, emulatedservername: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netServerComputerNameAdd((servername?.value ?: 0L).toString(), (emulateddomainname?.value ?: 0L).toString(), (emulatedservername?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerComputerNameDel(servername: Pcwstr, emulatedservername: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netServerComputerNameDel((servername?.value ?: 0L).toString(), (emulatedservername?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerDiskEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netServerDiskEnum((servername?.value ?: 0L).toString(), level.toInt(), (bufptr?.value ?: 0L).toString(), prefmaxlen.toInt(), (entriesread?.value ?: 0L).toString(), (totalentries?.value ?: 0L).toString(), (resumeHandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, servertype: NetServerType, domain: Pcwstr, resumeHandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netServerEnum((servername?.value ?: 0L).toString(), level.toInt(), (bufptr?.value ?: 0L).toString(), prefmaxlen.toInt(), (entriesread?.value ?: 0L).toString(), (totalentries?.value ?: 0L).toString(), servertype.toInt(), (domain?.value ?: 0L).toString(), (resumeHandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerGetInfo(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netServerGetInfo((servername?.value ?: 0L).toString(), level.toInt(), (bufptr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerSetInfo(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmerror: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netServerSetInfo((servername?.value ?: 0L).toString(), level.toInt(), (buf?.value ?: 0L).toString(), (parmerror?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerTransportAdd(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netServerTransportAdd((servername?.value ?: 0L).toString(), level.toInt(), (bufptr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerTransportAddEx(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netServerTransportAddEx((servername?.value ?: 0L).toString(), level.toInt(), (bufptr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerTransportDel(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netServerTransportDel((servername?.value ?: 0L).toString(), level.toInt(), (bufptr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerTransportEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netServerTransportEnum((servername?.value ?: 0L).toString(), level.toInt(), (bufptr?.value ?: 0L).toString(), prefmaxlen.toInt(), (entriesread?.value ?: 0L).toString(), (totalentries?.value ?: 0L).toString(), (resumeHandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServiceControl(servername: Pcwstr, service: Pcwstr, opcode: UInt, arg: UInt, bufptr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netServiceControl((servername?.value ?: 0L).toString(), (service?.value ?: 0L).toString(), opcode.toInt(), arg.toInt(), (bufptr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServiceEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netServiceEnum((servername?.value ?: 0L).toString(), level.toInt(), (bufptr?.value ?: 0L).toString(), prefmaxlen.toInt(), (entriesread?.value ?: 0L).toString(), (totalentries?.value ?: 0L).toString(), (resumeHandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServiceGetInfo(servername: Pcwstr, service: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netServiceGetInfo((servername?.value ?: 0L).toString(), (service?.value ?: 0L).toString(), level.toInt(), (bufptr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServiceInstall(servername: Pcwstr, service: Pcwstr, argc: UInt, argv: COpaquePointer?, bufptr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netServiceInstall((servername?.value ?: 0L).toString(), (service?.value ?: 0L).toString(), argc.toInt(), (argv?.value ?: 0L).toString(), (bufptr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netSetPrimaryComputerName(server: Pcwstr, primaryname: Pcwstr, domainaccount: Pcwstr, domainaccountpassword: Pcwstr, reserved: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netSetPrimaryComputerName((server?.value ?: 0L).toString(), (primaryname?.value ?: 0L).toString(), (domainaccount?.value ?: 0L).toString(), (domainaccountpassword?.value ?: 0L).toString(), reserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUnjoinDomain(lpserver: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, funjoinoptions: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netUnjoinDomain((lpserver?.value ?: 0L).toString(), (lpaccount?.value ?: 0L).toString(), (lppassword?.value ?: 0L).toString(), funjoinoptions.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUseAdd(servername: COpaquePointer?, levelflags: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netUseAdd((servername?.value ?: 0L).toString(), levelflags.toInt(), (buf?.value ?: 0L).toString(), (parmErr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUseDel(uncservername: Pcwstr, usename: Pcwstr, forcelevelflags: ForceLevelFlags): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netUseDel((uncservername?.value ?: 0L).toString(), (usename?.value ?: 0L).toString(), forcelevelflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUseEnum(uncservername: Pcwstr, levelflags: UInt, bufptr: COpaquePointer?, preferedmaximumsize: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumehandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netUseEnum((uncservername?.value ?: 0L).toString(), levelflags.toInt(), (bufptr?.value ?: 0L).toString(), preferedmaximumsize.toInt(), (entriesread?.value ?: 0L).toString(), (totalentries?.value ?: 0L).toString(), (resumehandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUseGetInfo(uncservername: Pcwstr, usename: Pcwstr, levelflags: UInt, bufptr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netUseGetInfo((uncservername?.value ?: 0L).toString(), (usename?.value ?: 0L).toString(), levelflags.toInt(), (bufptr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUserAdd(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netUserAdd((servername?.value ?: 0L).toString(), level.toInt(), (buf?.value ?: 0L).toString(), (parmErr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUserChangePassword(domainname: Pcwstr, username: Pcwstr, oldpassword: Pcwstr, newpassword: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netUserChangePassword((domainname?.value ?: 0L).toString(), (username?.value ?: 0L).toString(), (oldpassword?.value ?: 0L).toString(), (newpassword?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUserDel(servername: Pcwstr, username: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netUserDel((servername?.value ?: 0L).toString(), (username?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUserEnum(servername: Pcwstr, level: UInt, filter: NetUserEnumFilterFlags, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netUserEnum((servername?.value ?: 0L).toString(), level.toInt(), filter.toInt(), (bufptr?.value ?: 0L).toString(), prefmaxlen.toInt(), (entriesread?.value ?: 0L).toString(), (totalentries?.value ?: 0L).toString(), (resumeHandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUserGetGroups(servername: Pcwstr, username: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netUserGetGroups((servername?.value ?: 0L).toString(), (username?.value ?: 0L).toString(), level.toInt(), (bufptr?.value ?: 0L).toString(), prefmaxlen.toInt(), (entriesread?.value ?: 0L).toString(), (totalentries?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUserGetInfo(servername: Pcwstr, username: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netUserGetInfo((servername?.value ?: 0L).toString(), (username?.value ?: 0L).toString(), level.toInt(), (bufptr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUserGetLocalGroups(servername: Pcwstr, username: Pcwstr, level: UInt, flags: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netUserGetLocalGroups((servername?.value ?: 0L).toString(), (username?.value ?: 0L).toString(), level.toInt(), flags.toInt(), (bufptr?.value ?: 0L).toString(), prefmaxlen.toInt(), (entriesread?.value ?: 0L).toString(), (totalentries?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUserModalsGet(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netUserModalsGet((servername?.value ?: 0L).toString(), level.toInt(), (bufptr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUserModalsSet(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netUserModalsSet((servername?.value ?: 0L).toString(), level.toInt(), (buf?.value ?: 0L).toString(), (parmErr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUserSetGroups(servername: Pcwstr, username: Pcwstr, level: UInt, buf: COpaquePointer?, numEntries: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netUserSetGroups((servername?.value ?: 0L).toString(), (username?.value ?: 0L).toString(), level.toInt(), (buf?.value ?: 0L).toString(), numEntries.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUserSetInfo(servername: Pcwstr, username: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netUserSetInfo((servername?.value ?: 0L).toString(), (username?.value ?: 0L).toString(), level.toInt(), (buf?.value ?: 0L).toString(), (parmErr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netValidateName(lpserver: Pcwstr, lpname: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, nametype: NetsetupNameType): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netValidateName((lpserver?.value ?: 0L).toString(), (lpname?.value ?: 0L).toString(), (lpaccount?.value ?: 0L).toString(), (lppassword?.value ?: 0L).toString(), nametype).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netValidatePasswordPolicy(servername: Pcwstr, qualifier: COpaquePointer?, validationtype: NetValidatePasswordType, inputarg: COpaquePointer?, outputarg: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netValidatePasswordPolicy((servername?.value ?: 0L).toString(), (qualifier?.value ?: 0L).toString(), validationtype, (inputarg?.value ?: 0L).toString(), (outputarg?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netValidatePasswordPolicyFree(outputarg: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netValidatePasswordPolicyFree((outputarg?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netWkstaGetInfo(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netWkstaGetInfo((servername?.value ?: 0L).toString(), level.toInt(), (bufptr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netWkstaSetInfo(servername: Pcwstr, level: UInt, buffer: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netWkstaSetInfo((servername?.value ?: 0L).toString(), level.toInt(), (buffer?.value ?: 0L).toString(), (parmErr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netWkstaTransportAdd(servername: COpaquePointer?, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netWkstaTransportAdd((servername?.value ?: 0L).toString(), level.toInt(), (buf?.value ?: 0L).toString(), (parmErr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netWkstaTransportDel(servername: Pcwstr, transportname: Pcwstr, ucond: ForceLevelFlags): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netWkstaTransportDel((servername?.value ?: 0L).toString(), (transportname?.value ?: 0L).toString(), ucond.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netWkstaTransportEnum(servername: COpaquePointer?, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netWkstaTransportEnum((servername?.value ?: 0L).toString(), level.toInt(), (bufptr?.value ?: 0L).toString(), prefmaxlen.toInt(), (entriesread?.value ?: 0L).toString(), (totalentries?.value ?: 0L).toString(), (resumeHandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netWkstaUserEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumehandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netWkstaUserEnum((servername?.value ?: 0L).toString(), level.toInt(), (bufptr?.value ?: 0L).toString(), prefmaxlen.toInt(), (entriesread?.value ?: 0L).toString(), (totalentries?.value ?: 0L).toString(), (resumehandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netWkstaUserGetInfo(reserved: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netWkstaUserGetInfo((reserved?.value ?: 0L).toString(), level.toInt(), (bufptr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netWkstaUserSetInfo(reserved: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_netWkstaUserSetInfo((reserved?.value ?: 0L).toString(), level.toInt(), (buf?.value ?: 0L).toString(), (parmErr?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun routerAssert(pszfailedassertion: Pcstr, pszfilename: Pcstr, dwlinenumber: UInt, pszmessage: Pcstr) {
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_netmanagement_routerAssert((pszfailedassertion?.value ?: 0L).toString(), (pszfilename?.value ?: 0L).toString(), dwlinenumber.toInt(), (pszmessage?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerGetErrorStringA(dwerrorcode: UInt, lplpszerrorstring: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_routerGetErrorStringA(dwerrorcode.toInt(), (lplpszerrorstring?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun routerGetErrorStringW(dwerrorcode: UInt, lplpwszerrorstring: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_routerGetErrorStringW(dwerrorcode.toInt(), (lplpwszerrorstring?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun routerLogDeregisterA(hloghandle: Handle) {
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_netmanagement_routerLogDeregisterA((hloghandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerLogDeregisterW(hloghandle: Handle) {
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_netmanagement_routerLogDeregisterW((hloghandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerLogEventA(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: COpaquePointer?, dwerrorcode: UInt) {
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventA((hloghandle?.value ?: 0L).toString(), dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), (plpszsubstringarray?.value ?: 0L).toString(), dwerrorcode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerLogEventDataA(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: COpaquePointer?, dwdatabytes: UInt, lpdatabytes: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventDataA((hloghandle?.value ?: 0L).toString(), dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), (plpszsubstringarray?.value ?: 0L).toString(), dwdatabytes.toInt(), (lpdatabytes?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerLogEventDataW(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: COpaquePointer?, dwdatabytes: UInt, lpdatabytes: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventDataW((hloghandle?.value ?: 0L).toString(), dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), (plpszsubstringarray?.value ?: 0L).toString(), dwdatabytes.toInt(), (lpdatabytes?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerLogEventExA(hloghandle: Handle, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: Pcstr, vararg variadicArgs: Long) {
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventExA((hloghandle?.value ?: 0L).toString(), dweventtype.toInt(), dwerrorcode.toInt(), dwmessageid.toInt(), (ptszformat?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerLogEventExW(hloghandle: Handle, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: Pcwstr, vararg variadicArgs: Long) {
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventExW((hloghandle?.value ?: 0L).toString(), dweventtype.toInt(), dwerrorcode.toInt(), dwmessageid.toInt(), (ptszformat?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerLogEventStringA(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: COpaquePointer?, dwerrorcode: UInt, dwerrorindex: UInt) {
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventStringA((hloghandle?.value ?: 0L).toString(), dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), (plpszsubstringarray?.value ?: 0L).toString(), dwerrorcode.toInt(), dwerrorindex.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerLogEventStringW(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: COpaquePointer?, dwerrorcode: UInt, dwerrorindex: UInt) {
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventStringW((hloghandle?.value ?: 0L).toString(), dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), (plpszsubstringarray?.value ?: 0L).toString(), dwerrorcode.toInt(), dwerrorindex.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerLogEventValistExA(hloghandle: Handle, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: Pcstr, arglist: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventValistExA((hloghandle?.value ?: 0L).toString(), dweventtype.toInt(), dwerrorcode.toInt(), dwmessageid.toInt(), (ptszformat?.value ?: 0L).toString(), (arglist?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerLogEventValistExW(hloghandle: Handle, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: Pcwstr, arglist: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventValistExW((hloghandle?.value ?: 0L).toString(), dweventtype.toInt(), dwerrorcode.toInt(), dwmessageid.toInt(), (ptszformat?.value ?: 0L).toString(), (arglist?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerLogEventW(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: COpaquePointer?, dwerrorcode: UInt) {
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_netmanagement_routerLogEventW((hloghandle?.value ?: 0L).toString(), dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), (plpszsubstringarray?.value ?: 0L).toString(), dwerrorcode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerLogRegisterA(lpszsource: Pcstr): Handle =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_routerLogRegisterA((lpszsource?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun routerLogRegisterW(lpszsource: Pcwstr): Handle =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_routerLogRegisterW((lpszsource?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setNetScheduleAccountInformation(pwszservername: Pcwstr, pwszaccount: Pcwstr, pwszpassword: Pcwstr): Hresult =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_setNetScheduleAccountInformation((pwszservername?.value ?: 0L).toString(), (pwszaccount?.value ?: 0L).toString(), (pwszpassword?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceDeregisterA(dwtraceid: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_traceDeregisterA(dwtraceid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceDeregisterExA(dwtraceid: UInt, dwflags: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_traceDeregisterExA(dwtraceid.toInt(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceDeregisterExW(dwtraceid: UInt, dwflags: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_traceDeregisterExW(dwtraceid.toInt(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceDeregisterW(dwtraceid: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_traceDeregisterW(dwtraceid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceDumpExA(dwtraceid: UInt, dwflags: UInt, lpbbytes: COpaquePointer?, dwbytecount: UInt, dwgroupsize: UInt, baddressprefix: Bool, lpszprefix: Pcstr): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_traceDumpExA(dwtraceid.toInt(), dwflags.toInt(), (lpbbytes?.value ?: 0L).toString(), dwbytecount.toInt(), dwgroupsize.toInt(), baddressprefix, (lpszprefix?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceDumpExW(dwtraceid: UInt, dwflags: UInt, lpbbytes: COpaquePointer?, dwbytecount: UInt, dwgroupsize: UInt, baddressprefix: Bool, lpszprefix: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_traceDumpExW(dwtraceid.toInt(), dwflags.toInt(), (lpbbytes?.value ?: 0L).toString(), dwbytecount.toInt(), dwgroupsize.toInt(), baddressprefix, (lpszprefix?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceGetConsoleA(dwtraceid: UInt, lphconsole: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_traceGetConsoleA(dwtraceid.toInt(), (lphconsole?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceGetConsoleW(dwtraceid: UInt, lphconsole: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_traceGetConsoleW(dwtraceid.toInt(), (lphconsole?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tracePrintfA(dwtraceid: UInt, lpszformat: Pcstr, vararg variadicArgs: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_tracePrintfA(dwtraceid.toInt(), (lpszformat?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tracePrintfExA(dwtraceid: UInt, dwflags: UInt, lpszformat: Pcstr, vararg variadicArgs: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_tracePrintfExA(dwtraceid.toInt(), dwflags.toInt(), (lpszformat?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tracePrintfExW(dwtraceid: UInt, dwflags: UInt, lpszformat: Pcwstr, vararg variadicArgs: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_tracePrintfExW(dwtraceid.toInt(), dwflags.toInt(), (lpszformat?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tracePrintfW(dwtraceid: UInt, lpszformat: Pcwstr, vararg variadicArgs: Long): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_tracePrintfW(dwtraceid.toInt(), (lpszformat?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tracePutsExA(dwtraceid: UInt, dwflags: UInt, lpszstring: Pcstr): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_tracePutsExA(dwtraceid.toInt(), dwflags.toInt(), (lpszstring?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tracePutsExW(dwtraceid: UInt, dwflags: UInt, lpszstring: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_tracePutsExW(dwtraceid.toInt(), dwflags.toInt(), (lpszstring?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceRegisterExA(lpszcallername: Pcstr, dwflags: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_traceRegisterExA((lpszcallername?.value ?: 0L).toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceRegisterExW(lpszcallername: Pcwstr, dwflags: UInt): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_traceRegisterExW((lpszcallername?.value ?: 0L).toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceVprintfExA(dwtraceid: UInt, dwflags: UInt, lpszformat: Pcstr, arglist: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_traceVprintfExA(dwtraceid.toInt(), dwflags.toInt(), (lpszformat?.value ?: 0L).toString(), (arglist?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceVprintfExW(dwtraceid: UInt, dwflags: UInt, lpszformat: Pcwstr, arglist: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetmanagementNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_netmanagement_traceVprintfExW(dwtraceid.toInt(), dwflags.toInt(), (lpszformat?.value ?: 0L).toString(), (arglist?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
