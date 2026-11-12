@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32NetworkmanagementNetmanagementNapiAddon(): Boolean

private val windowsWin32NetworkmanagementNetmanagementNapiAvailable: Boolean = initWindowsWin32NetworkmanagementNetmanagementNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementGetNetScheduleAccountInformation(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementGetNetScheduleAccountInformation(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementINetLogonControl2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementINetLogonControl2(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementLogErrorA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementLogErrorA(p0: Int, p1: Int, p2: String, p3: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementLogErrorW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementLogErrorW(p0: Int, p1: Int, p2: String, p3: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementLogEventA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementLogEventA(p0: Int, p1: Int, p2: Int, p3: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementLogEventW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementLogEventW(p0: Int, p1: Int, p2: Int, p3: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementMprSetupProtocolEnum(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementMprSetupProtocolEnum(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementMprSetupProtocolFree(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementMprSetupProtocolFree(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessAdd(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetAccessAdd(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessDel(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetAccessDel(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessEnum(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetAccessEnum(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessGetInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetAccessGetInfo(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessGetUserPerms(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetAccessGetUserPerms(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetAccessSetInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetAccessSetInfo(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetAddAlternateComputerName(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetAddAlternateComputerName(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetAddServiceAccount(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetAddServiceAccount(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetAlertRaise(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetAlertRaise(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetAlertRaiseEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetAlertRaiseEx(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetApiBufferAllocate(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetApiBufferAllocate(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetApiBufferFree(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetApiBufferFree(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetApiBufferReallocate(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetApiBufferReallocate(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetApiBufferSize(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetApiBufferSize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetAuditClear(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetAuditClear(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetAuditRead(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetAuditRead(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: Int, p7: String, p8: Int, p9: String, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetAuditWrite(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetAuditWrite(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetConfigGet(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetConfigGet(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetConfigGetAll(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetConfigGetAll(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetConfigSet(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetConfigSet(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetCreateProvisioningPackage(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetCreateProvisioningPackage(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetEnumerateComputerNames(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetEnumerateComputerNames(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetEnumerateServiceAccounts(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetEnumerateServiceAccounts(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetErrorLogClear(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetErrorLogClear(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetErrorLogRead(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetErrorLogRead(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: Int, p7: String, p8: Int, p9: String, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetErrorLogWrite(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetErrorLogWrite(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetFreeAadJoinInformation(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetFreeAadJoinInformation(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetGetAadJoinInformation(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetGetAadJoinInformation(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetGetAnyDCName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetGetAnyDCName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetGetDCName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetGetDCName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetGetDisplayInformationIndex(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetGetDisplayInformationIndex(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetGetJoinInformation(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetGetJoinInformation(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetGetJoinableOUs(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetGetJoinableOUs(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupAdd(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetGroupAdd(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupAddUser(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetGroupAddUser(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupDel(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetGroupDel(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupDelUser(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetGroupDelUser(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupEnum(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetGroupEnum(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupGetInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetGroupGetInfo(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupGetUsers(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetGroupGetUsers(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupSetInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetGroupSetInfo(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetGroupSetUsers(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetGroupSetUsers(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetIsServiceAccount(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetIsServiceAccount(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetJoinDomain(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetJoinDomain(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupAdd(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupAdd(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupAddMember(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupAddMember(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupAddMembers(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupAddMembers(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupDel(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupDel(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupDelMember(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupDelMember(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupDelMembers(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupDelMembers(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupEnum(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupEnum(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupGetInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupGetInfo(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupGetMembers(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupGetMembers(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupSetInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupSetInfo(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupSetMembers(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupSetMembers(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetMessageBufferSend(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetMessageBufferSend(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetMessageNameAdd(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetMessageNameAdd(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetMessageNameDel(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetMessageNameDel(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetMessageNameEnum(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetMessageNameEnum(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetMessageNameGetInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetMessageNameGetInfo(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetProvisionComputerAccount(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetProvisionComputerAccount(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetQueryDisplayInformation(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetQueryDisplayInformation(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetQueryServiceAccount(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetQueryServiceAccount(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetRemoteComputerSupports(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetRemoteComputerSupports(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetRemoteTOD(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetRemoteTOD(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetRemoveAlternateComputerName(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetRemoveAlternateComputerName(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetRemoveServiceAccount(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetRemoveServiceAccount(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetRenameMachineInDomain(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetRenameMachineInDomain(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirAdd(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirAdd(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirDel(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirDel(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirEnum(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirEnum(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirGetInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirGetInfo(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirLock(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirLock(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirSetInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirSetInfo(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirUnlock(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirUnlock(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplGetInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetReplGetInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirAdd(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirAdd(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirDel(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirDel(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirEnum(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirEnum(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirGetInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirGetInfo(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirLock(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirLock(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirUnlock(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirUnlock(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetReplSetInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetReplSetInfo(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetRequestOfflineDomainJoin(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetRequestOfflineDomainJoin(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetRequestProvisioningPackageInstall(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetRequestProvisioningPackageInstall(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetScheduleJobAdd(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetScheduleJobAdd(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetScheduleJobDel(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetScheduleJobDel(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetScheduleJobEnum(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetScheduleJobEnum(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetScheduleJobGetInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetScheduleJobGetInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetServerComputerNameAdd(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetServerComputerNameAdd(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetServerComputerNameDel(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetServerComputerNameDel(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetServerDiskEnum(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetServerDiskEnum(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetServerEnum(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetServerEnum(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetServerGetInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetServerGetInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetServerSetInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetServerSetInfo(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetServerTransportAdd(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetServerTransportAdd(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetServerTransportAddEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetServerTransportAddEx(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetServerTransportDel(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetServerTransportDel(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetServerTransportEnum(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetServerTransportEnum(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetServiceControl(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetServiceControl(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetServiceEnum(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetServiceEnum(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetServiceGetInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetServiceGetInfo(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetServiceInstall(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetServiceInstall(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetSetPrimaryComputerName(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetSetPrimaryComputerName(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetUnjoinDomain(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetUnjoinDomain(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetUseAdd(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetUseAdd(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetUseDel(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetUseDel(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetUseEnum(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetUseEnum(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetUseGetInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetUseGetInfo(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetUserAdd(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetUserAdd(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetUserChangePassword(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetUserChangePassword(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetUserDel(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetUserDel(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetUserEnum(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetUserEnum(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetUserGetGroups(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetUserGetGroups(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetUserGetInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetUserGetInfo(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetUserGetLocalGroups(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetUserGetLocalGroups(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetUserModalsGet(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetUserModalsGet(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetUserModalsSet(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetUserModalsSet(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetUserSetGroups(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetUserSetGroups(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetUserSetInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetUserSetInfo(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetValidateName(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetValidateName(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetValidatePasswordPolicy(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetValidatePasswordPolicy(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetValidatePasswordPolicyFree(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetValidatePasswordPolicyFree(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaGetInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaGetInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaSetInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaSetInfo(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaTransportAdd(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaTransportAdd(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaTransportDel(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaTransportDel(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaTransportEnum(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaTransportEnum(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaUserEnum(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaUserEnum(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaUserGetInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaUserGetInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaUserSetInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaUserSetInfo(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementRouterAssert(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementRouterAssert(p0: String, p1: String, p2: Int, p3: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementRouterGetErrorStringA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementRouterGetErrorStringA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementRouterGetErrorStringW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementRouterGetErrorStringW(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogDeregisterA(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementRouterLogDeregisterA(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogDeregisterW(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementRouterLogDeregisterW(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventA(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventDataA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventDataA(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventDataW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventDataW(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventExA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventExA(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String, p9: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventExW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventExW(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String, p9: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventStringA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventStringA(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: Int)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventStringW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventStringW(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: Int)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventValistExA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventValistExA(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventValistExW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventValistExW(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventW(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogRegisterA(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementRouterLogRegisterA(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementRouterLogRegisterW(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementRouterLogRegisterW(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementSetNetScheduleAccountInformation(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementSetNetScheduleAccountInformation(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterA(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterA(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterExA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterExA(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterExW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterExW(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterW(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterW(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementTraceDumpExA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementTraceDumpExA(p0: Int, p1: Int, p2: String, p3: Int, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementTraceDumpExW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementTraceDumpExW(p0: Int, p1: Int, p2: String, p3: Int, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementTraceGetConsoleA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementTraceGetConsoleA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementTraceGetConsoleW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementTraceGetConsoleW(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementTracePrintfA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementTracePrintfA(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementTracePrintfExA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementTracePrintfExA(p0: Int, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementTracePrintfExW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementTracePrintfExW(p0: Int, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementTracePrintfW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementTracePrintfW(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementTracePutsExA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementTracePutsExA(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementTracePutsExW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementTracePutsExW(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementTraceRegisterExA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementTraceRegisterExA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementTraceRegisterExW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementTraceRegisterExW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementTraceVprintfExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementTraceVprintfExA(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetmanagementTraceVprintfExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetmanagementTraceVprintfExW(p0: Int, p1: Int, p2: String, p3: String): Int

public actual fun getNetScheduleAccountInformation(pwszservername: Pcwstr, ccaccount: UInt, wszaccount: Pwstr): Hresult =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementGetNetScheduleAccountInformation(pwszservername.rawAddress.toString(), ccaccount.toInt(), wszaccount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iNetLogonControl2(servername: Pcwstr, functioncode: UInt, querylevel: UInt, data: ConstPtr<UByte>, buffer: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementINetLogonControl2(servername.rawAddress.toString(), functioncode.toInt(), querylevel.toInt(), data.rawAddress.toString(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun logErrorA(dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: ConstPtr<Pcstr>, dwerrorcode: UInt) {
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementNetmanagementLogErrorA(dwmessageid.toInt(), cnumberofsubstrings.toInt(), plpwssubstrings.rawAddress.toString(), dwerrorcode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun logErrorW(dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: ConstPtr<Pcwstr>, dwerrorcode: UInt) {
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementNetmanagementLogErrorW(dwmessageid.toInt(), cnumberofsubstrings.toInt(), plpwssubstrings.rawAddress.toString(), dwerrorcode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun logEventA(weventtype: UInt, dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: ConstPtr<Pcstr>) {
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementNetmanagementLogEventA(weventtype.toInt(), dwmessageid.toInt(), cnumberofsubstrings.toInt(), plpwssubstrings.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun logEventW(weventtype: UInt, dwmessageid: UInt, cnumberofsubstrings: UInt, plpwssubstrings: ConstPtr<Pcwstr>) {
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementNetmanagementLogEventW(weventtype.toInt(), dwmessageid.toInt(), cnumberofsubstrings.toInt(), plpwssubstrings.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mprSetupProtocolEnum(dwtransportid: UInt, lplpbuffer: MutPtr<MutPtr<UByte>>, lpdwentriesread: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementMprSetupProtocolEnum(dwtransportid.toInt(), lplpbuffer.rawAddress.toString(), lpdwentriesread.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mprSetupProtocolFree(lpbuffer: MutPtr<CVoid>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementMprSetupProtocolFree(lpbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAccessAdd(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetAccessAdd(servername.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), parmErr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAccessDel(servername: Pcwstr, resource: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetAccessDel(servername.rawAddress.toString(), resource.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAccessEnum(servername: Pcwstr, basepath: Pcwstr, recursive: UInt, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetAccessEnum(servername.rawAddress.toString(), basepath.rawAddress.toString(), recursive.toInt(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumeHandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAccessGetInfo(servername: Pcwstr, resource: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetAccessGetInfo(servername.rawAddress.toString(), resource.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAccessGetUserPerms(servername: Pcwstr, ugname: Pcwstr, resource: Pcwstr, perms: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetAccessGetUserPerms(servername.rawAddress.toString(), ugname.rawAddress.toString(), resource.rawAddress.toString(), perms.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAccessSetInfo(servername: Pcwstr, resource: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetAccessSetInfo(servername.rawAddress.toString(), resource.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), parmErr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAddAlternateComputerName(server: Pcwstr, alternatename: Pcwstr, domainaccount: Pcwstr, domainaccountpassword: Pcwstr, reserved: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetAddAlternateComputerName(server.rawAddress.toString(), alternatename.rawAddress.toString(), domainaccount.rawAddress.toString(), domainaccountpassword.rawAddress.toString(), reserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAddServiceAccount(servername: Pcwstr, accountname: Pcwstr, password: Pcwstr, flags: UInt): Ntstatus =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetAddServiceAccount(servername.rawAddress.toString(), accountname.rawAddress.toString(), password.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAlertRaise(alerttype: Pcwstr, buffer: ConstPtr<CVoid>, buffersize: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetAlertRaise(alerttype.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAlertRaiseEx(alerttype: Pcwstr, variableinfo: ConstPtr<CVoid>, variableinfosize: UInt, servicename: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetAlertRaiseEx(alerttype.rawAddress.toString(), variableinfo.rawAddress.toString(), variableinfosize.toInt(), servicename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netApiBufferAllocate(bytecount: UInt, buffer: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetApiBufferAllocate(bytecount.toInt(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netApiBufferFree(buffer: ConstPtr<CVoid>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetApiBufferFree(buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netApiBufferReallocate(oldbuffer: ConstPtr<CVoid>, newbytecount: UInt, newbuffer: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetApiBufferReallocate(oldbuffer.rawAddress.toString(), newbytecount.toInt(), newbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netApiBufferSize(buffer: ConstPtr<CVoid>, bytecount: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetApiBufferSize(buffer.rawAddress.toString(), bytecount.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAuditClear(server: Pcwstr, backupfile: Pcwstr, service: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetAuditClear(server.rawAddress.toString(), backupfile.rawAddress.toString(), service.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAuditRead(server: Pcwstr, service: Pcwstr, auditloghandle: MutPtr<Hlog>, offset: UInt, reserved1: MutPtr<UInt>, reserved2: UInt, offsetflag: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, bytesread: MutPtr<UInt>, totalavailable: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetAuditRead(server.rawAddress.toString(), service.rawAddress.toString(), auditloghandle.rawAddress.toString(), offset.toInt(), reserved1.rawAddress.toString(), reserved2.toInt(), offsetflag.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), bytesread.rawAddress.toString(), totalavailable.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netAuditWrite(type: UInt, buf: MutPtr<UByte>, numbytes: UInt, service: Pcwstr, reserved: MutPtr<UByte>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetAuditWrite(type.toInt(), buf.rawAddress.toString(), numbytes.toInt(), service.rawAddress.toString(), reserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netConfigGet(server: Pcwstr, component: Pcwstr, parameter: Pcwstr, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetConfigGet(server.rawAddress.toString(), component.rawAddress.toString(), parameter.rawAddress.toString(), bufptr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netConfigGetAll(server: Pcwstr, component: Pcwstr, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetConfigGetAll(server.rawAddress.toString(), component.rawAddress.toString(), bufptr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netConfigSet(server: Pcwstr, reserved1: Pcwstr, component: Pcwstr, level: UInt, reserved2: UInt, buf: MutPtr<UByte>, reserved3: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetConfigSet(server.rawAddress.toString(), reserved1.rawAddress.toString(), component.rawAddress.toString(), level.toInt(), reserved2.toInt(), buf.rawAddress.toString(), reserved3.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netCreateProvisioningPackage(pprovisioningparams: ConstPtr<NetsetupProvisioningParams>, pppackagebindata: MutPtr<MutPtr<UByte>>, pdwpackagebindatasize: MutPtr<UInt>, pppackagetextdata: MutPtr<Pwstr>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetCreateProvisioningPackage(pprovisioningparams.rawAddress.toString(), pppackagebindata.rawAddress.toString(), pdwpackagebindatasize.rawAddress.toString(), pppackagetextdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netEnumerateComputerNames(server: Pcwstr, nametype: NetComputerNameType, reserved: UInt, entrycount: MutPtr<UInt>, computernames: MutPtr<MutPtr<Pwstr>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetEnumerateComputerNames(server.rawAddress.toString(), nametype, reserved.toInt(), entrycount.rawAddress.toString(), computernames.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netEnumerateServiceAccounts(servername: Pcwstr, flags: UInt, accountscount: MutPtr<UInt>, accounts: MutPtr<MutPtr<MutPtr<UShort>>>): Ntstatus =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetEnumerateServiceAccounts(servername.rawAddress.toString(), flags.toInt(), accountscount.rawAddress.toString(), accounts.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netErrorLogClear(uncservername: Pcwstr, backupfile: Pcwstr, reserved: ConstPtr<UByte>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetErrorLogClear(uncservername.rawAddress.toString(), backupfile.rawAddress.toString(), reserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netErrorLogRead(uncservername: Pcwstr, reserved1: Pcwstr, errorloghandle: ConstPtr<Hlog>, offset: UInt, reserved2: ConstPtr<UInt>, reserved3: UInt, offsetflag: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxsize: UInt, bytesread: MutPtr<UInt>, totalavailable: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetErrorLogRead(uncservername.rawAddress.toString(), reserved1.rawAddress.toString(), errorloghandle.rawAddress.toString(), offset.toInt(), reserved2.rawAddress.toString(), reserved3.toInt(), offsetflag.toInt(), bufptr.rawAddress.toString(), prefmaxsize.toInt(), bytesread.rawAddress.toString(), totalavailable.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netErrorLogWrite(reserved1: ConstPtr<UByte>, code: UInt, component: Pcwstr, buffer: ConstPtr<UByte>, numbytes: UInt, msgbuf: ConstPtr<UByte>, strcount: UInt, reserved2: ConstPtr<UByte>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetErrorLogWrite(reserved1.rawAddress.toString(), code.toInt(), component.rawAddress.toString(), buffer.rawAddress.toString(), numbytes.toInt(), msgbuf.rawAddress.toString(), strcount.toInt(), reserved2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netFreeAadJoinInformation(pjoininfo: ConstPtr<DsregJoinInfo>) {
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetFreeAadJoinInformation(pjoininfo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun netGetAadJoinInformation(pcsztenantid: Pcwstr, ppjoininfo: MutPtr<MutPtr<DsregJoinInfo>>): Hresult =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetGetAadJoinInformation(pcsztenantid.rawAddress.toString(), ppjoininfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGetAnyDCName(servername: Pcwstr, domainname: Pcwstr, buffer: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetGetAnyDCName(servername.rawAddress.toString(), domainname.rawAddress.toString(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGetDCName(servername: Pcwstr, domainname: Pcwstr, buffer: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetGetDCName(servername.rawAddress.toString(), domainname.rawAddress.toString(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGetDisplayInformationIndex(servername: Pcwstr, level: UInt, prefix: Pcwstr, index: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetGetDisplayInformationIndex(servername.rawAddress.toString(), level.toInt(), prefix.rawAddress.toString(), index.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGetJoinInformation(lpserver: Pcwstr, lpnamebuffer: MutPtr<Pwstr>, buffertype: MutPtr<NetsetupJoinStatus>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetGetJoinInformation(lpserver.rawAddress.toString(), lpnamebuffer.rawAddress.toString(), buffertype.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGetJoinableOUs(lpserver: Pcwstr, lpdomain: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, oucount: MutPtr<UInt>, ous: MutPtr<MutPtr<Pwstr>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetGetJoinableOUs(lpserver.rawAddress.toString(), lpdomain.rawAddress.toString(), lpaccount.rawAddress.toString(), lppassword.rawAddress.toString(), oucount.rawAddress.toString(), ous.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGroupAdd(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetGroupAdd(servername.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), parmErr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGroupAddUser(servername: Pcwstr, groupname: Pcwstr, username: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetGroupAddUser(servername.rawAddress.toString(), groupname.rawAddress.toString(), username.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGroupDel(servername: Pcwstr, groupname: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetGroupDel(servername.rawAddress.toString(), groupname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGroupDelUser(servername: Pcwstr, groupname: Pcwstr, username: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetGroupDelUser(servername.rawAddress.toString(), groupname.rawAddress.toString(), username.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGroupEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<ULong>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetGroupEnum(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumeHandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGroupGetInfo(servername: Pcwstr, groupname: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetGroupGetInfo(servername.rawAddress.toString(), groupname.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGroupGetUsers(servername: Pcwstr, groupname: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumehandle: MutPtr<ULong>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetGroupGetUsers(servername.rawAddress.toString(), groupname.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumehandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGroupSetInfo(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetGroupSetInfo(servername.rawAddress.toString(), groupname.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), parmErr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netGroupSetUsers(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: ConstPtr<UByte>, totalentries: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetGroupSetUsers(servername.rawAddress.toString(), groupname.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), totalentries.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netIsServiceAccount(servername: Pcwstr, accountname: Pcwstr, isservice: MutPtr<Bool>): Ntstatus =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetIsServiceAccount(servername.rawAddress.toString(), accountname.rawAddress.toString(), isservice.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netJoinDomain(lpserver: Pcwstr, lpdomain: Pcwstr, lpmachineaccountou: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, fjoinoptions: NetJoinDomainJoinOptions): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetJoinDomain(lpserver.rawAddress.toString(), lpdomain.rawAddress.toString(), lpmachineaccountou.rawAddress.toString(), lpaccount.rawAddress.toString(), lppassword.rawAddress.toString(), fjoinoptions.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netLocalGroupAdd(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupAdd(servername.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), parmErr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netLocalGroupAddMember(servername: Pcwstr, groupname: Pcwstr, membersid: Psid): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupAddMember(servername.rawAddress.toString(), groupname.rawAddress.toString(), membersid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netLocalGroupAddMembers(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: ConstPtr<UByte>, totalentries: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupAddMembers(servername.rawAddress.toString(), groupname.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), totalentries.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netLocalGroupDel(servername: Pcwstr, groupname: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupDel(servername.rawAddress.toString(), groupname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netLocalGroupDelMember(servername: Pcwstr, groupname: Pcwstr, membersid: Psid): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupDelMember(servername.rawAddress.toString(), groupname.rawAddress.toString(), membersid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netLocalGroupDelMembers(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: ConstPtr<UByte>, totalentries: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupDelMembers(servername.rawAddress.toString(), groupname.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), totalentries.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netLocalGroupEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumehandle: MutPtr<ULong>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupEnum(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumehandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netLocalGroupGetInfo(servername: Pcwstr, groupname: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupGetInfo(servername.rawAddress.toString(), groupname.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netLocalGroupGetMembers(servername: Pcwstr, localgroupname: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumehandle: MutPtr<ULong>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupGetMembers(servername.rawAddress.toString(), localgroupname.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumehandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netLocalGroupSetInfo(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupSetInfo(servername.rawAddress.toString(), groupname.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), parmErr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netLocalGroupSetMembers(servername: Pcwstr, groupname: Pcwstr, level: UInt, buf: ConstPtr<UByte>, totalentries: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetLocalGroupSetMembers(servername.rawAddress.toString(), groupname.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), totalentries.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netMessageBufferSend(servername: Pcwstr, msgname: Pcwstr, fromname: Pcwstr, buf: ConstPtr<UByte>, buflen: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetMessageBufferSend(servername.rawAddress.toString(), msgname.rawAddress.toString(), fromname.rawAddress.toString(), buf.rawAddress.toString(), buflen.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netMessageNameAdd(servername: Pcwstr, msgname: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetMessageNameAdd(servername.rawAddress.toString(), msgname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netMessageNameDel(servername: Pcwstr, msgname: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetMessageNameDel(servername.rawAddress.toString(), msgname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netMessageNameEnum(servername: Pcwstr, level: UInt, bufptr: ConstPtr<ConstPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetMessageNameEnum(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumeHandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netMessageNameGetInfo(servername: Pcwstr, msgname: Pcwstr, level: UInt, bufptr: ConstPtr<ConstPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetMessageNameGetInfo(servername.rawAddress.toString(), msgname.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netProvisionComputerAccount(lpdomain: Pcwstr, lpmachinename: Pcwstr, lpmachineaccountou: Pcwstr, lpdcname: Pcwstr, dwoptions: NetsetupProvision, pprovisionbindata: MutPtr<MutPtr<UByte>>, pdwprovisionbindatasize: MutPtr<UInt>, pprovisiontextdata: MutPtr<Pwstr>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetProvisionComputerAccount(lpdomain.rawAddress.toString(), lpmachinename.rawAddress.toString(), lpmachineaccountou.rawAddress.toString(), lpdcname.rawAddress.toString(), dwoptions.toInt(), pprovisionbindata.rawAddress.toString(), pdwprovisionbindatasize.rawAddress.toString(), pprovisiontextdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netQueryDisplayInformation(servername: Pcwstr, level: UInt, index: UInt, entriesrequested: UInt, preferredmaximumlength: UInt, returnedentrycount: MutPtr<UInt>, sortedbuffer: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetQueryDisplayInformation(servername.rawAddress.toString(), level.toInt(), index.toInt(), entriesrequested.toInt(), preferredmaximumlength.toInt(), returnedentrycount.rawAddress.toString(), sortedbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netQueryServiceAccount(servername: Pcwstr, accountname: Pcwstr, infolevel: UInt, buffer: MutPtr<MutPtr<UByte>>): Ntstatus =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetQueryServiceAccount(servername.rawAddress.toString(), accountname.rawAddress.toString(), infolevel.toInt(), buffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netRemoteComputerSupports(uncservername: Pcwstr, optionswanted: NetRemoteComputerSupportsOptions, optionssupported: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetRemoteComputerSupports(uncservername.rawAddress.toString(), optionswanted.toInt(), optionssupported.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netRemoteTOD(uncservername: Pcwstr, bufferptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetRemoteTOD(uncservername.rawAddress.toString(), bufferptr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netRemoveAlternateComputerName(server: Pcwstr, alternatename: Pcwstr, domainaccount: Pcwstr, domainaccountpassword: Pcwstr, reserved: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetRemoveAlternateComputerName(server.rawAddress.toString(), alternatename.rawAddress.toString(), domainaccount.rawAddress.toString(), domainaccountpassword.rawAddress.toString(), reserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netRemoveServiceAccount(servername: Pcwstr, accountname: Pcwstr, flags: UInt): Ntstatus =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetRemoveServiceAccount(servername.rawAddress.toString(), accountname.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netRenameMachineInDomain(lpserver: Pcwstr, lpnewmachinename: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, frenameoptions: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetRenameMachineInDomain(lpserver.rawAddress.toString(), lpnewmachinename.rawAddress.toString(), lpaccount.rawAddress.toString(), lppassword.rawAddress.toString(), frenameoptions.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplExportDirAdd(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirAdd(servername.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), parmErr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplExportDirDel(servername: Pcwstr, dirname: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirDel(servername.rawAddress.toString(), dirname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplExportDirEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumehandle: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirEnum(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumehandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplExportDirGetInfo(servername: Pcwstr, dirname: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirGetInfo(servername.rawAddress.toString(), dirname.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplExportDirLock(servername: Pcwstr, dirname: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirLock(servername.rawAddress.toString(), dirname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplExportDirSetInfo(servername: Pcwstr, dirname: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirSetInfo(servername.rawAddress.toString(), dirname.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), parmErr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplExportDirUnlock(servername: Pcwstr, dirname: Pcwstr, unlockforce: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetReplExportDirUnlock(servername.rawAddress.toString(), dirname.rawAddress.toString(), unlockforce.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplGetInfo(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetReplGetInfo(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplImportDirAdd(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirAdd(servername.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), parmErr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplImportDirDel(servername: Pcwstr, dirname: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirDel(servername.rawAddress.toString(), dirname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplImportDirEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumehandle: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirEnum(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumehandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplImportDirGetInfo(servername: Pcwstr, dirname: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirGetInfo(servername.rawAddress.toString(), dirname.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplImportDirLock(servername: Pcwstr, dirname: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirLock(servername.rawAddress.toString(), dirname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplImportDirUnlock(servername: Pcwstr, dirname: Pcwstr, unlockforce: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetReplImportDirUnlock(servername.rawAddress.toString(), dirname.rawAddress.toString(), unlockforce.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netReplSetInfo(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetReplSetInfo(servername.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), parmErr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netRequestOfflineDomainJoin(pprovisionbindata: ConstPtr<UByte>, cbprovisionbindatasize: UInt, dwoptions: NetRequestProvisionOptions, lpwindowspath: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetRequestOfflineDomainJoin(pprovisionbindata.rawAddress.toString(), cbprovisionbindatasize.toInt(), dwoptions.toInt(), lpwindowspath.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netRequestProvisioningPackageInstall(ppackagebindata: ConstPtr<UByte>, dwpackagebindatasize: UInt, dwprovisionoptions: NetRequestProvisionOptions, lpwindowspath: Pcwstr, pvreserved: ConstPtr<CVoid>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetRequestProvisioningPackageInstall(ppackagebindata.rawAddress.toString(), dwpackagebindatasize.toInt(), dwprovisionoptions.toInt(), lpwindowspath.rawAddress.toString(), pvreserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netScheduleJobAdd(servername: Pcwstr, buffer: MutPtr<UByte>, jobid: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetScheduleJobAdd(servername.rawAddress.toString(), buffer.rawAddress.toString(), jobid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netScheduleJobDel(servername: Pcwstr, minjobid: UInt, maxjobid: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetScheduleJobDel(servername.rawAddress.toString(), minjobid.toInt(), maxjobid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netScheduleJobEnum(servername: Pcwstr, pointertobuffer: MutPtr<MutPtr<UByte>>, prefferedmaximumlength: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumehandle: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetScheduleJobEnum(servername.rawAddress.toString(), pointertobuffer.rawAddress.toString(), prefferedmaximumlength.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumehandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netScheduleJobGetInfo(servername: Pcwstr, jobid: UInt, pointertobuffer: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetScheduleJobGetInfo(servername.rawAddress.toString(), jobid.toInt(), pointertobuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerComputerNameAdd(servername: Pcwstr, emulateddomainname: Pcwstr, emulatedservername: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetServerComputerNameAdd(servername.rawAddress.toString(), emulateddomainname.rawAddress.toString(), emulatedservername.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerComputerNameDel(servername: Pcwstr, emulatedservername: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetServerComputerNameDel(servername.rawAddress.toString(), emulatedservername.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerDiskEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetServerDiskEnum(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumeHandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, servertype: NetServerType, domain: Pcwstr, resumeHandle: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetServerEnum(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), servertype.toInt(), domain.rawAddress.toString(), resumeHandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerGetInfo(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetServerGetInfo(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerSetInfo(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmerror: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetServerSetInfo(servername.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), parmerror.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerTransportAdd(servername: Pcwstr, level: UInt, bufptr: ConstPtr<UByte>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetServerTransportAdd(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerTransportAddEx(servername: Pcwstr, level: UInt, bufptr: ConstPtr<UByte>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetServerTransportAddEx(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerTransportDel(servername: Pcwstr, level: UInt, bufptr: ConstPtr<UByte>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetServerTransportDel(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerTransportEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetServerTransportEnum(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumeHandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServiceControl(servername: Pcwstr, service: Pcwstr, opcode: UInt, arg: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetServiceControl(servername.rawAddress.toString(), service.rawAddress.toString(), opcode.toInt(), arg.toInt(), bufptr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServiceEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetServiceEnum(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumeHandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServiceGetInfo(servername: Pcwstr, service: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetServiceGetInfo(servername.rawAddress.toString(), service.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServiceInstall(servername: Pcwstr, service: Pcwstr, argc: UInt, argv: ConstPtr<Pcwstr>, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetServiceInstall(servername.rawAddress.toString(), service.rawAddress.toString(), argc.toInt(), argv.rawAddress.toString(), bufptr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netSetPrimaryComputerName(server: Pcwstr, primaryname: Pcwstr, domainaccount: Pcwstr, domainaccountpassword: Pcwstr, reserved: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetSetPrimaryComputerName(server.rawAddress.toString(), primaryname.rawAddress.toString(), domainaccount.rawAddress.toString(), domainaccountpassword.rawAddress.toString(), reserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUnjoinDomain(lpserver: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, funjoinoptions: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetUnjoinDomain(lpserver.rawAddress.toString(), lpaccount.rawAddress.toString(), lppassword.rawAddress.toString(), funjoinoptions.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUseAdd(servername: ConstPtr<Byte>, levelflags: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetUseAdd(servername.rawAddress.toString(), levelflags.toInt(), buf.rawAddress.toString(), parmErr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUseDel(uncservername: Pcwstr, usename: Pcwstr, forcelevelflags: ForceLevelFlags): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetUseDel(uncservername.rawAddress.toString(), usename.rawAddress.toString(), forcelevelflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUseEnum(uncservername: Pcwstr, levelflags: UInt, bufptr: MutPtr<MutPtr<UByte>>, preferedmaximumsize: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumehandle: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetUseEnum(uncservername.rawAddress.toString(), levelflags.toInt(), bufptr.rawAddress.toString(), preferedmaximumsize.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumehandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUseGetInfo(uncservername: Pcwstr, usename: Pcwstr, levelflags: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetUseGetInfo(uncservername.rawAddress.toString(), usename.rawAddress.toString(), levelflags.toInt(), bufptr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUserAdd(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetUserAdd(servername.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), parmErr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUserChangePassword(domainname: Pcwstr, username: Pcwstr, oldpassword: Pcwstr, newpassword: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetUserChangePassword(domainname.rawAddress.toString(), username.rawAddress.toString(), oldpassword.rawAddress.toString(), newpassword.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUserDel(servername: Pcwstr, username: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetUserDel(servername.rawAddress.toString(), username.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUserEnum(servername: Pcwstr, level: UInt, filter: NetUserEnumFilterFlags, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetUserEnum(servername.rawAddress.toString(), level.toInt(), filter.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumeHandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUserGetGroups(servername: Pcwstr, username: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetUserGetGroups(servername.rawAddress.toString(), username.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUserGetInfo(servername: Pcwstr, username: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetUserGetInfo(servername.rawAddress.toString(), username.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUserGetLocalGroups(servername: Pcwstr, username: Pcwstr, level: UInt, flags: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetUserGetLocalGroups(servername.rawAddress.toString(), username.rawAddress.toString(), level.toInt(), flags.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUserModalsGet(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetUserModalsGet(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUserModalsSet(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetUserModalsSet(servername.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), parmErr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUserSetGroups(servername: Pcwstr, username: Pcwstr, level: UInt, buf: ConstPtr<UByte>, numEntries: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetUserSetGroups(servername.rawAddress.toString(), username.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), numEntries.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netUserSetInfo(servername: Pcwstr, username: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetUserSetInfo(servername.rawAddress.toString(), username.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), parmErr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netValidateName(lpserver: Pcwstr, lpname: Pcwstr, lpaccount: Pcwstr, lppassword: Pcwstr, nametype: NetsetupNameType): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetValidateName(lpserver.rawAddress.toString(), lpname.rawAddress.toString(), lpaccount.rawAddress.toString(), lppassword.rawAddress.toString(), nametype).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netValidatePasswordPolicy(servername: Pcwstr, qualifier: MutPtr<CVoid>, validationtype: NetValidatePasswordType, inputarg: MutPtr<CVoid>, outputarg: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetValidatePasswordPolicy(servername.rawAddress.toString(), qualifier.rawAddress.toString(), validationtype, inputarg.rawAddress.toString(), outputarg.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netValidatePasswordPolicyFree(outputarg: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetValidatePasswordPolicyFree(outputarg.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netWkstaGetInfo(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaGetInfo(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netWkstaSetInfo(servername: Pcwstr, level: UInt, buffer: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaSetInfo(servername.rawAddress.toString(), level.toInt(), buffer.rawAddress.toString(), parmErr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netWkstaTransportAdd(servername: ConstPtr<Byte>, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaTransportAdd(servername.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), parmErr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netWkstaTransportDel(servername: Pcwstr, transportname: Pcwstr, ucond: ForceLevelFlags): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaTransportDel(servername.rawAddress.toString(), transportname.rawAddress.toString(), ucond.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netWkstaTransportEnum(servername: ConstPtr<Byte>, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaTransportEnum(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumeHandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netWkstaUserEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumehandle: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaUserEnum(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumehandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netWkstaUserGetInfo(reserved: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaUserGetInfo(reserved.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netWkstaUserSetInfo(reserved: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementNetWkstaUserSetInfo(reserved.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), parmErr.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun routerAssert(pszfailedassertion: Pcstr, pszfilename: Pcstr, dwlinenumber: UInt, pszmessage: Pcstr) {
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementNetmanagementRouterAssert(pszfailedassertion.rawAddress.toString(), pszfilename.rawAddress.toString(), dwlinenumber.toInt(), pszmessage.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerGetErrorStringA(dwerrorcode: UInt, lplpszerrorstring: MutPtr<Pstr>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementRouterGetErrorStringA(dwerrorcode.toInt(), lplpszerrorstring.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun routerGetErrorStringW(dwerrorcode: UInt, lplpwszerrorstring: MutPtr<Pwstr>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementRouterGetErrorStringW(dwerrorcode.toInt(), lplpwszerrorstring.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun routerLogDeregisterA(hloghandle: Handle) {
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementNetmanagementRouterLogDeregisterA(hloghandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerLogDeregisterW(hloghandle: Handle) {
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementNetmanagementRouterLogDeregisterW(hloghandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerLogEventA(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: ConstPtr<Pcstr>, dwerrorcode: UInt) {
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventA(hloghandle.rawAddress.toString(), dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), plpszsubstringarray.rawAddress.toString(), dwerrorcode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerLogEventDataA(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: ConstPtr<Pcstr>, dwdatabytes: UInt, lpdatabytes: MutPtr<UByte>) {
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventDataA(hloghandle.rawAddress.toString(), dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), plpszsubstringarray.rawAddress.toString(), dwdatabytes.toInt(), lpdatabytes.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerLogEventDataW(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: ConstPtr<Pcwstr>, dwdatabytes: UInt, lpdatabytes: MutPtr<UByte>) {
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventDataW(hloghandle.rawAddress.toString(), dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), plpszsubstringarray.rawAddress.toString(), dwdatabytes.toInt(), lpdatabytes.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerLogEventExA(hloghandle: Handle, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: Pcstr, vararg variadicArgs: Long) {
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventExA(hloghandle.rawAddress.toString(), dweventtype.toInt(), dwerrorcode.toInt(), dwmessageid.toInt(), ptszformat.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerLogEventExW(hloghandle: Handle, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: Pcwstr, vararg variadicArgs: Long) {
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventExW(hloghandle.rawAddress.toString(), dweventtype.toInt(), dwerrorcode.toInt(), dwmessageid.toInt(), ptszformat.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerLogEventStringA(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: ConstPtr<Pcstr>, dwerrorcode: UInt, dwerrorindex: UInt) {
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventStringA(hloghandle.rawAddress.toString(), dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), plpszsubstringarray.rawAddress.toString(), dwerrorcode.toInt(), dwerrorindex.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerLogEventStringW(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: ConstPtr<Pcwstr>, dwerrorcode: UInt, dwerrorindex: UInt) {
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventStringW(hloghandle.rawAddress.toString(), dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), plpszsubstringarray.rawAddress.toString(), dwerrorcode.toInt(), dwerrorindex.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerLogEventValistExA(hloghandle: Handle, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: Pcstr, arglist: MutPtr<Byte>) {
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventValistExA(hloghandle.rawAddress.toString(), dweventtype.toInt(), dwerrorcode.toInt(), dwmessageid.toInt(), ptszformat.rawAddress.toString(), arglist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerLogEventValistExW(hloghandle: Handle, dweventtype: UInt, dwerrorcode: UInt, dwmessageid: UInt, ptszformat: Pcwstr, arglist: MutPtr<Byte>) {
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventValistExW(hloghandle.rawAddress.toString(), dweventtype.toInt(), dwerrorcode.toInt(), dwmessageid.toInt(), ptszformat.rawAddress.toString(), arglist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerLogEventW(hloghandle: Handle, dweventtype: UInt, dwmessageid: UInt, dwsubstringcount: UInt, plpszsubstringarray: ConstPtr<Pcwstr>, dwerrorcode: UInt) {
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementNetmanagementRouterLogEventW(hloghandle.rawAddress.toString(), dweventtype.toInt(), dwmessageid.toInt(), dwsubstringcount.toInt(), plpszsubstringarray.rawAddress.toString(), dwerrorcode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun routerLogRegisterA(lpszsource: Pcstr): Handle =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkmanagementNetmanagementRouterLogRegisterA(lpszsource.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun routerLogRegisterW(lpszsource: Pcwstr): Handle =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkmanagementNetmanagementRouterLogRegisterW(lpszsource.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setNetScheduleAccountInformation(pwszservername: Pcwstr, pwszaccount: Pcwstr, pwszpassword: Pcwstr): Hresult =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementSetNetScheduleAccountInformation(pwszservername.rawAddress.toString(), pwszaccount.rawAddress.toString(), pwszpassword.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceDeregisterA(dwtraceid: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterA(dwtraceid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceDeregisterExA(dwtraceid: UInt, dwflags: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterExA(dwtraceid.toInt(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceDeregisterExW(dwtraceid: UInt, dwflags: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterExW(dwtraceid.toInt(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceDeregisterW(dwtraceid: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementTraceDeregisterW(dwtraceid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceDumpExA(dwtraceid: UInt, dwflags: UInt, lpbbytes: MutPtr<UByte>, dwbytecount: UInt, dwgroupsize: UInt, baddressprefix: Bool, lpszprefix: Pcstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementTraceDumpExA(dwtraceid.toInt(), dwflags.toInt(), lpbbytes.rawAddress.toString(), dwbytecount.toInt(), dwgroupsize.toInt(), baddressprefix, lpszprefix.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceDumpExW(dwtraceid: UInt, dwflags: UInt, lpbbytes: MutPtr<UByte>, dwbytecount: UInt, dwgroupsize: UInt, baddressprefix: Bool, lpszprefix: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementTraceDumpExW(dwtraceid.toInt(), dwflags.toInt(), lpbbytes.rawAddress.toString(), dwbytecount.toInt(), dwgroupsize.toInt(), baddressprefix, lpszprefix.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceGetConsoleA(dwtraceid: UInt, lphconsole: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementTraceGetConsoleA(dwtraceid.toInt(), lphconsole.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceGetConsoleW(dwtraceid: UInt, lphconsole: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementTraceGetConsoleW(dwtraceid.toInt(), lphconsole.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tracePrintfA(dwtraceid: UInt, lpszformat: Pcstr, vararg variadicArgs: Long): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementTracePrintfA(dwtraceid.toInt(), lpszformat.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tracePrintfExA(dwtraceid: UInt, dwflags: UInt, lpszformat: Pcstr, vararg variadicArgs: Long): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementTracePrintfExA(dwtraceid.toInt(), dwflags.toInt(), lpszformat.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tracePrintfExW(dwtraceid: UInt, dwflags: UInt, lpszformat: Pcwstr, vararg variadicArgs: Long): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementTracePrintfExW(dwtraceid.toInt(), dwflags.toInt(), lpszformat.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tracePrintfW(dwtraceid: UInt, lpszformat: Pcwstr, vararg variadicArgs: Long): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementTracePrintfW(dwtraceid.toInt(), lpszformat.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tracePutsExA(dwtraceid: UInt, dwflags: UInt, lpszstring: Pcstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementTracePutsExA(dwtraceid.toInt(), dwflags.toInt(), lpszstring.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tracePutsExW(dwtraceid: UInt, dwflags: UInt, lpszstring: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementTracePutsExW(dwtraceid.toInt(), dwflags.toInt(), lpszstring.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceRegisterExA(lpszcallername: Pcstr, dwflags: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementTraceRegisterExA(lpszcallername.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceRegisterExW(lpszcallername: Pcwstr, dwflags: UInt): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementTraceRegisterExW(lpszcallername.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceVprintfExA(dwtraceid: UInt, dwflags: UInt, lpszformat: Pcstr, arglist: MutPtr<Byte>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementTraceVprintfExA(dwtraceid.toInt(), dwflags.toInt(), lpszformat.rawAddress.toString(), arglist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceVprintfExW(dwtraceid: UInt, dwflags: UInt, lpszformat: Pcwstr, arglist: MutPtr<Byte>): UInt =
    if (windowsWin32NetworkmanagementNetmanagementNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetmanagementTraceVprintfExW(dwtraceid.toInt(), dwflags.toInt(), lpszformat.rawAddress.toString(), arglist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
