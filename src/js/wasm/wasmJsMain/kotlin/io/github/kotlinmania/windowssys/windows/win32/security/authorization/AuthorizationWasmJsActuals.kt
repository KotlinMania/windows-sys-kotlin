@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.security.authorization

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.AceFlags
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.system.threading.LpthreadStartRoutine

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SecurityAuthorizationNapiAddon(): Boolean

private val windowsWin32SecurityAuthorizationNapiAvailable: Boolean = initWindowsWin32SecurityAuthorizationNapiAddon()

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationAuthzAccessCheck(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationAuthzAccessCheck(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationAuthzAddSidsToContext(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationAuthzAddSidsToContext(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationAuthzCachedAccessCheck(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationAuthzCachedAccessCheck(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationAuthzEnumerateSecurityEventSources(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationAuthzEnumerateSecurityEventSources(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationAuthzEvaluateSacl(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationAuthzEvaluateSacl(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationAuthzFreeAuditEvent(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationAuthzFreeAuditEvent(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationAuthzFreeCentralAccessPolicyCache()")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationAuthzFreeCentralAccessPolicyCache(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationAuthzFreeContext(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationAuthzFreeContext(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationAuthzFreeHandle(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationAuthzFreeHandle(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationAuthzFreeResourceManager(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationAuthzFreeResourceManager(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationAuthzGetInformationFromContext(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationAuthzGetInformationFromContext(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationAuthzInitializeCompoundContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationAuthzInitializeCompoundContext(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationAuthzInitializeObjectAccessAuditEvent(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationAuthzInitializeObjectAccessAuditEvent(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: Int, p9: String, p10: String, p11: String, p12: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationAuthzInitializeObjectAccessAuditEvent2(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationAuthzInitializeObjectAccessAuditEvent2(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: Int, p9: Int, p10: String, p11: String, p12: String, p13: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationAuthzInitializeRemoteResourceManager(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationAuthzInitializeRemoteResourceManager(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationAuthzInitializeResourceManager(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationAuthzInitializeResourceManager(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationAuthzInitializeResourceManagerEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationAuthzInitializeResourceManagerEx(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationAuthzInstallSecurityEventSource(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationAuthzInstallSecurityEventSource(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationAuthzModifyClaims(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationAuthzModifyClaims(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationAuthzModifySecurityAttributes(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationAuthzModifySecurityAttributes(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationAuthzModifySids(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationAuthzModifySids(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationAuthzOpenObjectAudit(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationAuthzOpenObjectAudit(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationAuthzRegisterCapChangeNotification(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationAuthzRegisterCapChangeNotification(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationAuthzRegisterSecurityEventSource(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationAuthzRegisterSecurityEventSource(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationAuthzReportSecurityEvent(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationAuthzReportSecurityEvent(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationAuthzReportSecurityEventFromParams(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationAuthzReportSecurityEventFromParams(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationAuthzSetAppContainerInformation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationAuthzSetAppContainerInformation(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationAuthzUninstallSecurityEventSource(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationAuthzUninstallSecurityEventSource(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationAuthzUnregisterCapChangeNotification(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationAuthzUnregisterCapChangeNotification(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationAuthzUnregisterSecurityEventSource(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationAuthzUnregisterSecurityEventSource(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationBuildExplicitAccessWithNameA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationBuildExplicitAccessWithNameA(p0: String, p1: String, p2: Int, p3: Int, p4: Int)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationBuildExplicitAccessWithNameW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationBuildExplicitAccessWithNameW(p0: String, p1: String, p2: Int, p3: Int, p4: Int)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationBuildImpersonateExplicitAccessWithNameA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationBuildImpersonateExplicitAccessWithNameA(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationBuildImpersonateExplicitAccessWithNameW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationBuildImpersonateExplicitAccessWithNameW(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationBuildImpersonateTrusteeA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationBuildImpersonateTrusteeA(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationBuildImpersonateTrusteeW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationBuildImpersonateTrusteeW(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationBuildSecurityDescriptorA(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationBuildSecurityDescriptorA(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationBuildSecurityDescriptorW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationBuildSecurityDescriptorW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithNameA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithNameA(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithNameW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithNameW(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndNameA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndNameA(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndNameW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndNameW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndSidA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndSidA(p0: String, p1: String, p2: String, p3: String, p4: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndSidW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndSidW(p0: String, p1: String, p2: String, p3: String, p4: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithSidA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithSidA(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithSidW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithSidW(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationConvertSecurityDescriptorToStringSecurityDescriptorA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationConvertSecurityDescriptorToStringSecurityDescriptorA(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationConvertSecurityDescriptorToStringSecurityDescriptorW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationConvertSecurityDescriptorToStringSecurityDescriptorW(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationConvertSidToStringSidA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationConvertSidToStringSidA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationConvertSidToStringSidW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationConvertSidToStringSidW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationConvertStringSecurityDescriptorToSecurityDescriptorA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationConvertStringSecurityDescriptorToSecurityDescriptorA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationConvertStringSecurityDescriptorToSecurityDescriptorW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationConvertStringSecurityDescriptorToSecurityDescriptorW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationConvertStringSidToSidA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationConvertStringSidToSidA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationConvertStringSidToSidW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationConvertStringSidToSidW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationFreeInheritedFromArray(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationFreeInheritedFromArray(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationGetAuditedPermissionsFromAclA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationGetAuditedPermissionsFromAclA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationGetAuditedPermissionsFromAclW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationGetAuditedPermissionsFromAclW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationGetEffectiveRightsFromAclA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationGetEffectiveRightsFromAclA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationGetEffectiveRightsFromAclW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationGetEffectiveRightsFromAclW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationGetExplicitEntriesFromAclA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationGetExplicitEntriesFromAclA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationGetExplicitEntriesFromAclW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationGetExplicitEntriesFromAclW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationGetInheritanceSourceA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationGetInheritanceSourceA(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationGetInheritanceSourceW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationGetInheritanceSourceW(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeA(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeA(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeOperationA(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeOperationA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeOperationW(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeOperationW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeW(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeW(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationGetNamedSecurityInfoA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationGetNamedSecurityInfoA(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationGetNamedSecurityInfoW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationGetNamedSecurityInfoW(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationGetSecurityInfo(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationGetSecurityInfo(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationGetTrusteeFormA(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationGetTrusteeFormA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationGetTrusteeFormW(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationGetTrusteeFormW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationGetTrusteeNameA(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationGetTrusteeNameA(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationGetTrusteeNameW(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationGetTrusteeNameW(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationGetTrusteeTypeA(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationGetTrusteeTypeA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationGetTrusteeTypeW(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationGetTrusteeTypeW(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationLookupSecurityDescriptorPartsA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationLookupSecurityDescriptorPartsA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationLookupSecurityDescriptorPartsW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationLookupSecurityDescriptorPartsW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationSetEntriesInAclA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationSetEntriesInAclA(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationSetEntriesInAclW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationSetEntriesInAclW(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationSetNamedSecurityInfoA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationSetNamedSecurityInfoA(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationSetNamedSecurityInfoW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationSetNamedSecurityInfoW(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationSetSecurityInfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationSetSecurityInfo(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationTreeResetNamedSecurityInfoA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationTreeResetNamedSecurityInfoA(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: String, p9: Int, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationTreeResetNamedSecurityInfoW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationTreeResetNamedSecurityInfoW(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: String, p9: Int, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationTreeSetNamedSecurityInfoA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationTreeSetNamedSecurityInfoA(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: String, p9: Int, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthorizationTreeSetNamedSecurityInfoW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32SecurityAuthorizationTreeSetNamedSecurityInfoW(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: String, p9: Int, p10: String): Int

public actual fun authzAccessCheck(flags: AuthzAccessCheckFlags, hauthzclientcontext: AuthzClientContextHandle, prequest: ConstPtr, hauditevent: AuthzAuditEventHandle, psecuritydescriptor: PsecurityDescriptor, optionalsecuritydescriptorarray: ConstPtr, optionalsecuritydescriptorcount: UInt, preply: MutPtr, phaccesscheckresults: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationAuthzAccessCheck(flags.toInt(), hauthzclientcontext.rawAddress.toString(), prequest.rawAddress.toString(), hauditevent.rawAddress.toString(), psecuritydescriptor.rawAddress.toString(), optionalsecuritydescriptorarray.rawAddress.toString(), optionalsecuritydescriptorcount.toInt(), preply.rawAddress.toString(), phaccesscheckresults.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzAddSidsToContext(hauthzclientcontext: AuthzClientContextHandle, sids: ConstPtr, sidcount: UInt, restrictedsids: ConstPtr, restrictedsidcount: UInt, phnewauthzclientcontext: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationAuthzAddSidsToContext(hauthzclientcontext.rawAddress.toString(), sids.rawAddress.toString(), sidcount.toInt(), restrictedsids.rawAddress.toString(), restrictedsidcount.toInt(), phnewauthzclientcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzCachedAccessCheck(flags: UInt, haccesscheckresults: AuthzAccessCheckResultsHandle, prequest: ConstPtr, hauditevent: AuthzAuditEventHandle, preply: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationAuthzCachedAccessCheck(flags.toInt(), haccesscheckresults.rawAddress.toString(), prequest.rawAddress.toString(), hauditevent.rawAddress.toString(), preply.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzEnumerateSecurityEventSources(dwflags: UInt, buffer: MutPtr, pdwcount: MutPtr, pdwlength: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationAuthzEnumerateSecurityEventSources(dwflags.toInt(), buffer.rawAddress.toString(), pdwcount.rawAddress.toString(), pdwlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzEvaluateSacl(authzclientcontext: AuthzClientContextHandle, prequest: ConstPtr, sacl: ConstPtr, grantedaccess: UInt, accessgranted: Bool, pbgenerateaudit: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationAuthzEvaluateSacl(authzclientcontext.rawAddress.toString(), prequest.rawAddress.toString(), sacl.rawAddress.toString(), grantedaccess.toInt(), accessgranted, pbgenerateaudit.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzFreeAuditEvent(hauditevent: AuthzAuditEventHandle): Bool =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationAuthzFreeAuditEvent(hauditevent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzFreeCentralAccessPolicyCache(): Bool =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationAuthzFreeCentralAccessPolicyCache() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzFreeContext(hauthzclientcontext: AuthzClientContextHandle): Bool =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationAuthzFreeContext(hauthzclientcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzFreeHandle(haccesscheckresults: AuthzAccessCheckResultsHandle): Bool =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationAuthzFreeHandle(haccesscheckresults.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzFreeResourceManager(hauthzresourcemanager: AuthzResourceManagerHandle): Bool =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationAuthzFreeResourceManager(hauthzresourcemanager.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzGetInformationFromContext(hauthzclientcontext: AuthzClientContextHandle, infoclass: AuthzContextInformationClass, buffersize: UInt, psizerequired: MutPtr, buffer: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationAuthzGetInformationFromContext(hauthzclientcontext.rawAddress.toString(), infoclass, buffersize.toInt(), psizerequired.rawAddress.toString(), buffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzInitializeCompoundContext(usercontext: AuthzClientContextHandle, devicecontext: AuthzClientContextHandle, phcompoundcontext: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationAuthzInitializeCompoundContext(usercontext.rawAddress.toString(), devicecontext.rawAddress.toString(), phcompoundcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzInitializeContextFromAuthzContext(flags: UInt, hauthzclientcontext: AuthzClientContextHandle, pexpirationtime: ConstPtr, identifier: Luid, dynamicgroupargs: ConstPtr, phnewauthzclientcontext: MutPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzInitializeContextFromSid(flags: UInt, usersid: Psid, hauthzresourcemanager: AuthzResourceManagerHandle, pexpirationtime: ConstPtr, identifier: Luid, dynamicgroupargs: ConstPtr, phauthzclientcontext: MutPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzInitializeContextFromToken(flags: UInt, tokenhandle: Handle, hauthzresourcemanager: AuthzResourceManagerHandle, pexpirationtime: ConstPtr, identifier: Luid, dynamicgroupargs: ConstPtr, phauthzclientcontext: MutPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzInitializeObjectAccessAuditEvent(flags: AuthzInitializeObjectAccessAuditEventFlags, hauditeventtype: AuthzAuditEventTypeHandle, szoperationtype: Pcwstr, szobjecttype: Pcwstr, szobjectname: Pcwstr, szadditionalinfo: Pcwstr, phauditevent: MutPtr, dwadditionalparametercount: UInt, vararg variadicArgs: Long): Bool =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationAuthzInitializeObjectAccessAuditEvent(flags.toInt(), hauditeventtype.rawAddress.toString(), szoperationtype.rawAddress.toString(), szobjecttype.rawAddress.toString(), szobjectname.rawAddress.toString(), szadditionalinfo.rawAddress.toString(), phauditevent.rawAddress.toString(), dwadditionalparametercount.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzInitializeObjectAccessAuditEvent2(flags: UInt, hauditeventtype: AuthzAuditEventTypeHandle, szoperationtype: Pcwstr, szobjecttype: Pcwstr, szobjectname: Pcwstr, szadditionalinfo: Pcwstr, szadditionalinfo2: Pcwstr, phauditevent: MutPtr, dwadditionalparametercount: UInt, vararg variadicArgs: Long): Bool =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationAuthzInitializeObjectAccessAuditEvent2(flags.toInt(), hauditeventtype.rawAddress.toString(), szoperationtype.rawAddress.toString(), szobjecttype.rawAddress.toString(), szobjectname.rawAddress.toString(), szadditionalinfo.rawAddress.toString(), szadditionalinfo2.rawAddress.toString(), phauditevent.rawAddress.toString(), dwadditionalparametercount.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzInitializeRemoteResourceManager(prpcinitinfo: ConstPtr, phauthzresourcemanager: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationAuthzInitializeRemoteResourceManager(prpcinitinfo.rawAddress.toString(), phauthzresourcemanager.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzInitializeResourceManager(flags: UInt, pfndynamicaccesscheck: PfnAuthzDynamicAccessCheck, pfncomputedynamicgroups: PfnAuthzComputeDynamicGroups, pfnfreedynamicgroups: PfnAuthzFreeDynamicGroups, szresourcemanagername: Pcwstr, phauthzresourcemanager: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationAuthzInitializeResourceManager(flags.toInt(), 0L.toString(), 0L.toString(), 0L.toString(), szresourcemanagername.rawAddress.toString(), phauthzresourcemanager.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzInitializeResourceManagerEx(flags: AuthzResourceManagerFlags, pauthzinitinfo: ConstPtr, phauthzresourcemanager: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationAuthzInitializeResourceManagerEx(flags.toInt(), pauthzinitinfo.rawAddress.toString(), phauthzresourcemanager.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzInstallSecurityEventSource(dwflags: UInt, pregistration: ConstPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationAuthzInstallSecurityEventSource(dwflags.toInt(), pregistration.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzModifyClaims(hauthzclientcontext: AuthzClientContextHandle, claimclass: AuthzContextInformationClass, pclaimoperations: ConstPtr, pclaims: ConstPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationAuthzModifyClaims(hauthzclientcontext.rawAddress.toString(), claimclass, pclaimoperations.rawAddress.toString(), pclaims.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzModifySecurityAttributes(hauthzclientcontext: AuthzClientContextHandle, poperations: ConstPtr, pattributes: ConstPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationAuthzModifySecurityAttributes(hauthzclientcontext.rawAddress.toString(), poperations.rawAddress.toString(), pattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzModifySids(hauthzclientcontext: AuthzClientContextHandle, sidclass: AuthzContextInformationClass, psidoperations: ConstPtr, psids: ConstPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationAuthzModifySids(hauthzclientcontext.rawAddress.toString(), sidclass, psidoperations.rawAddress.toString(), psids.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzOpenObjectAudit(flags: UInt, hauthzclientcontext: AuthzClientContextHandle, prequest: ConstPtr, hauditevent: AuthzAuditEventHandle, psecuritydescriptor: PsecurityDescriptor, optionalsecuritydescriptorarray: ConstPtr, optionalsecuritydescriptorcount: UInt, preply: ConstPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationAuthzOpenObjectAudit(flags.toInt(), hauthzclientcontext.rawAddress.toString(), prequest.rawAddress.toString(), hauditevent.rawAddress.toString(), psecuritydescriptor.rawAddress.toString(), optionalsecuritydescriptorarray.rawAddress.toString(), optionalsecuritydescriptorcount.toInt(), preply.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzRegisterCapChangeNotification(phcapchangesubscription: MutPtr, pfncapchangecallback: LpthreadStartRoutine, pcallbackcontext: ConstPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationAuthzRegisterCapChangeNotification(phcapchangesubscription.rawAddress.toString(), 0L.toString(), pcallbackcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzRegisterSecurityEventSource(dwflags: UInt, szeventsourcename: Pcwstr, pheventprovider: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationAuthzRegisterSecurityEventSource(dwflags.toInt(), szeventsourcename.rawAddress.toString(), pheventprovider.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzReportSecurityEvent(dwflags: UInt, heventprovider: AuthzSecurityEventProviderHandle, dwauditid: UInt, pusersid: Psid, dwcount: UInt, vararg variadicArgs: Long): Bool =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationAuthzReportSecurityEvent(dwflags.toInt(), heventprovider.rawAddress.toString(), dwauditid.toInt(), pusersid.rawAddress.toString(), dwcount.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzReportSecurityEventFromParams(dwflags: UInt, heventprovider: AuthzSecurityEventProviderHandle, dwauditid: UInt, pusersid: Psid, pparams: ConstPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationAuthzReportSecurityEventFromParams(dwflags.toInt(), heventprovider.rawAddress.toString(), dwauditid.toInt(), pusersid.rawAddress.toString(), pparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzSetAppContainerInformation(hauthzclientcontext: AuthzClientContextHandle, pappcontainersid: Psid, capabilitycount: UInt, pcapabilitysids: ConstPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationAuthzSetAppContainerInformation(hauthzclientcontext.rawAddress.toString(), pappcontainersid.rawAddress.toString(), capabilitycount.toInt(), pcapabilitysids.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzUninstallSecurityEventSource(dwflags: UInt, szeventsourcename: Pcwstr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationAuthzUninstallSecurityEventSource(dwflags.toInt(), szeventsourcename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzUnregisterCapChangeNotification(hcapchangesubscription: AuthzCapChangeSubscriptionHandle): Bool =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationAuthzUnregisterCapChangeNotification(hcapchangesubscription.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun authzUnregisterSecurityEventSource(dwflags: UInt, pheventprovider: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationAuthzUnregisterSecurityEventSource(dwflags.toInt(), pheventprovider.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun buildExplicitAccessWithNameA(pexplicitaccess: MutPtr, ptrusteename: Pcstr, accesspermissions: UInt, accessmode: AccessMode, inheritance: AceFlags) {
    if (windowsWin32SecurityAuthorizationNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityAuthorizationBuildExplicitAccessWithNameA(pexplicitaccess.rawAddress.toString(), ptrusteename.rawAddress.toString(), accesspermissions.toInt(), accessmode, inheritance.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildExplicitAccessWithNameW(pexplicitaccess: MutPtr, ptrusteename: Pcwstr, accesspermissions: UInt, accessmode: AccessMode, inheritance: AceFlags) {
    if (windowsWin32SecurityAuthorizationNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityAuthorizationBuildExplicitAccessWithNameW(pexplicitaccess.rawAddress.toString(), ptrusteename.rawAddress.toString(), accesspermissions.toInt(), accessmode, inheritance.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildImpersonateExplicitAccessWithNameA(pexplicitaccess: MutPtr, ptrusteename: Pcstr, ptrustee: ConstPtr, accesspermissions: UInt, accessmode: AccessMode, inheritance: UInt) {
    if (windowsWin32SecurityAuthorizationNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityAuthorizationBuildImpersonateExplicitAccessWithNameA(pexplicitaccess.rawAddress.toString(), ptrusteename.rawAddress.toString(), ptrustee.rawAddress.toString(), accesspermissions.toInt(), accessmode, inheritance.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildImpersonateExplicitAccessWithNameW(pexplicitaccess: MutPtr, ptrusteename: Pcwstr, ptrustee: ConstPtr, accesspermissions: UInt, accessmode: AccessMode, inheritance: UInt) {
    if (windowsWin32SecurityAuthorizationNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityAuthorizationBuildImpersonateExplicitAccessWithNameW(pexplicitaccess.rawAddress.toString(), ptrusteename.rawAddress.toString(), ptrustee.rawAddress.toString(), accesspermissions.toInt(), accessmode, inheritance.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildImpersonateTrusteeA(ptrustee: MutPtr, pimpersonatetrustee: ConstPtr) {
    if (windowsWin32SecurityAuthorizationNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityAuthorizationBuildImpersonateTrusteeA(ptrustee.rawAddress.toString(), pimpersonatetrustee.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildImpersonateTrusteeW(ptrustee: MutPtr, pimpersonatetrustee: ConstPtr) {
    if (windowsWin32SecurityAuthorizationNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityAuthorizationBuildImpersonateTrusteeW(ptrustee.rawAddress.toString(), pimpersonatetrustee.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildSecurityDescriptorA(powner: ConstPtr, pgroup: ConstPtr, ccountofaccessentries: UInt, plistofaccessentries: ConstPtr, ccountofauditentries: UInt, plistofauditentries: ConstPtr, poldsd: PsecurityDescriptor, psizenewsd: MutPtr, pnewsd: MutPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationBuildSecurityDescriptorA(powner.rawAddress.toString(), pgroup.rawAddress.toString(), ccountofaccessentries.toInt(), plistofaccessentries.rawAddress.toString(), ccountofauditentries.toInt(), plistofauditentries.rawAddress.toString(), poldsd.rawAddress.toString(), psizenewsd.rawAddress.toString(), pnewsd.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun buildSecurityDescriptorW(powner: ConstPtr, pgroup: ConstPtr, ccountofaccessentries: UInt, plistofaccessentries: ConstPtr, ccountofauditentries: UInt, plistofauditentries: ConstPtr, poldsd: PsecurityDescriptor, psizenewsd: MutPtr, pnewsd: MutPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationBuildSecurityDescriptorW(powner.rawAddress.toString(), pgroup.rawAddress.toString(), ccountofaccessentries.toInt(), plistofaccessentries.rawAddress.toString(), ccountofauditentries.toInt(), plistofauditentries.rawAddress.toString(), poldsd.rawAddress.toString(), psizenewsd.rawAddress.toString(), pnewsd.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun buildTrusteeWithNameA(ptrustee: MutPtr, pname: Pcstr) {
    if (windowsWin32SecurityAuthorizationNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithNameA(ptrustee.rawAddress.toString(), pname.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildTrusteeWithNameW(ptrustee: MutPtr, pname: Pcwstr) {
    if (windowsWin32SecurityAuthorizationNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithNameW(ptrustee.rawAddress.toString(), pname.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildTrusteeWithObjectsAndNameA(ptrustee: MutPtr, pobjname: ConstPtr, objecttype: SeObjectType, objecttypename: Pcstr, inheritedobjecttypename: Pcstr, name: Pcstr) {
    if (windowsWin32SecurityAuthorizationNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndNameA(ptrustee.rawAddress.toString(), pobjname.rawAddress.toString(), objecttype, objecttypename.rawAddress.toString(), inheritedobjecttypename.rawAddress.toString(), name.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildTrusteeWithObjectsAndNameW(ptrustee: MutPtr, pobjname: ConstPtr, objecttype: SeObjectType, objecttypename: Pcwstr, inheritedobjecttypename: Pcwstr, name: Pcwstr) {
    if (windowsWin32SecurityAuthorizationNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndNameW(ptrustee.rawAddress.toString(), pobjname.rawAddress.toString(), objecttype, objecttypename.rawAddress.toString(), inheritedobjecttypename.rawAddress.toString(), name.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildTrusteeWithObjectsAndSidA(ptrustee: MutPtr, pobjsid: ConstPtr, pobjectguid: ConstPtr, pinheritedobjectguid: ConstPtr, psid: Psid) {
    if (windowsWin32SecurityAuthorizationNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndSidA(ptrustee.rawAddress.toString(), pobjsid.rawAddress.toString(), pobjectguid.rawAddress.toString(), pinheritedobjectguid.rawAddress.toString(), psid.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildTrusteeWithObjectsAndSidW(ptrustee: MutPtr, pobjsid: ConstPtr, pobjectguid: ConstPtr, pinheritedobjectguid: ConstPtr, psid: Psid) {
    if (windowsWin32SecurityAuthorizationNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndSidW(ptrustee.rawAddress.toString(), pobjsid.rawAddress.toString(), pobjectguid.rawAddress.toString(), pinheritedobjectguid.rawAddress.toString(), psid.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildTrusteeWithSidA(ptrustee: MutPtr, psid: Psid) {
    if (windowsWin32SecurityAuthorizationNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithSidA(ptrustee.rawAddress.toString(), psid.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun buildTrusteeWithSidW(ptrustee: MutPtr, psid: Psid) {
    if (windowsWin32SecurityAuthorizationNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithSidW(ptrustee.rawAddress.toString(), psid.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun convertSecurityDescriptorToStringSecurityDescriptorA(securitydescriptor: PsecurityDescriptor, requestedstringsdrevision: UInt, securityinformation: ObjectSecurityInformation, stringsecuritydescriptor: MutPtr, stringsecuritydescriptorlen: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationConvertSecurityDescriptorToStringSecurityDescriptorA(securitydescriptor.rawAddress.toString(), requestedstringsdrevision.toInt(), securityinformation.toInt(), stringsecuritydescriptor.rawAddress.toString(), stringsecuritydescriptorlen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertSecurityDescriptorToStringSecurityDescriptorW(securitydescriptor: PsecurityDescriptor, requestedstringsdrevision: UInt, securityinformation: ObjectSecurityInformation, stringsecuritydescriptor: MutPtr, stringsecuritydescriptorlen: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationConvertSecurityDescriptorToStringSecurityDescriptorW(securitydescriptor.rawAddress.toString(), requestedstringsdrevision.toInt(), securityinformation.toInt(), stringsecuritydescriptor.rawAddress.toString(), stringsecuritydescriptorlen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertSidToStringSidA(sid: Psid, stringsid: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationConvertSidToStringSidA(sid.rawAddress.toString(), stringsid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertSidToStringSidW(sid: Psid, stringsid: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationConvertSidToStringSidW(sid.rawAddress.toString(), stringsid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertStringSecurityDescriptorToSecurityDescriptorA(stringsecuritydescriptor: Pcstr, stringsdrevision: UInt, securitydescriptor: MutPtr, securitydescriptorsize: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationConvertStringSecurityDescriptorToSecurityDescriptorA(stringsecuritydescriptor.rawAddress.toString(), stringsdrevision.toInt(), securitydescriptor.rawAddress.toString(), securitydescriptorsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertStringSecurityDescriptorToSecurityDescriptorW(stringsecuritydescriptor: Pcwstr, stringsdrevision: UInt, securitydescriptor: MutPtr, securitydescriptorsize: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationConvertStringSecurityDescriptorToSecurityDescriptorW(stringsecuritydescriptor.rawAddress.toString(), stringsdrevision.toInt(), securitydescriptor.rawAddress.toString(), securitydescriptorsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertStringSidToSidA(stringsid: Pcstr, sid: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationConvertStringSidToSidA(stringsid.rawAddress.toString(), sid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertStringSidToSidW(stringsid: Pcwstr, sid: MutPtr): Bool =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationConvertStringSidToSidW(stringsid.rawAddress.toString(), sid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeInheritedFromArray(pinheritarray: ConstPtr, acecnt: UShort, pfnarray: ConstPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationFreeInheritedFromArray(pinheritarray.rawAddress.toString(), acecnt.toInt(), pfnarray.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAuditedPermissionsFromAclA(pacl: ConstPtr, ptrustee: ConstPtr, psuccessfulauditedrights: MutPtr, pfailedauditrights: MutPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationGetAuditedPermissionsFromAclA(pacl.rawAddress.toString(), ptrustee.rawAddress.toString(), psuccessfulauditedrights.rawAddress.toString(), pfailedauditrights.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAuditedPermissionsFromAclW(pacl: ConstPtr, ptrustee: ConstPtr, psuccessfulauditedrights: MutPtr, pfailedauditrights: MutPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationGetAuditedPermissionsFromAclW(pacl.rawAddress.toString(), ptrustee.rawAddress.toString(), psuccessfulauditedrights.rawAddress.toString(), pfailedauditrights.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEffectiveRightsFromAclA(pacl: ConstPtr, ptrustee: ConstPtr, paccessrights: MutPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationGetEffectiveRightsFromAclA(pacl.rawAddress.toString(), ptrustee.rawAddress.toString(), paccessrights.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEffectiveRightsFromAclW(pacl: ConstPtr, ptrustee: ConstPtr, paccessrights: MutPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationGetEffectiveRightsFromAclW(pacl.rawAddress.toString(), ptrustee.rawAddress.toString(), paccessrights.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getExplicitEntriesFromAclA(pacl: ConstPtr, pccountofexplicitentries: MutPtr, plistofexplicitentries: MutPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationGetExplicitEntriesFromAclA(pacl.rawAddress.toString(), pccountofexplicitentries.rawAddress.toString(), plistofexplicitentries.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getExplicitEntriesFromAclW(pacl: ConstPtr, pccountofexplicitentries: MutPtr, plistofexplicitentries: MutPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationGetExplicitEntriesFromAclW(pacl.rawAddress.toString(), pccountofexplicitentries.rawAddress.toString(), plistofexplicitentries.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getInheritanceSourceA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, container: Bool, pobjectclassguids: ConstPtr, guidcount: UInt, pacl: ConstPtr, pfnarray: ConstPtr, pgenericmapping: ConstPtr, pinheritarray: MutPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationGetInheritanceSourceA(pobjectname.rawAddress.toString(), objecttype, securityinfo.toInt(), container, pobjectclassguids.rawAddress.toString(), guidcount.toInt(), pacl.rawAddress.toString(), pfnarray.rawAddress.toString(), pgenericmapping.rawAddress.toString(), pinheritarray.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getInheritanceSourceW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, container: Bool, pobjectclassguids: ConstPtr, guidcount: UInt, pacl: ConstPtr, pfnarray: ConstPtr, pgenericmapping: ConstPtr, pinheritarray: MutPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationGetInheritanceSourceW(pobjectname.rawAddress.toString(), objecttype, securityinfo.toInt(), container, pobjectclassguids.rawAddress.toString(), guidcount.toInt(), pacl.rawAddress.toString(), pfnarray.rawAddress.toString(), pgenericmapping.rawAddress.toString(), pinheritarray.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMultipleTrusteeA(ptrustee: ConstPtr): MutPtr =
    if (windowsWin32SecurityAuthorizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeA(ptrustee.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMultipleTrusteeOperationA(ptrustee: ConstPtr): MultipleTrusteeOperation =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeOperationA(ptrustee.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMultipleTrusteeOperationW(ptrustee: ConstPtr): MultipleTrusteeOperation =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeOperationW(ptrustee.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMultipleTrusteeW(ptrustee: ConstPtr): MutPtr =
    if (windowsWin32SecurityAuthorizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeW(ptrustee.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, ppsidowner: MutPtr, ppsidgroup: MutPtr, ppdacl: MutPtr, ppsacl: MutPtr, ppsecuritydescriptor: MutPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationGetNamedSecurityInfoA(pobjectname.rawAddress.toString(), objecttype, securityinfo.toInt(), ppsidowner.rawAddress.toString(), ppsidgroup.rawAddress.toString(), ppdacl.rawAddress.toString(), ppsacl.rawAddress.toString(), ppsecuritydescriptor.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, ppsidowner: MutPtr, ppsidgroup: MutPtr, ppdacl: MutPtr, ppsacl: MutPtr, ppsecuritydescriptor: MutPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationGetNamedSecurityInfoW(pobjectname.rawAddress.toString(), objecttype, securityinfo.toInt(), ppsidowner.rawAddress.toString(), ppsidgroup.rawAddress.toString(), ppdacl.rawAddress.toString(), ppsacl.rawAddress.toString(), ppsecuritydescriptor.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSecurityInfo(handle: Handle, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, ppsidowner: MutPtr, ppsidgroup: MutPtr, ppdacl: MutPtr, ppsacl: MutPtr, ppsecuritydescriptor: MutPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationGetSecurityInfo(handle.rawAddress.toString(), objecttype, securityinfo.toInt(), ppsidowner.rawAddress.toString(), ppsidgroup.rawAddress.toString(), ppdacl.rawAddress.toString(), ppsacl.rawAddress.toString(), ppsecuritydescriptor.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTrusteeFormA(ptrustee: ConstPtr): TrusteeForm =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationGetTrusteeFormA(ptrustee.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTrusteeFormW(ptrustee: ConstPtr): TrusteeForm =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationGetTrusteeFormW(ptrustee.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTrusteeNameA(ptrustee: ConstPtr): Pstr =
    if (windowsWin32SecurityAuthorizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityAuthorizationGetTrusteeNameA(ptrustee.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTrusteeNameW(ptrustee: ConstPtr): Pwstr =
    if (windowsWin32SecurityAuthorizationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityAuthorizationGetTrusteeNameW(ptrustee.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTrusteeTypeA(ptrustee: ConstPtr): TrusteeType =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationGetTrusteeTypeA(ptrustee.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTrusteeTypeW(ptrustee: ConstPtr): TrusteeType =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationGetTrusteeTypeW(ptrustee.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupSecurityDescriptorPartsA(ppowner: MutPtr, ppgroup: MutPtr, pccountofaccessentries: MutPtr, pplistofaccessentries: MutPtr, pccountofauditentries: MutPtr, pplistofauditentries: MutPtr, psd: PsecurityDescriptor): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationLookupSecurityDescriptorPartsA(ppowner.rawAddress.toString(), ppgroup.rawAddress.toString(), pccountofaccessentries.rawAddress.toString(), pplistofaccessentries.rawAddress.toString(), pccountofauditentries.rawAddress.toString(), pplistofauditentries.rawAddress.toString(), psd.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupSecurityDescriptorPartsW(ppowner: MutPtr, ppgroup: MutPtr, pccountofaccessentries: MutPtr, pplistofaccessentries: MutPtr, pccountofauditentries: MutPtr, pplistofauditentries: MutPtr, psd: PsecurityDescriptor): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationLookupSecurityDescriptorPartsW(ppowner.rawAddress.toString(), ppgroup.rawAddress.toString(), pccountofaccessentries.rawAddress.toString(), pplistofaccessentries.rawAddress.toString(), pccountofauditentries.rawAddress.toString(), pplistofauditentries.rawAddress.toString(), psd.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEntriesInAclA(ccountofexplicitentries: UInt, plistofexplicitentries: ConstPtr, oldacl: ConstPtr, newacl: MutPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationSetEntriesInAclA(ccountofexplicitentries.toInt(), plistofexplicitentries.rawAddress.toString(), oldacl.rawAddress.toString(), newacl.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEntriesInAclW(ccountofexplicitentries: UInt, plistofexplicitentries: ConstPtr, oldacl: ConstPtr, newacl: MutPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationSetEntriesInAclW(ccountofexplicitentries.toInt(), plistofexplicitentries.rawAddress.toString(), oldacl.rawAddress.toString(), newacl.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, psidowner: Psid, psidgroup: Psid, pdacl: ConstPtr, psacl: ConstPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationSetNamedSecurityInfoA(pobjectname.rawAddress.toString(), objecttype, securityinfo.toInt(), psidowner.rawAddress.toString(), psidgroup.rawAddress.toString(), pdacl.rawAddress.toString(), psacl.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, psidowner: Psid, psidgroup: Psid, pdacl: ConstPtr, psacl: ConstPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationSetNamedSecurityInfoW(pobjectname.rawAddress.toString(), objecttype, securityinfo.toInt(), psidowner.rawAddress.toString(), psidgroup.rawAddress.toString(), pdacl.rawAddress.toString(), psacl.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSecurityInfo(handle: Handle, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, psidowner: Psid, psidgroup: Psid, pdacl: ConstPtr, psacl: ConstPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationSetSecurityInfo(handle.rawAddress.toString(), objecttype, securityinfo.toInt(), psidowner.rawAddress.toString(), psidgroup.rawAddress.toString(), pdacl.rawAddress.toString(), psacl.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun treeResetNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: ConstPtr, psacl: ConstPtr, keepexplicit: Bool, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: ConstPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationTreeResetNamedSecurityInfoA(pobjectname.rawAddress.toString(), objecttype, securityinfo.toInt(), powner.rawAddress.toString(), pgroup.rawAddress.toString(), pdacl.rawAddress.toString(), psacl.rawAddress.toString(), keepexplicit, 0L.toString(), progressinvokesetting, args.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun treeResetNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: ConstPtr, psacl: ConstPtr, keepexplicit: Bool, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: ConstPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationTreeResetNamedSecurityInfoW(pobjectname.rawAddress.toString(), objecttype, securityinfo.toInt(), powner.rawAddress.toString(), pgroup.rawAddress.toString(), pdacl.rawAddress.toString(), psacl.rawAddress.toString(), keepexplicit, 0L.toString(), progressinvokesetting, args.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun treeSetNamedSecurityInfoA(pobjectname: Pcstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: ConstPtr, psacl: ConstPtr, dwaction: TreeSecInfo, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: ConstPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationTreeSetNamedSecurityInfoA(pobjectname.rawAddress.toString(), objecttype, securityinfo.toInt(), powner.rawAddress.toString(), pgroup.rawAddress.toString(), pdacl.rawAddress.toString(), psacl.rawAddress.toString(), dwaction.toInt(), 0L.toString(), progressinvokesetting, args.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun treeSetNamedSecurityInfoW(pobjectname: Pcwstr, objecttype: SeObjectType, securityinfo: ObjectSecurityInformation, powner: Psid, pgroup: Psid, pdacl: ConstPtr, psacl: ConstPtr, dwaction: TreeSecInfo, fnprogress: FnProgress, progressinvokesetting: ProgInvokeSetting, args: ConstPtr): Win32Error =
    if (windowsWin32SecurityAuthorizationNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthorizationTreeSetNamedSecurityInfoW(pobjectname.rawAddress.toString(), objecttype, securityinfo.toInt(), powner.rawAddress.toString(), pgroup.rawAddress.toString(), pdacl.rawAddress.toString(), psacl.rawAddress.toString(), dwaction.toInt(), 0L.toString(), progressinvokesetting, args.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
