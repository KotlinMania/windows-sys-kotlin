@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.security

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SecurityNapiAddon(): Boolean

private val windowsWin32SecurityNapiAvailable: Boolean = initWindowsWin32SecurityNapiAddon()

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAccessCheck(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityAccessCheck(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAccessCheckAndAuditAlarmA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32SecurityAccessCheckAndAuditAlarmA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: Int, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAccessCheckAndAuditAlarmW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32SecurityAccessCheckAndAuditAlarmW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: Int, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAccessCheckByType(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32SecurityAccessCheckByType(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAccessCheckByTypeAndAuditAlarmA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15)")
private external fun wasmWindowssysWindowsWin32SecurityAccessCheckByTypeAndAuditAlarmA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int, p8: Int, p9: String, p10: Int, p11: String, p12: Int, p13: String, p14: String, p15: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAccessCheckByTypeAndAuditAlarmW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15)")
private external fun wasmWindowssysWindowsWin32SecurityAccessCheckByTypeAndAuditAlarmW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int, p8: Int, p9: String, p10: Int, p11: String, p12: Int, p13: String, p14: String, p15: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAccessCheckByTypeResultList(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32SecurityAccessCheckByTypeResultList(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15)")
private external fun wasmWindowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int, p8: Int, p9: String, p10: Int, p11: String, p12: Int, p13: String, p14: String, p15: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmByHandleA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16)")
private external fun wasmWindowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmByHandleA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: Int, p9: Int, p10: String, p11: Int, p12: String, p13: Int, p14: String, p15: String, p16: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmByHandleW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16)")
private external fun wasmWindowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmByHandleW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: Int, p9: Int, p10: String, p11: Int, p12: String, p13: Int, p14: String, p15: String, p16: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15)")
private external fun wasmWindowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int, p8: Int, p9: String, p10: Int, p11: String, p12: Int, p13: String, p14: String, p15: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAddAccessAllowedAce(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAddAccessAllowedAce(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAddAccessAllowedAceEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityAddAccessAllowedAceEx(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAddAccessAllowedObjectAce(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityAddAccessAllowedObjectAce(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAddAccessDeniedAce(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAddAccessDeniedAce(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAddAccessDeniedAceEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityAddAccessDeniedAceEx(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAddAccessDeniedObjectAce(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityAddAccessDeniedObjectAce(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAddAce(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityAddAce(p0: String, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAddAuditAccessAce(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityAddAuditAccessAce(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAddAuditAccessAceEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityAddAuditAccessAceEx(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAddAuditAccessObjectAce(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SecurityAddAuditAccessObjectAce(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: Int, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAddConditionalAce(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityAddConditionalAce(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAddMandatoryAce(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityAddMandatoryAce(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAddResourceAttributeAce(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityAddResourceAttributeAce(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAddScopedPolicyIDAce(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityAddScopedPolicyIDAce(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAdjustTokenGroups(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityAdjustTokenGroups(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAdjustTokenPrivileges(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityAdjustTokenPrivileges(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAllocateAndInitializeSid(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32SecurityAllocateAndInitializeSid(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: Int, p9: Int, p10: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAllocateLocallyUniqueId(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAllocateLocallyUniqueId(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAreAllAccessesGranted(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAreAllAccessesGranted(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAreAnyAccessesGranted(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAreAnyAccessesGranted(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCheckTokenCapability(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCheckTokenCapability(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCheckTokenMembership(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCheckTokenMembership(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCheckTokenMembershipEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCheckTokenMembershipEx(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityConvertToAutoInheritPrivateObjectSecurity(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityConvertToAutoInheritPrivateObjectSecurity(p0: String, p1: String, p2: String, p3: String, p4: Boolean, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCopySid(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCopySid(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCreatePrivateObjectSecurity(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCreatePrivateObjectSecurity(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCreatePrivateObjectSecurityEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityCreatePrivateObjectSecurityEx(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCreatePrivateObjectSecurityWithMultipleInheritance(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SecurityCreatePrivateObjectSecurityWithMultipleInheritance(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCreateRestrictedToken(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SecurityCreateRestrictedToken(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCreateWellKnownSid(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCreateWellKnownSid(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDeleteAce(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityDeleteAce(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDeriveCapabilitySidsFromName(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityDeriveCapabilitySidsFromName(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDestroyPrivateObjectSecurity(p0)")
private external fun wasmWindowssysWindowsWin32SecurityDestroyPrivateObjectSecurity(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDuplicateToken(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityDuplicateToken(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDuplicateTokenEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityDuplicateTokenEx(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityEqualDomainSid(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityEqualDomainSid(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityEqualPrefixSid(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityEqualPrefixSid(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityEqualSid(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityEqualSid(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityFindFirstFreeAce(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityFindFirstFreeAce(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityFreeSid(p0)")
private external fun wasmWindowssysWindowsWin32SecurityFreeSid(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityGetAce(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityGetAce(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityGetAclInformation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityGetAclInformation(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityGetAppContainerAce(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityGetAppContainerAce(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityGetCachedSigningLevel(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityGetCachedSigningLevel(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityGetFileSecurityA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityGetFileSecurityA(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityGetFileSecurityW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityGetFileSecurityW(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityGetKernelObjectSecurity(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityGetKernelObjectSecurity(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityGetLengthSid(p0)")
private external fun wasmWindowssysWindowsWin32SecurityGetLengthSid(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityGetPrivateObjectSecurity(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityGetPrivateObjectSecurity(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityGetSecurityDescriptorControl(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityGetSecurityDescriptorControl(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityGetSecurityDescriptorDacl(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityGetSecurityDescriptorDacl(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityGetSecurityDescriptorGroup(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityGetSecurityDescriptorGroup(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityGetSecurityDescriptorLength(p0)")
private external fun wasmWindowssysWindowsWin32SecurityGetSecurityDescriptorLength(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityGetSecurityDescriptorOwner(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityGetSecurityDescriptorOwner(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityGetSecurityDescriptorRMControl(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityGetSecurityDescriptorRMControl(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityGetSecurityDescriptorSacl(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityGetSecurityDescriptorSacl(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityGetSidIdentifierAuthority(p0)")
private external fun wasmWindowssysWindowsWin32SecurityGetSidIdentifierAuthority(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityGetSidLengthRequired(p0)")
private external fun wasmWindowssysWindowsWin32SecurityGetSidLengthRequired(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityGetSidSubAuthority(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityGetSidSubAuthority(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityGetSidSubAuthorityCount(p0)")
private external fun wasmWindowssysWindowsWin32SecurityGetSidSubAuthorityCount(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityGetTokenInformation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityGetTokenInformation(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityGetUserObjectSecurity(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityGetUserObjectSecurity(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityGetWindowsAccountDomainSid(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityGetWindowsAccountDomainSid(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityImpersonateAnonymousToken(p0)")
private external fun wasmWindowssysWindowsWin32SecurityImpersonateAnonymousToken(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityImpersonateLoggedOnUser(p0)")
private external fun wasmWindowssysWindowsWin32SecurityImpersonateLoggedOnUser(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityImpersonateSelf(p0)")
private external fun wasmWindowssysWindowsWin32SecurityImpersonateSelf(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityInitializeAcl(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityInitializeAcl(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityInitializeSecurityDescriptor(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityInitializeSecurityDescriptor(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityInitializeSid(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityInitializeSid(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityIsTokenRestricted(p0)")
private external fun wasmWindowssysWindowsWin32SecurityIsTokenRestricted(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityIsValidAcl(p0)")
private external fun wasmWindowssysWindowsWin32SecurityIsValidAcl(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityIsValidSecurityDescriptor(p0)")
private external fun wasmWindowssysWindowsWin32SecurityIsValidSecurityDescriptor(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityIsValidSid(p0)")
private external fun wasmWindowssysWindowsWin32SecurityIsValidSid(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityIsWellKnownSid(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityIsWellKnownSid(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityLogonUserA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityLogonUserA(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityLogonUserExA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SecurityLogonUserExA(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityLogonUserExW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SecurityLogonUserExW(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityLogonUserW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityLogonUserW(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityLookupAccountNameA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityLookupAccountNameA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityLookupAccountNameW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityLookupAccountNameW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityLookupAccountSidA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityLookupAccountSidA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityLookupAccountSidW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityLookupAccountSidW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityLookupPrivilegeDisplayNameA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityLookupPrivilegeDisplayNameA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityLookupPrivilegeDisplayNameW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityLookupPrivilegeDisplayNameW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityLookupPrivilegeNameA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityLookupPrivilegeNameA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityLookupPrivilegeNameW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityLookupPrivilegeNameW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityLookupPrivilegeValueA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityLookupPrivilegeValueA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityLookupPrivilegeValueW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityLookupPrivilegeValueW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityMakeAbsoluteSD(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32SecurityMakeAbsoluteSD(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityMakeSelfRelativeSD(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityMakeSelfRelativeSD(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityMapGenericMask(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityMapGenericMask(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityObjectCloseAuditAlarmA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityObjectCloseAuditAlarmA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityObjectCloseAuditAlarmW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityObjectCloseAuditAlarmW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityObjectDeleteAuditAlarmA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityObjectDeleteAuditAlarmA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityObjectDeleteAuditAlarmW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityObjectDeleteAuditAlarmW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityObjectOpenAuditAlarmA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWin32SecurityObjectOpenAuditAlarmA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int, p8: String, p9: Int, p10: Int, p11: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityObjectOpenAuditAlarmW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWin32SecurityObjectOpenAuditAlarmW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int, p8: String, p9: Int, p10: Int, p11: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityObjectPrivilegeAuditAlarmA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityObjectPrivilegeAuditAlarmA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityObjectPrivilegeAuditAlarmW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityObjectPrivilegeAuditAlarmW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityPrivilegeCheck(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityPrivilegeCheck(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityPrivilegedServiceAuditAlarmA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityPrivilegedServiceAuditAlarmA(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityPrivilegedServiceAuditAlarmW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityPrivilegedServiceAuditAlarmW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityQuerySecurityAccessMask(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityQuerySecurityAccessMask(p0: Int, p1: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityRevertToSelf()")
private external fun wasmWindowssysWindowsWin32SecurityRevertToSelf(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityRtlConvertSidToUnicodeString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityRtlConvertSidToUnicodeString(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityRtlNormalizeSecurityDescriptor(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityRtlNormalizeSecurityDescriptor(p0: String, p1: Int, p2: String, p3: String, p4: Boolean): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecuritySetAclInformation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecuritySetAclInformation(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecuritySetCachedSigningLevel(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecuritySetCachedSigningLevel(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecuritySetFileSecurityA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecuritySetFileSecurityA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecuritySetFileSecurityW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecuritySetFileSecurityW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecuritySetKernelObjectSecurity(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecuritySetKernelObjectSecurity(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecuritySetPrivateObjectSecurity(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecuritySetPrivateObjectSecurity(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecuritySetPrivateObjectSecurityEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecuritySetPrivateObjectSecurityEx(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecuritySetSecurityAccessMask(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecuritySetSecurityAccessMask(p0: Int, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecuritySetSecurityDescriptorControl(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecuritySetSecurityDescriptorControl(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecuritySetSecurityDescriptorDacl(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecuritySetSecurityDescriptorDacl(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecuritySetSecurityDescriptorGroup(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecuritySetSecurityDescriptorGroup(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecuritySetSecurityDescriptorOwner(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecuritySetSecurityDescriptorOwner(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecuritySetSecurityDescriptorRMControl(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecuritySetSecurityDescriptorRMControl(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecuritySetSecurityDescriptorSacl(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecuritySetSecurityDescriptorSacl(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecuritySetTokenInformation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecuritySetTokenInformation(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecuritySetUserObjectSecurity(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecuritySetUserObjectSecurity(p0: String, p1: String, p2: String): Int

public actual fun accessCheck(psecuritydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, genericmapping: ConstPtr, privilegeset: MutPtr, privilegesetlength: MutPtr, grantedaccess: MutPtr, accessstatus: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityAccessCheck(psecuritydescriptor.rawAddress.toString(), clienttoken.rawAddress.toString(), desiredaccess.toInt(), genericmapping.rawAddress.toString(), privilegeset.rawAddress.toString(), privilegesetlength.rawAddress.toString(), grantedaccess.rawAddress.toString(), accessstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessCheckAndAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccess: MutPtr, accessstatus: MutPtr, pfgenerateonclose: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityAccessCheckAndAuditAlarmA(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), desiredaccess.toInt(), genericmapping.rawAddress.toString(), objectcreation, grantedaccess.rawAddress.toString(), accessstatus.rawAddress.toString(), pfgenerateonclose.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessCheckAndAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccess: MutPtr, accessstatus: MutPtr, pfgenerateonclose: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityAccessCheckAndAuditAlarmW(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), desiredaccess.toInt(), genericmapping.rawAddress.toString(), objectcreation, grantedaccess.rawAddress.toString(), accessstatus.rawAddress.toString(), pfgenerateonclose.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessCheckByType(psecuritydescriptor: PsecurityDescriptor, principalselfsid: Psid, clienttoken: Handle, desiredaccess: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, privilegeset: MutPtr, privilegesetlength: MutPtr, grantedaccess: MutPtr, accessstatus: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityAccessCheckByType(psecuritydescriptor.rawAddress.toString(), principalselfsid.rawAddress.toString(), clienttoken.rawAddress.toString(), desiredaccess.toInt(), objecttypelist.rawAddress.toString(), objecttypelistlength.toInt(), genericmapping.rawAddress.toString(), privilegeset.rawAddress.toString(), privilegesetlength.rawAddress.toString(), grantedaccess.rawAddress.toString(), accessstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessCheckByTypeAndAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccess: MutPtr, accessstatus: MutPtr, pfgenerateonclose: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityAccessCheckByTypeAndAuditAlarmA(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), principalselfsid.rawAddress.toString(), desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.rawAddress.toString(), objecttypelistlength.toInt(), genericmapping.rawAddress.toString(), objectcreation, grantedaccess.rawAddress.toString(), accessstatus.rawAddress.toString(), pfgenerateonclose.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessCheckByTypeAndAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccess: MutPtr, accessstatus: MutPtr, pfgenerateonclose: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityAccessCheckByTypeAndAuditAlarmW(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), principalselfsid.rawAddress.toString(), desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.rawAddress.toString(), objecttypelistlength.toInt(), genericmapping.rawAddress.toString(), objectcreation, grantedaccess.rawAddress.toString(), accessstatus.rawAddress.toString(), pfgenerateonclose.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessCheckByTypeResultList(psecuritydescriptor: PsecurityDescriptor, principalselfsid: Psid, clienttoken: Handle, desiredaccess: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, privilegeset: MutPtr, privilegesetlength: MutPtr, grantedaccesslist: MutPtr, accessstatuslist: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityAccessCheckByTypeResultList(psecuritydescriptor.rawAddress.toString(), principalselfsid.rawAddress.toString(), clienttoken.rawAddress.toString(), desiredaccess.toInt(), objecttypelist.rawAddress.toString(), objecttypelistlength.toInt(), genericmapping.rawAddress.toString(), privilegeset.rawAddress.toString(), privilegesetlength.rawAddress.toString(), grantedaccesslist.rawAddress.toString(), accessstatuslist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessCheckByTypeResultListAndAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccess: MutPtr, accessstatuslist: MutPtr, pfgenerateonclose: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmA(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), principalselfsid.rawAddress.toString(), desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.rawAddress.toString(), objecttypelistlength.toInt(), genericmapping.rawAddress.toString(), objectcreation, grantedaccess.rawAddress.toString(), accessstatuslist.rawAddress.toString(), pfgenerateonclose.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessCheckByTypeResultListAndAuditAlarmByHandleA(subsystemname: Pcstr, handleid: ConstPtr, clienttoken: Handle, objecttypename: Pcstr, objectname: Pcstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccess: MutPtr, accessstatuslist: MutPtr, pfgenerateonclose: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmByHandleA(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), clienttoken.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), principalselfsid.rawAddress.toString(), desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.rawAddress.toString(), objecttypelistlength.toInt(), genericmapping.rawAddress.toString(), objectcreation, grantedaccess.rawAddress.toString(), accessstatuslist.rawAddress.toString(), pfgenerateonclose.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessCheckByTypeResultListAndAuditAlarmByHandleW(subsystemname: Pcwstr, handleid: ConstPtr, clienttoken: Handle, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccesslist: MutPtr, accessstatuslist: MutPtr, pfgenerateonclose: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmByHandleW(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), clienttoken.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), principalselfsid.rawAddress.toString(), desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.rawAddress.toString(), objecttypelistlength.toInt(), genericmapping.rawAddress.toString(), objectcreation, grantedaccesslist.rawAddress.toString(), accessstatuslist.rawAddress.toString(), pfgenerateonclose.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessCheckByTypeResultListAndAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr, objecttypename: Pcwstr, objectname: Pcwstr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: MutPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Bool, grantedaccesslist: MutPtr, accessstatuslist: MutPtr, pfgenerateonclose: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmW(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), securitydescriptor.rawAddress.toString(), principalselfsid.rawAddress.toString(), desiredaccess.toInt(), audittype, flags.toInt(), objecttypelist.rawAddress.toString(), objecttypelistlength.toInt(), genericmapping.rawAddress.toString(), objectcreation, grantedaccesslist.rawAddress.toString(), accessstatuslist.rawAddress.toString(), pfgenerateonclose.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addAccessAllowedAce(pacl: MutPtr, dwacerevision: AceRevision, accessmask: UInt, psid: Psid): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityAddAccessAllowedAce(pacl.rawAddress.toString(), dwacerevision.toInt(), accessmask.toInt(), psid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addAccessAllowedAceEx(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityAddAccessAllowedAceEx(pacl.rawAddress.toString(), dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), psid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addAccessAllowedObjectAce(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, objecttypeguid: ConstPtr, inheritedobjecttypeguid: ConstPtr, psid: Psid): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityAddAccessAllowedObjectAce(pacl.rawAddress.toString(), dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), objecttypeguid.rawAddress.toString(), inheritedobjecttypeguid.rawAddress.toString(), psid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addAccessDeniedAce(pacl: MutPtr, dwacerevision: AceRevision, accessmask: UInt, psid: Psid): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityAddAccessDeniedAce(pacl.rawAddress.toString(), dwacerevision.toInt(), accessmask.toInt(), psid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addAccessDeniedAceEx(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityAddAccessDeniedAceEx(pacl.rawAddress.toString(), dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), psid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addAccessDeniedObjectAce(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, objecttypeguid: ConstPtr, inheritedobjecttypeguid: ConstPtr, psid: Psid): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityAddAccessDeniedObjectAce(pacl.rawAddress.toString(), dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), objecttypeguid.rawAddress.toString(), inheritedobjecttypeguid.rawAddress.toString(), psid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addAce(pacl: MutPtr, dwacerevision: AceRevision, dwstartingaceindex: UInt, pacelist: ConstPtr, nacelistlength: UInt): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityAddAce(pacl.rawAddress.toString(), dwacerevision.toInt(), dwstartingaceindex.toInt(), pacelist.rawAddress.toString(), nacelistlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addAuditAccessAce(pacl: MutPtr, dwacerevision: AceRevision, dwaccessmask: UInt, psid: Psid, bauditsuccess: Bool, bauditfailure: Bool): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityAddAuditAccessAce(pacl.rawAddress.toString(), dwacerevision.toInt(), dwaccessmask.toInt(), psid.rawAddress.toString(), bauditsuccess, bauditfailure) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addAuditAccessAceEx(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, dwaccessmask: UInt, psid: Psid, bauditsuccess: Bool, bauditfailure: Bool): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityAddAuditAccessAceEx(pacl.rawAddress.toString(), dwacerevision.toInt(), aceflags.toInt(), dwaccessmask.toInt(), psid.rawAddress.toString(), bauditsuccess, bauditfailure) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addAuditAccessObjectAce(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, objecttypeguid: ConstPtr, inheritedobjecttypeguid: ConstPtr, psid: Psid, bauditsuccess: Bool, bauditfailure: Bool): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityAddAuditAccessObjectAce(pacl.rawAddress.toString(), dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), objecttypeguid.rawAddress.toString(), inheritedobjecttypeguid.rawAddress.toString(), psid.rawAddress.toString(), bauditsuccess, bauditfailure) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addConditionalAce(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, acetype: UByte, accessmask: UInt, psid: Psid, conditionstr: Pcwstr, returnlength: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityAddConditionalAce(pacl.rawAddress.toString(), dwacerevision.toInt(), aceflags.toInt(), acetype.toInt(), accessmask.toInt(), psid.rawAddress.toString(), conditionstr.rawAddress.toString(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addMandatoryAce(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, mandatorypolicy: UInt, plabelsid: Psid): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityAddMandatoryAce(pacl.rawAddress.toString(), dwacerevision.toInt(), aceflags.toInt(), mandatorypolicy.toInt(), plabelsid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addResourceAttributeAce(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid, pattributeinfo: ConstPtr, preturnlength: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityAddResourceAttributeAce(pacl.rawAddress.toString(), dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), psid.rawAddress.toString(), pattributeinfo.rawAddress.toString(), preturnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addScopedPolicyIDAce(pacl: MutPtr, dwacerevision: AceRevision, aceflags: AceFlags, accessmask: UInt, psid: Psid): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityAddScopedPolicyIDAce(pacl.rawAddress.toString(), dwacerevision.toInt(), aceflags.toInt(), accessmask.toInt(), psid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun adjustTokenGroups(tokenhandle: Handle, resettodefault: Bool, newstate: ConstPtr, bufferlength: UInt, previousstate: MutPtr, returnlength: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityAdjustTokenGroups(tokenhandle.rawAddress.toString(), resettodefault, newstate.rawAddress.toString(), bufferlength.toInt(), previousstate.rawAddress.toString(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun adjustTokenPrivileges(tokenhandle: Handle, disableallprivileges: Bool, newstate: ConstPtr, bufferlength: UInt, previousstate: MutPtr, returnlength: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityAdjustTokenPrivileges(tokenhandle.rawAddress.toString(), disableallprivileges, newstate.rawAddress.toString(), bufferlength.toInt(), previousstate.rawAddress.toString(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allocateAndInitializeSid(pidentifierauthority: ConstPtr, nsubauthoritycount: UByte, nsubauthority0: UInt, nsubauthority1: UInt, nsubauthority2: UInt, nsubauthority3: UInt, nsubauthority4: UInt, nsubauthority5: UInt, nsubauthority6: UInt, nsubauthority7: UInt, psid: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityAllocateAndInitializeSid(pidentifierauthority.rawAddress.toString(), nsubauthoritycount.toInt(), nsubauthority0.toInt(), nsubauthority1.toInt(), nsubauthority2.toInt(), nsubauthority3.toInt(), nsubauthority4.toInt(), nsubauthority5.toInt(), nsubauthority6.toInt(), nsubauthority7.toInt(), psid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allocateLocallyUniqueId(luid: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityAllocateLocallyUniqueId(luid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun areAllAccessesGranted(grantedaccess: UInt, desiredaccess: UInt): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityAreAllAccessesGranted(grantedaccess.toInt(), desiredaccess.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun areAnyAccessesGranted(grantedaccess: UInt, desiredaccess: UInt): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityAreAnyAccessesGranted(grantedaccess.toInt(), desiredaccess.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkTokenCapability(tokenhandle: Handle, capabilitysidtocheck: Psid, hascapability: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityCheckTokenCapability(tokenhandle.rawAddress.toString(), capabilitysidtocheck.rawAddress.toString(), hascapability.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkTokenMembership(tokenhandle: Handle, sidtocheck: Psid, ismember: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityCheckTokenMembership(tokenhandle.rawAddress.toString(), sidtocheck.rawAddress.toString(), ismember.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkTokenMembershipEx(tokenhandle: Handle, sidtocheck: Psid, flags: UInt, ismember: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityCheckTokenMembershipEx(tokenhandle.rawAddress.toString(), sidtocheck.rawAddress.toString(), flags.toInt(), ismember.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertToAutoInheritPrivateObjectSecurity(parentdescriptor: PsecurityDescriptor, currentsecuritydescriptor: PsecurityDescriptor, newsecuritydescriptor: MutPtr, objecttype: ConstPtr, isdirectoryobject: Boolean, genericmapping: ConstPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityConvertToAutoInheritPrivateObjectSecurity(parentdescriptor.rawAddress.toString(), currentsecuritydescriptor.rawAddress.toString(), newsecuritydescriptor.rawAddress.toString(), objecttype.rawAddress.toString(), isdirectoryobject, genericmapping.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copySid(ndestinationsidlength: UInt, pdestinationsid: Psid, psourcesid: Psid): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityCopySid(ndestinationsidlength.toInt(), pdestinationsid.rawAddress.toString(), psourcesid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPrivateObjectSecurity(parentdescriptor: PsecurityDescriptor, creatordescriptor: PsecurityDescriptor, newdescriptor: MutPtr, isdirectoryobject: Bool, token: Handle, genericmapping: ConstPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityCreatePrivateObjectSecurity(parentdescriptor.rawAddress.toString(), creatordescriptor.rawAddress.toString(), newdescriptor.rawAddress.toString(), isdirectoryobject, token.rawAddress.toString(), genericmapping.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPrivateObjectSecurityEx(parentdescriptor: PsecurityDescriptor, creatordescriptor: PsecurityDescriptor, newdescriptor: MutPtr, objecttype: ConstPtr, iscontainerobject: Bool, autoinheritflags: SecurityAutoInheritFlags, token: Handle, genericmapping: ConstPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityCreatePrivateObjectSecurityEx(parentdescriptor.rawAddress.toString(), creatordescriptor.rawAddress.toString(), newdescriptor.rawAddress.toString(), objecttype.rawAddress.toString(), iscontainerobject, autoinheritflags.toInt(), token.rawAddress.toString(), genericmapping.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPrivateObjectSecurityWithMultipleInheritance(parentdescriptor: PsecurityDescriptor, creatordescriptor: PsecurityDescriptor, newdescriptor: MutPtr, objecttypes: ConstPtr, guidcount: UInt, iscontainerobject: Bool, autoinheritflags: SecurityAutoInheritFlags, token: Handle, genericmapping: ConstPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityCreatePrivateObjectSecurityWithMultipleInheritance(parentdescriptor.rawAddress.toString(), creatordescriptor.rawAddress.toString(), newdescriptor.rawAddress.toString(), objecttypes.rawAddress.toString(), guidcount.toInt(), iscontainerobject, autoinheritflags.toInt(), token.rawAddress.toString(), genericmapping.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createRestrictedToken(existingtokenhandle: Handle, flags: CreateRestrictedTokenFlags, disablesidcount: UInt, sidstodisable: ConstPtr, deleteprivilegecount: UInt, privilegestodelete: ConstPtr, restrictedsidcount: UInt, sidstorestrict: ConstPtr, newtokenhandle: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityCreateRestrictedToken(existingtokenhandle.rawAddress.toString(), flags.toInt(), disablesidcount.toInt(), sidstodisable.rawAddress.toString(), deleteprivilegecount.toInt(), privilegestodelete.rawAddress.toString(), restrictedsidcount.toInt(), sidstorestrict.rawAddress.toString(), newtokenhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createWellKnownSid(wellknownsidtype: WellKnownSidType, domainsid: Psid, psid: Psid, cbsid: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityCreateWellKnownSid(wellknownsidtype, domainsid.rawAddress.toString(), psid.rawAddress.toString(), cbsid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteAce(pacl: MutPtr, dwaceindex: UInt): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityDeleteAce(pacl.rawAddress.toString(), dwaceindex.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deriveCapabilitySidsFromName(capname: Pcwstr, capabilitygroupsids: MutPtr, capabilitygroupsidcount: MutPtr, capabilitysids: MutPtr, capabilitysidcount: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityDeriveCapabilitySidsFromName(capname.rawAddress.toString(), capabilitygroupsids.rawAddress.toString(), capabilitygroupsidcount.rawAddress.toString(), capabilitysids.rawAddress.toString(), capabilitysidcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun destroyPrivateObjectSecurity(objectdescriptor: ConstPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityDestroyPrivateObjectSecurity(objectdescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplicateToken(existingtokenhandle: Handle, impersonationlevel: SecurityImpersonationLevel, duplicatetokenhandle: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityDuplicateToken(existingtokenhandle.rawAddress.toString(), impersonationlevel, duplicatetokenhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplicateTokenEx(hexistingtoken: Handle, dwdesiredaccess: TokenAccessMask, lptokenattributes: ConstPtr, impersonationlevel: SecurityImpersonationLevel, tokentype: TokenType, phnewtoken: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityDuplicateTokenEx(hexistingtoken.rawAddress.toString(), dwdesiredaccess.toInt(), lptokenattributes.rawAddress.toString(), impersonationlevel, tokentype, phnewtoken.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun equalDomainSid(psid1: Psid, psid2: Psid, pfequal: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityEqualDomainSid(psid1.rawAddress.toString(), psid2.rawAddress.toString(), pfequal.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun equalPrefixSid(psid1: Psid, psid2: Psid): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityEqualPrefixSid(psid1.rawAddress.toString(), psid2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun equalSid(psid1: Psid, psid2: Psid): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityEqualSid(psid1.rawAddress.toString(), psid2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstFreeAce(pacl: ConstPtr, pace: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityFindFirstFreeAce(pacl.rawAddress.toString(), pace.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeSid(psid: Psid): MutPtr =
    if (windowsWin32SecurityNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityFreeSid(psid.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAce(pacl: ConstPtr, dwaceindex: UInt, pace: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityGetAce(pacl.rawAddress.toString(), dwaceindex.toInt(), pace.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAclInformation(pacl: ConstPtr, paclinformation: MutPtr, naclinformationlength: UInt, dwaclinformationclass: AclInformationClass): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityGetAclInformation(pacl.rawAddress.toString(), paclinformation.rawAddress.toString(), naclinformationlength.toInt(), dwaclinformationclass) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAppContainerAce(acl: ConstPtr, startingaceindex: UInt, appcontainerace: MutPtr, appcontaineraceindex: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityGetAppContainerAce(acl.rawAddress.toString(), startingaceindex.toInt(), appcontainerace.rawAddress.toString(), appcontaineraceindex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCachedSigningLevel(file: Handle, flags: MutPtr, signinglevel: MutPtr, thumbprint: MutPtr, thumbprintsize: MutPtr, thumbprintalgorithm: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityGetCachedSigningLevel(file.rawAddress.toString(), flags.rawAddress.toString(), signinglevel.rawAddress.toString(), thumbprint.rawAddress.toString(), thumbprintsize.rawAddress.toString(), thumbprintalgorithm.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileSecurityA(lpfilename: Pcstr, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityGetFileSecurityA(lpfilename.rawAddress.toString(), requestedinformation.toInt(), psecuritydescriptor.rawAddress.toString(), nlength.toInt(), lpnlengthneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileSecurityW(lpfilename: Pcwstr, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityGetFileSecurityW(lpfilename.rawAddress.toString(), requestedinformation.toInt(), psecuritydescriptor.rawAddress.toString(), nlength.toInt(), lpnlengthneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKernelObjectSecurity(handle: Handle, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityGetKernelObjectSecurity(handle.rawAddress.toString(), requestedinformation.toInt(), psecuritydescriptor.rawAddress.toString(), nlength.toInt(), lpnlengthneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLengthSid(psid: Psid): UInt =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityGetLengthSid(psid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPrivateObjectSecurity(objectdescriptor: PsecurityDescriptor, securityinformation: ObjectSecurityInformation, resultantdescriptor: PsecurityDescriptor, descriptorlength: UInt, returnlength: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityGetPrivateObjectSecurity(objectdescriptor.rawAddress.toString(), securityinformation.toInt(), resultantdescriptor.rawAddress.toString(), descriptorlength.toInt(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSecurityDescriptorControl(psecuritydescriptor: PsecurityDescriptor, pcontrol: MutPtr, lpdwrevision: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityGetSecurityDescriptorControl(psecuritydescriptor.rawAddress.toString(), pcontrol.rawAddress.toString(), lpdwrevision.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSecurityDescriptorDacl(psecuritydescriptor: PsecurityDescriptor, lpbdaclpresent: MutPtr, pdacl: MutPtr, lpbdacldefaulted: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityGetSecurityDescriptorDacl(psecuritydescriptor.rawAddress.toString(), lpbdaclpresent.rawAddress.toString(), pdacl.rawAddress.toString(), lpbdacldefaulted.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSecurityDescriptorGroup(psecuritydescriptor: PsecurityDescriptor, pgroup: MutPtr, lpbgroupdefaulted: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityGetSecurityDescriptorGroup(psecuritydescriptor.rawAddress.toString(), pgroup.rawAddress.toString(), lpbgroupdefaulted.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSecurityDescriptorLength(psecuritydescriptor: PsecurityDescriptor): UInt =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityGetSecurityDescriptorLength(psecuritydescriptor.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSecurityDescriptorOwner(psecuritydescriptor: PsecurityDescriptor, powner: MutPtr, lpbownerdefaulted: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityGetSecurityDescriptorOwner(psecuritydescriptor.rawAddress.toString(), powner.rawAddress.toString(), lpbownerdefaulted.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSecurityDescriptorRMControl(securitydescriptor: PsecurityDescriptor, rmcontrol: MutPtr): UInt =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityGetSecurityDescriptorRMControl(securitydescriptor.rawAddress.toString(), rmcontrol.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSecurityDescriptorSacl(psecuritydescriptor: PsecurityDescriptor, lpbsaclpresent: MutPtr, psacl: MutPtr, lpbsacldefaulted: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityGetSecurityDescriptorSacl(psecuritydescriptor.rawAddress.toString(), lpbsaclpresent.rawAddress.toString(), psacl.rawAddress.toString(), lpbsacldefaulted.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSidIdentifierAuthority(psid: Psid): MutPtr =
    if (windowsWin32SecurityNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityGetSidIdentifierAuthority(psid.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSidLengthRequired(nsubauthoritycount: UByte): UInt =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityGetSidLengthRequired(nsubauthoritycount.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSidSubAuthority(psid: Psid, nsubauthority: UInt): MutPtr =
    if (windowsWin32SecurityNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityGetSidSubAuthority(psid.rawAddress.toString(), nsubauthority.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSidSubAuthorityCount(psid: Psid): MutPtr =
    if (windowsWin32SecurityNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityGetSidSubAuthorityCount(psid.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTokenInformation(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: MutPtr, tokeninformationlength: UInt, returnlength: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityGetTokenInformation(tokenhandle.rawAddress.toString(), tokeninformationclass, tokeninformation.rawAddress.toString(), tokeninformationlength.toInt(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserObjectSecurity(hobj: Handle, psirequested: ConstPtr, psid: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityGetUserObjectSecurity(hobj.rawAddress.toString(), psirequested.rawAddress.toString(), psid.rawAddress.toString(), nlength.toInt(), lpnlengthneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowsAccountDomainSid(psid: Psid, pdomainsid: Psid, cbdomainsid: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityGetWindowsAccountDomainSid(psid.rawAddress.toString(), pdomainsid.rawAddress.toString(), cbdomainsid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun impersonateAnonymousToken(threadhandle: Handle): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityImpersonateAnonymousToken(threadhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun impersonateLoggedOnUser(htoken: Handle): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityImpersonateLoggedOnUser(htoken.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun impersonateSelf(impersonationlevel: SecurityImpersonationLevel): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityImpersonateSelf(impersonationlevel) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeAcl(pacl: MutPtr, nacllength: UInt, dwaclrevision: AceRevision): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityInitializeAcl(pacl.rawAddress.toString(), nacllength.toInt(), dwaclrevision.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeSecurityDescriptor(psecuritydescriptor: PsecurityDescriptor, dwrevision: UInt): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityInitializeSecurityDescriptor(psecuritydescriptor.rawAddress.toString(), dwrevision.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeSid(sid: Psid, pidentifierauthority: ConstPtr, nsubauthoritycount: UByte): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityInitializeSid(sid.rawAddress.toString(), pidentifierauthority.rawAddress.toString(), nsubauthoritycount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isTokenRestricted(tokenhandle: Handle): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityIsTokenRestricted(tokenhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isValidAcl(pacl: ConstPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityIsValidAcl(pacl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isValidSecurityDescriptor(psecuritydescriptor: PsecurityDescriptor): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityIsValidSecurityDescriptor(psecuritydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isValidSid(psid: Psid): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityIsValidSid(psid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isWellKnownSid(psid: Psid, wellknownsidtype: WellKnownSidType): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityIsWellKnownSid(psid.rawAddress.toString(), wellknownsidtype) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun logonUserA(lpszusername: Pcstr, lpszdomain: Pcstr, lpszpassword: Pcstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityLogonUserA(lpszusername.rawAddress.toString(), lpszdomain.rawAddress.toString(), lpszpassword.rawAddress.toString(), dwlogontype.toInt(), dwlogonprovider.toInt(), phtoken.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun logonUserExA(lpszusername: Pcstr, lpszdomain: Pcstr, lpszpassword: Pcstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: MutPtr, pplogonsid: MutPtr, ppprofilebuffer: MutPtr, pdwprofilelength: MutPtr, pquotalimits: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityLogonUserExA(lpszusername.rawAddress.toString(), lpszdomain.rawAddress.toString(), lpszpassword.rawAddress.toString(), dwlogontype.toInt(), dwlogonprovider.toInt(), phtoken.rawAddress.toString(), pplogonsid.rawAddress.toString(), ppprofilebuffer.rawAddress.toString(), pdwprofilelength.rawAddress.toString(), pquotalimits.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun logonUserExW(lpszusername: Pcwstr, lpszdomain: Pcwstr, lpszpassword: Pcwstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: MutPtr, pplogonsid: MutPtr, ppprofilebuffer: MutPtr, pdwprofilelength: MutPtr, pquotalimits: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityLogonUserExW(lpszusername.rawAddress.toString(), lpszdomain.rawAddress.toString(), lpszpassword.rawAddress.toString(), dwlogontype.toInt(), dwlogonprovider.toInt(), phtoken.rawAddress.toString(), pplogonsid.rawAddress.toString(), ppprofilebuffer.rawAddress.toString(), pdwprofilelength.rawAddress.toString(), pquotalimits.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun logonUserW(lpszusername: Pcwstr, lpszdomain: Pcwstr, lpszpassword: Pcwstr, dwlogontype: Logon32Logon, dwlogonprovider: Logon32Provider, phtoken: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityLogonUserW(lpszusername.rawAddress.toString(), lpszdomain.rawAddress.toString(), lpszpassword.rawAddress.toString(), dwlogontype.toInt(), dwlogonprovider.toInt(), phtoken.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupAccountNameA(lpsystemname: Pcstr, lpaccountname: Pcstr, sid: Psid, cbsid: MutPtr, referenceddomainname: Pstr, cchreferenceddomainname: MutPtr, peuse: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityLookupAccountNameA(lpsystemname.rawAddress.toString(), lpaccountname.rawAddress.toString(), sid.rawAddress.toString(), cbsid.rawAddress.toString(), referenceddomainname.rawAddress.toString(), cchreferenceddomainname.rawAddress.toString(), peuse.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupAccountNameW(lpsystemname: Pcwstr, lpaccountname: Pcwstr, sid: Psid, cbsid: MutPtr, referenceddomainname: Pwstr, cchreferenceddomainname: MutPtr, peuse: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityLookupAccountNameW(lpsystemname.rawAddress.toString(), lpaccountname.rawAddress.toString(), sid.rawAddress.toString(), cbsid.rawAddress.toString(), referenceddomainname.rawAddress.toString(), cchreferenceddomainname.rawAddress.toString(), peuse.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupAccountSidA(lpsystemname: Pcstr, sid: Psid, name: Pstr, cchname: MutPtr, referenceddomainname: Pstr, cchreferenceddomainname: MutPtr, peuse: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityLookupAccountSidA(lpsystemname.rawAddress.toString(), sid.rawAddress.toString(), name.rawAddress.toString(), cchname.rawAddress.toString(), referenceddomainname.rawAddress.toString(), cchreferenceddomainname.rawAddress.toString(), peuse.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupAccountSidW(lpsystemname: Pcwstr, sid: Psid, name: Pwstr, cchname: MutPtr, referenceddomainname: Pwstr, cchreferenceddomainname: MutPtr, peuse: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityLookupAccountSidW(lpsystemname.rawAddress.toString(), sid.rawAddress.toString(), name.rawAddress.toString(), cchname.rawAddress.toString(), referenceddomainname.rawAddress.toString(), cchreferenceddomainname.rawAddress.toString(), peuse.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupPrivilegeDisplayNameA(lpsystemname: Pcstr, lpname: Pcstr, lpdisplayname: Pstr, cchdisplayname: MutPtr, lplanguageid: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityLookupPrivilegeDisplayNameA(lpsystemname.rawAddress.toString(), lpname.rawAddress.toString(), lpdisplayname.rawAddress.toString(), cchdisplayname.rawAddress.toString(), lplanguageid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupPrivilegeDisplayNameW(lpsystemname: Pcwstr, lpname: Pcwstr, lpdisplayname: Pwstr, cchdisplayname: MutPtr, lplanguageid: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityLookupPrivilegeDisplayNameW(lpsystemname.rawAddress.toString(), lpname.rawAddress.toString(), lpdisplayname.rawAddress.toString(), cchdisplayname.rawAddress.toString(), lplanguageid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupPrivilegeNameA(lpsystemname: Pcstr, lpluid: ConstPtr, lpname: Pstr, cchname: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityLookupPrivilegeNameA(lpsystemname.rawAddress.toString(), lpluid.rawAddress.toString(), lpname.rawAddress.toString(), cchname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupPrivilegeNameW(lpsystemname: Pcwstr, lpluid: ConstPtr, lpname: Pwstr, cchname: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityLookupPrivilegeNameW(lpsystemname.rawAddress.toString(), lpluid.rawAddress.toString(), lpname.rawAddress.toString(), cchname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupPrivilegeValueA(lpsystemname: Pcstr, lpname: Pcstr, lpluid: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityLookupPrivilegeValueA(lpsystemname.rawAddress.toString(), lpname.rawAddress.toString(), lpluid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupPrivilegeValueW(lpsystemname: Pcwstr, lpname: Pcwstr, lpluid: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityLookupPrivilegeValueW(lpsystemname.rawAddress.toString(), lpname.rawAddress.toString(), lpluid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun makeAbsoluteSD(pselfrelativesecuritydescriptor: PsecurityDescriptor, pabsolutesecuritydescriptor: PsecurityDescriptor, lpdwabsolutesecuritydescriptorsize: MutPtr, pdacl: MutPtr, lpdwdaclsize: MutPtr, psacl: MutPtr, lpdwsaclsize: MutPtr, powner: Psid, lpdwownersize: MutPtr, pprimarygroup: Psid, lpdwprimarygroupsize: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityMakeAbsoluteSD(pselfrelativesecuritydescriptor.rawAddress.toString(), pabsolutesecuritydescriptor.rawAddress.toString(), lpdwabsolutesecuritydescriptorsize.rawAddress.toString(), pdacl.rawAddress.toString(), lpdwdaclsize.rawAddress.toString(), psacl.rawAddress.toString(), lpdwsaclsize.rawAddress.toString(), powner.rawAddress.toString(), lpdwownersize.rawAddress.toString(), pprimarygroup.rawAddress.toString(), lpdwprimarygroupsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun makeSelfRelativeSD(pabsolutesecuritydescriptor: PsecurityDescriptor, pselfrelativesecuritydescriptor: PsecurityDescriptor, lpdwbufferlength: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityMakeSelfRelativeSD(pabsolutesecuritydescriptor.rawAddress.toString(), pselfrelativesecuritydescriptor.rawAddress.toString(), lpdwbufferlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapGenericMask(accessmask: MutPtr, genericmapping: ConstPtr) {
    if (windowsWin32SecurityNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityMapGenericMask(accessmask.rawAddress.toString(), genericmapping.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun objectCloseAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr, generateonclose: Bool): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityObjectCloseAuditAlarmA(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), generateonclose) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun objectCloseAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr, generateonclose: Bool): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityObjectCloseAuditAlarmW(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), generateonclose) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun objectDeleteAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr, generateonclose: Bool): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityObjectDeleteAuditAlarmA(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), generateonclose) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun objectDeleteAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr, generateonclose: Bool): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityObjectDeleteAuditAlarmW(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), generateonclose) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun objectOpenAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr, objecttypename: Pcstr, objectname: Pcstr, psecuritydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: ConstPtr, objectcreation: Bool, accessgranted: Bool, generateonclose: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityObjectOpenAuditAlarmA(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), psecuritydescriptor.rawAddress.toString(), clienttoken.rawAddress.toString(), desiredaccess.toInt(), grantedaccess.toInt(), privileges.rawAddress.toString(), objectcreation, accessgranted, generateonclose.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun objectOpenAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr, objecttypename: Pcwstr, objectname: Pcwstr, psecuritydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: ConstPtr, objectcreation: Bool, accessgranted: Bool, generateonclose: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityObjectOpenAuditAlarmW(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), objecttypename.rawAddress.toString(), objectname.rawAddress.toString(), psecuritydescriptor.rawAddress.toString(), clienttoken.rawAddress.toString(), desiredaccess.toInt(), grantedaccess.toInt(), privileges.rawAddress.toString(), objectcreation, accessgranted, generateonclose.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun objectPrivilegeAuditAlarmA(subsystemname: Pcstr, handleid: ConstPtr, clienttoken: Handle, desiredaccess: UInt, privileges: ConstPtr, accessgranted: Bool): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityObjectPrivilegeAuditAlarmA(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), clienttoken.rawAddress.toString(), desiredaccess.toInt(), privileges.rawAddress.toString(), accessgranted) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun objectPrivilegeAuditAlarmW(subsystemname: Pcwstr, handleid: ConstPtr, clienttoken: Handle, desiredaccess: UInt, privileges: ConstPtr, accessgranted: Bool): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityObjectPrivilegeAuditAlarmW(subsystemname.rawAddress.toString(), handleid.rawAddress.toString(), clienttoken.rawAddress.toString(), desiredaccess.toInt(), privileges.rawAddress.toString(), accessgranted) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun privilegeCheck(clienttoken: Handle, requiredprivileges: MutPtr, pfresult: MutPtr): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityPrivilegeCheck(clienttoken.rawAddress.toString(), requiredprivileges.rawAddress.toString(), pfresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun privilegedServiceAuditAlarmA(subsystemname: Pcstr, servicename: Pcstr, clienttoken: Handle, privileges: ConstPtr, accessgranted: Bool): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityPrivilegedServiceAuditAlarmA(subsystemname.rawAddress.toString(), servicename.rawAddress.toString(), clienttoken.rawAddress.toString(), privileges.rawAddress.toString(), accessgranted) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun privilegedServiceAuditAlarmW(subsystemname: Pcwstr, servicename: Pcwstr, clienttoken: Handle, privileges: ConstPtr, accessgranted: Bool): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityPrivilegedServiceAuditAlarmW(subsystemname.rawAddress.toString(), servicename.rawAddress.toString(), clienttoken.rawAddress.toString(), privileges.rawAddress.toString(), accessgranted) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun querySecurityAccessMask(securityinformation: ObjectSecurityInformation, desiredaccess: MutPtr) {
    if (windowsWin32SecurityNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityQuerySecurityAccessMask(securityinformation.toInt(), desiredaccess.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun revertToSelf(): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityRevertToSelf() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlConvertSidToUnicodeString(unicodestring: MutPtr, sid: Psid, allocatedestinationstring: Boolean): Ntstatus =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityRtlConvertSidToUnicodeString(unicodestring.rawAddress.toString(), sid.rawAddress.toString(), allocatedestinationstring) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlNormalizeSecurityDescriptor(securitydescriptor: MutPtr, securitydescriptorlength: UInt, newsecuritydescriptor: MutPtr, newsecuritydescriptorlength: MutPtr, checkonly: Boolean): Boolean =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecurityRtlNormalizeSecurityDescriptor(securitydescriptor.rawAddress.toString(), securitydescriptorlength.toInt(), newsecuritydescriptor.rawAddress.toString(), newsecuritydescriptorlength.rawAddress.toString(), checkonly) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setAclInformation(pacl: MutPtr, paclinformation: ConstPtr, naclinformationlength: UInt, dwaclinformationclass: AclInformationClass): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecuritySetAclInformation(pacl.rawAddress.toString(), paclinformation.rawAddress.toString(), naclinformationlength.toInt(), dwaclinformationclass) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCachedSigningLevel(sourcefiles: ConstPtr, sourcefilecount: UInt, flags: UInt, targetfile: Handle): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecuritySetCachedSigningLevel(sourcefiles.rawAddress.toString(), sourcefilecount.toInt(), flags.toInt(), targetfile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileSecurityA(lpfilename: Pcstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecuritySetFileSecurityA(lpfilename.rawAddress.toString(), securityinformation.toInt(), psecuritydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileSecurityW(lpfilename: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecuritySetFileSecurityW(lpfilename.rawAddress.toString(), securityinformation.toInt(), psecuritydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setKernelObjectSecurity(handle: Handle, securityinformation: ObjectSecurityInformation, securitydescriptor: PsecurityDescriptor): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecuritySetKernelObjectSecurity(handle.rawAddress.toString(), securityinformation.toInt(), securitydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPrivateObjectSecurity(securityinformation: ObjectSecurityInformation, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: MutPtr, genericmapping: ConstPtr, token: Handle): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecuritySetPrivateObjectSecurity(securityinformation.toInt(), modificationdescriptor.rawAddress.toString(), objectssecuritydescriptor.rawAddress.toString(), genericmapping.rawAddress.toString(), token.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPrivateObjectSecurityEx(securityinformation: ObjectSecurityInformation, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: MutPtr, autoinheritflags: SecurityAutoInheritFlags, genericmapping: ConstPtr, token: Handle): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecuritySetPrivateObjectSecurityEx(securityinformation.toInt(), modificationdescriptor.rawAddress.toString(), objectssecuritydescriptor.rawAddress.toString(), autoinheritflags.toInt(), genericmapping.rawAddress.toString(), token.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSecurityAccessMask(securityinformation: ObjectSecurityInformation, desiredaccess: MutPtr) {
    if (windowsWin32SecurityNapiAvailable) {
        wasmWindowssysWindowsWin32SecuritySetSecurityAccessMask(securityinformation.toInt(), desiredaccess.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setSecurityDescriptorControl(psecuritydescriptor: PsecurityDescriptor, controlbitsofinterest: SecurityDescriptorControl, controlbitstoset: SecurityDescriptorControl): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecuritySetSecurityDescriptorControl(psecuritydescriptor.rawAddress.toString(), controlbitsofinterest.toInt(), controlbitstoset.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSecurityDescriptorDacl(psecuritydescriptor: PsecurityDescriptor, bdaclpresent: Bool, pdacl: ConstPtr, bdacldefaulted: Bool): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecuritySetSecurityDescriptorDacl(psecuritydescriptor.rawAddress.toString(), bdaclpresent, pdacl.rawAddress.toString(), bdacldefaulted) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSecurityDescriptorGroup(psecuritydescriptor: PsecurityDescriptor, pgroup: Psid, bgroupdefaulted: Bool): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecuritySetSecurityDescriptorGroup(psecuritydescriptor.rawAddress.toString(), pgroup.rawAddress.toString(), bgroupdefaulted) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSecurityDescriptorOwner(psecuritydescriptor: PsecurityDescriptor, powner: Psid, bownerdefaulted: Bool): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecuritySetSecurityDescriptorOwner(psecuritydescriptor.rawAddress.toString(), powner.rawAddress.toString(), bownerdefaulted) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSecurityDescriptorRMControl(securitydescriptor: PsecurityDescriptor, rmcontrol: ConstPtr): UInt =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecuritySetSecurityDescriptorRMControl(securitydescriptor.rawAddress.toString(), rmcontrol.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSecurityDescriptorSacl(psecuritydescriptor: PsecurityDescriptor, bsaclpresent: Bool, psacl: ConstPtr, bsacldefaulted: Bool): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecuritySetSecurityDescriptorSacl(psecuritydescriptor.rawAddress.toString(), bsaclpresent, psacl.rawAddress.toString(), bsacldefaulted) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTokenInformation(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: ConstPtr, tokeninformationlength: UInt): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecuritySetTokenInformation(tokenhandle.rawAddress.toString(), tokeninformationclass, tokeninformation.rawAddress.toString(), tokeninformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUserObjectSecurity(hobj: Handle, psirequested: ConstPtr, psid: PsecurityDescriptor): Bool =
    if (windowsWin32SecurityNapiAvailable) wasmWindowssysWindowsWin32SecuritySetUserObjectSecurity(hobj.rawAddress.toString(), psirequested.rawAddress.toString(), psid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
